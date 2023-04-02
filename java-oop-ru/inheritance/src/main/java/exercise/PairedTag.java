package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;


    public PairedTag (String name, Map<String,String> attributes, String body, List<Tag> children){
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<");
        result.append(name);

        for (Tag tag : children) {
            result.append(tag.toString());
        }
        String childrenString = sb.toString();

        return "<" + name + attributesToString() + ">" + body + childrenString + "</" + name + ">";
    }
}
// END
