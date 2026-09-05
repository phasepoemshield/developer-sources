/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class05485;
import minecraft.class05513;
import minecraft.class07536;
import org.slf4j.Logger;

public class class05526
implements class05485 {
    private static final Logger N = LogUtils.getLogger();

    @Override
    public void y(class05513 class055132) {
    }

    @Override
    public void N(class05513 class055132) {
        String string = class055132.L().method_23854();
        if (class055132.b()) {
            N.error("{} failed at {}! {}", new Object[]{class055132.y(), string, class07536.L((Throwable)class055132.m())});
        } else {
            N.warn("(optional) {} failed at {}. {}", new Object[]{class055132.y(), string, class07536.L((Throwable)class055132.m())});
        }
    }
}

