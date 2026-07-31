package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.entity.EntityRenderEvent;
import net.minecraft.util.math.MathHelper;

public class LivingEntityRenderRotation {

    public static float getYaw(EntityRenderEvent nexis$entityRenderEvent) {
        var RotationRenderModule = Nexis.getFunctionManager().getRotationRender();

        if (RotationTask.isRenderResetting() && RotationRenderModule.isState()) {
            return MathHelper.lerpAngleDegrees(
                    nexis$entityRenderEvent.getDelta(),
                    nexis$entityRenderEvent.getPrevYaw(),
                    nexis$entityRenderEvent.getYaw()
            );
        }
        return RotationTask.getRenderYaw();
    }

    public static float getPitch(EntityRenderEvent nexis$entityRenderEvent) {
        var RotationRenderModule = Nexis.getFunctionManager().getRotationRender();

        if (RotationTask.isRenderResetting() && RotationRenderModule.isState()) {
            return MathHelper.lerp(
                    nexis$entityRenderEvent.getDelta(),
                    nexis$entityRenderEvent.getPrevPitch(),
                    nexis$entityRenderEvent.getPitch()
            );
        }
        return RotationTask.getRenderPitch();
    }

    public static boolean shouldUseOriginalRotation() {
        var RotationRenderModule = Nexis.getFunctionManager().getRotationRender();

        return !RotationRenderModule.isState();
    }
}