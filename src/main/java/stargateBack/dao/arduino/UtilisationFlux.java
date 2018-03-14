package stargateBack.dao.arduino;

//import javax.comm.*;
//import com.sun.comm.Win32Driver;
import java.io.*;

public class UtilisationFlux {

//	private BufferedReader bufRead; //flux de lecture du port
//	private OutputStream outStream; //flux d'écriture du port
//	private CommPortIdentifier portId; //identifiant du port
//	private SerialPort sPort; //le port série
//	/**
//	 * Constructeur
//	 */
//	public UtilisationFlux(String port) {
//		//initialisation du driver
//		Win32Driver w32Driver = new Win32Driver();
//		w32Driver.initialize();
//		//récupération de l'identifiant du port
//		try {
//			portId = CommPortIdentifier.getPortIdentifier(port);
//		} catch (NoSuchPortException e) {
//		}
//		//ouverture du port
//		try {
//			sPort = (SerialPort) portId.open("UtilisationFlux", 30000);
//		} catch (PortInUseException e) {
//		}
//		//règle les paramètres de la connexion
//		try {
//			sPort.setSerialPortParams(
//				9600,
//				SerialPort.DATABITS_8,
//				SerialPort.STOPBITS_1,
//				SerialPort.PARITY_NONE);
//		} catch (UnsupportedCommOperationException e) {
//		}
//		//récupération du flux de lecture et écriture du port
//		try {
//			outStream = sPort.getOutputStream();
//			bufRead =
//				new BufferedReader(
//					new InputStreamReader(sPort.getInputStream()));
//		} catch (IOException e) {
//		}
//	}
//	/** 
//	 * Méthode de communication.
//	 */
//	public String communique(char envoie) {
//		String poids = null;
//		try {
//			//demande de poids
//			outStream.write((int) envoie);
//			//lecture du poids 
//			poids = bufRead.readLine().trim();
//		} catch (IOException e) {
//		}
//		return poids;
//	}
//	/**
//	 * Méthode de fermeture des flux et port.
//	 */
//	public void close(){
//		try {
//			bufRead.close();
//			outStream.close();
//		} catch (IOException e) {
//		}
//		sPort.close();
//	}
//	/**
//	 * Méthode principale de l'exemple.
//	 */
//	public static void main(String[] args) {
//		//Récupération du port en argument
//		String port = args[0];
//		//Construction de l'interface à la balance
//		UtilisationFlux utilFlux = new UtilisationFlux(port);
//		//"interface utilisateur"
//		System.out.println("taper q pour quitter, ou ENTER pour le poids");
//		//construction flux lecture
//		BufferedReader clavier =
//			new BufferedReader(new InputStreamReader(System.in));
//		//lecture sur le flux entrée.
//		try {
//			String lu = clavier.readLine();
//			while (!lu.equals("q")) {
//				System.out.println(utilFlux.communique('$'));
//				lu = clavier.readLine();
//			}
//		} catch (IOException e) {
//		}
//		utilFlux.close();
//	}
}