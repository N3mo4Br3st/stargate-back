package stargateBack.dao.arduino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
public class ArduinoDAOImpl extends Thread implements ArduinoDAO  {
	
	 void connect ( String portName ) throws Exception
	    {
	        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
	        if ( portIdentifier.isCurrentlyOwned() )
	        {
	            System.out.println("Error: Port is currently in use");
	        }
	        else
	        {
	            CommPort commPort = portIdentifier.open(this.getClass().getName(),2000);
	            
	            if ( commPort instanceof SerialPort )
	            {
	                SerialPort serialPort = (SerialPort) commPort;
	                serialPort.setSerialPortParams(57600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
	                
	                InputStream in = serialPort.getInputStream();
	                OutputStream out = serialPort.getOutputStream();
	                               
	                (new Thread(new SerialWriter(out))).start();
	                
	                serialPort.addEventListener(new SerialReader(in));
	                serialPort.notifyOnDataAvailable(true);

	            }
	            else
	            {
	                System.out.println("Error: Only serial ports are handled by this example.");
	            }
	        }     
	    }
	    
	    /**
	     * Handles the input coming from the serial port. A new line character
	     * is treated as the end of a block in this example. 
	     */
	    public static class SerialReader implements SerialPortEventListener 
	    {
	        private InputStream in;
	        private byte[] buffer = new byte[1024];
	        
	        public SerialReader ( InputStream in )
	        {
	            this.in = in;
	        }
	        
	    	public void serialEvent(SerialPortEvent event) {
	    		//gestion des événements sur le port :
	    		//on ne fait rien sauf quand les données sont disponibles
	    		switch (event.getEventType()) {
	    			case SerialPortEvent.BI :
	    			case SerialPortEvent.OE :
	    			case SerialPortEvent.FE :
	    			case SerialPortEvent.PE :
	    			case SerialPortEvent.CD :
	    			case SerialPortEvent.CTS :	
	    			case SerialPortEvent.DSR :
	    			case SerialPortEvent.RI :
	    			case SerialPortEvent.OUTPUT_BUFFER_EMPTY :
	    				break;
	    			case SerialPortEvent.DATA_AVAILABLE :
	    				String codeBarre = new String(); 
//	    				try {
//	    					//lecture du buffer et affichage
////	    					codeBarre = (String) in.readLine();
////	    					System.out.println(codeBarre);
//	    				} catch (IOException e) {
//	    				}
	    				break;
	    		}
	    	}

	    }

	    /** */
	    public static class SerialWriter implements Runnable 
	    {
	        OutputStream out;
	        
	        public SerialWriter ( OutputStream out )
	        {
	            this.out = out;
	        }
	        
	        public void run ()
	        {
	            try
	            {                
	                int c = 0;
	                while ( ( c = System.in.read()) > -1 )
	                {
	                    this.out.write(c);
	                }                
	            }
	            catch ( IOException e )
	            {
	                e.printStackTrace();
	                System.exit(-1);
	            }            
	        }
	    }
   
	@Override
	public Integer getConfigVersion() {
	
		return null;
	}


//	/**
//	 * Constructeur qui récupère l'identifiant du port et lance l'ouverture.
//	 */
//	public ArduinoDAOImpl(String port) {
//		//initialisation du driver
//		Win32Driver w32Driver = new Win32Driver();
//		w32Driver.initialize();
//		//récupération de l'identifiant du port
//		try {
//			portId = CommPortIdentifier.getPortIdentifier(port);
//		} catch (NoSuchPortException e) {
//		}
//		
//		//ouverture du port
//		try {
//			serialPort = (SerialPort) portId.open("ModeEvenement", 2000);
//		} catch (PortInUseException e) {
//		}
//		//récupération du flux
//		try {
//			fluxLecture =
//				new BufferedReader(
//					new InputStreamReader(serialPort.getInputStream()));
//		} catch (IOException e) {
//		}
//		//ajout du listener
//		try {
//			serialPort.addEventListener(this);
//		} catch (TooManyListenersException e) {
//		}
//		//paramétrage du port
//		serialPort.notifyOnDataAvailable(true);
//		try {
//			serialPort.setSerialPortParams(
//				9600,
//				SerialPort.DATABITS_7,
//				SerialPort.STOPBITS_1,
//				SerialPort.PARITY_EVEN);
//		} catch (UnsupportedCommOperationException e) {
//		}
//		System.out.println("port ouvert, attente de lecture");
//	}
//	public void run() {
//		running = true;
//		while (running) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//			}
//		}
//		//fermeture du flux et port
//		try {
//			fluxLecture.close();
//		} catch (IOException e) {
//		}
//		serialPort.close();
//	}


}
