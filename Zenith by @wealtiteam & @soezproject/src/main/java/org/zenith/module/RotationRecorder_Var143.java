package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.HudPreviewItem;
import org.zenith.config.CosmeticManager;
import org.zenith.core.PositionProvider;
import org.zenith.core.HudEffectIcons;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.PricedItem;
import org.zenith.core.TickGate;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import net.minecraft.entity.EntityPose;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

final class RotationRecorder_Var143 {
   public final float[] val067;
   public final float[] val193;
   public final float[] val013;
   public final Vec3d vec3d18;
   public final Vec3d vec3d19;
   public final Box box5;
   public final PlayerInput playerInput;
   public final Box box6;
   public final boolean boolean89;
   public final boolean boolean90;
   public final boolean boolean91;
   public final float float75;
   public final int int130;
   public final boolean boolean92;
   public final boolean boolean93;
   public final boolean boolean94;
   public final boolean boolean95;
   public final boolean boolean96;
   public final boolean boolean97;
   public final boolean boolean98;
   public final EntityPose entityPose;
   public final boolean boolean99;
   public final boolean boolean100;
   public final float float76;
   public final long long94;
   public final int int131;

   public RotationRecorder_Var143(
      float[] var1,
      float[] var2,
      float[] var3,
      Vec3d var4,
      Vec3d var5,
      Box var6,
      PlayerInput var7,
      Box var8,
      boolean var9,
      boolean var10,
      boolean var11,
      float var12,
      int var13,
      boolean var14,
      boolean var15,
      boolean var16,
      boolean var17,
      boolean var18,
      boolean var19,
      boolean var20,
      EntityPose var21,
      boolean var22,
      boolean var23,
      float var24,
      long var25,
      int var27
   ) {
      this.val067 = (float[])var1.clone();
      this.val193 = (float[])var2.clone();
      this.val013 = (float[])var3.clone();
      this.vec3d18 = var4;
      this.vec3d19 = var5;
      this.box5 = var6;
      this.playerInput = var7;
      this.box6 = var8;
      this.boolean89 = var9;
      this.boolean90 = var10;
      this.boolean91 = var11;
      this.float75 = var12;
      this.int130 = var13;
      this.boolean92 = var14;
      this.boolean93 = var15;
      this.boolean94 = var16;
      this.boolean95 = var17;
      this.boolean96 = var18;
      this.boolean97 = var19;
      this.boolean98 = var20;
      this.entityPose = var21;
      this.boolean99 = var22;
      this.boolean100 = var23;
      this.float76 = var24;
      this.long94 = var25;
      this.int131 = var27;
   }
}
