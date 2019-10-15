import java.util.Scanner;
class Add extends Thread {
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("the sum of two numbers is" + c);
        try {Thread.sleep(1000);} catch(Exception e){}
    }

}
class Sub extends Thread {
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        int c = a - b;
        System.out.println("the sub of two numbers is" + c);
        try {Thread.sleep(1000);} catch(Exception e){}
    }

}
class Mul extends Thread {
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        int c = a * b;
        System.out.println("the mul of two numbers is" + c);
        try {Thread.sleep(1000);} catch(Exception e){}
    }
}
class Div extends Thread {
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        int c = a / b;
        System.out.println("the div of two numbers is" + c);
        try {Thread.sleep(1000);} catch(Exception e){}
    }
}

public class Threaddemo {
    public static void main(String[] args) {
        Add divyanshu1=new Add();
        Sub divyanshu2=new Sub();
        Mul divyanshu3=new Mul();
        Div divyanshu4=new Div();
        divyanshu1.show();
        divyanshu2.show();
        divyanshu3.show();
        divyanshu4.show();




    }
}
