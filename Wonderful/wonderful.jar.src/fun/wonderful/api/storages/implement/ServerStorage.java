package fun.wonderful.api.storages.implement;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventPopTotem;
import fun.wonderful.api.events.implement.EventTickPre;
import java.lang.reflect.InvocationTargetException;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

public class ServerStorage
implements QClient {
    private int serverSlot;
    private float serverYaw;
    private float serverPitch;
    private float fallDistance;
    private double serverX;
    private double serverY;
    private double serverZ;
    private boolean serverOnGround;
    private boolean serverSprinting;
    private boolean serverSneaking;
    private boolean serverHorizontalCollision;

    public ServerStorage() {
        EventInvoker.register(this);
    }

    @EventLink
    public void onTick(EventTickPre e2) {
        if (ServerStorage.mc.player == null || ServerStorage.mc.world == null) {
            return;
        }
        double y2 = ServerStorage.mc.player.prevY - ServerStorage.mc.player.getY();
        if (ServerStorage.mc.player.isOnGround()) {
            this.fallDistance = 0.0f;
        } else if (y2 > 0.0) {
            this.fallDistance += (float)y2;
        }
    }

    @EventLink
    public void onPacketSend(EventPacket e2) {
        PlayerMoveC2SPacket packet;
        if (ServerStorage.mc.player == null || ServerStorage.mc.world == null) {
            return;
        }
        if (e2.getType() != EventPacket.Type.SEND) {
            return;
        }
        Packet<?> class_25962 = e2.getPacket();
        if (class_25962 instanceof PlayerMoveC2SPacket) {
            packet = (PlayerMoveC2SPacket)class_25962;
            if (packet.changesPosition()) {
                this.serverX = packet.getX(ServerStorage.mc.player.getX());
                this.serverY = packet.getY(ServerStorage.mc.player.getY());
                this.serverZ = packet.getZ(ServerStorage.mc.player.getZ());
            }
            if (packet.changesLook()) {
                this.serverYaw = packet.getYaw(ServerStorage.mc.player.getYaw());
                this.serverPitch = packet.getPitch(ServerStorage.mc.player.getPitch());
            }
            this.serverOnGround = packet.isOnGround();
            this.serverHorizontalCollision = packet.horizontalCollision();
        }
        if ((class_25962 = e2.getPacket()) instanceof UpdateSelectedSlotC2SPacket) {
            packet = (UpdateSelectedSlotC2SPacket)class_25962;
            this.serverSlot = packet.getSelectedSlot();
        }
        if ((class_25962 = e2.getPacket()) instanceof ClientCommandC2SPacket) {
            packet = (ClientCommandC2SPacket)class_25962;
            switch (packet.getMode()) {
                case START_SPRINTING: {
                    e2.setCancelled(this.serverSprinting);
                    if (e2.isCancelled()) break;
                    this.serverSprinting = true;
                    break;
                }
                case STOP_SPRINTING: {
                    e2.setCancelled(!this.serverSprinting);
                    if (e2.isCancelled()) break;
                    this.serverSprinting = false;
                    break;
                }
                case PRESS_SHIFT_KEY: {
                    this.serverSneaking = true;
                    break;
                }
                case RELEASE_SHIFT_KEY: {
                    this.serverSneaking = false;
                }
            }
        }
    }

    @EventLink
    public void onPacketReceive(EventPacket e2) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        EntityStatusS2CPacket packet;
        if (ServerStorage.mc.player == null || ServerStorage.mc.world == null) {
            return;
        }
        Packet<?> class_25962 = e2.getPacket();
        if (class_25962 instanceof EntityStatusS2CPacket && (packet = (EntityStatusS2CPacket)class_25962).getStatus() == 35) {
            Entity class_12972 = packet.getEntity((World)ServerStorage.mc.world);
            if (!(class_12972 instanceof PlayerEntity)) {
                return;
            }
            PlayerEntity player = (PlayerEntity)class_12972;
            EventInvoker.invoke(new EventPopTotem(player));
        }
    }

    @Generated
    public int getServerSlot() {
        return this.serverSlot;
    }

    @Generated
    public float getServerYaw() {
        return this.serverYaw;
    }

    @Generated
    public float getServerPitch() {
        return this.serverPitch;
    }

    @Generated
    public float getFallDistance() {
        return this.fallDistance;
    }

    @Generated
    public double getServerX() {
        return this.serverX;
    }

    @Generated
    public double getServerY() {
        return this.serverY;
    }

    @Generated
    public double getServerZ() {
        return this.serverZ;
    }

    @Generated
    public boolean isServerOnGround() {
        return this.serverOnGround;
    }

    @Generated
    public boolean isServerSprinting() {
        return this.serverSprinting;
    }

    @Generated
    public boolean isServerSneaking() {
        return this.serverSneaking;
    }

    @Generated
    public boolean isServerHorizontalCollision() {
        return this.serverHorizontalCollision;
    }
}