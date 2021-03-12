package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Домашка - Cоздать класс заявки.
//         - Переделать класс юзер чтобы привязывать заявки к челу.
// 1.заявки(создать или привязать к сотр)

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, User> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User yarik = new User("Ярик", "Мартынов", "Вячеславович", "программист", 29, 1);
        User tima = new User("Тима", "Юлдашев", "Альбертович", "программист", 39, 0);
        User dima = new User("Дима", "Токарь", "Андреевич", "программист", 29, 0);
        User kirill = new User("Кирилл", "Власкин", "Викторович", "ИТ", 27, 0);
        User ilya = new User("Илья", "Куравцев", "Сергеевич", "системный администратор", 27, 0);
        map.put(yarik.surname, yarik);
        map.put(tima.surname, tima);
        map.put(dima.surname, dima);
        map.put(kirill.surname, kirill);
        map.put(ilya.surname, ilya);

        ArrayList<Tasks> task = new ArrayList<>();
        Tasks one = new Tasks(1, "Монтаж", "Протянуть кабеля");
        Tasks two = new Tasks(2, "Монтаж", "Повесить камеру");
        Tasks three = new Tasks(3, "Восстановление", "Не включается комп");
        Tasks four = new Tasks(4, "Установка", "Установить программу");
        Tasks five = new Tasks(5, "Разработка", "Создать приложение по Заявкам");
        task.add(one);
        task.add(two);
        task.add(three);
        task.add(four);
        task.add(five);

        while (true) {
            System.out.println("                               ГЛАВНОЕ МЕНЮ");
            System.out.println("                             Выберите действие");
            System.out.println("1.Действия с заявки");
            System.out.println("2.Действия с сотрудниками");
            int input = Integer.parseInt(reader.readLine());

            switch (input) {
                case 1:
                    while (true) {
                        System.out.println();
                        System.out.println();
                        System.out.println("                               Действия с заявками");
                        System.out.println("1.Показать список заявок");
                        System.out.println("2.Просмотреть заявку");
                        System.out.println("3.Добавить заявку");
                        System.out.println("4.Удалить заявку");
                        System.out.println("5.Присвоить сотруднику");
                        System.out.println("6.Выйти в ГЛАВНОЕ МЕНЮ");
                        System.out.println();
                        System.out.println();
                        input = Integer.parseInt(reader.readLine());
                        if (input == 6) {
                            break;
                        } else {
                            switch (input) {
                                case 1:
                                    for (Tasks text : task) {
                                        System.out.println(text);
                                    }
                                    break;
                                case 2:
                                    input = Integer.parseInt(reader.readLine());
                                    System.out.println(task.get(input));
                                    break;
                                case 3:
                                    System.out.println("Введите id заявки");
                                    int id = Integer.parseInt(reader.readLine());
                                    System.out.println("Введите тему заявки");
                                    String subject = reader.readLine();
                                    System.out.println("Введите описание заявки");
                                    String information = reader.readLine();
                                    Tasks default2 = new Tasks(id,subject,information);
                                    task.add(default2);
                                    break;
                                case 4:
                                    input = Integer.parseInt(reader.readLine());
                                    task.remove(input);
                                    System.out.println("Заявка - " + input + " удалена");

                            }
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println();
                        System.out.println();
                        System.out.println("                               Действия с сотрудниками");
                        System.out.println("1.Показать список сотрудников");
                        System.out.println("2.Посмотреть карточку сотрудника");
                        System.out.println("3.Добавить сотрудника");
                        System.out.println("4.Удалить сотрудника");
                        System.out.println("5.Выйти в ГЛАВНОЕ МЕНЮ");
                        input = Integer.parseInt(reader.readLine());

                        if (input == 5) {
                            break;
                        } else {
                            switch (input) {
                                case 1:
                                    for (Map.Entry<String, User> entry : map.entrySet()) {
                                        System.out.println(entry.getKey());
                                    }
                                    break;
                                case 2:
                                    String inputUser = reader.readLine();
                                    System.out.println(map.get(inputUser));
                                    break;
                                case 3:
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
                                    System.out.println("Присвойте заявку");
                                    int id = Integer.parseInt(reader.readLine());
                                    User default1 = new User(name, surname, patronymic, prifession, age, id);
                                    map.put(default1.surname, default1);
                                    break;
                                case 4:
                                    System.out.println("Введите фамилию сотрудника для удаления");
                                    String del = reader.readLine();
                                    map.remove(del);
                                    System.out.println("Сотрудник " + del + " удален");
                                    break;


                            }
                        }
                    }
            }

        }

    }
}



