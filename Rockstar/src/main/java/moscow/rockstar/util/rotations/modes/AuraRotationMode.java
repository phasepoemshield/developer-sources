package moscow.rockstar.util.rotations.modes;

import moscow.rockstar.module.combat.Aura;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.rotations.MoveCorrection;
import moscow.rockstar.util.rotations.RotationHandler;
import net.minecraft.entity.LivingEntity;

public interface AuraRotationMode extends IMinecraft {
   void rotate(Aura aura, RotationHandler handler, LivingEntity target, MoveCorrection moveCorrection);

   default void reset() {
   }
}
