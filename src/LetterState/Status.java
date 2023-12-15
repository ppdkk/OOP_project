package LetterState;

public enum Status {
    NEW("НОВИЙ"), SEND("ВІДПРАВЛЕНО"), DELIVERED("ДОСТАВЛЕНО"), READ("ПРОЧИТАНО");
    private String status;
    private Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
