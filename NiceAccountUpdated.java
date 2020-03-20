import java.text.NumberFormat;

public class NiceAccountUpdated {

        String lastName;
        int id;
        double balance;

        void addInterest(double rate, int howManyYears){
            for(int i = 1; i <= howManyYears; i++){
                System.out.print("Adding ");
                System.out.print(rate);
                System.out.println(" percent...");

                balance += balance * (rate / 100.0);
            }

        }

        void display(){
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.print("The account with last name ");
            System.out.print(lastName);
            System.out.print(" and ID number ");
            System.out.print(id);
            System.out.print(" has balance ");
            System.out.println(currency.format(balance));
        }
    }
