/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoNewtonRaphson;

import PantallaInicio.MetodosNumericos;
import PantallaInicio.datos;
import PantallaInicio.derivada;
import PantallaInicio.derivadaString;
import PantallaInicio.metodo;
import java.awt.Color;
import java.awt.Menu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 *
 * @author Montserrat Dominguez
 */
public class NewtonRaphson extends javax.swing.JFrame implements Runnable{
    String hora,minuto,segundo;
    Thread hilo;
    int xm , ym;

    /**
     * Creates new form NewtonRaphson
     */
    public NewtonRaphson() {
        initComponents();
        this.setLocationRelativeTo(null);// al momento de ejecutar la aplicacion lo ventana se  centra en la pantalla 
        this.setResizable(false); // no se puede aumentar el tamaño de la pantalla
        lbfecha.setText(fecha());
        hilo= new Thread(this);
        hilo.start();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaActual= new Date();
        calendario.setTime(horaActual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minuto=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundo=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    
    }
    
    
    public void run(){
        Thread current = Thread.currentThread();
        
        while(current==hilo){
            hora();
            lbhora.setText(hora+":"+minuto+":"+segundo);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeroEvaluar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        repeticiones = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        MostrarRaiz = new javax.swing.JLabel();
        imprimirEcInt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DerivadaDeLaEcuacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(26, 58, 69));
        jPanel1.setForeground(new java.awt.Color(102, 255, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        lbhora.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("00:00:00");

        lbfecha.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD/MM/AAAA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/metodos numericos- cabecera.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbhora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(102, 102, 102)
                .addComponent(lbfecha)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora)
                    .addComponent(lbfecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(28, 62, 74));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newton raphson.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ecuación");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Posible raíz (Tabulando)");

        numeroEvaluar.setBackground(new java.awt.Color(26, 58, 69));
        numeroEvaluar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        numeroEvaluar.setForeground(new java.awt.Color(255, 255, 255));
        numeroEvaluar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        numeroEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroEvaluarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero de iteraciones");

        repeticiones.setBackground(new java.awt.Color(26, 58, 69));
        repeticiones.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        repeticiones.setForeground(new java.awt.Color(255, 255, 255));
        repeticiones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        repeticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeticionesActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(26, 58, 69));
        jButton5.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Calcular");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RAIZ :");

        MostrarRaiz.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        MostrarRaiz.setForeground(new java.awt.Color(255, 255, 255));

        imprimirEcInt.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        imprimirEcInt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grado:");

        grado.setBackground(new java.awt.Color(26, 58, 69));
        grado.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        grado.setForeground(new java.awt.Color(255, 255, 255));
        grado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Derivada");

        DerivadaDeLaEcuacion.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        DerivadaDeLaEcuacion.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(26, 58, 69));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Borrar datos");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(415, 415, 415)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(415, 415, 415)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(415, 415, 415)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DerivadaDeLaEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(imprimirEcInt, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(MostrarRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(numeroEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(repeticiones))
                                            .addComponent(jLabel8))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(imprimirEcInt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addComponent(DerivadaDeLaEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MostrarRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(26, 58, 69));

        jButton2.setBackground(new java.awt.Color(26, 58, 69));
        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGRESAR");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroEvaluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroEvaluarActionPerformed

    private void repeticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeticionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repeticionesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int grad = Integer.parseInt(grado.getText());
        float[] coeficientes = new float[grad+1];
        float numEva= Float.parseFloat(numeroEvaluar.getText());
        int repe= Integer.parseInt(repeticiones.getText());
        
        
        for(int i=0;i<=grad;i++){ 
            System.out.println("i: "+i);
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de x^"+(grad-i)));
            System.out.println(valor);
            coeficientes[i]=valor;
        }
        
        datos Mostrar = new datos();
        
        imprimirEcInt.setText(Mostrar.MostrarEcuacionIntroducida(coeficientes));
        derivada derivar = new derivada();
        derivadaString stringDerivada = new derivadaString();
        
        
        DerivadaDeLaEcuacion.setText(stringDerivada.derivarString(grad, coeficientes));
        derivar.derivar(grad, coeficientes);
        
        metodo  newtonRaphson= new metodo();
        float x = newtonRaphson.NewtonRaphson(numEva, coeficientes, grad, repe);
        String raiz = Float.toString(x);
        MostrarRaiz.setText(raiz);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarRaiz.setText("");
        imprimirEcInt.setText("");
        DerivadaDeLaEcuacion.setText("");
        numeroEvaluar.setText("");
        repeticiones.setText("");
        grado.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(new Color(21,45,54));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new Color(26,58,69));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         MetodosNumericos inicio = new MetodosNumericos();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
          xm = evt.getX();
          ym = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xm, y-ym);
    }//GEN-LAST:event_jPanel1MouseDragged

    public static String fecha(){
        Date fecha= new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DerivadaDeLaEcuacion;
    private javax.swing.JLabel MostrarRaiz;
    private javax.swing.JTextField grado;
    private javax.swing.JLabel imprimirEcInt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbhora;
    private javax.swing.JTextField numeroEvaluar;
    private javax.swing.JTextField repeticiones;
    // End of variables declaration//GEN-END:variables
}