public class Operation {
    double num1;
    double num2;
    String type;
    double result;
    public Operation (double num1;double num2;String type;double result){
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return "Operation{" +
                "nim1="+ num1 +
                ", num2 =" + num2 +
                ",type =" + type + '\''+
                ",result=" + result +
                '}';
    }
}