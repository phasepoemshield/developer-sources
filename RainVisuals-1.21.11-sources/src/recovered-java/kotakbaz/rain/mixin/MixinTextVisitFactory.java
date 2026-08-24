/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.TextVisitFactory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package kotakbaz.rain.mixin;

import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import oxxxde.\u062f;

@Mixin(value={TextVisitFactory.class})
public class MixinTextVisitFactory {
    @ModifyVariable(method={"method_27472"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private static String rain$protectName(String string) {
        return \u062f.INSTANCE.protectString(string);
    }
}

