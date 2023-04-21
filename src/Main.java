import entity.Account;
import handle.AccountHandle;
import handle.FormHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        AccountHandle accountHandle =new AccountHandle();
        Account account =accountHandle.inputAccount(sc);
        account.displayInfo();
        System.out.println("Nhập số tiền cần nạp:");
        double amount=Double.parseDouble(sc.nextLine());
        account.recharge(amount);
        System.out.println("Nhập email muốn thay đổi:");
        FormHandle formHandle=new FormHandle();
        String email= formHandle.formatEmail(sc);
        account.changeEmail(email);
        account.displayInfo();


    }
}