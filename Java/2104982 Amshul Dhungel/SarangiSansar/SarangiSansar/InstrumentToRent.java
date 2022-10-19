public class InstrumentToRent extends Instrument {
    int chargePerDay;
    String dateOfRent;
    int noOfDays;
    boolean isRented;
    String dateOfReturn;

    public InstrumentToRent(String InstrumentName, int chargePerDay){
        super(InstrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }
//getter and setter
    public void setChargePerDay(int chargePerDay){
        this.chargePerDay= chargePerDay;

    }

    public int getChargePerDay(){
        return this.chargePerDay;
    }

    public void setdateOfRent(String dateOfRent){
        this.dateOfRent= dateOfRent;
    }

    public String getdateOfRent(){
       return this.dateOfRent;
    }

    public void setdateOfReturn(String dateOfReturn){
        this.dateOfReturn= dateOfReturn;
    }
    public String getdateOfReturn(){
        return this.dateOfReturn;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    public int noOfDays(){
        return this.noOfDays;
    }
    public void setIsRented(boolean IsRented){
        this.isRented= IsRented;
    }
    public boolean getIsRented(){
        return this.isRented;
    }

    //For checking whether the instrument  is rented or not

    public void rent(String CustomerName, String phone, int PANNo, String dateOfRent, String dateOfReturn, int noOfDays){
        if (isRented == true){
            System.out.println("Sorry, the instrument that you want is rented. Please come next time");
            System.out.println("The name of the customer is "+ CustomerName);
            System.out.println("The customer mobile number is: "+ phone);
            System.out.println("Customer will return it on "+ dateOfReturn);
        }
        else {
            super.setCustomerName(CustomerName);
            super.setCustomerMobileNo(phone);
            super.setPANNo(PANNo);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            System.out.println("Instrument is rented ");
            System.out.println("The customer details are as follow: ");
            System.out.println("The name of the customer is " + super.getCustomerName());
            System.out.println("The customer contact number is " + super.getCustomerMobileNo());
            System.out.println("The instrument was rented on " + this.dateOfRent);
            System.out.println("The no of days to return a instrument is " + this.noOfDays);
            System.out.println("The return date of instrument is " + this.dateOfReturn);
            System.out.println("The total charge of customer is " + this.noOfDays * this.chargePerDay);
        }
    }
    public void returnInstrument(){
        if(isRented==true){
            super.setCustomerName("");
            this.dateOfRent = "";
            this.dateOfReturn = "";
            this.noOfDays = 0;
            this.isRented = false; 
        }else{
            System.out.println("The instrument is not rented, from where you rent?, This is not our instruement!!");
        }
    }
    public void display() {
        super.display();
        if (isRented == true) {
            System.out.println("The renting date is " + super.getCustomerName());
            System.out.println("The customer phone number is " + super.getCustomerMobileNo());
            System.out.println("The date of rent is " + this.dateOfRent);
            System.out.println("The number of days to return a instrument is " + this.noOfDays);
            System.out.println("The return date of instrument is " + this.dateOfReturn);
        }
    }

    // public static void main(String[] args) {
    //     InstrumentToRent insR = new InstrumentToRent("piano", 20);
    //     insR.setChargePerDay(20);
    //     insR.setDateOfRent("2020-23-2");
    //     insR.setDateOfReturn("343-23-42");
    //     insR.setIsRented(false);
    //     insR.Display();
    //     insR.returnInstrument();
    //     insR.rent("Anil Bhandari" , "9898-802" , 131 , "2018-03-9" , "2018-03-25" , 16);
    // }


}