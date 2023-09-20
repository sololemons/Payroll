import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER EMPLOYEE NAME: ");
        String employeeName = input.nextLine();

        System.out.print("ENTER DESIGNATION: ");
        String designation = input.nextLine();

        System.out.print("ENTER DAYS WORKED: ");
        int daysWorked = input.nextInt();

        System.out.print("ENTER PAY RATE: ");
        int payRate = input.nextInt();

        System.out.print("ENTER GENERATION DATE: ");
        String genDate = input.next();

        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : ");
        int employeeNo = input.nextInt();

        int basicPay = daysWorked * payRate;
        int pf = basicPay / 10;
        final float profTax = 0.02f * basicPay;
        int totalDeduct = pf + (int)profTax;
        int netPay = basicPay - totalDeduct;
        int grossEarn = 10000;

        System.out.println();
        System.out.println("                    SHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("                              SALARY MONTH 9 2013");
        System.out.println();
        System.out.println("       EMP.NO.: " + employeeNo + "             EMP.NAME: " + employeeName +"       DESIGNATION: " + designation);
        System.out.println("       DAYS WORKED: " + daysWorked + "        PAY RATE: " + payRate + "          GEN DATE:" + genDate);
        System.out.println("       ────────────────────────────────────────────────────────────────────────");
        System.out.println("       EARNINGS        AMOUNT(RS.)           DEDUCTIONS     AMOUNT(RS.)");
        System.out.println("       ────────────────────────────────────────────────────────────────────────");
        System.out.println("       BASIC PAY       " + basicPay + "                 P.F.           " + pf);
        System.out.println("                                             PROF.TAX       " + (int)profTax);
        System.out.println();
        System.out.println("       ────────────────────────────────────────────────────────────────────────");
        System.out.println("       GROSS EARN.     " + grossEarn + "                 TOTAL DEDUCT.  " + totalDeduct);
        System.out.println("                                             NET PAY        " + netPay);
        System.out.println("       ────────────────────────────────────────────────────────────────────────");



    }
}