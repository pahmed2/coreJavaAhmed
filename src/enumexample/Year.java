package enumexample;

public class Year {
    Months month;
    public Year (Months month){
        this.month = month;
    }

    public void taskToDo(){
        switch (month){
            case JANUARY:
                System.out.println("Starting month of January  Work...");
                break;
            case FEBRUARY:
                System.out.println("Starting month of Feb.  Work....");
                break;
            case MARCH:
                System.out.println("Starting  month of March  Work.....");
                break;
            case APRIL:
                System.out.println("Starting Month of April  Work.....");
                break;
            case MAY:
                System.out.println("Starting Month of May Work......");
                break;

        }
    }
}
