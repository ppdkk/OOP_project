package LetterState;

public class SendLetter implements ILetterState{
    @Override
    public void nextLetterStatus(LetterContext letterContext){
        letterContext.setiLetterState(new DeliveredLetter());
    }
    @Override
    public void previousLetterStatus(LetterContext letterContext) {
        letterContext.setiLetterState(new DeliveredLetter());
    }
    @Override
    public String getStatus() {

        return Status.SEND.getStatus();
    }
}
