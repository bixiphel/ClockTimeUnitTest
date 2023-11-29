
/**
 * Name: Jack Allen (allen)
 * Course: CSCI 241 - Computer Science I
 * Section: 002
 * Assignment: 9
 *
 * Project/Class Description:
 * This project constructs a clock (default time is '00:00:00' or '12:00:00 A.M.') based on user input. It also
 * validates the data and updates the hour/minute/second as the clock is incremented with the advance() method. 
 *      Note: in the toString12() method, the time '00:00:00' will return as '12:00:00 A.M.' to match what a real
 * clock would say
 *
 * Known bugs:
 * (none)
 */

public class ClockTime {
    // instance variables - replace the example below with your own
    private int hour;
    private int minute;
    private int second;

    /** Default Constructor, sets all instance variable to 0 */
    public ClockTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    /** 3 parameter constructor */
    public ClockTime(int hour, int minute, int second) {
        // The following performs data validation for 'second'
        if(second > 59) {
            this.second = second % 60;
            minute += second / 60;
        } else if(second < 0) {
            this.second = 0 - second;
        } else {
            this.second = second;
        }
        // The following performs data validation for 'minute'
        if(minute > 59) {
            this.minute = minute % 60;
            hour += minute / 60;
        } else if(minute < 0) {
            this.minute = 0 - minute;
        } else {
            this.minute = minute;
        }
        // The following performs data validation for 'hour'
        if(hour > 23) {
            this.hour = hour % 24;
        } else if(hour < 0) {
            this.hour = 0 - hour;
        } else {
            this.hour = hour;
        }
    }

    /** Gets the number of hours */
    public int getHour() {
        return this.hour;
    }

    /** Gets the number of minutes */
    public int getMinute() {
        return this.minute;
    }

    /** Gets the number of seconds */
    public int getSecond() {
        return this.second;
    }

    /** Sets the number of hours */
    public void setHour(int hour) {
        if(hour > 23) {
            this.hour = hour % 24;
        } else if(hour < 0) {
            this.hour = 0 - hour;
        } else {
            this.hour = hour;
        }   
    }

    /** Sets the number of minutes*/
    public void setMinute(int minute) {
        if(minute > 59) {
            this.minute = minute % 60;
        } else if(minute < 0) {
            this.minute = 0 - minute;
        } else {
            this.minute = minute;
        } 
    }

    /** Sets the number of seconds */
    public void setSecond(int second) {
        if(second > 59) {
            this.second = second % 60;
        } else if(second < 0) {
            this.second = 0 - second;
        } else {
            this.second = second;
        }
    }

    /** Converts the values of the instance variables into a string representing the time in the 24-hour format */
    public String toString() {
        String hourString = "";
        String minuteString = "";
        String secondString = "";

        // Formats each variable so that it adds a '0' in the string before its value
        if(this.hour < 10)
            hourString = "0" + getHour();
        else
            hourString = "" + getHour();
        if(this.minute < 10)
            minuteString = "0" + this.minute;
        else
            minuteString = "" + this.minute;
        if(this.second < 10)
            secondString = "0" + this.second;
        else
            secondString = "" + this.second;

        return hourString + ":" + minuteString + ":" + secondString;
    }

    /** Converts the values of the instance variables into a string representing the time in the 12-hour (AM/PM) format */
    public String toString12() {
        String hourString = "";
        String minuteString = "";
        String secondString = "";
        String ampm = "";

        // Determines if 'A.M.' or 'P.M.' should be appended depending on the hour
        if(getHour() < 12) {
            hourString = getHour() % 24 + "";
            ampm = "A.M.";
        } else {
            ampm = "P.M.";
        }

        // Formats each variable so that it adds a '0' in the string before its value
        if(this.hour == 0)
            hourString = "12";
        else if(this.hour < 10)
            hourString = "0" + getHour();
        else
            hourString = "" + getHour();
        if(this.minute < 10)
            minuteString = "0" + this.minute;
        else
            minuteString = "" + this.minute;
        if(this.second < 10)
            secondString = "0" + this.second;
        else
            secondString = "" + this.second;

        return hourString + ":" + minuteString + ":" + secondString + " " + ampm;
    }

    /** Adds an inputted number of seconds to the clock */
    public void advance(int seconds) {
        // Calculates and converts the number of hours and minutes into the total number of seconds (which includes the instance variable 'second' and the inputted number of seconds) 
        long totalSeconds = 3600 * (getHour()) + 60 * (getMinute()) + getSecond() + seconds;
        setHour( (int) (totalSeconds / 3600) );
        setMinute( (int) ((totalSeconds / 60) % 60) );
        setSecond( (int) (totalSeconds % 60) );
    }

    /** Returns true if the instance clock's time matches an inputted clock's time */
    public boolean equals(ClockTime c2) {
        return c2.toString().equals(toString());
    }
}
