package ArrayListEX;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrList1 = new ArrayList<>();//с типом String
        arrList1.add("Zaur");
        arrList1.add("Semen");
        arrList1.add("Andrew");
        arrList1.add(1,"Ruslan");//вставляем на определённый индекс
        for(String s : arrList1){//каждый элемент s - листа arrList1
            System.out.print(s + " ");
        }
        System.out.println();
        //или
        for(int i = 0;i<arrList1.size();i++){
            System.out.print(arrList1.get(i) + " ");
        }
        System.out.println();

        arrList1.set(0,"Danila(kozel)");
        System.out.println(arrList1);

        arrList1.remove(0);
        //или
        arrList1.remove("Andrew");
        System.out.println(arrList1);
    }
}
