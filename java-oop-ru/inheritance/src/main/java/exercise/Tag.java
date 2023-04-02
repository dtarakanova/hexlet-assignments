package exercise;

import java.util.Map;

// BEGIN
public class Tag {
    protected String name;
    protected Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String basicResult() {
        StringBuilder result = new StringBuilder("<");
        result.append(name);
        result.append(" ");
        for (var nn : attributes.entrySet()) {
            result.append(nn.getKey());
            result.append("=\"");
            result.append(nn.getValue());
            result.append("\"");
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        result.append(">");
        return result.toString();
    }
}
// END
