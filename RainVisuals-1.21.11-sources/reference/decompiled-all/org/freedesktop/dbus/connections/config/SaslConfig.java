package org.freedesktop.dbus.connections.config;

import java.util.OptionalLong;
import org.freedesktop.dbus.connections.SASL;

// $VF: Compiled from SaslConfig.java
public class SaslConfig {
   private int authMode;
   private boolean fileDescriptorSupport;
   private String guid;
   private SASL.SaslMode mode = SASL.SaslMode.CLIENT;
   private boolean strictCookiePermissions;
   private OptionalLong saslUid;

   public void setFileDescriptorSupport(boolean _fileDescriptorSupport) {
      this.fileDescriptorSupport = _fileDescriptorSupport;
   }

   public OptionalLong getSaslUid() {
      return this.saslUid;
   }

   public void setAuthMode(int _types) {
      this.authMode = _types;
   }

   SaslConfig() {
      this.authMode = 0;
      this.saslUid = OptionalLong.empty();
   }

   public boolean isStrictCookiePermissions() {
      return this.strictCookiePermissions;
   }

   public boolean isFileDescriptorSupport() {
      return this.fileDescriptorSupport;
   }

   public String getGuid() {
      return this.guid;
   }

   public int getAuthMode() {
      return this.authMode;
   }

   public SASL.SaslMode getMode() {
      return this.mode;
   }

   public void setStrictCookiePermissions(boolean _strictCookiePermissions) {
      this.strictCookiePermissions = _strictCookiePermissions;
   }

   public void setMode(SASL.SaslMode _mode) {
      this.mode = _mode;
   }

   public void setSaslUid(OptionalLong _saslUid) {
      this.saslUid = _saslUid;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + " [mode="
         + this.mode
         + ", authMode="
         + this.authMode
         + ", guid="
         + this.guid
         + ", saslUid="
         + this.saslUid
         + ", strictCookiePermissions="
         + this.strictCookiePermissions
         + ", fileDescriptorSupport="
         + this.fileDescriptorSupport
         + "]";
   }

   public void setGuid(String _guid) {
      this.guid = _guid;
   }
}
