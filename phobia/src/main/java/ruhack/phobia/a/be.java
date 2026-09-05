/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10039
 *  net.minecraft.class_1542
 *  net.minecraft.class_916
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import java.util.WeakHashMap;
import net.minecraft.class_10039;
import net.minecraft.class_1542;
import net.minecraft.class_916;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_916.class})
public abstract class be {
    @Unique
    private static final WeakHashMap<class_10039, Boolean> groundStateMap = new WeakHashMap();
    @Unique
    private class_10039 currentState = null;

    @Inject(method={"method_62470"}, at={@At(value="HEAD")})
    private void captureGroundState(class_1542 entity, class_10039 state, float tickDelta, CallbackInfo ci2) {
        groundStateMap.put(state, entity.method_24828());
    }
}

