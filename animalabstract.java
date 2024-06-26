abstract class animal{
    abstract void eats();
    animal(){
        System.out.println("you are creating an animal");

    }
    public void walk(){
        System.out.println("animal is walking");
    }
}
class horse extends animal{
    public void eats(){
        System.out.println("horse eats");
    }
    horse(){
        System.out.println("you have created horse");

    }
    class chicken extends animal{
        public void eats(){
            System.out.println("chicken eats");
    }
    chicken(){
        System.out.println("chicken is created");
    }
    
    }
    

}
public class animalabstract {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.eats();
        h1.walk();

        
    }
}
