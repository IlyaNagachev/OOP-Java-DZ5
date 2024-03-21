import models.TableService;
import presenters.BookingPresenter;
import presenters.Model;
import views.BookingView;

import java.util.Date;
import java.util.Scanner;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int x = 0;
        Model model = new TableService();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTablesView();
        view.reservationTable(new Date(), 2, "Станислав");

        Scanner sc = new Scanner(System.in);
        System.out.println("Устраивает ли Вас бронь? Да: 1; Нет: 2");

        int number = sc.nextInt();

        if (number == 1){
            System.out.println("Спасибо, что выбрали нас!");
        }
        else if (number == 2){
            view.changeReservationTable(1001, new Date(), 4, "Станислав");
        }
        else {
            System.out.println("ОШИБКА: Некорректный ответ");
        }

    }

}
