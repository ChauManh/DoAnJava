
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
        Combo cb = new Combo( "Combo 1", "Bap ngot nuoc", 50000);
        ComboDAO.getInstance().insert(cb);
    }
}
