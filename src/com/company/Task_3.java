package com.company;

import javax.naming.InsufficientResourcesException;

public class Task_3 {

    public static void main(String[] args) throws InsufficientResourcesException {
        AccountRas U1 = new AccountRas("Rashi", "3256 4587 9856 1254", 6000);
        AccountRas U2 = new AccountRas("lily", "4512 5623 7946 4613", 5500);

        try {
            U2.Transfer(2500);
        } catch (InsufficientResourcesException IF) {
            System.out.println(IF);
        } finally {
            System.out.println("Balance on your Bank Account is " + U2.Balance);
        }

    }
}
