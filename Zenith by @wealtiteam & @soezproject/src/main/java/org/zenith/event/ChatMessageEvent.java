package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.NoInteract;
import org.zenith.module.OpenWals;

import org.zenith.event.Event18;
import org.zenith.module.NoInteract;
import org.zenith.module.OpenWals;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;



public final class ChatMessageEvent extends Event18 {
   public String message;
   public final ChatMessageEvent_Var159 direction;
   public final ChatMessageEvent_Var143 phase;

   public ChatMessageEvent(String var1, ChatMessageEvent_Var159 var2, ChatMessageEvent_Var143 var3) {
      this.message = var1;
      this.direction = var2;
      this.phase = var3;
   }

   public String getMessage() {
      return this.message;
   }

   public boolean NoInteract() {
      return this.direction == ChatMessageEvent_Var159.call205;
   }

   public boolean OpenWals() {
      return this.phase == ChatMessageEvent_Var143.call206;
   }
}
