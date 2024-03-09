import jakarta.persistence.criteria.CriteriaBuilder;

public class Core {
    public static String incrementString(String str) {
//        if (!str.contains("9") && !str.contains("8") &&!str.contains("7") &&!str.contains("6") &&!str.contains("5") &&!str.contains("4") &&!str.contains("3") &&!str.contains("2") &&!str.contains("1") && !str.contains("0")) return str + "" + 1;
//       //metinde sayi var.
//        if (str.isBlank()) return "1";
//        int sayininBasladigiIndex = 999;
//        for (int i = 0;i<str.length();i++){
//            if (str.charAt(i) != '0' && Character.isDigit(str.charAt(i))){
//                sayininBasladigiIndex = i;
//                break;
//            }
//        }
//        if (sayininBasladigiIndex==999) sayininBasladigiIndex = str.length()-1;
//        int numero = Integer.parseInt(str.substring(sayininBasladigiIndex));
//        System.out.println(sayininBasladigiIndex);
//        return str.substring(0,sayininBasladigiIndex) + "" + ++numero;
//        





    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar099"));
    }
}
