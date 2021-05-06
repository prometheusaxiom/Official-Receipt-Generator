package OfficialReceiptGenerator;

import java.util.Scanner;

public class OfficialReceiptGenerator {
    
    public static void main(String[] args) {
        int or_no, items;
        String cus_name, add;
        double u_price, total = 0;
        /* :  ;  U */
        Scanner scan = new Scanner(System.in);
        System.out.println("OFFICIAL RECEIPT NO.:");
        or_no = scan.nextInt();
        
        scan.nextLine();
        System.out.println("CUSTOMER NAME:");
        cus_name = scan.nextLine();
        
        System.out.println("ADDRESS:");
        add = scan.nextLine();
        
        System.out.println("NO. OF ITEMS BOUGHT:");
        items = scan.nextInt();
        
        System.out.println("UNIT PRICE:");
        u_price = scan.nextDouble();
        
        total = items * u_price;
        
        System.out.println("TOTAL SALES:"+total);
        
    }
    
}
