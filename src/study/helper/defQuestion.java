
package study.helper;


public class defQuestion extends Question{
    
       public defQuestion(String a, String q){
           super(a,q);  //calls on the super classes contructor to make a new question onject
       } 
       public void printQuestion(){
           super.printQuestion(); //calls on the super class to utilize its printQuestion method
       }
      
    
}
