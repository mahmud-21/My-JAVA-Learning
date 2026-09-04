public class student {
    String name,gender;
    int phone ;
    void setInformation(String n,String g,int ph){
        name=n;
        gender=g;
        phone=ph;
    }
    void displayInfo(){
        System.out.println("Name of the Student : "+name);
        System.out.println("Gender of the Student : "+gender);
        System.out.println("Number of the Student : "+phone);
    }
}
