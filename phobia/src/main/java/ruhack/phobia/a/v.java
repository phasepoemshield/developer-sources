/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_12155
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package ruhack.phobia.a;

import net.minecraft.class_12155;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

@Mixin(value={class_12155.class})
public class v {
    @Redirect(method={"method_75432"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_5828(F)Lnet/minecraft/class_243;"))
    private class_243 redirectLookVector(class_1297 entity, float tickProgress) {
        ot r2;
        ov angle;
        if (entity == class_310.method_1551().field_1724 && (angle = (r2 = ot.INSTANCE).getRotation()) != null && ot.INSTANCE.getRotation().toVector() != class_310.method_1551().field_1724.method_5720()) {
            float yaw = angle.getYaw();
            float pitch = angle.getPitch();
            float yawRad = (float)Math.toRadians(-yaw);
            float pitchRad = (float)Math.toRadians(-pitch);
            float x2 = class_3532.method_15374((double)yawRad) * class_3532.method_15362((double)pitchRad);
            float y2 = class_3532.method_15374((double)pitchRad);
            float z2 = class_3532.method_15362((double)yawRad) * class_3532.method_15362((double)pitchRad);
            return new class_243((double)x2, (double)y2, (double)z2);
        }
        return entity.method_5828(tickProgress);
    }
}

