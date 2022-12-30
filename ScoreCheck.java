import java.util.HashMap;
public class ScoreCheck {
    public static void main(String args[]){
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Math", 75);
        examScore.put("English", 86);
        examScore.put("Physics", 95);
        examScore.put("Literatire", 100);
        examScore.put("Computer Programming", 79);


        examScore.forEach((subject, score)-> {
            examScore.replace(subject, score - 10);
            // System.out.println(subject + " - " + score);
        });
        System.out.println(examScore.toString());
            // examScore.remove("Physics");
            // examScore.clear();
        // examScore.replace("Math", 70);
        // examScore.putIfAbsent("Math", 70);
        // System.out.println(examScore.toString());
        // System.out.println(examScore.get("Religion"));
        // System.out.println(examScore.containsKey("Math"));
    }
    
}
