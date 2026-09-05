public class Circle extends Shape {
    Circle(int a){
        super(a,a);
    }
    @Override
    void area(){
        double result=3.14*a*a;
        System.out.println("The Area of the Rectangels is "+result);
    }
}
