/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1309
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package kotakbaz.rain.mixin;

import net.minecraft.class_1282;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1309.class})
public interface LivingEntityInvoker {
    @Invoker(value="method_6095")
    public boolean rain$tryUseDeathProtector(class_1282 var1);

    @Invoker(value="method_6013")
    public void rain$playHurtSound(class_1282 var1);
}

