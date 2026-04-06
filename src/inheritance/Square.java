package inheritance;

public class Square extends Rectangle {

    @Override
    public double calculateArea(){
        return sides*length;
    }

    public void print(String what){
        System.out.println("I am a" + what);
    }
}
