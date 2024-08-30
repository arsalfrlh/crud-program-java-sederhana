/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//kelas mahasiswa
public class data_mahasiswa extends javax.swing.JFrame {
    //function dan kelas mahasiswa
    public data_mahasiswa() {
        initComponents();
        tampil(); //kelas tampil
        kosong(); //keals tambah
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_jurusan = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_nim = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_nama = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_no = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("Nama");

        jLabel3.setText("Nim");

        jLabel4.setText("Alamat");

        cmb_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatika", "Informasi", "Teknik Industri", "Teknik Sipil" }));
        cmb_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jurusanActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txt_nim);

        jScrollPane5.setViewportView(txt_nama);

        jScrollPane6.setViewportView(txt_alamat);

        jLabel5.setText("Jurusan");

        jLabel6.setText("No Telp");

        jScrollPane7.setViewportView(txt_no);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane7))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane6)
                                .addComponent(cmb_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambah)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(jButton4))
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambah))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(edit)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hapus)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_jurusanActionPerformed

    //function dan kelas hapus data
    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try{
            String query = "DELETE FROM tbl_mahasiswa WHERE nim='"+txt_nim.getText()+"'"; //query untuk menghapus data
            java.sql.Connection koneksi = Crud.configDB(); //nama file "Crud" dan kelas "configDB"
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus data");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tampil(); //setelah mengubah form maka akan menampilkan data secara otomatis
        kosong(); //setelah mengubah form maka akan mengosongkan isi dari form secara otomatis
    }//GEN-LAST:event_hapusActionPerformed

    //function dan kelas tabel tampil data
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nim");
        model.addColumn("Nama");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        model.addColumn("No Telp");
        
        try{
            int no = 1;
            String query = "SELECT * FROM tbl_mahasiswa"; //query untuk menampilkan data
            java.sql.Connection koneksi = Crud.configDB(); //nama file "Crud" dan nama kelas "configDB"
            java.sql.Statement sql = koneksi.createStatement();
            java.sql.ResultSet result = sql.executeQuery(query);
            while(result.next()){ //perulangan while
                model.addRow(new Object[]{no++,result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)}); //mengambil data dari database dan menampilkannya
            }
            tabel.setModel(model);
        }catch(Exception e){
            
        }
    }
    
    //function dan kelas untuk mengosongkan data
    //setelah menambahkan data maka akan menghilagkan isi dari form
    public void kosong(){
        txt_nim.setText(null);
        txt_nama.setText(null);
        txt_alamat.setText(null);
        txt_no.setText(null);
        cmb_jurusan.setSelectedItem(this);
    }
    
    //function dan kelas tambah data
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
    try{
        String query = "INSERT INTO tbl_mahasiswa VALUES ('"+txt_nim.getText()+"','"+txt_nama.getText()+"','"+cmb_jurusan.getSelectedItem()+"','"+txt_alamat.getText()+"','"+txt_no.getText()+"')"; //query untuk menambahkan data
        java.sql.Connection koneksi = Crud.configDB(); //nama file "Crud" dan nama kelas "configDB"
        java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Tambah Berhasil");//menampilkan pesan ketika berhasil menambahkan data
    }catch (Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    tampil(); //setelah mengisi form maka akan menampilkan data secara otomatis
    kosong(); //setelah mengisi form maka akan mengosongkan isi dari form secara otomatis
    }//GEN-LAST:event_tambahActionPerformed

    //function dan kelas untuk menampilkan data pada tabel yang di pilih/di klik
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.rowAtPoint(evt.getPoint());
        String nim = tabel.getValueAt(baris,1).toString();//mengambil data dari tabel dan menyimpannya sebagai string nim
        txt_nim.setText(nim); //menampilkan data dari string nim dan menampilkannya pada form
        String nama = tabel.getValueAt(baris,2).toString();
        txt_nama.setText(nama);
        String jurusan = tabel.getValueAt(baris,3).toString();
        cmb_jurusan.setSelectedItem(jurusan);
        String alamat = tabel.getValueAt(baris,4).toString();
        txt_alamat.setText(alamat);
        String no_telp = tabel.getValueAt(baris, 5).toString();
        txt_no.setText(no_telp);
    }//GEN-LAST:event_tabelMouseClicked

    //function dan kelas edit data
    //note nim adalah primary key dan jika anda mengubahnya maka tidak berhasil di update
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            String query = "UPDATE tbl_mahasiswa SET nama = '"+txt_nama.getText()+"', nim = '"+txt_nim.getText()+"', jurusan = '"+cmb_jurusan.getSelectedItem()+"', alamat = '"+txt_alamat.getText()+"', no_telp = '"+txt_no.getText()+"' WHERE nim = '"+txt_nim.getText()+"'"; //query untuk update data
            java.sql.Connection koneksi = Crud.configDB(); //nama file Crud dan kelas configDB
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"data berhasil di edit"); //menampilkan pesan ketika berhasil di update
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Edit Gagal"+e.getMessage()); //menampilkan pesan ketika gagal di update
        }
        tampil(); //setelah mengubah form maka akan menampilkan data secara otomatis
        kosong(); //setelah mengubah form maka akan mengosongkan isi dari form secara otomatis
    }//GEN-LAST:event_editActionPerformed

    //function dan kelas clear
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        kosong();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_jurusan;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JTextPane txt_alamat;
    private javax.swing.JTextPane txt_nama;
    private javax.swing.JTextPane txt_nim;
    private javax.swing.JTextPane txt_no;
    // End of variables declaration//GEN-END:variables
}
