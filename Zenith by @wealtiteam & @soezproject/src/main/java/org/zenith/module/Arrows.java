package org.zenith.module;

import org.zenith.core.PotionItemBuilder;
import org.zenith.core.NbtEditor;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.core.MediaTrackInfo;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.setting.Setting;
import org.zenith.utility.render.display.base.GradientRadius;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.managers.FriendFilter;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventRender2;
import org.zenith.event.EventTick;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

@ModuleInfo(
   name = "Arrows",
   description = "Arrows",
   category = Category.RENDER
)
public final class Arrows extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final Identifier identifier = ZenithClient.on23("textures/arrows.png");
   public final UiAnimation var143 = new UiAnimation(150L, 12.0F, Easing.StopUsingItemEvent);
   public final NumberSetting radiusSetting = new NumberSetting(
      "module.arrows.radiusSetting", 50.0F, 30.0F, 100.0F, 10.0F, "module.arrows.radiusSetting.desc", "b"
   );
   public final NumberSetting sizeSetting = new NumberSetting(
      "module.arrows.sizeSetting", 16.0F, 8.0F, 20.0F, 1.0F, "module.arrows.sizeSetting.desc", "px"
   );
   public static final Arrows arrows = new Arrows();
   public final BooleanSetting ignoreGol = new BooleanSetting("module.arrows.ignoreGol", "module.arrows.ignoreGol.desc", true);

   public Arrows() {
   }

   @EventTarget
   public void UiAnimation(EventTick var1) {
   }

   @EventTarget
   public void onDraw(EventRender2 var1) {
      MatrixStack matrixstack = var1.Bot().getMatrices();
      var list = Objects.requireNonNull(minecraftClient3.world)
         .getPlayers()
         .stream()
         .filter(
            var1x -> var1x != minecraftClient3.player
                  && !FriendFilter.PotionItemBuilder(var1x.getId())
                  && (!this.ignoreGol.isEnabled() || EffectEngine.ItemServiceBase(var1x) != 0.0F)
         )
         .toList();
      float f = (float)minecraftClient3.getWindow().getScaledWidth() / 2.0F;
      float f1 = (float)minecraftClient3.getWindow().getScaledHeight() / 2.0F;
      float f2 = f1
         - this.radiusSetting.getCurrent()
         - this.var143
            .on23(
               minecraftClient3.currentScreen instanceof InventoryScreen
                  ? 80.0F
                  : (
                     minecraftClient3.currentScreen instanceof GenericContainerScreen
                        ? 100.0F
                        : (Objects.requireNonNull(minecraftClient3.player).isSprinting() ? 12.0F : 0.0F)
                  )
            );
      float f3 = this.sizeSetting.getCurrent();
      if (!minecraftClient3.options.hudHidden
         && minecraftClient3.options.getPerspective().equals(Perspective.FIRST_PERSON)
         && !list.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShaderTexture(0, this.identifier);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         list.forEach(
            var6x -> {
               int i = val003.MediaTrackInfo().UiAnimation(var6x)
                  ? val003.TextScanner().getCurrentStyle().getFriendColor().getColor().call001()
                  : ZenithClient.on23().TextScanner().getClientColor(90).call001();
               float f4 = SimpleItemBuilder((Entity)var6x) - Objects.requireNonNull(minecraftClient3.player).getYaw();
               matrixstack.push();
               matrixstack.translate(f, f1, 0.0F);
               matrixstack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f4));
               matrixstack.translate(-f, -f1, 0.0F);
               Matrix4f matrix4f = matrixstack.peek().getPositionMatrix();
               if (val003.MediaTrackInfo().UiAnimation(var6x)) {
                  bufferbuilder.vertex(matrix4f, f - f3 / 2.0F, f2 + f3, 0.0F).texture(0.0F, 1.0F).color(i);
                  bufferbuilder.vertex(matrix4f, f + f3 / 2.0F, f2 + f3, 0.0F).texture(1.0F, 1.0F).color(i);
                  bufferbuilder.vertex(matrix4f, f + f3 / 2.0F, f2, 0.0F).texture(1.0F, 0.0F).color(i);
                  bufferbuilder.vertex(matrix4f, f - f3 / 2.0F, f2, 0.0F).texture(0.0F, 0.0F).color(i);
               } else {
                  org.zenith.utility.render.display.base.GradientRadius liil11l111liil1ll = val003.TextScanner().getClientColor();
                  bufferbuilder.vertex(matrix4f, f - f3 / 2.0F, f2 + f3, 0.0F)
                     .texture(0.0F, 1.0F)
                     .color(liil11l111liil1ll.call014().call001());
                  bufferbuilder.vertex(matrix4f, f + f3 / 2.0F, f2 + f3, 0.0F)
                     .texture(1.0F, 1.0F)
                     .color(liil11l111liil1ll.call017().call001());
                  bufferbuilder.vertex(matrix4f, f + f3 / 2.0F, f2, 0.0F).texture(1.0F, 0.0F).color(liil11l111liil1ll.call052().call001());
                  bufferbuilder.vertex(matrix4f, f - f3 / 2.0F, f2, 0.0F).texture(0.0F, 0.0F).color(liil11l111liil1ll.call010().call001());
               }

               matrixstack.translate(f, f1, 0.0F);
               matrixstack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-f4));
               matrixstack.translate(-f, -f1, 0.0F);
               matrixstack.pop();
            }
         );
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableBlend();
      }
   }

   public static float SimpleItemBuilder(Entity var0) {
      double d0 = MathUtils.NbtEditor(var0.prevX, var0.getX())
         - MathUtils.NbtEditor(minecraftClient3.player.prevX, minecraftClient3.player.getX());
      double d1 = MathUtils.NbtEditor(var0.prevZ, var0.getZ())
         - MathUtils.NbtEditor(minecraftClient3.player.prevZ, minecraftClient3.player.getZ());
      return (float)(-(Math.atan2(d0, d1) * (180.0 / Math.PI)));
   }
}
