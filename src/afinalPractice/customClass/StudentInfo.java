package afinalPractice.customClass;

public class StudentInfo {
    String name;
    int Id;
    char gender;
    int age;

    public void setInfo (String studentName,int studentID,char gender , int studentAge){
        this.age = studentAge;
        this.name = studentName;
        this.gender = gender;
        this.Id = studentID;
    }

    public void getInfo(){
        System.out.println("Name: " + name +'\n'+"Age: "+age+'\n'+"Student ID: "+Id+'\n'+"Gender: "+gender);
    }

    public void work(){
        System.out.println(name+" is working on the new project.");
    }





}
