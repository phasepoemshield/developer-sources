package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import net.minecraft.entity.LivingEntity;
import ru.ocz.protection.annotation.Compile;

public class РотацияВеллМайн
extends RotationsSystem
implements QClient {
    private LivingEntity currentTarget;
    private float lastYaw = 0.0f;
    private float lastPitch = 0.0f;
    private float acceleration = 0.0f;
    private boolean isBack = false;
    private double randomOffsetX = 0.0;
    private double randomOffsetY = 0.0;
    private double randomOffsetZ = 0.0;

    public void reset() {
        this.currentTarget = null;
        this.acceleration = 0.0f;
        this.isBack = false;
        this.randomOffsetX = 0.0;
        this.randomOffsetY = 0.0;
        this.randomOffsetZ = 0.0;
        if (РотацияВеллМайн.mc.player != null) {
            this.lastYaw = РотацияВеллМайн.mc.player.getYaw();
            this.lastPitch = РотацияВеллМайн.mc.player.getPitch();
        } else {
            this.lastYaw = 0.0f;
            this.lastPitch = 0.0f;
        }
    }

    private float getGCDValue() {
        float sensitivity = (float)((Double)РотацияВеллМайн.mc.options.getMouseSensitivity().getValue() * (double)0.6f + (double)0.2f);
        return sensitivity * sensitivity * sensitivity * 1.2f;
    }

    @Compile
    private native void updateRandomOffset(LivingEntity var1);

    @Override
    @Compile
    public native void updateRotations(LivingEntity var1);
}