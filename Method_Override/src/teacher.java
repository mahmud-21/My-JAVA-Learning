public class teacher extends person{
    String qualification;
    @Override
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
    }
}
