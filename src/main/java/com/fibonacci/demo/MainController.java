package com.fibonacci.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {


    @RequestMapping("/")
    public String fibonacci(HttpServletRequest param)

    {
        String number = param.getParameter("number");
        if (number == null){
            return "Enter a valid number. Example: http://localhost:8080/?number=20";
        }

        int inputNum = Integer.parseInt(number);
        int num_1 = Integer.parseInt(number) - 1;
        int num_2 = Integer.parseInt(number) - 2;
        int num_3 = Integer.parseInt(number) - 3;
        int num_4 = 0;
        String storedNums = "";

        int fibNum = Integer.parseInt(number) + num_1 + num_2 + num_3;
        String listOfFibNums = "";

        do   {


           // System.out.println(inputNum);
            fibNum = Integer.parseInt(number) + num_1 + num_2 + num_3;

            listOfFibNums += fibNum;

            //inputNum = fibNum;
            int newNum = num_4 + num_3;

            num_1 = num_2;
            num_2 = num_3;
            num_3 = num_4;
            num_4 = newNum;


                 }
        while (inputNum == fibNum);



        return number + " " + fibNum + " " + listOfFibNums + "" + "(" + num_1 + " " + num_2 + " " + num_3 ;

    }

}



