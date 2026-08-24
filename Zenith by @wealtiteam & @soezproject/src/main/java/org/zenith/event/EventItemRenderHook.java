package org.zenith.event;

import org.zenith.module.Module;
import org.zenith.util.Item;

import org.zenith.module.AutoWarden;
import org.zenith.module.AutoZamok;
import org.zenith.module.BaseFinder;

import org.zenith.module.AutoWarden;
import org.zenith.module.AutoZamok;
import org.zenith.module.BaseFinder;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class EventItemRenderHook implements Event {
   public AbstractClientPlayerEntity abstractClientPlayerEntity;
   public ItemStack itemStack5;
   public Hand getSlot;

   public AbstractClientPlayerEntity AutoWarden() {
      return this.abstractClientPlayerEntity;
   }

   public ItemStack AutoZamok() {
      return this.itemStack5;
   }

   public Hand BaseFinder() {
      return this.getSlot;
   }

   public void on23(AbstractClientPlayerEntity var1) {
      this.abstractClientPlayerEntity = var1;
   }

   public void ColorAnimator(ItemStack var1) {
      this.itemStack5 = var1;
   }

   public void on23(Hand var1) {
      this.getSlot = var1;
   }

   public EventItemRenderHook(AbstractClientPlayerEntity var1, ItemStack var2, Hand var3) {
      this.abstractClientPlayerEntity = var1;
      this.itemStack5 = var2;
      this.getSlot = var3;
   }
}
