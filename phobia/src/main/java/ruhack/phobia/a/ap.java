/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_364
 *  net.minecraft.class_4185
 *  net.minecraft.class_490
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_364;
import net.minecraft.class_4185;
import net.minecraft.class_490;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_490.class})
public abstract class ap {
    @Inject(method={"method_25426"}, at={@At(value="TAIL")})
    private void addDropAllButton(CallbackInfo ci2) {
        class_310 mc2 = class_310.method_1551();
        class_490 screen = (class_490)this;
        int x2 = screen.field_22789 / 2 - 40;
        int y2 = screen.field_22790 / 2 - 120;
        class_4185 dropAllButton = class_4185.method_46430((class_2561)class_2561.method_30163((String)"\u0412\u044b\u043a\u0438\u043d\u0443\u0442\u044c \u0432\u0441\u0451"), button -> this.dropAllItems(mc2)).method_46433(x2, y2).method_46437(80, 20).method_46431();
        screen.method_37063((class_364)dropAllButton);
    }

    private void dropAllItems(class_310 mc2) {
        class_1799 stack;
        int i2;
        class_746 player = mc2.field_1724;
        if (player == null || player.field_7512 == null) {
            return;
        }
        for (i2 = 9; i2 < 36; ++i2) {
            stack = player.method_31548().method_5438(i2);
            if (stack.method_7960()) continue;
            mc2.field_1761.method_2906(player.field_7512.field_7763, i2, 1, class_1713.field_7795, (class_1657)player);
        }
        for (i2 = 0; i2 < 9; ++i2) {
            stack = player.method_31548().method_5438(i2);
            if (stack.method_7960()) continue;
            mc2.field_1761.method_2906(player.field_7512.field_7763, i2 + 36, 1, class_1713.field_7795, (class_1657)player);
        }
    }
}

