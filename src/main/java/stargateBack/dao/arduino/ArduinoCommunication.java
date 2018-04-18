package stargateBack.dao.arduino; 
 
import com.google.gson.Gson; 
import com.google.gson.JsonElement; 
import com.google.gson.JsonObject; 
import com.google.gson.JsonParser; 
import com.google.gson.JsonSyntaxException; 
import com.google.gson.reflect.TypeToken; 
import gnu.io.PortInUseException; 
import gnu.io.SerialPortEvent; 
import gnu.io.SerialPortEventListener; 
import gnu.io.UnsupportedCommOperationException;
import stargateBack.dao.bean.ColorLed;
import stargateBack.utils.PortNotFoundException;

import java.io.IOException; 
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map; 
import java.util.TooManyListenersException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import org.slf4j.LoggerFactory; 
 

public class ArduinoCommunication implements ArduinoDAO {
 
    private RxtxConnection connection; 
    private final Gson gson; 
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ArduinoCommunication.class); 
 
    public ArduinoCommunication() { 
        gson = new Gson(); 

  }

  @Override
  public Boolean connect(String port) {
    try {
      connection = new RxtxConnection(port);
    } catch (PortInUseException ex) {
      Logger.getLogger(ArduinoCommunication.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    } catch (UnsupportedCommOperationException ex) {
      Logger.getLogger(ArduinoCommunication.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    } catch (IOException ex) {
      Logger.getLogger(ArduinoCommunication.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    } catch (PortNotFoundException e) {
      return false;
    }
    return true;
    } 
 
    public void write(JsonObject o) { 
        try { 
            connection.getOutput().write(o.toString().getBytes()); 
            logger.debug("writing to arduino : " + gson.toJson(o)); 
        } catch (IOException ex) { 
            Logger.getLogger(ArduinoCommunication.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    } 
 
    public JsonObject read(String element) { 
        JsonElement jElement; 
        try { 
            jElement = new JsonParser().parse(getConnection().getLine()); 
        } catch (NullPointerException e) { 
            logger.info("error during communication with arduino. No informations from hardware"); 
            return null; 
        } catch (JsonSyntaxException e) { 
            logger.info("error during communication with arduino. Unable to parse json"); 
            return null; 
        } 
        JsonObject jObject = jElement.getAsJsonObject(); 
        if (!jObject.has(element)) { 
            logger.debug("'" + element + "' not found in the json string: " + jObject.toString()); 
            return null; 
        } 
        return jObject.getAsJsonObject(element); 
    } 
 
    public RxtxConnection getConnection() { 
        return connection; 
    } 
 
    public void setConnection(RxtxConnection connection) { 
        this.connection = connection; 
    } 
 
    public Gson getGson() { 
        return gson; 
  }

  @Override
  public Boolean raz(Integer bandeau, List<Integer> listIdLeds) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean programmerCouleur(Integer bandeau, Integer rouge, Integer vert, Integer bleu, List<Integer> listIdLeds) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean profilHorizon(List<ColorLed> profil) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean afficherProgrammation() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean activationChevron(Integer chevron, Integer glyph) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean activationHorizon(String profilCouleur) {
    // TODO Auto-generated method stub
    return null;
  }
 
}