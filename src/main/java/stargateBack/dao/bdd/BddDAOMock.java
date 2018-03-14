package stargateBack.dao.bdd;

import java.util.List;

import stargateBack.dao.bdd.requests.ConfigurationRequest;
import stargateBack.dao.bdd.requests.GetBandeauRequest;
import stargateBack.dao.bdd.requests.GetLedRequest;
import stargateBack.dao.bdd.requests.GetPorteRequest;
import stargateBack.dao.bdd.responses.ConfigurationResponse;
import stargateBack.model.Bandeau;
import stargateBack.model.Led;
import stargateBack.model.Porte;

public class BddDAOMock implements BddDAO {

	@Override
	public ConfigurationResponse getConfiguration(ConfigurationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Porte> getPortes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Porte> getPorte(GetPorteRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bandeau> getBandeaux() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bandeau> getBandeau(GetBandeauRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Led> getLeds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Led> getLed(GetLedRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
