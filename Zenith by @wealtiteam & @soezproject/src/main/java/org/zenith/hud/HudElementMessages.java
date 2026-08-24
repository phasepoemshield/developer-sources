package org.zenith.hud;

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
import org.zenith.config.ProtocolMessage;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.CloudRouter;

import org.zenith.module.Aura;
import org.zenith.module.Interface;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import net.minecraft.client.MinecraftClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class HudElementMessages extends HudElement {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final float float241 = 17.0F;
   public static final float float242 = 7.0F;
   public final UiAnimation var14326 = new UiAnimation(200L, 100.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var14327 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var14328 = new UiAnimation(200L, 0.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var14329 = new UiAnimation(150L, Easing.StopUsingItemEvent);
   public final UiAnimation var14330 = new UiAnimation(150L, Easing.StopUsingItemEvent);
   public final Map<String, HudElementMessages_Var159> map45 = new LinkedHashMap<>();
   public final Set<String> set15 = new HashSet<>();
   public boolean boolean164 = false;
   public LivingEntity livingEntity2 = null;

   @Override
   public void on23(CustomDrawContext var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         LivingEntity livingentity = null;
         if (Aura.aura.var11813() != null
            && minecraftClient3.world.getEntityById(Aura.aura.var11813().getId()) instanceof LivingEntity livingentity1
            )
          {
            livingentity = livingentity1;
         }

         if (this.livingEntity2 != null || livingentity != null) {
            if (livingentity == null) {
               this.boolean164 = true;
               livingentity = this.livingEntity2;
            } else {
               this.boolean164 = false;
            }

            this.livingEntity2 = livingentity;
            int i = 0;
            int j = 0;
            if (!this.boolean164 && livingentity != null) {
               this.set15.clear();

               for (StatusEffectInstance statuseffectinstance : new ArrayList<>(livingentity.getActiveStatusEffects().values())) {
                  String s = this.Easing(statuseffectinstance);
                  boolean flag = this.on23(statuseffectinstance);
                  this.set15.add(s);
                  if (flag) {
                     i++;
                  } else {
                     j++;
                  }

                  if (!this.map45.containsKey(s)) {
                     this.map45.put(s, new HudElementMessages_Var159(this, statuseffectinstance, flag));
                  }
               }
            }

            this.map45.values().removeIf(HudElementMessages_Var159::float206);
            if (this.map45.isEmpty()) {
               this.var14327.on23(0.0F);
            } else {
               HudElementMessages_Var159 ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilxx = this.map45
                  .values()
                  .iterator()
                  .next();
               this.var14327
                  .on23(
                     this.map45.size() == 1 && ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilxx.var14313.Event19() == 0.0F
                        ? 0.0F
                        : 1.0F
                  );
            }

            this.var14329.on23(i > 0 ? 1.0F : 0.0F);
            this.var14330.on23(j > 0 ? 1.0F : 0.0F);
            var list = this.map45.values().stream().filter(HudElementMessages_Var159::int438).toList();
            var list1 = this.map45.values().stream().filter(var0 -> !var0.int438()).toList();
            ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
            Font font = Fonts.NEW_ICONS.getFont(5.5F);
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
            float f = this.x;
            float f1 = this.y;
            float f2 = (float)list.stream()
               .mapToDouble(var0 -> (double)((var0.getHeight() + (float)GuiStyle.PADDING.intValue()) * var0.var14313.Event18()))
               .sum();
            float f3 = (float)list1.stream()
               .mapToDouble(var0 -> (double)((var0.getHeight() + (float)GuiStyle.PADDING.intValue()) * var0.var14313.Event18()))
               .sum();
            float f4 = 17.0F + (float)GuiStyle.PADDING.intValue();
            f4 += (float)(5 + GuiStyle.PADDING) * this.var14329.Event18();
            f4 += f2;
            f4 += (float)(5 + GuiStyle.PADDING) * this.var14330.Event18();
            f4 += f3;
            float f5 = (float)this.map45
               .values()
               .stream()
               .mapToDouble(HudElementMessages_Var159::float205)
               .max()
               .orElse(100.0);
            float f6 = this.UiAnimation("Positive", i);
            float f7 = this.UiAnimation("Negative", j);
            float f8 = Math.max(f5, Math.max(f6, f7));
            f8 = this.var14326.on23(f8);
            this.width = f8;
            this.height = f4;
            this.var14328
               .on23(
                  minecraftClient3.currentScreen instanceof ChatScreen
                     || ZenithClient.on23().NbtEditor().isRenderHud()
                     || !this.map45.isEmpty()
               );
            float f9 = Interface.float212();
            org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
               f9
            );
            var1.pushMatrix();
            var1.getMatrices().translate(f + f8 / 2.0F, f1 + f4 / 2.0F, 0.0F);
            var1.getMatrices()
               .scale(this.var14328.Event18(), this.var14328.Event18(), 1.0F);
            var1.getMatrices().translate(-(f + f8 / 2.0F), -(f1 + f4 / 2.0F), 0.0F);
            var1.drawBlurHud(f, f1, f8, f4, 21.0F, ii1il11l111ii11iil, ArgbColor.var11934);
            var1.drawRoundedRect(f, f1, f8, f4, ii1il11l111ii11iil, zenithstyle.getHudBackground().getColor());
            var1.drawRoundedRect(f, f1, f8, 17.0F, ii1il11l111ii11iil, zenithstyle.getHeaderHudBackground().getColor());
            var1.drawText(font, "0", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().getColor());
            var1.drawText(font, "m", f + f8 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().getColor());
            var1.drawText(
               font1,
               "Target potions",
               f + 8.0F + font.width("0") + (float)GuiStyle.PADDING.intValue(),
               f1 + (17.0F - font1.height()) / 2.0F,
               zenithstyle.getTextEnable().getColor()
            );
            if (this.var14328.Event18() == 1.0F) {
               float f10 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
               var1.enableScissor((int)f, (int)f1, (int)(f + f8), (int)(f1 + f4));
               f10 = this.on23(var1, f, f10, f8, "Positive", i, this.var14329, zenithstyle);

               for (HudElementMessages_Var159 ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iil : list) {
                  ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iil.on23(var1, f, f10, f8);
                  f10 += (ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
                     * ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iil.var14313.Event18();
               }

               f10 = this.on23(var1, f, f10, f8, "Negative", j, this.var14330, zenithstyle);

               for (HudElementMessages_Var159 ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilx : list1) {
                  ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilx.on23(var1, f, f10, f8);
                  f10 += (ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilx.getHeight() + (float)GuiStyle.PADDING.intValue())
                     * ll1i1i1il1l111l1i11ill11i11l1_ii1il11l111ii11iilx.var14313.Event18();
               }

               var1.disableScissor();
            }

            var1.popMatrix();
         }
      }
   }

   public HudElementMessages(String var1, float var2, float var3, float var4, float var5, float var6, float var7, HudElement_Var159 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public float on23(CustomDrawContext var1, float var2, float var3, float var4, String var5, int var6, UiAnimation var7, ZenithStyle var8) {
      float f = var7.Event18();
      if (f <= 0.0F) {
         return var3;
      } else {
         Font font = Fonts.NEW_REGULAR.getFont(5.4F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         String s = String.valueOf(var6);
         float f1 = font1.width(s);
         float f2 = Math.max(7.0F, (float)GuiStyle.PADDING.intValue() + f1);
         var1.pushMatrix();
         var1.getMatrices().translate(var2 + var4 / 2.0F, var3 + 3.5F, 0.0F);
         var1.getMatrices().scale(f, f, 1.0F);
         var1.getMatrices().translate(-(var2 + var4 / 2.0F), -(var3 + 3.5F), 0.0F);
         var1.drawText(font, var5, var2 + 8.0F, var3 + (7.0F - font.height()) / 2.0F, var8.getTextTertiary().getColor());
         float f3 = var2 + var4 - f2 - (float)(GuiStyle.PADDING * 2);
         var1.drawText(font1, s, f3 + (f2 - f1) / 2.0F, var3 + (7.0F - font1.height()) / 2.0F, var8.getTextTertiary().getColor());
         var1.popMatrix();
         return var3 + (float)(5 + GuiStyle.PADDING) * f;
      }
   }

   public float UiAnimation(String var1, int var2) {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s = String.valueOf(Math.max(var2, 0));
      float f = font1.width(s);
      float f1 = Math.max(7.0F, (float)GuiStyle.PADDING.intValue() + f);
      float f2 = 8.0F + font.width(var1) + (float)GuiStyle.PADDING.intValue();
      float f3 = (float)(GuiStyle.PADDING * 2) + f1 + 8.0F;
      return Math.max(100.0F, f2 + f3 + 8.0F);
   }

   public boolean on23(StatusEffectInstance var1) {
      return var1.getEffectType().value().getCategory().equals(StatusEffectCategory.BENEFICIAL);
   }

   public String UiAnimation(StatusEffectInstance var1) {
      String s = I18n.translate(var1.getEffectType().value().getTranslationKey());
      String s1 = this.CloudRouter(var1.getAmplifier());
      return s + " " + s1;
   }

   public String Easing(StatusEffectInstance var1) {
      return var1.getEffectType().value().getTranslationKey() + var1.getAmplifier();
   }

   public String CloudRouter(int var1) {
      return String.valueOf(var1 + 1);
   }

   public String ProtocolMessage(int var1) {
      int i = var1 / 20;
      int j = i / 60;
      int k = i % 60;
      return String.format("%02d:%02d", j, k);
   }
}
