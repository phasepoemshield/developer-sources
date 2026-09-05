/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class06584
 */
package net.caffeinemc.mods.lithium.common.entity.item;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.HashCommon;
import minecraft.class06584;

class ItemEntityList$1
implements Hash.Strategy<class06584> {
    ItemEntityList$1() {
    }

    public boolean equals(class06584 class065842, class06584 class065843) {
        return class065842 == class065843 || class065842 != null && class065843 != null && class06584.L((class06584)class065842, (class06584)class065843);
    }

    public int hashCode(class06584 class065842) {
        return HashCommon.mix((int)class06584.y((class06584)class065842));
    }
}

