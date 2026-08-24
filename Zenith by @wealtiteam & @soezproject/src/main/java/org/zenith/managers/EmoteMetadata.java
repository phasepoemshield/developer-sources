package org.zenith.managers;

import org.zenith.module.Module;

import org.zenith.module.AutoDuels;
import org.zenith.module.AutoLeave;
import org.zenith.module.AutoPay;
import org.zenith.module.AutoRespawn;



import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.util.Identifier;

public record EmoteMetadata(String string99, UUID uUID5, String string100, String string101, Identifier identifier9, KeyframeAnimation keyframeAnimation) {

   public UUID AutoDuels() {
      return this.uUID5;
   }

   public String AutoLeave() {
      return this.string100;
   }

   public String author() {
      return this.string101;
   }

   public Identifier AutoPay() {
      return this.identifier9;
   }

   public KeyframeAnimation AutoRespawn() {
      return this.keyframeAnimation;
   }

   public EmoteMetadata(String string99, UUID uUID5, String string100, String string101, Identifier identifier9, KeyframeAnimation keyframeAnimation) {
      Objects.requireNonNull(string99, "id");
      Objects.requireNonNull(uUID5, "animationUuid");
      Objects.requireNonNull(string100, "displayName");
      Objects.requireNonNull(string101, "author");
      Objects.requireNonNull(identifier9, "icon");
      Objects.requireNonNull(keyframeAnimation, "animation");
      this.string99 = string99;
      this.uUID5 = uUID5;
      this.string100 = string100;
      this.string101 = string101;
      this.identifier9 = identifier9;
      this.keyframeAnimation = keyframeAnimation;
   }

   public String id() {
      return this.string99;
   }
}
