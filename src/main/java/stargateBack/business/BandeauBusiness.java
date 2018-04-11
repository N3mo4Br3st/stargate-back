package stargateBack.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import stargateBack.mock.Values;
import stargateBack.model.Bandeau;
import stargateBack.model.Led;
import stargateBack.model.Porte;

@Component
public class BandeauBusiness {

	@Autowired
	public BandeauBusiness() {}
	
  public Bandeau getBandeauById(Integer porteId, Integer bandeauId) {
		
    Bandeau response = null;
    Porte porte = Values.getInstance().getPorteList().get(porteId);

    if (porte != null) {

      response = porte.getBandeaux().get(bandeauId);
    }

		return response;
		
		
	}
}
