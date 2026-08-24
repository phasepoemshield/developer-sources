package eu.donyka.discord.discord;

import lombok.Generated;

// $VF: Compiled from RichPresenceBuilder.java
public class RichPresenceBuilder {
   private final RichPresence presence = new RichPresence();

   public RichPresenceBuilder button(String url, String label) {
      return this.button(RichPresenceBuilder.RPCButton.of(label, url));
   }

   public RichPresenceBuilder smallImageText(String smallImageText) {
      this.presence.smallImageText = smallImageText;
      return this;
   }

   public RichPresenceBuilder partyPrivacy(String partyPrivacy) {
      this.presence.partyPrivacy = partyPrivacy;
      return this;
   }

   public RichPresenceBuilder spectateSecret(String spectateSecret) {
      this.presence.spectateSecret = spectateSecret;
      return this;
   }

   public RichPresenceBuilder endTimestamp(long endTimestamp) {
      this.presence.endTimestamp = endTimestamp;
      return this;
   }

   public RichPresenceBuilder partyMax(int partyMax) {
      this.presence.partyMax = partyMax;
      return this;
   }

   public RichPresence build() {
      return this.presence;
   }

   public RichPresenceBuilder instance(boolean instance) {
      this.presence.instance = instance ? 1 : 0;
      return this;
   }

   public RichPresenceBuilder button2(String label, String url) {
      this.presence.button_label_2 = label;
      this.presence.button_url_2 = url;
      return this;
   }

   public RichPresenceBuilder details(String details) {
      this.presence.details = details;
      return this;
   }

   public RichPresenceBuilder startTimestamp(long startTimestamp) {
      this.presence.startTimestamp = startTimestamp;
      return this;
   }

   public RichPresenceBuilder button1(String label, String url) {
      this.presence.button_label_1 = label;
      this.presence.button_url_1 = url;
      return this;
   }

   public RichPresenceBuilder state(String state) {
      this.presence.state = state;
      return this;
   }

   public RichPresenceBuilder partySize(int partySize) {
      this.presence.partySize = partySize;
      return this;
   }

   public RichPresenceBuilder partyId(String partyId) {
      this.presence.partyId = partyId;
      return this;
   }

   public static RichPresenceBuilder builder() {
      return new RichPresenceBuilder();
   }

   public RichPresenceBuilder matchSecret(String matchSecret) {
      this.presence.matchSecret = matchSecret;
      return this;
   }

   public RichPresenceBuilder joinSecret(String joinSecret) {
      this.presence.joinSecret = joinSecret;
      return this;
   }

   public RichPresenceBuilder largeImageKey(String largeImageKey) {
      this.presence.largeImageKey = largeImageKey;
      return this;
   }

   public RichPresenceBuilder largeImageText(String largeImageText) {
      this.presence.largeImageText = largeImageText;
      return this;
   }

   public RichPresenceBuilder button(RichPresenceBuilder.RPCButton button) {
      if (this.presence.button_label_1 == null) {
         return this.button1(button.getLabel(), button.getUrl());
      } else {
         return this.presence.button_label_2 == null ? this.button2(button.getLabel(), button.getUrl()) : this;
      }
   }

   public RichPresenceBuilder smallImageKey(String smallImageKey) {
      this.presence.smallImageKey = smallImageKey;
      return this;
   }

   // $VF: Compiled from RichPresenceBuilder.java
   public static class RPCButton {
      private final String label;
      private final String url;

      private RPCButton(String label, String url) {
         this.label = label;
         this.url = url;
      }

      public static RichPresenceBuilder.RPCButton of(String label, String url) {
         return new RichPresenceBuilder.RPCButton(label, url);
      }

      @Generated
      public String getLabel() {
         return this.label;
      }

      @Generated
      public String getUrl() {
         return this.url;
      }
   }
}
