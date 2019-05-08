import java.util.Scanner;

public class TersCevir {
    public  String Rewerse(String word){
        String result="";
        for (int i=word.length()-1;i>=0;i--)
        {
            //char.At
            result+=word.charAt(i);
        }
        return result;
    }
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        TersCevir t=new TersCevir();
        System.out.println("Kelime Giriniz: ");
        String word=scn.nextLine();
        System.out.println(t.Rewerse(word));
    }

}
