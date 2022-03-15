import java.util.ArrayList;
import java.util.Scanner;


class Course {
    private String cn;
    private int ch;
    private int grade;                                                                                                      
    public void setGrade(int grad){ grade=grad; }
    public void setcreditHours(int creditHours) {ch=creditHours;}
    public void setCourseName(String courseName) {cn=courseName;}
    public int getCourseCreditHours(){return ch;}
    public int getGrade(){return grade;}
    public String getCourseName(){return cn;}
}



class Student {
    private String id,name,major,birthdate;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(){}
    public Student(String student_id){id=student_id;}
    
    public void setName(String name){this.name=name;}
    public void setMajor(String major){this.major=major;}
    public void setbirthdate (String birthdate ){this.birthdate =birthdate ;}
    public String getId(){return id;}
    public String getMajor(){return major;}
    public String getBirthdate(){return birthdate;}
    public ArrayList<Course> getCourses(){return courses;}
    
    public String getName(){return name;}
    public void addCourse(String courseName){
        Course c = new Course();
        c.setCourseName(courseName);
        courses.add(c);
    }
    public double getAverage(){
        double marks = 0.0;
        for(Course c:courses){
            marks+=c.getGrade();
        }
        return marks/courses.size();
    }
    public void print(){
        String out;
        double ave = getAverage();
        out = "\n\nID: "+id+
        "\nName: "+(name==null ? "not initialized" : name)+
        "\nMajor: "+(major==null ? "not initialized" : major)+
        "\nBirthdate: "+(birthdate==null ? "not initialized" : birthdate)+
        "\nAverage: "+(ave >0 ?  ave :"no courses initialized")+"\n"
        +"CN\tCredit Hours\tGrade\n";
        System.out.println(out);
        for(Course c:courses){
            System.out.printf("%s%3d\t\t%6d\n",c.getCourseName(),c.getCourseCreditHours(),c.getGrade());
        }
        System.out.println();
    }
}

class UniversityStudents{
    private static ArrayList<Student> arrStu = new ArrayList<Student>();
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        

        while(input.hasNextLine()){
            String menu = input.nextLine();
            String[] arrInput = menu.split(" ");
            String firstCommend = arrInput[0].toLowerCase();
            if(firstCommend.equals("quit")){
                System.out.println("GOODBYE");
                System.exit(0);
            }

            if(arrInput.length >=2){
                if(firstCommend.equals("new")){
                    newStu(arrInput[1]);
                }
                else if(firstCommend.equals("delete")){
                    deleteStu(arrInput[1]);
                }
                else if(firstCommend.equals("getaverage")){
                    getAverage(arrInput[1]);
                }
                else if(firstCommend.equals("set")){
                    if(arrInput.length >=5)
                        set(arrInput[1],arrInput[2],arrInput[3] + ' '+arrInput[4] );
                    else
                        set(arrInput[1],arrInput[2],arrInput[3]);

                }
                else if(firstCommend.equals("get")){
                    get(arrInput[1],arrInput[2]);
                }
                else if(firstCommend.equals("addcourse")){
                    addCourse(arrInput[1],arrInput[2]);
                }
                else if(firstCommend.equals("setcourse")){
                    setCourse(arrInput[1],arrInput[2],arrInput[3],Integer.parseInt(arrInput[4]));
                }
                else if(firstCommend.equals("print")){
                    print(arrInput[1]);
                }
                
            }

            
        

        }

    }
    public static void newStu(String student_id){

        arrStu.add(new Student(student_id));
    }
    public static void deleteStu(String student_id){

        for(Student s:arrStu){
            if(s.getId().equals(student_id)){
                arrStu.remove(s);
                
                break;
            }
        }
    }
    public static void getAverage(String student_id){
        for(Student s:arrStu){
            if(s.getId().equals(student_id)){
                System.out.println((int)s.getAverage()+"\n");
                break;
            }
        }
    }
    public static void print(String student_id){
        for(Student s:arrStu){
            if(s.getId().equals(student_id)){
                s.print();
                break;
            }
        }
     
    }
    public static void set(String student_id,String attribute,String value){
        
        if(attribute.equals("name")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    i.setName(value);
                    break;
                }
            }
        }
        else if(attribute.equals("major")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    i.setMajor(value);
                    break;
                }
            }
        }
        else if(attribute.equals("birthdate")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    i.setbirthdate(value);
                    break;
                }
            }
        }
    }
    public static void get(String student_id,String attribute){
        
        if(attribute.equals("name")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    System.out.print(i.getName()+"\n");
                    break;
                }
            }
        }
        
        else if(attribute.equals("major")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    System.out.print(i.getMajor()+"\n");
                    break;
                }
            }
        }
        else if(attribute.equals("birthdate")){
            for(Student i:arrStu){
                if(i.getId().equals(student_id)){
                    System.out.print(i.getBirthdate()+"\n");
                    break;
                }
            }
        }
    }
    public static void addCourse(String student_id,String cn){
        for(Student s:arrStu){
            if(s.getId().equals(student_id)){
                s.addCourse(cn);
                break;
            }
        }
    }

    public static void setCourse(String student_id,String cno,String attribute,int value){
        for(Student s:arrStu){
            if(s.getId().equals(student_id)){
                for(Course c: s.getCourses()){
                    if(c.getCourseName().equals(cno)){
                        if(attribute.equals("ch")){
                            c.setcreditHours(value);
                        }
                        else if(attribute.equals("grade")){
                            c.setGrade(value);
                        }
                    }
                    break;
                }   
            }
        }
    }

}
