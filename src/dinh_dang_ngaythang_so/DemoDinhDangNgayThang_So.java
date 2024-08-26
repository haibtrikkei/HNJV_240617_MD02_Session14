package dinh_dang_ngaythang_so;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DemoDinhDangNgayThang_So {
    public static void main(String[] args) {
        Date today1 = new Date();
        LocalDate today2 = LocalDate.now();
        Calendar today3 = Calendar.getInstance();

        System.out.println(today1);
        System.out.println(today2);
        System.out.println(today3);

        System.out.println("Nam hien tai: "+today1.getYear());
        System.out.println("Nam hien tai: "+today2.getYear());
        System.out.println("Nam hien tai: "+today3.get(Calendar.YEAR));
    }
}
