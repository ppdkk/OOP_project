import LetterState.LetterContext;
import LetterState.NewLetter;
import StudentBuilder.Student;
import CookieDecorator.*;
//стан посилки або
//фасад бібліотека відео або кинотеатр


public class Main {
    public static void main(String[] args) {
        //Builder
        Student newStud = new Student.Builder().addName("Anna").addAverage(98.657).addSurname("Voloshenko").addGroup(17).addVariant(2).build();
        newStud.print();

        //Decorator

        Cookie newCookie = new Cookie();
        System.out.println(newCookie.print());
        newCookie = new ChocolateDecorator(newCookie);
        System.out.println(newCookie.print());

        //State

        /*LetterContext newLetter = new LetterContext();
        newLetter.setiLetterState(new NewLetter());
        System.out.println(newLetter.getStatus());
        newLetter.nextLetterStatus();
        System.out.println(newLetter.getStatus());
        newLetter.nextLetterStatus();
        System.out.println(newLetter.getStatus());
        newLetter.nextLetterStatus();
        System.out.println(newLetter.getStatus());*/

    }
}
