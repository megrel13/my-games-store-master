package ru.itsjava.services;

import ru.itsjava.domain.Games;

public interface GameService {
    Games buyGamesByName (String name);

    void sellGames (Games games);

    boolean hasGames (String name);

    void printGames();
}
