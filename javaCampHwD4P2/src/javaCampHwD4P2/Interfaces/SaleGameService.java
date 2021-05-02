package javaCampHwD4P2.Interfaces;

import javaCampHwD4P2.Entities.Campaign;
import javaCampHwD4P2.Entities.Game;
import javaCampHwD4P2.Entities.User;

public interface SaleGameService {
    void saleGame(Game game, User user, Campaign campaign);
}
