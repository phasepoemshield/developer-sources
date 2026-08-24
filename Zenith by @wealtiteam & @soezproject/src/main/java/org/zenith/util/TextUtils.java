package org.zenith.util;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.core.NpcCloneManager;

import org.zenith.event.EventReplaceMovePacketPitche3;
import org.zenith.event.EventUpdateHealth;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.text.Text;

public final class TextUtils {
   public static final Pattern NUMBER = Pattern.compile("(\\d{1,6})");

   public TextUtils() {
   }

   public static boolean isActive() {
      return false;
   }

   public static Text TextScanner(Text var0) {
      return var0;
   }

   public static Text ItemSpec(Text var0) {
      return var0;
   }

   public static List PotionItemBuilder(List var0) {
      return var0;
   }

   /** Header/footer candidate: the text itself, or null when it carries nothing renderable. */
   public static Text ItemServiceBase(Text var0) {
      return var0 != null && !var0.getString().isBlank() ? var0 : null;
   }

   /** Online-counter candidate: the text itself, or null when it carries no number. */
   public static Text PotionItemBuilder(Text var0) {
      return var0 != null && NUMBER.matcher(var0.getString()).find() ? var0 : null;
   }

   /** First number carried by the text, or 0 when there is none. */
   public static int ProfileItemBuilder(Text var0) {
      if (var0 == null) {
         return 0;
      } else {
         Matcher matcher = NUMBER.matcher(var0.getString());
         if (!matcher.find()) {
            return 0;
         } else {
            try {
               return Integer.parseInt(matcher.group(1));
            } catch (NumberFormatException numberformatexception) {
               return 0;
            }
         }
      }
   }

   /** True when the line reads as a server/title line rather than a counter. */
   public static boolean EnchantItemSpec(Text var0) {
      return var0 != null && !var0.getString().isBlank() && !NUMBER.matcher(var0.getString()).find();
   }

   /** True when the line reads as an online-players counter. */
   public static boolean SimpleItemBuilder(Text var0) {
      return var0 != null && NUMBER.matcher(var0.getString()).find();
   }

   public static String NbtEditor(Text var0) {
      if (var0 == null) {
         return null;
      } else {
         String s = var0.getString().trim();
         return s.isEmpty() ? null : s;
      }
   }

   /** Streamer mode: hides the real X coordinate. */
   public static int EventUpdateHealth(int var0) {
      return 0;
   }

   /** Streamer mode: hides the real Z coordinate. */
   public static int EventReplaceMovePacketPitche3(int var0) {
      return 0;
   }
}
