public class main {
    public static void main(String[]arg) {
        bracketCheck bracket = new bracketCheck("3+((6*2)-3)");
        bracket.Check();
        bracketCheck bracket2 = new bracketCheck("5*6 + (2 - 5");
        bracket2.Check();
    }
}
