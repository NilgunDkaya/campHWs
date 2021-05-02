package javaCampHwD4P2.Services;

import javaCampHwD4P2.Entities.Campaign;
import javaCampHwD4P2.Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : " +campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted : " +campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " +campaign.getName());
	}

	

}
