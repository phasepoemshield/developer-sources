package org.zenith.managers;

import org.zenith.module.Module;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.ShaderWrapper;
import org.zenith.ZenithClient;

import org.zenith.rotation.LegitRotationUtils;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationDelta;
import org.zenith.rotation.RotationMath;

import org.zenith.module.TrapTp;

import org.zenith.event.EventGetFogColorHook;
import org.zenith.event.EventItemRenderHook;
import org.zenith.event.EventRender;
import org.zenith.event.FovEvent;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryOps;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundManager {
   public String string92;
   public String ShaderWrapper;
   public int count;
   public int slotId;
   public long maxSumBuy;
   public int countBuy;
   public String file5;
   public String string116;
   public final SoundEvent soundEvent;
   public final SoundEvent soundEvent2;
   public final SoundEvent soundEvent3;
   public final SoundEvent soundEvent4;
   public final SoundEvent soundEvent5;
   public final SoundEvent soundEvent6;
   public final SoundEvent soundEvent7;

   public SoundManager(String var1, String var2, int var3, int var4, long var5, int var7, String var8) {
      this(var1, var2, var3, var4, var5, var7, var8, null);
   }

   public SoundManager(String var1, String var2, int var3, int var4, long var5, int var7, String var8, String var9) {
      this();
      this.string92 = var1;
      this.ShaderWrapper = var2;
      this.count = var3;
      this.slotId = var4;
      this.maxSumBuy = var5;
      this.countBuy = var7;
      this.file5 = var8;
      this.string116 = var9;
   }

   public static SoundManager on23(ItemStack var0, String var1, int var2, long var3, int var5) {
      String s = Registries.ITEM.getId(var0.getItem()).toString();
      String s1 = null;

      try {
         MinecraftClient minecraftclient = MinecraftClient.getInstance();
         RegistryOps registryops = minecraftclient.world.getRegistryManager().getOps(JsonOps.INSTANCE);
         DataResult<JsonElement> dataresult = ItemStack.CODEC.encodeStart(registryops, var0);
         if (dataresult.result().isPresent()) {
            s1 = dataresult.result().get().toString();
         }
      } catch (Exception exception) {
      }

      return new SoundManager(s, var1, var0.getCount(), var2, var3, var5, s1);
   }

   public ItemStack LegitRotationUtils() {
      if (this.file5 != null && !this.file5.isEmpty()) {
         try {
            MinecraftClient minecraftclient = MinecraftClient.getInstance();
            JsonElement jsonelement = JsonParser.parseString(this.file5);
            RegistryOps registryops = minecraftclient.world.getRegistryManager().getOps(JsonOps.INSTANCE);
            DataResult dataresult = ItemStack.CODEC.decode(registryops, jsonelement);
            if (dataresult.result().isPresent()) {
               return (ItemStack)((Pair)dataresult.result().get()).getFirst();
            }
         } catch (Exception exception) {
         }
      }

      Item item = Registries.ITEM.get(Identifier.tryParse(this.string92));
      return new ItemStack(item, this.count);
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("itemId", this.string92);
      if (this.ShaderWrapper != null) {
         jsonobject.addProperty("searchName", this.ShaderWrapper);
      }

      jsonobject.addProperty("count", this.count);
      jsonobject.addProperty("slotId", this.slotId);
      jsonobject.addProperty("maxSumBuy", this.maxSumBuy);
      jsonobject.addProperty("countBuy", this.countBuy);
      if (this.file5 != null) {
         jsonobject.addProperty("componentsJson", this.file5);
      }

      if (this.string116 != null) {
         jsonobject.addProperty("extraSettingsJson", this.string116);
      }

      return jsonobject;
   }

   public void load(JsonObject var1) {
      if (var1.has("itemId")) {
         this.string92 = var1.get("itemId").getAsString();
      }

      if (var1.has("searchName")) {
         this.ShaderWrapper = var1.get("searchName").getAsString();
      }

      if (var1.has("count")) {
         this.count = var1.get("count").getAsInt();
      }

      if (var1.has("slotId")) {
         this.slotId = var1.get("slotId").getAsInt();
      }

      if (var1.has("maxSumBuy")) {
         this.maxSumBuy = var1.get("maxSumBuy").getAsLong();
      }

      if (var1.has("countBuy")) {
         this.countBuy = var1.get("countBuy").getAsInt();
      }

      if (var1.has("componentsJson")) {
         this.file5 = var1.get("componentsJson").getAsString();
      }

      if (var1.has("extraSettingsJson")) {
         this.string116 = var1.get("extraSettingsJson").getAsString();
      }
   }

   public String Rotation() {
      return this.string92;
   }

   public String TrapTp() {
      return this.ShaderWrapper;
   }

   public int getCount() {
      return this.count;
   }

   public int getSlotId() {
      return this.slotId;
   }

   public long getMaxSumBuy() {
      return this.maxSumBuy;
   }

   public int getCountBuy() {
      return this.countBuy;
   }

   public String RotationDelta() {
      return this.file5;
   }

   public String RotationMath() {
      return this.string116;
   }

   public void EventGetFogColorHook(String var1) {
      this.string92 = var1;
   }

   public void FovEvent(String var1) {
      this.ShaderWrapper = var1;
   }

   public void setCount(int var1) {
      this.count = var1;
   }

   public void setSlotId(int var1) {
      this.slotId = var1;
   }

   public void setMaxSumBuy(long var1) {
      this.maxSumBuy = var1;
   }

   public void setCountBuy(int var1) {
      this.countBuy = var1;
   }

   public void EventRender(String var1) {
      this.file5 = var1;
   }

   public void EventItemRenderHook(String var1) {
      this.string116 = var1;
   }

   public SoundManager() {
      this.soundEvent = zenith_getOrRegisterSound("zenith:gui_open");
      this.soundEvent2 = zenith_getOrRegisterSound("zenith:gui_close");
      this.soundEvent3 = zenith_getOrRegisterSound("zenith:module_enable");
      this.soundEvent4 = zenith_getOrRegisterSound("zenith:module_disable");
      this.soundEvent5 = zenith_getOrRegisterSound("zenith:click_left");
      this.soundEvent6 = zenith_getOrRegisterSound("zenith:click_right");
      this.soundEvent7 = zenith_getOrRegisterSound("zenith:slider_step");
   }

   public static SoundEvent zenith_getOrRegisterSound(String var0) {
      Identifier identifier = Identifier.of(var0);
      if (Registries.SOUND_EVENT.containsId(identifier)) {
         return Registries.SOUND_EVENT.get(identifier);
      } else {
         SoundEvent soundevent = SoundEvent.of(identifier);
         return Registry.register(Registries.SOUND_EVENT, identifier, soundevent);
      }
   }

   public void on23(SoundEvent var1) {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      if (minecraftclient.world != null && minecraftclient.player != null) {
         minecraftclient.world.playSound(minecraftclient.player, minecraftclient.player.getBlockPos(), var1, SoundCategory.BLOCKS, 1.0F, 1.0F);
      }
   }
}
