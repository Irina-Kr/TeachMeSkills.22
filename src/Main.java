import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        ConsoleReader consoleReader = new ConsoleReader();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        Calculator calculator = new Calculator();
        consoleWriter.writeMessage("Enter num 1");
        double num1 = consoleReader.getNum();
        consoleWriter.writeMessage("Enter num 2");
        double num2 = consoleReader.getNum();
        consoleWriter.writeMessage("Enter operation");
        String type = consoleReader.getType();
        double result = calculator.calculate( num1, num2, type);
        consoleWriter.writeMessage("Result =" + result);
        };

    }

