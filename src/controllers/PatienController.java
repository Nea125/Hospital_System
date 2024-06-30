
package controllers;
import DB.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class PatienController {
    
    ConnectionDB db = new ConnectionDB();  
    PreparedStatement ps;
    ResultSet r;
    String sql;
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon iconerr = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    String grade;
    double averager,total;
    String col[]={"PatientID","FirstName","LasteName","Age","Gender","Address","Phone","BirthDate"};
    DefaultTableModel model = new DefaultTableModel(col, 0);
    public DefaultTableModel getModel(){
       return model;
    }
 
  
  public void Save(String fireName, String lastName, int Age, String gener, String Address,String Phone, String BirthDate)
   {
     
       try {
           sql = "INSERT INTO tbpatient(FirstName, LastName, Age, Gender, Address,  Phone, BirthDate) VALUES (?,?,?,?,?,?,?)";
           ps = db.connection().prepareStatement(sql);
           ps.setString(1,fireName);
           ps.setString(2, lastName);
           ps.setInt(3, Age);
           ps.setString(4, gener);
           ps.setString(5, Address);
           ps.setString(6, Phone);
           ps.setString(7, BirthDate);
 
           int index = ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Saved","Save", index, icon);
           }
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public void FetchData()
   {
       try {
           sql = "SELECT *FROM tbpatient";
           ps = db.connection().prepareStatement(sql);
           r = ps.executeQuery();
           model.setRowCount(0);
           while(r.next())
           {
               Object row[]={
                   r.getInt("PatientID"),
                   r.getString("FirstName"),
                   r.getString("LastName"),
                   r.getInt("Age"),
                   r.getString("Gender"),
                   r.getString("Address"),
                   r.getString("Phone"),
                   r.getString("BirthDate"),
               };
               model.addRow(row);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public void Update(String fireName,String lastName,int Age,String gender,String address,String birthDate,String phone,int id)
   {
       
       try {
           sql="UPDATE tbpatient SET FirstName =?, LastName =?, Age =?, Gender =?, Address =?,Phone=?,BirthDate=? WHERE PatientID=?";
           ps = db.connection().prepareStatement(sql);
           ps.setString(1,fireName);
           ps.setString(2, lastName);
           ps.setInt(3, Age);
           ps.setString(4, gender);
           ps.setString(5, address);
           ps.setString(6, phone);
           ps.setString(7, birthDate);
        
           ps.setInt(8, id);
           int index = ps.executeUpdate();
           if(index>0)
           {
               
               JOptionPane.showMessageDialog(null,"Data Updated","Save", index, icon);
               
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public void Remove(int id)
   {
       try {
           sql = "DELETE FROM tbpatient WHERE PatientID =?";
           ps = db.connection().prepareStatement(sql);
           ps.setInt(1, id);
           int index=ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Removed","Save", index, icon);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public void Reset()
   {
       try {
           sql = "DELETE FROM tbpatient";
           ps = db.connection().prepareStatement(sql);
           int index=ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Reseted","Save", index, icon);
           }
           
       } catch (Exception e){  
           
           JOptionPane.showMessageDialog(null, e);
       }
   }
}



