public class methodoverloading {
    void show(int num){
        System.out.print("Number:"+num);

    }
    void  show(String text){
        System.out.println("Text:"+text);
    }
    public static void main(String[] args) {
        methodoverloading method=new methodoverloading();
        method.show(25);
        method.show("welcomeee");
    }}

