/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3419
 *  net.minecraft.class_7172
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import java.io.File;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3419;
import net.minecraft.class_7172;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_315.class})
public abstract class af {
    @Unique
    private static boolean isFirstLaunch = false;

    @Shadow
    public abstract class_7172<Double> method_45578(class_3419 var1);

    @Shadow
    public abstract class_7172<Integer> method_42474();

    @Shadow
    public abstract class_7172<Boolean> method_75335();

    @Inject(method={"<init>"}, at={@At(value="HEAD")})
    private static void checkFirstLaunch(class_310 client, File optionsFile, CallbackInfo ci2) {
        File options = new File(optionsFile, "options.txt");
        isFirstLaunch = !options.exists();
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void setDefaultSettings(class_310 client, File optionsFile, CallbackInfo ci2) {
        if (isFirstLaunch) {
            this.method_45578(class_3419.field_15253).method_41748((Object)0.0);
            this.method_45578(class_3419.field_15252).method_41748((Object)0.0);
            this.method_42474().method_41748((Object)2);
            this.method_75335().method_41748((Object)false);
            isFirstLaunch = false;
        }
    }
}

