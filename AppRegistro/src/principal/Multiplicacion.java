package principal;

public class Multiplicacion extends javax.swing.JFrame {

    public Multiplicacion() {
        initComponents();
        initOthersComponents();
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_nombre = new javax.swing.JPanel();
        etq_texto = new javax.swing.JLabel();
        campo_ingresados = new javax.swing.JPanel();
        etq_tabla = new javax.swing.JLabel();
        campo_tabla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_multiplos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiplicador");

        campo_nombre.setBackground(new java.awt.Color(0, 153, 153));

        etq_texto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etq_texto.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto.setText("TABLA DE MULTIPLICAR");

        javax.swing.GroupLayout campo_nombreLayout = new javax.swing.GroupLayout(campo_nombre);
        campo_nombre.setLayout(campo_nombreLayout);
        campo_nombreLayout.setHorizontalGroup(
            campo_nombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        campo_nombreLayout.setVerticalGroup(
            campo_nombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        campo_ingresados.setBackground(new java.awt.Color(102, 255, 255));

        etq_tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etq_tabla.setForeground(new java.awt.Color(0, 0, 0));
        etq_tabla.setText("Tabla:");

        campo_tabla.setBackground(new java.awt.Color(255, 255, 255));
        campo_tabla.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Multiplos:");

        campo_multiplos.setBackground(new java.awt.Color(255, 255, 255));
        campo_multiplos.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout campo_ingresadosLayout = new javax.swing.GroupLayout(campo_ingresados);
        campo_ingresados.setLayout(campo_ingresadosLayout);
        campo_ingresadosLayout.setHorizontalGroup(
            campo_ingresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campo_ingresadosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(etq_tabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        campo_ingresadosLayout.setVerticalGroup(
            campo_ingresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campo_ingresadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(campo_ingresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        resultado.setBackground(new java.awt.Color(0, 0, 0));
        resultado.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(campo_ingresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_ingresados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int numero = Integer.valueOf( campo_tabla.getText());
       int multiplicador = Integer.valueOf( campo_multiplos.getText());
       
       String html = "<html>";
        for (int i = 1; i <= multiplicador; i++) {
            int resul = numero* i;
            html += numero+" x "+i+" =  "+resul+"<br>" ;
        }
        html += "</html>";
        
        resultado.setText(html);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void initOthersComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel campo_ingresados;
    private javax.swing.JTextField campo_multiplos;
    private javax.swing.JPanel campo_nombre;
    private javax.swing.JTextField campo_tabla;
    private javax.swing.JLabel etq_tabla;
    private javax.swing.JLabel etq_texto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
