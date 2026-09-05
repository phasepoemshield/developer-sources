/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class06584
 *  minecraft.class07001
 */
package com.viaversion.viafabricplus.util;

import com.viaversion.viaversion.api.protocol.Protocol;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class06584;
import minecraft.class07001;

public final class ItemUtil {
    public static String vvNbtName(Class<? extends Protocol<?, ?, ?, ?>> clazz, String string) {
        return "VV|" + clazz.getSimpleName() + "|" + string;
    }

    public static String vvNbtName(Class<? extends Protocol<?, ?, ?, ?>> clazz) {
        return "VV|" + clazz.getSimpleName();
    }

    public static class07001 getTagOrNull(class06584 class065842) {
        class02837 class028372 = (class02837)class065842.method_58694(class02484.y);
        if (class028372 != null) {
            return class028372.y();
        }
        return null;
    }
}

