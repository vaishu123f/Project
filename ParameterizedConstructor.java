public class ParameterizedConstructor {
    String name;
    int age;
    public ParameterizedConstructor(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor :  Name : "+this.name+"  ,  Age : "+this.age);
    
    }
    public static void main(String[] args) {
        ParameterizedConstructor p1=new ParameterizedConstructor("Nageshwari"  ,  20);
        
    }
}

