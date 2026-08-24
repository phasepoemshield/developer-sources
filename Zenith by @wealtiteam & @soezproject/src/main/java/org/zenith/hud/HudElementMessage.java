package org.zenith.hud;

import org.zenith.config.ProtocolMessage;
import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
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
import org.zenith.core.ChatTagParser;
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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.gui.screen.ChatScreen;

public class HudElementMessage extends HudElement {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final float float239 = 17.0F;
   public static final float float240 = 7.0F;
   public final UiAnimation var14323 = new UiAnimation(200L, 100.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var14324 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var14325 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public final Map<String, HudElementMessage_Var159> map44 = new LinkedHashMap<>();
   public final Set<String> set14 = new HashSet<>();

   public HudElementMessage(String var1, float var2, float var3, float var4, float var5, float var6, float var7, HudElement_Var159 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void on23(CustomDrawContext var1) {
      var list = ZenithClient.on23().ProtocolMessage().getEvents();
      this.set14.clear();

      for (ChatTagParser lilli1lllliii1 : list) {
         String s = this.on23(lilli1lllliii1);
         this.set14.add(s);
         this.map44.computeIfAbsent(s, var2x -> new HudElementMessage_Var159(this, lilli1lllliii1)).UiAnimation(lilli1lllliii1);
      }

      this.map44.values().removeIf(HudElementMessage_Var159::float206);
      if (this.map44.isEmpty()) {
         this.var14324.on23(0.0F);
      } else {
         HudElementMessage_Var159 l11i11iilili_ii1il11l111ii11iil = this.map44.values().iterator().next();
         this.var14324
            .on23(
               this.map44.size() == 1 && l11i11iilili_ii1il11l111ii11iil.var1439.Event19() == 0.0F
                  ? 0.0F
                  : 1.0F
            );
      }

      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      float f = this.x;
      float f1 = this.y;
      float f2 = (float)(
         (double)(17.0F + (float)GuiStyle.PADDING.intValue())
            + this.map44
               .values()
               .stream()
               .mapToDouble(
                  var0 -> (double)((var0.getHeight() + (float)GuiStyle.PADDING.intValue()) * var0.var1439.Event18())
               )
               .sum()
      );
      float f3 = (float)this.map44.values().stream().mapToDouble(HudElementMessage_Var159::float205).max().orElse(100.0);
      f3 = this.var14323.on23(f3);
      this.width = f3;
      this.height = f2;
      this.var14325
         .on23(
            minecraftClient3.currentScreen instanceof ChatScreen
               || ZenithClient.on23().NbtEditor().isRenderHud()
               || !this.map44.isEmpty()
         );
      float f4 = Interface.float212();
      var1.pushMatrix();
      var1.getMatrices().translate(f + f3 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      var1.getMatrices().scale(this.var14325.Event18(), this.var14325.Event18(), 1.0F);
      var1.getMatrices().translate(-(f + f3 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
         f4
      );
      var1.drawBlurHud(f, f1, f3, f2, 21.0F, ii1il11l111ii11iil, ArgbColor.var11934);
      var1.drawRoundedRect(f, f1, f3, f2, ii1il11l111ii11iil, zenithstyle.getHudBackground().getColor());
      var1.drawRoundedRect(f, f1, f3, 17.0F, ii1il11l111ii11iil, zenithstyle.getHeaderHudBackground().getColor());
      var1.drawText(font, "L", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().getColor());
      var1.drawText(font, "m", f + f3 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().getColor());
      var1.drawText(
         font1,
         "Events",
         f + 8.0F + font.width("L") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor()
      );
      if (this.var14325.Event18() == 1.0F) {
         float f5 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         var1.enableScissor((int)f, (int)f1, (int)(f + f3), (int)(f1 + f2));

         for (var entry : this.map44.entrySet()) {
            HudElementMessage_Var159 l11i11iilili_ii1il11l111ii11iilx = (HudElementMessage_Var159)entry.getValue();
            l11i11iilili_ii1il11l111ii11iilx.on23(var1, f, f5, f3, this.set14.contains(entry.getKey()));
            f5 += (l11i11iilili_ii1il11l111ii11iilx.getHeight() + (float)GuiStyle.PADDING.intValue())
               * l11i11iilili_ii1il11l111ii11iilx.var1439.Event18();
         }

         var1.disableScissor();
      }

      var1.popMatrix();
   }

   public String on23(ChatTagParser var1) {
      return var1.int370().name() + "|" + var1.call452() + "|" + var1.getMessage();
   }
}
