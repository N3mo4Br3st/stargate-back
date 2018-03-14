package stargateBack.dao.arduino.utils;

import com.google.gson.JsonObject;

import stargateBack.dao.arduino.ArduinoCommunication;

import org.slf4j.LoggerFactory; 
 
/**
 * 
 * @author leo 
 */ 
public class RxtxUtils { 
     
    private ArduinoCommunication aCom; 
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RxtxUtils.class); 
    private JsonObject jsonComponent = new JsonObject(); 
     
    public RxtxUtils() { 
        aCom = new ArduinoCommunication(); 
    } 
     
    public <T> T getComponent(Class type, String element) { 
        JsonObject jsonObject = aCom.read(element); 
        if(jsonObject == null) { 
            return null; 
        } 
        Object ret_value = aCom.getGson().fromJson(jsonObject, type);  
        return (T) type.cast(ret_value); 
    } 
     
    public void addComponent(String element, Object o) { 
        jsonComponent.add(element, aCom.getGson().toJsonTree(o)); 
    } 
     
    public void send() { 
        aCom.write(jsonComponent); 
        jsonComponent = new JsonObject(); 
    } 
 
    public String getRawJson() { 
        return aCom.getConnection().getLine(); 
    } 
 
    public JsonObject getJsonComponent() { 
        return jsonComponent; 
    } 
}