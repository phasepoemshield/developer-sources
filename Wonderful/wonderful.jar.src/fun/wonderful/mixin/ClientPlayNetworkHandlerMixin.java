package fun.wonderful.mixin;

import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.baritone.BaritoneAntiStuck;
import fun.wonderful.api.utils.bot.BotSessionManager;
import fun.wonderful.client.modules.impl.misc.AutoJoin;
import net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.s2c.play.TeamS2CPacket;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPlayNetworkHandler.class})
public abstract class ClientPlayNetworkHandlerMixin {
    @Shadow
    private ClientWorld world;
    @Shadow
    private Scoreboard scoreboard;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    public void sendChatMessage(@NotNull String message, CallbackInfo ci) {
    }

    @Inject(method={"onEntityVelocityUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    private void onVelocityUpdate(EntityVelocityUpdateS2CPacket packet, CallbackInfo ci) {
        EventPacket event = new EventPacket((Packet<?>)packet, EventPacket.Type.RECEIVE);
        event.call();
        if (event.isCancelled()) {
            ci.cancel();
        }
    }

    @Inject(method={"onExplosion"}, at={@At(value="HEAD")}, cancellable=true)
    private void onExplosion(ExplosionS2CPacket packet, CallbackInfo ci) {
        EventPacket event = new EventPacket((Packet<?>)packet, EventPacket.Type.RECEIVE);
        event.call();
        if (event.isCancelled()) {
            ci.cancel();
        }
    }

    @Inject(method={"onEntityPositionSync"}, at={@At(value="HEAD")}, cancellable=true)
    private void onEntityPositionSync(EntityPositionSyncS2CPacket packet, CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (this.world == null || mc.player == null || mc.world == null) {
            ci.cancel();
        }
    }

    @Inject(method={"onGameMessage"}, at={@At(value="HEAD")})
    private void onGameMessage(GameMessageS2CPacket packet, CallbackInfo ci) {
        BaritoneAntiStuck.onGameMessage(packet.comp_763().getString());
    }

    @Inject(method={"onGameJoin"}, at={@At(value="HEAD")})
    private void onGameJoin(GameJoinS2CPacket packet, CallbackInfo ci) {
        AutoJoin autoJoin;
        BotSessionManager.finishBotConnectStage();
        AutoJoin autoJoin2 = ModuleClass.INSTANCE != null ? ModuleClass.autoJoin : (autoJoin = null);
        if (autoJoin != null && autoJoin.isEnable()) {
            autoJoin.setEnabled(false);
        }
    }

    @Inject(method={"onTeam"}, at={@At(value="INVOKE", target="Lnet/minecraft/TeamS2CPacket;getTeam()Ljava/util/Optional;")}, cancellable=true)
    private void onTeam(TeamS2CPacket packet, CallbackInfo ci) {
        if (this.scoreboard == null || packet.getPlayerListOperation() != TeamS2CPacket.class_5901.REMOVE) {
            return;
        }
        Team team = this.scoreboard.getTeam(packet.getTeamName());
        if (team == null) {
            return;
        }
        boolean hasInvalidRemove = false;
        for (String playerName : packet.getPlayerNames()) {
            if (this.scoreboard.getScoreHolderTeam(playerName) == team) continue;
            hasInvalidRemove = true;
            break;
        }
        if (!hasInvalidRemove) {
            return;
        }
        for (String playerName : packet.getPlayerNames()) {
            if (this.scoreboard.getScoreHolderTeam(playerName) != team) continue;
            this.scoreboard.removeScoreHolderFromTeam(playerName, team);
        }
        if (packet.getTeamOperation() == TeamS2CPacket.class_5901.REMOVE) {
            this.scoreboard.removeTeam(team);
        }
        ci.cancel();
    }
}