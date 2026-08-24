package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.managers.EmoteRegistry;

import org.zenith.hud.HudElementText;

import org.zenith.module.Menu;
import org.zenith.module.NoRender;
import org.zenith.module.Particles;
import org.zenith.module.ShaderHand;
import org.zenith.module.SwingAnimation;
import org.zenith.module.TargetESP;
import org.zenith.module.TotemParticles;
import org.zenith.module.TotemPop;

import org.zenith.event.EventHookPacketProcess2;


import java.util.UUID;

public record CloudEntitlementsDto(UUID Menu, UUID NoRender, String Particles, String ShaderHand, long SwingAnimation, String TargetESP, Long TotemParticles, Long TotemPop) {

   public UUID InventoryCodec() {
      return this.Menu;
   }

   public UUID PermissionListCodec() {
      return this.NoRender;
   }

   public String PlayerStateService() {
      return this.Particles;
   }

   public String ThemeColorCycler() {
      return this.ShaderHand;
   }

   public long EventHookPacketProcess2() {
      return this.SwingAnimation;
   }

   public String EmoteRegistry() {
      return this.TargetESP;
   }

   public Long UserdataManager() {
      return this.TotemParticles;
   }

   public Long HudElementText() {
      return this.TotemPop;
   }
}
