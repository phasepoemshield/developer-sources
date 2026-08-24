package org.zenith.core;

import org.zenith.event.Event20;

import org.zenith.event.Event18;
import org.zenith.managers.EmoteManager;
import org.zenith.managers.EmoteMetadata;

import org.zenith.event.Event01;
import org.zenith.event.Event08;
import org.zenith.event.Event19;

import project.weye.Session;

public class ClientSession {
   public final String Event18;
   public final String Event08;
   public final String Event01;
   public final SessionFlag Event19;

   public ClientSession() {
      if (System.getProperty("DevMode") == null) {
         Session.loadWEye();
         SessionFlag ii1il11l111ii11iil_ii1il11l111ii11iil_ii1il11l111ii11iil = SessionFlag.Event20;
         this.Event19 = ii1il11l111ii11iil_ii1il11l111ii11iil_ii1il11l111ii11iil;
         this.Event18 = Session.getUsername();
         this.Event08 = Session.getUid();
         this.Event01 = Session.getExpirationDate();
      } else {
          this.Event19 = SessionFlag.Event20;
          this.Event18 = "@soezproject & @wealtiteam";
          this.Event01 = "01.01.2048";
          this.Event08 = "1";
      }
   }

   public String getUsername() {
      return this.Event18;
   }

   public String CloudPoller() {
      return this.Event08;
   }

   public String EmoteMetadata() {
      return this.Event01;
   }

   public SessionFlag EmoteManager() {
      return this.Event19;
   }
}
