package org.zenith.util;

import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.CloudApiClient;

import java.util.Optional;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;

public final class TextReplaceUtils {
   public TextReplaceUtils() {
   }

   /**
    * Rebuilds {@code var0} replacing every literal occurrence of {@code var1} with {@code var2}.
    * The style of each visited run is preserved; the resulting tree is flat.
    */
   public static MutableText Easing(Text var0, String var1, Text var2) {
      if (var0 == null) {
         return null;
      } else if (var1 == null || var1.isEmpty()) {
         return var0.copy();
      } else {
         Text text = var2 == null ? Text.empty() : var2;
         MutableText mutabletext = Text.empty();
         var0.visit((style, s) -> {
            int i = 0;

            int j;
            while ((j = s.indexOf(var1, i)) >= 0) {
               if (j > i) {
                  mutabletext.append(Text.literal(s.substring(i, j)).setStyle(style));
               }

               mutabletext.append(text.copy());
               i = j + var1.length();
            }

            if (i < s.length()) {
               mutabletext.append(Text.literal(s.substring(i)).setStyle(style));
            }

            return Optional.empty();
         }, Style.EMPTY);
         return mutabletext;
      }
   }

   public static MutableText UiAnimation(Text var0, String var1, String var2) {
      return Easing(var0, var1, var2 == null ? Text.empty() : Text.literal(var2));
   }

   public static MutableText UiAnimation(Text var0, String var1, Text var2) {
      return Easing(var0, var1, var2);
   }

   public static MutableText on23(Text var0, String var1, MutableText var2) {
      return Easing(var0, var1, var2);
   }

   /** Returns what is left of {@code var0} once {@code var1} is removed. */
   public static MutableText ColorAnimator(Text var0, String var1) {
      MutableText mutabletext = Easing(var0, var1, Text.empty());
      return mutabletext == null ? Text.empty() : mutabletext;
   }

   /** Drops trailing whitespace from {@code var0}, then appends {@code var1}. */
   public static MutableText ItemRegistry(MutableText var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         String s = var0.getString();
         int i = s.length();

         while (i > 0 && Character.isWhitespace(s.charAt(i - 1))) {
            i--;
         }

         int j = i;
         int[] aint = new int[]{0};
         MutableText mutabletext = Text.empty();
         var0.visit((style, s1) -> {
            int k = aint[0];
            aint[0] = k + s1.length();
            if (k < j) {
               String s2 = s1.substring(0, Math.min(s1.length(), j - k));
               if (!s2.isEmpty()) {
                  mutabletext.append(Text.literal(s2).setStyle(style));
               }
            }

            return Optional.empty();
         }, Style.EMPTY);
         if (var1 != null && !var1.isEmpty()) {
            mutabletext.append(Text.literal(var1));
         }

         return mutabletext;
      }
   }

   public static Text CloudApiClient(Text var0) {
      return var0 == null ? Text.empty() : var0.copy();
   }

   public static Text on23(Text var0, String var1, boolean var2) {
      return ColorAnimator(var0, var1);
   }

   public static Text on23(Text var0, boolean var1) {
      return CloudApiClient(var0);
   }
}
