//The first Java lesson

import java.io.IOException;

public class Calculator
{
   InMemoryHistory fileHistory = new History();
    public double calculate (double num1,double num2,String type,double result) {

        switch (type){
            case "sum":
               double v =  num1 + num2;
               Operation operation = new Operation(num1,num2,type,v);
                fileHistory.writeHistory(operation);
                return v ;

            case "sub":
                double v1 =num1 - num2;
                Operation operation1 = new Operation(num1,num2, type,v1);
                fileHistory.writeHistory(operation1);
                return v1;
            case "mul":
                double v2 = num1 * num2;
                Operation operation2 = new Operation(num1,num2, type,v2);
                fileHistory.writeHistory(operation2);
                return  v2;
            case "div":
               double v3 = num1 / num2;
                Operation operation3 = new Operation(num1,num2, type,v3);
                fileHistory.writeHistory(operation3);
               return v3;
        }
        return 0;
    }
}