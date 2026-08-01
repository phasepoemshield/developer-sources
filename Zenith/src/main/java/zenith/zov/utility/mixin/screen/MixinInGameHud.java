package zenith.zov.utility.mixin.screen;

import net.minecraft.world.GameMode;
import net.minecraft.text.Text;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.EventImpl_5;
import zenith.Nameprotect;
import zenith.EventImpl_12;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.StringHolder_21;
import zenith.Event;
import zenith.Interface;
import zenith.Crosshair;
import zenith.DrawContextImpl;

@Mixin({InGameHud.class})
public abstract class MixinInGameHud {
   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onRenderStatusEffectOverlay(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      callbackinfo.cancel();
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   public void onRender(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      DrawContextImpl lliii11l1lllil = new DrawContextImpl(DrawContext);
      DrawContext.getMatrices().push();

      try {
         EventBus.StringHolder_8((Event)(new EventImpl_5(lliii11l1lllil, RenderTickCounter.getTickDelta(false))));
         EventBus.StringHolder_8((Event)(new EventImpl_12(lliii11l1lllil, RenderTickCounter.getTickDelta(false))));
      } catch (Exception exception) {
         exception.printStackTrace();
      }

      DrawContext.getMatrices().pop();
   }

   @Inject(
      method = {"renderCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void removeVanillaCrosshair(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      try {
         Crosshair ll1i1li1l11ll = Crosshair.lII1Il111I1;
         if (ll1i1li1l11ll.Spider()) {
            DrawContext.getMatrices().translate(0.0F, 0.0F, -200.0F);
            callbackinfo.cancel();
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
   private void renderMainHud(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      if (ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
         if (lil1i1i1l1il.Spider() && lil1i1i1l1il.lIIIIl11l111IIIIl1lI1I11I()) {
            callbackinfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderExperienceLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderExperienceLevel(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      if (ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
         if (lil1i1i1l1il.Spider() && lil1i1i1l1il.lIIIIl11l111IIIIl1lI1I11I()) {
            callbackinfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderPlayerList"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void inject(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
      if (lil1i1i1l1il.Spider() && lil1i1i1l1il.II11lI11l11IIIllIl11l()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"renderOverlayMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void injectRenderOverlayMessage(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      if (ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
         if (lil1i1i1l1il.Spider() && lil1i1i1l1il.lIIIIl11l111IIIIl1lI1I11I()) {
            callbackinfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar*"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void injectRenderScoreboardSidebar(DrawContext DrawContext, RenderTickCounter RenderTickCounter, CallbackInfo callbackinfo) {
      Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
      if (lil1i1i1l1il.Spider() && lil1i1i1l1il.lll1I11l1111II111IlIlI1Il()) {
         callbackinfo.cancel();
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
   private Text zenith$modifyScoreboardName(Text Text) {
      if (Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Spider() && ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (Text.getString().contains(ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard())) {
            return StringHolder_21.EventBus(
               Text, ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard(), Nameprotect.IIIlllllI1II1IIIll11I1()
            );
         }

         if (Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I() != null) {
            if (Text.getString().contains("Группа:")) {
               return StringHolder_21.EventTarget(Text, "Группа:", Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I());
            }

            if (Text.getString().contains("Ранг:")) {
               return StringHolder_21.EventTarget(Text, "Ранг:", Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I());
            }
         }
      }

      return Text;
   }

   @ModifyVariable(
      method = {"renderStatusBars"},
      at = @At("STORE"),
      ordinal = 3
   )
   private int modifyM(int i, DrawContext DrawContext) {
      if (ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.interactionManager.getCurrentGameMode() != GameMode.SPECTATOR) {
         Interface lil1i1i1l1il = Interface.ll11lIl1IlIl1lI1;
         if (lil1i1i1l1il.Spider() && lil1i1i1l1il.lIIIIl11l111IIIIl1lI1I11I()) {
            return DrawContext.getScaledWindowWidth() / 2 + 90 + 36;
         }
      }

      return i;
   }
}
