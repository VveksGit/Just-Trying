package com.vivek;

import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number for start a program : ");
        int random = in.nextInt();

        do {
            System.out.println(" 1. Factorial Program In Java\n" +
                    " 2. Calculate Electricity Bill\n" +
                    " 3. Calculate Average Of N Numbers\n" +
                    " 4. Calculate Discount Of Product\n" +
                    " 5. Calculate Distance Between Two Points\n" +
                    " 6. Calculate Commission Percentage\n" +
                    " 7. Calculate Batting Average\n" +
                    " 8. Sum Of N Numbers\n" +
                    " 9. Armstrong Number In Java\n" +
                    " 10.Reverse A String In Java\n" +
                    " 11.Find if a number is palindrome or not\n" +
                    " 12.HCF Of Two Numbers Program\n" +"" +
                    " 13.LCM Of Two Numbers Program\n" +
                    " 14.Sum of the digit of the number\n" +
                    " 15.Check Leap Year Or Not");
            System.out.print("Enter your choice of program : ");
            int choice = in.nextInt();

            switch(choice){
                case 1 -> {
                    int n = in.nextInt();int result = 1;
                    if (n <= 1){
                        System.out.println("Factorial not defined ");
                    }
                    else{
                        for (int i = 1; i <= n; i++){
                            result *= i;
                        }
                        System.out.println(result);
                    }
                    return;

                }
                case 2 ->{
                    System.out.print("Enter the monthly consumption of electricity : ");
                    int consumption = in.nextInt();
                    float chargePerkWh = 6.16f;// In India average charge per kWh
                    float totalBill = consumption * chargePerkWh;
                    System.out.println(totalBill);
                    return;
                }
                case 3 ->{
                    System.out.print("Enter the number : ");
                    int n = in.nextInt();
                    int total = 0;
                    for (int i = 1; i <= n; i++){
                        total = total+i;
                    }
                    System.out.println("Average of the "+n+" number is : "+total/n);
                    return;
                }
                case 4 ->{
                    System.out.print("Enter the original price of product : ");
                    int originalPrice = in.nextInt();
                    System.out.print("Enter discount rate of product : ");
                    float discountRate = in.nextFloat();
                    float discountMoney = originalPrice*(discountRate/100);
                    float finalPrice = originalPrice - discountMoney;
                    System.out.println("Final price of the product is : "+finalPrice);
                    return;
                }
                case 5 ->{
                    System.out.println("Enter the coordinates of two points : ");
                    double x1 = in.nextDouble();
                    double y1 = in.nextDouble();
                    double x2 = in.nextDouble();
                    double y2 = in.nextDouble();

                    double pointX = x2 - x1;
                    double pointY = y2 - y1;

                    double distance = Math.sqrt((pointX*pointX)+(pointY*pointY));
                    System.out.println("The distance b/w to points is : "+distance);
                    return;

                }
                case 6 ->{
                    System.out.print("Enter total sales amount : ");
                    int salesAmount = in.nextInt();

                    System.out.print("Enter commission amount on total sales : ");
                    int commissionAmount = in.nextInt();

                    double commissionPercentage = ((double) commissionAmount /salesAmount)*100;
                    System.out.println("The commission percentage is : "+commissionPercentage+"%");
                    return;
                }
                case 7 ->{
                    System.out.print("Enter total runs : ");
                    int runs = in.nextInt();

                    System.out.print("Enter the overs in which these runs were scored : ");
                    float overs = in.nextFloat();

                    float battingAveragePerOver = runs /overs;
                    System.out.println("The batting average in "+overs+" overs is "+battingAveragePerOver);
                    return;
                }
                case 8 ->{
                    System.out.print("Enter your number : ");
                    int n = in.nextInt();int sum = 0;
                    for (int i = 1; i <= n; i++) sum += i;
                    System.out.println("The sum of the "+n+" is "+sum);
                    return;
                }
                case 9 ->{
                    System.out.print("Enter your number : ");
                    int number = in.nextInt();int original = number;int result = 0;
                    while (number > 0){
                        int rem = number%10;
                        number = number/10;
                        result = result + rem*rem*rem;
                    }
                    if(result == original) System.out.println("Armstrong");
                    else System.out.println("No it's not");
                    return;
                }
                case 10 ->{
                    System.out.print("Enter the word or sentence : ");
                    String str = in.nextLine();
                    StringBuilder reverse = new StringBuilder();
                    for (int i = str.length()-1; i >= 0;i-- ){
                        reverse.append(str.charAt(i));
                    }
                    System.out.println(reverse);
                    return;
                }
                case 11 ->{
                    int n = in.nextInt();
                    int original = n;
                    int reversed = 0;

                    while(n != 0){
                        int rem = n % 10;
                        n = n/10;
                        reversed = reversed * 10 +rem;
                    }
                    if(reversed == original) {
                        System.out.println("Number is palindrome");
                    }
                    else {
                        System.out.println("it is not");
                    }
                    return;
                }
                case 12 ->{
                    System.out.print("Enter the first number : ");
                    int a = in.nextInt();
                    System.out.println("Enter the second number : ");
                    int b = in.nextInt();

                    while(b != 0){
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("The HCF of two number is : "+a);
                    return;
                }
                case 13 ->{
                    System.out.print("Enter the value of first number : ");
                    int a  = in.nextInt();
                    System.out.print("Enter the value of second number : ");
                    int b = in.nextInt();
                    int lcm = Math.max(a, b);

                    while (true){
                        if(lcm % a == 0 && lcm % b == 0){
                            System.out.println("The lcm of the number is : "+lcm);
                            break;
                        }
                        lcm++;
                    }
                    return;
                }
                case 14 ->{
                    System.out.print("Enter the value of n : ");
                    int n = in.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++){
                        sum += i;
                    }
                    System.out.println("The sum of the "+n +" numbers is  "+sum);
                    return;
                }
                case 15 ->{
                    System.out.print("Enter the year you want to check : ");
                    int year = in.nextInt();

                    if(year % 2 == 0 || year % 400 ==0){
                        System.out.println("It is leap year");
                    }
                    else {
                        System.out.println("It's just not");
                    }
                    return;
                }
                default -> System.out.println("Enter valid number of the program");

            }

        }while(random == in.nextInt());

    }
}
