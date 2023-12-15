package LetterState;

public class LetterContext {
    private ILetterState iLetterState;
    public ILetterState getiLetterState(){
        return iLetterState;
    }
    public void nextLetterStatus(){
        iLetterState.nextLetterStatus(this);
    }
    public void previousLetterStatus(){
        iLetterState.previousLetterStatus(this);
    }
    public void setiLetterState(ILetterState iLetterState){
        this.iLetterState = iLetterState;
    }
    public String getStatus(){
        return iLetterState.getStatus();
    }
}
