import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Logger logger = Logger.getInstance();
            Scanner scan = new Scanner(System.in);

            logger.data();
            logger.log("Запускаем программу.");
            logger.data();
            logger.log("Введите размер списка: ");
            int sizeList = scan.nextInt();
            logger.data();
            logger.log("Введите верхнюю границу для значений: ");
            int maxNum = scan.nextInt();
            Random random = new Random();
            ArrayList<Integer> arrayListRandom = new ArrayList<>();
            for (int i = 0; i < sizeList; i++) {
                arrayListRandom.add(random.nextInt(maxNum)); // создпём список из случайных значений от 0 до maxNum
            }
            logger.data();
            logger.log("Создаём и наполняем список.");
            logger.data();
            logger.log("Вот случайный список: " + arrayListRandom);
            logger.data();
            logger.log("Введите порог для фильтра: ");
            int treshold = scan.nextInt();
            logger.data();
            logger.log("Запускаем фильтрацию.");
            Filter filter = new Filter(treshold);
            System.out.println(filter.filterOut(arrayListRandom));
            logger.data();
            logger.log("Завершаем программу.");
        }
    }