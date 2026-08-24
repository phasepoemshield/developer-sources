package org.zenith.core;

import org.zenith.base.figura.avatar.AvatarLayer;
import org.zenith.client.screens.entity.ImplOtherClientPlayerEntity;














import java.util.UUID;

record AvatarJob(UUID uUID, AvatarLayer avatarLayer) {

   public UUID uUID4() {
      return this.uUID;
   }

   public AvatarLayer implOtherClientPlayerEntity() {
      return this.avatarLayer;
   }
}
