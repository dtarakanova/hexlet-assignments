package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attributes = new HashMap<>();

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
        Stringbuilder result = new StringBuilder("<");
        for (nn : attributes) {
            result.append(name);
            result.append("=\"");
            result.append(nn);
            result.append("\"");
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        result.append(">");
        return result.toString();
    }
}
// END
