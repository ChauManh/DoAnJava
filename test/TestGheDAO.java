
import com.raven.dao.GheDAO;
import com.raven.dao.PhongDAO;
import com.raven.models.Ghe;
import com.raven.models.Phong;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestGheDAO {
    public static void main(String args[]) {
        for(int i = 0; i < 98; i++) {
            Ghe g = new Ghe(""+i, "Thường", 40000, "Phòng 1");
            GheDAO.getInstance().insert(g);
        }
        for(int i = 98; i < 126; i++) {
            Ghe g = new Ghe(""+i, "Vip", 60000, "Phòng 1");
            GheDAO.getInstance().insert(g);
        }
        for(int i = 126; i < 140; i++) {
            Ghe g = new Ghe(""+i, "Couple", 100000, "Phòng 1");
            GheDAO.getInstance().insert(g);
        }
    }
}
