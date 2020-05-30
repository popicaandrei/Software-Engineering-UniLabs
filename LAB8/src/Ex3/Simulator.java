package Ex3;

import java.util.*;

public class Simulator {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //build station Cluj-Napoca
        Controler c1 = new Controler("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controler c2 = new Controler("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        Controler c3 = new Controler("Iasi");
        Segment s7 = new Segment(7);
        Segment s8 = new Segment(8);
        Segment s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //connect the 2 controllers

        c1.setNeighbourController(c2);
        c1.setNeighbourController(c3);
        c2.setNeighbourController(c1);
        c2.setNeighbourController(c3);
        c3.setNeighbourController(c1);

        //testing

        Train t1 = new Train("Bucuresti", "CJ");
        s1.arriveTrain(t1);

        Train t2 = new Train("Cluj-Napoca", "B");
        s5.arriveTrain(t2);

        Train t3 = new Train("Iasi", "IS");
        s6.arriveTrain(t3);



        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();

        System.out.println("\nStart train control\n");

        //execute 3 times controller steps
        for (int i = 0; i < 3; i++) {
            System.out.println("### Step " + i + " ###");

            c1.controlStep();
            c2.controlStep();
            c3.controlStep();


            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
        }
    }

}

class Controler {

    String stationName;

    ArrayList<Controler> neighbourControllers = new ArrayList<Controler>();

    //storing station train track segments
    ArrayList<Segment> list = new ArrayList<Segment>();

    public Controler(String gara) {
        stationName = gara;
    }

    void setNeighbourController(Controler v) {
        neighbourControllers.add(v);
    }

    void addControlledSegment(Segment s) {
        list.add(s);
    }

    /**
     * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
     *
     * @return
     */
    int getFreeSegmentId() {
        for (Segment s : list) {
            if (s.hasTrain() == false)
                return s.id;
        }
        return -1;
    }

    void controlStep() {
        //check which train must be sent

        for (Segment segment : list) {
            if (segment.hasTrain()) {
                Train t = segment.getTrain();
                for (Controler neighbour : neighbourControllers) {
                    if (t.getDestination().equals(neighbour.stationName)) {
                        //check if there is a free segment
                        int id = neighbour.getFreeSegmentId();
                        if (id == -1) {
                            System.out.println("Trenul +" + t.name + "din gara " + stationName + " nu poate fi trimis catre " + neighbour.stationName + ". Nici un segment disponibil!");
                            return;
                        }
                        //send train
                        System.out.println("Trenul " + t.name + " pleaca din gara " + stationName + " spre gara " + neighbour.stationName);
                        segment.departTRain();
                        neighbour.arriveTrain(t, id);
                    }
                }

            }
        }

    }


    public void arriveTrain(Train t, int idSegment) {
        for (Segment segment : list) {
            //search id segment and add train on it
            if (segment.id == idSegment)
                if (segment.hasTrain() == true) {
                    System.out.println("CRASH! Train " + t.name + " colided with " + segment.getTrain().name + " on segment " + segment.id + " in station " + stationName);
                    return;
                } else {
                    System.out.println("Train " + t.name + " arrived on segment " + segment.id + " in station " + stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        //this should not happen
        System.out.println("Train " + t.name + " cannot be received " + stationName + ". Check controller logic algorithm!");

    }


    public void displayStationState() {
        System.out.println("=== STATION " + stationName + " ===");
        for (Segment s : list) {
            if (s.hasTrain())
                System.out.println("|----------ID=" + s.id + "__Train=" + s.getTrain().name + " to " + s.getTrain().destination + "__----------|");
            else
                System.out.println("|----------ID=" + s.id + "__Train=______ catre ________----------|");
        }
    }
}


class Segment {
    int id;
    Train train;

    Segment(int id) {
        this.id = id;
    }

    boolean hasTrain() {
        return train != null;
    }

    Train departTRain() {
        Train tmp = train;
        this.train = null;
        return tmp;
    }

    void arriveTrain(Train t) {
        train = t;
    }

    Train getTrain() {
        return train;
    }
}

class Train {
    String destination;
    String name;

    public Train(String destinatie, String nume) {
        super();
        this.destination = destinatie;
        this.name = nume;
    }

    String getDestination() {
        return destination;
    }

}