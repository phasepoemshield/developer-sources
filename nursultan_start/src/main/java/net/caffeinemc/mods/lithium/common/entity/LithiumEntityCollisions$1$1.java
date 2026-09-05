/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07309
 *  minecraft.class08057
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 */
package net.caffeinemc.mods.lithium.common.entity;

import com.google.common.collect.AbstractIterator;
import java.util.List;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class07049;
import minecraft.class07309;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions$1;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;

class LithiumEntityCollisions$1$1
extends AbstractIterator<class00494> {
    int index = 0;
    boolean consumedWorldBorder = false;
    final /* synthetic */ LithiumEntityCollisions$1 this$0;

    LithiumEntityCollisions$1$1(LithiumEntityCollisions$1 var1_1) {
        this.this$0 = var1_1;
    }

    protected class00494 computeNext() {
        class07049 class070492;
        if (this.this$0.entityList == null) {
            this.this$0.entityList = WorldHelper.getEntitiesForCollision((class07309)this.this$0.val$view, (class00734)this.this$0.val$box, (class07049)this.this$0.val$entity);
            this.this$0.nextFilterIndex = 0;
        }
        List<class07049> list = this.this$0.entityList;
        do {
            if (this.index >= list.size()) {
                if (this.this$0.val$includeWorldBorder && !this.consumedWorldBorder) {
                    this.consumedWorldBorder = true;
                    class08057 class080572 = this.this$0.val$entity.method_73183().method_8621();
                    if (!LithiumEntityCollisions.isWithinWorldBorder(class080572, this.this$0.val$box) && LithiumEntityCollisions.isWithinWorldBorder(class080572, this.this$0.val$entity.method_5829())) {
                        return class080572.N();
                    }
                }
                return (class00494)this.endOfData();
            }
            class070492 = list.get(this.index);
            if (this.index >= this.this$0.nextFilterIndex) {
                if (this.this$0.val$entity == null) {
                    if (!class070492.method_30948(null)) {
                        class070492 = null;
                    }
                } else if (!this.this$0.val$entity.method_30949(class070492)) {
                    class070492 = null;
                }
                ++this.this$0.nextFilterIndex;
            }
            ++this.index;
        } while (class070492 == null);
        return class00389.N((class00734)class070492.method_5829());
    }
}

