class Logic {
    public static void main(String[]args){

        int age = 30;

        // this logica operator AND and OR
        //  AND prints out true when the value on the right and left are true
        // OR prints out True when either of the value by the left or right is true
        System.out.println( 25 <= age && 35 >= age);
        System.out.println( 25 <= age || 35 < age);
        System.out.println( 15 <= age && 25 >= age);
        System.out.println( 45 <= age || 25 < age);
    }
}
class logicOperator {
    public static void main(String[]args){

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println( isStudent && isLibraryMember);
        System.out.println( isLibraryMember|| isStudent);
        System.out.println( !isStudent && isLibraryMember);
        System.out.println( !isLibraryMember || !isStudent);
    }
}
