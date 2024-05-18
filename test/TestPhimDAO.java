
import com.raven.dao.PhimDAO;
import com.raven.models.Phim;
import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANG GIA BAO
 */
public class TestPhimDAO {
    public static void main(String args[]) {
        Phim p1 = new Phim(1, "LẬT MẶT 7: MỘT ĐIỀU ƯỚC", "Lý Hải", "Một câu chuyện lần đầu được kể bằng tất cả tình yêu, và từ tất cả những hồi ức xao xuyến nhất của đấng sinh thành", "https://cinestar.com.vn/_next/image/?url=https%3A%2F%2Fapi-website.cinestar.com.vn%2Fmedia%2Fwysiwyg%2FPosters%2F04-2024%2Fposter-lat-mat-7.jpg&w=1920&q=75", "https://youtu.be/xHpgjsgKJzo", 18, Date.valueOf("2024-04-20"));
        PhimDAO.getInstance().insert(p1);
        Phim p2 = new Phim(1, "LẬT MẶT 7: MỘT ĐIỀU ƯỚC", "Lý Hải", "Một câu chuyện lần đầu được kể bằng tất cả tình yêu, và từ tất cả những hồi ức xao xuyến nhất của đấng sinh thành", "https://cinestar.com.vn/_next/image/?url=https%3A%2F%2Fapi-website.cinestar.com.vn%2Fmedia%2Fwysiwyg%2FPosters%2F04-2024%2Fposter-lat-mat-7.jpg&w=1920&q=75", "https://youtu.be/xHpgjsgKJzo", 13, Date.valueOf("2024-04-20"));
        PhimDAO.getInstance().update(p2);
    }
}
