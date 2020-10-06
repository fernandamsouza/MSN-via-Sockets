
package trabalhofinal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame implements ObservadorDeMensagem{

    public principal() {

        initComponents();
        Servidor.getInstance().setObservadorDeMensagem(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat = new javax.swing.JPanel();
        topInfo = new javax.swing.JPanel();
        nomeUsuario = new javax.swing.JLabel();
        nomeDestino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeDestino1 = new javax.swing.JLabel();
        chatBoxx = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        campoMensagem = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuariosOnline = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MSN");

        topInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        topInfo.setEnabled(false);

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeUsuario.setPreferredSize(new java.awt.Dimension(41, 18));

        nomeDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeDestino.setPreferredSize(new java.awt.Dimension(0, 17));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome de usuário: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Destinatario:");
        jLabel2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Status:");
        jLabel3.setEnabled(false);

        nomeDestino1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeDestino1.setPreferredSize(new java.awt.Dimension(0, 17));

        javax.swing.GroupLayout topInfoLayout = new javax.swing.GroupLayout(topInfo);
        topInfo.setLayout(topInfoLayout);
        topInfoLayout.setHorizontalGroup(
            topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topInfoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(topInfoLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(topInfoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(132, 132, 132))
        );
        topInfoLayout.setVerticalGroup(
            topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topInfoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nomeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(topInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nomeDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chatBoxx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chatBoxx.setEnabled(false);
        chatBoxx.setLayout(new java.awt.BorderLayout(0, 10));

        chatBox.setEditable(false);
        chatBox.setColumns(20);
        chatBox.setRows(5);
        chatBox.setEnabled(false);
        chatBox.setFocusable(false);
        jScrollPane1.setViewportView(chatBox);

        chatBoxx.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(79, 30));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        campoMensagem.setEnabled(false);
        campoMensagem.setPreferredSize(new java.awt.Dimension(10, 20));
        campoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMensagemActionPerformed(evt);
            }
        });
        jPanel2.add(campoMensagem);

        botaoEnviar.setText("Enviar");
        botaoEnviar.setEnabled(false);
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoEnviar);

        chatBoxx.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Usuários online", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        usuariosOnline.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usuariosOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariosOnlineMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(usuariosOnline);

        javax.swing.GroupLayout chatLayout = new javax.swing.GroupLayout(chat);
        chat.setLayout(chatLayout);
        chatLayout.setHorizontalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chatBoxx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        chatLayout.setVerticalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(chatLayout.createSequentialGroup()
                        .addComponent(topInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chatBoxx, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(chat, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Usuário");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosOnlineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosOnlineMousePressed
        if (!usuariosOnline.getSelectedValue().equals("")) {
            String nomeDestino = usuariosOnline.getSelectedValue();
            this.nomeDestino.setText(nomeDestino);
            ativar(true);  
        
        }
    }//GEN-LAST:event_usuariosOnlineMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        login ab = new login();
        ab.setVisible(true);
        ab.setLocationRelativeTo(null);
        //Servidor.getInstance().interrupt();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        String a = campoMensagem.getText();
        chatBox.append(" "+nomeUsuario.getText()+" -> "+a+"\n");
        try {
            Servidor.getInstance().enviarMensagemPara(usuariosOnline.getSelectedValue(), a);
            campoMensagem.setText("");
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void campoMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMensagemActionPerformed
        if (!campoMensagem.getText().equals("")){
            botaoEnviarActionPerformed(evt);

        }
    }//GEN-LAST:event_campoMensagemActionPerformed


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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JTextField campoMensagem;
    private javax.swing.JPanel chat;
    private javax.swing.JTextArea chatBox;
    private javax.swing.JPanel chatBoxx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeDestino;
    private javax.swing.JLabel nomeDestino1;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel topInfo;
    private javax.swing.JList<String> usuariosOnline;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onMessageArrive(String message) {
        String [] array = message.split("->");
        if(array[0].equalsIgnoreCase("servidor")) {
            usuariosOnline.setListData(array[2].split(","));
        }
        chatBox.append(message + "\n");
    }
    public void setarNome(String nome) {
        nomeUsuario.setText(nome);
    }

    /*ativa/desativa campos no menu principal.*/
    public void ativar(boolean a){
        jLabel2.setEnabled(a);
        jLabel3.setEnabled(a);
        chatBox.setEnabled(a);
        campoMensagem.setEnabled(a);
        botaoEnviar.setEnabled(a);
    }
}