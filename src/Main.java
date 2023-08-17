public class Main {
    public static void main(String[] args) {

        int clientBalance = 400; // Баланс до пополнения
        int phoneRecharge = 1200; // Пополнение счёта
        int bonus = 0; // Бонусы

        if (phoneRecharge >= 1000) {
            bonus = phoneRecharge / 100;
            clientBalance = clientBalance + bonus + phoneRecharge;
        } else {
            clientBalance = clientBalance + phoneRecharge;
        }

        if (bonus == 0) {
            System.out.println("Итоговый счёт клиента: " + clientBalance + ", бонусы отсутствуют");
        } else {
            System.out.println("Итоговый счёт клиента: " + clientBalance + ", начислено бонусов: " + bonus);
        }
    }
}
