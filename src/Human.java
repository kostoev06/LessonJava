public class Human {
    int age;
    String name;
    String surname;

    Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void printNameAndSurname() {
        System.out.println(name + surname);
    }

}
