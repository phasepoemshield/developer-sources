package org.wild.mixin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_338;
import net.minecraft.class_5250;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import net.minecraft.class_2558.class_10609;
import net.minecraft.class_2568.class_10613;
import net.minecraft.class_303.class_7590;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.wild.mixin.acceser.ChatHudAccessor;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UnVVnUuvNvu;
import ru.metaculture.protection.WWWWwVWvWWVw;
import ru.metaculture.protection.uVuVNVuuN;

@Mixin({class_338.class})
public class ChatHudMixin {
   private static boolean litka$updating;
   private static String litka$lastMessageKey;
   private static int litka$lastMessageCount;
   String currentPrefix = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
   private static final Pattern GENERAL_COORD_PATTERN = Pattern.compile("(-?\\d+)[\\s,]+(-?\\d+)[\\s,]+(-?\\d+)");

   @ModifyVariable(
      method = {"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_2561 litka$nameProtectAndExpand(class_2561 var1) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return var1;
      } else {
         class_2561 var2 = UnVVnUuvNvu.UuUVuuUu(var1);
         class_5250 var3 = var2.method_27661();
         String var4 = var3.getString();
         Matcher var5 = GENERAL_COORD_PATTERN.matcher(var4);
         if (var5.find()) {
            String var6 = var5.group(1);
            String var7 = var5.group(3);
            class_2583 var8 = var3.method_10866()
               .method_10958(new class_10609(this.currentPrefix + "gps " + var6 + " " + var7))
               .method_10949(new class_10613(class_2561.method_43470("§a[GPS] Нажми, чтобы поставить метку на " + var6 + ", " + var7)));
            var3.method_10862(var8);
         }

         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            WWWWwVWvWWVw var11 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(WWWWwVWvWWVw.class);
            if (var11 != null && var11.nuUnNvnuUu && WWWWwVWvWWVw.uNnUnnuNUnNu.uUnuvNvvNU() && var4.contains("[Подробнее]")) {
               ArrayList var12 = new ArrayList();
               this.litka$extractHoverText(var2, var12);

               for (class_2561 var9 : var12) {
                  String var10 = var9.getString();
                  if (var10.contains("Причина:") || var10.contains("Окончание:") || var10.contains("[БАН]")) {
                     var3.method_10852(class_2561.method_43470("\n").method_27692(class_124.field_1070));
                     var3.method_10852(var9);
                  }
               }
            }
         }

         return var3;
      }
   }

   @Inject(
      method = {"getMessageHistory"},
      at = {@At("RETURN")}
   )
   private void litka$cleanHistoryOnUnhook(CallbackInfoReturnable<Object> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (uVuVNVuuN.uVunuUNVVUUV && var1.getReturnValue() instanceof Collection var3) {
            String var4 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
            var3.removeIf(var1x -> !(var1x instanceof String var2) ? false : var2.startsWith(var4) || var2.startsWith("#"));
         }
      }
   }

   @Inject(
      method = {"addToMessageHistory"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$blockHistoryWhenUnhooked(String var1, CallbackInfo var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (uVuVNVuuN.uVunuUNVVUUV && var1 != null && (var1.startsWith(NVnVnNnN.UuUVuuUu.VVnVNnunVvu()) || var1.startsWith("#"))) {
            var2.cancel();
         }
      }
   }

   private void litka$extractHoverText(class_2561 var1, List<class_2561> var2) {
      class_2583 var3 = var1.method_10866();
      if (var3 != null && var3.method_10969() != null && var3.method_10969() instanceof class_10613 var5) {
         class_2561 var6 = var5.comp_3510();
         if (var6 != null) {
            boolean var7 = var2.stream().anyMatch(var1x -> var1x.getString().equals(var6.getString()));
            if (!var7) {
               var2.add(var6);
            }
         }
      }

      for (class_2561 var9 : var1.method_10855()) {
         this.litka$extractHoverText(var9, var2);
      }
   }

   @Inject(
      method = {"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$mergeSpam(class_2561 var1, class_7469 var2, class_7591 var3, CallbackInfo var4) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (!litka$updating) {
            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               WWWWwVWvWWVw var5 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(WWWWwVWvWWVw.class);
               if (var5 != null && var5.nuUnNvnuUu && WWWWwVWvWWVw.NVNnnvnuunNv.uUnuvNvvNU()) {
                  String var6 = var1.getString();
                  if (var6 != null && !var6.isBlank()) {
                     if (var6.equals(litka$lastMessageKey)) {
                        litka$lastMessageCount++;
                        class_5250 var7 = var1.method_27661()
                           .method_10852(class_2561.method_43470(" [x" + litka$lastMessageCount + "]").method_27692(class_124.field_1080));
                        litka$updating = true;

                        try {
                           this.removeLastEntry();
                           ((class_338)this).method_44811(var7, var2, var3);
                        } finally {
                           litka$updating = false;
                        }

                        var4.cancel();
                     } else {
                        litka$lastMessageKey = var6;
                        litka$lastMessageCount = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"clear"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$preserveChat(boolean var1, CallbackInfo var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            WWWWwVWvWWVw var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(WWWWwVWvWWVw.class);
            if (var3 != null && var3.nuUnNvnuUu && WWWWwVWvWWVw.uVunuUNVVUUV.uUnuvNvvNU()) {
               var2.cancel();
            } else {
               litka$lastMessageKey = null;
               litka$lastMessageCount = 0;
            }
         }
      }
   }

   private void removeLastEntry() {
      ChatHudAccessor var1 = (ChatHudAccessor)this;
      List var2 = var1.litka$getMessages();
      if (!var2.isEmpty()) {
         var2.remove(0);
      }

      List var3 = var1.litka$getVisibleMessages();
      class_7590 var4;
      if (!var3.isEmpty()) {
         do {
            var4 = (class_7590)var3.remove(0);
         } while (!var3.isEmpty() && !var4.comp_898());
      }
   }
}
