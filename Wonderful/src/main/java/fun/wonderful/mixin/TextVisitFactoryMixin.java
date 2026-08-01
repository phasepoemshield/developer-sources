package fun.wonderful.mixin;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.misc.NameProtect;
import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={TextVisitFactory.class})
public class TextVisitFactoryMixin {
    @ModifyArg(method={"visitFormatted"}, at=@At(value="INVOKE", target="Lnet/minecraft/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/Style;Lnet/minecraft/Style;Lnet/minecraft/CharacterVisitor;)Z", ordinal=0), index=0)
    private static String wonderful$patchVisitedText(String text) {
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