/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07309
 */
package net.caffeinemc.mods.lithium.common.entity;

import java.util.Iterator;
import java.util.List;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class07049;
import minecraft.class07309;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions$1$1;

class LithiumEntityCollisions$1
implements Iterable<class00494> {
    List<class07049> entityList;
    int nextFilterIndex;
    final /* synthetic */ class07309 val$view;
    final /* synthetic */ class00734 val$box;
    final /* synthetic */ class07049 val$entity;
    final /* synthetic */ boolean val$includeWorldBorder;

    LithiumEntityCollisions$1(class07309 class073092, class00734 class007342, class07049 class070492, boolean bl) {
        this.val$view = class073092;
        this.val$box = class007342;
        this.val$entity = class070492;
        this.val$includeWorldBorder = bl;
    }

    @Override
    public Iterator<class00494> iterator() {
        return new LithiumEntityCollisions$1$1(this);
    }
}

