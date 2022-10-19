import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SarangiSansar {

    ArrayList<Instrument> instrumentList = new ArrayList<>();
    final static int EMPTY = -1;
    final static int INVALID = -2;
    int size = 1;
    String handler = " ";
    int exception = 1;
    private JFrame rent, sell, homePage;
    private JLabel Rentname, instrumentRentLabel, sellTitle, chargePday, Rentingname,
            customername, rentPhone, dateofrent, firta, rentdays, firtabaaaja, PAN,
            sellname, price, bechnesaman, seller, Sellphone, PANNo,
            dateOfSell,
            discount, welcome, returnlabel;
    private JTextField rentnameTF, chargePerDayTF, rentingnameTF, customernameTF, rentPhoneTF,
            rentdaysTF, firtabaajaTF, PANTF, sellnameTF, priceTF,
            bechnesamanTF,
            sellerTF, SellphoneTF, PANNoTF, discountTF;
    private JButton addBtn, RentBtn, returnBtn, displaybuttonRent, clearbuttonRent,
            bechne, rentBtn, displayBtnSell, clearBtn, cancel, frame1, frame2,
            Back;
    private JComboBox yea, month, day, barsa, mahina, din, dayS, monthS,
            yearS;
    public SarangiSansar() {

        // date, color and font
        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024"};
        Color hbtnColor = (Color.ORANGE);
        Font font1 = (new Font("DialogInput", Font.BOLD, 15));
        Font font2 = (new Font("DialogInput", Font.BOLD, 12));

        // Frame for Home
        homePage = new JFrame("Sarangi Sansar");
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.setLayout(null);
        homePage.setBounds(0, 0, 700, 700);
        homePage.setLocationRelativeTo(null);
        homePage.setBackground(Color.YELLOW);
        homePage.setResizable(false);
        homePage.setVisible(true);
        Container c = homePage.getContentPane();
        c.setBackground(Color.YELLOW);

        // making button in homepage for entering sell frame
        frame1 = new JButton("Go To Sell");
        frame1.setBounds(450, 200, 150, 35);
        frame1.setBackground(Color.ORANGE);
        frame1.setFont(font1);
        homePage.add(frame1);
        frame1.setFocusable(false);

        // ActionListner for frame1 Button
        frame1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                homePage.dispose();
                rent.dispose();

                sell.setVisible(true);
            }

        });

        // making button in homepage for entering rent frame
        frame2 = new JButton("Go To Rent");
        frame2.setBounds(20, 200, 150, 35);
        frame2.setBackground(Color.ORANGE);
        frame2.setFont(font1);
        homePage.add(frame2);
        frame2.setFocusable(false);

        // Actionlistner for frame2
        frame2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                homePage.dispose();
                sell.dispose();

                rent.setVisible(true);
            }

        });

        // Frame for Rent
        rent = new JFrame();
        rent.setTitle("SarangiSansar");
        rent.setLayout(null);
        rent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rent.setBounds(20, 20, 900, 820);
        rent.setResizable(false);
        rent.setVisible(false);
        rent.setLocationRelativeTo(null);
        Container f = rent.getContentPane();
        f.setBackground(Color.RED);


        // Title of This Frame
        instrumentRentLabel = new JLabel();
        instrumentRentLabel.setText("Instrument To Rent");
        instrumentRentLabel.setFont(font1);
        instrumentRentLabel.setBounds(220, 5, 300, 30);
        instrumentRentLabel.setBackground(Color.black);
        rent.add(instrumentRentLabel);
        
        // Add Instrument Name for Rent
        Rentname = new JLabel();
        Rentname.setText("Instrument Name");
        Rentname.setBounds(10, 40, 250, 25);
        Rentname.setFont(font2);
        rent.add(Rentname);

        JTextArea textArea = new JTextArea("Note: Please return the instrument in the particular time. You will be fine Rs.200 per day if you don't.");
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setBounds(10, 600,800,50);
        textArea.setBackground(Color.yellow);
        textArea.setWrapStyleWord(true);
        rent.add(textArea);

        JTextArea sansar2 = new JTextArea("Hamro     Sarangi     Sansar" + "\n" + "Contact no: 9820000010, 9842222221");
        sansar2.setFont(new Font("DialogInput", Font.BOLD, 26));
        sansar2.setLineWrap(true);
        sansar2.setBounds(100, 650,800,150);
        sansar2.setBackground(Color.RED);
        sansar2.setForeground(Color.yellow);
        sansar2.setWrapStyleWord(true);
        rent.add(sansar2);

        rentnameTF = new JTextField();
        rentnameTF.setBounds(200, 40, 150, 20);
        rentnameTF.setFont(font2);
        rent.add(rentnameTF);

        // Charge Per Day Detail in Rent
        chargePday = new JLabel();
        chargePday.setText("Charge Per Day");
        chargePday.setBounds(500, 40, 200, 25);
        chargePday.setFont(font2);
        rent.add(chargePday);

        chargePerDayTF = new JTextField();
        chargePerDayTF.setBounds(700, 40, 80, 20);
        chargePerDayTF.setFont(font2);
        rent.add(chargePerDayTF);

        // add to instrument button
        addBtn = new JButton("Book");
        addBtn.setBounds(350, 80, 100, 25);
        addBtn.setFocusPainted(false);
        addBtn.setBackground(Color.green);
        addBtn.setFont(font2);
        //actionlistner for booking rent 
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                addinstrumenttorentBtn();
            }
        });
        rent.add(addBtn);

        

        // Instrument name for rent creating
        Rentingname = new JLabel();
        Rentingname.setText("Instrument Name");
        Rentingname.setBounds(10, 180, 150, 25);
        Rentingname.setFont(font2);
        rent.add(Rentingname);

        rentingnameTF = new JTextField();
        rentingnameTF.setBounds(200, 180, 150, 20);
        rentingnameTF.setFont(font2);
        rent.add(rentingnameTF);

        // Adding Customer Detail For Rent that Instrument
        customername = new JLabel();
        customername.setText("Customer Name");
        customername.setBounds(10, 220, 150, 25);
        customername.setFont(font2);
        rent.add(customername);

        customernameTF = new JTextField();
        customernameTF.setBounds(200, 220, 150, 20);
        customernameTF.setFont(font2);
        rent.add(customernameTF);

        rentPhone = new JLabel();
        rentPhone.setText("Phone no");
        rentPhone.setBounds(10, 260, 200, 25);
        rentPhone.setFont(font2);
        rent.add(rentPhone);

        rentPhoneTF = new JTextField();
        rentPhoneTF.setBounds(200, 260, 150, 20);
        rentPhoneTF.setFont(font2);
        rent.add(rentPhoneTF);

        // Pan(Private Access Number) for Renting Instrument
        PAN = new JLabel();
        PAN.setText("PAN No");
        PAN.setBounds(10, 300, 200, 25);
        PAN.setFont(font2);
        rent.add(PAN);

        PANTF = new JTextField();
        PANTF.setBounds(200, 300, 150, 20);
        PANTF.setFont(font2);
        rent.add(PANTF);

        // Date Of Rent YYYY/MM/DD
        dateofrent = new JLabel();
        dateofrent.setText("Date of Rent");
        dateofrent.setBounds(10, 340, 200, 25);
        dateofrent.setFont(font2);
        rent.add(dateofrent);

        yea = new JComboBox<>(years);
        yea.setBounds(200, 340, 80, 20);
        yea.setFont(font2);
        rent.add(yea);

        month = new JComboBox<>(months);
        month.setBounds(310, 340, 80, 20);
        month.setFont(font2);
        rent.add(month);

        day = new JComboBox<>(days);
        rent.add(day);
        day.setBounds(400, 340, 80, 20);
        day.setFont(font2);

        // Instrument Returned Date
        firta = new JLabel();
        firta.setText("Return Date");
        firta.setBounds(10, 380, 200, 25);
        firta.setFont(font2);
        rent.add(firta);

        barsa = new JComboBox<>(years);
        barsa.setBounds(200, 380, 80, 20);
        barsa.setFont(font2);
        rent.add(barsa);

        mahina = new JComboBox<>(months);
        mahina.setBounds(310, 380, 80, 20);
        mahina.setFont(font2);
        rent.add(mahina);

        din = new JComboBox<>(days);
        din.setBounds(400, 380, 80, 20);
        din.setFont(font2);
        rent.add(din);
        

        // No of Days That Instrument is Rented For
        rentdays = new JLabel();
        rentdays.setText("No of Days");
        rentdays.setBounds(10, 420, 100, 25);
        rentdays.setFont(font2);
        rent.add(rentdays);
        

        rentdaysTF = new JTextField();
        rentdaysTF.setBounds(250, 420, 40, 20);
        rentdaysTF.setFont(font2);
        rent.add(rentdaysTF);

        rentdaysTF.setForeground(Color.BLUE.darker());
        rentdaysTF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent size) {
                rentdaysTF.setText("");
                rentdaysTF.setFont(font1);

            }
        });

        // rent Button For Handle Rent
        RentBtn = new JButton("Rent");
        RentBtn.setBounds(350, 420, 120, 25);
        RentBtn.setFocusPainted(false);
        RentBtn.setFont(font2);
        RentBtn.setBackground(Color.green);
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                addinstrumenttorentBtn();
            }
        });
        RentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                rentInstrument();
            }
        });
        rent.add(RentBtn);
        

        // Data for Returning That Instrument
        returnlabel = new JLabel();
        returnlabel.setText("Return Instrument");
        returnlabel.setBounds(220, 490, 250, 20);
        returnlabel.setFont(font1);
        rent.add(returnlabel);

        firtabaaaja = new JLabel();
        firtabaaaja.setText("Instrument Name");
        firtabaaaja.setBounds(10, 540, 250, 25);
        firtabaaaja.setFont(font2);
        rent.add(firtabaaaja);

        firtabaajaTF = new JTextField();
        firtabaajaTF.setBounds(200, 540, 150, 20);
        firtabaajaTF.setFont(font2);
        rent.add(firtabaajaTF);

        // Buttom for Return That Instrument
        returnBtn = new JButton("Return");
        returnBtn.setBounds(480, 540, 120, 25);
        returnBtn.setFocusPainted(false);
        returnBtn.setFont(font2);
        returnBtn.setBackground(Color.green);
        rent.add(returnBtn);
        returnBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent size){
                returnInstrument();
            }
        });

        // Back Button for Back in Home Frame
        cancel = new JButton("Cancel");
        cancel.setBounds(550, 180, 100, 25);
        cancel.setFont(font2);
        cancel.setBackground(Color.green);
        rent.add(cancel);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                homePage.setVisible(true);
                rent.dispose();
            }
        });
        cancel.setFocusPainted(false);

        // display for Displaying Data.
        displaybuttonRent = new JButton("Display");
        displaybuttonRent.setBounds(550, 220, 100, 25);
        displaybuttonRent.setFont(font2);
        displaybuttonRent.setBackground(Color.green);

        

        displaybuttonRent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                if (instrumentList.size() > 0) {
                    for (int exception = 0; exception < instrumentList.size(); exception++) {
                        if (instrumentList.get(exception) instanceof InstrumentToRent) {
                            InstrumentToRent obj = (InstrumentToRent) instrumentList.get(exception);
                            obj.display();
                        }
                    }
                } else {
                    System.out
                            .println("Please fill the rent form to display your record");
                }
            }
        });
        rent.add(displaybuttonRent);

        // clear Button for Clearing all Data from TextField
        clearbuttonRent = new JButton("Reset");
        clearbuttonRent.setBounds(550, 260, 100, 25);
        clearbuttonRent.setFocusPainted(false);
        clearbuttonRent.setFont(font2);
        clearbuttonRent.setBackground(Color.green);
        rent.add(clearbuttonRent);

        // Selling Frame for Add and sell Items
        sell = new JFrame();
        sell.setTitle("SarangiSansar");
        sell.setLayout(null);
        sell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sell.setBounds(0, 50, 900, 820);
        sell.setResizable(false);
        sell.setVisible(false);
        sell.setLocationRelativeTo(null);
        Container s = sell.getContentPane();
        s.setBackground(Color.green);

        JTextArea textArea1 = new JTextArea("Thank you for Visiting.");
        textArea1.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea1.setLineWrap(true);
        textArea1.setBounds(10, 600,800,50);
        textArea1.setBackground(Color.green);
        textArea1.setForeground(Color.RED);
        textArea1.setWrapStyleWord(true);
        sell.add(textArea1);

        JTextArea sansar = new JTextArea("Hamro     Sarangi     Sansar" + "\n" + "Contact no: 9820000010, 9842222221");
        sansar.setFont(new Font("DialogInput", Font.BOLD, 26));
        sansar.setLineWrap(true);
        sansar.setBounds(100, 650,800,150);
        sansar.setBackground(Color.green);
        sansar.setForeground(Color.RED);
        sansar.setWrapStyleWord(true);
        sell.add(sansar );

        sellTitle = new JLabel();
        sellTitle.setText("Instrument To Sell");
        sellTitle.setBounds(200, 10, 200, 20);
        sellTitle.setFont(font1);
        sellTitle.setBackground(Color.black);
        sell.add(sellTitle);

        // making instrumentname and textfield with price in sell frame
        sellname = new JLabel();
        sellname.setText("Instrument Name");
        sellname.setBounds(10, 40, 200, 25);
        sellname.setFont(font2);
        sell.add(sellname);
        

        sellnameTF = new JTextField();
        sellnameTF.setBounds(200, 40, 150, 25);
        sellnameTF.setFont(font2);
        sell.add(sellnameTF);

        // Price Of that Instrument
        price = new JLabel();
        price.setText("Price");
        price.setBounds(500, 40, 150, 25);
        price.setFont(font2);
        sell.add(price);

        priceTF = new JTextField();
        priceTF.setBounds(700, 40, 80, 25);
        priceTF.setFont(font2);
        sell.add(priceTF);

        // Instrument booking in sell frame button
        bechne = new JButton("Book");
        bechne.setBounds(350, 80, 100, 25);
        bechne.setFocusPainted(false);
        bechne.setFont(font2);
        bechne.setBackground(Color.yellow);
        bechne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                addInstrumentForSell();
            }
        });
        sell.add(bechne);

        // Instrument Detail For Sell Instrument
        bechnesaman = new JLabel();
        bechnesaman.setText("Instrument Name");
        bechnesaman.setBounds(10, 180, 150, 25);
        bechnesaman.setFont(font2);
        sell.add(bechnesaman);

        bechnesamanTF = new JTextField();
        bechnesamanTF.setBounds(200, 180, 150, 25);
        bechnesamanTF.setFont(font2);
        sell.add(bechnesamanTF);

        // Customer Detail of customer that buying Instrument
        seller = new JLabel();
        seller.setText("Customer Name");
        seller.setBounds(10, 220, 150, 25);
        seller.setFont(font2);
        sell.add(seller);

        sellerTF = new JTextField();
        sellerTF.setBounds(200, 220, 150, 25);
        sellerTF.setFont(font2);
        sell.add(sellerTF);

        Sellphone = new JLabel();
        Sellphone.setText("Phone NO");
        Sellphone.setBounds(10, 260, 200, 25);
        Sellphone.setFont(font2);
        sell.add(Sellphone);

        SellphoneTF = new JTextField();
        SellphoneTF.setBounds(200, 260, 150, 25);
        SellphoneTF.setFont(font2);
        sell.add(SellphoneTF);

        // PAN NO Detail of Sell
        PANNo = new JLabel();
        PANNo.setText("PAN No");
        PANNo.setBounds(10, 300, 200, 25);
        PANNo.setFont(font2);
        sell.add(PANNo);

        PANNoTF = new JTextField();
        PANNoTF.setFont(font2);
        PANNoTF.setBounds(200, 300, 150, 25);
        sell.add(PANNoTF);

        // Date of That Items Sold
        dateOfSell = new JLabel();
        dateOfSell.setText("Sell Date");
        dateOfSell.setBounds(10, 340, 200, 25);
        dateOfSell.setFont(font2);
        sell.add(dateOfSell);

        yearS = new JComboBox<>(years);
        yearS.setBounds(200, 340, 80, 20);
        yearS.setFont(font2);
        sell.add(yearS);

        monthS = new JComboBox<>(months);
        monthS.setBounds(310, 340, 80, 20);
        monthS.setFont(font2);
        sell.add(monthS);

        dayS = new JComboBox<>(days);
        dayS.setFont(font2);
        dayS.setBounds(400, 340, 80, 20);
        sell.add(dayS);

        // DIscount For That Instrument
        discount = new JLabel();
        discount.setText("Discount");
        discount.setBounds(10, 380, 200, 25);
        discount.setFont(font2);
        sell.add(discount);

        discountTF = new JTextField();
        discountTF.setBounds(200, 380, 100, 25);
        discountTF.setFont(font2);
        sell.add(discountTF);

        // sell Button FOr Handling Data
        rentBtn = new JButton("Sell");
        rentBtn.setFont(font2);
        rentBtn.setBounds(400, 380, 80, 25);
        rentBtn.setFocusPainted(false);
        rentBtn.setBackground(Color.yellow);
        rentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                sellInstrument();
            }
        });
        sell.add(rentBtn);

        // Back Button To go Back in Home Page
        Back = new JButton("Cancel");
        Back.setFont(font2);
        Back.setBounds(550, 200, 100, 25);
        Back.setBackground(Color.yellow);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                rent.dispose();
                sell.dispose();
                homePage.setVisible(true);
            }
        });
        sell.add(Back);

        // display handler for sell
        displayBtnSell = new JButton("Display");
        displayBtnSell.setBounds(550, 240, 100, 25);
        displayBtnSell.setFocusPainted(false);
        displayBtnSell.setFont(font2);
        displayBtnSell.setBackground(Color.yellow);
        displayBtnSell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent size) {
                if (instrumentList.size() > 0) {
                    for (int exception = 0; exception < instrumentList.size(); exception++) {
                        if (instrumentList.get(exception) instanceof InstrumentToSell) {
                            InstrumentToSell objS = (InstrumentToSell) instrumentList.get(exception);
                            objS.display();
                        }
                    }
                } else {
                    System.out.println("Don't leave the field empty");
                }
            }
        });
        sell.add(displayBtnSell);

        // clear handler for sell
        clearBtn = new JButton("Reset");
        clearBtn.setBounds(550, 280, 100, 25);
        clearBtn.setFocusPainted(false);
        clearBtn.setBackground(Color.yellow);
        clearBtn.setFont(font2);
        sell.add(clearBtn);

        sell.setVisible(false);
        rent.setVisible(false);
        homePage.setVisible(true);
    }


    public static void main(String[] args) {
        new SarangiSansar();
    }
    // add to instrument handler of Rent
    public void addinstrumenttorentBtn() {
        String instrumentName = getInstrumentRentName();
        int chargePerDay = getChargePerDay();
        boolean isUnique = true;
        // negative
        if (size == 2) {
            size = 1;
            return;
        }
        // invalid
        if (handler == "invalid") {
            handler = " ";
            return;
        }
        if (instrumentName.isEmpty() || chargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(rent, "Please don't leave empty fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int exception = 0; exception < instrumentList.size(); exception++) {
            if (instrumentList.get(exception).getInstrumentName().toLowerCase().equals(rentingnameTF.getText().trim().toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(rent, "Instrument Name must be unique", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if (isUnique && chargePerDay != INVALID) {
            instrumentList.add(new InstrumentToRent(instrumentName, chargePerDay));
            JOptionPane.showMessageDialog(rent, "Instrument Name: " + getInstrumentRentName() + "\n" + "Amount: " + getChargePerDay() + "\n" + "Booked");
        }

    }
    // instrument name of Rent
    public String getInstrumentRentName() {
        return rentnameTF.getText().trim();
    }
    // charge per day of Rent
    public int getChargePerDay() {
        String chargePerDayText = chargePerDayTF.getText().trim();
        int chargePerDay = INVALID;
        if (chargePerDayText.isEmpty()) {
            chargePerDay = EMPTY;
            return chargePerDay;
        }
        try {
            chargePerDay = Integer.parseInt(chargePerDayText);
            if (chargePerDay <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number for charge", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                chargePerDay = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "charge Per day is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return chargePerDay;
    }
    // After Adding Now, Rent the instrument
    public void rentInstrument() {
        String instrumentToRentText = rentingnameTF.getText().trim();
        String customerNameRentText = customernameTF.getText().trim();
        String phoneText = rentPhoneTF.getText().trim();
        int panText = getpan();
        String dateofrent = yea.getSelectedItem().toString() + " " +
                month.getSelectedItem().toString() + " "
                + day.getSelectedItem().toString();
        String firta = barsa.getSelectedItem().toString() + " " +
                mahina.getSelectedItem().toString() + " "
                + din.getSelectedItem().toString();
        int rentedNoOfDaysText = getrenttime();
        boolean isUnique = true;
        if (instrumentToRentText.isEmpty() || panText == EMPTY || rentedNoOfDaysText == EMPTY
                || customerNameRentText.isEmpty()
                || phoneText.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please don't leave empty text field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (size == 2) { //negative and invalid
            size = 1;
            return;
        }
        if (handler == "invalid") {
            handler = " ";
            return;
        }
        if (instrumentList.size() > 0) {
            for (int exception = 0; exception < instrumentList.size(); exception++) {
                if (instrumentList.get(exception).getInstrumentName().toLowerCase()
                        .equals(instrumentToRentText.toLowerCase())) {
                    if (instrumentList.get(exception) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(exception);
                        if (obj.getIsRented()) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(rent, "Instrument is rented already. Come Next time",
                                    "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        obj.rent(customerNameRentText, phoneText, panText, dateofrent,
                                firta,
                                rentedNoOfDaysText);
                        isUnique = false;
                        obj.setIsRented(true);
                        JOptionPane.showMessageDialog(rent, "Instrument Name: " + getInstrumentRentName() +"\n"+ "Date: " + dateofrent + "-" + firta + "\n" + "\n" + "Customer Name: " + customerNameRentText + "Status: Rented" );

                        break;

                    }
                }
            }
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(rent, "Sorry, Not found,", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    // get pan no of That instrument in Rent
    public int getpan() {
        int panNo = INVALID;
        if (PANTF.getText().trim().isEmpty()) {
            panNo = EMPTY;
            return panNo;
        }
        try {
            panNo = Integer.parseInt(PANTF.getText().trim());
            if (panNo <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number pan number",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNo = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return panNo;
    }
    // get no of day to be Rented
    public int getrenttime() {
        int rentdays = INVALID;
        if (rentdaysTF.getText().trim().isEmpty()) {
            rentdays = EMPTY;
            return rentdays;
        }
        try {
            rentdays = Integer.parseInt(rentdaysTF.getText().trim());
            if (rentdays <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid postive number for number of days",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                rentdays = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "Number of Days is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return rentdays;
    }
    // return instrument handler
    public void returnInstrument() {
        String instrumentName = firtabaajaTF.getText().trim();
        boolean moreThanZero = false;
        if (instrumentName.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please don't leave empty field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (instrumentList.size() > 0) {
            for (int exception = 0; exception < instrumentList.size(); exception++) {
                if (instrumentList.get(exception).getInstrumentName().toLowerCase()
                        .equals(instrumentName.toLowerCase())) {
                    if (instrumentList.get(exception) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(exception);
                        if (obj.getIsRented() == false) {
                            JOptionPane.showMessageDialog(rent, "Instrument Name: " + getInstrumentRentName() + "\n" + "Status: Not Rented",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            moreThanZero = true;
                            return;
                        }
                        obj.returnInstrument();
                        JOptionPane.showMessageDialog(rent, "\n" + "Instrument Name: " + getInstrumentRentName() + "\n" + "Returned");
                        obj.setIsRented(false);
                        moreThanZero = true;
                        break;

                    }
                }
            }
            if (moreThanZero == false) {
                JOptionPane.showMessageDialog(rent, "Sorry, Not found.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // clear Data in Rent Frame
    public void clearRent() {
        rentnameTF.setText("");
        chargePerDayTF.setText("");
        rentingnameTF.setText("");
        customernameTF.setText("");
        rentPhoneTF.setText("");
        PANTF.setText("");
        rentdaysTF.setText("");
        firtabaajaTF.setText("");
    }

    // add to instrument handler for Sell
    public void addInstrumentForSell() {
        String sellInstrument = getInstrumentSellName();
        int price = getPrice();
        boolean isUnique = true;
        if (size == 2) { //negative and invalid
            size = 1;
            return;
        }
        if (handler == "invalid") {
            handler = " ";
            return;
        }
        if (sellnameTF.getText().trim().isEmpty() || price == EMPTY) {
            JOptionPane.showMessageDialog(rent, "Please don't leave empty field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int exception = 0; exception < instrumentList.size(); exception++) {
            if (instrumentList.get(exception).getInstrumentName().toLowerCase().equals(sellnameTF.getText().trim().toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(rent, "Instrument Name must be unique",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if (isUnique && price != INVALID) {
            instrumentList.add(new InstrumentToSell(sellnameTF.getText().trim(), price));
            JOptionPane.showMessageDialog(rent, "Instrument Name: " + sellInstrument + "\n" + "Price:" + price + "Status : Booked");
        }
    }
    public String getInstrumentSellName(){
        return sellnameTF.getText().trim();
    }

    // Instrument price for sell
    public int getPrice() {
        // empty -1 //invalid -2
        int price = INVALID;
        if (priceTF.getText().trim().isEmpty()) {
            price = EMPTY;
            return price;
        }
        try {
            price = Integer.parseInt(priceTF.getText().trim());
            if (price <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number for price",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                price = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "Price is  invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return price;
    }
    
    // Selling That instrument
    public void sellInstrument() {
        String instrumentToSellText = bechnesamanTF.getText().trim();
        String customerNameForSellText = sellerTF.getText().trim();
        String customerPhoneText = SellphoneTF.getText().trim();
        int customerPanText = getPanNoSell();
        String dateOfSell = dayS.getSelectedItem().toString() + " " +
                monthS.getSelectedItem().toString() + " "
                + yearS.getSelectedItem().toString();
        int discount = getDiscountPercent();
        boolean isUnique = true;
        if (instrumentToSellText.isEmpty() || customerPanText == EMPTY ||
                discount == EMPTY
                || customerNameForSellText.isEmpty()
                || customerPhoneText.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please don't leave empty field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        // negative and invalid
        if (size == 2) {
            size = 1;
            return;
        }
        if (handler == "invalid") {
            handler = " ";
            return;
        }
        if (instrumentList.size() > 0) {
            for (int exception = 0; exception < instrumentList.size(); exception++) {
                if (instrumentList.get(exception).getInstrumentName().toLowerCase()
                        .equals(instrumentToSellText.toLowerCase())) {
                    if (instrumentList.get(exception) instanceof InstrumentToSell) {
                        InstrumentToSell objS = (InstrumentToSell) instrumentList.get(exception);
                        if (objS.getIssold() == true) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(rent, "Sorry, Instrument is rented already", "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        isUnique = false;
                        objS.sell(customerNameForSellText, customerPhoneText,
                                customerPanText,
                                dateOfSell,
                                discount);
                        objS.setIsSold(true);
                        JOptionPane.showMessageDialog(rent, "Instrument Name: " + instrumentToSellText + "\n" + "Date of Sell" + dateOfSell + "\n" + "Status: Sold" , "INFORMATION",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
            }
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(rent, "Sorry, Not found", "MESSAGE",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // PAN detail validation for Sell
    public int getPanNoSell() {
        String panNoSellText = PANNoTF.getText().trim();
        int panNoSell = INVALID;
        if (panNoSellText.isEmpty()) {
            panNoSell = EMPTY;
            return panNoSell;
        }
        try {
            panNoSell = Integer.parseInt(panNoSellText);
            if (panNoSell <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number for pan number",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNoSell = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "PAN NO. is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return panNoSell;
    }
    // discount percent FOr That Instrument
    public int getDiscountPercent() {
        String discountPercentText = discountTF.getText().trim();
        int discount = INVALID;
        if (discountPercentText.isEmpty()) {
            discount = EMPTY;
            return discount;
        }
        try {
            discount = Integer.parseInt(discountPercentText);
            if (discount <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter valid positive number for discount", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                discount = INVALID;
                size = 2;
            }
        } catch (NumberFormatException size) {
            JOptionPane.showMessageDialog(rent,
                    "Discount Percent is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            handler = "invalid";
        }
        return discount;
    }
    // clear Data in Sell Frame
    public void clearSell() {
        sellnameTF.setText("");
        priceTF.setText("");
        bechnesamanTF.setText("");
        sellerTF.setText("");
        SellphoneTF.setText("");
        PANNoTF.setText("");
        discountTF.setText("");
    }

}