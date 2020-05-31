public class Main {
    public static void main(String[] args) {
        Person person= new Person();

        person.setAge(13);
        person.setFirstName("");
        person.setLastName("");

        System.out.println(person.getFullName());

        System.out.println("is teeen or not "+ person.isTeen());


    }
}
