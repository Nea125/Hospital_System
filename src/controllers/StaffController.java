
package controllers;
import DB.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class StaffController {

    ConnectionDB db = new ConnectionDB();  
    PreparedStatement ps;
    ResultSet r;
    String sql;
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon iconerr = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    String grade;
    double averager,total;
    String col[]={"StaffID","FirstName","LasteName","Age","Sex","BirthDate","StaffPossition","Address","Email","Phone","HireDate","WorkStatus"};
    DefaultTableModel model = new DefaultTableModel(col, 0);
    public DefaultTableModel getModel(){
       return model;
    }
 
  
  public void Save(String fireName, String lastName, int Age, String sex, String BirthDate, String staffPossition, String Address, String Email, String Phone, String HireDate, int WorkStatus)
   {
     
       try {
           sql = "INSERT INTO tbstaff(FirstName, LastName, Age, Sex, BirthDate, StaffPossition, Address, Email, Phone, HireDate, WorkStatus) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
           ps = db.connection().prepareStatement(sql);
           ps.setString(1,fireName);
           ps.setString(2, lastName);
           ps.setInt(3, Age);
           ps.setString(4, sex);
           ps.setString(5, BirthDate);
           ps.setString(6, staffPossition);
           ps.setString(7, Address);
           ps.setString(8, Email);
           ps.setString(9, Phone);
           ps.setString(10, HireDate);
           ps.setInt(11, WorkStatus);
 
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
           sql = "SELECT *FROM tbstaff";
           ps = db.connection().prepareStatement(sql);
           r = ps.executeQuery();
           model.setRowCount(0);
           while(r.next())
           {
               Object row[]={
                   r.getInt("StaffID"),
                   r.getString("FirstName"),
                   r.getString("LastName"),
                   r.getInt("Age"),
                   r.getString("Sex"),
                   r.getString("BirthDate"),
                   r.getString("StaffPossition"),
                   r.getString("Address"),
                   r.getString("Phone"),
                   r.getString("Email"),
                   r.getString("HireDate"),
                   r.getInt("WorkStatus")
               };
               model.addRow(row);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
  public void Update(String fireName,String lastName,int Age,String sex,String BirthDate,String staffPossition,String Address,String Email,String Phone,String HireDate,int WorkStatus,int Id)
   {
       
       try {
           sql="UPDATE tbstaff SET FirstName =?, LastName =?, Age =?, Sex =?, BirthDate =?,StaffPossition=?,Address=?,Email=?,Phone=?,HireDate=?,WorkStatus=? WHERE  staffID=?";
           ps = db.connection().prepareStatement(sql);
           ps.setString(1,fireName);
           ps.setString(2, lastName);
           ps.setInt(3, Age);
           ps.setString(4, sex);
           ps.setString(5, BirthDate);
           ps.setString(6, staffPossition);
           ps.setString(7, Address);
           ps.setString(8, Email);
           ps.setString(9, Phone);
           ps.setString(10, HireDate);
           ps.setInt(11, WorkStatus);
           ps.setInt(12, Id);
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
           sql = "DELETE FROM tbstaff WHERE staffID =?";
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
           sql = "DELETE FROM tbstaff";
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

