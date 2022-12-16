/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 77
Questões
(...)
3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira dinheiro
de uma Account. Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado
e o método deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance" [Valor de débito
excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw. */

package Figura_3_8_Account_java.pag_77_3_11_AccountWithdraw_java;

public class AccountWithdraw {

    private String name;
    private double balance;

    public AccountWithdraw(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }//if
    }//AccountWithdraw()

    public void withdraw(double wdrAmount){
        if(wdrAmount <= balance){
            balance = balance - wdrAmount;
        }//if
        else{
            System.out.printf("Withdrawal amount (%.2f) exceeded account balance (%.2f).%n%n", wdrAmount, balance);
        }//else

    }//withdraw

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }//if
    }//deposit

    public double getBalance(){
        return balance;
    }//getBalance

    public void setName(String Name){
        this.name = name;
    }//setName

    public String getName(){
        return name;
    }//getName
    
}//AccountWithdraw
