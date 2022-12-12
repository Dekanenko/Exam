import messages.Message;

import java.util.List;

public class User {
    private String nickname;
    private List<Message> messages;

    public User(String nickname, List<Message> messages) {
        this.nickname = nickname;
        this.messages = messages;
    }

    public void findMessages(String title, String text){
        TelegramIterator iter = new TelegramIterator(messages, new TelegramPattern(title, text));
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public String getNickname() {
        return nickname;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
