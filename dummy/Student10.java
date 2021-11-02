package project.dummy;

/**
 * Created by Dan on 4/18/2016.
 */
class Student10 {
    int id;
    String name;

    Student10(int id, String name) {
        id = id;
        name = name;
    }

    void display() {
        System.out.println(this.id + " " + this.name);
    }
}
