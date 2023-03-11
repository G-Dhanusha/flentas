import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Input{
    public String input1;
    public String input2;
    

    public String toString() {
        return "Input [input1=" + input1 + ", input2=" + input2 + "]";
    }

}
public class SherlockProb {
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(Syaytem.in);
        int T = sc.nextInt();
        sc.nextline();
        Systen.out.println(T);
        List<Input> inputs = new ArrayList<>();
        for(int i =0; i<T; i++) {
            Input input = sc.nextLine();
            input.input1 = sc.nextLine();
            input.input2 = sc.nextLine();
            inputs.add(input);
            
        }
        
        for(Input input: inputs) {
            String temp = new String(new SringBuilder(intput.input2).reverse());
            if(input.input2.contains*input.input1) || temp.contains(input.input1)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}