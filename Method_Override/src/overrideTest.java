public class overrideTest{
    public static void main(String[] args){
        teacher t1=new teacher();
        t1.name ="Mahmud";
        t1.age=23;
        t1.qualification="B.Sc";
        t1.displayInfo();
        person p1=new teacher();
        p1.name="Mahmud";
        p1.age=23;
//        p1.qualification="B.Sc";
        p1.displayInfo();
    }
}
