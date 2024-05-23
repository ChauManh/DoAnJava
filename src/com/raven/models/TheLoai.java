
package com.raven.models;

import java.util.ArrayList;

public class TheLoai {
    private int idTheLoai;
    private String tenTheLoai;
    
    public TheLoai() {
        
    }

    public TheLoai(int idTheLoai, String tenTheLoai) {
        this.idTheLoai = idTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
 
    public static ArrayList getDSTheLoai(){
		String[] arr_theloai = {"Hành động",
                                    "Phiêu lưu, mạo hiểm",
                                    "Tiểu sử",
                                    "Hoạt hình",
                                    "Hài",
                                    "Trinh thám",
                                    "Hình sự",
                                    "tài liệu",
                                    "Chính kịch",
                                    "Gia đình",
                                    "Cổ trang",
                                    "Kinh dị",
                                    "Ca nhạc",
                                    "Tâm lý tình cảm",
                                    "Khoa học viễn tưởng",
                                    "Giật gân, ly kỳ",
                                    "Bi kịch",
                                    "Chiến tranh"};
		

		ArrayList listTheLoai = new ArrayList();
		int i = 0;
		for (String tenTinh : arr_theloai) {
			TheLoai t = new TheLoai(i, tenTinh);
			listTheLoai.add(t);
		}
		return listTheLoai;
	}

	public static TheLoai getTheLoaiById(int idTheLoai) {
                ArrayList<TheLoai> listTheLoai = TheLoai.getDSTheLoai();
                if (idTheLoai >= 0 && idTheLoai < listTheLoai.size()) {
                    return listTheLoai.get(idTheLoai);
                } else {
                    return null; 
                }
            }
	public static TheLoai getTheLoaiByTenTheLoai(String tenTheLoai) {
                ArrayList<TheLoai> listTheLoai = TheLoai.getDSTheLoai();
                if (listTheLoai != null) {
                    for (TheLoai theloai : listTheLoai) {
                        if (theloai.getTenTheLoai().equals(tenTheLoai)) {
                            return theloai;
                        }
                    }
                }
                return null; 
            }
    
}
