/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_12079$class_10726
 *  net.minecraft.class_12079$class_12081
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_742
 *  net.minecraft.class_8685
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_12079;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_742.class})
public class t {
    @Unique
    private static final class_2960 CAPE_ID = class_2960.method_60655((String)"minecraft", (String)"capes/cape");
    @Unique
    private static final class_12079.class_10726 CAPE_ASSET = new class_12079.class_10726(CAPE_ID);

    @Inject(method={"method_52814"}, at={@At(value="RETURN")}, cancellable=true)
    private void replaceCape(CallbackInfoReturnable<class_8685> cir) {
        class_742 player = (class_742)this;
        class_310 client = class_310.method_1551();
        if (client.field_1724 == null || !player.method_5667().equals(client.field_1724.method_5667())) {
            return;
        }
        class_8685 old = (class_8685)cir.getReturnValue();
        cir.setReturnValue((Object)new class_8685(old.comp_1626(), (class_12079.class_12081)CAPE_ASSET, (class_12079.class_12081)CAPE_ASSET, old.comp_1629(), old.comp_1630()));
    }
}

