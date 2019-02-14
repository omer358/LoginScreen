package com.example.android.login;

public class Info {
    private String emailInfo;
    private String passwordInfo;
    private String fName,sName,uEmail,uPassword, phoneNumber;
    public Info(String pEmail,String pPassword)
    {
        emailInfo=pEmail;
        passwordInfo=pPassword;
    }
    public Info(String pFName,String pSName,String PUEmail,String pUPassword,String pPhone)
    {
      fName=pFName;
      sName=pSName;
      uEmail=PUEmail;
      uPassword=pUPassword;
      phoneNumber=pPhone;

    }
    public String getEmailInfo()
    {
        return emailInfo;
    }
    public String getPasswordInfo()
    {
        return passwordInfo;
    }
   public String getfName()
   {
        return fName;
   }
   public String getsName()
   {
        return sName;
   }
   public String getuEmail()
   {
       return uEmail;
   }
   public String getuPassword()
   {
       return uPassword;
   }
   public String getPhoneNumber()
   {
       return phoneNumber;
   }


}
