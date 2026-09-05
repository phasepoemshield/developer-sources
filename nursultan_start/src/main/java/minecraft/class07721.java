/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import minecraft.class07709;
import minecraft.class07723;
import minecraft.class07729;
import minecraft.class07743;
import minecraft.class07757;

class class07721
implements class07723 {
    private final LongArrayList N = new LongArrayList();

    public class07721(long[] lArray) {
        this.N.addElements(0, lArray);
    }

    @Override
    public class07723 N(class07709 class077092) {
        if (class077092 instanceof class07729) {
            class07729 class077292 = (class07729)((Object)class077092);
            this.N.add(class077292.M());
            return this;
        }
        return new class07743(this.N).N(class077092);
    }

    @Override
    public class07709 N() {
        return new class07757(this.N.toLongArray());
    }
}

