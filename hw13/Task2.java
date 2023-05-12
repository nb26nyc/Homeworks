package HW13;

public class Task2 {
    /*
     How would you reverse a String word by word? for example
         // input=>This is sentence i want to reverse
         // output=>sihT si ecnetnes i tnaw ot esrever
      */
    public static void main(String[] args) {


        String sentence = "This is sentence i want to reverse";
        StringBuilder str = new StringBuilder(sentence);
        str.reverse();
        sentence = str.toString();
        String[] sentenceReverse = sentence.split(" ");

        for (int i = sentenceReverse.length-1; i >=0; i--) {
            System.out.print(sentenceReverse[i] + " ");
        }

        System.out.println();

    }
}
