// Figura 5.11: AutoPolicy.java
// Classe que representa uma apólice de seguro de automóvel.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_11_AutoPolicy_java;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;

    }//constructor

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }//setAccountNumber

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }//setMakeAndModel

    public String getMakeAndModel(){
        return makeAndModel;
    }//getMakeAndModel

    public void setState(String state){
        this.state = state;
    }//setState

    public String getState(){
        return state;
    }//getState

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch(getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }//switch

        return noFaultState;

    }//isNoFaultState
    
}// AutoPolicy
