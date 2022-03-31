package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Games;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl  implements ClientService{
    private final Client client;
    private final Scanner scanner;
    private final GameService gameService;

    @Override
    public void buyGames() {
        System.out.println("Введите название игры");
        String name = scanner.next();
        if (gameService.hasGames(name)){
            System.out.println("Покупаем игры ...");
            gameService.buyGamesByName(name);
            System.out.println("Купили игру " + name);
        }else {
            System.out.println("Не смогли купить игру! Такого наименования нет :(");
        }
    }

    @Override
    public void sellGames() {
        System.out.println("Введите название игры");
        String name = scanner.next();

        System.out.println("Введите автора игры");
        String author = scanner.next();

        Games games = new Games(name, author);
        gameService.sellGames(games);

    }

    @Override
    public void printGames() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши игры: ");
        gameService.printGames();
    }
}
