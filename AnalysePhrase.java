package exercices.exercice3;

public class AnalysePhrase {

	public static int nombredemots(String phrase) {
		String[]mots = phrase.split("\\s+");
		return mots.length;
}
   public static String remplacerVoyelle(String phrase, char symbol) {
	   
	   StringBuilder result = new StringBuilder();
	   
	   for(int i=0 ; i<phrase.length() ; i++) {
		   char charactuel = phrase.charAt(i);
		   
		   if (charactuel == 'a' || charactuel== 'e' || charactuel== 'i' || charactuel == 'o' || charactuel== 'u' || charactuel== 'y' ||
				   charactuel == 'A' || charactuel== 'E' || charactuel== 'I' || charactuel== 'O' || charactuel== 'U' || charactuel== 'Y') {
			result.append(symbol);
		   }else {
			   result.append(charactuel);
			   
		   }
	   }
	   return result.toString();
	   }
   
   public static String inverserPhrase(String phrase) {
	   String[]mots = phrase.split("\\s+");
	   StringBuilder result = new StringBuilder();
       for(int i=mots.length -1 ; i>=0 ; i--) {
    	   result.append(mots[i]);
    	   result.append(" ");
       }
       return result.toString();
   }
   }



