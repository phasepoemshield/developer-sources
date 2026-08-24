/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.damage.DamageSource
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package kotakbaz.rain.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={LivingEntity.class})
public interface LivingEntityInvoker {
    @Invoker(value="method_6013")
    public void rain$playHurtSound(DamageSource var1);

    @Invoker(value="method_6095")
    public boolean rain$tryUseDeathProtector(DamageSource var1);
}

