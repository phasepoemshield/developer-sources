package org.zenith.hud;

import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.TextScanner;
import org.zenith.core.MenuScreenId;
import org.zenith.event.Event18;
import org.zenith.event.Event19;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.module.Module;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.module.Interface;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import net.minecraft.client.MinecraftClient;
import java.util.LinkedHashSet;
import net.minecraft.client.gui.screen.ChatScreen;

public class HudElementText2 extends HudElement {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public LinkedHashSet<HudElementText2_Var159> linkedHashSet = new LinkedHashSet<>();
   public UiAnimation var14317 = new UiAnimation(200L, 100.0F, Easing.StopUsingItemEvent);
   public UiAnimation var14318 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public UiAnimation var14319 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);

   public HudElementText2(String var1, float var2, float var3, float var4, float var5, float var6, float var7, HudElement_Var159 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void on23(CustomDrawContext var1) {
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      ZenithClient.on23().ColorAnimator().MenuScreenId().forEach(var1x -> {
         if (var1x.getKeyCode() != -1 && this.linkedHashSet.stream().noneMatch(var1xx -> var1xx.module2 == var1x)) {
            this.linkedHashSet.addLast(new HudElementText2_Var159(this, var1x));
         }
      });
      this.linkedHashSet
         .removeIf(
            var0 -> (!var0.module2.isEnabled() || var0.module2.getKeyCode() == -1) && var0.float206()
         );
      if (this.linkedHashSet.isEmpty()) {
         this.var14318.on23(0.0F);
      } else {
         this.var14318
            .on23(
               this.linkedHashSet.size() == 1
                     && this.linkedHashSet.getFirst().var1434.Event19() == 0.0F
                  ? 0.0F
                  : 1.0F
            );
      }

      float f = this.x;
      float f1 = this.y;
      float f2 = 1.5F;
      float f3 = (float)(
         (double)(17 + GuiStyle.PADDING)
            + this.linkedHashSet
               .stream()
               .mapToDouble(
                  var0 -> (double)((var0.getHeight() + (float)GuiStyle.PADDING.intValue()) * var0.var1434.Event18())
               )
               .sum()
      );
      float f4 = (float)this.linkedHashSet.stream().mapToDouble(HudElementText2_Var159::float205).max().orElse(100.0);
      f4 = this.var14317.on23(f4);
      this.width = f4;
      this.height = f3;
      this.var14319
         .on23(
            minecraftClient3.currentScreen instanceof ChatScreen
               || ZenithClient.on23().NbtEditor().isRenderHud()
               || !this.linkedHashSet.isEmpty()
         );
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      var1.pushMatrix();
      float f5 = Interface.float212();
      org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
         f5
      );
      var1.getMatrices().translate(f + f4 / 2.0F, f1 + f3 / 2.0F, 0.0F);
      var1.getMatrices().scale(this.var14319.Event18(), this.var14319.Event18(), 1.0F);
      var1.getMatrices().translate(-(f + f4 / 2.0F), -(f1 + f3 / 2.0F), 0.0F);
      var1.drawBlurHud(f, f1, f4, f3, 21.0F, ii1il11l111ii11iil, ArgbColor.var11934);
      var1.drawRoundedRect(f, f1, f4, f3, ii1il11l111ii11iil, zenithstyle.getHudBackground().getColor());
      var1.drawRoundedRect(f, f1, f4, 17.0F, ii1il11l111ii11iil, zenithstyle.getHeaderHudBackground().getColor());
      var1.drawText(font, "n", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().getColor());
      var1.drawText(font, "m", f + f4 - 8.0F - font.width("M"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().getColor());
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      var1.drawText(
         font1,
         "Keybinds",
         f + 8.0F + font.width("n") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor()
      );
      if (this.var14319.Event18() == 1.0F) {
         float f6 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         int i = 0;
         var1.enableScissor((int)f, (int)f1, (int)(f + f4), (int)(f1 + f3));

         for (HudElementText2_Var159 iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil : this.linkedHashSet) {
            iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil.on23(var1, f, f6, f4, i, f5);
            f6 += (iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
               * iiiliilli1i1li111i11lil1liil_ii1il11l111ii11iil.var1434.Event18();
            i++;
         }

         var1.disableScissor();
      }

      var1.popMatrix();
   }
}
