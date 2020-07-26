package in.teja;

public class Deleting_A {
    String removeA(String s) {
        int length = s.length();
        String result = "";
        if(length >= 2) {
            if(s.charAt(0)=='a' && s.charAt(1)=='a')
                result = s.substring(2,length);
            else if(s.charAt(0)=='a' && s.charAt(1)!='a')
                result = s.substring(1,length);
            else if(s.charAt(0)!='a' && s.charAt(1)=='a')
                result = s.charAt(0) + s.substring(2,length);
            else
                result = s;
        }
        return result;
    }
}
