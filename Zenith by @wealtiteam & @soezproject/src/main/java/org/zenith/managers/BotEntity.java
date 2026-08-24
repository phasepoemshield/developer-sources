package org.zenith.managers;

import org.zenith.module.Module;
import org.zenith.setting.Setting;

import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ServerTheme;
import org.zenith.core.PositionProvider;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.util.ArgbColor;

import org.zenith.rotation.Rotation;

import org.zenith.module.TriggerBot;
import org.zenith.module.WallBypass;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event20;
import org.zenith.event.EventHookTickEvent;
import org.zenith.event.EventInjectAddEntity;
import org.zenith.event.ItemUseEvent;
import org.zenith.event.SprintStateEvent;

import org.zenith.setting.ModeSetting3;



import net.minecraft.util.math.Vec3d;

public abstract class BotEntity implements PositionProvider {
   protected Vec3d TriggerBot;
   protected Vec3d ModeSetting3;
   protected Vec3d vec3d37;
   protected int int143;
   protected int int426;
   protected final int int444;
   protected final float float357;
   protected ArgbColor color;
   protected final String string126;
   protected float rotation;
   protected final float float358;

   protected BotEntity(Vec3d var1, Vec3d var2, int var3, float var4, ArgbColor var5, String var6, float var7, float var8) {
      this.TriggerBot = var1;
      this.ModeSetting3 = var1;
      this.vec3d37 = var2;
      this.int143 = var3;
      this.int426 = var3;
      this.int444 = var3;
      this.float357 = var4;
      this.color = var5;
      this.string126 = var6;
      this.rotation = var7;
      this.float358 = var8;
   }

   @Override
   public boolean float304() {
      return this.int143 <= 0;
   }

   protected void var11928() {
      this.rotation = this.rotation + this.float358;
   }

   protected float EventInjectAddEntity(float var1) {
      float f = (float)this.int426 + (float)(this.int143 - this.int426) * var1;
      return 1.0F - f / (float)this.int444;
   }

   protected void Event20(Vec3d var1) {
      double d0 = this.TriggerBot.distanceTo(var1);
      this.int143 -= d0 > 64.0 ? 8 : 1;
   }

   @Override
   public Vec3d WallBypass() {
      return this.TriggerBot;
   }

   @Override
   public Vec3d getModeSetting3() {
      return this.ModeSetting3;
   }

   public Vec3d boolean86() {
      return this.vec3d37;
   }

   public int boolean87() {
      return this.int143;
   }

   public int boolean88() {
      return this.int426;
   }

   public int boolean149() {
      return this.int444;
   }

   @Override
   public float getSize() {
      return this.float357;
   }

   @Override
   public ArgbColor getColor() {
      return this.color;
   }

   @Override
   public String var111() {
      return this.string126;
   }

   @Override
   public float getRotation() {
      return this.rotation;
   }

   public float var1112() {
      return this.float358;
   }

   public void UiAnimation(Vec3d var1) {
      this.TriggerBot = var1;
   }

   public void Event09(Vec3d var1) {
      this.ModeSetting3 = var1;
   }

   public void Event13(Vec3d var1) {
      this.vec3d37 = var1;
   }

   public void ItemUseEvent(int var1) {
      this.int143 = var1;
   }

   public void SprintStateEvent(int var1) {
      this.int426 = var1;
   }

   public void setColor(ArgbColor var1) {
      this.color = var1;
   }

   public void EventHookTickEvent(float var1) {
      this.rotation = var1;
   }
}
