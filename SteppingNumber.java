package com.keyword;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter the Starting Limit: ");
        int startLimit = in.nextInt();
        System.out.print("Enter the Ending Limit: ");
        int endLimit = in.nextInt();
        int last = 0;
        for (int i = startLimit; i <= endLimit; i++)
        {
            int flag = 0;
            int number = i;
            int previousElement = -1;
            int lastDigit = number % 10;
            int firstDigit = 0, digitCounter = 0;
            int temp = number;
            while (temp > 0) {
                digitCounter++;
                temp /= 10;
            }
            if (digitCounter > 1)
            {
                while (number > 0)
                {
                    firstDigit = number;
                    last = number % 10;
                    if (previousElement != -1)
                    {
                        if (Math.abs(last - previousElement) != 1)
                        {
                            flag = 1;
                            break;
                        }
                    }
                    number = number / 10;
                    previousElement = last;


                }
                if (flag == 0)
                {
                    if (Math.abs(firstDigit - lastDigit) == 1)
                    {
                        list.add(i);
                    }
                }
            }
            else
            {
                list.add(number);
            }
        }
        if (list.isEmpty())
        {
            System.out.println("No Stepping numbers. ");
        } else
        {
            System.out.println(list);
        }
    }

}

