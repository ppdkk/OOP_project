package StudentBuilder;

public class Student {
    protected String name;
    protected String surname;
    protected int variant;
    protected int group;
    protected double averageMark;

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getVariant(){
        return this.variant;
    }
    public int getGroup(){
        return this.group;
    }
    public double getAverage(){
        return this.averageMark;
    }
    public void print(){
        System.out.println("Студент: " + this.getSurname() + " "+ this.getName() + ", група: " + this.getGroup()
        + ", варіант: " + this.getVariant() + ", середній бал: " + this.getAverage());
    }

    public static class Builder{
        private Student newStudent;

        public Builder(){
            newStudent = new Student();
        }
        public Builder addName(String Name){
            newStudent.name = Name;
            return this;
        }
        public Builder addSurname(String Name){
            newStudent.surname = Name;
            return this;
        }
        public Builder addVariant(int var){
            newStudent.variant = var;
            return this;
        }
        public Builder addGroup(int group){
            newStudent.group = group;
            return this;
        }
        public Builder addAverage(double aver){
            newStudent.averageMark = aver;
            return this;
        }
        public Student build(){
            return newStudent;
        }

    }

}
