import java.util.Scanner;

class Calculator{    
    public static double add(double n1,double n2){
        return n1+n2;
    }
     public static double sub(double n1,double n2){
        return n1-n2;
    }
     public static double multi(double n1,double n2){
        return n1*n2;
    }
     public static double div(double n1,double n2){
        if(n2==0){
            System.out.println("Zero by division Error!!");
        }

        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean calContinue=true;

        while (calContinue) {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();

            if(choice==5){
                calContinue=false;
                System.out.println("Calculator closed5...");
                break;
            }
            System.out.println("Enter First no::");
            double n1=sc.nextInt();
            System.out.println("Enter Second no::");
            double n2=sc.nextInt();

            double res=0;
            switch (choice) {
                case 1:
                    res=add(n1, n2);
                    break;
                case 2:
                    res=sub(n1, n2);
                    break;
                case 3:
                    res=multi(n1, n2);
                    break;
                case 4:
                    res=div(n1, n2);
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }
            System.out.println("Result:"+res);
        
        }
        sc.close();
        
    }

}