package atm_machin;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationsImpl implements AtmOperationsInterface{
ATM atm=new ATM();
Map<Double,String> ministatament=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Avaliable Balance is :"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount<10000) {
            System.out.println("Only 500 notes are avilabla");
            if (withdrawAmount % 500 == 0) {
                if (withdrawAmount <= atm.getBalance()) {
                    ministatament.put(withdrawAmount, "Amount withdrawn");
                    System.out.println(withdrawAmount + "   collect the cash");
                    atm.setBalance(atm.getBalance() - withdrawAmount);
                    viewBalance();
                } else {
                    System.out.println("insufficant balance");
                }
            } else {
                System.out.println("plz select correct Denomination");
            }
        }else{
            System.out.println("Dilay limit is only 10000");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatament.put(depositAmount,"Amount deposited");
        System.out.println(depositAmount+"deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String>m:ministatament.entrySet()) {
            System.out.println(m.getKey()+"  "+m.getValue());
            
        }

    }
}
