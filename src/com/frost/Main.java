package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, User> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User yarik = new User("Ярик", "Мартынов", "Вячеславович", "Программист", 29);
        User tima = new User("Тима", "Юлдашев", "Альбертович", "Сеньер Developer", 39);
        User dima = new User("Дима", "Токарь", "Андреевич", " Супер Сеньер Developer", 29);
        User kirill = new User("Кирилл", "Власкин", "Викторович", "ИТ", 27);
        User ilya = new User("Илья", "Куравцев", "Сергеевич", "Администратор", 27);
        map.put(yarik.surname, yarik);
        map.put(tima.surname, tima);
        map.put(dima.surname, dima);
        map.put(kirill.surname, kirill);
        map.put(ilya.surname, ilya);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("МЕНЮ - Выберите действие.");
            System.out.println("1.Посмотреть карточку сотрудника.");
            System.out.println("2.Добавить сотрудника.");
            System.out.println("3.Удалить сотрудника.");
            System.out.println("4.Показать Список сотрудников.");

            int input = Integer.parseInt(reader.readLine());

            switch (input) {
                case 1:
                    String inputUser = reader.readLine();
                    System.out.println(map.get(inputUser));
                    break;
                case 2:
                    System.out.println("Введите Имя сотрудника ");
                    String name = reader.readLine();
                    System.out.println("Введите Фамилию сотрудника");
                    String surname = reader.readLine();
                    System.out.println("Введите Отчество сотрудника");
                    String patronymic = reader.readLine();
                    System.out.println("Введите Профессию сотрудника");
                    String prifession = reader.readLine();
                    System.out.println("Введите Возраст сотрудника");
                    int age = Integer.parseInt(reader.readLine());
                    User default1 = new User(name, surname, patronymic, prifession, age);
                    map.put(default1.surname, default1);
                    break;
                case 3:
                    System.out.println("Введите фамилию сотрудника для удаления");
                    String del = reader.readLine();
                    map.remove(del);
                    System.out.println("Сотрудник " + del + " удален.");
                    break;
                case 4:
                    for (Map.Entry<String, User> entry : map.entrySet()) {
                        System.out.println(entry.getKey());
                    }
                    break;
            }

        }

    }
}



