package Demo.Demo11231;

import java.util.Scanner;

public class Add {
    public String AddLongInteger(String addend, String augend) {
         if(addend.length() < augend.length()) {
         String t = addend;
         addend = augend;
         augend = t;
 }
        int n1 = addend.length();
        int n2 = augend.length();
        StringBuffer t = new StringBuffer();
        for(int i = 0;i < n1-n2;i++) {
            t.append(0);
        }
        augend = t.append(augend).toString();
        char[] ch = new char[n1+1];
        for(int i = 0;i < n1+1;i++) {
            ch[i] = '0';
        }
        for(int i = n1;i > 0;i--) {
            int a = addend.charAt(i-1)-'0';
            int b = augend.charAt(i-1)-'0';
            int c = ch[i]-'0'+a+b;
            ch[i] = (char)(c%10+'0');
            ch[i-1] = (char)(c/10+'0');
        }
        String str = "";
        if(ch[0] == '0') {
            str = new String(ch,1,ch.length-1);
        } else {
            str = new String(ch);
        }
//        System.out.println(str.length());
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(new Add().AddLongInteger(sc.next(), sc.next()));
        }
    }
}