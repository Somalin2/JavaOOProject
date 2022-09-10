package Fitness;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Resigters extends JFrame implements ActionListener {
    JLabel ibtittle,ibid,ibname,ibsubject,ibtime,ibgender;
    JTextField txtid,txtname;
    JRadioButton rbmale,rbfemale;
    JComboBox cbsubject,cbtime;
    JTable tbtable;
    DefaultTableModel model;
    JScrollPane js;
    JButton btnsave,btnrefresh,btnupdate,btndelete,btnexit,btnlogout;
    float price []={0,80,120,90,140,79,50};
    public Resigters(){
        ibtittle = new JLabel("Membership");
        ibtittle.setBounds(230,10,300,50);
        ibtittle.setFont(new Font("",Font.BOLD,34));
        add(ibtittle);
        
        ibid = new JLabel ("ID");
        ibid.setBounds(100,80,300,50);
        ibid.setFont(new Font("", Font.BOLD,18));
        add(ibid);
        txtid = new JTextField();
        txtid.setBounds (200, 80, 300, 40) ;
        txtid.setFont (new Font ("", Font.BOLD, 18));
        add (txtid);
        ibname= new JLabel ("Name") ;
        ibname.setBounds (100, 150, 100, 40) ;
        ibname.setFont (new Font ("", Font.BOLD, 18)) ;
        add (ibname) ;
        txtname = new JTextField();
        txtname. setBounds (200, 150, 300, 40) ;
        txtname. setFont (new Font ("", Font.BOLD, 18)) ;
        add (txtname) ;
        ibgender = new JLabel ("Gender") ;
        ibgender.setBounds(100,220,100,40); 
        ibgender.setFont (new Font ("", Font.BOLD, 18)) ;
        add (ibgender);
        rbmale= new JRadioButton ("Male") ;
        rbmale. setBounds (230, 220, 100, 40) ;
        rbmale. setFont (new Font ("", Font.BOLD, 18)) ;
        add (rbmale);
        rbfemale = new JRadioButton ("Female") ;
        rbfemale.setBounds(350, 220, 100, 40) ;
        rbfemale.setFont (new Font ("", Font.BOLD, 18)) ;
        add (rbfemale);
        ButtonGroup bg = new ButtonGroup () ;
        bg.add (rbmale) ;
        bg. add (rbfemale);
        ibsubject = new JLabel ("Package") ;
        ibsubject.setBounds(100, 290, 100, 40) ;
        ibsubject.setFont(new Font ("", Font.BOLD, 18));
        add (ibsubject);
        String col[]={"Select the course. ", "Training without Trainer ", "Training with Trainer", "Yoga Training", "Yoga Training with Trainer", "Training without Machine"};
        cbsubject = new JComboBox (col) ;
        cbsubject.setBounds (200, 290, 300, 40) ;
        cbsubject.setFont (new Font ("", Font.BOLD,18));
        add (cbsubject);
        ibtime = new JLabel ("Time");
        ibtime.setBounds (100, 360, 100, 40) ;
        ibtime.setFont(new Font ("", Font.BOLD, 18));
        add (ibtime);
        String co1[]={"5-6:30 AM","1-2:30 PM","3-4:30 PM","5-6:30 PM","7-8:30 PM"};
        cbtime = new JComboBox (co1) ;
        cbtime.setBounds (200, 360, 300, 40);
        cbtime.setFont(new Font ("", Font.BOLD, 18)) ;
        add (cbtime) ;
        String col2[]={"ID", "Name", "Gender", "Training course", "Payment","Time"};
        model = new DefaultTableModel() ;
        model.setColumnIdentifiers(col2);
        tbtable = new JTable () ;
        tbtable. setModel (model);
        js = new JScrollPane (tbtable);
        js. setBounds (30, 430, 630, 200) ;
        add (js) ;
        btnsave = new JButton ("Save") ;
        btnsave.setBounds (30, 680, 100, 35) ;
        add (btnsave);
        btnrefresh = new JButton ("Refresh") ;
        btnrefresh.setBounds(160, 680, 100, 35) ;
        add (btnrefresh);
        btnupdate = new JButton ("Update");
        btnupdate.setBounds (290, 680, 100, 35) ;
        add (btnupdate);
        btndelete
        = new JButton ("Delete") ;
        btndelete.setBounds (420, 680, 100, 35);
        add (btndelete);
        btnexit = new JButton ("Exit") ;
        btnexit. setBounds(550, 680, 100, 35);
        add (btnexit);
        btnlogout = new JButton ("Logout");
        btnlogout.setBounds (550, 750, 100, 35) ;
        add (btnlogout);
        btnexit. addActionListener (this) ;
        btnsave.addActionListener (this) ;
        btnrefresh.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnlogout.addActionListener(this);
        setLayout (null) ;
        setSize (700, 900);
        setVisible (true) ;
        setLocationRelativeTo (null) ;
    }
      public static void main (String[] args) {
        new Resigters ();
     }
        void Getdata () {
        for (int i=0;i<List_Member_Register.list.size () ;i++) {
            Object row[]={
        List_Member_Register.list.get(i).getId(),
        List_Member_Register.list.get(i).getName (),
        List_Member_Register.list.get(i).getGender (),
        List_Member_Register.list.get(i).getSubject(),
        List_Member_Register.list.get(i).getPayment (),
        List_Member_Register.list.get(i).getTime(),
        };
        model. addRow(row) ;
        }
        }
        void Clear(){ 
        txtid.setText(null);
        txtname.setText(null);
        rbmale.setSelected(true);
        cbsubject.setSelectedIndex(0);
        cbtime.setSelectedIndex(0);
        }
        void SelectOption (int op){
        int id = Integer.parseInt (txtid.getText ()) ;
        String name = txtname.getText();
        String gender;
        if (rbmale.isSelected()==true){
        gender="Male";
        }else{
        gender="Female";
                }
        String subject = cbsubject.getSelectedItem().toString();
        float payment = price[cbsubject.getSelectedIndex()];
        String time = cbtime.getSelectedItem().toString();
        List_Member_Register stu = new List_Member_Register (id, name, gender,
        subject, payment, time);
        model.setRowCount(0);
        switch(op){
        case 1: {//save
        List_Member_Register.list.add (stu);
        Getdata();
        Clear();
        }break;
        case 2:{//refresh
        }break;
        case 3:{//update
        }break;
        case 4:{//delete
        }break;
 }
}
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btnsave){
        SelectOption(1);
        }else if(e.getSource()== btnrefresh){
        }else if(e.getSource()== btnupdate ){
        }else if(e.getSource()== btnrefresh){
        }else if(e.getSource()== btnexit){
        System.exit(0);
        }else{
            Login l = new Login();
            l.setVisible(true);
            dispose();
        }
    }

} 

