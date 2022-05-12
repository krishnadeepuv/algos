public class BracketsAdd {
    public int minAddToMakeValid(String s) {

        String temp = s;
        for (int i = 0; i < s.length(); i++) {
            temp = temp.replace("()", "");
            if (temp == temp.replace("()", ""))
                break;
        }

        return temp.length();
    }
}