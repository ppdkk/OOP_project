package LetterState;

public interface ILetterState {
    String getStatus();
    void nextLetterStatus(LetterContext letterContext);
    void previousLetterStatus(LetterContext letterContext);
}
