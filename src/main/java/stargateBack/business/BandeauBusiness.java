package stargateBack.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import stargateBack.model.Bandeau;
import stargateBack.model.Led;

@Component
public class BandeauBusiness {

	@Autowired
	public BandeauBusiness() {}
	
	public Bandeau getBandeauById(Integer bandeauId) {
		
    	Bandeau response = new Bandeau();
    	response.setId(bandeauId);
    	response.setName("Bandeau"+bandeauId);
    	response.addLedsItem(new Led(0,0,0,0,255));
		return response;
		
		
	}
}
