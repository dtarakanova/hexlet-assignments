package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    protected String name;
    protected Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("<");
        for (var nn : attributes.entrySet()) {
            result.append(nn.getName());
            result.append("=\"");
            result.append(nn.getAttributes);
            result.append("\"");
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        result.append(">");
        return result.toString();
    }
}
// END
