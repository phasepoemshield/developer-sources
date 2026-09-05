/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  minecraft.class07037
 */
package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import minecraft.class07037;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07723;
import minecraft.class07729;
import minecraft.class07741;

class class07743
implements class07723 {
    private final class07741 N = new class07741();

    public class07743(LongArrayList longArrayList) {
        longArrayList.forEach(l -> this.N.add(class07729.N(l)));
    }

    public class07743(ByteArrayList byteArrayList) {
        byteArrayList.forEach(by -> this.N.add(class07037.N((byte)by)));
    }

    public class07743(IntArrayList intArrayList) {
        intArrayList.forEach(n -> this.N.add(class07720.N(n)));
    }

    class07743(class07741 class077412) {
        this.N.addAll(class077412);
    }

    class07743() {
    }

    @Override
    public class07709 N() {
        return this.N;
    }

    @Override
    public class07723 N(class07709 class077092) {
        this.N.add(class077092);
        return this;
    }
}

