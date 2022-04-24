package domain;

public class Log {

    String type;
    int count;

    public int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Log(String type, int count) {
        this.type = type;
        this.count = count;
    }
}
