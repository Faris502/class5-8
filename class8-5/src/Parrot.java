

public class Parrot extends Bird{

    public void talk(String word){
        System.out.println(word);
    }
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        
        
    }
}
