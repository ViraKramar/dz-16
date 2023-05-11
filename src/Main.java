import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args)  {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException wrongAccountException){
            System.out.println("Account does not exist");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("There are not enough funds in the account");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("The account currency is another");
        }catch (Exception e){
            System.out.println("The processing error. Please, try later");
        }finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException){
            System.out.println("Account does not exist");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("There are not enough funds in the account");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("The account currency is another");
        }catch (Exception e){
            System.out.println("The processing error. Please, try later");
        }finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException){
            System.out.println("Account does not exist");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("There are not enough funds in the account");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("The account currency is another");
        }catch (Exception e){
            System.out.println("The processing error. Please, try later");
        }finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException){
            System.out.println("Account does not exist");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("There are not enough funds in the account");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("The account currency is another");
        }catch (Exception e){
            System.out.println("The processing error. Please, try later");
        }finally {
            System.out.println("Thank you for using our service");
        }
    }
}