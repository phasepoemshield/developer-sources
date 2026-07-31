/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5223
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.d_0;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={class_5223.class})
public class MixinTextVisitFactory {
    public MixinTextVisitFactory() {
        super();
    }

    @ModifyVariable(method={"method_27472"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private static String rain$protectName(String string) {
        return d_0.INSTANCE.protectString(string);
    }
}

