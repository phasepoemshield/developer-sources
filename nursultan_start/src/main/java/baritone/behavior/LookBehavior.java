/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.behavior.ILookBehavior
 *  baritone.api.behavior.look.IAimProcessor
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.RotationMoveEvent
 *  baritone.api.event.events.TickEvent$Type
 *  minecraft.class00530
 *  minecraft.class00547
 *  minecraft.class00564
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.behavior.ILookBehavior;
import baritone.api.behavior.look.IAimProcessor;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.utils.Rotation;
import baritone.behavior.Behavior;
import baritone.behavior.LookBehavior$AimProcessor;
import baritone.behavior.LookBehavior$Target;
import baritone.behavior.LookBehavior$Target$Mode;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import minecraft.class00530;
import minecraft.class00547;
import minecraft.class00564;

public final class LookBehavior
extends Behavior
implements ILookBehavior {
    private LookBehavior$Target target;
    private Rotation serverRotation;
    private Rotation prevRotation;
    private final LookBehavior$AimProcessor processor;
    private final Deque<Float> smoothYawBuffer;
    private final Deque<Float> smoothPitchBuffer;

    public LookBehavior(Baritone baritone) {
        super(baritone);
        this.processor = new LookBehavior$AimProcessor(baritone.getPlayerContext());
        this.smoothYawBuffer = new ArrayDeque<Float>();
        this.smoothPitchBuffer = new ArrayDeque<Float>();
    }

    public void onTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent.Type.IN) {
            this.processor.tick();
        }
    }

    public void pig() {
        if (this.target != null) {
            Rotation rotation = this.processor.peekRotation(this.target.rotation);
            this.ctx.player().method_36456(rotation.getYaw());
        }
    }

    public void onPlayerRotationMove(RotationMoveEvent rotationMoveEvent) {
        if (this.target != null) {
            Rotation rotation = this.processor.peekRotation(this.target.rotation);
            rotationMoveEvent.setYaw(rotation.getYaw());
            rotationMoveEvent.setPitch(rotation.getPitch());
        }
    }

    public void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent) {
        if (this.target == null) {
            return;
        }
        switch (playerUpdateEvent.getState()) {
            case PRE: {
                if (this.target.mode == LookBehavior$Target$Mode.NONE) {
                    return;
                }
                this.prevRotation = new Rotation(this.ctx.player().method_36454(), this.ctx.player().method_36455());
                Rotation rotation = this.processor.peekRotation(this.target.rotation);
                this.ctx.player().method_36456(rotation.getYaw());
                this.ctx.player().method_36457(rotation.getPitch());
                break;
            }
            case POST: {
                if (this.prevRotation != null) {
                    this.smoothYawBuffer.addLast(Float.valueOf(this.target.rotation.getYaw()));
                    while (this.smoothYawBuffer.size() > (Integer)Baritone.settings().smoothLookTicks.value) {
                        this.smoothYawBuffer.removeFirst();
                    }
                    this.smoothPitchBuffer.addLast(Float.valueOf(this.target.rotation.getPitch()));
                    while (this.smoothPitchBuffer.size() > (Integer)Baritone.settings().smoothLookTicks.value) {
                        this.smoothPitchBuffer.removeFirst();
                    }
                    if (this.target.mode == LookBehavior$Target$Mode.SERVER) {
                        this.ctx.player().method_36456(this.prevRotation.getYaw());
                        this.ctx.player().method_36457(this.prevRotation.getPitch());
                    } else if ((this.ctx.player().method_6128() ? (Boolean)Baritone.settings().elytraSmoothLook.value : (Boolean)Baritone.settings().smoothLook.value).booleanValue()) {
                        this.ctx.player().method_36456((float)this.smoothYawBuffer.stream().mapToDouble(f -> f.floatValue()).average().orElse(this.prevRotation.getYaw()));
                        if (this.ctx.player().method_6128()) {
                            this.ctx.player().method_36457((float)this.smoothPitchBuffer.stream().mapToDouble(f -> f.floatValue()).average().orElse(this.prevRotation.getPitch()));
                        }
                    }
                    this.prevRotation = null;
                }
                this.target = null;
                break;
            }
        }
    }

    public IAimProcessor getAimProcessor() {
        return this.processor;
    }

    public void onWorldEvent(WorldEvent worldEvent) {
        this.serverRotation = null;
        this.target = null;
    }

    public void onSendPacket(PacketEvent packetEvent) {
        if (!(packetEvent.getPacket() instanceof class00547)) {
            return;
        }
        class00547 class005472 = (class00547)packetEvent.getPacket();
        if (class005472 instanceof class00530 || class005472 instanceof class00564) {
            this.serverRotation = new Rotation(class005472.N(0.0f), class005472.y(0.0f));
        }
    }

    public void updateTarget(Rotation rotation, boolean bl) {
        this.target = new LookBehavior$Target(rotation, LookBehavior$Target$Mode.resolve(this.ctx, bl));
    }

    public Optional<Rotation> getEffectiveRotation() {
        if (((Boolean)Baritone.settings().freeLook.value).booleanValue()) {
            return Optional.ofNullable(this.serverRotation);
        }
        return Optional.empty();
    }
}

