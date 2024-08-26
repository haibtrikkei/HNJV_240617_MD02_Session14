package demo_lambda;

import java.util.Arrays;
import java.util.List;

public class SuDungVoiCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nguyen Van Dong","Tran Duc Nam","Bui Tien Manh","Le Van Cuong");
        //Duyet danh sach va tao email theo cu phap:  Nguyen Van Dong -> dong.nv@gmail.com

        list.forEach(fullName->{
            String[] list1 = fullName.split(" ");
            String email = list1[list1.length-1];
            email +=".";
            for(int i=0;i<list1.length-1;i++){
                email += list1[i].charAt(0);
            }
            email +="@gmail.com";
            System.out.println(email.toLowerCase());
        });
    }
}
