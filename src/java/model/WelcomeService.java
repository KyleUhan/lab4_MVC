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

    private Calendar currentTime;
    
    public WelcomeService(){
    }
    
    public String getTimeFrame(){
        /*Date d = new Date();
        d = currentTime.getInstance().getTime();*/
        DateTime dt = new DateTime();
        int hour = dt.getHourOfDay();
        String timeFrame = "";
        if(hour > 9){
           if(hour > 18){
               timeFrame = "P";
           }else{
               timeFrame = "NOON";
           }
        }else{
            timeFrame = "A";
        }
        return timeFrame + " " + hour ;
    }
    
    
    public String combineTimeName(String name){
        
        return "";
    }
}
