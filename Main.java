import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, month, day;
        int[] a = new int[3];
        String new_month=null;
        Scanner s = new Scanner(System.in);
        System.out.print("Input (YYYY-MM-DD): ");
        String input = s.next();
        String[] b = input.split("-");
        for(int i=0;i<3;i++){
            a[i] = Integer.parseInt(b[i]);
            if(a[1] == 1){
                new_month = "January";
            }else if(a[1] == 2){
                new_month = "February";
            }else if(a[1] == 3){
                new_month = "March";
            }else if(a[1] == 4){
                new_month = "April";
            }else if(a[1] == 5){
                new_month = "May";
            }else if(a[1] == 6){
                new_month = "June";
            }else if(a[1] == 7){
                new_month = "July";
            }else if(a[1] == 8){
                new_month = "August";
            }else if(a[1] == 9){
                new_month = "September";
            }else if(a[1] == 10){
                new_month = "October";
            }else if(a[1] == 11){
                new_month = "November";
            }else if(a[1] == 12){
                new_month = "December";
            }
        }
        System.out.println("The output is: "+new_month+" "+a[2]+","+a[0]);
        s.close();
    }
}