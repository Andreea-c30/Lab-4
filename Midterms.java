public class Midterms extends Evaluation{  
   //private data members  
    private String object;
    private boolean admis;
    private Students student;
    
    public Midterms(String object, boolean admis, Students student){
      this.object=object;
      this.admis=admis;
      this.student=student;
    }
    public Midterms(){
   
    }

    void type(){
        System.out.println("Evaluation form : midterm");
    } 
    
    void grading(){
        int min1 = 1;  
         int max1 = 10;
       //Generate random grade 
      int grade = (int)(Math.random()*(max1-min1+1)+min1); 
    if (grade>=5) {
    double finalgr=grade*0.3;
    System.out.println("Grade: "+grade+"\tContibution to the final grade : "+finalgr);
    }
    else System.out.println("Grade: "+grade+"\tFailed the exam");
    
    }
    
}  