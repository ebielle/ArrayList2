import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Giulia", 22));
        studenti.add(new Student("Marco", 24));
        studenti.add(new Student("Greta", 26));
        studenti.add(new Student("Emma", 23));
        studenti.add(new Student("Andrea", 24));
        studenti.add(new Student("Luca", 25));
        studenti.add(new Student("Matteo", 23));
        studenti.add(new Student("Marta", 21));
        studenti.add(new Student("Eva", 26));
        studenti.add(new Student("Alessandro", 24));
        studenti.add(new Student("Fabio", 25));
        studenti.add(new Student("Francesca", 23));

        System.out.println(studenti);

        studenti.sort(Comparator.comparing(Student::getName));

        System.out.println(studenti);
    }
}