/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_364
 *  net.minecraft.class_4068
 *  net.minecraft.class_4185
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_6379
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_364;
import net.minecraft.class_4068;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_6379;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.a.am;
import ruhack.phobia.an;
import ruhack.phobia.og;
import ruhack.phobia.oi;

@Mixin(value={class_500.class})
public class bi {
    @Inject(method={"method_25426"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_500;method_20121()V")})
    public void multiplayerGuiOpen(CallbackInfo ci2) {
        class_500 ms2 = (class_500)this;
        class_310 client = class_310.method_1551();
        an config = an.getInstance();
        String buttonText = config.isProxyEnabled() && !config.getDefaultProxy().isEmpty() ? "\u00a7a\u041f\u0440\u043e\u043a\u0441\u0438: \u0410\u043a\u0442\u0438\u0432\u0435\u043d" : "\u00a77Proxy";
        oi.proxyMenuButton = class_4185.method_46430((class_2561)class_2561.method_43470((String)buttonText), buttonWidget -> class_310.method_1551().method_1507((class_437)new og((class_437)ms2))).method_46434(5, 5, 100, 20).method_46431();
        am si = (am)ms2;
        si.getDrawables().add((class_4068)oi.proxyMenuButton);
        si.getSelectables().add((class_6379)oi.proxyMenuButton);
        si.getChildren().add((class_364)oi.proxyMenuButton);
    }
}

