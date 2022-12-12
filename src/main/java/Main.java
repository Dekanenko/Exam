import messages.ImportantMessage;
import messages.Message;
import messages.SimpleMessage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Message m1 = new SimpleMessage("Simple title1", "some text");
        Message m2 = new SimpleMessage("Advertisement", "some text");
        Message m3 = new SimpleMessage("Title3", "hello!");
        Message m4 = new ImportantMessage("Important!!!", "debt : 10110");
        Message m5 = new ImportantMessage("Bills", "1200");
        Message m6 = new ImportantMessage("Work", "End your project!");

        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);

        User user = new User("Name1", list);
        user.findMessages("!", "\\d");
    }
}
