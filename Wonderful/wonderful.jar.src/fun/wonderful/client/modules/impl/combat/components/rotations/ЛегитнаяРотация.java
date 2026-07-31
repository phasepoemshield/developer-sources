package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import net.minecraft.entity.LivingEntity;
import ru.ocz.protection.annotation.Compile;

public class ЛегитнаяРотация
extends RotationsSystem
implements QClient {
    @Override
    @Compile
    public native void updateRotations(LivingEntity var1);
}