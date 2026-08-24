package org.zenith.util;

import org.zenith.core.TextScanner;
import org.zenith.core.Easing;

import org.zenith.util.ArgbColor;
import org.zenith.managers.EmoteManager;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ServerConfigStore;
import org.zenith.core.FriendStore;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.HudSelectedItemPanel;
import org.zenith.core.HudInfoBoxSecondary;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.UsageStatStore;

import org.zenith.event.Event18Ext3;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.GameMessageEvent;
import org.zenith.event.PacketEvent;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;


import java.awt.Color;
import java.util.regex.Pattern;
import net.minecraft.util.math.MathHelper;

public final class ColorUtils {
   public static final Pattern pattern10 = Pattern.compile("(?i)\u00a7[0-9A-FK-ORX]"); // TODO reconstructed: strips formatting codes
   public static final int int390 = 0xFFFFFFFF; // TODO reconstructed

   public static int Event18Ext3(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int EventRenderScreenHook(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int GameMessageEvent(int var0) {
      return var0 & 0xFF;
   }

   public static int PacketEvent(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static float PacketReceiveEvent(int var0) {
      return (float)Event18Ext3(var0) / 255.0F;
   }

   public static float PacketSendEvent(int var0) {
      return (float)EventRenderScreenHook(var0) / 255.0F;
   }

   public static float VisualSettingsStore(int var0) {
      return (float)GameMessageEvent(var0) / 255.0F;
   }

   public static float Item(int var0) {
      return (float)PacketEvent(var0) / 255.0F;
   }

   public static int[] FriendStore(int var0) {
      return new int[]{Event18Ext3(var0), EventRenderScreenHook(var0), GameMessageEvent(var0), PacketEvent(var0)};
   }

   public static int[] ItemExt2(int var0) {
      return new int[]{Event18Ext3(var0), EventRenderScreenHook(var0), GameMessageEvent(var0)};
   }

   public static float[] UsageStatStore(int var0) {
      return new float[]{PacketReceiveEvent(var0), PacketSendEvent(var0), VisualSettingsStore(var0), Item(var0)};
   }

   public static float[] ItemExt(int var0) {
      return new float[]{PacketReceiveEvent(var0), PacketSendEvent(var0), VisualSettingsStore(var0)};
   }

   public static boolean HudInfoBoxSecondary(String var0) {
      return var0 != null && var0.matches("(?i)^[a-f0-9]{6}$");
   }

   public static ArgbColor on23(String var0, ArgbColor var1) {
      if (!HudInfoBoxSecondary(var0)) {
         return var1;
      } else {
         int i = Integer.parseInt(var0, 16);
         int j = i >> 16 & 0xFF;
         int k = i >> 8 & 0xFF;
         int l = i & 0xFF;
         return new ArgbColor(new Color(j, k, l));
      }
   }

   public static String EmoteManager(ArgbColor var0) {
      int i = var0.call001();
      return String.format("%06X", i & 16777215);
   }

   public static ArgbColor on23(int var0, int var1, ArgbColor var2, ArgbColor var3) {
      int i = (int)((System.currentTimeMillis() / (long)var0 + (long)var1) % 360L);
      i = (i >= 180 ? 360 - i : i) * 2;
      return UiAnimation(var2, var3, (float)i / 360.0F);
   }

   public static ArgbColor on23(int var0, int var1, ArgbColor... var2) {
      int i = (int)((System.currentTimeMillis() / (long)var0 + (long)var1) % 360L);
      i = (i > 180 ? 360 - i : i) + 180;
      int j = (int)((float)i / 360.0F * (float)var2.length);
      if (j == var2.length) {
         j--;
      }

      ArgbColor i11ii1llliilllii1i1 = var2[j];
      ArgbColor i11ii1llliilllii1i11 = var2[j == var2.length - 1 ? 0 : j + 1];
      return UiAnimation(i11ii1llliilllii1i1, i11ii1llliilllii1i11, (float)i / 360.0F * (float)var2.length - (float)j);
   }

   public static ArgbColor UiAnimation(ArgbColor var0, ArgbColor var1, float var2) {
      return var0.Easing(var1, var2);
   }

   public static String HudSelectedItemPanel(String var0) {
      return var0 != null && !var0.isEmpty() ? pattern10.matcher(var0).replaceAll("") : null;
   }

   public static int ColorAnimator(int var0, float var1) {
      return on23(
         Event18Ext3(var0), EventRenderScreenHook(var0), GameMessageEvent(var0), Math.round((float)PacketEvent(var0) * var1)
      );
   }

   public static int on23(int var0, int var1, int var2, int var3) {
      return MathHelper.clamp(var3, 0, 255) << 24 | MathHelper.clamp(var0, 0, 255) << 16 | MathHelper.clamp(var1, 0, 255) << 8 | MathHelper.clamp(var2, 0, 255);
   }

   public static int ServerConfigStore(int var0) {
      return ZenithClient.on23().TextScanner().getClientColor(var0).call001();
   }

   public ColorUtils() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
