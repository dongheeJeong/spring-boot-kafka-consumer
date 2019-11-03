package kafkaspringtutorial.demo.model;

public class SimpleObj {

    private String name;
    private String timestamp;

    public SimpleObj() {
        super();
    }

    public SimpleObj(String name, String timestamp) {
        super();
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String toString() {
        return "SimpleObj [name=" + name + ", timestamp=" + timestamp +"]";
    }
}
