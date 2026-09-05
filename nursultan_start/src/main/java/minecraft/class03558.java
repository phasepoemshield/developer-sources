/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class01636
 *  minecraft.class07878
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00381;
import minecraft.class01636;
import minecraft.class07878;
import org.slf4j.Logger;

public interface class03558
extends class01636 {
    public static final Logger R = LogUtils.getLogger();

    default public void method_59807(class00381 class003812, Exception exception) throws class07878 {
        R.error("Failed to handle packet {}, suppressing error", (Object)class003812, (Object)exception);
    }
}

