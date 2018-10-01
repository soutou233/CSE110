package Assignment5;

public class Pet {
    private String name;
    private int age;
    private boolean adopteStatus;

    public Pet(){
    }

    private Pet(String n, int a){
        name = n;
        age= a;
        adopteStatus = false;
    }

    public String getName(){
        return name;
    }

    public void setName(String na){
        name = na;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public void AgeIncrease(){
        age = age + 1;
    }

    public boolean getAdoptStatus(){
        return adopteStatus = true;
    }
}





