/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operator.practice;

/**
 *
 * @author class
 */
public class OperatorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //TODO: Declare and intialize test scores as int.
        int testScore1 = 96;
        int testScore2 = 90;
        int testScore3 = 100;
        
      
        //TODO: Display each test score, one per line.
        System.out.println("The  score for test 1 is:" + testScore1);
        System.out.println("The  score for test 2 is:" + testScore2);
        System.out.println("The  score for test 3 is:" + testScore3);
        
        int sum =  testScore1 +  testScore2 + testScore3 ;
        //TODO: Calculate the average of the test scores.
        double average = sum / 3.0;
        
        //TODO: Output the average. 
        System.out.println("The average test score is: "  + average);
      
    }
    
}
