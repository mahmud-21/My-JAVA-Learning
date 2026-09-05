public class AreaTest {
    public static void main(String[] args){
        Shape s1;
        s1=new Rectangle(5,6);
        s1.area();
        s1=new Triangle(5,6);
        s1.area();
        s1=new Circle(5);
        s1.area();
    }
}
