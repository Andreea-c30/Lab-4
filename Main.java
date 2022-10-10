import java.util.Scanner;    
class Main{  

    public static void studentdata(){
        //Data about students
        //creating instance of the encapsulated class 
       
        Full_time s1=new Full_time(); 
        Part_time s2=new Part_time();    
    
        //setting values for students
        s1.setName("Nicole Johnson"); 
        s2.setName("Eduard Houghes"); 
      
        //getting values 
        System.out.println("->Student ->  Id: "+s1.getId()+"\tName: "+s1.getName()); 
        s1.type();s1.duration();
        System.out.println("->Student ->  Id: "+s2.getId()+"\tName: "+s2.getName()); 
        s2.type();s2.duration();
       
    }   

   

   public static void evaluation_exam(){
       //Using dependancy injection
        Full_time stud=new Full_time();   
        stud.setName("Nicole Johnson"); 
    
        Exams ex1=new Exams();  
        ex1.setObj("mathematics");
        ex1.setAdmis(true);
        ex1.setStudent(stud);
        
        ex1.type();
        ex1.welcome();
        
        System.out.println(ex1.getStudent().getName());
        System.out.println("\tObject: "+ex1.getObj()+"\tAccepted: "+ex1.getAdmis());
        ex1.grading();


    }

    public static void evaluation_mid(){

        //Using dependancy injection
        Part_time stud=new Part_time();   
        stud.setName("Anne Wales"); 
    
        Midterms mid1=new Midterms();  
        mid1.setObj("mathematics");
        mid1.setAdmis(true);
        mid1.setStudent(stud);
        
        mid1.type();
        mid1.welcome();
        
        System.out.println(mid1.getStudent().getName());
        System.out.println("\tObject: "+mid1.getObj()+"\tAccepted: "+mid1.getAdmis());
        mid1.grading();


    }

    public static void evaluation_lab(){

        //Using dependancy injection
         Part_time stud=new Part_time();   
        stud.setName("Victoria Houghes"); 
    
        Laboratory lab=new Laboratory();  
        lab.setObj("graphics");
        lab.setStudent(stud);
        
        lab.type();
        lab.welcome();
        
        System.out.println(lab.getStudent().getName());
        System.out.println("\tObject: "+lab.getObj());

        lab.grading();
        lab.tax();


    }

    public static void profdata(){

        //Data about professors

        //creating instance of the encapsulated class 
        Professors p1=new Professors(); 
        Professors p2=new Professors();   
        Professors p3=new Professors();  
        //setting values for professors
        p1.setName("Mary Reid");p1.setPermanent(true); p1.setWorking_hours(192); p1.setP_h(70);p1.setMedth(11);p1.setPm(90);
        p2.setName("Don Miles");p2.setPermanent(false); p2.setWorking_hours(208); p2.setP_h(50);p2.setMedth(9);p2.setPm(89);
        p3.setName("Aice Hary");p3.setPermanent(true); p3.setWorking_hours(200); p3.setP_h(55);p3.setMedth(10);p3.setPm(70);
        //getting values 
        p1.welcome();
        System.out.println("\tId: "+ p1.getId()+"\tName: "+p1.getName()+"\tPermanent_pos: "+p1.getPermanent()+"\tSalary: "+p1.salary(p1.getWorking_hours(),p1.getP_h())+"$"); 
        p2.welcome();
        System.out.println("\tId: "+ p2.getId()+"\tName: "+p2.getName()+"\tPermanent_pos: "+p2.getPermanent()+"\tSalary: "+p2.salary(p2.getWorking_hours(),p2.getP_h())+"$"); 
        p3.welcome();
        System.out.println("\tId: "+ p3.getId()+"\tName: "+p3.getName()+"\tPermanent_pos: "+p3.getPermanent()+"\tSalary: "+p3.salary(p3.getWorking_hours(),p3.getP_h())+"$"); 
   
    }

    public static void infdepartment(){
        
        //Using dependancy injection
        Administration a1=new Administration(); 
        a1.setName("Kalyani Travert");
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");

        Informatics inf=new Informatics(); 
        inf.welcome();
        inf.setDepartment("Informatics");
        inf.setAdmin(a1);
        inf.setNr(25);
        inf.setPartners("Mathematical Association of America");
        
        System.out.println("Department -> "+inf.getDepartment());
        System.out.println(inf.getAdmin().getLevel()+" - "+inf.getAdmin().getPosition()+" -> "+inf.getAdmin().getName());
        inf.adress();
        System.out.println("\nNumber of instructors: "+inf.getNr()+"\nPartners: "+inf.getPartners());
  
    } 

    public static void scidepartment(){

        Administration a1=new Administration(); 
        a1.setName("Ken Davis");
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");

        Science inf=new Science(); 
        inf.welcome();
        inf.setDepartment("Science");
        inf.setAdmin(a1);
        inf.setNr(30);
        inf.setPartners("National Science Association");

        System.out.println("Department -> "+inf.getDepartment());
        System.out.println(inf.getAdmin().getLevel()+" - "+inf.getAdmin().getPosition()+" -> "+inf.getAdmin().getName());
        inf.adress();
        System.out.println("\nNumber of instructors: "+inf.getNr()+"\nPartners: "+inf.getPartners());
  
    } 

 
    public static void administration(){

        Informatics inf=new Informatics(); 
        inf.setDepartment("Informatics");

        Administration a1=new Administration(); 
        Administration a2=new Administration(); 
    
        a1.welcome();
        a1.setName("Kalyani Travert");
        a1.setFunctions("Run & administrate department ");
        a1.setDepartment(inf);
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");
        a1.setWorking_hours(170);
        a1.setP_h(90);

        a2.setName("Frederick Franco");
        a2.setFunctions("Supervise students from department ");
        a2.setDepartment(inf);
        a2.setPosition("Deputy Chef");
        a2.setLevel("Superior");
        a2.setWorking_hours(173);
        a2.setP_h(80);

        System.out.println("\n\tName Surname: "+a1.getName()+"\n\tPosition: "+a1.getPosition()+"\n\tLevel: "+a1.getLevel()
        +"\n\tFunctions: "+a1.getFunctions()+a1.getDepartment().getDepartment()
        +"\n\tSalary: "+a1.salary(a1.getWorking_hours(),a1.getP_h())+" $");
        
        System.out.println("\n\tName Surname: "+a2.getName()+"\n\tPosition: "+a2.getPosition()+"\n\tLevel: "+a2.getLevel()
        +"\n\tFunctions: "+a2.getFunctions()+a2.getDepartment().getDepartment()
        +"\n\tSalary: "+a2.salary(a2.getWorking_hours(),a2.getP_h())+" $");
        
       
    } 


    public static void menu(){
        Scanner myObj = new Scanner(System.in);
        int option;
        //Creating a menu from the scenarios
         System.out.println("\n1---Student goes to university");
         System.out.println("2---Student takes exam");
         System.out.println("3---Student takes midterm ");
         System.out.println("4---Student presents lab");
         System.out.println("5---Working professors");
         System.out.println("6---Go to the info department");
         System.out.println("7---Go to the science department");
         System.out.println("8---Go to the administration");
         System.out.println("Choose option->"); 
         option = myObj.nextInt();   
  
        switch (option) {
            case 1:
                     studentdata();
                     break;
            case 2:
                     evaluation_exam();
                     break;
            
            case 3:
                    evaluation_mid();
                     break;
            case 4:
                    evaluation_lab();
                     break;
            case 5:
                    profdata();
                     break;
            case 6:
                    infdepartment();
                     break;
            case 7:
                    scidepartment();
                     break;
            case 8:
                    administration();
                     break;                   
            
            } 
                    
    }

    public static void main(String[] args){  
        Scanner myObj = new Scanner(System.in);
        menu();
        int op=1;
        while (op<8){
            menu();
            op=op+1;
        }
    }  

}  