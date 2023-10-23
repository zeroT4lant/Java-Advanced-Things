package Generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Ivan",13);
        Schoolar sc2 = new Schoolar("Vanya",14);

        Student st1 = new Student("Igor",19);
        Student st2 = new Student("Igoryan",20);

        Employee e1 = new Employee("Semyon",21);
        Employee e2 = new Employee("Semeon",22);

        Team<Schoolar> schoolTeam = new Team<>("Школьники");
        schoolTeam.addNewParticipant(sc1);
        schoolTeam.addNewParticipant(sc2);

        Team<Student> studentTeam = new Team<>("Студенты");
        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(e1);
        employeeTeam.addNewParticipant(e2);

    }
}
