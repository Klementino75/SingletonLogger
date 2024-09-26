import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer i : source) {
            if (i > treshold) {
                logger.data();
                logger.log("Элемент \"" + i + "\" подходит.");
                result.add(i);
            } else {
                logger.data();
                logger.log("Элемент \"" + i + "\" НЕ подходит.");
            }
        }

        logger.data();
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size() + " элементов.");
        logger.data();
        logger.log("Выводим результат на экран.");
        logger.data();
        logger.log("Отфильтрованный список: ");
        return result;
    }
}