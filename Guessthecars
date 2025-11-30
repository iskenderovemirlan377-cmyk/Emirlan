package org.example;

import java.util.Random;

public class CarGame {

    private Random random = new Random();

    // Список машин
    private final String[] cars = {
            "BMW", "Mercedes", "Audi", "Toyota",
            "Honda", "Lexus", "Ferrari", "Lamborghini",
            "Porsche", "Ford", "Chevrolet", "Nissan"
    };

    public void startGame() {
        System.out.println("Добро пожаловать в игру 'Guess the Car'!");

        boolean playAgain = true;

        while (playAgain) {
            playRound();

            System.out.println("Хотите сыграть ещё раз? (y/n)");
            String answer = Reader.readString().toLowerCase();

            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("Введите только y или n:");
                answer = Reader.readString().toLowerCase();
            }

            if (answer.equals("n")) {
                playAgain = false;
                System.out.println("Спасибо за игру!");
            }
        }
    }

    public void playRound() {

        // Выбираем случайную машину
        String secretCar = cars[random.nextInt(cars.length)];

        int attempts = 0;
        int maxAttempts = 5;

        System.out.println();
        System.out.println("Я загадал марку машины.");
        System.out.println("Попробуй угадать! У тебя " + maxAttempts + " попыток.");
        System.out.println("Доступные марки:");

        for (String car : cars) {
            System.out.print(car + "  ");
        }
        System.out.println();
        System.out.println();

        while (attempts < maxAttempts) {
            System.out.print("Твой ответ: ");
            String guess = Reader.readString().trim();

            attempts++;

            if (guess.equalsIgnoreCase(secretCar)) {
                System.out.println();
                System.out.println("Поздравляю! Ты угадал машину: " + secretCar);
                System.out.println("Попыток использовано: " + attempts);
                return;
            } else {
                System.out.println("Неверно!");
                System.out.println("Осталось попыток: " + (maxAttempts - attempts));
            }
        }

        System.out.println();
        System.out.println("Ты проиграл!");
        System.out.println("Правильный ответ: " + secretCar);
    }
}
