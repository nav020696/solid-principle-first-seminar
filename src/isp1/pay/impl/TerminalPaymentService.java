package isp1.pay.impl;

import isp1.pay.Payable;
import jdk.jshell.spi.ExecutionControl;


public class TerminalPaymentService {//implements Payable {

   // @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    //@Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

//    @Override
//    public void payPhoneNumber(int amount) {
//        throw new ExecutionControl.NotImplementedException("Not implemented");
//    }
}
