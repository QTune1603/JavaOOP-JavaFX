package dangkytinchi;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class dangki extends javax.swing.JFrame {
    private ArrayList<Student> list;
    private int tong;
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    DefaultTableModel model;
    private int stt =0;        
    String[] mon = new String[]{"Hệ điều hành - INT1319","Cơ sở dữ liệu - INT1472", "Hệ điều hành window và linux/unix - INT1515","Lập trình hướng đối tượng - INT1313","Tiếng anh Course 3 plus - BAS1153",
    "Lịch sủ Đảng cộng sản Việt Nam - BAS1160", "Kiến trúc máy tính - INT1332"};
    String[] kip = new String[]{"7:00 - 9:00","10:00 - 11:50","13:00 - 14:50","16:00 - 17:50"};
    String[] sotin = new String[]{"2","3","4"};
    String[] nhomto = new String[]{"1","2","3","4","5","6","7","8","9","10"};
    public dangki() {
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        jComboBox1.setModel(new DefaultComboBoxModel<String>(kip));
        jComboBox2.setModel(new DefaultComboBoxModel<String>(mon));
        jComboBox3.setModel(new DefaultComboBoxModel<String>(sotin));
        jComboBox4.setModel(new DefaultComboBoxModel<String>(nhomto));
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apply = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        ketqua = new javax.swing.JLabel();
        kq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số thứ tự", "Kíp học", "Tên môn học", "Nhóm môn học", " Số tín chỉ", "Thời gian đăng ký"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Kíp học");

        jLabel2.setText("Tên môn học");

        jLabel3.setText("Số tín chỉ");

        apply.setText("Đăng ký");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nhóm tổ");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        delete.setText("Xóa");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        add.setText("Thêm môn học");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        kq.setText("Trạng thái môn đăng ký");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kq))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(ketqua))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kq))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(add)
                                .addGap(29, 29, 29)
                                .addComponent(delete)
                                .addGap(30, 30, 30)
                                .addComponent(apply))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    
    private void applyActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        for(int i=0; i<list.size(); i++){
        Student s = list.get(i);
        String ss = "";
        ss=ss+" "+s.getMa()+" "+s.getTen()+" "+s.getSotin()+"\n";
        String sotins = s.getSotin();
        int sotin = Integer.parseInt(sotins);
        tong+=sotin;
        try (FileWriter writer = new FileWriter("D:\\JavaCode\\btlJava\\Dangkitinchi.txt", true)) {
            writer.write(ss);
            System.out.println("Ghi vào file thành công.");
        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi ghi vào file: " + e.getMessage());
        }
        }
        String temp="";
        int x = jTable1.getRowCount();
        String nmon = x +"";
        String st = tong+"";
        temp = temp + "Tổng số môn học là "+nmon+" ,số tín chỉ "+st;
        kq.setText(temp);
    }                                     

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int row = jTable1.getSelectedRow();
        if(row>=0 && row<jTable1.getRowCount()){
            list.remove(row);
            ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        }else{
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        }
        // TODO add your handling code here:
    }                                      

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        // TODO add your handling code here:
    }                                    

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String ma = jComboBox1.getSelectedItem().toString();
        String mon = jComboBox2.getSelectedItem().toString();
        String sotin = jComboBox3.getSelectedItem().toString();
        String nhomto = jComboBox4.getSelectedItem().toString();
        Student st = new Student(ma, mon, sotin, nhomto);
        list.add(st);
        stt++;
        showResult();
        for (int i = 0; i < jTable1.getColumnCount(); i++) 
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); // Áp dụng kiểu căn giữa cho tất cả các cột
    }                                   
    public void showResult(){
        Student s = list.get(list.size()-1);
        LocalDateTime thoiGianHienTai = LocalDateTime.now();
        DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String chuoiThoiGian = thoiGianHienTai.format(dinhDang);
        model.addRow(new Object[]{
            stt,s.getMa(),s.getTen(), s.getNhomto() ,s.getSotin(), chuoiThoiGian
        });
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangki().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton add;
    private javax.swing.JButton apply;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ketqua;
    private javax.swing.JLabel kq;
    // End of variables declaration                   
}