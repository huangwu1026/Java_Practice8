package Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> schools = new ArrayList<>();
        schools.add("西工院");
        schools.add("陕科大");
        schools.add("西医院");
        System.out.println(schools);

        //  获取下标 index 位置元素
        System.out.println(schools.get(1));

        // 将下标 index 位置元素设置为 element
        schools.set(0, "西交大");
        schools.set(1, "西工大");
        schools.set(2, "西军电");
        System.out.println(schools);


        //  截取部分 list
        List<String> subschools = schools.subList(0, 2);
        System.out.println(subschools);

        //重新构造
        List<String> schools2 = new ArrayList<>(schools);
        System.out.println(schools2);

        List<String> schools3 = new LinkedList<>(schools);
        System.out.println(schools);

        // 删除 index 位置元素
        schools.remove(0);
        System.out.println(schools);

        //判断 o 是否在线性表中
        System.out.println(schools.contains("西工大"));

        //引用的转换
        ArrayList<String> schools4 = (ArrayList<String>) schools2;
        System.out.println(schools4);
        LinkedList<String> schools5 = (LinkedList<String>)schools3;
        System.out.println(schools5);
    }
}
