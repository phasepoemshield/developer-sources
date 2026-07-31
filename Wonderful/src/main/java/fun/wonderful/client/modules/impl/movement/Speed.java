package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventOnMovePost;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventPostMotion;
import fun.wonderful.api.utils.input.MovingUtil;
import fun.wonderful.api.utils.network.NetworkUtils;
import fun.wonderful.client.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

public class Speed
extends Module
implements QClient {
    public static Speed INSTANCE = new Speed();
    private int ticks;
    private int groundTicks;

    public Speed() {
        super("Speed", "Дополнительное ускорение", Module.ModuleCategory.MOVEMENT);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.ticks = 0;
        this.groundTicks = 0;
    }

    @Override
    public void onDisable() {
        this.resetTimer();
        this.ticks = 0;
        this.groundTicks = 0;
        super.onDisable();
    }

    @EventLink
    public void onMovePost(EventOnMovePost event) {
        if (Speed.mc.player == null || Speed.mc.world == null) {
            return;
        }
        this.setTimer(1.7f);
        if (this.ticks > 3) {
            double boost = 0.03;
            if (this.ticks % 2 == 0) {
                Speed.mc.player.addVelocityInternal(new Vec3d(0.0, 0.03, 0.0));
                boost = Speed.mc.player.isOnGround() ? 0.085 : 0.03;
            }
            Vec3d direction = this.getMoveDirection(boost);
            Speed.mc.player.addVelocityInternal(direction);
        }
        ++this.ticks;
    }

    @EventLink
    public void onMoveInput(EventMoveInput event) {
        if (Speed.mc.player == null || Speed.mc.world == null) {
            return;
        }
        this.groundTicks = Speed.mc.player.verticalCollision ? ++this.groundTicks : 0;
        if (this.groundTicks >= 1) {
            Speed.mc.player.jump();
        }
    }

    @EventLink
    public void onPostMotion(EventPostMotion event) {
        if (Speed.mc.player == null || Speed.mc.world == null) {
            return;
        }
        if (this.ticks % 2 == 0) {
            this.setTimer(0.3f);
            NetworkUtils.sendSilentPacket(new ClientCommandC2SPacket((Entity)Speed.mc.player, ClientCommandC2SPacket.Mode.START_FALL_FLYING));
        }
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (event.getType() != EventPacket.Type.RECEIVE || !(event.getPacket() instanceof PlayerPositionLookS2CPacket)) {
            return;
        }
        if (this.ticks % 2 == 1) {
            ++this.ticks;
        }
        this.resetTimer();
    }

    private Vec3d getMoveDirection(double boost) {
        if (Speed.mc.player == null || !MovingUtil.hasPlayerMovement()) {
            return Vec3d.ZERO;
        }
        double yaw = MovingUtil.direction(Speed.mc.player.getYaw(), Speed.mc.player.input.movementForward, Speed.mc.player.input.movementSideways);
        double x2 = -Math.sin(yaw) * boost;
        double z2 = Math.cos(yaw) * boost;
        return new Vec3d(x2, 0.0, z2);
    }

    private void setTimer(float value) {
        if (Speed.mc.player != null) {
            Speed.mc.player.speed = value;
        }
    }

    private void resetTimer() {
        this.setTimer(1.0f);
    }
}