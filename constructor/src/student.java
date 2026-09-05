public class student {
    String name,gender;
    int phone;
    student(){
        System.out.println("No Infromation");
    }
    student(String n,String g){
        name=n;
        gender=g;
    }
    student(String n,String g,int p){
        name=n;
        gender=g;
        phone=p;
    }
    void displayInfo(){
        System.out.println("Name of the Student : "+name);
        System.out.println("Gender of the Student : "+gender);
        System.out.println("Number of the Student : "+phone);
    }
}
