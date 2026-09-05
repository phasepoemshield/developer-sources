/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Coerce
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package ruhack.phobia.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Redirect;

@Pseudo
@Mixin(targets={"com/viaversion/viaversion/protocols/v1_21to1_21_2/Protocol1_21To1_21_2"}, remap=false)
public abstract class bx {
    @Redirect(method={"lambda$registerPackets$4"}, at=@At(value="INVOKE", target="Lcom/viaversion/viaversion/protocols/v1_21to1_21_2/storage/EntityTracker1_21_2;clientEntityId()I", remap=false), require=0, remap=false)
    private static int phobia$safeClientEntityId(@Coerce Object tracker) {
        try {
            Method hasClientEntityId = tracker.getClass().getMethod("hasClientEntityId", new Class[0]);
            if (!((Boolean)hasClientEntityId.invoke(tracker, new Object[0])).booleanValue()) {
                return Integer.MIN_VALUE;
            }
            Method clientEntityId = tracker.getClass().getMethod("clientEntityId", new Class[0]);
            return (Integer)clientEntityId.invoke(tracker, new Object[0]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException exception) {
            return Integer.MIN_VALUE;
        }
    }
}
