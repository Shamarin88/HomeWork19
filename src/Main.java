public class Main {
    public static void main(String[] args) {
        try {
            Data.checkData("Shamarin88","12345678","12345678");
        } catch (WrongDataException e) {
            e.printStackTrace();
        }
    }
}