/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  minecraft.class04762
 *  minecraft.class07321
 *  minecraft.class08593
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import minecraft.class04762;
import minecraft.class07321;
import minecraft.class08593;

public class class01821
extends class04762 {
    public static final int N = 33;
    protected final Long2ByteMap y = new Long2ByteOpenHashMap();
    private final class08593 L;

    protected int L(long l) {
        return this.y.get(l);
    }

    public class01821(class08593 class085932) {
        super(34, 16, 256);
        this.L = class085932;
        class085932.y((arg_0, arg_1, arg_2) -> ((class01821)this).y(arg_0, arg_1, arg_2));
        this.y.defaultReturnValue((byte)33);
    }

    protected int y(long l) {
        return this.L.N(l, true);
    }

    public void N() {
        this.y(Integer.MAX_VALUE);
    }

    protected void N(long l, int n) {
        if (n >= 33) {
            this.y.remove(l);
        } else {
            this.y.put(l, (byte)n);
        }
    }

    public int N(class07321 class073212) {
        return this.L(class073212.y());
    }
}

