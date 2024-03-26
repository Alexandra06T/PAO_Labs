package strings;

public class Application {
    public static void main(String[] args) {

        System.out.println("[abc] a: " + "a".matches("[abc]"));
        System.out.println("[^abc] a: " + "d".matches("[^abc]"));
        System.out.println("[a-z] x: " + "x".matches("[a-z]"));
        System.out.println("[a-zA-Z] B: " + "B".matches("[a-zA-Z]"));
        System.out.println("[a-z][A-Z] aB: " + "aB".matches("[a-z][A-Z]"));
        System.out.println("[abc]+ abbc: " + "abbc".matches("[abc]+"));
        System.out.println("[abc]* '': " + "".matches("[abc]*"));
        System.out.println("[abc]{5} abcab: " + "abcab".matches("[abc]{5}"));
        System.out.println("[abc]{5,} abcababbc: " + "abcababbc".matches("[abc]{5,}"));
        System.out.println("[abc]{5,10} abcabaaa: " + "abcabaaa".matches("[abc]{5,10}"));
    }
}
