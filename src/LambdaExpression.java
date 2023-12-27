import java.awt.*;

@FunctionalInterface
public interface LambdaExpression {
    void info();
}
//class impclass implements LambdaExpression{ // 1st process to implement
//    @Override
//    public void info() {
//        System.out.println("it's from LambdaExpression");
//    }
//}
class test {
    public static void main(String[] args) {
//        LambdaExpression lambdaExpression=new LambdaExpression() { // 2nd process anonymous innerclass = no name specific and inner class
//            @Override
//            public void info() {
//                System.out.println("it's from LambdaExpression");
//            }
//        };
//        lambdaExpression.info();
//        }
        LambdaExpression lambdaExpression = () ->
            System.out.println("it's from LambdaExpression");
        lambdaExpression.info();
    }
}
