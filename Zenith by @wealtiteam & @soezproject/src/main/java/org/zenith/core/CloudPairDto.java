package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.hud.HudElementText2;
import org.zenith.render.ShaderPostProcess;

import org.zenith.module.ShaderFog;


import java.util.UUID;

public record CloudPairDto(UUID ShaderFog, UUID ShaderPostProcess, boolean TranslationKey) implements CloudResponse {

   @Override
   public String type() {
      return "config.code.revoked";
   }

   public UUID PermissionListCodec() {
      return this.ShaderFog;
   }

   public UUID InventoryCodec() {
      return this.ShaderPostProcess;
   }

   public boolean HudElementText2() {
      return this.TranslationKey;
   }
}
