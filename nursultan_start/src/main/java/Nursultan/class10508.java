/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  minecraft.class01296
 *  minecraft.class05374
 *  minecraft.class05474
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.BitSet;
import java.util.Optional;
import minecraft.class01296;
import minecraft.class05374;
import minecraft.class05474;
import net.caffeinemc.mods.lithium.common.util.Pos;

public class class10508<R>
extends AbstractIterator<R> {
    private int R;
    final /* synthetic */ BitSet N;
    final /* synthetic */ Long2ObjectMap y;
    final /* synthetic */ int L;
    final /* synthetic */ class05474 u;
    final /* synthetic */ int i;

    public class10508(class05374 class053742, BitSet bitSet, Long2ObjectMap long2ObjectMap, int n, class05474 class054742, int n2) {
        this.N = bitSet;
        this.y = long2ObjectMap;
        this.L = n;
        this.u = class054742;
        this.i = n2;
        this.R = this.N.nextSetBit(0);
    }

    protected R computeNext() {
        while (this.R >= 0) {
            Optional optional = (Optional)this.y.get(class01296.y((int)this.L, (int)Pos.SectionYCoord.fromSectionIndex((class05474)this.u, (int)this.R), (int)this.i));
            this.R = this.N.nextSetBit(this.R + 1);
            if (!optional.isPresent()) continue;
            return (R)optional.get();
        }
        return (R)this.endOfData();
    }
}

