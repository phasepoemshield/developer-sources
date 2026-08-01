package zenith.zov.utility.mixin.network;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.client.network.ClientConnectionState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal018;
import zenith.EventImpl_4;
import zenith.ZenithClient;
import zenith.EventImpl_10;
import zenith.floatHolder_6;
import zenith.EventBus;
import zenith.StringHolder_20;
import zenith.ZenithInternal082$Helper;
import zenith.ZenithInternal081$EventBus;
import zenith.TextHolder_2;
import zenith.Event;

@Mixin({ClientPlayNetworkHandler.class})
public class MixinClientPlayNetworkHandler {
   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatMessageHook(@NotNull String s, CallbackInfo callbackinfo) {
      if (s.startsWith(ZenithClient.getInstance().ZenithInternal017().getPrefix())) {
         try {
            ZenithClient.getInstance()
               .ZenithInternal017()
               .getDispatcher()
               .execute(
                  s.substring(ZenithClient.getInstance().ZenithInternal017().getPrefix().length()),
                  ZenithClient.getInstance().ZenithInternal017().getSource()
               );
         } catch (CommandSyntaxException commandsyntaxexception) {
         }

         callbackinfo.cancel();
      } else {
         StringHolder_20 l1ii1ilililili11i1 = new StringHolder_20(
            s, ZenithInternal082$Helper.IlI1I11lIlll1111Il, ZenithInternal081$EventBus.lI1IlI1I1I11I11ll1II1
         );
         EventBus.StringHolder_8((Event)l1ii1ilililili11i1);
         if (l1ii1ilililili11i1.Event()) {
            callbackinfo.cancel();
         }
      }
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("RETURN")}
   )
   private void sendChatMessageHookPost(@NotNull String s, CallbackInfo callbackinfo) {
      StringHolder_20 l1ii1ilililili11i1 = new StringHolder_20(
         s, ZenithInternal082$Helper.l1IllI1lII1111II1III1lllII, ZenithInternal081$EventBus.lI1IlI1I1I11I11ll1II1
      );
      EventBus.StringHolder_8((Event)l1ii1ilililili11i1);
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatCommandMessageHook(@NotNull String s, CallbackInfo callbackinfo) {
      StringHolder_20 l1ii1ilililili11i1 = new StringHolder_20(
         s, ZenithInternal082$Helper.IlI1I11lIlll1111Il, ZenithInternal081$EventBus.I111llllll1ll1l1Il
      );
      EventBus.StringHolder_8((Event)l1ii1ilililili11i1);
      if (l1ii1ilililili11i1.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("RETURN")}
   )
   private void sendChatCommandHookPost(@NotNull String s, CallbackInfo callbackinfo) {
      StringHolder_20 l1ii1ilililili11i1 = new StringHolder_20(
         s, ZenithInternal082$Helper.l1IllI1lII1111II1III1lllII, ZenithInternal081$EventBus.I111llllll1ll1l1Il
      );
      EventBus.StringHolder_8((Event)l1ii1ilililili11i1);
   }

   @Inject(
      method = {"onGameMessage(Lnet/minecraft/network/packet/s2c/play/GameMessageS2CPacket;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/message/MessageHandler;onGameMessage(Lnet/minecraft/text/Text;Z)V"
      )},
      cancellable = true
   )
   private void onGameMessage(GameMessageS2CPacket GameMessageS2CPacket, CallbackInfo callbackinfo) {
      TextHolder_2 l1li1l1111ii111i11l = new TextHolder_2(GameMessageS2CPacket.content());
      EventBus.StringHolder_8((Event)l1li1l1111ii111i11l);
      if (l1li1l1111ii111i11l.Event()) {
         callbackinfo.cancel();
         if (l1li1l1111ii111i11l.IdentifierHolder()) {
            MinecraftClient.getInstance().getMessageHandler().onGameMessage(l1li1l1111ii111i11l.Shaderesp(), GameMessageS2CPacket.overlay());
         }
      }
   }

   @Inject(
      method = {"onEntityStatus"},
      at = {@At("RETURN")}
   )
   private void updateHealth(EntityStatusS2CPacket EntityStatusS2CPacket, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_4(EntityStatusS2CPacket)));
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void init(MinecraftClient MinecraftClient, ClientConnection ClientConnection, ClientConnectionState ClientConnectionState, CallbackInfo callbackinfo) {
      ZenithInternal018.l1llI1I111IIIIlIIllllllI1I.clear();
   }

   @Inject(
      method = {"onHealthUpdate"},
      at = {@At("RETURN")}
   )
   private void updateHealth(HealthUpdateS2CPacket HealthUpdateS2CPacket, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_10()));
   }

   @ModifyExpressionValue(
      method = {"onPlayerPositionLook", "onPlayerRotation"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getYaw()F"
      )}
   )
   private float hookSilentRotationYaw(float f) {
      floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl();
      return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.AutoBrewing();
   }

   @ModifyExpressionValue(
      method = {"onPlayerPositionLook", "onPlayerRotation"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getPitch()F"
      )}
   )
   private float hookSilentRotationPitch(float f) {
      floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl();
      return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.Basefinder();
   }
}
