package messages;

public class ImportantMessage implements Message {

    private String title;
    private String text;

    public ImportantMessage(String title, String text) {
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
        System.out.println("IMPORTANT Message Alert!!!");
    }

    @Override
    public String toString() {
        return "ImportantMessage{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
