import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0 ;
        try {
            System.out.println("Enter the Number of products ");
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the price of " + i + ":");
                double price = Double.parseDouble(sc.nextLine());

                System.out.println("Enter the quantity of " + i + ":");
                double quantity = Double.parseDouble(sc.nextLine());

                total = total + (price * quantity);
            }
            System.out.println("The Final Calculated total is " + total);
            System.out.println("Enter the Amount paid ");
            double Amount = Double.parseDouble(sc.nextLine());
            double change = (Amount - total);
            if (change < 0) {
                throw new ArithmeticException("Insufficient payment ");
            }
            System.out.println("Payment Successful ");
            System.out.println("The Change to be given is " + change);
        }

            catch(NumberFormatException e ){
                System.out.println("Invalid input enter numb only ");
            }
            catch(ArithmeticException e ){
                System.out.println("Error" + e.getMessage());
            }
            finally{
                System.out.println("Thanks for shopping ");
            }
            sc.close();
        }


        }


