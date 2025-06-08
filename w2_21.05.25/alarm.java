public class alarm {
    public static void main(String[] args) {
        String nameofDay = "tuesday";
        String alarm = "";
        alarm = switch (nameofDay) {
            case "monday" -> "9am";
            case "tuesday", "wednesday" -> "7am";
            default -> "Wakeup when you like";
        };
        System.out.println(alarm);

    }
}
