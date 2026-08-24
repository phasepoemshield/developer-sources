package jnr.posix;

// $VF: Compiled from Passwd.java
public interface Passwd {
   String getAccessClass();

   int getPasswdChangeTime();

   long getGID();

   int getExpire();

   String getShell();

   String getGECOS();

   String getPassword();

   String getLoginName();

   String getHome();

   long getUID();
}
