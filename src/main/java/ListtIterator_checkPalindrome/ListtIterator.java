package ListtIterator_checkPalindrome;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListtIterator {
    //проверка на палиндрому
    public static void main(String[] args) {
        String s = "madam";
        //лист чаров
        List<Character> charList = new LinkedList<>();
        //toCharArray - конвертирует стринг в массив чаров
        //        for (int i = 0; i < s.toCharArray().length;i++){//перебираем строку мадам
//            charList.add(s.toCharArray()[i]);
//        }
        //или
        for (char ch : s.toCharArray()){//перебираем строку мадам
            charList.add(ch);
        }
        System.out.println(charList);
        ListIterator<Character> iterator = charList.listIterator();
        ListIterator<Character> reverseIterator = charList.listIterator(charList.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
