public class Rectangle extends Shape{
    Rectangle(int a,int b){
        super(a,b);
    }
    @Override
    void area(){
        int result=a*b;
        System.out.println("The Area of the Rectangels is "+result);
    }
}
