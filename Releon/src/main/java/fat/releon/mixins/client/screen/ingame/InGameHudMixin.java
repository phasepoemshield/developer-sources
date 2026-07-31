package fat.releon.mixins.client.screen.ingame;

import fat.releon.Releon;
import java.util.ConcurrentModificationException;
import l.Helper124;
import l.Helper147;
import l.Helper160;
import l.Helper178;
import l.CrossHair;
import l.Hud;
import l.Event20;
import l.Widget16;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.scoreboard.ScoreboardObjective;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameHud.class})
public abstract class InGameHudMixin implements Helper160 {
   @Final
   @Shadow
   private MinecraftClient client;

   public InGameHudMixin() {
   }

   @Unique
   private static Hud hud() {
      return Hud.method1824();
   }

   @Shadow
   protected abstract void renderStatusBars(DrawContext var1);

   @Shadow
   protected abstract void renderMountHealth(DrawContext var1);

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelHudWhenClickGuiOpen(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (this.client.currentScreen instanceof Widget16) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/LayeredDrawer;render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V",
         shift = Shift.AFTER
      )}
   )
   public void onRender(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      blur.method955();
      Event20 var4 = new Event20(var1, drawEngine, var2.getTickDelta(false));
      Helper124.method1026(var4);
      Helper178.method1501(var1);
      boolean var5 = this.client.getDebugHud().shouldShowDebugHud();
      boolean var6 = this.client.options.playerListKey.isPressed();
      if (!this.client.options.hudHidden && !var5) {
         var1.getMatrices().push();
         var1.getMatrices().translate(0.0F, 0.0F, 400.0F);
         Hud var7 = hud();
         Releon.method71().method26().method788().forEach(var2x -> {
            if (var2x.method971(var7, var2x)) {
               var2x.method967();
            } else {
               var2x.method966();
            }

            float var3x = var2x.method989().method5000().floatValue();
            if (!var2x.method970()) {
               var2x.method968();

               try {
                  Helper147.method1233(var3x, () -> var2x.method310(var1));
               } catch (ConcurrentModificationException var5x) {
               }
            }
         });
         var1.getMatrices().pop();
      }
   }

   @Inject(
      method = {"renderCrosshair"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/gui/hud/InGameHud;CROSSHAIR_TEXTURE:Lnet/minecraft/util/Identifier;"
      )},
      cancellable = true
   )
   public void renderCrosshairHook(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      CrossHair var4 = CrossHair.method1760();
      if (var4.isState()) {
         var4.method1761();
         var3.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"renderStatusEffectOverlay"},
      cancellable = true
   )
   public void renderStatusEffectOverlayHook(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Hud var4 = hud();
      if (var4.isState() && var4.interfaceSettings.method2588("Potions")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderScoreboardSidebarHook(DrawContext var1, ScoreboardObjective var2, CallbackInfo var3) {
      Hud var4 = hud();
      if (var4.isState() && var4.interfaceSettings.method2588("Score Board")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderOverlayMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderOverlayMessage(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Hud var4 = hud();
      if (var4.isState() && var4.interfaceSettings.method2588("HotBar")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderExperienceLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderExperienceLevel(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Hud var4 = hud();
      if (var4.isState() && var4.interfaceSettings.method2588("HotBar")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderMainHud"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderMainHud(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Hud var4 = hud();
      if (var4.isState() && var4.interfaceSettings.method2588("HotBar")) {
         var1.drawGuiTexture(RenderLayer::getGuiTextured, InGameHud.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE, 0, 0, 1, 1);
         if (this.client.interactionManager.hasStatusBars()) {
            this.renderStatusBars(var1);
         }

         this.renderMountHealth(var1);
         var3.cancel();
      }
   }
}
