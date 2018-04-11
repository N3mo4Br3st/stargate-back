package stargateBack.api;

import stargateBack.business.BandeauBusiness;
import stargateBack.business.LedBusiness;
import stargateBack.business.PorteBusiness;
import stargateBack.model.Bandeau;
import stargateBack.model.Led;
import stargateBack.model.Porte;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

@Controller
public class PortesApiController implements PortesApi {

	 @Autowired
	 PorteBusiness porteBusiness;
	 
	 @Autowired
	 BandeauBusiness bandeauBusiness;
	 
	 @Autowired
	 LedBusiness ledBusiness;


    public ResponseEntity<Bandeau> getBandeauById(@ApiParam(value = "ID du bandeau à retourner",required=true ) @PathVariable("bandeauId") Integer bandeauId,
        @ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!

    	
    	
    return new ResponseEntity<Bandeau>(bandeauBusiness.getBandeauById(porteId, bandeauId), HttpStatus.OK);
    }

    public ResponseEntity<List<Bandeau>> getBandeaux(@ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!
        return new ResponseEntity<List<Bandeau>>(HttpStatus.OK);
    }

    public ResponseEntity<Led> getLedById(@ApiParam(value = "ID du bandeau selectionné",required=true ) @PathVariable("bandeauId") Integer bandeauId,
        @ApiParam(value = "ID de la led du bandeau à retourner",required=true ) @PathVariable("ledId") Integer ledId,
        @ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!
        return new ResponseEntity<Led>(HttpStatus.OK);
    }

    public ResponseEntity<List<Led>> getLeds(@ApiParam(value = "ID du bandeau à retourner",required=true ) @PathVariable("bandeauId") Integer bandeauId,
        @ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!
        return new ResponseEntity<List<Led>>(HttpStatus.OK);
    }

    public ResponseEntity<Porte> getPorteById(@ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!
        return new ResponseEntity<Porte>(HttpStatus.OK);
    }

    public ResponseEntity<List<Porte>> getPortes() {
        // do some magic!
        return new ResponseEntity<List<Porte>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateLed(@ApiParam(value = "ID du bandeau selectionné",required=true ) @PathVariable("bandeauId") Integer bandeauId,
        @ApiParam(value = "ID de la led du bandeau à retourner",required=true ) @PathVariable("ledId") Integer ledId,
        @ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId,
        @ApiParam(value = "Led à mettre à jour" ,required=true )  @Valid @RequestBody Led body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateLeds(@ApiParam(value = "ID du bandeau dont les leds doivent être mises à jour",required=true ) @PathVariable("bandeauId") Integer bandeauId,
        @ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId,
        @ApiParam(value = "", required=true) @RequestPart(value="niveauRouge", required=true)  Integer niveauRouge,
        @ApiParam(value = "", required=true) @RequestPart(value="niveauVert", required=true)  Integer niveauVert,
        @ApiParam(value = "", required=true) @RequestPart(value="niveaubleu", required=true)  Integer niveaubleu) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
