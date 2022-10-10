public class Laboratory extends Evaluation{  
   //private data members  
    private String object;
    private boolean admis,presented;
    private Students student;
    
    public Laboratory(String object, boolean admis, Students student){
      this.object=object;
      this.admis=admis;
      this.student=student;
    }
    public Laboratory(){
   
    }

    void type(){
        System.out.println("Evaluation form : laboratory");
    } 

    void grading(){
        int t = 0;  
        int f = 5;
        int adm = (int)(Math.random()*(f-t+1)+t); 
        System.out.println("Presented "+adm+" out of 5 labs");
        if(adm>2){
            System.out.println("Student is accepted to the evaluations ");
        }
        else  System.out.println("Student is not accepted to the evaluations ");
        

    }

    void tax(){
         int t = 0;  
         int f = 20;
      int ab = (int)(Math.random()*(f-t+1)+t); 
      System.out.println("Nr of absences: "+ab);
      double money=ab*30;
      System.out.println("Has to pay the tax of : "+money+" Lei");

    }
}  