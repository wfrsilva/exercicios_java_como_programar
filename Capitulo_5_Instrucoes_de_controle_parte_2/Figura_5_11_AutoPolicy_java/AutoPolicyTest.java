// Figura 5.12: AutoPolicyTest.java
// Demonstrando Strings em um switch.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_11_AutoPolicy_java;

public class AutoPolicyTest {

    public static void main(String [] args){

        AutoPolicy policy1 = new AutoPolicy(111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

    }//main

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State: %s %s a no-fault state %n%n",
            policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
            (policy.isNoFaultState() ? "is": "is not"));
    }//policyInNoFaultState
    
}//AutoPolicyTest
