/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10554
 *  minecraft.class01809
 *  minecraft.class01818
 *  minecraft.class04019
 *  minecraft.class05559
 */
package minecraft;

import Nursultan.class10554;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class01809;
import minecraft.class01818;
import minecraft.class04019;
import minecraft.class05559;
import minecraft.class06069;

public class class06075
implements class01809 {
    private static final int u = 48;
    private static final long i = 0xFFFFFFFFFFFFL;
    private static final long R = 25214903917L;
    private static final long M = 11L;
    private final AtomicLong B = new AtomicLong();
    private final class04019 Z = new class04019((class06069)((Object)this));

    public class01818 L() {
        return new class10554(this.B());
    }

    public class06075(long l) {
        this.N(l);
    }

    public class06069 y() {
        return new class06075(this.B());
    }

    public double E() {
        return this.Z.y();
    }

    public int N(int n) {
        long l;
        long l2 = this.B.get();
        if (!this.B.compareAndSet(l2, l = l2 * 25214903917L + 11L & 0xFFFFFFFFFFFFL)) {
            throw class05559.N((String)"LegacyRandomSource", null);
        }
        return (int)(l >> 48 - n);
    }

    public void N(long l) {
        if (!this.B.compareAndSet(this.B.get(), (l ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL)) {
            throw class05559.N((String)"LegacyRandomSource", null);
        }
        this.Z.N();
    }
}

