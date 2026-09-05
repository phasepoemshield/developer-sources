/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class06995
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class06995;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07723;
import minecraft.class07743;

class class07731
implements class07723 {
    private final IntArrayList N = new IntArrayList();

    public class07731(int[] nArray) {
        this.N.addElements(0, nArray);
    }

    @Override
    public class07723 N(class07709 class077092) {
        if (class077092 instanceof class07720) {
            class07720 class077202 = (class07720)((Object)class077092);
            this.N.add(class077202.B());
            return this;
        }
        return new class07743(this.N).N(class077092);
    }

    @Override
    public class07709 N() {
        return new class06995(this.N.toIntArray());
    }
}

