import java.util.regex.Pattern;

public class Data {

    public static void checkData(String login, String password, String confirmPassword) throws WrongDataException {
        if (!stringCorrect(login)) {
            throw new WrongDataException("Логин указан не верно");
        }
        if (stringCorrect(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указан корректно");
        } else {
            throw new WrongDataException("Пароль указан не верно");
        }
    }

    public static boolean stringCorrect(String checkString) {
        if (checkString == null | checkString.isEmpty() | checkString.isBlank() | checkString.length() > 20) {
            return false;
        }
        return Pattern.matches("[a-zA-Z0-9_]*$", checkString);
    }
}
