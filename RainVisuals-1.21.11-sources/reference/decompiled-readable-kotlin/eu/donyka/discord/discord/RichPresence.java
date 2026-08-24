package eu.donyka.discord.discord;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

// $VF: Compiled from RichPresence.java
public class RichPresence {
   public String spectateSecret;
   public int partyMax;
   public String smallImageKey;
   public String state;
   public String details;
   public int partySize;
   public String button_url_2;
   public String smallImageText;
   public String largeImageKey;
   public String button_label_2;
   public int instance;
   public long startTimestamp;
   public String partyId;
   public String button_label_1;
   public String button_url_1;
   public String partyPrivacy;
   public long endTimestamp;
   public String largeImageText;
   public String matchSecret;
   public String joinSecret;

   public static RichPresenceBuilder builder() {
      return RichPresenceBuilder.builder();
   }

   private boolean isNotNullOrEmpty(String input) {
      return input != null && !input.trim().isEmpty();
   }

   public JsonObject toJson(long nonce, long pid) {
      JsonObject data = new JsonObject();
      data.addProperty("nonce", nonce);
      data.addProperty("cmd", "SET_ACTIVITY");
      JsonObject args = new JsonObject();
      args.addProperty("pid", pid);
      JsonObject activity = new JsonObject();
      if (this.isNotNullOrEmpty(this.state)) {
         activity.addProperty("state", this.state);
      }

      if (this.isNotNullOrEmpty(this.details)) {
         activity.addProperty("details", this.details);
      }

      if (this.startTimestamp != 0L || this.endTimestamp != 0L) {
         JsonObject buttons = new JsonObject();
         if (this.startTimestamp != 0L) {
            buttons.addProperty("start", this.startTimestamp);
         }

         if (this.endTimestamp != 0L) {
            buttons.addProperty("end", this.endTimestamp);
         }

         activity.add("timestamps", buttons);
      }

      if (this.isNotNullOrEmpty(this.largeImageKey)
         || this.isNotNullOrEmpty(this.largeImageText)
         || this.isNotNullOrEmpty(this.smallImageKey)
         || this.isNotNullOrEmpty(this.smallImageText)) {
         JsonObject var10 = new JsonObject();
         if (this.isNotNullOrEmpty(this.largeImageKey)) {
            var10.addProperty("large_image", this.largeImageKey);
         }

         if (this.isNotNullOrEmpty(this.largeImageText)) {
            var10.addProperty("large_text", this.largeImageText);
         }

         if (this.isNotNullOrEmpty(this.smallImageKey)) {
            var10.addProperty("small_image", this.smallImageKey);
         }

         if (this.isNotNullOrEmpty(this.smallImageText)) {
            var10.addProperty("small_text", this.smallImageText);
         }

         activity.add("assets", var10);
      }

      if (this.isNotNullOrEmpty(this.partyId) || this.partySize > 0 || this.partyMax > 0) {
         JsonObject var11 = new JsonObject();
         if (this.isNotNullOrEmpty(this.partyId)) {
            var11.addProperty("id", this.partyId);
         }

         if (this.partySize != 0) {
            JsonArray btn2 = new JsonArray();
            btn2.add(this.partySize);
            if (this.partyMax > 0) {
               btn2.add(this.partyMax);
            }

            var11.add("size", btn2);
         }

         if (this.isNotNullOrEmpty(this.partyPrivacy)) {
            var11.addProperty("privacy", this.partyPrivacy);
         }

         activity.add("party", var11);
      }

      if (this.isNotNullOrEmpty(this.matchSecret) || this.isNotNullOrEmpty(this.spectateSecret) || this.isNotNullOrEmpty(this.joinSecret)) {
         JsonObject var12 = new JsonObject();
         if (this.isNotNullOrEmpty(this.matchSecret)) {
            var12.addProperty("match", this.matchSecret);
         }

         if (this.isNotNullOrEmpty(this.joinSecret)) {
            var12.addProperty("join", this.joinSecret);
         }

         if (this.isNotNullOrEmpty(this.spectateSecret)) {
            var12.addProperty("spectate", this.spectateSecret);
         }

         activity.add("secrets", var12);
      }

      JsonArray var13 = new JsonArray();
      if (this.isNotNullOrEmpty(this.button_label_1) && this.isNotNullOrEmpty(this.button_url_1)) {
         JsonObject var14 = new JsonObject();
         var14.addProperty("label", this.button_label_1.substring(0, Math.min(this.button_label_1.length(), 32)));
         var14.addProperty("url", this.button_url_1);
         var13.add(var14);
      }

      if (this.isNotNullOrEmpty(this.button_label_2) && this.isNotNullOrEmpty(this.button_url_2)) {
         JsonObject var15 = new JsonObject();
         var15.addProperty("label", this.button_label_2.substring(0, Math.min(this.button_label_2.length(), 32)));
         var15.addProperty("url", this.button_url_2);
         var13.add(var15);
      }

      if (var13.size() > 0) {
         activity.add("buttons", var13);
      }

      activity.addProperty("type", 0);
      activity.addProperty("instance", this.instance != 0);
      args.add("activity", activity);
      data.add("args", args);
      return data;
   }
}
