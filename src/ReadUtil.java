import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadUtil {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("task.haoyang.vjms-loading.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List res = new ArrayList();
        String[] array = new String[2];
        while (sc.hasNext()) {
            String s = sc.next();
            if(s.length()>10){
                if (Character.isDigit(s.charAt(0))) {
                    String[] ss = s.split(",");
                    array[0] = ss[0];
                    array[1] = ss[1];
                    res.add(array);
                    System.out.println(array[0]+","+array[1]);
                } else if (Character.isDigit(s.charAt(1))) {
                    s = s.substring(1);
                    String[] ss = s.split(",");
                    array[0] = ss[0];
                    array[1] = ss[1];
                    res.add(array);
                    System.out.println(array[0]+","+array[1]);
                }
            }
        }
    }
}
