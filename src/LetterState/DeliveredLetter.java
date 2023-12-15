package LetterState;

public class DeliveredLetter implements ILetterState{
    @Override
    public void nextLetterStatus(LetterContext letterContext){
        System.out.println("Лист відправлено. Наступного кроку немає.");
    }
    @Override
    public void previousLetterStatus(LetterContext letterContext) {
        letterContext.setiLetterState(new SendLetter());
    }
    @Override
    public String getStatus() {

        return Status.DELIVERED.getStatus();
    }
}
