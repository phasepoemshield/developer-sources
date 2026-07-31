/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.NameProtectModule;
import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={TextVisitFactory.class})
public class MixinTextVisitFactory {
    @ModifyVariable(method={"method_27472"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private static String rain$protectName(String string) {
        return NameProtectModule.INSTANCE.protectString(string);
    }
}

