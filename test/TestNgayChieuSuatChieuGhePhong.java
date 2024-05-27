
import com.raven.dao.NgayChieuSuatChieuGhePhongDAO;
import com.raven.models.NgayChieuSuatChieuGhePhong;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestNgayChieuSuatChieuGhePhong {
    public static void main(String []args) {
        for(int i = 0; i < 140; i++) {
            NgayChieuSuatChieuGhePhong a = new NgayChieuSuatChieuGhePhong(i, "Phòng 1", 1);
            NgayChieuSuatChieuGhePhongDAO.getInstance().insert(a);
        }
    }
}
