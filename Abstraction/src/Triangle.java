public class Triangle extends Shape {
    Triangle(int a,int b){
        super(a,b);
    }
    @Override
    void area(){
        double result=0.5*a*b;
        System.out.println("The Area of the Triangels is "+result);
    }
}
