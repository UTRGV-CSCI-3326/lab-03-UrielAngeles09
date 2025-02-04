public class BankAccount {
    public static void main(String[] arg){
        double BobsBalance = 1275.37;

        // Bob withdrew $302.50.
        BobsBalance -= 302.50;

        // Bob deposited $50.03.
        BobsBalance += 50.03;

        // Bob withdrew half of his current balance, then deposited $20.00.
        BobsBalance -= BobsBalance / 2;
        BobsBalance += 20.00;

        // Bob withdrew $1.
        BobsBalance -= 1;

        // Bob deposited his paycheck that doubled his current balance.
        BobsBalance *= 2;

        //Bob deposited $1.
        BobsBalance += 1;

        System.out.println("Bob's new balance is: $" + BobsBalance);
    }
}