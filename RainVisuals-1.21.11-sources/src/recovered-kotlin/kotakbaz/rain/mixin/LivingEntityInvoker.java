package kotakbaz.rain.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from LivingEntityInvoker.java
@Mixin(LivingEntity.class)
public interface LivingEntityInvoker {
   @Invoker("method_6013")
   void rain$playHurtSound(DamageSource var1);

   @Invoker("method_6095")
   boolean rain$tryUseDeathProtector(DamageSource var1);
}
