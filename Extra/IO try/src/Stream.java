import java.io.*;

public class Stream {
    public static void main(String[] args) {

        try {
            countLetters();
        } catch (FileNotFoundException e) {
            System.out.println("Input file do not exist");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Action finished");
        }
    }
    public static void countLetters() throws  FileNotFoundException, IOException {
        int count = 0;
        int c;
        FileReader in = null;
        BufferedWriter out = null;

        try {
            in = new FileReader("src/input.txt");
            out = new BufferedWriter(new FileWriter("src/output.txt"));
            File file = new File("src/input.txt");

            if (!file.exists()) throw new FileNotFoundException();
            else {
                while ((c = in.read()) != -1) {
                    count++;
                    //char a=(char)c;
                    //System.out.println(a);
                }
                if (count > 10) throw new ExcedeedLetters(count);
                else out.write(String.valueOf(count));
            }
        } catch (ExcedeedLetters e) {
            out.write(e.getMessage());
        }

        out.close();
        in.close();
    }
}

class ExcedeedLetters extends Throwable {
    private int number;
    public ExcedeedLetters(int number) {
        this.number = number;
    }
    public int getLetters() {
        return number;
    }
    public String getMessage() {
        return "Number of letters excedeed by:" + (10 - number);
    }
}






