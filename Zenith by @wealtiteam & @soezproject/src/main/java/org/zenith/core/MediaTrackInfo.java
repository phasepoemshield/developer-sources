package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Category;
import org.zenith.ZenithClient;

import org.zenith.hud.HudElement;
import org.zenith.hud.HudElementMedia;
import org.zenith.hud.HudElementMessages;

import org.zenith.event.Event14;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventReplaceMovePacketPitche3;
import org.zenith.event.EventUpdateHealth;
import org.zenith.event.EventUpdateHealth2;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.PlayerMoveEvent;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Locale;
import java.util.UUID;

public record MediaTrackInfo(UUID HudElementMessages, MediaTrackType HudScoreboard, String HudElementMedia, String HudTargetPanel, String HudClockPanel, String HudTextPanel, String HudElement, long Category) {

   public static MediaTrackInfo on23(JsonObject var0) {
      if (var0 == null) {
         return null;
      } else {
         try {
            JsonObject jsonobject = var0.getAsJsonObject("from");
            if (jsonobject == null) {
               return null;
            } else {
               UUID uuid = UUID.fromString(on23(var0, "messageId"));
               MediaTrackType iiilll111l111_ii1il11l111ii11iil = MediaTrackType.valueOf(
                  on23(var0, "channel").toUpperCase(Locale.ROOT)
               );
               String s = on23(jsonobject, "id");
               String s1 = on23(var0, "text");
               long i = var0.get("createdAt").getAsLong();
               return new MediaTrackInfo(
                  uuid,
                  iiilll111l111_ii1il11l111ii11iil,
                  s,
                  UiAnimation(jsonobject, "nickname"),
                  UiAnimation(jsonobject, "role"),
                  UiAnimation(var0, "recipientUserId"),
                  s1,
                  i
               );
            }
         } catch (RuntimeException runtimeexception) {
            return null;
         }
      }
   }

   public static String on23(JsonObject var0, String var1) {
      String s = UiAnimation(var0, var1);
      if (s.isBlank()) {
         throw new IllegalArgumentException(var1 + " is missing");
      } else {
         return s;
      }
   }

   public static String UiAnimation(JsonObject var0, String var1) {
      JsonElement jsonelement = var0.get(var1);
      return jsonelement != null && jsonelement.isJsonPrimitive() ? jsonelement.getAsString() : "";
   }

   public UUID EventReplaceMovePacketPitche3() {
      return this.HudElementMessages;
   }

   public MediaTrackType PlayerMoveEvent() {
      return this.HudScoreboard;
   }

   public String MovementInputEvent() {
      return this.HudElementMedia;
   }

   public String Event14() {
      return this.HudTargetPanel;
   }

   public String EventUpdateHealth() {
      return this.HudClockPanel;
   }

   public String EventUpdateHealth2() {
      return this.HudTextPanel;
   }

   public String text() {
      return this.HudElement;
   }

   public long EventHookPacketProcess2() {
      return this.Category;
   }
}
