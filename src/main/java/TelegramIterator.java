import messages.Message;

import java.util.Iterator;
import java.util.List;

public class TelegramIterator implements Iterator {

    private List<Message> list;
    private TelegramPattern pattern;

    private int currentIndex = -1;
    private int helpIndex = -1;

    public TelegramIterator(List<Message> list, TelegramPattern pattern) {
        this.list = list;
        this.pattern = pattern;
    }

    @Override
    public boolean hasNext() {
        helpIndex = findNext();
        return helpIndex != -1;
    }

    @Override
    public Object next() {
        if(hasNext()){
            currentIndex = helpIndex;
            return list.get(currentIndex);
        }
        return null;
    }

    private int findNext(){
        for(int i = currentIndex+1; i < list.size(); i++){
            if(pattern.checkTitle(list.get(i).getTitle()) && pattern.checkText(list.get(i).getText()))
                return i;
        }
        return -1;
    }

    public void setList(List<Message> list) {
        this.list = list;
    }

    public void setPattern(TelegramPattern pattern) {
        this.pattern = pattern;
    }
}
