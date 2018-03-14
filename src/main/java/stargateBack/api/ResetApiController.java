package stargateBack.api;


import io.swagger.annotations.*;

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
public class ResetApiController implements ResetApi {



    public ResponseEntity<Void> eteindre(@ApiParam(value = "ID de la porte à retourner",required=true ) @PathVariable("porteId") Integer porteId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
