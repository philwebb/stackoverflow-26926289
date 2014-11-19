package demo;

import org.joda.time.DateTime;

class Info{

   private DateTime dateTime;

    public Info(){
        dateTime = new DateTime();
    }
    public DateTime getDateTime() {
       return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
       this.dateTime = dateTime;
    }
}