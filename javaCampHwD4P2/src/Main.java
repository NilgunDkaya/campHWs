

import java.util.Date;

import javaCampHwD4P2.Entities.Campaign;
import javaCampHwD4P2.Entities.Game;
import javaCampHwD4P2.Entities.User;
import javaCampHwD4P2.Interfaces.CampaignService;
import javaCampHwD4P2.Interfaces.UserService;
import javaCampHwD4P2.Services.CampaignManager;
import javaCampHwD4P2.Services.EDevletValidationManager;
import javaCampHwD4P2.Services.GameManager;
import javaCampHwD4P2.Services.SaleManager;
import javaCampHwD4P2.Services.UserManager;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Nilgün", "Demirkaya", "NilgunD", "12345678910", new Date(1992,3,24));
		User user2 = new User(1, "Ali", "Demir", "AliD", "12345678910", new Date(1995,6,12));
		
		Game game1 = new Game(1, "Game1", 150);
		Game game2 = new Game(1, "Game2", 325);
		
		Campaign campaign1 = new Campaign(1, "Campaign1", 25);
		Campaign campaign2 = new Campaign(1, "Campaign2", 15);
		
		UserManager userManager = new UserManager(new EDevletValidationManager());
		userManager.add(user1);
		userManager.add(user2);
		
		System.out.println("----------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		System.out.println("----------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		System.out.println("----------------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleGame(game1, user1, campaign1);
		saleManager.saleGame(game2, user2, campaign2);

	}

}
