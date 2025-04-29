

public class Constructorr {
    String name;
    int age;
    public Constructorr(){
        name="Sudhagar";
        age=30;
        System.out.println("Default cinstructor:name="+name+",Age="+age);


    }
    public Constructorr(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("parameterized constructor:name="+this.name+",age="+this.age);

    }
    public static void main(String[] args){
        Constructorr c1=new Constructorr();
        Constructorr c2=new Constructorr("Nageshwari" , 20);
    }
}
