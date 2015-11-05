/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package study.helper;

/**
 *
 * @author leem2962
 */
public class mcQuestion extends Question{
   //FIELDS
    String choiceOne;
    String choiceTwo;
    String choiceThree;
    String choiceFour;
    
    public mcQuestion(String q, String c1, String c2, String c3, String c4, String a){
        super.Question(q,a){
            this.choiceOne=c1;
            this.choiceTwo=c2;
            this.choiceThree=c3;
            this.choiceFour=c4;
            
        }
    }
}
