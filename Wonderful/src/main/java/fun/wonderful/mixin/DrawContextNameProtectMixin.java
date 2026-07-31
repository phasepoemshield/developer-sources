package fun.wonderful.mixin;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.misc.NameProtect;
import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={DrawContext.class})
public class DrawContextNameProtectMixin {
    @ModifyVariable(method={"drawTextWithShadow"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private String wonderful$patchStringShadow(String text) {
        return this.patch(text);
    }

    @ModifyVariable(method={"drawText"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private String wonderful$patchString(String text) {
        return this.patch(text);
    }

    private String patch(String text) {
        if (ModuleClass.INSTANCE == null) {
            return text;
        }
        NameProtect nameProtect = ModuleClass.nameProtect;
        if (nameProtect == null || !nameProtect.isEnable()) {
            return text;
        }
        return nameProtect.patchIncomingText(text);
    }
}