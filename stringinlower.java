import java.util.Scanner;

public class stringinlower {
    Scanner sc= new Scanner(System.in);
    public void Input(){
        String str="<html>\n" +
                "<head>\n" +
                "<title> ONLINE BOOK STORES</title>\n" +
                "</head>\n" +
                "<body bgcolor=\"pink\">\n" +
                "<FRAMESET ROWS=\"20%,*\">\n" +
                "<FRAME NAME=\"A2\" SCROLLING=\"YES\" SRC=\"head.html\">\n" +
                "\n" +
                "</FRAMESET><H1 ALIGN=\"CENTER\"><U><FONT COLOR=\"PURPLE\">WELCOME TO ONLINE BOOK SHOPPING<ITALIC></ITALIC>\n" +
                "</U></FONT></H1>\n" +
                "<H2> <FONT COLOR=\"WHITE\"></FONT></H2>\n" +
                "<H3 ALIGN=\"CENTER\"><A HREF=\"reg.html\"><BR><BR>\n" +
                "<FONT COLOR=\"black\"><ITALIC>REGISTRATION FORM</FONT></ITALIC><BR><BR>\n" +
                "<BR><BR><A HREF=\"user profile .html\"><FONT COLOR=\"black\"><ITALIC>USER PROFILE</FONT></ITALIC><BR>\n" +
                "<BR><BR><A HREF=\"user login.html\"><FONT COLOR=\"black\"><ITALIC>USER LOGIN</FONT></ITALIC><BR>\n" +
                "<BR><BR><A HREF=\"book catalog.html\"><FONT COLOR=\"black\"><ITALIC>BOOKS CATALOG</FONT></ITALIC><BR>\n" +
                "<BR><BR><A HREF=\"confim.HTML\"><FONT COLOR=\"black\"><ITALIC>BOOKS CART</FONT></ITALIC><BR>\n" +
                "<BR><BR><A HREF=\"payment.HTML\"><FONT COLOR=\"black\"><ITALIC>PAYMENT</H3></FONT></ITALIC><BR>\n" +
                "</BODY>\n" +
                "</HTML>";
        System.out.println(str.toLowerCase());
    }

    public static void main(String[] args) {
        stringinlower object = new stringinlower();
        object.Input();
    }
}
