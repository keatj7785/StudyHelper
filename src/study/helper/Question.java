
package study.helper;

public class Question {
    String question;
    String answer;
    
    public Question (String q, String a){
        this.question=q;
        this.answer=a;
    }
    
    public void printQuestion(){
        System.out.println(this.question);
    }
    
}
