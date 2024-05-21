
import com.raven.dao.NhanVienDAO;
import com.raven.models.NhanVien;
import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestNhanVienDAO {
    public static void main(String args[]) {
        NhanVien nv = new NhanVien("1", "Bao", "Nam", "Quan li", Date.valueOf("2004-04-29"), "dangbao290404@gmail.com", "0356537193");
//        NhanVienDAO.getInstance().insert(nv);
        NhanVien nv1 = new NhanVien("1", "Dang Gia Bao", "Nam", "Nhan vien", Date.valueOf("2004-04-29"), "dangbao290404@gmail.com", "0356537193");
        NhanVienDAO.getInstance().update(nv1);
        NhanVien nv2 = new NhanVien();
        nv2.setIdNhanVien("1");
        NhanVienDAO.getInstance().delete(nv2);
    }
}
