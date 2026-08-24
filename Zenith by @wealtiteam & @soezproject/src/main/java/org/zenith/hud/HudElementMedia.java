package org.zenith.hud;

import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
import org.zenith.core.CloudUserProfile;
import org.zenith.event.Event18;
import org.zenith.event.Event19;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.module.Module;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.util.TextReplaceUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.module.Interface;

import org.zenith.event.EventHookPacketProcess2;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.utility.render.display.base.GradientRadius;














import net.minecraft.client.MinecraftClient;
import com.mojang.authlib.GameProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameMode;

public class HudElementMedia extends HudElement {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final float float236 = 17.0F;
   public static final float float237 = 7.0F;
   public UiAnimation var14320 = new UiAnimation(200L, 100.0F, Easing.StopUsingItemEvent);
   public UiAnimation var14321 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public UiAnimation var14322 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public Map<String, HudElementMedia_Var143> map37 = new LinkedHashMap<>();
   public Set<String> set12 = Set.of(
      "helper",
      "\u1d00\u0434\u043c\u0438\u043d",
      "moder",
      "staff",
      "admin",
      "curator",
      "\u0441\u0442\u0430\u0436\u0451\u0440",
      "\u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u043a",
      "\u043f\u043e\u043c\u043e\u0449\u043d\u0438\u043a",
      "\u0430\u0434\u043c\u0438\u043d",
      "\u043c\u043e\u0434\u0435\u0440"
   );
   public Map<String, Identifier> map38 = new HashMap<>();
   public long long145 = 0L;
   public long long146 = 0L;
   public Set<String> set13 = new HashSet<>();

   public HudElementMedia(String var1, float var2, float var3, float var4, float var5, float var6, float var7, HudElement_Var159 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void on23(CustomDrawContext var1) {
      long i = System.currentTimeMillis();
      if (i - this.long145 > 1000L && minecraftClient3.getNetworkHandler() != null) {
         this.int439();
         this.long145 = i;
      }

      if (i - this.long146 > 30000L) {
         this.map38.clear();
         this.long146 = i;
      }

      this.map37.entrySet().removeIf(var0 -> var0.getValue().float206());
      if (this.map37.isEmpty()) {
         this.var14321.on23(0.0F);
      } else {
         HudElementMedia_Var143 l11i1l1l11l111iil1_l1i1illlilix = this.map37.values().iterator().next();
         this.var14321
            .on23(
               this.map37.size() == 1 && l11i1l1l11l111iil1_l1i1illlilix.var14310.Event19() == 0.0F
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
            + this.map37
               .values()
               .stream()
               .mapToDouble(var0 -> (double)((var0.getHeight() + (float)GuiStyle.PADDING.intValue()) * var0.var14310.Event18()))
               .sum()
      );
      float f3 = (float)this.map37.values().stream().mapToDouble(HudElementMedia_Var143::float205).max().orElse(100.0);
      f3 = this.var14320.on23(f3);
      this.width = f3;
      this.height = f2;
      float f4 = Interface.float212();
      this.var14322
         .on23(
            minecraftClient3.currentScreen instanceof ChatScreen
               || ZenithClient.on23().NbtEditor().isRenderHud()
               || !this.map37.isEmpty()
         );
      var1.pushMatrix();
      var1.getMatrices().translate(f + f3 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      var1.getMatrices()
         .scale(this.var14322.Event18(), this.var14322.Event18(), 1.0F);
      var1.getMatrices().translate(-(f + f3 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      var1.drawBlurHud(
         f,
         f1,
         f3,
         f2,
         21.0F,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(f4),
         ArgbColor.var11934
      );
      var1.drawRoundedRect(
         f, f1, f3, f2, org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(f4), zenithstyle.getHudBackground().getColor()
      );
      var1.drawRoundedRect(
         f,
         f1,
         f3,
         17.0F,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(f4),
         zenithstyle.getHeaderHudBackground().getColor()
      );
      var1.drawText(font, "P", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().getColor());
      var1.drawText(font, "m", f + f3 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().getColor());
      var1.drawText(
         font1,
         "Staffs",
         f + 8.0F + font.width("P") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor()
      );
      if (this.var14322.Event18() == 1.0F) {
         float f5 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         var1.enableScissor((int)f, (int)f1, (int)(f + f3), (int)(f1 + f2));

         for (var entry : this.map37.entrySet()) {
            HudElementMedia_Var143 l11i1l1l11l111iil1_l1i1illlili = (HudElementMedia_Var143)entry.getValue();
            l11i1l1l11l111iil1_l1i1illlili.on23(var1, f, f5, f3, this.set13.contains(entry.getKey()));
            f5 += (l11i1l1l11l111iil1_l1i1illlili.getHeight() + (float)GuiStyle.PADDING.intValue())
               * l11i1l1l11l111iil1_l1i1illlili.var14310.Event18();
         }

         var1.disableScissor();
      }

      var1.popMatrix();
   }

   public void int439() {
      if (minecraftClient3.getNetworkHandler() != null) {
         this.set13.clear();

         for (PlayerListEntry playerlistentry : minecraftClient3.getNetworkHandler().getPlayerList()) {
            GameProfile gameprofile = playerlistentry.getProfile();
            Text text = playerlistentry.getDisplayName();
            if (gameprofile != null) {
               String s = gameprofile.getName();
               boolean flag = ZenithClient.on23().CloudUserProfile().EventGetBasicProjectionMatrixHook2(s);
               if (text != null || flag) {
                  String s1 = text != null ? text.getString() : s;
                  String s2 = s1.replace(s, "").trim();
                  if (flag || this.EventHookPacketProcess2(s2) && s2.length() >= 2) {
                     HudElementMedia_Var165 l11i1l1l11l111iil1_illi1l1l1 = playerlistentry.getGameMode() == GameMode.SPECTATOR
                        ? HudElementMedia_Var165.val510
                        : HudElementMedia_Var165.val509;
                     if (text != null) {
                        text = text.getString().contains(gameprofile.getName())
                           ? TextReplaceUtils.on23(text, gameprofile.getName(), false)
                           : TextReplaceUtils.on23(text, false);
                     } else {
                        text = Text.of(s);
                     }

                     Text text1 = text;
                     this.map37
                        .computeIfAbsent(s1, var5x -> new HudElementMedia_Var143(this, text1, s1, s, l11i1l1l11l111iil1_illi1l1l1));
                     this.set13.add(s1);
                  }
               }
            }
         }
      }
   }

   public boolean EventHookPacketProcess2(String var1) {
      String s = var1.toLowerCase(Locale.US);

      for (String s1 : this.set12) {
         if (s.contains(s1)) {
            return true;
         }
      }

      return false;
   }

   public String ItemRegistry(long var1) {
      long i = var1 / 60000L;
      long j = var1 % 60000L / 1000L;
      return String.format("%d:%02d", i, j);
   }
}
