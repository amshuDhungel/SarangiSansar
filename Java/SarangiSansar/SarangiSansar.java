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
    int num = 1;
    String str = " ";
    int integer = 1;

    private JCheckBox adddarkmode, adddarkmode2, adddarkmode3;

    private JFrame rent, sell, homePage;

    private JPanel addInstrumenttorentpanel, sellpanel1, rentpanel, rentpanel2, returnPanel, addInstrumentSell, sellPanel,
            subPanel6, homepanel;
    private JLabel Rentname, instrumentRentLabel, sellTitle, chargePday, Rentingname,
            customername, rentPhone, dateofrent, dateofreturn, noOfDaysrented, returnofinstrumentName, PAN,
            SellName, price, instrumenttosellName, customernameSell, Sellphone, PANNo,
            dateOfSell,
            discountPercent, welcome, returnlabel;
    private JTextField rentnameTF, chargePerDayTF, rentingnameTF, customernameTF, rentPhoneTF,
            noOfDaysrentedTF, returnofinstrumentNameTF, PANTF, SellNameTF, priceTF,
            instrumenttosellNameTF,
            customernameSellTF, SellphoneTF, PANNoTF, discountPercentTF;
    private JButton addBtn, RentBtn, returnBtn, displaybuttonRent, clearbuttonRent,
            addToSellInstrument, rentBtn, displayBtnSell, clearBtn, Back2, frame1, frame2,
            Back;
    private JComboBox noOfDays, noOfMonths, noOfYear, noOfDaysreturn, noOfMonthsReturn, noOfYearReturn, dayS, monthS,
            yearS;

    public SarangiSansar() {

        // date
        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024", "2025", "2026" };

        // color
        Color panelColoring = (Color.WHITE);
        Color buttonColoring = (Color.WHITE);
        Color btnText = new Color(0, 0, 0);

        // font
        Font font1 = (new Font("Arial", Font.BOLD, 20));

        // Frame for Home
        homePage = new JFrame("Sarangi Sansar");
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.setLayout(null);
        homePage.setBounds(0, 0, 690, 500);
        homePage.setLocationRelativeTo(null);
        homePage.setBackground(Color.BLACK);
        homePage.setResizable(false);
        homePage.setVisible(true);
        // homePage.setAlwaysOnTop(true);

        // HOME Panel
        homepanel = new JPanel();
        homepanel.setBounds(0, 0, 700, 500);
        homepanel.setLayout(null);
        homepanel.setBackground(Color.WHITE);
        homePage.add(homepanel);

        adddarkmode = new JCheckBox("Dark Mode");
        adddarkmode.setBounds(50, 0, 150, 45);
        adddarkmode.setFocusable(false);
        adddarkmode.setBackground(panelColoring);
        adddarkmode.setFont(new Font("Arial", Font.PLAIN, 10));
        homepanel.add(adddarkmode);

        adddarkmode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {

                if (integer % 2 == 0) {
                    homepanel.setBackground(Color.WHITE);
                    welcome.setForeground(Color.BLACK);
                    adddarkmode.setBackground(panelColoring);

                    integer = integer + 1;
                } else {
                    homepanel.setBackground(new Color(38,34,34));
                    adddarkmode.setBackground(Color.WHITE);
                    welcome.setForeground(Color.WHITE);
                    integer = integer + 1;

                }
            }

        });

        // Welcome Text
        welcome = new JLabel("-----Sarangi Sansar-----");
        welcome.setFont(new Font("Arial", Font.BOLD, 30));

        welcome.setBounds(190, 50, 600, 30);

        homepanel.add(welcome);

        // Button for go to Sell Frame
        frame1 = new JButton("Go To Sell");
        frame1.setFont(new Font("Arial", Font.BOLD, 25));
        frame1.setBounds(250, 200, 200, 45);
        homepanel.add(frame1);
        frame1.setFocusable(false);
        frame1.setBackground(buttonColoring);
        frame1.setForeground(btnText);
        frame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        // ActionListner for frame1 Button
        frame1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                homePage.dispose();
                rent.dispose();

                sell.setVisible(true);
            }

        });

        // Go to Rent Button
        frame2 = new JButton("Go To Rent");
        frame2.setFont(new Font("Arial", Font.BOLD, 25));
        frame2.setBounds(250, 280, 200, 45);
        homepanel.add(frame2);
        frame2.setFocusable(false);

        frame2.setBackground(buttonColoring);
        frame2.setForeground(btnText);

        // Hover Effect for This Button
        frame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        // Actionlistner for frame2
        frame2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
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
        rent.setBounds(20, 20, 690, 820);
        rent.setResizable(false);
        rent.setVisible(false);
        rent.setLocationRelativeTo(null);

        adddarkmode2 = new JCheckBox("Dark Mode");
        adddarkmode2.setBounds(50, 0, 150, 45);
        adddarkmode2.setFocusable(false);
        adddarkmode2.setBackground(Color.DARK_GRAY);
        adddarkmode2.setFont(new Font("Arial", Font.PLAIN, 12));
        rent.add(adddarkmode2);

        adddarkmode2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {

                if (integer % 2 == 0) {
                    addInstrumenttorentpanel.setBackground(Color.WHITE);
                    rentpanel.setBackground(new Color(255, 227, 235));
                    rentpanel2.setBackground(new Color(255, 227, 235));
                    returnPanel.setBackground(new Color(255, 227, 235));
                    instrumentRentLabel.setForeground(Color.BLACK);
                    returnlabel.setForeground(Color.BLACK);
                    adddarkmode2.setBackground(Color.DARK_GRAY);
                    integer = integer + 1;
                } else {
                    addInstrumenttorentpanel.setBackground(new Color(38,34,34));
                    rentpanel.setBackground(new Color(100, 102, 110));
                    rentpanel2.setBackground(new Color(100, 102, 110));
                    returnPanel.setBackground(new Color(100, 102, 110));
                    adddarkmode2.setBackground(Color.WHITE);
                    instrumentRentLabel.setForeground(Color.WHITE);
                    returnlabel.setForeground(Color.WHITE);
                    integer = integer + 1;

                }
            }

        });

        // Panel for Instrument To Rent (Main Panel)
        addInstrumenttorentpanel = new JPanel();
        addInstrumenttorentpanel.setBounds(0, 50, 690, 770);
        addInstrumenttorentpanel.setLayout(null);
        addInstrumenttorentpanel.setBackground(panelColoring);
        rent.add(addInstrumenttorentpanel);

        // Title of This Frame
        instrumentRentLabel = new JLabel();
        instrumentRentLabel.setText("Instrument To Rent");
        instrumentRentLabel.setFont(font1);
        instrumentRentLabel.setBounds(220, 5, 300, 30);
        instrumentRentLabel.setBackground(Color.black);
        addInstrumenttorentpanel.add(instrumentRentLabel);

        // Panel for add Instrument for Rent (Secondary Panel/Sub Panel)
        rentpanel = new JPanel();
        rentpanel.setBounds(10, 40, 660, 140);
        rentpanel.setLayout(null);
        addInstrumenttorentpanel.add(rentpanel);

        // Add Instrument Name for Rent
        Rentname = new JLabel();
        Rentname.setText("Instrument Name");
        Rentname.setFont(new Font("Arial", Font.BOLD, 20));
        Rentname.setBounds(10, 10, 250, 25);
        rentpanel.add(Rentname);

        rentnameTF = new JTextField();
        rentnameTF.setBounds(250, 10, 400, 35);
        rentnameTF.setFont(font1);
        rentpanel.add(rentnameTF);
        // rentnameTF.setForeground(Color.BLUE.darker());

        // rentnameTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // rentnameTF.setText("");
        // rentnameTF.setFont(font1);

        // }
        // });

        // Charge Per Day Detail in Rent
        chargePday = new JLabel();
        chargePday.setText("Charge Per Day");
        chargePday.setFont(new Font("Arial", Font.BOLD, 20));
        chargePday.setBounds(10, 50, 250, 25);
        rentpanel.add(chargePday);

        chargePerDayTF = new JTextField();
        chargePerDayTF.setBounds(250, 50, 400, 35);
        chargePerDayTF.setFont(font1);
        rentpanel.add(chargePerDayTF);

        // chargePerDayTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // chargePerDayTF.setText("");
        // chargePerDayTF.setFont(font1);

        // }
        // });

        // add to instrument button
        addBtn = new JButton("Add");
        addBtn.setBounds(250, 95, 200, 35);
        addBtn.setFocusPainted(false);
        addBtn.setFont(new Font("Arial", Font.BOLD, 20));
        addBtn.setBackground(buttonColoring);
        addBtn.setForeground(btnText);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        // addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent num) {
        // JButton hover = (JButton) num.getSource();
        // hover.setBackground(Color.RED);
        // // hover.setSize(250, 45);
        // }
        // public void mouseExited(java.awt.event.MouseEvent num) {
        // JButton hover = (JButton) num.getSource();
        // hover.setBackground(buttonColoring);
        // // hover.setSize(200, 35);

        // }
        // });

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {

            }
        });
        rentpanel.add(addBtn);

        // sub panel 2 /Secondary Panel for Renting Instrument

        rentpanel2 = new JPanel();
        rentpanel2.setBounds(10, 190, 660, 350);
        rentpanel2.setLayout(null);
        addInstrumenttorentpanel.add(rentpanel2);

        // Now Renting Instrument
        Rentingname = new JLabel();
        Rentingname.setText("Instrument Name");
        Rentingname.setBounds(10, 20, 250, 25);
        rentpanel2.add(Rentingname);
        Rentingname.setFont(new Font("Arial", Font.BOLD, 20));

        rentingnameTF = new JTextField();
        rentingnameTF.setBounds(250, 20, 400, 35);
        rentingnameTF.setFont(font1);
        rentpanel2.add(rentingnameTF);

        // rentingnameTF.setForeground(Color.BLUE.darker());
        // rentingnameTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // rentingnameTF.setText("");
        // rentingnameTF.setFont(font1);

        // }
        // });
        // Adding Customer Detail For Rent that Instrument
        customername = new JLabel();
        customername.setText("Customer Name");
        customername.setBounds(10, 60, 200, 25);
        rentpanel2.add(customername);
        customername.setFont(new Font("Arial", Font.BOLD, 20));

        customernameTF = new JTextField();
        customernameTF.setBounds(250, 60, 400, 35);
        customernameTF.setFont(font1);

        rentpanel2.add(customernameTF);

        // customernameTF.setForeground(Color.BLUE.darker());
        // customernameTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // customernameTF.setText("");
        // customernameTF.setFont(font1);

        // }
        // });

        rentPhone = new JLabel();
        rentPhone.setText("Phone no");
        rentPhone.setBounds(10, 100, 200, 25);
        rentpanel2.add(rentPhone);
        rentPhone.setFont(new Font("Arial", Font.BOLD, 20));

        rentPhoneTF = new JTextField();
        rentPhoneTF.setBounds(250, 100, 400, 35);
        rentPhoneTF.setFont(font1);

        rentpanel2.add(rentPhoneTF);

        // rentPhoneTF.setForeground(Color.BLUE.darker());
        // rentPhoneTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // rentPhoneTF.setText("");
        // rentPhoneTF.setFont(font1);

        // }
        // });

        // Pan(Private Access Number) for Renting Instrument
        PAN = new JLabel();
        PAN.setText("PAN No");
        PAN.setBounds(10, 140, 200, 25);
        rentpanel2.add(PAN);
        PAN.setFont(new Font("Arial", Font.BOLD, 20));

        PANTF = new JTextField();
        PANTF.setBounds(250, 140, 400, 35);
        PANTF.setFont(font1);

        rentpanel2.add(PANTF);

        // PANTF.setForeground(Color.BLUE.darker());
        // PANTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // PANTF.setText("");
        // PANTF.setFont(font1);

        // }
        // });

        // Date Of Rent YYYY/MM/DD
        dateofrent = new JLabel();
        dateofrent.setText("Date of Rent");
        dateofrent.setBounds(10, 180, 200, 25);
        rentpanel2.add(dateofrent);
        dateofrent.setFont(new Font("Arial", Font.BOLD, 20));

        noOfDays = new JComboBox<>(days);
        noOfDays.setBounds(520, 180, 100, 30);
        rentpanel2.add(noOfDays);
        noOfDays.setFont(new Font("Arial", Font.BOLD, 20));

        noOfMonths = new JComboBox<>(months);
        noOfMonths.setBounds(360, 180, 150, 30);
        rentpanel2.add(noOfMonths);
        noOfMonths.setFont(new Font("Arial", Font.BOLD, 20));

        noOfYear = new JComboBox<>(years);
        rentpanel2.add(noOfYear);
        noOfYear.setBounds(250, 180, 100, 30);
        noOfYear.setFont(new Font("Arial", Font.BOLD, 20));

        // Instrument Returned Date
        dateofreturn = new JLabel();
        dateofreturn.setText("Date of Return");
        dateofreturn.setBounds(10, 220, 200, 25);
        rentpanel2.add(dateofreturn);
        dateofreturn.setFont(new Font("Arial", Font.BOLD, 20));

        noOfDaysreturn = new JComboBox<>(days);
        noOfDaysreturn.setBounds(520, 220, 100, 30);
        rentpanel2.add(noOfDaysreturn);
        noOfDaysreturn.setFont(new Font("Arial", Font.BOLD, 20));

        noOfMonthsReturn = new JComboBox<>(months);
        noOfMonthsReturn.setBounds(360, 220, 150, 30);
        rentpanel2.add(noOfMonthsReturn);
        noOfMonthsReturn.setFont(new Font("Arial", Font.BOLD, 20));

        noOfYearReturn = new JComboBox<>(years);
        noOfYearReturn.setBounds(250, 220, 100, 30);
        rentpanel2.add(noOfYearReturn);
        noOfYearReturn.setFont(new Font("Arial", Font.BOLD, 20));

        // No of Days That Instrument is Rented For
        noOfDaysrented = new JLabel();
        noOfDaysrented.setText("No of Days");
        noOfDaysrented.setBounds(10, 260, 200, 25);
        rentpanel2.add(noOfDaysrented);
        noOfDaysrented.setFont(new Font("Arial", Font.BOLD, 20));

        noOfDaysrentedTF = new JTextField();
        noOfDaysrentedTF.setBounds(250, 260, 400, 35);
        noOfDaysrentedTF.setFont(font1);

        rentpanel2.add(noOfDaysrentedTF);

        noOfDaysrentedTF.setForeground(Color.BLUE.darker());
        noOfDaysrentedTF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent num) {
                noOfDaysrentedTF.setText("");
                noOfDaysrentedTF.setFont(font1);

            }
        });

        // rent Button For Handle Rent
        RentBtn = new JButton("Rent");
        RentBtn.setBounds(250, 300, 200, 35);
        RentBtn.setFocusPainted(false);
        RentBtn.setFont(new Font("Arial", Font.BOLD, 20));
        RentBtn.setBackground(buttonColoring);
        RentBtn.setForeground(btnText);
        RentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                addinstrumenttorentBtn();
            }
        });

        RentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                rentInstrument();
            }
        });

        rentpanel2.add(RentBtn);

        // Return Panel For Return That Instrument(SubPanel)
        returnPanel = new JPanel();
        returnPanel.setBounds(10, 570, 660, 100);
        returnPanel.setLayout(null);
        addInstrumenttorentpanel.add(returnPanel);

        // Data for Returning That Instrument
        returnlabel = new JLabel();
        returnlabel.setText("Return Instrument");
        returnlabel.setBounds(250, 542, 250, 20);
        addInstrumenttorentpanel.add(returnlabel);
        returnlabel.setFont(new Font("Arial", Font.BOLD, 20));

        returnofinstrumentName = new JLabel();
        returnofinstrumentName.setText("Instrument Name");
        returnofinstrumentName.setBounds(10, 18, 250, 25);
        returnPanel.add(returnofinstrumentName);
        returnofinstrumentName.setFont(new Font("Arial", Font.BOLD, 20));

        returnofinstrumentNameTF = new JTextField();
        returnofinstrumentNameTF.setBounds(250, 18, 400, 35);
        returnofinstrumentNameTF.setFont(font1);

        returnPanel.add(returnofinstrumentNameTF);

        // returnofinstrumentNameTF.addMouseListener(new MouseAdapter(){
        // @Override
        // public void mouseClicked(MouseEvent num){
        // returnofinstrumentNameTF.setText("");
        // returnofinstrumentNameTF.setFont(font1);

        // }
        // });

        // return handler

        // Buttom for Return That Instrument
        returnBtn = new JButton("Return");
        returnBtn.setBounds(250, 60, 200, 35);
        returnBtn.setFocusPainted(false);
        returnBtn.setFont(new Font("Arial", Font.BOLD, 20));
        returnBtn.setForeground(btnText);
        returnBtn.setBackground(buttonColoring);
        returnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        returnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                returnInstrument();
            }
        });
        returnPanel.add(returnBtn);

        // Back Button for Back in Home Frame
        Back2 = new JButton("Back");
        Back2.setFont(new Font("Arial", Font.BOLD, 20));
        Back2.setForeground(btnText);
        Back2.setBackground(buttonColoring);

        Back2.setBounds(20, 682, 200, 35);
        addInstrumenttorentpanel.add(Back2);

        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        Back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                rent.dispose();
                sell.dispose();
                homePage.setVisible(true);
            }
        });

        // display for Displaying Data.
        displaybuttonRent = new JButton("Display");
        displaybuttonRent.setBounds(240, 682, 200, 35);
        displaybuttonRent.setFocusPainted(false);
        displaybuttonRent.setFont(new Font("Arial", Font.BOLD, 20));
        displaybuttonRent.setBackground(buttonColoring);

        displaybuttonRent.setForeground(btnText);

        displaybuttonRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        displaybuttonRent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                if (instrumentList.size() > 0) {
                    for (int integer = 0; integer < instrumentList.size(); integer++) {
                        if (instrumentList.get(integer) instanceof InstrumentToRent) {
                            InstrumentToRent obj = (InstrumentToRent) instrumentList.get(integer);
                            obj.display();
                        }
                    }
                } else {
                    System.out
                            .println("Please fill the rent form to display your record");
                }
            }
        });
        addInstrumenttorentpanel.add(displaybuttonRent);

        // clear Button for Clearing all Data from TextField
        clearbuttonRent = new JButton("Clear");
        clearbuttonRent.setBounds(460, 682, 200, 35);
        clearbuttonRent.setFocusPainted(false);
        clearbuttonRent.setFont(new Font("Arial", Font.BOLD, 20));
        clearbuttonRent.setForeground(btnText);
        clearbuttonRent.setBackground(buttonColoring);

        clearbuttonRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        clearbuttonRent.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent num) {
                clearRent();
            }
        });
        addInstrumenttorentpanel.add(clearbuttonRent);

        // Selling Frame for Add and sell Items
        // sell
        sell = new JFrame();
        sell.setTitle("SarangiSansar");
        sell.setLayout(null);
        sell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sell.setBounds(0, 50, 690, 740);
        sell.setResizable(false);
        sell.setVisible(false);
        sell.setLocationRelativeTo(null);

        adddarkmode3 = new JCheckBox("Dark");
        adddarkmode3.setBounds(50, 0, 150, 45);
        adddarkmode3.setFocusable(false);
        adddarkmode3.setBackground(Color.DARK_GRAY);
        adddarkmode3.setFont(new Font("Arial", Font.PLAIN, 12));
        sell.add(adddarkmode3);

        adddarkmode3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {

                if (integer % 2 == 0) {
                    sellpanel1.setBackground(Color.WHITE);
                    addInstrumentSell.setBackground(new Color(255, 227, 235));
                    sellPanel.setBackground(new Color(255, 227, 235));
                    returnPanel.setBackground(new Color(255, 227, 235));
                    sellTitle.setForeground(Color.BLACK);
                    adddarkmode3.setBackground(Color.DARK_GRAY);
                    integer = integer + 1;
                } else {
                    sellpanel1.setBackground(new Color(38,34,34));
                    addInstrumentSell.setBackground(new Color(100, 102, 110));
                    sellPanel.setBackground(new Color(100, 102, 110));
                    adddarkmode3.setBackground(Color.WHITE);
                    sellTitle.setForeground(Color.WHITE);
                    integer = integer + 1;

                }
            }

        });

        // panel 2/Panel For Adding Instrument To Sell
        sellpanel1 = new JPanel();
        sellpanel1.setBounds(0, 50, 690, 650);
        sellpanel1.setLayout(null);
        sell.add(sellpanel1);

        sellTitle = new JLabel();
        sellTitle.setText("Instrument To Sell");
        sellTitle.setBounds(200, 10, 200, 20);
        sellTitle.setFont(new Font("Arial", Font.BOLD, 20));
        sellTitle.setBackground(Color.black);
        sellpanel1.add(sellTitle);

        // sub panel for Adding Instrument
        addInstrumentSell = new JPanel();
        addInstrumentSell.setBounds(10, 40, 650, 140);
        addInstrumentSell.setLayout(null);
        sellpanel1.add(addInstrumentSell);

        // Instrument Name and Other Detail
        SellName = new JLabel();
        SellName.setText("Instrument Name");
        SellName.setBounds(20, 10, 250, 25);
        addInstrumentSell.add(SellName);
        SellName.setFont(new Font("Arial", Font.BOLD, 20));

        SellNameTF = new JTextField();
        SellNameTF.setBounds(250, 10, 400, 35);
        SellNameTF.setFont(font1);
        addInstrumentSell.add(SellNameTF);

        // Price Of that Instrument
        price = new JLabel();
        price.setText("Price");
        price.setBounds(20, 50, 200, 25);
        price.setFont(new Font("Arial", Font.BOLD, 20));
        addInstrumentSell.add(price);

        priceTF = new JTextField();
        priceTF.setBounds(250, 50, 400, 35);
        priceTF.setFont(font1);
        addInstrumentSell.add(priceTF);

        // add to instrument for sell button
        addToSellInstrument = new JButton("Add");
        addToSellInstrument.setBounds(250, 95, 200, 35);
        addToSellInstrument.setFocusPainted(false);
        addToSellInstrument.setBackground(buttonColoring);
        addToSellInstrument.setForeground(btnText);
        addToSellInstrument.setFont(new Font("Arial", Font.BOLD, 20));

        addToSellInstrument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });

        addToSellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                addInstrumentForSell();
            }
        });
        addInstrumentSell.add(addToSellInstrument);

        // sub panel 5 for
        sellPanel = new JPanel();
        sellPanel.setBounds(10, 210, 660, 310);
        sellPanel.setLayout(null);
        sellpanel1.add(sellPanel);

        // Instrument Detail For Sell Instrument
        instrumenttosellName = new JLabel();
        instrumenttosellName.setText("Instrument Name");
        instrumenttosellName.setBounds(10, 20, 250, 25);
        instrumenttosellName.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(instrumenttosellName);

        instrumenttosellNameTF = new JTextField();
        instrumenttosellNameTF.setBounds(250, 20, 400, 35);
        instrumenttosellNameTF.setFont(font1);
        sellPanel.add(instrumenttosellNameTF);

        // Customer Detail of customer that buying Instrument
        customernameSell = new JLabel();
        customernameSell.setText("Customer Name");
        customernameSell.setBounds(10, 60, 250, 25);
        customernameSell.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(customernameSell);

        customernameSellTF = new JTextField();
        customernameSellTF.setBounds(250, 60, 400, 35);
        customernameSellTF.setFont(font1);
        sellPanel.add(customernameSellTF);

        Sellphone = new JLabel();
        Sellphone.setText("Customer Number");
        Sellphone.setBounds(10, 100, 250, 25);
        Sellphone.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(Sellphone);

        SellphoneTF = new JTextField();
        SellphoneTF.setBounds(250, 100, 400, 35);
        SellphoneTF.setFont(font1);
        sellPanel.add(SellphoneTF);

        // PAN NO Detail of Sell
        PANNo = new JLabel();
        PANNo.setText("PAN No");
        PANNo.setBounds(10, 140, 200, 25);
        PANNo.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(PANNo);

        PANNoTF = new JTextField();
        PANNoTF.setFont(font1);
        PANNoTF.setBounds(250, 140, 400, 35);
        sellPanel.add(PANNoTF);

        // Date of That Items Sold
        dateOfSell = new JLabel();
        dateOfSell.setText("Date of Sell");
        dateOfSell.setBounds(10, 180, 200, 25);
        dateOfSell.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(dateOfSell);

        yearS = new JComboBox<>(years);
        yearS.setBounds(250, 180, 100, 30);
        yearS.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(yearS);

        monthS = new JComboBox<>(months);
        monthS.setBounds(360, 180, 150, 30);
        monthS.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(monthS);

        dayS = new JComboBox<>(days);
        dayS.setFont(new Font("Arial", Font.BOLD, 20));
        dayS.setBounds(520, 180, 100, 30);
        sellPanel.add(dayS);

        // DIscount For That Instrument
        discountPercent = new JLabel();
        discountPercent.setText("Discount Percent");
        discountPercent.setBounds(10, 220, 200, 25);
        discountPercent.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(discountPercent);

        discountPercentTF = new JTextField();
        discountPercentTF.setBounds(250, 220, 400, 35);
        discountPercentTF.setFont(new Font("Arial", Font.BOLD, 20));
        sellPanel.add(discountPercentTF);

        // sell Button FOr Handling Data
        rentBtn = new JButton("Sell");
        rentBtn.setFont(new Font("Arial", Font.BOLD, 20));
        rentBtn.setBounds(250, 270, 200, 35);
        rentBtn.setFocusPainted(false);
        rentBtn.setBackground(buttonColoring);
        rentBtn.setForeground(btnText);
        rentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        rentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                sellInstrument();
            }
        });
        sellPanel.add(rentBtn);

        // Back Button To go Back in Home Page
        Back = new JButton("Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(20, 550, 200, 35);
        Back.setBackground(buttonColoring);
        Back.setForeground(btnText);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                rent.dispose();
                sell.dispose();

                homePage.setVisible(true);
            }

        });
        sellpanel1.add(Back);

        // display handler for sell
        displayBtnSell = new JButton("Display");
        displayBtnSell.setBounds(240, 550, 200, 35);
        displayBtnSell.setFocusPainted(false);
        displayBtnSell.setFont(new Font("Arial", Font.BOLD, 20));
        displayBtnSell.setBackground(buttonColoring);
        displayBtnSell.setForeground(btnText);
        displayBtnSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        displayBtnSell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                if (instrumentList.size() > 0) {
                    for (int integer = 0; integer < instrumentList.size(); integer++) {
                        if (instrumentList.get(integer) instanceof InstrumentToSell) {
                            InstrumentToSell objS = (InstrumentToSell) instrumentList.get(integer);
                            objS.display();
                        }
                    }
                } else {
                    System.out.println("Please fill the sell form to display your sell record");
                }
            }
        });
        sellpanel1.add(displayBtnSell);

        // clear handler for sell
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(460, 550, 200, 35);
        clearBtn.setFocusPainted(false);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 20));
        clearBtn.setBackground(buttonColoring);
        clearBtn.setForeground(btnText);
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.darkGray);
                hover.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent num) {
                JButton hover = (JButton) num.getSource();
                hover.setBackground(Color.WHITE);
                hover.setForeground(Color.BLACK);
            }
        });
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent num) {
                clearSell();
            }
        });

        sellpanel1.add(clearBtn);

        // subPanel6 = new JPanel();
        // subPanel6.setBounds(10, 500, 140, 140);
        // subPanel6.setBackground(panelColoring);
        // sellpanel1.add(subPanel6);

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
        if (num == 2) {
            num = 1;
            return;
        }

        // valid
        if (str == "invalid") {
            str = " ";
            return;
        }

        if (instrumentName.isEmpty() || chargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(rent, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int integer = 0; integer < instrumentList.size(); integer++) {
            if (instrumentList.get(integer).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(rent, "Instrument Name must be unique", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && chargePerDay != INVALID) {
            instrumentList.add(new InstrumentToRent(instrumentName, chargePerDay));
            JOptionPane.showMessageDialog(rent, "Instrument is added to rent");
        }

    }

    // instrument name of Rent
    public String getInstrumentRentName() {
        return rentnameTF.getText().trim();
    }

    // charge per day of Rent
    public int getChargePerDay() {
        // Here, empty = -1 //invalid = -2
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
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "charge Per day is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";
        }
        return chargePerDay;

    }

    // After Adding Now, Rent the instrument
    public void rentInstrument() {
        String instrumentToRentText = rentingnameTF.getText().trim();
        String customerNameRentText = customernameTF.getText().trim();
        String phoneText = rentPhoneTF.getText().trim();
        int panText = getPanNoRent();
        String dateofrent = noOfDays.getSelectedItem().toString() + " " +
                noOfMonths.getSelectedItem().toString() + " "
                + noOfYear.getSelectedItem().toString();
        String dateofreturn = noOfDaysreturn.getSelectedItem().toString() + " " +
                noOfMonthsReturn.getSelectedItem().toString() + " "
                + noOfYearReturn.getSelectedItem().toString();
        int rentedNoOfDaysText = getrentedNoOfDays();
        boolean isUnique = true;

        if (instrumentToRentText.isEmpty() || panText == EMPTY || rentedNoOfDaysText == EMPTY
                || customerNameRentText.isEmpty()
                || phoneText.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (num == 2) {
            num = 1;
            return;
        }

        // valid
        if (str == "invalid") {
            str = " ";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int integer = 0; integer < instrumentList.size(); integer++) {
                if (instrumentList.get(integer).getInstrumentName().toLowerCase()
                        .equals(instrumentToRentText.toLowerCase())) {
                    if (instrumentList.get(integer) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(integer);
                        if (obj.getIsRented()) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(rent, "Instrument is rented already. Come Next time",
                                    "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        obj.rent(customerNameRentText, phoneText, panText, dateofrent,
                                dateofreturn,
                                rentedNoOfDaysText);
                        isUnique = false;
                        obj.setIsRented(true);
                        JOptionPane.showMessageDialog(rent, "Instrument is rented");

                        break;

                    }
                }
            }
        }

        if (isUnique == true) {
            JOptionPane.showMessageDialog(rent, "Sorry, They are not found in our stock,", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    // get pan no of That instrument in Rent
    public int getPanNoRent() {
        String panNoText = PANTF.getText().trim();
        int panNo = INVALID;

        if (panNoText.isEmpty()) {
            panNo = EMPTY;
            return panNo;
        }

        try {
            panNo = Integer.parseInt(panNoText);
            if (panNo <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number pan number",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNo = INVALID;
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";

        }
        return panNo;

    }

    // get no of day to be Rented
    public int getrentedNoOfDays() {
        String rentedNoOfDaysText = noOfDaysrentedTF.getText().trim();
        int noOfDaysrented = INVALID;

        if (rentedNoOfDaysText.isEmpty()) {
            noOfDaysrented = EMPTY;
            return noOfDaysrented;
        }

        try {
            noOfDaysrented = Integer.parseInt(rentedNoOfDaysText);
            if (noOfDaysrented <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid postive number for number of days",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                noOfDaysrented = INVALID;
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "Number of Days is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";

        }
        return noOfDaysrented;

    }

    // return instrument
    public void returnInstrument() {
        String instrumentName = returnofinstrumentNameTF.getText().trim();
        boolean moreThanZero = false;

        if (instrumentName.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (instrumentList.size() > 0) {

            for (int integer = 0; integer < instrumentList.size(); integer++) {
                if (instrumentList.get(integer).getInstrumentName().toLowerCase()
                        .equals(instrumentName.toLowerCase())) {
                    if (instrumentList.get(integer) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(integer);
                        if (obj.getIsRented() == false) {
                            JOptionPane.showMessageDialog(rent, "Sorry, Instrument is not rented",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            moreThanZero = true;
                            return;
                        }
                        obj.returnInstrument();
                        JOptionPane.showMessageDialog(rent, "Instrument is returned");
                        obj.setIsRented(false);
                        moreThanZero = true;
                        break;

                    }
                }
            }

            if (moreThanZero == false) {
                JOptionPane.showMessageDialog(rent, "Sorry, we neither rent nor it is in stock", "ERROR",
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
        noOfDaysrentedTF.setText("");
        returnofinstrumentNameTF.setText("");
    }

    // validation for sell
    // add to instrument handler for Sell
    public void addInstrumentForSell() {
        String instrumentName = SellNameTF.getText().trim();
        int price = getPrice();
        boolean isUnique = true;

        // negative
        if (num == 2) {
            num = 1;
            return;
        }

        // valid
        if (str == "invalid") {
            str = " ";
            return;
        }

        if (instrumentName.isEmpty() || price == EMPTY) {
            JOptionPane.showMessageDialog(rent, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int integer = 0; integer < instrumentList.size(); integer++) {
            if (instrumentList.get(integer).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(rent, "Instrument Name must be unique",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && price != INVALID) {
            instrumentList.add(new InstrumentToSell(instrumentName, price));
            JOptionPane.showMessageDialog(rent, "Instrument to sell is added");
        }

    }

    // Instrument price for sell
    public int getPrice() {
        // empty -1 //invalid -2
        String priceText = priceTF.getText().trim();
        int price = INVALID;

        if (priceText.isEmpty()) {
            price = EMPTY;
            return price;
        }

        try {
            price = Integer.parseInt(priceText);
            if (price <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter the valid positive number for price",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                price = INVALID;
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "Price is  invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";
        }
        return price;
    }

    // Selling That instrument
    public void sellInstrument() {
        String instrumentToSellText = instrumenttosellNameTF.getText().trim();
        String customerNameForSellText = customernameSellTF.getText().trim();
        String customerPhoneText = SellphoneTF.getText().trim();
        int customerPanText = getPanNoSell();
        String dateOfSell = dayS.getSelectedItem().toString() + " " +
                monthS.getSelectedItem().toString() + " "
                + yearS.getSelectedItem().toString();
        int discountPercent = getDiscountPercent();
        boolean isUnique = true;

        if (instrumentToSellText.isEmpty() || customerPanText == EMPTY ||
                discountPercent == EMPTY
                || customerNameForSellText.isEmpty()
                || customerPhoneText.isEmpty()) {
            JOptionPane.showMessageDialog(rent, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (num == 2) {
            num = 1;
            return;
        }

        // valid
        if (str == "invalid") {
            str = " ";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int integer = 0; integer < instrumentList.size(); integer++) {
                if (instrumentList.get(integer).getInstrumentName().toLowerCase()
                        .equals(instrumentToSellText.toLowerCase())) {
                    if (instrumentList.get(integer) instanceof InstrumentToSell) {
                        InstrumentToSell objS = (InstrumentToSell) instrumentList.get(integer);
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
                                discountPercent);
                        objS.setIsSold(true);
                        JOptionPane.showMessageDialog(rent, "Instrument is sold", "INFORMATION",
                                JOptionPane.INFORMATION_MESSAGE);

                    }

                    break;
                }

            }
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(rent, "Sorry, They are not in our stock", "MESSAGE",
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
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "PAN NO. is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";
        }
        return panNoSell;
    }

    // discount percent FOr That Instrument
    public int getDiscountPercent() {
        String discountPercentText = discountPercentTF.getText().trim();
        int discountPercent = INVALID;

        if (discountPercentText.isEmpty()) {
            discountPercent = EMPTY;
            return discountPercent;
        }

        try {
            discountPercent = Integer.parseInt(discountPercentText);
            if (discountPercent <= 0) {
                JOptionPane.showMessageDialog(rent, "Please enter valid positive number for discount", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                discountPercent = INVALID;
                num = 2;
            }
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(rent,
                    "Discount Percent is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            str = "invalid";
        }
        return discountPercent;
    }

    // clear Data in Sell Frame
    public void clearSell() {
        SellNameTF.setText("");
        priceTF.setText("");
        instrumenttosellNameTF.setText("");
        customernameSellTF.setText("");
        SellphoneTF.setText("");
        PANNoTF.setText("");
        discountPercentTF.setText("");
    }

}
