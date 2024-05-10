package principal;

import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;

public class PanelListar extends javax.swing.JPanel {

    DefaultTableModel modelo;
    BaseDatos basedatos;
    
    public PanelListar( BaseDatos basedatos) {
        this.basedatos = basedatos;
        
        initComponents();
        initAltherComponents();
        imprimirPersonas();
    }
    
    public void initAltherComponents(){
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(50);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(180);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    
    public void imprimirPersonas(){
        
        Persona lista [] = basedatos.extraerPersonas();
        modelo.setRowCount(0);
        for (int i=0; i<lista.length && lista[i]!=null; i++) {
            String documento = lista[i].getDocumento();
            String nombres = lista[i].getNombres()+" "+lista[i].getApellidos();
            String direccion = lista[i].getDireccion();
            String correo = lista[i].getCorreo();
            
            Object datos[] = new Object[]{ (i+1), documento, nombres, direccion, correo};
            modelo.addRow(datos);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        contenedorPrincipal.setBackground(new java.awt.Color(0, 204, 204));

        etqTitulo.setFont(new java.awt.Font("Impact", 1, 29)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTAR PERSONAS");

        tablaPersonas.setBackground(new java.awt.Color(255, 255, 255));
        tablaPersonas.setForeground(new java.awt.Color(0, 0, 0));
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Cedula", "Nombres", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
