package org.zenith.core;

import org.zenith.event.Event43;

import java.util.Locale;

public enum ChatTag {
   call214("\u0413\u0440\u0443\u0437", "C"),
   call418("\u0411\u043e\u0441\u0441", "B"),
   call442("\u041a\u0443\u0431\u0438\u043a", "B"),
   call443("\u041a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440", "D"),
   call419("\u0417\u043e\u043b\u043e\u0442\u0430\u044f \u043b\u0438\u0445\u043e\u0440\u0430\u0434\u043a\u0430", "E"),
   call420("\u041f\u043e\u0441\u044b\u043b\u043a\u0430", "F"),
   call444("\u041a\u043e\u0440\u0430\u0431\u043b\u044c", "G"),
   call421("\u0426\u0432\u0435\u0442\u043e\u0447\u043d\u0430\u044f \u043f\u043e\u043b\u044f\u043d\u0430", "H"),
   call422("\u0426\u0432\u0435\u0442\u043e\u0447\u043d\u0430\u044f \u043f\u043e\u043b\u044f\u043d\u0430", "H"),
   call445("\u0421\u043c\u0435\u0440\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0448\u0430\u0445\u0442\u0430", "I"),
   call423("\u0421\u043c\u0435\u0440\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0448\u0430\u0445\u0442\u0430", "I"),
   call177("\u041e\u043f\u044b\u0442\u043d\u044b\u0439 \u0422\u044b\u043f\u043e", "J"),
   call446("\u0413\u043e\u043b\u043e\u0441\u043e\u0432\u0430\u043d\u0438\u0435", "K"),
   call215("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e", "A");

   public final String string66;
   public final String string67;

   private ChatTag(String var3, String var4) {
      this.string66 = var3;
      this.string67 = var4;
   }

   public static ChatTag Event43(String var0) {
      if (var0 == null) {
         return call215;
      } else {
         String s = var0.toUpperCase(Locale.ROOT);
         switch (s) {
            case "GOLDEN_FORTRESS":
               return call419;
            case "PARCELS":
               return call420;
            case "SNOWQUARRY":
               return call422;
            case "JAYCOB":
               return call177;
            default:
               try {
                  return valueOf(s);
               } catch (IllegalArgumentException illegalargumentexception) {
                  return call215;
               }
         }
      }
   }

   public String getDisplayName() {
      return this.string66;
   }

   public String getIcon() {
      return this.string67;
   }
}
