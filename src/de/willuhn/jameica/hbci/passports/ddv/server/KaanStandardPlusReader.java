/**********************************************************************
 * $Source: /cvsroot/hibiscus/hibiscus/src/de/willuhn/jameica/hbci/passports/ddv/server/KaanStandardPlusReader.java,v $
 * $Revision: 1.2 $
 * $Date: 2010/09/07 15:28:05 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/
package de.willuhn.jameica.hbci.passports.ddv.server;

import de.willuhn.jameica.hbci.passports.ddv.rmi.Reader;

/**
 * Implementierung fuer die Default-Einstellungen des
 * "Kaan Standard Plus USB" von Kobil.
 */
public class KaanStandardPlusReader extends AbstractKaanReader implements Reader
{
  /**
   * @see de.willuhn.jameica.hbci.passports.ddv.rmi.Reader#getName()
   */
  public String getName()
  {
    return "Kaan Standard Plus USB (Kobil)";
  }
}


/**********************************************************************
 * $Log: KaanStandardPlusReader.java,v $
 * Revision 1.2  2010/09/07 15:28:05  willuhn
 * @N BUGZILLA 391 - Kartenleser-Konfiguration komplett umgebaut. Damit lassen sich jetzt beliebig viele Kartenleser und Konfigurationen parellel einrichten
 *
 * Revision 1.1  2010/06/17 11:45:48  willuhn
 * @C kompletten Code aus "hbci_passport_ddv" in Hibiscus verschoben - es macht eigentlich keinen Sinn mehr, das in separaten Projekten zu fuehren
 **********************************************************************/