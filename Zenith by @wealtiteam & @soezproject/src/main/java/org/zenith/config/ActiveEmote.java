package org.zenith.config;

import org.zenith.module.Module;

import org.zenith.core.EmotePlayback;

import org.zenith.module.BowAimBot;
import org.zenith.module.ChestStealer;
import org.zenith.module.ClickAction;
import org.zenith.module.ContainerHelper;


import dev.kosmx.playerAnim.api.layered.AnimationContainer;
import net.minecraft.client.network.AbstractClientPlayerEntity;

record ActiveEmote(AbstractClientPlayerEntity abstractClientPlayerEntity2, AnimationContainer<EmotePlayback> animationContainer, EmotePlayback var3, long long96) {

   public AbstractClientPlayerEntity BowAimBot() {
      return this.abstractClientPlayerEntity2;
   }

   public AnimationContainer<EmotePlayback> ChestStealer() {
      return this.animationContainer;
   }

   public EmotePlayback ClickAction() {
      return this.var3;
   }

   public long ContainerHelper() {
      return this.long96;
   }
}
