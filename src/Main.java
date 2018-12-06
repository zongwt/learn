import annotation.MyAnnotation;

@MyAnnotation(color="red")
public class Main {

    public static void main(String[] args) {
        MyAnnotation myAnnotation = Main.class.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.color());
        System.out.println("git test");
    }
}
