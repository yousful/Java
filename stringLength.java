class StringLength {
    public static void main(String[] args) {
        String name = "Learning is fun";
        String fact = "";

        //replacing a word in a sring with another word, and creating a new variable name for the updated string.
        String updatedString = name.replace("fun", "hard");

        // working with the length of a string
        System.out.println(name.length());

        //working with the empty string
        System.out.println(fact.isEmpty());

        //turning the string to upper case
        System.out.println(name.toUpperCase());

        //confirming the original string
        System.out.println(name);

        //replacing word in a string
        System.out.println(updatedString);

        //cheking if the string contains a specific word
        System.out.println(name.contains("Learning"));

        //when we check if the string contains the word "hard" java returns false because hard is not include in the original string
        System.out.println(name.contains("hard"));
    }
    
}
