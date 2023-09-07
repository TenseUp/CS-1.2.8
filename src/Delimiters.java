import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<>();
        for (String i : tokens) {
            if (i.equals(openDel) || i.equals(closeDel)) {
                delimiters.add(i);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int ount = 0;
        for (String i : delimiters) {
            if (i.equals(openDel)) {
                ount++;
            } else if (i.equals(closeDel)) {
                ount--;
                if (ount < 0) {
                    return false;
                }
            }
        }
        return ount == 0;
    }

    public String getCloseDel() {
        return closeDel;
    }

    public String getOpenDel() {
        return openDel;
    }
}