public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "rohan";
        s1.rollno = 45;
        s1.marks[0]=49;
        s1.marks[1]=79;
        s1.marks[2]=76;
        System.out.println("object s1 " +s1.name+""+s1.rollno);
        Student s2 = new Student(s1);
        s1.marks[1]=98;
        for(int i=0; i<3;i++){
            System.out.print(s2.marks[i]);
        }
        System.out.println("object s2 "  +s2.name+""+s2.rollno);
    }
}


class Student{
    String name;
    int rollno;
    int marks[];

    Student(){
    marks= new int[3];

        
    }
    // copy constructor
    Student(Student s1){
    marks= new int[3];
    this.name = s1.name;
    this.rollno =s1.rollno;
    this.marks=s1.marks;
 
    }
        
}

