/**
 * Copyright 2001-2013 CryptoHeaven Corp. All Rights Reserved.
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
 * Copyright 2001-2013 CryptoHeaven Corp. All Rights Reserved.
 *
 * @author  Marcin Kurzawa
 */
public class PrivateLabel implements PrivateLabelI {

  /**
  * @return label's XML setting file URL
  */
  public String getPrivateLabelURL() {
    return null;
  }

  public boolean getPrivateLabelClassOverwritesXMLvalues() {
    return true;
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
    String progName = URLs.get(URLs.SERVICE_SOFTWARE_NAME);
    String urlQuickTour = URLs.get(URLs.HELP_QUICK_TOUR_PAGE);
    String urlDownload = URLs.get(URLs.DOWNLOAD_PAGE);
    String urlSecureEmail = "http://salusafe.com/secure-email";
    return "<html>"
        +"<body marginwidth=\"10\">"
        +"<h3><font face=\"Verdana, Arial, Helvetica, sans-serif\">Welcome to "+progName+"!</font></h3>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">You're about to experience how easy secure email and messaging can be. You have the most advanced and easy to use encryption technology available at your fingertips. We have put tremendous effort to ensure all your communications are highly protected with strong cryptography, and not just by a privacy policy. Take a quick tour and get started faster. <a href='"+urlQuickTour+"'>"+urlQuickTour+"</a></font></p>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Here's how to get the most out of "+progName+":</font></p>"
        +"<ol>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Download and install "+progName+" on all your devices. <a href='"+urlDownload+"'>"+urlDownload+"</a></font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Any file you place in your "+progName+" folder will automatically be available from all your devices. </font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Send secure email and replace overnight courier deliveries. <a href='"+urlSecureEmail+"'>"+urlSecureEmail+"</a></font></li>"
        +"<li><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Use it for secure chat, individually or in a group. </font></li>"
        +"</ol>"
        +"<p><font size=\"-1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Congratulations for taking charge of your email privacy, and thank you for choosing us!"
        +"<br>"
        +"<br>"
        +"Welcome to "+progName+"!"
        +"<br>"
        +"<i>- The "+progName+" Team</i>"
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