package pl.mateusz.siedlecki.programowanie1.JavaStart.LambdaIInterfejsy;

import java.util.function.Function;

public class LowerCases {

    public static void main(String[] args) {
        //pobieramy tekst i zamieniamy wszystkie znaki na małe litery i ucianymy białe znaki na początku i na końcu
        String original = "   WIELKI NAPIS   ";
        original = original.toLowerCase().trim();
        System.out.println(original);

        //robimy to samo ale wydzielając do oddzielnej metody
        System.out.println(toLowerCases("   WIELKI NAPIS   "));


        //wykonujemy to samo ale teraz definiujemy odpowiednią funkcję którą przypiszemy do referencji typu Funkction
        Function<String, String> func = text -> text.toLowerCase().trim();
        String sentence = "   WIELKI NAPIS   ";
        String lowerCasesTrim = func.apply(sentence);
        System.out.println(lowerCasesTrim);
    }

    public static String toLowerCases(String sentence){
        return sentence.toLowerCase().trim();
    }
}
