package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import ru.ocz.protection.annotation.Compile;

public class РотацииСУпреждением
extends RotationsSystem
implements QClient {
    @Compile
    public native Vec2f rotating(Vec2f var1, LivingEntity var2);

    private Vec3d calcPointed(LivingEntity target) {
        if (target != null) {
            Vec3d vecPosition = this.getPredictedPoint(target, target.getBoundingBox().getCenter());
            return new Vec3d(vecPosition.getX() - РотацииСУпреждением.mc.player.getX(), vecPosition.getY() - РотацииСУпреждением.mc.player.getY(), vecPosition.getZ() - РотацииСУпреждением.mc.player.getZ());
        }
        return Vec3d.ZERO;
    }

    @Override
    public void updateRotations(LivingEntity entity) {
    }
}