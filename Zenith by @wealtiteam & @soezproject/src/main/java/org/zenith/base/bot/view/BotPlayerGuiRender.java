package org.zenith.base.bot.view;

import org.zenith.module.Bot;

import org.zenith.base.bot.net.BotPlayHandler;
import org.zenith.base.bot.world.BotPlayer;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class BotPlayerGuiRender {
   public static final BotPlayerRenderer RENDERER = new BotPlayerRenderer();

   public BotPlayerGuiRender() {
   }

   public static void drawEntity(
      DrawContext var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, BotPlayer var9, BotPlayHandler var10
   ) {
      float f = (float)(var1 + var3) / 2.0F;
      float f1 = (float)(var2 + var4) / 2.0F;
      var0.enableScissor(var1, var2, var3, var4);
      float f2 = (float)Math.atan((double)((f - var7) / 40.0F));
      float f3 = (float)Math.atan((double)((f1 - var8) / 40.0F));
      Quaternionf quaternionf = new Quaternionf().rotateZ((float) Math.PI);
      quaternionf.mul(new Quaternionf().rotateX(f3 * 20.0F * (float) (Math.PI / 180.0)));
      float f4 = var9.bodyYaw;
      float f5 = var9.getYaw();
      float f6 = var9.getPitch();
      float f7 = var9.prevHeadYaw;
      float f8 = var9.headYaw;
      var9.bodyYaw = 180.0F + f2 * 20.0F;
      var9.setYaw(180.0F + f2 * 40.0F);
      var9.setPitch(-f3 * 20.0F);
      var9.headYaw = var9.getYaw();
      var9.prevHeadYaw = var9.getYaw();
      float f9 = var9.getScale();
      Vector3f vector3f = new Vector3f(0.0F, var9.getHeight() / 2.0F + var6 * f9, 0.0F);
      float f10 = (float)var5 / f9;
      var0.getMatrices().push();
      var0.getMatrices().translate(f, f1, 50.0F);
      var0.getMatrices().scale(f10, f10, -f10);
      var0.getMatrices().translate(vector3f.x, vector3f.y, vector3f.z);
      var0.getMatrices().multiply(quaternionf);
      var0.draw();
      DiffuseLighting.method_34742();
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      Immediate immediate = minecraftclient.getBufferBuilders().getEntityVertexConsumers();
      RENDERER.render(var9, var10, var9.getX(), var9.getY(), var9.getZ(), 1.0F, var0.getMatrices(), immediate, 15728880, false);
      immediate.draw();
      var0.getMatrices().pop();
      DiffuseLighting.enableGuiDepthLighting();
      var9.bodyYaw = f4;
      var9.setYaw(f5);
      var9.setPitch(f6);
      var9.prevHeadYaw = f7;
      var9.headYaw = f8;
      var0.disableScissor();
   }
}
