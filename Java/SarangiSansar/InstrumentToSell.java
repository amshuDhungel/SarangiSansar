public class InstrumentToSell extends Instrument {
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;

    public InstrumentToSell(String instrumentName, int price) {
        super(instrumentName);
        this.price = price;  
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    // setter method or mutator method
    public void setPrice(int price) {
        if (this.isSold == false) {
            this.price = price;
        } else {
            System.out.println("There is not possible way to chage the price");
        }
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setDiscoundPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    // getter method or accessor method
    public int getPrice() {
        return this.price;
    }

    public String getSellDate() {
        return this.sellDate;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public boolean getIssold() {
        return this.isSold;
    }

    public void sell(String customerName, String customerPhoneNumber, int PAN, String sellDate,
            int discountPercent) {
        if (isSold == true) {
            System.out.println("It is already sold.");
            System.out.println("The name of the customer is " + customerName);
            System.out.println("The phone number of the customer is " + customerPhoneNumber);
            System.out.println("The selling date to the customer is " + sellDate);
            System.out.println("The PAN no  of the customer is " + PAN);
        } else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNo(customerPhoneNumber);
            super.setPANNo(PAN);
            this.discountPercent = discountPercent;
            this.sellDate = sellDate;
            this.isSold = true;
        }
    }

    public void display() {
        super.display();
        if (isSold == true) {
            double discountP = this.discountPercent;
            double priceWithout = this.price;
            double discountAmount = (priceWithout*discountP)/100;
            double totalPriceWithDiscount = priceWithout - discountAmount;
            System.out.println("The customer name is " + super.getCustomerName());
            System.out.println("The customer phone number is " + super.getCustomerMobileNo());
            System.out.println("The date of sell is " + this.sellDate);
            System.out.println("The price of the instrument with discount is " + totalPriceWithDiscount);
        }
    }

}