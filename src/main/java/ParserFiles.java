import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserFiles {
    public static List<Employee> parse(String fileName) throws IOException {
        List<String> dataFromFile = Files.readAllLines(Paths.get(fileName));
        List<Employee> listResult = new ArrayList<>();

        for (String value : dataFromFile) {
            List<String> elements = Arrays.asList(value.split(","));
            Employee employee = new Employee();
            employee.id = elements.get(0);
            employee.firstName = elements.get(1);
            employee.lastName = elements.get(2);
            employee.country = elements.get(3);
            employee.age = elements.get(4);

            listResult.add(employee);
        }
        return listResult;
    }

    public static void printToConsole(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
