package study.code.sort1;

import java.util.*;

public class ListSortExam02 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // 랜덤 클래스 선언!
        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            // nextInt(값); 0 <= x < 값 + 1 --> 1 <= x <= 50
            list.add(rand.nextInt(30) + 1);
        }

        System.out.println("정렬 전 : " + list);

        // collections을 이용한 정렬기능
        Collections.sort(list);

        System.out.println("오름 차순 정렬 후 : " + list);

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println("내림 차순 정렬 후 : " + list);
    }
}