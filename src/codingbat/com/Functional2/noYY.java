package codingbat.com.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class noYY {

//    Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
//
//    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
//    noYY(["a", "b", "cy"]) → ["ay", "by"]
//    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]

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
