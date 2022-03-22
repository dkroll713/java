public class Invoice {
    private int invoiceNum;
    private double balanceDue;
    private int day;
    private int month;
    private int year;

    public Invoice(int invoiceNum, double balanceDue, int day, int month, int year){
        if (invoiceNum<1000){
            this.invoiceNum=0;
        }else{
            this.invoiceNum=invoiceNum;
        }
        if(month<1||month>12){
            this.month=0;
        }else{
            this.month=month;
        }
        if(day<1||day>31){
            this.day=0;
        }else{
            this.day=day;
        }
        if(year<2011||year>2025){
            this.year=0;
        }else{
            this.year=year;
        }
        this.balanceDue=balanceDue;
    }
    public void display(){
            System.out.print("Invoice # "+invoiceNum+" is for: "+balanceDue+". It is dated "+month+" "+day+" "+year);
    }
}

