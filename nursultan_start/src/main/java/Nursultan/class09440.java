/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01101
 *  minecraft.class01129
 *  minecraft.class01135
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import minecraft.class01101;
import minecraft.class01129;
import minecraft.class01135;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor;

public class class09440<T>
extends AbstractIterator<T> {
    Iterator<T> N;
    final /* synthetic */ ObjectIterator y;

    public class09440(class01129 class011292, ObjectIterator objectIterator) {
        this.y = objectIterator;
    }

    protected T computeNext() {
        if (this.N != null && this.N.hasNext()) {
            return (T)((class01135)this.N.next());
        }
        while (this.y.hasNext()) {
            class01101 class011012 = (class01101)this.y.next();
            if (!class011012.L().y() || class011012.N()) continue;
            this.N = ((EntitySectionAccessor)class011012).getCollection().iterator();
            if (!this.N.hasNext()) continue;
            return (T)((class01135)this.N.next());
        }
        return (T)((class01135)this.endOfData());
    }
}

