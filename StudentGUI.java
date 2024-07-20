// Import necessary swing and awt and other java packages
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.table.DefaultTableModel;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import java.awt.geom.RoundRectangle2D;
import java.awt.Component;
import javax.swing.JComboBox;

//main class
public class StudentGUI{
    // Declare private instance variables for various Swing components and containers
    private JFrame frame;  // Main JFrame for the GUI
    private JLabel jLabelSMS, jLabelImg, jLabelClg, jLabelCR;// Labels for displaying text
    private JPanel jpanel1, Right, Left; // JPanels for organizing components
    private JButton jButtonRegular, jButtonDropout;

    // Table to display student information
    private JTable displayTable;
    private JFrame displayFrame;// JFrame to hold the display table

    // Instance variables for regular class
    private JFrame frame1;
    private JLabel lblClass, lblDOB, lblName, lblDuration, lblFee, lblModule, lblCreditHours, lblDays, lblDOE, lblCourse, lblID,  lblScholarship, lblBackgroundImg, lblPresent, lblName2, lblIDs, lblDOEs, lblDurations, lblID3;
    private JPanel panel;
    private JTextField txtName, txtFee, txtModule, txtCreditHours, txtDays, txtID, txtDuration, txtPresent, txtID2, txtDurations, txtID3;
    private JButton buttonAdd, buttonExit, buttonBack, buttonPercent, buttonCertificate, buttonDisplay, buttonClear;
    private ImageIcon bgIcon;
    private StudentGUI login;

    // Combo boxes for selecting date, course, etc. for regular class
    private JComboBox<String> comboday, combomonth, comboyear, comboday1, combomonth1, comboyear1, comboCourse, comboday5, combomonth5, comboyear5, comboCourse2;
    private JComboBox<String> Comboday3, Combomonth3, Comboyear3, Comboday4, Combomonth4, Comboyear4, Comboday2, Combomonth2, Comboyear2, ComboCourse1;

    // Instance variables for dropout class
    private JFrame frame2;
    private JLabel lblClass1, lblDOB1, lblName1, lblDuration1, lblFee1, lblCourse1, lblRemainingModule, lblMonthsAttended, lblDOD, lblDOE1, lblID1, lblBackgroundImg1, lblDuration2, lblTuition1, lblMonths, lblenroll;
    private JPanel panel1;
    private JTextField txtName1, txtFee1, txtRemainingModule, txtMonthsAttended, txtID1, txtDuration1, txtDuration2, txtTuition1, txtMonths, txtenroll;
    private JButton button_Add, button_Exit, button_Back, button_Bills, button_Remove, button_Display, button_Clear;
    private ImageIcon bgIcon1;
    private StudentGUI login1;

    // Variables to handle GUI interaction and coloring
    private boolean over;
    private Color fill;
    private Color line;

    // Colors and stroke width for GUI components
    private Color fillColor;
    private Color lineColor;
    private Color fillOriginal;
    private Color fillOver;
    private Color fillClick;
    private Color lineOriginal;
    private Color lineOver;
    private int strokeWidth;

    // ArrayList to store student objects
    ArrayList<Student> studentList = new ArrayList<>();

    // Method to make the main frame visible
    public void showFrame() {
        frame.setVisible(true);
    }

    // Getters and setters for GUI colors and stroke width
    public Color getFillOriginal() {
        return fillOriginal;
    }

    public void setFillOriginal(Color fillOriginal) {
        this.fillOriginal = fillOriginal;
    }

    public Color getFillOver() {
        return fillOver;
    }

    public void setFillOver(Color fillOver) {
        this.fillOver = fillOver;
    }

    public Color getFillClick() {
        return fillClick;
    }

    public void setFillClick(Color fillClick) {
        this.fillClick = fillClick;
    }

    public Color getLineOriginal() {
        return lineOriginal;
    }

    public void setLineOriginal(Color lineOriginal) {
        this.lineOriginal = lineOriginal;
    }

    public Color getLineOver() {
        return lineOver;
    }

    public void setLineOver(Color lineOver) {
        this.lineOver = lineOver;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    //clear method the textfield and combobox
    public void clear(){
        //Regular class
        txtName.setText("");
        txtFee.setText("");
        txtenroll.setText("");
        txtModule.setText("");
        txtCreditHours.setText("");
        txtDays.setText("");
        txtID.setText("");
        txtID3.setText("");
        txtDuration.setText("");
        txtPresent.setText("");
        txtDurations.setText("");
        txtID2.setText("");
        comboday.setSelectedIndex(0);
        combomonth.setSelectedIndex(0);
        comboyear.setSelectedIndex(0);
        comboday1.setSelectedIndex(0);
        combomonth1.setSelectedIndex(0);
        comboyear1.setSelectedIndex(0);
        comboCourse.setSelectedIndex(0);
        comboday5.setSelectedIndex(0);
        combomonth5.setSelectedIndex(0);
        comboyear5.setSelectedIndex(0);
        comboCourse2.setSelectedIndex(0);

        //Dropout class
        txtName1.setText("");
        txtFee1.setText("");
        txtRemainingModule.setText("");
        txtMonthsAttended.setText("");
        txtID1.setText("");
        txtDuration1.setText("");
        txtDuration2.setText("");
        txtenroll.setText("");
        txtMonths.setText("");
        txtTuition1.setText("");
        Comboday3.setSelectedIndex(0);
        Combomonth3.setSelectedIndex(0);
        Comboyear3.setSelectedIndex(0);
        Comboday4.setSelectedIndex(0);
        Combomonth4.setSelectedIndex(0);
        Comboyear4.setSelectedIndex(0);
        Comboday2.setSelectedIndex(0);
        Combomonth2.setSelectedIndex(0);
        Comboyear2.setSelectedIndex(0);
        ComboCourse1.setSelectedIndex(0);
    }

    // The method to create custom-styled JButtons
    public JButton FButton() {
        JButton button = new JButton() {

                {
                    //colors for different button states
                    fillOriginal = new Color(52, 152, 219);
                    fillOver = new Color(41, 128, 185);
                    fillClick = new Color(128, 139, 150);
                    lineOriginal = new Color(253, 254, 254);
                    lineOver = new Color(253, 254, 254);
                    strokeWidth = 2;
                    fill = fillOriginal;
                    line = lineOriginal;

                    //button properties to customize appearance and interaction
                    setOpaque(false);
                    setBorder(null);
                    setFocusPainted(false);
                    setContentAreaFilled(false);
                    setBackground(fillOriginal);
                    setForeground(Color.white);

                    //mouse listeners to handle button interactions
                    addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                fill = fillOriginal;
                                line = lineOriginal;
                                over = false;
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                fill = fillOver;
                                line = lineOver;
                                over = true;
                            }

                            public void mouseReleased(java.awt.event.MouseEvent evt) {
                                if (over) {
                                    fill = fillOver;
                                    line = lineOver;
                                } else {
                                    fill = fillOriginal;
                                    line = lineOriginal;
                                }
                            }

                            public void mousePressed(java.awt.event.MouseEvent evt) {
                                fill = fillClick;
                            }
                        });
                }

                // Overriding the paintComponent method to customize the appearance of the component
                protected void paintComponent(Graphics g) {
                    // Check if the component is not opaque (i.e., has a transparent background)
                    if (!isOpaque()) {
                        Graphics2D g2d = (Graphics2D) g;
                        //Set rendering hints for better graphics quality
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        int s = strokeWidth;
                        int w = getWidth() - (2 * s);// Calculate the width of the component with padding
                        int h = getHeight() - (2 * s);// Calculate the height of the component with padding
                        // Draw background
                        g2d.setColor(fill);
                        g2d.fillRoundRect(s, s, w, h, h, h);
                        // Draw border
                        g2d.setStroke(new BasicStroke(s));
                        g2d.setColor(line);
                        g2d.drawRoundRect(s, s, w, h, h, h);
                    }
                    // Call the superclass paintComponent method to ensure proper functioning
                    super.paintComponent(g);
                }
            };

        return button;
    }

    // Other fields and methods of the StudentGUI class ...

    // The method to create custom-styled JTextFields
    public JTextField FTextField(){

        JTextField text = new JTextField(){

                {
                    // Define colors and stroke width for the text field
                    fillColor = new Color(236, 240, 241);
                    lineColor = new Color(52, 152, 219);
                    strokeWidth = 2;
                    // Set text field properties to customize appearance
                    setOpaque(false);
                    setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));

                }

                protected void paintComponent(Graphics g) {
                    if (!isOpaque()) {
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        int s = strokeWidth;
                        int w = getWidth() - (2 * s);
                        int h = getHeight() - (2 * s);
                        g2d.setColor(fillColor);
                        g2d.fillRoundRect(s, s, w, h, h, h);
                        g2d.setStroke(new BasicStroke(s));
                        g2d.setColor(lineColor);
                        g2d.drawRoundRect(s, s, w, h, h, h);
                    }
                    super.paintComponent(g);
                }
            };
        return text;
    }

    // Method to create custom-styled JButtons for the main GUI
    public void createButtons() {
        buttonAdd = FButton();
        buttonExit = FButton();
        buttonBack = FButton();
        buttonPercent = FButton();
        buttonCertificate = FButton();
        buttonDisplay = FButton();
        buttonClear = FButton();

        button_Add =  FButton();
        button_Exit =  FButton();
        button_Back =  FButton();
        button_Bills =  FButton();
        button_Remove =  FButton();
        button_Display =  FButton();
        button_Clear = FButton();
    }

    // Method to create custom renderer for JComboBoxes
    private ListCellRenderer<Object> createCustomComboBoxRenderer() {
        return new DefaultListCellRenderer() 
        {
            {
                fillColor = new Color(236, 240, 241);
                lineColor = new Color(52, 152, 219);
                int strokeWidth = 2;
            }

            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setOpaque(false);
                label.setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
                return label;
            }

            protected void paintComponent(Graphics g) {
                if (!isOpaque()) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    int s = strokeWidth;
                    int w = getWidth() - (2 * s);
                    int h = getHeight() - (2 * s);
                    g2d.setColor(fillColor);
                    g2d.fillRoundRect(s, s, w, h, h, h);
                    g2d.setStroke(new BasicStroke(s));
                    g2d.setColor(lineColor);
                    g2d.drawRoundRect(s, s, w, h, h, h);
                }
                super.paintComponent(g);

            }

        };
    }

    // The method to create JComboBoxes with custom renderers
    public void createComboBox() {
        // Arrays for day, month, and year options
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String[] year = {"2001", "2002", "2003", "2004", "2005", "2006"};
        String[] day1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] month1 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String[] year1 = {"2018", "2019", "2020", "2021", "2022", "2023"};
        String[] Course = {"Networking", "Computing", "Multimedia", "Artificial Intilligence", "Accounting", "Business Administrative"};
        String[] day5 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] month5 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String[] year5 = {"2018", "2019", "2020", "2021", "2022", "2023"};
        String[] Course2 = {"Networking", "Computing", "Multimedia", "Artificial Intilligence", "Accounting", "Business Administrative"};

        // Create ComboBox components with options
        comboday = new JComboBox<String>(day);
        combomonth = new JComboBox<String>(month);
        comboyear = new JComboBox<String>(year);
        comboday1 = new JComboBox<String>(day1);
        combomonth1 = new JComboBox<String>(month1);
        comboyear1 = new JComboBox<String>(year1);
        comboCourse = new JComboBox<String>(Course);
        comboday5 = new JComboBox<String>(day5);
        combomonth5 = new JComboBox<String>(month5);
        comboyear5 = new JComboBox<String>(year5);
        comboCourse2 = new JComboBox<String>(Course2);

        // Apply custom renderer to ComboBoxes for consistent appearance
        comboday.setRenderer(createCustomComboBoxRenderer());
        combomonth.setRenderer(createCustomComboBoxRenderer());
        comboyear.setRenderer(createCustomComboBoxRenderer());
        comboday1.setRenderer(createCustomComboBoxRenderer());
        combomonth1.setRenderer(createCustomComboBoxRenderer());
        comboyear1.setRenderer(createCustomComboBoxRenderer());
        comboCourse.setRenderer(createCustomComboBoxRenderer());
        comboday5.setRenderer(createCustomComboBoxRenderer());
        combomonth5.setRenderer(createCustomComboBoxRenderer());
        comboyear5.setRenderer(createCustomComboBoxRenderer());
        comboCourse2.setRenderer(createCustomComboBoxRenderer());

        String day3[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String month3[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String year3[] = {"2001", "2002", "2003", "2004", "2005", "2006"};
        String day4[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String month4[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String year4[] = {"2018", "2019", "2020", "2021", "2022", "2023"};
        String day2[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String month2[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String year2[] = {"2018", "2019", "2020", "2021", "2022", "2023"};
        String Course1[] = {"Networking", "Computing", "Multimedia", "Artificial Intilligence", "Accounting", "Business Administrative"};

        Comboday3 = new JComboBox<String>(day3);
        Combomonth3 = new JComboBox<String>(month3);
        Comboyear3 = new JComboBox<String>(year3);
        Comboday4 = new JComboBox<String>(day4);
        Combomonth4 = new JComboBox<String>(month4);
        Comboyear4 = new JComboBox<String>(year4);
        Comboday2 = new JComboBox<String>(day2);
        Combomonth2 = new JComboBox<String>(month2);
        Comboyear2 = new JComboBox<String>(year2);
        ComboCourse1 = new JComboBox<String>(Course1);

        Comboday3.setRenderer(createCustomComboBoxRenderer());
        Combomonth3.setRenderer(createCustomComboBoxRenderer());
        Comboyear3.setRenderer(createCustomComboBoxRenderer());
        Comboday4.setRenderer(createCustomComboBoxRenderer());
        Combomonth4.setRenderer(createCustomComboBoxRenderer());
        Comboyear4.setRenderer(createCustomComboBoxRenderer());
        Comboday2.setRenderer(createCustomComboBoxRenderer());
        Combomonth2.setRenderer(createCustomComboBoxRenderer());
        Comboyear2.setRenderer(createCustomComboBoxRenderer());
        ComboCourse1.setRenderer(createCustomComboBoxRenderer());

    }

    // Constructor for the StudentGUI class
    public StudentGUI(){

        // Create buttons and ComboBoxes
        createButtons();
        createComboBox();  

        // Initialize JFrame and components for GUI layout
        frame = new JFrame("Student Management System");
        jLabelSMS = new JLabel();
        jLabelImg = new JLabel();
        jLabelClg = new JLabel();
        jLabelCR = new JLabel();

        jButtonRegular  = new JButton();
        jButtonDropout = new JButton();

        jpanel1 = new JPanel();
        Right = new JPanel();
        Left = new JPanel();

        // Configure panel layouts and visual elements
        jpanel1.setBackground(new Color(255, 255, 255));
        jpanel1.setPreferredSize(new Dimension(1000, 800));
        jpanel1.setLayout(null);

        Right.setBackground(new Color(0, 102, 102));
        Right.setPreferredSize(new Dimension(500, 600));

        jLabelImg.setIcon(new ImageIcon("logo.png")); // NOI18N

        jLabelClg.setFont(new Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabelClg.setForeground(new Color(255, 255, 255));
        jLabelClg.setText("Islington College");

        jLabelCR.setFont(new Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelCR.setForeground(new Color(204, 204, 204));
        jLabelCR.setText("copyright © company name All rights reserved");

        // Apply GroupLayout to arrange components in the Right panel
        GroupLayout RightLayout = new GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(jLabelCR)
                .addGap(120, 120, 120))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelClg))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabelImg)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabelImg)
                .addGap(40, 40, 40)
                .addComponent(jLabelClg)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabelCR)
                .addGap(80, 80, 80))
        );

        // Add the "Right" panel to the "jpanel1" panel and set its position and size
        jpanel1.add(Right);
        Right.setBounds(0, 0, 500, 600);

        // Create the "Left" panel with a white background and minimum size
        Left.setBackground(new Color(255, 255, 255));
        Left.setMinimumSize(new Dimension(300, 600));

        // Create a label for the main title of the GUI
        jLabelSMS.setFont(new Font("Segoe UI", 1, 25)); // NOI18N
        jLabelSMS.setForeground(new Color(0, 102, 102));
        jLabelSMS.setText("Student Management System");

        // Create buttons for "Regular" and "Dropout"
        jButtonRegular.setBackground(new Color(0, 102, 102));
        jButtonRegular.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jButtonRegular.setForeground(new Color(255, 255, 255));
        jButtonRegular.setText("Regular");

        jButtonDropout.setBackground(new Color(0, 102, 102));
        jButtonDropout.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDropout.setForeground(new Color(255, 255, 255));
        jButtonDropout.setText("Dropout");

        // Apply GroupLayout to arrange components in the "Left" panel
        GroupLayout LeftLayout = new GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabelSMS)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegular, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDropout, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabelSMS)
                .addGap(120, 120, 120)
                .addComponent(jButtonRegular, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonDropout, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        );

        // Add the "Left" panel to the "jpanel1" panel and set its position and size
        jpanel1.add(Left);
        Left.setBounds(500, 0, 500, 600);

        // Create GroupLayout for the main frame's content pane
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        // Set various properties of the frame
        frame.getAccessibleContext().setAccessibleName("LOGIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("LOGIN");
        frame.setPreferredSize(new Dimension(1000, 600));
        frame.pack();
        frame.setVisible(true);

        // ActionListener for "Regular" button
        jButtonRegular.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    jButtonRegular.setBackground(new Color(121, 125, 127));
                    frame1.setVisible(true);
                    frame2.dispose();
                    frame.dispose();
                }
            });

        // ActionListener for "Dropout" button (jButton2)
        jButtonDropout.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                    jButtonDropout.setBackground(new Color(121, 125, 127));
                    frame1.dispose();
                    frame2.setVisible(true);
                    frame.dispose();
                }
            });

        // Create a new JFrame for the "Regular Class" window
        frame1 = new JFrame("Regular Class");

        // Load an image and create a JLabel to display it as a background
        ImageIcon img = new ImageIcon("img.jpg");
        lblBackgroundImg = new JLabel("", img, JLabel.CENTER);
        lblBackgroundImg.setBounds(0, 0, 1000, 800);

        // Create various JLabels to display text labels on the window
        // Set the positions, sizes, fonts, and foreground colors of the labe
        lblClass = new JLabel("Regular");
        lblName = new JLabel("Student Name:");
        lblID = new JLabel("Enrollment Id:");
        lblDOB = new JLabel("Date Of Birth:");
        lblCourse = new JLabel("Course Name:");
        lblDuration = new JLabel("Course Duration:");
        lblDays = new JLabel("Present Days:");
        lblDOE = new JLabel("Date Of Enrollment:");
        lblModule = new JLabel("Modules:");
        lblCreditHours = new JLabel("Credit Hours:");
        lblFee = new JLabel("Tuition Fee:");
        lblScholarship = new JLabel("Scholarship Granted:");
        lblPresent = new JLabel("Present Days:");
        lblDurations = new JLabel("Course Duration:");
        lblIDs = new JLabel("Enrollment ID:");
        lblName2 = new JLabel("Course Name:");
        lblDOEs = new JLabel("Date Of Enrollment:");
        lblID3 = new JLabel("Enrollment Id:");

        lblClass.setForeground(Color.BLUE);
        lblName.setForeground(Color.BLUE);
        lblID.setForeground(Color.BLUE);
        lblDOB.setForeground(Color.BLUE);
        lblCreditHours.setForeground(Color.BLUE);
        lblDuration.setForeground(Color.BLUE);
        lblDays.setForeground(Color.BLUE);
        lblDOE.setForeground(Color.BLUE);
        lblModule.setForeground(Color.BLUE);
        lblCourse.setForeground(Color.BLUE);
        lblFee.setForeground(Color.BLUE);
        lblScholarship.setForeground(Color.BLUE);
        lblPresent.setForeground(Color.BLUE);
        lblDurations.setForeground(Color.BLUE);
        lblIDs.setForeground(Color.BLUE);
        lblName2.setForeground(Color.BLUE);
        lblDOEs.setForeground(Color.BLUE);
        lblID3.setForeground(Color.BLUE);

        lblClass.setBounds(430, 30, 300, 40);
        lblName.setBounds(55, 110, 120, 30);
        lblID.setBounds(573, 240, 120, 30);
        lblDOB.setBounds(63, 175, 120, 30);
        lblCreditHours.setBounds(68, 310, 120, 30);
        lblDuration.setBounds(550, 370, 130, 30);
        lblDays.setBounds(60, 240, 120, 30);
        lblDOE.setBounds(535, 175, 160, 30);
        lblModule.setBounds(95, 370, 120, 30);
        lblCourse.setBounds(576, 110, 120, 30);
        lblFee.setBounds(590, 310, 120, 30);
        lblPresent.setBounds(60, 470, 120, 30);
        lblDurations.setBounds(40, 530, 130, 30 );
        lblIDs.setBounds(573, 470, 120, 30);
        lblName2.setBounds(573, 530, 120, 30);
        lblDOEs.setBounds(535, 590, 160, 30);
        lblID3.setBounds(63, 590, 120, 30);

        lblClass.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
        lblName.setFont(new Font("Ariel", Font.BOLD, 15));
        lblID.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOB.setFont(new Font("Ariel", Font.BOLD, 15));
        lblCourse.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDuration.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDays.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOE.setFont(new Font("Ariel", Font.BOLD, 15));
        lblModule.setFont(new Font("Ariel", Font.BOLD, 15));
        lblCreditHours.setFont(new Font("Ariel", Font.BOLD, 15));
        lblFee.setFont(new Font("Ariel", Font.BOLD, 15));
        lblScholarship.setFont(new Font("Ariel", Font.BOLD, 15));
        lblPresent.setFont(new Font("Ariel", Font.BOLD, 15));
        lblName2.setFont(new Font("Ariel", Font.BOLD, 15));
        lblIDs.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOEs.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDurations.setFont(new Font("Ariel", Font.BOLD, 15));
        lblID3.setFont(new Font("Ariel", Font.BOLD, 15));

        // Create text fields for user input
        // Set their positions and sizes
        txtName = FTextField();
        txtFee = FTextField();
        txtModule = FTextField();
        txtCreditHours = FTextField();
        txtDays = FTextField();
        txtID = FTextField();
        txtDuration = FTextField();
        txtPresent = FTextField();
        txtID2 = FTextField();
        txtDurations = FTextField();
        txtID3 = FTextField();

        txtName.setBounds(200, 110, 180, 30);
        txtFee.setBounds(720, 310, 180, 30);
        txtModule.setBounds(200, 370, 180, 30);
        txtCreditHours.setBounds(200, 310, 180, 30);
        txtDays.setBounds(200, 240, 180, 30);
        txtID.setBounds(720, 240, 180, 30);
        txtDuration.setBounds(720, 370, 180, 30);
        txtPresent.setBounds(200, 470, 180, 30);
        txtDurations.setBounds(200, 530, 180, 30);
        txtID2.setBounds(720, 470, 180, 30);
        txtID3.setBounds(200, 590, 180, 30);

        // Create combo boxes for date selection
        // Set their positions and sizes
        comboday.setBounds(200, 175, 60, 30);
        combomonth.setBounds(265, 175, 70, 30);
        comboyear.setBounds(340, 175, 70, 30);
        comboday1.setBounds(720, 175, 60, 30);
        combomonth1.setBounds(785, 175, 70, 30);
        comboyear1.setBounds(860, 175, 70, 30);
        comboCourse.setBounds(720, 110, 180, 30);
        comboday5.setBounds(720, 590, 60, 30);
        combomonth5.setBounds(785, 590, 70, 30);
        comboyear5.setBounds(860, 590, 70, 30);
        comboCourse2.setBounds(720, 530, 180, 30);

        // Create buttons for various actions
        // Set their text, positions, and sizes
        buttonAdd.setBounds(450, 400, 80, 40); 
        buttonExit.setBounds(830, 720, 80, 40);
        buttonBack.setBounds(35, 720, 80, 40);
        buttonPercent.setBounds(216, 650, 150, 40);
        buttonCertificate.setBounds(733, 650, 150, 40); 
        buttonDisplay.setBounds(320, 720, 80, 40);
        buttonClear.setBounds(570, 720, 80, 40);

        buttonAdd.setText("Add");
        buttonExit.setText("Exit");
        buttonBack.setText("<<Back>>");
        buttonPercent.setText("Present Percentage");
        buttonCertificate.setText("Grant Certificate");
        buttonDisplay.setText("Display");
        buttonClear.setText("Clear");

        // Create a JPanel and set its layout to null
        panel = new JPanel();
        panel.setLayout(null);

        // Add all the created components to the panel
        panel.add(lblClass);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblID);
        panel.add(txtID);
        panel.add(lblDOB);
        panel.add(comboday);
        panel.add(combomonth);
        panel.add(comboyear);
        panel.add(lblCourse);
        panel.add(comboCourse);
        panel.add(lblDuration);
        panel.add(txtDuration);
        panel.add(lblDays);
        panel.add(txtDays);
        panel.add(lblDOE);
        panel.add(comboday1);
        panel.add(combomonth1);
        panel.add(comboyear1);
        panel.add(lblModule);
        panel.add(txtModule);
        panel.add(lblCreditHours);
        panel.add(txtCreditHours);
        panel.add(lblFee);
        panel.add(txtFee);
        panel.add(lblScholarship);
        panel.add(lblPresent);
        panel.add(txtPresent);
        panel.add(lblName2);
        panel.add(comboCourse2);
        panel.add(lblIDs);
        panel.add(txtID2);
        panel.add(lblDOEs);
        panel.add(comboday5);
        panel.add(combomonth5);
        panel.add(comboyear5);
        panel.add(lblDurations);
        panel.add(txtDurations);
        panel.add(lblID3);
        panel.add(txtID3);
        panel.add(buttonAdd);
        panel.add(buttonExit);
        panel.add(buttonBack);
        panel.add(buttonPercent);
        panel.add(buttonCertificate);
        panel.add(buttonDisplay);
        panel.add(buttonClear);
        panel.add(lblBackgroundImg);

        // Define an ActionListener for the "Back" button
        buttonBack.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                    // Create a new instance of the main StudentGUI class, show its frame, and close the current frame
                    login = new StudentGUI();
                    login.showFrame();
                    frame1.dispose();
                }
            });

        // Add the panel to the frame, set the frame properties, and display it
        frame1.add(panel);
        frame1.setSize(1000, 800);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

        // ActionListener for "Add" button (buttonAdd)
        buttonAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if (e.getSource() == buttonAdd)
                    {
                        // Make the frame1 visible
                        frame1.setVisible(true);

                        // Check if any required fields are empty
                        if (txtName.getText().isEmpty() || txtFee.getText().isEmpty() ||
                        txtModule.getText().isEmpty() || txtCreditHours.getText().isEmpty() ||
                        txtDays.getText().isEmpty() || txtDuration.getText().isEmpty() || txtID.getText().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame1, "All the fields are required.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Get selected values from combo boxes for date and course
                        String dayOfBirth = comboday.getSelectedItem().toString();
                        String monthOfBirth = combomonth.getSelectedItem().toString();
                        String yearOfBirth = comboyear.getSelectedItem().toString();
                        String dayOfEnroll = comboday1.getSelectedItem().toString();
                        String monthOfEnroll = combomonth1.getSelectedItem().toString();
                        String yearOfEnroll = comboyear1.getSelectedItem().toString();
                        String courseName = comboCourse.getSelectedItem().toString();

                        // Concatenate selected date components into full date strings
                        String dateOfBirth = dayOfBirth + " " + monthOfBirth + " " + yearOfBirth;
                        String dateOfEnrollment = dayOfEnroll + " " + monthOfEnroll + " " + yearOfEnroll;

                        String studentName = txtName.getText();

                        // Check if the student name contains only letters
                        if (!studentName.matches("[a-zA-Z]+")){
                            JOptionPane.showMessageDialog(frame1, "Invalid input. Only letters (a-z) and (A-Z) are allowed for student name.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Parse input values into appropriate data types
                        int numOfModules;
                        double daysPresent;
                        int numOfCreditHours;
                        int courseDuration;
                        int tuitionFee;
                        int enrollmentID;

                        try
                        {
                            numOfModules = Integer.parseInt(txtModule.getText());
                            daysPresent = Double.parseDouble(txtDays.getText());
                            numOfCreditHours = Integer.parseInt(txtCreditHours.getText());
                            courseDuration = Integer.parseInt(txtDuration.getText());
                            tuitionFee = Integer.parseInt(txtFee.getText());
                            enrollmentID = Integer.parseInt(txtID.getText());
                        } catch (NumberFormatException ex) 
                        {
                            JOptionPane.showMessageDialog(frame1, "Invalid number format. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Create a new Regular student object
                        Regular regularStudent = new Regular(dateOfBirth, studentName, courseDuration, tuitionFee, numOfModules, numOfCreditHours, daysPresent, dateOfEnrollment, courseName, enrollmentID);

                        // Check if the enrollment ID already exists in the studentList
                        boolean checkID = false;
                        for (Student student : studentList)
                        {
                            if (student instanceof Regular) 
                            {
                                Regular studentList = (Regular) student;
                                if (studentList.getenrollmentID() == enrollmentID)
                                {
                                    checkID = true;
                                    break; // Exit the loop since we found a match
                                }
                            }
                        }

                        if (checkID == true)
                        {
                            JOptionPane.showMessageDialog(frame1, "Enrollment ID already exists.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        } else 
                        {
                            studentList.add(regularStudent);
                            JOptionPane.showMessageDialog(frame1, "You have successfully added an student to the system.");
                            clear();
                        }
                    }
                }

            });

        // ActionListener for "Exit" button (buttonExit)
        buttonExit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) 
                {
                    // Hide the frame1 and show a "Thank you!" message, then exit the application
                    frame1.setVisible(false);
                    JOptionPane.showMessageDialog(frame1, "Thank you!");
                    System.exit(0);
                }
            });

        // ActionListener for "Present Percentage" button (buttonPercent)
        buttonPercent.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) 
                {
                    if (e.getSource() == buttonPercent) 
                    {
                        // Check if any required fields are empty
                        if (txtID3.getText().isEmpty() || txtDurations.getText().isEmpty() ||
                        txtPresent.getText().isEmpty()) 
                        {
                            JOptionPane.showMessageDialog(frame1, "All the fields are required.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        // Get the Enrollment ID and number of days present from the text fields
                        int enrollmentIDCheck;
                        double daysPresent;
                        int courseDurations;
                        try {
                            enrollmentIDCheck = Integer.parseInt(txtID3.getText());
                            courseDurations = Integer.parseInt(txtDurations.getText());
                            daysPresent = Double.parseDouble(txtPresent.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame1, "Invalid input. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Find the Regular Student object with the given Enrollment ID
                        Regular checkStudent = null;
                        for (Student student : studentList)
                        {
                            if (student instanceof Regular)
                            {
                                Regular regularStudent = (Regular) student;
                                if (regularStudent.getenrollmentID() == enrollmentIDCheck) 
                                {
                                    checkStudent = regularStudent;
                                    break; // Exit the loop since we found a match
                                }
                            }
                        }

                        if (checkStudent != null) {

                            double courseDuration = checkStudent.getcourseDuration();
                            double presentPercentage = (daysPresent / courseDurations) * 100;
                            checkStudent.presentPercentage(daysPresent);

                            // Display the information dialog with the present percentage
                            String printmessage = "Enrollment ID: " + checkStudent.getenrollmentID() + "\n";
                            printmessage += "----------------------------------------------------\n";
                            printmessage += "Student Name: " + checkStudent.getstudentName() + "\n";
                            printmessage += "----------------------------------------------------\n";
                            printmessage += "Present Percentage: " + presentPercentage + "%" + "\n";
                            printmessage += "----------------------------------------------------\n";
                            printmessage += "Attendance Grade is: " + checkStudent.presentPercentage(daysPresent) + "\n";
                            printmessage += "----------------------------------------------------\n";
                            JOptionPane.showMessageDialog(frame1, printmessage, "Present Percentage is: ", JOptionPane.INFORMATION_MESSAGE);
                            clear();
                        } else 
                        {
                            JOptionPane.showMessageDialog(frame1, "No Regular Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        }
                    }
                }
            });

        // ActionListener for "Grant Certificate" button (buttonCertificate)
        buttonCertificate.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == buttonCertificate) {

                        // Check if the Enrollment ID field is empty
                        if (txtID2.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(frame1, "All the fields are required.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        // Get the Enrollment ID, course name, and date of enrollment from the text fields
                        int enrollmentID;
                        String courseName;
                        String dateOfEnrollment;

                        try {
                            enrollmentID = Integer.parseInt(txtID2.getText()); 

                            String dayOfEnroll1 = comboday5.getSelectedItem().toString();
                            String monthOfEnroll1 = combomonth5.getSelectedItem().toString();
                            String yearOfEnroll1 = comboyear5.getSelectedItem().toString();
                            dateOfEnrollment = dayOfEnroll1 + " " + monthOfEnroll1 + " " + yearOfEnroll1;

                            courseName = comboCourse2.getSelectedItem().toString();

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame1, "Invalid input. Please enter valid values.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Find the Regular Student object with the given Enrollment ID
                        Regular checkStudent = null;
                        for (Student student : studentList) {
                            if (student instanceof Regular) {
                                Regular regularStudent = (Regular) student;
                                if (regularStudent.getenrollmentID() == enrollmentID) {
                                    checkStudent = regularStudent;
                                    break; // Exit the loop since we found a match
                                }
                            }
                        }

                        if (checkStudent != null) {
                            // Grant the certificate for the found Regular Student
                            checkStudent.grantCertificate(courseName,enrollmentID, dateOfEnrollment);

                            String output = "Enrollment ID: " + checkStudent.getenrollmentID() + "\n";
                            output += "----------------------------------------------------\n";
                            output += "Course Name: " + checkStudent.getcourseName() + "\n";
                            output += "----------------------------------------------------\n";
                            output += "Date Of Enrollment: " + checkStudent.getdateOfEnrollment() + "\n";
                            output += "----------------------------------------------------\n";

                            // Display the information dialog with the certificate message
                            JOptionPane.showMessageDialog(frame1,output, "Certificate is Granted.", JOptionPane.INFORMATION_MESSAGE);
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(frame1, "No Regular Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        }
                    }
                }
            });

        // ActionListener for "Display" button (buttonDisplay)
        buttonDisplay.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    // Create a display frame to show student details in a table
                    displayFrame = new JFrame("Student Details");
                    JScrollPane jsp = new JScrollPane();
                    jsp.setBounds(0, 0, 1300, 200);
                    displayFrame.add(jsp);

                    displayTable = new JTable();
                    displayTable.setModel(new DefaultTableModel(new Object[][] {}, new
                            String[]{"Student Name", "Enrollment ID", "Date of Birth", "Course Name", "Course Duration",
                                "Tuition Fee", "Number of Modules", "Number of Credit Hours", "Days Present", "Date of Enrollment"}));
                    displayTable.setRowHeight(20);
                    jsp.setViewportView(displayTable);

                    // Fill the table with student data from the studentList
                    DefaultTableModel tableModel = (DefaultTableModel) displayTable.getModel();
                    for (Student student : studentList) {
                        if (student instanceof Regular) {
                            Regular regularStudent = (Regular) student;
                            Object[] rowData = {
                                    regularStudent.getstudentName(),
                                    regularStudent.getenrollmentID(),
                                    regularStudent.getdateOfBirth(),
                                    regularStudent.getcourseName(),
                                    regularStudent.getcourseDuration(),
                                    regularStudent.gettuitionFee(),
                                    regularStudent.getnumOfModules(),
                                    regularStudent.getnumOfCreditHours(),
                                    regularStudent.getdaysPresent(),
                                    regularStudent.getdateOfEnrollment()
                                };
                            tableModel.addRow(rowData);
                        }
                    }

                    // Set display frame properties and make it visible
                    displayFrame.setResizable(false);
                    displayFrame.setBounds(20, 250, 1200, 400);
                    displayFrame.setVisible(true);
                    displayFrame.setLocationRelativeTo(null);
                }

            });

        // ActionListener for "Clear" button (buttonClear)
        buttonClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Call the clear method to reset the input fields
                    clear();
                }
            });

        // Create a new JFrame for the Dropout Class
        frame2 = new JFrame("Droput Class");

        // Create an ImageIcon for background image and add a JLabel with the image to the frame
        ImageIcon img1 = new ImageIcon("img.jpg");
        lblBackgroundImg1 = new JLabel("", img1, JLabel.CENTER);
        lblBackgroundImg1.setBounds(0, 0, 1050, 800);

        // Create JLabels to display tex
        lblClass1 = new JLabel("Dropout");
        lblName1 = new JLabel("Student Name:");
        lblID1 = new JLabel("Enrollment Id:");
        lblDOB1 = new JLabel("Date Of Birth:");
        lblCourse1 = new JLabel("Course Name:");
        lblDuration1 = new JLabel("Course Duration:");
        lblRemainingModule = new JLabel("Remaining Module:");
        lblDOE1 = new JLabel("Date Of Enrollment:");
        lblMonthsAttended = new JLabel("Months Attended:");
        lblDOD = new JLabel("Date Of Dropout:");
        lblFee1 = new JLabel("Tuition Fee:");
        lblDuration2 = new JLabel("Course Duration:");
        lblTuition1 = new JLabel("Tuition Fee:");
        lblMonths = new JLabel("Months Attended:");
        lblenroll = new JLabel("Enrollment Id:");

        // Set positions, colors, and fonts for the JLabels
        lblClass1.setBounds(460, 30, 300, 30);
        lblName1.setBounds(87, 112, 120, 30);
        lblID1.setBounds(85, 352, 110, 30);
        lblDOB1.setBounds(95, 172, 120, 30);
        lblRemainingModule.setBounds(637, 292, 150, 30);
        lblDOD.setBounds(70, 232, 125, 30);
        lblMonthsAttended.setBounds(655, 172, 135, 30);
        lblDOE1.setBounds(50, 292, 175, 30);
        lblFee1.setBounds(696, 112, 90, 30);
        lblCourse1.setBounds(675, 352, 110, 30);
        lblDuration1.setBounds(655, 232, 130, 30);
        lblDuration2.setBounds(27, 492, 130, 30);
        lblTuition1.setBounds(705, 562, 130, 30);
        lblMonths.setBounds(665, 492, 135, 30);
        lblenroll.setBounds(50, 562, 135, 30);

        //set positions and properties for other JLabels
        lblClass1.setForeground(Color.BLUE);
        lblName1.setForeground(Color.BLUE);
        lblID1.setForeground(Color.BLUE);
        lblDOB1.setForeground(Color.BLUE);
        lblRemainingModule.setForeground(Color.BLUE);
        lblDuration1.setForeground(Color.BLUE);
        lblDOD.setForeground(Color.BLUE);
        lblDOE1.setForeground(Color.BLUE);
        lblMonthsAttended.setForeground(Color.BLUE);
        lblCourse1.setForeground(Color.BLUE);
        lblFee1.setForeground(Color.BLUE);
        lblDuration2.setForeground(Color.BLUE);
        lblTuition1.setForeground(Color.BLUE);
        lblMonths.setForeground(Color.BLUE);
        lblenroll.setForeground(Color.BLUE);

        lblClass1.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
        lblName1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblID1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOB1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblCourse1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDuration1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOD.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDOE1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblMonthsAttended.setFont(new Font("Ariel", Font.BOLD, 15));
        lblRemainingModule.setFont(new Font("Ariel", Font.BOLD, 15));
        lblFee1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblDuration2.setFont(new Font("Ariel", Font.BOLD, 15));
        lblTuition1.setFont(new Font("Ariel", Font.BOLD, 15));
        lblMonths.setFont(new Font("Ariel", Font.BOLD, 15));
        lblenroll.setFont(new Font("Ariel", Font.BOLD, 15));

        // Create JTextFields and set their positions
        txtName1 = FTextField();
        txtFee1 = FTextField();
        txtRemainingModule = FTextField();
        txtMonthsAttended = FTextField();
        txtID1 = FTextField();
        txtDuration1 =  FTextField();
        txtDuration2 = FTextField();
        txtTuition1 = FTextField();
        txtMonths = FTextField();
        txtenroll = FTextField();

        txtName1.setBounds(230, 110, 180, 30);
        txtMonthsAttended.setBounds(822, 170, 180, 30);
        txtFee1.setBounds(822, 110, 180, 30);
        txtRemainingModule.setBounds(822, 290, 180, 30);
        txtID1.setBounds(230, 350, 180, 30);
        txtDuration1.setBounds(822, 230, 180, 30);
        txtDuration2.setBounds(173, 490, 180, 30);
        txtTuition1.setBounds(816, 560, 180, 30);
        txtMonths.setBounds(816, 490, 180, 30);
        txtenroll.setBounds(173, 560, 180, 30);

        // Create JComboBoxes for selecting dates and set their positions
        Comboday3.setBounds(230, 170, 60, 30);
        Combomonth3.setBounds(295, 170, 70, 30);
        Comboyear3.setBounds(370, 170, 70, 30);
        Comboday4.setBounds(230, 290, 60, 30);
        Combomonth4.setBounds(295, 290, 70, 30);
        Comboyear4.setBounds(370, 290, 70, 30);
        Comboday2.setBounds(230, 230, 60, 30);
        Combomonth2.setBounds(295, 230, 70, 30);
        Comboyear2.setBounds(370, 230, 70, 30);
        ComboCourse1.setBounds(822, 350, 170, 30);

        // Create JButtons for different actions and set their positions and text
        button_Add.setBounds(515, 392, 80, 40);
        button_Exit.setBounds(925, 700, 80, 40);
        button_Back.setBounds(40, 700, 80, 40);
        button_Bills.setBounds(475, 520, 150, 40);
        button_Remove.setBounds(475, 610, 150, 40);
        button_Display.setBounds(355, 700, 80, 40);
        button_Clear.setBounds(675, 700, 80, 40);

        button_Add.setText("Add");
        button_Exit.setText("Exit");
        button_Back.setText("<<Back>>");
        button_Bills.setText("Bills Payable");
        button_Remove.setText("Remove Student");
        button_Display.setText("Display");
        button_Clear.setText("Clear");

        // Create a JPanel and set its layout to null
        panel1 = new JPanel();
        panel1.setLayout(null);

        // Add all the components (JLabels, JTextFields, JButtons, etc.) to the panel
        panel1.add(lblClass1);
        panel1.add(lblName1);
        panel1.add(txtName1);
        panel1.add(lblID1);
        panel1.add(txtID1);
        panel1.add(lblDOB1);
        panel1.add(Comboday3);
        panel1.add(Combomonth3);
        panel1.add(Comboyear3);
        panel1.add(lblCourse1);
        panel1.add(Combomonth2);
        panel1.add(lblDuration1);
        panel1.add(Comboday2);
        panel1.add(lblRemainingModule);
        panel1.add(txtRemainingModule);
        panel1.add(lblDOE1);
        panel1.add(Comboday4);
        panel1.add(Combomonth4);
        panel1.add(Comboyear4);
        panel1.add(lblMonthsAttended);
        panel1.add(txtMonthsAttended);
        panel1.add(lblDOD);
        panel1.add(lblFee1);
        panel1.add(txtFee1);
        panel1.add(button_Add);
        panel1.add(button_Exit);
        panel1.add(button_Back);
        panel1.add(button_Bills);
        panel1.add(button_Remove);
        panel1.add(button_Display);
        panel1.add(button_Clear);
        panel1.add(lblDuration2);
        panel1.add(txtDuration2);
        panel1.add(lblTuition1);
        panel1.add(txtTuition1);
        panel1.add(lblenroll);
        panel1.add(txtenroll);
        panel1.add(lblMonths);
        panel1.add(txtMonths);
        panel1.add(Comboyear2);
        panel1.add(txtDuration1);
        panel1.add(ComboCourse1);
        panel1.add(lblBackgroundImg1);

        // Set action listener for the "Back" button
        button_Back.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) 
                {
                    // Create and show the previous frame (StudentGUI)
                    login1 = new StudentGUI();
                    login1.showFrame();
                    frame2.dispose();// Close the current frame
                }
            });

        // Set the properties of the frame (size, close operation, add panel, etc.)
        frame2.add(panel1);
        frame2.setSize(1050, 800);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set action listener for the "Add" button
        button_Add.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) 
                {
                    // Check if the "Add" button is clicked
                    if(e.getSource() == button_Add){
                        frame2.setVisible(true);

                        // Check if any required field is empty
                        if (txtName1.getText().isEmpty() || txtFee1.getText().isEmpty() ||
                        txtRemainingModule.getText().isEmpty() || txtDuration1.getText().isEmpty() || txtMonthsAttended.getText().isEmpty() || txtID1.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(frame2, "All the fields are required.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Get input values from the fields and combo boxes
                        String dayOfBirth = Comboday3.getSelectedItem().toString();
                        String monthOfBirth = Combomonth3.getSelectedItem().toString();
                        String yearOfBirth = Comboyear3.getSelectedItem().toString();
                        String dayOfDropout = Comboday4.getSelectedItem().toString();
                        String monthOfDropout = Combomonth4.getSelectedItem().toString();
                        String yearOfDropout = Comboyear4.getSelectedItem().toString();
                        String dayOfEnroll = Comboday2.getSelectedItem().toString();
                        String monthOfEnroll = Combomonth2.getSelectedItem().toString();
                        String yearOfEnroll = Comboyear2.getSelectedItem().toString();
                        String courseNames = ComboCourse1.getSelectedItem().toString();

                        // Combine values to create date strings
                        String dateOfBirth = dayOfBirth + " " + monthOfBirth + " " + yearOfBirth;
                        String dateOfEnrollment = dayOfEnroll + " " + monthOfEnroll + " " + yearOfEnroll;
                        String dateOfDropout = dayOfDropout + " " + monthOfDropout + " " + yearOfDropout;

                        String studentName = txtName1.getText();

                        if (!studentName.matches("[a-zA-Z]+")){
                            JOptionPane.showMessageDialog(frame2, "Invalid input. Only letters (a-z) and (A-Z) are allowed for student name.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Validate and parse numeric input values
                        int RemainingModule;
                        int MonthsAttended;
                        int courseDuration;
                        int tuitionFees;
                        int enrollmentIDs;

                        try{
                            RemainingModule = Integer.parseInt(txtRemainingModule.getText());
                            MonthsAttended = Integer.parseInt(txtMonthsAttended.getText());
                            courseDuration = Integer.parseInt(txtDuration1.getText());
                            tuitionFees = Integer.parseInt(txtFee1.getText());
                            enrollmentIDs = Integer.parseInt(txtID1.getText());

                        }

                        catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame2, "Invalid number format. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;

                        }

                        // Create a Dropout object
                        Dropout dropoutStudent = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFees, RemainingModule, MonthsAttended, dateOfDropout, dateOfEnrollment, courseNames, enrollmentIDs);

                        // Check if the enrollment ID already exists in the studentList
                        boolean checkID = false;
                        for (Student student : studentList) {
                            if (student instanceof Dropout) {
                                Dropout studentList = (Dropout) student;
                                if (studentList.getenrollmentID() == enrollmentIDs) {
                                    checkID = true;
                                    JOptionPane.showMessageDialog(frame2, "Enrollment ID already exists.", "Alert", JOptionPane.WARNING_MESSAGE);
                                    clear();
                                    break; // Exit the loop since we found a match
                                }
                            }
                        }

                        // Add the Dropout object to the studentList
                        if (checkID == true) {
                            JOptionPane.showMessageDialog(frame2, "Enrollment ID already exists.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        } else {
                            studentList.add(dropoutStudent);
                            JOptionPane.showMessageDialog(frame2, "You have successfully added an student to the system.");
                            clear();
                        }
                    }
                }

            });

        // Set action listener for the "Exit" button
        button_Exit.addActionListener(new ActionListener()
            { 
                public void actionPerformed(ActionEvent e) 
                {
                    // Check if the "Exit" button is clicked
                    if(e.getSource() == button_Exit)
                    {
                        frame2.setVisible(false);
                        JOptionPane.showMessageDialog(frame2, "Thank you!");
                        System.exit(0);// Exit the GUI
                    }
                }

            });

        // Set action listener for the "Bills Payable" button
        button_Bills.addActionListener(new ActionListener(){
                // Check if the "Bills Payable" button is clicked
                public void actionPerformed(ActionEvent e){
                    if (e.getSource() == button_Bills) {

                        // Check if any required field is empty
                        if (studentList.isEmpty()) {
                            JOptionPane.showMessageDialog(frame2, "All the fields are required.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        // Get the Enrollment ID from the text field
                        int enrollmentID;
                        int remainingAmount;
                        int numOfMonthsAttended;
                        int tuitionFee;
                        int courseDuration;

                        try {
                            enrollmentID = Integer.parseInt(txtenroll.getText());
                            numOfMonthsAttended = Integer.parseInt(txtMonths.getText());
                            tuitionFee = Integer.parseInt(txtTuition1.getText());
                            courseDuration = Integer.parseInt(txtDuration2.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame2, "Invalid input. Please enter a valid values.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Find the Dropout Student object with the given Enrollment ID
                        Dropout dropoutStudent = null;
                        for (Student student : studentList) {
                            if (student instanceof Dropout) {
                                Dropout dropStudent = (Dropout) student;
                                // Check if the Enrollment ID matches the one in the Dropout Student object
                                if (dropStudent.getenrollmentID() == enrollmentID) {
                                    dropoutStudent = dropStudent;
                                    break; // Exit the loop since we found a match
                                }
                            }
                        }

                        if (dropoutStudent != null) {

                            remainingAmount = (courseDuration - numOfMonthsAttended) * tuitionFee;
                            // Call the method to pay the bills of the dropout student
                            dropoutStudent.billsPayable();

                            String output = "Enrollment ID: " + dropoutStudent.getenrollmentID() + "\n";
                            output += "----------------------------------------------------\n";
                            output += "Student Name: " + dropoutStudent.getstudentName() + "\n";
                            output += "----------------------------------------------------\n";
                            output += "Remaining Amount: " + remainingAmount + "\n";
                            output += "----------------------------------------------------\n";

                            JOptionPane.showMessageDialog(frame2, output, "Bills has been Paid.",  JOptionPane.INFORMATION_MESSAGE);
                            clear();

                        } else {
                            JOptionPane.showMessageDialog(frame2, "No Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        }
                    }
                }

            });

        // Set action listener for the "Display" button
        button_Display.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    displayFrame = new JFrame("Student Details");
                    JScrollPane jsp = new JScrollPane();
                    jsp.setBounds(0, 0, 1300, 200);
                    displayFrame.add(jsp);

                    displayTable = new JTable();
                    displayTable.setModel(new DefaultTableModel(new Object[][] {}, new
                            String[]{"Student Name", "Enrollment ID", "Date of Birth", "Course Name", "Course Duration",
                                "Tuition Fee", "Number of Remaining Modules", "Number of Months Attended", "Date of Enrollment", "Date Of Dropout"}));
                    displayTable.setRowHeight(20);
                    jsp.setViewportView(displayTable);

                    DefaultTableModel tableModel = (DefaultTableModel) displayTable.getModel();
                    for (Student student : studentList) {
                        if (student instanceof Dropout) {
                            Dropout dropoutStudent = (Dropout) student;
                            Object[] rowData = {
                                    dropoutStudent.getstudentName(),
                                    dropoutStudent.getenrollmentID(),
                                    dropoutStudent.getdateOfBirth(),
                                    dropoutStudent.getcourseName(),
                                    dropoutStudent.getcourseDuration(),
                                    dropoutStudent.gettuitionFee(),
                                    dropoutStudent.getnumOfRemainingModules(),
                                    dropoutStudent.getnumOfMonthsAttended(),
                                    dropoutStudent.getdateOfEnrollment(),
                                    dropoutStudent.getdateOfDropout()
                                };
                            tableModel.addRow(rowData);
                        }
                    }

                    displayFrame.setResizable(false);
                    displayFrame.setBounds(20, 250, 1200, 400);
                    displayFrame.setVisible(true);
                    displayFrame.setLocationRelativeTo(null);
                }
            });

        // Set action listener for the "Remove Student" button
        button_Remove.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    // Get the Enrollment ID from the text field
                    int enrollmentID;

                    try {
                        enrollmentID = Integer.parseInt(txtenroll.getText());

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame1, "Invalid input. Please enter a valid Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    // Find the Dropout Student object with the given Enrollment ID
                    Dropout dropoutStudent = null;
                    for (Student student : studentList) {
                        if (student instanceof Dropout) {
                            Dropout dropStudent = (Dropout) student;
                            // Check if the Enrollment ID matches the one in the Dropout Student object
                            if (dropStudent.getenrollmentID() == enrollmentID) {
                                dropoutStudent = dropStudent;
                                break;
                            }
                        }
                    }

                    if (dropoutStudent != null) {
                        // Check if the student has paid
                        if (dropoutStudent.gethasPaid()) {
                            // Call the method to remove the student
                            dropoutStudent.removeStudent();

                            // Display the success message in the dialog box
                            String Message = "Student with Enrollment ID " + enrollmentID + " has been removed.";
                            JOptionPane.showMessageDialog(frame2, Message, "Student Removed Successfully!", JOptionPane.INFORMATION_MESSAGE);
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(frame2, "Student with Enrollment ID " + enrollmentID + " has pending bills and cannot be removed.", "Alert", JOptionPane.WARNING_MESSAGE);
                            clear();
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame2, "No Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);
                        clear();
                    }
                }
            });

        // Set action listener for the "Clear" button
        button_Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    clear();
                }
            });
    }

    // The main method to launch the GUI
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
                    StudentGUI studentsGUI = new StudentGUI();
                    studentsGUI.showFrame();

            });
    }
}