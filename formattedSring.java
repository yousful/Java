class FormattedSring {
    public static void main(String[]args){
        String name = "Yusuf"; // %s
        String country = "Nigeria"; // %s
        int age = 27; // %d
        String company = "TIIDELab"; // %s
        double gpa = 3.9; //%f
        char percentSign = '%'; // %c
        boolean claim = true; // %b

        // working with string formating using modulus(%) variable.
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I am a software engineering fellow at %s. I have a gpa of %f, and i have completed 100%c of the fellowship courses. this claim is %b. ", name, country, age, company, gpa, percentSign, claim);

        System.out.println(formattedString);

    }
    
}
