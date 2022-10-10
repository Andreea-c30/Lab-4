import java.lang.Math;
abstract class Evaluation implements Root{  
    
    int d,m,y;
    //private data members  
    private String object;
    private boolean admis;
    private Students student;
    
    public Evaluation(String object, boolean admis, Students student){
      this.object=object;
      this.admis=admis;
      this.student=student;
    }
    public Evaluation(){
     
    }
    public void welcome(){
        System.out.println("--------------Information about evaluations---------");
    } 

    public String getObj(){  
      return object;  
    }  
      
    public void setObj(String object){  
      this.object=object; 
    }  

    public boolean getAdmis(){  
      return admis;
    }  
      
    public void setAdmis(boolean admis){  
      this.admis=admis ; 
    }  
    public void setStudent(Students student){
      this.student=student;
    }

    public Students getStudent(){
      return student;
    }

    void date(){
        //data of the evaluation
         int min1 = 1, min2=1;  
         int max1 = 30,  max2=12;
       //Generate random int value from 200 to 400   
      int a = (int)(Math.random()*(max1-min1+1)+min1);  
      int b = (int)(Math.random()*(max2-min2+1)+min2);  
      System.out.println("Date: "+a+"."+b+".2022");
    }
    //Declarind abstract method
    abstract void grading();
    abstract void type();

    
}  