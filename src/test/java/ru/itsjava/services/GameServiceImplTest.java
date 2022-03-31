package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Games;

import java.util.*;

public class GameServiceImplTest {
    List<Games> games = new ArrayList<>();


    @DisplayName("Проверка метода buyGamesByName")
    @Test
    public void checkBuyGamesByNameMethod() {

        Games expectedGames = new Games("Warcraft", "Blizzard");
        games.add(expectedGames);

        GamesServiceImpl service = new GamesServiceImpl(games);
        Assertions.assertEquals(expectedGames, service.buyGamesByName("Warcraft"));
    }

    @DisplayName("Проверка метода sellGames")
    @Test
    public void checkSellGamesMethod() {

        Games expectedGames1 = new Games("Warcraft", "Blizzard");
        Games expectedGames2 = new Games("Battlefield", "EA");
        games.add(expectedGames1);
        games.add(expectedGames2);

        Assertions.assertEquals(expectedGames1, games.get(0));
        Assertions.assertEquals(expectedGames2, games.get(1));
    }

    @DisplayName("Проверка метода hasGames")
    @Test
    public void checkHasGamesMethod() {

        Games expectedGames = new Games("Warcraft", "Blizzard");
        games.add(expectedGames);

        Assertions.assertTrue(games.contains(expectedGames));
    }

    @DisplayName("Проверка метода printGames")
    @Test
    public void checkPrintGamesMethod() {

        Games expectedGames = new Games("Warcraft", "Blizzard");
        games.add(expectedGames);


        Assertions.assertEquals(expectedGames, games.get(0));

    }
}
