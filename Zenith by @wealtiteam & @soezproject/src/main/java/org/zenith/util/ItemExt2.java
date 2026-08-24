package org.zenith.util;

import org.zenith.core.ItemRegistry;
import org.zenith.module.TargetESP;
import org.zenith.module.TotemParticles;

import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClientProvider;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.VelocityChangeEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class ItemExt2 extends Item<ItemExt2_Var159> implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public ItemExt2() {
      super("macros", "", new ItemExt2_1().getType(), ArrayList::new);
      EventManager.register(this);
   }

   @Override
   protected Gson createGson() {
      return new GsonBuilder()
         .registerTypeAdapter(ItemExt2_Var159.class, new ItemExt2_Var143())
         .setPrettyPrinting()
         .create();
   }

   public boolean isEmpty() {
      return this.items.isEmpty();
   }

   public void on23(ItemExt2_Var159 var1) {
      this.items.add(var1);
   }

   public void on23(String var1, int var2, String var3) {
      this.items.add(new ItemExt2_Var159(var1, var2, var3));
   }

   public void Event09(String var1) {
      this.items.removeIf(var1x -> var1x.name().equalsIgnoreCase(var1));
   }

   public ItemExt2_Var159 Event13(String var1) {
      return this.items.stream().filter(var1x -> var1x.name().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public boolean VelocityChangeEvent(String var1) {
      return this.Event13(var1) != null;
   }

   public void clear() {
      this.items.clear();
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      if (minecraftClient3.player != null) {
         for (ItemExt2_Var159 ilii1111lllilllilllii_ii1il11l111ii11iil : this.items) {
            if (var1.ItemRegistry(ilii1111lllilllilllii_ii1il11l111ii11iil.TargetESP())) {
               this.UiAnimation(ilii1111lllilllilllii_ii1il11l111ii11iil);
            }
         }
      }
   }

   public void UiAnimation(ItemExt2_Var159 var1) {
      if (var1.TotemParticles().startsWith("/")) {
         minecraftClient3.player.networkHandler.sendChatCommand(var1.TotemParticles().substring(1));
      } else {
         minecraftClient3.player.networkHandler.sendChatMessage(var1.TotemParticles());
      }
   }
}
