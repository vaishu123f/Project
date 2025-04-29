public class paraconstructor {
    String name;
    int age;
    public paraconstructor(String name , int age){
        this.name=name;
        this.age=age;
        System.out.println("parametrized constructor:name:"+this.name+",age:"+this.age);
    }
    public static void main(String[]args){
        new paraconstructor("Vaishu", 20);
    }
}
