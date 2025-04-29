public class Constructoroverloading {
    public Constructoroverloading(){
        System.out.println("Constructor overloading");

    }
    public Constructoroverloading(String messsage){
        System.out.println("Welcome to cinstructor overloading");
    }
    public static void main(String[] args) {
        new Constructoroverloading();
        new Constructoroverloading("Welcome");
    }
    }
