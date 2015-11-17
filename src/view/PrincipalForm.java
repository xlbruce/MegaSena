package view;

import controller.Controller;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author bruce
 */
public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    public PrincipalForm() {
        initComponents();
        setTitle("Simulador de jogos da Mega-Sena");
        centralizar();
        jLabelNumeroJogos.setVisible(false);
    }

    private void centralizar() {
        Toolkit tk = getToolkit();
        Dimension screenSize = tk.getScreenSize();
        Dimension size = getSize();
        setBounds((screenSize.width / 2) - (size.width / 2),
                (screenSize.height / 2) - (size.height / 2), size.width, size.height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelJogos = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        jPanelDezenas = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelNumeroJogos = new javax.swing.JLabel();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonJogoAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonParar.setText("Parar");
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPararActionPerformed(evt);
            }
        });

        jLabel2.setText("Insira as dezenas (de 1 a 60)");

        javax.swing.GroupLayout jPanelDezenasLayout = new javax.swing.GroupLayout(jPanelDezenas);
        jPanelDezenas.setLayout(jPanelDezenasLayout);
        jPanelDezenasLayout.setHorizontalGroup(
                jPanelDezenasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDezenasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDezenasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanelDezenasLayout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelDezenasLayout.setVerticalGroup(
                jPanelDezenasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDezenasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDezenasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
        );

        jLabelNumeroJogos.setText("Número de jogos");

        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jButtonJogoAleatorio.setText("Gerar Jogo Aleatório");
        jButtonJogoAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJogoAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelDezenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jLabelNumeroJogos)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButtonParar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButtonReiniciar)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jButtonJogoAleatorio)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanelDezenas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonReiniciar)
                                .addComponent(jButtonParar)
                                .addComponent(jButtonIniciar))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonJogoAleatorio)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNumeroJogos)
                                .addComponent(jLabelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        try {
            updateNumbers();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            return;
        }
        int[] randomIntegers = Controller.getRandomIntegers(MAX_NUMBERS);
        jLabelNumeroJogos.setVisible(true);
        //Evita a duplicação da thread que conta os jogos
        this.jButtonIniciar.setEnabled(false);
        this.jButtonReiniciar.setEnabled(false);
        this.jButtonJogoAleatorio.setEnabled(false);
        this.jLabelJogos.setVisible(true);
        simular(numbers, randomIntegers);
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPararActionPerformed
        //Ativa o botão iniciar
        this.jButtonIniciar.setEnabled(true);
        this.jButtonReiniciar.setEnabled(true);
        this.jButtonJogoAleatorio.setEnabled(true);
        parar();
    }//GEN-LAST:event_jButtonPararActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jButtonJogoAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJogoAleatorioActionPerformed
        this.jogos = 1;
        gerarJogoAleatorio();
    }//GEN-LAST:event_jButtonJogoAleatorioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    static final int MAX_NUMBERS = 6;
    private int[] numbers = new int[MAX_NUMBERS];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonJogoAleatorio;
    private javax.swing.JButton jButtonParar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelJogos;
    private javax.swing.JLabel jLabelNumeroJogos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDezenas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private String formatNumber(long number) {
        NumberFormat format = NumberFormat.getNumberInstance();
        return format.format(number);
    }

    private void parar() {
        t.stop();
    }

    Thread t;
    long jogos = 1;

    private void updateNumbers() throws IllegalArgumentException,
            NumberFormatException {
        Component[] components = jPanelDezenas.getComponents();
        int i = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField tmp = (JTextField) component;
                int num = 0;
                try {
                    num = Integer.parseInt(tmp.getText());
                    if (num < 1 || num > 60) {
                        throw new IllegalArgumentException("Por favor, insira um número entre 1 e 60");
                    }
                } catch (NumberFormatException ex) {
                    throw new NumberFormatException("Por favor, insira um número válido");

                }
                numbers[i++] = num;
                Arrays.sort(numbers);
            }
        }
        if (numbersIsDuplicated()) {
            throw new IllegalArgumentException("Há uma ou mais dezenas duplicadas");
        }
    }

    private void simular(int[] numbers, int[] randomIntegers) {
        t = new Thread(() -> {
            int[] random = randomIntegers.clone();
            while (true) {
                if (Controller.compare(numbers, random)) {
                    JOptionPane.showMessageDialog(this, "Foram necessários " + formatNumber(jogos) + " jogos para ganhar o grande premio!");
                    break;
                } else {
                    this.jLabelJogos.setText(formatNumber(++jogos));
                    random = Controller.getRandomIntegers(MAX_NUMBERS);
                }
            }
        });
        t.start();
    }

    private boolean numbersIsDuplicated() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (Objects.equals(numbers[i], numbers[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private void reiniciar() {
        limparCampos();
        jButtonIniciar.setEnabled(true);
        this.jogos = 1;
        this.jLabelNumeroJogos.setVisible(false);
        this.jLabelJogos.setVisible(false);
    }

    private void limparCampos() {
        JTextField[] numberFields = getNumberFields();
        for (JTextField numberField : numberFields) {
            numberField.setText("");
        }
    }

    private void gerarJogoAleatorio() {
        numbers = Controller.getRandomIntegers(MAX_NUMBERS);
        Arrays.sort(numbers);
        JTextField[] fields = getNumberFields();
        int i = 0;
        for (JTextField field : fields) {
            field.setText(numbers[i++] + "");
        }
    }

    private JTextField[] getNumberFields() {
        Component[] components = jPanelDezenas.getComponents();
        JTextField[] fields = new JTextField[6];
        int i = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                fields[i++] = (JTextField) component;
            }
        }
        return fields;
    }
}
