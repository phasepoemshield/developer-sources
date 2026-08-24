package org.zenith.rotation;

import org.zenith.core.InventoryUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.AnalyticsTracker;
import org.zenith.config.ConfigJsonUtil;
import org.zenith.config.ProtocolMessage;
import org.zenith.core.CloudRouter;
import org.zenith.core.CloudApiClient;

public class RoundedRectEasing_Var159 {
   public boolean boolean62;
   public int int112;
   public boolean boolean63;
   public boolean boolean64;
   public boolean boolean65;
   public boolean boolean66;
   public boolean boolean67;
   public float float30;
   public boolean boolean68;
   public float float31;
   public boolean boolean69;
   public float float32;
   public boolean boolean70;
   public float float33;

   RoundedRectEasing_Var159() {
   }

   public RoundedRectEasing_Var159 InventoryUtils(int var1) {
      this.int112 = var1;
      this.boolean62 = true;
      return this;
   }

   public RoundedRectEasing_Var159 CloudApiClient(boolean var1) {
      this.boolean64 = var1;
      this.boolean63 = true;
      return this;
   }

   public RoundedRectEasing_Var159 MediaTrackInfo(boolean var1) {
      this.boolean66 = var1;
      this.boolean65 = true;
      return this;
   }

   public RoundedRectEasing_Var159 CloudRouter(float var1) {
      this.float30 = var1;
      this.boolean67 = true;
      return this;
   }

   public RoundedRectEasing_Var159 ProtocolMessage(float var1) {
      this.float31 = var1;
      this.boolean68 = true;
      return this;
   }

   public RoundedRectEasing_Var159 AnalyticsTracker(float var1) {
      this.float32 = var1;
      this.boolean69 = true;
      return this;
   }

   public RoundedRectEasing_Var159 ConfigJsonUtil(float var1) {
      this.float33 = var1;
      this.boolean70 = true;
      return this;
   }

   public RoundedRectEasing call200() {
      int i = this.int112;
      if (!this.boolean62) {
         i = RoundedRectEasing.call458();
      }

      boolean flag = this.boolean64;
      if (!this.boolean63) {
         flag = RoundedRectEasing.isTrue();
      }

      boolean flag1 = this.boolean66;
      if (!this.boolean65) {
         flag1 = RoundedRectEasing.isTrue2();
      }

      float f = this.float30;
      if (!this.boolean67) {
         f = RoundedRectEasing.call264();
      }

      float f1 = this.float31;
      if (!this.boolean68) {
         f1 = RoundedRectEasing.call205();
      }

      float f2 = this.float32;
      if (!this.boolean69) {
         f2 = RoundedRectEasing.call459();
      }

      float f3 = this.float33;
      if (!this.boolean70) {
         f3 = RoundedRectEasing.call206();
      }

      return new RoundedRectEasing(i, flag, flag1, f, f1, f2, f3);
   }

   @Override
   public String toString() {
      return "GownoRotationConfig.GownoRotationConfigBuilder(tick$value="
         + this.int112
         + ", multiplyYaw$value="
         + this.boolean64
         + ", multiplyPitch$value="
         + this.boolean66
         + ", yawAcceleration$value="
         + this.float30
         + ", yawDeceleration$value="
         + this.float31
         + ", pitchAcceleration$value="
         + this.float32
         + ", pitchDeceleration$value="
         + this.float33
         + ")";
   }
}
