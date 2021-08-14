import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        HashSet<String> words = new HashSet<>();    //단어의 중복을 막기 위해 HashSet 사용
        for (int i=0; i<num; i++) {
            words.add(br.readLine());
        }
        List<String> wordlist = new ArrayList<>(words); //정렬을 위해 HashSet을 List로 변환
        
        Comparator<String> comparator1 = (o1, o2) -> Integer.compare(o1.compareTo(o2), o2.compareTo(o1));
        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());

        Collections.sort(wordlist, comparator1);    //알파벳 순 정렬
        Collections.sort(wordlist, comparator);     //단어 길이 순 정렬

        for (String i : wordlist)
            System.out.println(i);
    }
}