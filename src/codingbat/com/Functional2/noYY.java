package codingbat.com.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {

    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n->n+"y");
        strings.removeIf(n->n.contains("yy"));
        return strings;
    }

    //or

    public List<String> noYY1(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

}
