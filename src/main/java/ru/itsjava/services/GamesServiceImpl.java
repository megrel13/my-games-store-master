package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Games;
import ru.itsjava.services.GameService;

import java.util.List;

@RequiredArgsConstructor
public class GamesServiceImpl implements GameService {
    private final List<Games> gamesFromStore;


    @Override
    public Games buyGamesByName (String name) {
        Games resGames = null;
        for (Games games : gamesFromStore){
            if (games.getName().equals(name)){
                resGames = games;
            }
        }
        if (resGames != null) {
            gamesFromStore.remove(resGames);
            return resGames;
        }
        return null;
    }

    @Override
    public void sellGames(Games games) {
        gamesFromStore.add(games);
    }

    @Override
    public boolean hasGames(String name) {
        for (Games games : gamesFromStore){
            if (games.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void printGames() {
        for (Games games : gamesFromStore){
            System.out.println(games.getName() + " " + games.getAuthor());
        }
    }
}
