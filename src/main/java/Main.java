import ru.netology.javaqa.timetablemvn.services.TimetableService;

public class Main {

    public static void main(String[] args) {
        TimetableService service = new TimetableService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int count = service.calc(income, expenses, threshold);

        System.out.println("Можно отдыхать  " + count + "  месяца(ев).");
    }
}
