/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author Kyle Uhan
 */
public class WelcomeService {

    final double MORNING_MAX = 10.5;
    final double AFTERNOON_MAX = 17.5;
    String timeFrame = "";
  
    public WelcomeService(){}
    
    public final String getTimeFrame(String name){
        if(name == null || name.isEmpty()){
            name = "Stranger";
        }
        DateTime dt = new DateTime();
        int hour = dt.getHourOfDay();
        if(hour > MORNING_MAX){
           timeFrame = hour > AFTERNOON_MAX ? "evening" : "afternoon";
        }else{
            timeFrame = "morning";
        }
        return combineTimeName(name,timeFrame);
    }
    
    private String combineTimeName(String name, String hour){
        name = name.trim();
        StringBuilder sb = new StringBuilder("Good ");
        sb.append(hour).append(", ").append(name).append(". Welcome!");
        return sb.toString();
    }
}
