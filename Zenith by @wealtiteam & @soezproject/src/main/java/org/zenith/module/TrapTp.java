package org.zenith.module;

import org.zenith.core.ColorAnimator;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.setting.Setting;



import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.ColorUtils;

import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.Easing;
import org.zenith.util.ScreenUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BooleanValue;
import org.zenith.render.WorldRender;

import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventTick;
import org.zenith.event.PacketEvent;
import org.zenith.event.PacketSendEvent;

import org.zenith.setting.ModeSetting3;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

@ModuleInfo(
   name = "TrapTp",
   description = "\u0417\u0430\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u043f\u0430\u043a\u0435\u0442\u044b \u043f\u043e\u0441\u043b\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0442\u0440\u0430\u043f\u043a\u0438",
   category = Category.COMBAT
)
public final class TrapTp extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final TrapTp trapTp = new TrapTp();
   public static final long long138 = 2000L;
   public static final double double104 = 2.0;
   public static final double double105 = 5.0;
   public final ModeSetting3 mode17 = new ModeSetting3(
      "Mode", "", "module.serverHelper.normalTrap", "module.serverHelper.explosiveTrap"
   );
   public final Queue<Packet<?>> queue6 = new ConcurrentLinkedQueue<>();
   public Vec3d vec3d36;
   public long long139;
   public boolean boolean49;

   public TrapTp() {
   }

   @Override
   public void onEnable() {
      this.queue6.clear();
      this.boolean49 = false;
      if (minecraftClient3.player != null && minecraftClient3.world != null && minecraftClient3.getNetworkHandler() != null
         )
       {
         this.vec3d36 = minecraftClient3.player.getPos();
         this.long139 = System.currentTimeMillis();
         super.onEnable();
         ScreenUtils.ItemServiceBase(this.int340());
      } else {
         super.onEnable();
         this.disableSelf();
      }
   }

   @Override
   public void onDisable() {
      this.boolean174();
      this.vec3d36 = null;
      this.long139 = 0L;
      super.onDisable();
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null && !minecraftClient3.player.isDead()) {
         if (this.vec3d36 == null || this.int342() || System.currentTimeMillis() - this.long139 >= 2000L) {
            this.disableSelf();
         }
      } else {
         this.queue6.clear();
         this.disableSelf();
      }
   }

   @EventTarget
   public void Easing(EventHookWorldRender var1) {
      if (this.vec3d36 != null && minecraftClient3.player != null) {
         int i = ZenithClient.on23().TextScanner().getClientColor(90).call001();
         this.on23(var1.ClanUpgrade(), this.int341(), i);
      }
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      if (var1.Arrows() && var1.ItemScroller() != null) {
         if (var1.ItemScroller() instanceof DisconnectS2CPacket || var1.ItemScroller() instanceof PlayerPositionLookS2CPacket) {
            this.queue6.clear();
            this.disableSelf();
         }
      }
   }

   @EventTarget(0)
   public void on23(PacketSendEvent var1) {
      if (!var1.isCancelled()
         && !this.boolean49
         && !Blink.blink.call045()
         && var1.ItemScroller() != null) {
         if (minecraftClient3.player != null && minecraftClient3.world != null) {
            var1.cancel();
            this.queue6.add(var1.ItemScroller());
         } else {
            this.queue6.clear();
         }
      }
   }

   public boolean call045() {
      return this.boolean49;
   }

   public Item int340() {
      return this.mode17.is(1) ? Items.PRISMARINE_SHARD : Items.POPPED_CHORUS_FRUIT;
   }

   public double int341() {
      return this.mode17.is(1) ? 7.0 : 2.0;
   }

   public boolean int342() {
      if (minecraftClient3.player != null && this.vec3d36 != null) {
         double d0 = minecraftClient3.player.getX() - this.vec3d36.x;
         double d1 = minecraftClient3.player.getZ() - this.vec3d36.z;
         double d2 = this.int341() + 1.0;
         return d0 * d0 + d1 * d1 > d2 * d2;
      } else {
         return true;
      }
   }

   public void boolean174() {
      if (!this.queue6.isEmpty() && minecraftClient3.getNetworkHandler() != null) {
         this.boolean49 = true;

         Packet packet;
         try {
            while ((packet = this.queue6.poll()) != null) {
               minecraftClient3.getNetworkHandler().sendPacket(packet);
            }
         } finally {
            this.boolean49 = false;
            this.queue6.clear();
         }
      } else {
         this.queue6.clear();
         this.boolean49 = false;
      }
   }

   public void on23(MatrixStack var1, double var2, int var4) {
      Vec3d vec3d = this.vec3d36.add(0.0, 0.02, 0.0);
      Vec3d vec3d1 = vec3d.subtract(minecraftClient3.getEntityRenderDispatcher().camera.getPos());
      GL11.glEnable(2881);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
      int i = 0;

      for (byte b0 = 90; i <= b0; i++) {
         Vec3d vec3d2 = MathUtils.on23((float)i, (float)b0, var2);
         Vec3d vec3d3 = MathUtils.on23((float)(i + 1), (float)b0, var2);
         WorldRender.on23(
            var1,
            bufferbuilder,
            vec3d1.add(vec3d2),
            vec3d1.add(vec3d2.x, vec3d2.y + 2.0, vec3d2.z),
            ColorUtils.ColorAnimator(var4, 0.2F),
            ColorUtils.ColorAnimator(var4, 0.0F)
         );
         WorldRender.on23(vec3d.add(vec3d2), vec3d.add(vec3d3), var4, 2.0F, true);
      }

      i = 0;

      for (byte b1 = 90; i <= b1; i++) {
         Vec3d vec3d4 = MathUtils.on23((float)i, (float)b1, var2);
         WorldRender.on23(
            var1,
            bufferbuilder,
            vec3d1.add(vec3d4),
            vec3d1.add(vec3d4.x, vec3d4.y - 2.0, vec3d4.z),
            ColorUtils.ColorAnimator(var4, 0.2F),
            ColorUtils.ColorAnimator(var4, 0.0F)
         );
      }

      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      RenderSystem.enableCull();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2881);
   }
}
