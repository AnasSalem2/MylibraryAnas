import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;




public class LibraryWindow extends javax.swing.JFrame {
    int notebookNum, FoldernotebookNum, montagedrawNum, pencilNum, DryPenNum, InkPenNum;
    double notebookPrice, FoldernotebookPrice, montagedrawPrice, pencilPrice,DryPenPrice,InkPenPrice;
    final double NOTEBOOK_COST = 2.0, FOLDERNOTEBOOK_COST = 5.0, MONTAGEDRAW_COST = 1.0, PENCIL_COST = 1.0 ,DRYBEN_COST=3.0 , INKPEN_COST=3.0;
    double subtotal, vat, total;
     int customerCounter;
     PrintWriter output;

   
    public LibraryWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notebook = new javax.swing.JSpinner();
        Foldernotebook = new javax.swing.JSpinner();
        montagedraw = new javax.swing.JSpinner();
        notebookPriceLabel = new javax.swing.JLabel();
        FoldernotebookPriceLabel = new javax.swing.JLabel();
        montagedrawPriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        subtotalLabel = new javax.swing.JLabel();
        vatLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Pincel = new javax.swing.JSpinner();
        InkPen = new javax.swing.JSpinner();
        DryPen = new javax.swing.JSpinner();
        PincelPriceLabel = new javax.swing.JLabel();
        DryPenPriceLabel = new javax.swing.JLabel();
        InkPenPriceLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        customerCounterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("نظام المكتبات");

        jLabel2.setText("برمجة : انس سالم");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("خروج");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الأدوات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("دفتر عادي");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("دفتر مجلد");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("كراسة رسم");

        notebook.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                notebookStateChanged(evt);
            }
        });

        Foldernotebook.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FoldernotebookStateChanged(evt);
            }
        });

        montagedraw.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                montagedrawStateChanged(evt);
            }
        });

        notebookPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        notebookPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notebookPriceLabel.setText("0.0شيكل");

        FoldernotebookPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FoldernotebookPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FoldernotebookPriceLabel.setText("0.0شيكل");

        montagedrawPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        montagedrawPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        montagedrawPriceLabel.setText("0.0شيكل");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(notebookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notebook)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(montagedrawPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoldernotebookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foldernotebook)
                            .addComponent(montagedraw))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(notebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notebookPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Foldernotebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FoldernotebookPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(montagedraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montagedrawPriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        subtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotalLabel.setText("المجموع:0.0 شيكل");

        vatLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vatLabel.setText("الضريبة:0.0 شيكل");

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalLabel.setText("الاجمالي:0.0 شيكل");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtotalLabel)
                .addGap(18, 18, 18)
                .addComponent(vatLabel)
                .addGap(18, 18, 18)
                .addComponent(totalLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الأقلام", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("أقلام رصاص");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("أقلام حبر");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("أقلام جافة");

        Pincel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PincelStateChanged(evt);
            }
        });

        InkPen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InkPenStateChanged(evt);
            }
        });

        DryPen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DryPenStateChanged(evt);
            }
        });

        PincelPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PincelPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PincelPriceLabel.setText("0.0شيكل");

        DryPenPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DryPenPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DryPenPriceLabel.setText("0.0شيكل");

        InkPenPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        InkPenPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        InkPenPriceLabel.setText("0.0شيكل");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PincelPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DryPenPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InkPenPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Pincel)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(InkPen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(DryPen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Pincel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PincelPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DryPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DryPenPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(InkPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InkPenPriceLabel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("حساب");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("حفظ الفاتورة ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("فاتورة حديدة");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        customerCounterLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerCounterLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customerCounterLabel.setText("الفاتورة رقم 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(customerCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void notebookStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notebookStateChanged
       notebookNum = (Integer) notebook.getValue();
       notebookPrice =  NOTEBOOK_COST * notebookNum;
       notebookPriceLabel.setText(notebookPrice+"شيكل");
       
    }//GEN-LAST:event_notebookStateChanged

    private void FoldernotebookStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FoldernotebookStateChanged
        FoldernotebookNum = (Integer)Foldernotebook.getValue();
        FoldernotebookPrice = FOLDERNOTEBOOK_COST * FoldernotebookNum;
        FoldernotebookPriceLabel.setText(FoldernotebookPrice+ "شيكل");
        
        
    }//GEN-LAST:event_FoldernotebookStateChanged

    private void montagedrawStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_montagedrawStateChanged
        montagedrawNum = (Integer) montagedraw.getValue();
        montagedrawPrice  = MONTAGEDRAW_COST * montagedrawNum;
        montagedrawPriceLabel.setText(montagedrawPrice + "شيكل");
        
    }//GEN-LAST:event_montagedrawStateChanged

    private void PincelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PincelStateChanged
        pencilNum = (Integer)Pincel.getValue();
        pencilPrice = PENCIL_COST * pencilNum;
         PincelPriceLabel.setText(pencilPrice + "شيكل");
         
         
                
    }//GEN-LAST:event_PincelStateChanged

    private void DryPenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DryPenStateChanged
        DryPenNum = (Integer)DryPen.getValue();
        DryPenPrice = DRYBEN_COST * DryPenNum;
        DryPenPriceLabel.setText(DryPenPrice + "شيكل");
        
                
    }//GEN-LAST:event_DryPenStateChanged

    private void InkPenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InkPenStateChanged
       InkPenNum = (Integer) InkPen.getValue();
       InkPenPrice = INKPEN_COST * InkPenNum;
       InkPenPriceLabel.setText(InkPenPrice + "شيكل");
    }//GEN-LAST:event_InkPenStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        subtotal = notebookPrice + FoldernotebookPrice + montagedrawPrice + pencilPrice + DryPenPrice + InkPenPrice;
        subtotalLabel.setText("المجموع:" + subtotal + "شيكل");
        vat = subtotal * 0.05;
        vat = vat * 100;
        vat = (double)  ((int) vat);
        vat = vat / 100;
        vatLabel.setText("الضريبة:" + vat + "شيكل");
        
        total = subtotal + vat;
        totalLabel.setText("الاجمالي:" + total + "شيكل");
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try { 
            if(total !=0) { 
                output = new PrintWriter("billNo." + customerCounter + ".txt");
                
                output.println("رقم الفاتورة" + customerCounter );
                output.println(" ==============" );
               
                if (notebookNum !=0 ) {
                output.println(notebookNum + "دفتر عادي");
                output.println(notebookPrice + "شيكل");}
                 
                if(FoldernotebookNum !=0){
                   output.println(FoldernotebookNum + "دفتر مجلد");
                output.println(FoldernotebookPrice + "شيكل"); }
                
                if(montagedrawNum !=0){
                   output.println(montagedrawNum + "كراسة رسم");
                output.println(montagedrawPrice + "شيكل"); }
                
                if(pencilNum !=0){
                   output.println(pencilNum + "أقلام رصاص");
                output.println(pencilPrice + "شيكل"); }
                
                if(DryPenNum !=0){
                   output.println(DryPenNum + "أقلام حبر");
                output.println(DryPenPrice + "شيكل"); }
                if(InkPenNum !=0){
                   output.println(InkPenNum + "أقلام جافة ");
                output.println(InkPenPrice + "شيكل"); }
                
                output.println("");
                output.println("المجموع:" + subtotal + "شيكل");
                output.println("الضريبة:" + vat + "شيكل");
                output.println("الاجمالي:" + total + "شيكل");
                output.println();
                output.println("***شكرا لطلبك***");
                output.close();
                
                
                
                
                
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LibraryWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (total != 0) {
            notebook.setValue(0);
            Foldernotebook.setValue(0);
            montagedraw.setValue(0);
            Pincel.setValue(0);
            DryPen.setValue(0);
            InkPen.setValue(0);
            
            
            subtotalLabel.setText("المجموع: 0.0 شيكل");
            vatLabel.setText("الضريبة: 0.0 شيكل");
            totalLabel.setText("الاجمالي: 0.0 شيكل ");
            
            
            subtotal = 0;
            vat = 0;
            total = 0;
            
            
            customerCounter++;
            customerCounterLabel.setText("رقم الفاتورة:" + customerCounter);
            
            
            
            
            
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner DryPen;
    private javax.swing.JLabel DryPenPriceLabel;
    private javax.swing.JSpinner Foldernotebook;
    private javax.swing.JLabel FoldernotebookPriceLabel;
    private javax.swing.JSpinner InkPen;
    private javax.swing.JLabel InkPenPriceLabel;
    private javax.swing.JSpinner Pincel;
    private javax.swing.JLabel PincelPriceLabel;
    private javax.swing.JLabel customerCounterLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner montagedraw;
    private javax.swing.JLabel montagedrawPriceLabel;
    private javax.swing.JSpinner notebook;
    private javax.swing.JLabel notebookPriceLabel;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel vatLabel;
    // End of variables declaration//GEN-END:variables
}
