package handle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormHandle {
    private static final String emailREGEX =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public  boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailREGEX);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    public String formatEmail(Scanner sc){
        boolean check =true;
        String email= new String();
        while(check){
             email=sc.nextLine();
            if(!validateEmail(email)){
                System.out.println("Email sai định dạng vui lòng kiểm tra lại!");
            }else{
                check=false;
            }
        }
        return email;
    }
}
