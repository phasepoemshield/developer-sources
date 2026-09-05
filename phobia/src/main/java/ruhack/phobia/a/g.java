/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_338
 *  net.minecraft.class_7469
 *  net.minecraft.class_7591
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_2561;
import net.minecraft.class_338;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.fl;
import ruhack.phobia.fo;

@Mixin(value={class_338.class})
public class g {
    @Inject(method={"method_1812"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$hideBaritoneMessagesWhileUnhooked(class_2561 message, CallbackInfo ci2) {
        if (fl.isUnhooked() && message.getString().stripLeading().startsWith("[Baritone]")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_44811"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$hideDetailedBaritoneMessagesWhileUnhooked(class_2561 message, class_7469 signature, class_7591 indicator, CallbackInfo ci2) {
        if (fl.isUnhooked() && message.getString().stripLeading().startsWith("[Baritone]")) {
            ci2.cancel();
        }
    }

    @ModifyVariable(method={"method_1812"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 phobia$filterOwnSystemMessage(class_2561 original) {
        return fo.filterOwnChat(original);
    }

    @ModifyVariable(method={"method_44811"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_2561 phobia$filterOwnPlayerMessage(class_2561 original) {
        return fo.filterOwnChat(original);
    }
}

