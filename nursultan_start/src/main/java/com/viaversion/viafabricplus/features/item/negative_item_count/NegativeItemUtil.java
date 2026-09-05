/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.util.ItemUtil
 *  com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11
 *  minecraft.class06584
 *  minecraft.class07001
 */
package com.viaversion.viafabricplus.features.item.negative_item_count;

import com.viaversion.viafabricplus.util.ItemUtil;
import com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11;
import minecraft.class06584;
import minecraft.class07001;

public final class NegativeItemUtil {
    public static int getCount(class06584 class065842) {
        class07001 class070012 = ItemUtil.getTagOrNull((class06584)class065842);
        if (class070012 != null) {
            return class070012.y(ItemUtil.vvNbtName(Protocol1_10To1_11.class), class065842.c());
        }
        return class065842.c();
    }
}

