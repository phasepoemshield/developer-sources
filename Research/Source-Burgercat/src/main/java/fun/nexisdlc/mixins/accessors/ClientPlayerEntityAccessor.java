package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ClientPlayerEntity.class)
public interface ClientPlayerEntityAccessor {
    @Accessor("lastYawClient")
    float getLastYaw();

    @Accessor("lastYawClient")
    void setLastYaw(float yaw);

    @Accessor("lastPitchClient")
    float getLastPitch();

    @Accessor("lastPitchClient")
    void setLastPitch(float pitch);

    @Accessor("lastSprinting")
    boolean getLastSprinting();

    @Accessor("lastSprinting")
    void setLastSprinting(boolean sprinting);
}
