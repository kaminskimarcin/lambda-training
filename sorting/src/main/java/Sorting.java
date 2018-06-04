import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Sorting {
    final String alphabet = "ABCDEFGHIJKLMNOPRST";
    Random random = new Random();
    final int N = alphabet.length();

    public List<String> sortByNameASCWithLambda() {
        List<String> stringList = new ArrayList<>();
        creatingTestList(stringList);
        stringList.sort((n1, n2) -> n1.compareTo(n2));
        return stringList;
    }

    public List<String> sortByNameASCWithNaturalOrder() {
        List<String> stringList = new ArrayList<>();
        creatingTestList(stringList);
        stringList.sort(Comparator.naturalOrder());
        return stringList;
    }

    private void creatingTestList(List<String> stringList) {
        for(int k = 0; k < 10000000; k++) {
            StringBuilder sB = new StringBuilder();
            sB.append(alphabet.charAt(random.nextInt(N)));
            sB.append(alphabet.charAt(random.nextInt(N)));
            sB.append(alphabet.charAt(random.nextInt(N)));
            String test = String.valueOf(sB);
            stringList.add(test);
        }
    }
}
