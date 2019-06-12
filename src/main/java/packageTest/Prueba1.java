package packageTest;

public class Prueba1 {
    public static void main(String args[]){
        System.out.println("Main Method");
    }
    public static void branch(Boolean condicion){
        if(condicion){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }

    public static String start(){
        System.out.println("start");
        return "start";
    }

    public static String stop(){
        System.out.println("Stop");
        return "stop";
    }
}
