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
    return null;
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

  public String getUrlFaq() {
    return "http://salusafe.com/faq";
  }

  public String getUrlQuickTour() {
    return "http://salusafe.com/quick-tour";
  }

  public String getUrlSignup() {
    return "http://salusafe.com/signup";
  }

  public String getUrlUsersGuide() {
    return "http://salusafe.com/user-guide";
  }

  public String getWelcomeEmailFrom() {
    return "support@salusafe.com";
  }

  public String getWelcomeEmailSubject() {
    return "Welcome to SaluSafe";
  }

  public String getWelcomeEmailBody() {
    return "<html>"
        +"<body marginwidth=\"10\">"
        +"<h3><font face=\"Verdana, Arial, Helvetica, sans-serif\">Welcome to SaluSafe!</font></h3>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">You're just about to experience how easy secure email and secure online file management can be. Take a quick tour and get started faster. <a href='http://salusafe.com/quick-tour'>http://salusafe.com/quick-tour</a></font></p>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Here's how to get the most out of SaluSafe:</font></p>"
        +"<ol>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Download and install SaluSafe on all your devices. <a href='http://salusafe.com/download'>http://salusafe.com/download</a></font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Any file you place in your SaluSafe folder will automatically be available from all your devices. </font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Send secure email and replace overnight deliveries or registered mail. <a href='http://salusafe.com/secure-email'>http://salusafe.com/secure-email</a></font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Use it for secure chat, individually or in a group. </font></li>"
        +"</ol>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Congratulations for taking charge of your email privacy, and thank you for choosing us!"
        +"<br>"
        +"<br>"
        +"Welcome to SaluSafe!"
        +"<br>"
        +"<i>- The SaluSafe Team</i>"
        +"</font></p> "
        +"<p>&nbsp;</p>"
        +"<p>&nbsp;</p>"
        +"</body>"
        +"</html>";
  }

  public String getWelcomeTemplate() {
    return "http://www.cryptoheaven.com/private-label/salusafe/welcome-screen.htm";
  }


}