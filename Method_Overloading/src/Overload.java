public class Overload {
    void add(){
        System.out.println("Nothing to add");
    }
    void add(int a,int b){
        System.out.println("The sum of"+" "+a+" "+ "and"+" " +b+" " +"is : "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
