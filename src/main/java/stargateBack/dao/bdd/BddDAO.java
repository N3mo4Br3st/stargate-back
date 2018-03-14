package stargateBack.dao.bdd;

import java.util.List;

import stargateBack.model.Bandeau;
import stargateBack.model.Led;
import stargateBack.model.Porte;
import stargateBack.dao.bdd.requests.GetLedRequest;
import stargateBack.dao.bdd.requests.GetBandeauRequest;
import stargateBack.dao.bdd.requests.GetPorteRequest;
import stargateBack.dao.bdd.responses.ConfigurationResponse;
import stargateBack.dao.bdd.requests.ConfigurationRequest;


public interface BddDAO {

	public ConfigurationResponse getConfiguration(ConfigurationRequest request);
	
	public List<Porte> getPortes();
	public List<Porte> getPorte(GetPorteRequest request);
	
	public List<Bandeau> getBandeaux();
	public List<Bandeau> getBandeau(GetBandeauRequest request);
	
	public List<Led> getLeds();
	public List<Led> getLed(GetLedRequest request);
}
