package org.zenith.core;

import org.zenith.util.CryptoUtils;

import java.util.List;
import java.util.UUID;

public record CloudSessionsDto(UUID ClickFxController, List<CloudEntitlementsDto> CryptoUtils) implements CloudResponse {

   public CloudSessionsDto(UUID ClickFxController, List<CloudEntitlementsDto> CryptoUtils) {
      CryptoUtils = List.copyOf(CryptoUtils);
      this.ClickFxController = ClickFxController;
      this.CryptoUtils = CryptoUtils;
   }

   @Override
   public String type() {
      return "config.codes";
   }

   public UUID PermissionListCodec() {
      return this.ClickFxController;
   }

   public List<CloudEntitlementsDto> HudInfoBoxPrimary() {
      return this.CryptoUtils;
   }
}
