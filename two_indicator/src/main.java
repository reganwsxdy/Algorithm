import java.util.List;

public class main {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> d = List.of("ale","apple","monkey","plea");
        Longest_word LongestWord = new Longest_word();
        String ls = LongestWord.findLongestWord(s,d);
        System.out.println(ls);

    }
}
