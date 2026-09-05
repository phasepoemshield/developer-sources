/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class07209
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04991;
import minecraft.class05013;
import minecraft.class07209;

public class class05023
extends class04991<class05013> {
    protected class05023(class00538 class005382) {
        super(class00772.field_9282, class005382, new class05013((Long2ObjectOpenHashMap<class00536>)new Long2ObjectOpenHashMap()));
    }

    @Override
    protected int N(long l) {
        long l2 = class01296.i((long)l);
        class00536 class005362 = this.N(l2, false);
        if (class005362 == null) {
            return 0;
        }
        return class005362.N(class01296.y((int)class07209.method_10061((long)l)), class01296.y((int)class07209.method_10071((long)l)), class01296.y((int)class07209.method_10083((long)l)));
    }
}

