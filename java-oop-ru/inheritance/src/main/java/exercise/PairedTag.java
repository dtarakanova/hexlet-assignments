package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;


    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.basicResult());
        result.append(body);
        children.forEach(child -> result.append(child.toString()));
        result.append("</")
                .append(name)
                .append(">");
        return result.toString();
    }
}
// END
