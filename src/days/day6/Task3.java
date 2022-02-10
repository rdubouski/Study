package days.day6;

class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int n;
        String mark = " ";
        n = 2 + (int) (Math.random() * 4);
        switch (n) {
            case 2: mark = "Bab"; break;
            case 3: mark = "No bad"; break;
            case 4: mark = "Good"; break;
            case 5: mark = "Excellent"; break;
        }

        System.out.println("Teacher " + this.name + " evaluate stedent " + student.getName() + " in subject " + this.subject + " on mark " + mark);

    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(String name) {
        this.name = name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Teacher bob = new Teacher("Bob", "Math");
        Student bill = new Student("Bill");
        bob.evaluate(bill);

        Teacher mark = new Teacher("Mark", "Prog");
        Student john = new Student("John");
        mark.evaluate(john);
    }
}
