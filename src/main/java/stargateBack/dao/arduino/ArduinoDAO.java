package stargateBack.dao.arduino;

import java.util.List;

import stargateBack.dao.bean.ColorLed;

public interface ArduinoDAO {

  public Boolean connect(String port);

  /** Programation direct : M0 */
  // raz complet si bandeau = -1, du bandeau si bandeau > 1 et listIdLeds = null
  // || empty
  public Boolean raz(Integer bandeau, List<Integer> listIdLeds);

  // programmation de toute les leds de la porte si bandeau = -1, du bandeau si
  // bandeau > 1 et listIdLeds = null || empty
  public Boolean programmerCouleur(Integer bandeau, Integer rouge, Integer vert, Integer bleu, List<Integer> listIdLeds);

  public Boolean profilHorizon(List<ColorLed> profil);

  // envoi la programmation a l'arduino
  public Boolean afficherProgrammation();

  /** Programation predefinie : M1 */

  // sequence d'activation du chevron , otpionnel le glyph pour s'arreter dessus
  // ??
  public Boolean activationChevron(Integer chevron, Integer glyph);

  // Activation de l'horizon des evenements, optionnel profil de couleur en
  // parametre
  public Boolean activationHorizon(String profilCouleur);

}
