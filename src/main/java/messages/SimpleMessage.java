package messages;

public class SimpleMessage implements Message {

    private String title;
    private String text;

    public SimpleMessage(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void alert() {
        System.out.println("Simple Message Alert!!!");
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
