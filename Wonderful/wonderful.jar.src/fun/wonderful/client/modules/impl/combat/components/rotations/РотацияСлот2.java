package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.utils.combat.rotation.Rotation;
import fun.wonderful.client.modules.impl.combat.components.rotations.БазоваяРотация;
import net.minecraft.entity.LivingEntity;
import ru.ocz.protection.annotation.Compile;

public class РотацияСлот2
extends БазоваяРотация {
    private float legacyYawSpeed = 0.0f;
    private float legacyPitchSpeed = 0.0f;
    private float aimFatigue = 0.0f;
    private int legacyIdleTicks = 0;
    private int reactionDelayTicks = 0;
    private float waveTicks = 0.0f;
    private float velocityYaw = 0.0f;
    private float velocityPitch = 0.0f;

    @Compile
    public native void update(LivingEntity var1, Rotation var2, boolean var3);

    @Override
    public void update(Rotation targetAngle, boolean elytraVisual) {
    }

    public void reset() {
        if (РотацияСлот2.mc.player != null) {
            this.lastYaw = РотацияСлот2.mc.player.getYaw();
            this.lastPitch = РотацияСлот2.mc.player.getPitch();
        } else {
            this.lastYaw = 0.0f;
            this.lastPitch = 0.0f;
        }
        this.legacyYawSpeed = 0.0f;
        this.legacyPitchSpeed = 0.0f;
        this.aimFatigue = 0.0f;
        this.legacyIdleTicks = 0;
        this.reactionDelayTicks = 0;
        this.waveTicks = 0.0f;
        this.velocityYaw = 0.0f;
        this.velocityPitch = 0.0f;
    }
}