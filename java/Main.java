import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num1,num2,num3,ans;
        int inp,choice;

        Scanner in=new Scanner(System.in);

        while (true) {
            System.out.println("\n\n1.sum: ");
            System.out.println("2.sub: ");
            System.out.println("3.mul");
            System.out.println("4.div");
            System.out.println("5.pow");
            System.out.println("6.exit\n");
            System.out.println("enter your choice: ");
             choice = in.nextInt();
            if (choice == 6) {
                break;
            }
            else if (choice == 5) {
                System.out.println("enter the number 1:");
                 num1 = in.nextInt();
                System.out.println("enter the number 2:");
                 num2 = in.nextInt();
                ans=calculator.pow(num1, num2);
//                continue;
            }
            else {
                if (choice > 6 || choice < 1) {
                    System.out.println("invalid choice");
                }
                else {
                    System.out.println("enter the no of input: 2 or 3");
                    inp = in.nextInt();
                    if (inp == 2) {
                        System.out.println("enter the 1st number:");
                        num1 = in.nextDouble();
                        System.out.println("enter the 2st number:");
                        num2 = in.nextDouble();
                        if (choice == 1) {
                            ans= calculator.sum(num1, num2);
                        } else if (choice == 2) {
                            ans= calculator.sub(num1, num2);
                        } else if (choice == 3) {
                            ans=calculator.mul(num1, num2);
                        } else {
                            ans=calculator.div(num1, num2);
                        }

                    }
                    else if (inp == 3) {
                        System.out.println("enter the 1st number:");
                        num1 = in.nextDouble();
                        System.out.println("enter the 2nd number:");
                        num2 = in.nextDouble();
                        System.out.println("enter the 3rd number:");
                        num3 = in.nextDouble();
                        if (choice == 1) {
                            ans=calculator.sum(num1, num2, num3);
                        } else if (choice == 2) {
                            ans= calculator.sub(num1, num2, num3);
                        } else if (choice == 3) {
                            ans=calculator.mul(num1, num2, num3);
                        } else  {
                            ans=calculator.div(num1, num2, num3);
                        }

                    }
                }
            }
        }

        }


    }
