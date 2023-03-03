import java.util.ArrayList;
import java.util.List;

public class Program {
        public static List<Integer> findAvailableDivider(int number){
            List<Integer> result = new ArrayList<>();
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    result.add(i);
                }

            }
            return result;
        }
    }
