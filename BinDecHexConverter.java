
/**
 * June 14th, 2021
 * ICS3U1
 * Decimal <--> Binary and Decimal <--> Hexadecimal Number Converter Software
 * This program will convert decimal values to binary/hexadecimal and
 * binary/hexadecimal to decimal
 *
 * @author Bonny Chen
 */
public class BinDecHexConverter extends javax.swing.JFrame {

    /**
     * Creates new form BinHecDec
     */
    public BinDecHexConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        boxPanel1 = new javax.swing.JPanel();
        lblInstrDB = new javax.swing.JLabel();
        txtDToB = new javax.swing.JTextField();
        boxPanel2 = new javax.swing.JPanel();
        lblInstrBD = new javax.swing.JLabel();
        txtBToD = new javax.swing.JTextField();
        boxPanel4 = new javax.swing.JPanel();
        txtHToD = new javax.swing.JTextField();
        lblInstrHD = new javax.swing.JLabel();
        boxPanel3 = new javax.swing.JPanel();
        txtDToH = new javax.swing.JTextField();
        lblInstrDH = new javax.swing.JLabel();
        btnDToB = new javax.swing.JButton();
        btnBToD = new javax.swing.JButton();
        btnHToD = new javax.swing.JButton();
        btnDToH = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        border.setBackground(new java.awt.Color(0, 0, 0));

        background.setBackground(new java.awt.Color(128, 128, 128));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("-- NUMBER CONVERTER --");

        boxPanel1.setBackground(new java.awt.Color(64, 64, 64));

        lblInstrDB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstrDB.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrDB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrDB.setText("Enter a decimal number:");

        txtDToB.setBackground(new java.awt.Color(0, 0, 0));
        txtDToB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDToB.setForeground(new java.awt.Color(255, 255, 255));
        txtDToB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout boxPanel1Layout = new javax.swing.GroupLayout(boxPanel1);
        boxPanel1.setLayout(boxPanel1Layout);
        boxPanel1Layout.setHorizontalGroup(
            boxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(boxPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtDToB, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxPanel1Layout.setVerticalGroup(
            boxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDToB, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        boxPanel2.setBackground(new java.awt.Color(64, 64, 64));

        lblInstrBD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstrBD.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrBD.setText("Enter a binary number:");

        txtBToD.setBackground(new java.awt.Color(0, 0, 0));
        txtBToD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBToD.setForeground(new java.awt.Color(255, 255, 255));
        txtBToD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBToD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBToDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxPanel2Layout = new javax.swing.GroupLayout(boxPanel2);
        boxPanel2.setLayout(boxPanel2Layout);
        boxPanel2Layout.setHorizontalGroup(
            boxPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(boxPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBToD, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        boxPanel2Layout.setVerticalGroup(
            boxPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBToD, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        boxPanel4.setBackground(new java.awt.Color(64, 64, 64));

        txtHToD.setBackground(new java.awt.Color(0, 0, 0));
        txtHToD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtHToD.setForeground(new java.awt.Color(255, 255, 255));
        txtHToD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblInstrHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstrHD.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrHD.setText("Enter a hexadecimal number:");

        javax.swing.GroupLayout boxPanel4Layout = new javax.swing.GroupLayout(boxPanel4);
        boxPanel4.setLayout(boxPanel4Layout);
        boxPanel4Layout.setHorizontalGroup(
            boxPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInstrHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(boxPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtHToD, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxPanel4Layout.setVerticalGroup(
            boxPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHToD, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        boxPanel3.setBackground(new java.awt.Color(64, 64, 64));

        txtDToH.setBackground(new java.awt.Color(0, 0, 0));
        txtDToH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDToH.setForeground(new java.awt.Color(255, 255, 255));
        txtDToH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblInstrDH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstrDH.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrDH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrDH.setText("Enter a decimal number:");

        javax.swing.GroupLayout boxPanel3Layout = new javax.swing.GroupLayout(boxPanel3);
        boxPanel3.setLayout(boxPanel3Layout);
        boxPanel3Layout.setHorizontalGroup(
            boxPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(boxPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtDToH, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxPanel3Layout.setVerticalGroup(
            boxPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstrDH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDToH, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDToB.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDToB.setForeground(new java.awt.Color(64, 64, 64));
        btnDToB.setText("Decimal to Binary");
        btnDToB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDToBActionPerformed(evt);
            }
        });

        btnBToD.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBToD.setForeground(new java.awt.Color(64, 64, 64));
        btnBToD.setText("Binary to Decimal");
        btnBToD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBToDActionPerformed(evt);
            }
        });

        btnHToD.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnHToD.setForeground(new java.awt.Color(64, 64, 64));
        btnHToD.setText("Hexadecimal to Decimal");
        btnHToD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHToDActionPerformed(evt);
            }
        });

        btnDToH.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDToH.setForeground(new java.awt.Color(64, 64, 64));
        btnDToH.setText("Decimal to Hexadecimal");
        btnDToH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDToHActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnBToD, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDToH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHToD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDToB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(boxPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnDToB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBToD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnDToH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnHToD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDToBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDToBActionPerformed

        // Variables
        int decValue;
        String binValue = "";

        // Exception 
        try {

            decValue = Integer.parseInt(txtDToB.getText()); // Get user input from textbox

        } catch (NumberFormatException e) { // Only allows number input

            lblInstrDB.setText("Invalid number, try again:");
            txtDToB.setText("");

            return;

        }

        if (decValue < 0) { // If a negative number is entered

            lblInstrDB.setText("Invalid number, try again:");
            txtDToB.setText("");

            return;
        }

        if (decValue == 0) { // If only 0 is entered

            lblInstrDB.setText("The binary value of 0 is:");
            txtDToB.setText("0");

            return;

        }

        if (decValue > 0) { // If a positive integer is entered

            lblInstrDB.setText("The binary value of " + decValue + " is:");
            
            int binArray[] = new int[1001]; // Array used to store the binary value
            int digits = 0;

            // Loop to convert decimal to binary 
            while (decValue > 0) {

                binArray[digits] = decValue % 2; // Remainder 1 = odd, 0 = even
                decValue /= 2; // Divide decimal value by 2
                digits++; 

            }
            
            for (int i = digits - 1; i >= 0; i--) { 
            
                binValue += String.valueOf(binArray[i]); // Sets binary value as the answer in the array
                
            }

            txtDToB.setText(binValue); // Set textbox to the binary value

        }

    }//GEN-LAST:event_btnDToBActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnDToHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDToHActionPerformed

        // Variables
        int decValue, remainder;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; // All the hexadecimal values
        String hexaValue = "";

        // Exception
        try {

            decValue = Integer.parseInt(txtDToH.getText()); // Get input from textbox

        } catch (NumberFormatException e) { // Only allows number input

            lblInstrDH.setText("Invalid number, try again:");
            txtDToH.setText("");

            return;
            
        }

        if (decValue < 0) { // If a negative number is entered

            lblInstrDH.setText("Invalid number, try again:");
            txtDToH.setText("");

            return;
            
        }

        if (decValue == 0) { // If only a 0 is entered
            lblInstrDH.setText("The hexa value of 0 is:");

            return;
            
        }

        lblInstrDH.setText("The hexadecimal value of " + decValue + " is:");

        // Loop to convert decimal to hexadecimal value
        while (decValue > 0) { // If a positive integer is entered

            remainder = decValue % 16; // Remainder of the number divided by 16
            hexaValue = hexa[remainder] + hexaValue; // Matches a hexa value to the remainder
            decValue /= 16; // Moves up the digits

        }

        txtDToH.setText(hexaValue); // Set textbox to the hexadecimal value

    }//GEN-LAST:event_btnDToHActionPerformed

    private void btnBToDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBToDActionPerformed

        // Variable
        int binValue;

        // Exception
        try {

            binValue = Integer.parseInt(txtBToD.getText()); // Get input from textbox

        } catch (NumberFormatException e) {  // Only allows number input

            lblInstrBD.setText("Invalid binary, try again:");
            txtBToD.setText("");

            return;

        }

        if (binValue < 0) { // If a negative number is entered

            lblInstrBD.setText("Invalid binary, try again:");
            txtBToD.setText("");

            return;

        }

        // Convert binValue to string to find string length
        String binary = String.valueOf(binValue);

        // Loop to check if the input was a binary value
        for (int i = 0; i < binary.length(); i++) {

            // If binary does not contain 0 or 1
            if (binary.charAt(i) != '0') {

                if (binary.charAt(i) != '1') {

                    lblInstrBD.setText("Invalid binary, try again:");
                    txtBToD.setText("");

                    return;

                }

            }

        }

        lblInstrBD.setText("The decimal value of " + binValue + " is:");

        binValue = Integer.parseInt(txtBToD.getText()); // Get input from the textbox

        // Variables
        int decValue = 0;
        int base = 1; // Starting base

        // Loop to convert binary to decimal value
        while (binValue > 0) {

            int check = binValue % 10; // Checks for the numbers 1 or 0 starting from the first digit on the right side
            binValue /= 10; // Moves up the digits
            decValue += check * base; // Adds (check x base) to the decimal value
            base *= 2; // Base increases

        }

        txtBToD.setText(String.valueOf(decValue)); // Set textbox to the decimal value

    }//GEN-LAST:event_btnBToDActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        // Exits the program
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void txtBToDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBToDActionPerformed

    }//GEN-LAST:event_txtBToDActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        // Resets all text boxes
        lblInstrDB.setText("Enter a decimal number:");
        lblInstrBD.setText("Enter a binary number:");
        lblInstrDH.setText("Enter a decimal number:");
        lblInstrHD.setText("Enter a hexadecimal number:");

        txtDToB.setText("");
        txtBToD.setText("");
        txtDToH.setText("");
        txtHToD.setText("");


    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHToDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHToDActionPerformed

        String hexaValue = txtHToD.getText(); // Get input from textbox

        lblInstrHD.setText("The decimal value of " + hexaValue + " is:");

        if (!validHexValue(hexaValue)) { // If it's not a valid hexadecimal value

            lblInstrHD.setText("Invalid hexadecimal, try again:");
            txtHToD.setText("");

            return;

        }

        int decValue = Integer.parseInt(hexaValue, 16);

        txtHToD.setText(String.valueOf(decValue)); // Set textbox to the decimal value

    }

    // Boolean method to check if input was a valid hexadecimal value
    public boolean validHexValue(String hexa) {

        // Loop to check each character
        for (int i = 0; i < hexa.length(); i++) {

            if (hexa.charAt(i) != '0' && hexa.charAt(i) != '1' && hexa.charAt(i) != '2' && hexa.charAt(i) != '3' && hexa.charAt(i) != '4' && hexa.charAt(i) != '5' && hexa.charAt(i) != '6' && hexa.charAt(i) != '7' && hexa.charAt(i) != '8' && hexa.charAt(i) != '9' && hexa.charAt(i) != 'A' && hexa.charAt(i) != 'B' && hexa.charAt(i) != 'C' && hexa.charAt(i) != 'D' && hexa.charAt(i) != 'E' && hexa.charAt(i) != 'F') {
                
                return false;

            }

        }

        return true;

    }//GEN-LAST:event_btnHToDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BinDecHexConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinDecHexConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinDecHexConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinDecHexConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinDecHexConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel border;
    private javax.swing.JPanel boxPanel1;
    private javax.swing.JPanel boxPanel2;
    private javax.swing.JPanel boxPanel3;
    private javax.swing.JPanel boxPanel4;
    private javax.swing.JButton btnBToD;
    private javax.swing.JButton btnDToB;
    private javax.swing.JButton btnDToH;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHToD;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblInstrBD;
    private javax.swing.JLabel lblInstrDB;
    private javax.swing.JLabel lblInstrDH;
    private javax.swing.JLabel lblInstrHD;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBToD;
    private javax.swing.JTextField txtDToB;
    private javax.swing.JTextField txtDToH;
    private javax.swing.JTextField txtHToD;
    // End of variables declaration//GEN-END:variables
}
