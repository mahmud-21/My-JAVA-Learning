public class teacher extends person {
    String qualification;
    teacher(String na,int ag,String q){
       super(na,ag);
        qualification=q;
    }
    void displayInfo2(){
        displayInfo1();
        System.out.println("Qualification : "+qualification);
    }
}
