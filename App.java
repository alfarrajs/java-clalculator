import javax.swing.JOptionPane;
import java.util.Random;  // to generate a random number in specific range ;

public class App{
    public static void main(String[]args){
      Random rand = new Random();
      while(true){
      // random numbers in specific range  it goes from [0] to [upperbound-1]
      int upperbound = 25;
      int number1 = rand.nextInt(upperbound);
      int number2 = rand.nextInt(upperbound)*3;
      String Answer = JOptionPane.showInputDialog(null,number1+"+"+number2+"=  ?");
      int IntAnswer = Integer.parseInt(Answer);
      String result = (number1+number2 == IntAnswer) ? "صحيحة": "خاطئة";
      JOptionPane.showMessageDialog(null,"  انت قلت انه     " +number1+ " + "+number2+"  بساوي  "+IntAnswer+"   الإجابة: "+result);
      if(result == "صحيحة"){
        break;
      }
      }   
    }
}










