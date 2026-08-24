package org.zenith.config;

import org.zenith.core.ItemSpec;
import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.NoiseGenerator;
import org.zenith.core.NeuralProvider;
import org.zenith.core.PermissionListsStore;
import org.zenith.core.TaskQueue;

import org.zenith.module.NameProtect;
import org.zenith.module.NoFriendDamage;
import org.zenith.module.NoInteract;
import org.zenith.module.OpenWals;


import com.google.gson.JsonObject;

public class ProtoChatHistory implements ProtocolMessage {
   public final String NameProtect;
   public final String NoFriendDamage;
   public final JsonObject NoInteract;
   public final int OpenWals;

   public ProtoChatHistory(String var1, String var2, JsonObject var3, int var4) {
      var1 = ConfigJsonUtil.ItemSpec(var1, "channel");
      var3 = var3 == null ? null : var3.deepCopy();
      this.NameProtect = var1;
      this.NoFriendDamage = var2;
      this.NoInteract = var3;
      this.OpenWals = var4;
   }

   @Override
   public String type() {
      return "chat.history.get";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("channel", this.NameProtect);
      jsonobject.addProperty("limit", this.OpenWals);
      if (this.NoFriendDamage != null && !this.NoFriendDamage.isBlank()) {
         jsonobject.addProperty("peerUserId", this.NoFriendDamage);
      }

      if (this.NoInteract != null) {
         jsonobject.add("before", this.NoInteract.deepCopy());
      }

      return jsonobject;
   }

   public String NeuralProvider() {
      return this.NameProtect;
   }

   public String ConfigLoader() {
      return this.NoFriendDamage;
   }

   public JsonObject NoiseGenerator() {
      return this.NoInteract;
   }

   public int PermissionListsStore() {
      return this.OpenWals;
   }
}
