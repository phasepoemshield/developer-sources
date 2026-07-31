package org.wild.mixin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.RunCommand;
import net.minecraft.text.HoverEvent.ShowText;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.wild.mixin.acceser.ChatHudAccessor;
import ru.metaculture.protection.ChatHelper;
import ru.metaculture.protection.ProtectInfo;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({ChatHud.class})
public class ChatHudMixin {
   private static boolean litka$updating;
   private static String litka$lastMessageKey;
   private static int litka$lastMessageCount;
   String currentPrefix = WildClient.O00000000.O000000000OO();
   private static final Pattern GENERAL_COORD_PATTERN = Pattern.compile("(-?\\d+)[\\s,]+(-?\\d+)[\\s,]+(-?\\d+)");

   @ModifyVariable(
      method = {"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Text litka$nameProtectAndExpand(Text text) {
      Text var2 = ProtectInfo.O00000000(text);
      MutableText var3 = var2.copy();
      String var4 = var3.getString();
      Matcher var5 = GENERAL_COORD_PATTERN.matcher(var4);
      if (var5.find()) {
         String var6 = var5.group(1);
         String var7 = var5.group(3);
         Style var8 = var3.getStyle()
            .withClickEvent(new RunCommand(this.currentPrefix + "gps " + var6 + " " + var7))
            .withHoverEvent(new ShowText(Text.literal("§a[GPS] Нажми, чтобы поставить метку на " + var6 + ", " + var7)));
         var3.setStyle(var8);
      }

      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         ChatHelper var11 = WildClient.O00000000.O000000000.O00000000(ChatHelper.class);
         if (var11 != null && var11.O0000000000000 && ChatHelper.O000000000O000.O0000000000() && var4.contains("[Подробнее]")) {
            ArrayList var12 = new ArrayList();
            this.litka$extractHoverText(var2, var12);

            for (Text var9 : (ArrayList<Text>)var12) {
               String var10 = var9.getString();
               if (var10.contains("Причина:") || var10.contains("Окончание:") || var10.contains("[БАН]")) {
                  var3.append(Text.literal("\n").formatted(Formatting.RESET));
                  var3.append(var9);
               }
            }
         }
      }

      return var3;
   }

   @Inject(
      method = {"getMessageHistory"},
      at = {@At("RETURN")}
   )
   private void litka$cleanHistoryOnUnhook(CallbackInfoReturnable<Object> callbackInfoReturnable) {
      if (UnHook.O000000000O0 && callbackInfoReturnable.getReturnValue() instanceof Collection var3) {
         String var4 = WildClient.O00000000.O000000000OO();
         var3.removeIf(object -> !(object instanceof String var2) ? false : var2.startsWith(var4) || var2.startsWith("#"));
      }
   }

   @Inject(
      method = {"addToMessageHistory"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$blockHistoryWhenUnhooked(String string, CallbackInfo callbackInfo) {
      if (UnHook.O000000000O0 && string != null && (string.startsWith(WildClient.O00000000.O000000000OO()) || string.startsWith("#"))) {
         callbackInfo.cancel();
      }
   }

   private void litka$extractHoverText(Text text, List<Text> list) {
      Style var3 = text.getStyle();
      if (var3 != null && var3.getHoverEvent() != null && var3.getHoverEvent() instanceof ShowText var5) {
         Text var6 = var5.value();
         if (var6 != null) {
            boolean var7 = list.stream().anyMatch(text2 -> text2.getString().equals(var6.getString()));
            if (!var7) {
               list.add(var6);
            }
         }
      }

      for (Text var9 : text.getSiblings()) {
         this.litka$extractHoverText(var9, list);
      }
   }

   @Inject(
      method = {"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$mergeSpam(Text text, MessageSignatureData messageSignatureData, MessageIndicator messageIndicator, CallbackInfo callbackInfo) {
      if (!litka$updating) {
         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            ChatHelper var5 = WildClient.O00000000.O000000000.O00000000(ChatHelper.class);
            if (var5 != null && var5.O0000000000000 && ChatHelper.O000000000O.O0000000000()) {
               String var6 = text.getString();
               if (var6 != null && !var6.isBlank()) {
                  if (var6.equals(litka$lastMessageKey)) {
                     litka$lastMessageCount++;
                     MutableText var7 = text.copy().append(Text.literal(" [x" + litka$lastMessageCount + "]").formatted(Formatting.GRAY));
                     litka$updating = true;

                     try {
                        this.removeLastEntry();
                        ((ChatHud)(Object)this).addMessage(var7, messageSignatureData, messageIndicator);
                     } finally {
                        litka$updating = false;
                     }

                     callbackInfo.cancel();
                  } else {
                     litka$lastMessageKey = var6;
                     litka$lastMessageCount = 1;
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
   private void litka$preserveChat(boolean bl, CallbackInfo callbackInfo) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         ChatHelper var3 = WildClient.O00000000.O000000000.O00000000(ChatHelper.class);
         if (var3 != null && var3.O0000000000000 && ChatHelper.O000000000O0.O0000000000()) {
            callbackInfo.cancel();
         } else {
            litka$lastMessageKey = null;
            litka$lastMessageCount = 0;
         }
      }
   }

   private void removeLastEntry() {
      ChatHudAccessor var1 = (ChatHudAccessor)(Object)this;
      List var2 = var1.litka$getMessages();
      if (!var2.isEmpty()) {
         var2.remove(0);
      }

      List var3 = var1.litka$getVisibleMessages();
      Visible var4;
      if (!var3.isEmpty()) {
         do {
            var4 = (Visible)var3.remove(0);
         } while (!var3.isEmpty() && !var4.endOfEntry());
      }
   }
}
