/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Constant
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyConstant
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import java.util.concurrent.CompletableFuture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets={"other/figura/resources/FiguraRuntimeResources"}, remap=false)
@Pseudo
public abstract class MixinFiguraRuntimeResources {
    @Inject(method={"init"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$skipFiguraBackendResources(CallbackInfoReturnable<CompletableFuture<Void>> cir) {
        cir.setReturnValue(CompletableFuture.completedFuture(null));
    }

    @ModifyConstant(method={"<clinit>"}, constant={@Constant(stringValue="Figura runtime resource pack")}, remap=false)
    private static String rain$renameRuntimePackId(String value) {
        return "Rain runtime resource pack";
    }

    @ModifyConstant(method={"<clinit>"}, constant={@Constant(stringValue="Figura Runtime Resources")}, remap=false)
    private static String rain$renameRuntimePackTitle(String value) {
        return "Rain Runtime Resources";
    }
}

