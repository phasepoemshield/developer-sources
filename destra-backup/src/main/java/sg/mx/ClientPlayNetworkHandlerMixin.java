package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.OverlayRenderEvent;
import ru.destra.event.PlayerCheckEvent;
import ru.destra.font.FontManager;
import ru.destra.font.FontRenderer;
import ru.destra.misc.BossBarParser;
import ru.destra.misc.ChatCommandSender2;
import ru.destra.misc.OverlayElementType;
import ru.destra.module.ChatHelperModule;
import ru.destra.module.CommandFixModule;
import ru.destra.module.NotificationsHudModule;
import ru.destra.network.ServerPlaceholderProvider;
import ru.destra.social.Notification;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ClientPlayNetworkHandler.class)
public abstract non-sealed class ClientPlayNetworkHandlerMixin implements ChatCommandSender2 {
   private static final String Ув;
   private static final String Ую;
   private static final String Уг;
   private static final String Уж;
   private static final String УЮ;
   private static final String Ул;
   private static final String У4;
   private static final String Уу;
   private static final String Уб;
   private static final String УВ;
   private static final String УЧ;
   private static final String дш;
   private static final String дщ;
   private static final String дй;
   private static final String дБ;
   private static final String де;
   private static final String ди;
   private static final String д弟;
   private static final String дч;

   @Shadow
   @Override
   public abstract void sendChatMessage(String var1);

   @Shadow
   public abstract void sendChatCommand(String var1);

   @ModifyVariable(method = "sendChatCommand", at = @At("HEAD"), argsOnly = true)
   private String destra$fixCommandCaps(String var1) {
      ChatHelperModule var2 = this.destra$getChatHelper();
      return var2 == null ? var1 : var2.applyCapsfix(var1, true);
   }

   @ModifyVariable(method = "sendChatMessage", at = @At("HEAD"), argsOnly = true)
   private String destra$fixMessageCaps(String var1) {
      ChatHelperModule var2 = this.destra$getChatHelper();
      return var2 == null ? var1 : var2.applyCapsfix(var1, false);
   }

   @Inject(method = "sendChatCommand", at = @At("HEAD"), cancellable = true)
   public void onCommand(String var1, CallbackInfo var2) {
      if (MinecraftClient.getInstance().world != null) {
         if (DestraClient.getInstance().connected) {
            DestraClient.getInstance().connected = false;
         } else if (DestraClient.getInstance().getModuleManager().ktSafe.Д()
            && BossBarParser.isInPvp()
            && (
               var1.startsWith(Ув)
                  || var1.startsWith(Ую)
                  || var1.startsWith(Уг)
                  || var1.startsWith(Уж)
                  || var1.startsWith(УЮ) && !ServerPlaceholderProvider.serverAddressContains(Ул)
            )) {
            NotificationsHudModule var5 = DestraClient.getInstance().getModuleManager().notificationsHud;
            if (var5.isOthersChatEnabled() || var5.isOthersBothEnabled()) {
               this.Г(У4);
            }

            if (var5.isOthersHudEnabled() || var5.isOthersBothEnabled()) {
               DestraClient.getInstance().getNotificationManager().postNotification(new Notification(Уу, Уб, (FontRenderer)FontManager.destraFont.get(), 3));
            }

            var2.cancel();
         } else {
            CommandFixModule var3 = DestraClient.getInstance().getModuleManager().commandFix;
            if (var3.Д()) {
               String var4 = var3.fixCommand(var1);
               if (!var4.equals(var1)) {
                  var2.cancel();
                  DestraClient.getInstance().connected = true;
                  this.sendChatCommand(var4);
               }
            }
         }
      }
   }

   @Inject(method = "sendChatMessage", at = @At("HEAD"), cancellable = true)
   public void onChat(String var1, CallbackInfo var2) {
      if (MinecraftClient.getInstance().world != null) {
         if (DestraClient.getInstance().connected) {
            DestraClient.getInstance().connected = false;
         } else if (DestraClient.getInstance().getModuleManager().ktSafe.Д()
            && BossBarParser.isInPvp()
            && (
               var1.startsWith(УВ)
                  || var1.startsWith(УЧ)
                  || var1.startsWith(дш)
                  || var1.startsWith(дщ)
                  || var1.startsWith(дй) && !ServerPlaceholderProvider.serverAddressContains(дБ)
            )) {
            NotificationsHudModule var5 = DestraClient.getInstance().getModuleManager().notificationsHud;
            if (var5.isOthersChatEnabled() || var5.isOthersBothEnabled()) {
               this.Г(де);
            }

            if (var5.isOthersHudEnabled() || var5.isOthersBothEnabled()) {
               DestraClient.getInstance().getNotificationManager().postNotification(new Notification(ди, д弟, (FontRenderer)FontManager.destraFont.get(), 3));
            }

            var2.cancel();
         } else {
            CommandFixModule var3 = DestraClient.getInstance().getModuleManager().commandFix;
            if (var3.Д()) {
               if (!var1.startsWith(дч)) {
                  return;
               }

               String var4 = var3.fixCommand(var1);
               if (!var4.equals(var1)) {
                  var2.cancel();
                  DestraClient.getInstance().connected = true;
                  this.sendChatMessage(var4);
               }
            }
         }
      }
   }

   @Inject(
      method = "onEntityStatus",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/world/ClientWorld;playSound(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZ)V",
         shift = Shift.AFTER
      ),
      cancellable = true
   )
   private void onAfterTotemSound(EntityStatusS2CPacket var1, CallbackInfo var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3 != null && var3.world != null) {
         Entity var4 = var1.getEntity(var3.world);
         if (var1.getStatus() == 35 && var4 != null) {
            OverlayRenderEvent var5 = new OverlayRenderEvent(OverlayElementType.TOTEM);
            DestraClient.getInstance().getEventBus().post(var5);
            if (var4 instanceof net.minecraft.entity.player.PlayerEntity) {
               DestraClient.getInstance().getEventBus().post(
                  new PlayerCheckEvent((net.minecraft.entity.player.PlayerEntity) var4));
            }
            if (var5.д()) {
               var2.cancel();
               var5.з();
            }
         }
      }
   }

   private ChatHelperModule destra$getChatHelper() {
      DestraClient var1 = DestraClient.getInstance();
      return var1 != null && var1.getModuleManager() != null ? var1.getModuleManager().chatHelper : null;
   }

   static {
      VMBridge.identifyClass(ClientPlayNetworkHandlerMixin.class, "pRtPee6o");
   }
}
