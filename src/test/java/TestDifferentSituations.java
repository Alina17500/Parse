import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class TestDifferentSituations {
    @Test
    public void testFirstSituation() throws IOException {
        List<Employee> list = ParserFiles.parse("C:/testCase/case1.csv");
        String[] trueTest = {"Employee {id=1, firstName='Katerina', lastName='Alekseeva', country='RU', age=23}",
                "Employee {id=2, firstName='Jhon', lastName='Lenon', country='USA', age=49}",
                "Employee {id=3, firstName='Antonio', lastName='Kastilio', country='AG', age=35}"};
        String[] strings = new String[list.size()];
        toStringFromEmployee(list, strings);
        Assertions.assertArrayEquals(trueTest, strings);
    }

    @Test
    public void testSecondSituation() throws IOException {
        List<Employee> list = ParserFiles.parse("C:/testCase/case2.csv");
        String[] trueTest = {"Employee {id=1, firstName='Alina', lastName='Laginova', country='RU', age=31}",
                "Employee {id=2, firstName='Archy', lastName='Bas', country='USA', age=24}",
                "Employee {id=3, firstName='Federico', lastName='Manyano', country='AG', age=49}",
                "Employee {id=4, firstName='Serena', lastName='Vanderwoodson', country='USA', age=21}",
                "Employee {id=5, firstName='Artur', lastName='Romanov', country='RU', age=37}"};
        String[] strings = new String[list.size()];
        toStringFromEmployee(list, strings);
        Assertions.assertArrayEquals(trueTest, strings);
    }

    private static void toStringFromEmployee(List<Employee> list, String[] strings) {
        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i).toString();
            //System.out.println(strings[i]);
        }
    }
}
