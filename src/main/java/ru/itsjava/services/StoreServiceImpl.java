package ru.itsjava.services;

import ru.itsjava.domain.Games;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО: ");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Games> GamesList = new ArrayList<>();

        GamesList.add(new Games("The Witcher", "CDProjectRed"));
        GamesList.add(new Games("Battlefield", "EA"));
        GamesList.add(new Games("CS:GO", "Valve"));

        GameService gameService = new GamesServiceImpl(GamesList);

        ClientService clientService = new ClientServiceImpl(client, scanner, gameService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();

    }
}

