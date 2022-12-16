/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 64
// Figura 3.5: Account.java
// a classe Account com um construtor que inicializa o nome. */

package Figura_3_5_Account_java;

public class Account{
    private String name;

    public Account(String name){
        this.name = name;
    }//Account()

    public void setName(String name){
        this.name = name;
    }//setName

    public String getName(){
        return name;
    }//getName

}//Account