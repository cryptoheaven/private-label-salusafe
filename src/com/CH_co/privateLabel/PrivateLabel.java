/*
* Copyright 2001-2012 by CryptoHeaven Corp.,
* Mississauga, Ontario, Canada.
* All rights reserved.
*
* This software is the confidential and proprietary information
* of CryptoHeaven Corp. ("Confidential Information").  You
* shall not disclose such Confidential Information and shall use
* it only in accordance with the terms of the license agreement
* you entered into with CryptoHeaven Corp.
*/

package com.CH_co.privateLabel;

import com.CH_co.util.*;
import java.net.URL;

/**
* <b>Copyright</b> &copy; 2001-2012
* <a href="http://www.CryptoHeaven.com/DevelopmentTeam/">
* CryptoHeaven Corp.
* </a><br>All rights reserved.<p>
*
* Class Description:
*
*
* Class Details:
*
*
* <b>$Revision: 1.0 $</b>
* @author  Marcin Kurzawa
* @version
*/
public class PrivateLabel implements PrivateLabelI {

  /**
  * @return label's XML setting file URL
  */
  public String getPrivateLabelURL() {
    return "http://salusafe.com/assets/private-label.xml";
  }

  /**
  * @return preferred jar name
  */
  public String getJarName() {
    return null;
  }

  /**
  * @return default value of the code field
  */
  public String getActivationCodeDefault() {
    return null;
  }

  /**
  * @return true/false
  */
  public String getActivationCodeFieldRemoved() {
    return "true";
  }

  /**
  * @return true/false
  */
  public String getServerFieldRemoved() {
    return "true";
  }

  /**
  * @return enable/disable/remove
  */
  public String getNewAccountButton() {
    return null;
  }

  public String getImage_LogoKeyMain() {
    URL url = getClass().getClassLoader().getResource("resources/logo-banner-435.png");
    if (url != null)
      return url.toExternalForm();
    return null;
  }

  public String getImage_LogoBanner() {
    URL url = getClass().getClassLoader().getResource("resources/logo-banner-435.png");
    if (url != null)
      return url.toExternalForm();
    return null;
  }

  public String getImage_WindowPopup() {
    URL url = getClass().getClassLoader().getResource("resources/window-popup.png");
    if (url != null)
      return url.toExternalForm();
    return null;
  }

  public String getImage_FrameIcon() {
    URL url = getClass().getClassLoader().getResource("resources/frame-icon-32.png");
    if (url != null)
      return url.toExternalForm();
    return null;
  }

  public String getDomain() {
    return "salusafe.com";
  }

  public String getDomainWeb() {
    return "salusafe.com";
  }

  public String getDomainMail() {
    return "salusafe.com";
  }

  public String getHomePage() {
    return "http://salusafe.com";
  }

  public String getServiceCommunityName() {
    return "SaluSafe Community";
  }

  public String getServiceNetworkName() {
    return "SaluSafe Network";
  }

  public String getServiceProviderName() {
    return "SaluSafe.com";
  }

  public String getServiceSoftwareName() {
    return "SaluSafe";
  }

  public String getSupportEmail() {
    return "Support <support@salusafe.com>";
  }

  public String getSupportEmailBody() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  public String getWelcomeEmailFrom() {
    return "support@salusafe.com";
  }

  public String getWelcomeEmailSubject() {
    return "Welcome to SaluSafe";
  }

  public String getWelcomeEmailBody() {
    String url = getHomePage() + "/assets/templates/welcome-email.html";
    return "<html><FRAMESET cols=\"*\"><FRAME src=\""+url+"\" name=\"welcomeEmailFrame\"></FRAMESET></html>";
  }

  public String getWelcomeTemplate() {
    return getHomePage() + "/assets/templates/welcome-screen.html";
  }


}