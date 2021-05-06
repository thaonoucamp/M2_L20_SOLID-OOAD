package management_traffic.behavioral;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matches {
    public boolean matches(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(regex);
        if (match.matches()) {
            return true;
        }
        return false;
    }
}
