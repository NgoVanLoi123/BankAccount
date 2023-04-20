package handle;

import entity.Account;

import java.util.Scanner;

public class AccountHandle {
    FormHandle formHandle=new FormHandle();
    public Account inputAccount(Scanner sc){
        System.out.println("Nhập họ tên:");
        String name=sc.nextLine();
        System.out.println("Nhập số tài khoản");
        int accountNumber =Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập email:");
        String email= formHandle.FormatEmail(sc);
        System.out.println("Nhập số dư tài khoản:");
        double accountBalance=Double.parseDouble(sc.nextLine());
        return new Account(name,accountNumber,email,accountBalance);
    }

}
