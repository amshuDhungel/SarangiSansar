public class Instrument{
    private static int instrumentID;
    private String instrumentName;
    private String CustomerName;
    private String CustomerMobileNo;
    private int PANNo;

// if a variable is assigned through constructor , you dont require get set method, other wise you set to assign value and get to display value.
    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
        Instrument.instrumentID += 1;
        this.CustomerName = "";
        this.CustomerMobileNo= "";
        this.PANNo = 0;

    } 
    public void setInstrumentID(int instrumentID){
        instrumentID++;
        Instrument.instrumentID = instrumentID;
    }
    
    public int getInstrumentID() {
        return Instrument.instrumentID;
    }
    public void setInstrumentName(String instrumentName) {
        
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName(){
        return instrumentName;
    }
    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerMobileNo(String CustomerMobileNo) {
        
        this.CustomerMobileNo = CustomerMobileNo;
    }
    public String getCustomerMobileNo(){
        return CustomerMobileNo;
    }
    public void setPANNo(int PANNo) {
        
        this.PANNo = PANNo;
    }
    public int getPANNo(){
        return PANNo;

    }

    public void display(){
        System.out.println("Name of the Instrument: "+ this.getInstrumentName());
        if (this.CustomerName != "" && this.CustomerMobileNo != "" && this.PANNo != 0){
            System.out.println("ID of the Instrument: "+ this.getInstrumentID());
            System.out.println("The name of the customer:"+ this.getCustomerName());
            System.out.println("The customer mobile number is:" + this.getCustomerMobileNo());
            System.out.println("The customer PAN no is" + this.getPANNo());
        }
        else{
            System.out.print("ID of the Instrument: " + this.getInstrumentID());
        }
    }
    public static void main(String[] args){
        Instrument a = new Instrument("Guitar");
        a.setInstrumentID(instrumentID);
        a.setCustomerName("Prakriti");
        a.setCustomerMobileNo("228-338-333");
        a.display();
        Instrument b = new Instrument("Drum ");
        b.display();

    }
    
  

}