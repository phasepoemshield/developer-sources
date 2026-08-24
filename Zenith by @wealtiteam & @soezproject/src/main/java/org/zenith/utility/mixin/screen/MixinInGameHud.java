package org.zenith.utility.mixin.screen;

import org.zenith.base.font.Font;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.module.Module;

import org.zenith.module.Crosshair;
import org.zenith.module.Interface;
import org.zenith.module.NameProtect;
import org.zenith.module.NoRender;

import org.zenith.event.EventRender2;

import org.zenith.module.Crosshair;
import org.zenith.event.EventRender2;
import org.zenith.module.Interface;
import org.zenith.module.NameProtect;
import org.zenith.module.NoRender;
import org.zenith.util.TextReplaceUtils;
import org.zenith.util.TextUtils;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClientProvider;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameHud.class})
public abstract class MixinInGameHud {
   public MixinInGameHud() {
   }

   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onRenderStatusEffectOverlay(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (Interface.interfaceField.isEnabled() && Interface.interfaceField.float33()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   public void onRender(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      CustomDrawContext customdrawcontext = new CustomDrawContext(var1);
      var1.getMatrices().push();

      try {
         EventManager.call(new EventRender2(customdrawcontext, var2.getTickDelta(false)));
      } catch (Exception exception) {
         exception.printStackTrace();
      }

      var1.getMatrices().pop();
   }

   @Inject(
      method = {"renderCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void removeVanillaCrosshair(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      try {
         Crosshair l1111l1llilllllllilli1i = Crosshair.crosshair;
         if (l1111l1llilllllllilli1i.isEnabled()) {
            var1.getMatrices().translate(0.0F, 0.0F, -200.0F);
            var3.cancel();
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   @Inject(
      method = {"renderMainHud"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void renderMainHud(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (ClientProvider.minecraftClient3.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lllilili1li1111l = Interface.interfaceField;
         if (lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean65()) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"renderExperienceLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void renderExperienceLevel(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (ClientProvider.minecraftClient3.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lllilili1li1111l = Interface.interfaceField;
         if (lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean65()) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"renderPlayerList"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void inject(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Interface lllilili1li1111l = Interface.interfaceField;
      if (lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean66()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderOverlayMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void injectRenderOverlayMessage(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      if (ClientProvider.minecraftClient3.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lllilili1li1111l = Interface.interfaceField;
         if (lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean65()) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar*"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void injectRenderScoreboardSidebar(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Interface lllilili1li1111l = Interface.interfaceField;
      if (NoRender.noRender.float378()
         || lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean64()) {
         var3.cancel();
      }
   }

   @ModifyArg(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawText(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;IIIZ)I"
      ),
      index = 1
   )
   public Text zenith_modifyScoreboardName(Text var1) {
      Text text = TextUtils.TextScanner(var1);
      if (text == null) {
         return Text.empty();
      } else {
         if (NameProtect.nameProtect.isEnabled() && ClientProvider.minecraftClient3.player != null) {
            if (text.getString().contains(ClientProvider.minecraftClient3.player.getNameForScoreboard())) {
               return TextReplaceUtils.UiAnimation(
                  text, ClientProvider.minecraftClient3.player.getNameForScoreboard(), NameProtect.call029()
               );
            }

            if (NameProtect.nameProtect.int440() != null) {
               if (text.getString().contains("\u0413\u0440\u0443\u043f\u043f\u0430:")) {
                  return TextReplaceUtils.Easing(
                     text, "\u0413\u0440\u0443\u043f\u043f\u0430:", NameProtect.nameProtect.int440()
                  );
               }

               if (text.getString().contains("\u0420\u0430\u043d\u0433:")) {
                  return TextReplaceUtils.Easing(
                     text, "\u0420\u0430\u043d\u0433:", NameProtect.nameProtect.int440()
                  );
               }
            }
         }

         return text;
      }
   }

   @ModifyVariable(
      method = {"renderStatusBars"},
      at = @At("STORE"),
      ordinal = 3
   )
   public int modifyM(int var1, DrawContext var2) {
      if (ClientProvider.minecraftClient3.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lllilili1li1111l = Interface.interfaceField;
         if (lllilili1li1111l.isEnabled() && lllilili1li1111l.boolean65()) {
            return var2.getScaledWindowWidth() / 2 + 90 + 36;
         }
      }

      return var1;
   }
}
