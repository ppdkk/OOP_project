package LetterState;

public class NewLetter implements ILetterState{
    @Override
    public void nextLetterStatus(LetterContext letterContext){
        letterContext.setiLetterState(new SendLetter());
    }
    @Override
    public void previousLetterStatus(LetterContext letterContext) {
        System.out.println("Лист новий. Попереднього стану немає");
    }
    @Override
    public String getStatus() {

        return Status.NEW.getStatus();
    }

}
