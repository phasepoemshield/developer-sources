package fun.nexisdlc.mixins.client;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventChat;
import fun.nexisdlc.commands.commands.CommandDispatcher;
import fun.nexisdlc.modules.impl.player.PlayerUtilsFunction;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.EntityPosition;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
    @Redirect(
            method = "onPlayerPositionLook",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;change()Lnet/minecraft/entity/EntityPosition;"
            )
    )
    private EntityPosition handleNoServerRotation(PlayerPositionLookS2CPacket packet) {
        EntityPosition originalChange = packet.change();
        var player = mc.player;
        if (player != null && PlayerUtilsFunction.NoServerRotation.get() && Nexis.getFunctionManager().getPlayerUtilsFunction().isState()) {
            float newYaw = packet.relatives().contains(PositionFlag.Y_ROT)
                    ? 0
                    : player.getYaw();
            float newPitch = packet.relatives().contains(PositionFlag.X_ROT)
                    ? 0
                    : player.getPitch();
            return new EntityPosition(
                    originalChange.position(),
                    originalChange.deltaMovement(),
                    newYaw,
                    newPitch
            );
        }
        return originalChange;
    }

    @Inject(method = "onPlayerList", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"), cancellable = true)
    public void antiIngoringPlayerInfoSelfcode(PlayerListS2CPacket packet, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "sendChatMessage", at = @At("HEAD"), cancellable = true)
    private void nexis$sendChatMessage(String message, CallbackInfo ci) {
        EventChat eventChat = new EventChat(message);
        Nexis.getEventBus().post(eventChat);

        if (eventChat.isCancelled()) {
            ci.cancel();
            return;
        }

        if (message.startsWith(CommandDispatcher.prefix) && !ClientContainer.isHide()) {
            ci.cancel();
        }
    }
}