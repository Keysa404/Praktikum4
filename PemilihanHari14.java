package Praktikum04;
import java.util.Scanner;

public class PemilihanHari14 {
    public static void main (String[] args){
        Scanner key = new Scanner (System.in);
        String dayName, dayType;

        System.out.print("Input day name ");
        dayName = key.nextLine();

        switch (dayName.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            dayType = "weekday";
            break;
            case "saturday":
            case "sunday":
            dayType = "weekend";
            break;
            default:
            dayType = "invalid dayName";
        }
            System.out.println(dayName + "is a " + dayType);

            key.close();
        }
    }    

