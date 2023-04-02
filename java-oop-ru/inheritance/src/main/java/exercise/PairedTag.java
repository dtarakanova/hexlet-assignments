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
        StringBuilder result = new StringBuilder(super.basicResult());
        result.append(body);
        children.forEach(child -> sb.append(child.toString()));
        sb.append("</")
                .append(name)
                .append(">");
        return sb.toString();
    }
}
// END
