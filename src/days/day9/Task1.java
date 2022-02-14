package days.day9;

class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("This is human with name " + name);
    }
}

class Student extends Human {
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is student with name " + name);
    }
}

class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is teacher with name " + name);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "Qwerty");
        Teacher teacher = new Teacher("Bob", "Prog");
        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
