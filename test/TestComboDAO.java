
import com.raven.dao.ComboDAO;
import com.raven.models.Combo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestComboDAO {
    public static void main(String args[]) {
        Combo cb = new Combo(1,"Combo 1", "Bap ngot nuoc", 50000);
        Combo cb1 = new Combo(1, "Combo 1", "Bap nuoc", 100000);
//        ComboDAO.getInstance().insert(cb);
//        ComboDAO.getInstance().update(cb1);
        ComboDAO.getInstance().delete(cb);
    }
}
