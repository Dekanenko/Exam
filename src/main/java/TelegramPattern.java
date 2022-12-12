import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelegramPattern {
    private String titlePattern;
    private String textPattern;

    public TelegramPattern() {
    }

    public TelegramPattern(String titlePattern, String textPattern) {
        this.titlePattern = titlePattern;
        this.textPattern = textPattern;
    }

    public boolean checkTitle(String title){
        if(titlePattern == null)
            return true;
        Pattern pattern = Pattern.compile(titlePattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(title);
        return matcher.find();
    }

    public boolean checkText(String text){
        if(textPattern == null)
            return true;
        Pattern pattern = Pattern.compile(textPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public String getTitlePattern() {
        return titlePattern;
    }

    public String getTextPattern() {
        return textPattern;
    }

    public void setTitlePattern(String titlePattern) {
        this.titlePattern = titlePattern;
    }

    public void setTextPattern(String textPattern) {
        this.textPattern = textPattern;
    }
}
