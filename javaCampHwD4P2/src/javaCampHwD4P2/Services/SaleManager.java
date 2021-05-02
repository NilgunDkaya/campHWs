package javaCampHwD4P2.Services;

import javaCampHwD4P2.Entities.Campaign;
import javaCampHwD4P2.Entities.Game;
import javaCampHwD4P2.Entities.User;
import javaCampHwD4P2.Interfaces.SaleGameService;

public class SaleManager implements SaleGameService{

	@Override
	public void saleGame(Game game, User user, Campaign campaign) {
		System.out.println(user.getUserName() +" bought the " +game.getName() +" with " +campaign.getName());
	}

}
