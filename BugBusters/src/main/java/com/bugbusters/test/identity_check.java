package com.bugbusters.test;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class identity_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you a member of BusBusters' team?");
        String answer = sc.nextLine();
        Pattern answers = Pattern.compile("\\b(Yes|YES|yes|y|Y|yep|roger|)\\b");
        Matcher matcher = answers.matcher(answer);
        if (matcher.find()) {
            System.out.println("Hi");
            System.out.println("Enter your code for verification:");
            String code = sc.nextLine();
            if(otp(code)==true){
                System.out.println("Code is correct, enter your first name:");
                System.out.println(check_name(sc.nextLine()));
            }

        }

    }
    public static String check_name(String first_name){
        Set<String> firsNameList = new HashSet<>();
        if(firsNameList.contains(first_name)){
            return "Your name is in the list! Welcome!";
        }
        else{
            firsNameList.add(first_name);
            return "You are new, but you have been added to the list! Welcome!";
        }
    }
    public static boolean otp(String code){
        Set<String> codeList = new HashSet<>();
        codeList.add("bugbuster09090919%*");
        codeList.add("bugsnewerstop1872872&");
        if(codeList.contains(code)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void name_storage(String first_name){
        List firstnameDB = new ArrayList<>();


    }
}

