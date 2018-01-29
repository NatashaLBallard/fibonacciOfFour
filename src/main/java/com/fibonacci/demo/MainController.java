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


        String fibNums = "";



        return number + " "+  Integer.valueOf(num_1) + " "+  Integer.valueOf(num_2) + " "+   Integer.valueOf(num_3);

    }

}



