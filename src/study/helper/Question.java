
package study.helper;

public class Question {
    String question;    //question part of the question object
    String answer;      //answer part of the question object
    
    public Question (String q, String a){   //question constructor
        this.question=q;
        this.answer=a;
    }
    
    public void printQuestion(){    //prints just the question part of the question object to the screen
        System.out.println(this.question);
    }
    
}
