/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class03482
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class03482;
import minecraft.class04991;
import minecraft.class04993;
import minecraft.class05017;
import minecraft.class05027;
import minecraft.class05035;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public abstract class class05015<M extends class05017<M>, S extends class04991<M>>
implements class05035 {
    public static final int N = 15;
    protected static final int y = 1;
    protected static final long L = class05027.N(1);
    private static final int M = 512;
    protected static final class07211[] u = class07211.values();
    protected final class00538 i;
    protected final S R;
    private final LongOpenHashSet B = new LongOpenHashSet(512, 0.5f);
    private final LongArrayFIFOQueue Z = new LongArrayFIFOQueue();
    private final LongArrayFIFOQueue z = new LongArrayFIFOQueue();
    private static final int U = 2;
    private final long[] E = new long[2];
    private final class03482[] W = new class03482[2];

    private void L() {
        Arrays.fill(this.E, class07321.L);
        Arrays.fill(this.W, null);
    }

    @Override
    public int L(class07209 class072092) {
        return ((class04991)this.R).N(class072092.method_10063());
    }

    public class04993 L(long l) {
        return ((class04991)this.R).E(l);
    }

    protected void L(long l, long l2) {
        this.z.enqueue(l);
        this.z.enqueue(l2);
    }

    protected class05015(class00538 class005382, S s) {
        this.i = class005382;
        this.R = s;
        this.L();
    }

    private int i() {
        int n = 0;
        while (!this.Z.isEmpty()) {
            long l = this.Z.dequeueLong();
            long l2 = this.Z.dequeueLong();
            this.N(l, l2);
            ++n;
        }
        return n;
    }

    private int u() {
        int n = 0;
        while (!this.z.isEmpty()) {
            long l = this.z.dequeueLong();
            long l2 = this.z.dequeueLong();
            int n2 = ((class04991)this.R).i(l);
            int n3 = class05027.N(l2);
            if (class05027.L(l2) && n2 < n3) {
                ((class04991)this.R).N(l, n3);
                n2 = n3;
            }
            if (n2 == n3) {
                this.N(l, l2, n2);
            }
            ++n;
        }
        return n;
    }

    public void y(class07321 class073212, boolean bl) {
        ((class04991)this.R).L(class01296.y((int)class073212.B, (int)class073212.Z), bl);
    }

    protected int y(class00500 class005002) {
        return Math.max(1, class005002.z());
    }

    protected void y(long l, long l2) {
        this.Z.enqueue(l);
        this.Z.enqueue(l2);
    }

    public String y(long l) {
        return this.L(l).N();
    }

    protected class00500 y(class07209 class072092) {
        int n;
        int n2 = class01296.N((int)class072092.method_10263());
        class03482 class034822 = this.N(n2, n = class01296.N((int)class072092.method_10260()));
        if (class034822 == null) {
            return class00869.q.W();
        }
        return class034822.method_8320(class072092);
    }

    protected boolean N(class00500 class005002, class00500 class005003, class07211 class072112) {
        class00494 class004942 = class05015.N(class005002, class072112);
        class00494 class004943 = class05015.N(class005003, class072112.b());
        return class00389.y((class00494)class004942, (class00494)class004943);
    }

    public static int N(class00500 class005002, class00500 class005003, class07211 class072112, int n) {
        class00494 class004942;
        boolean bl = class05015.N(class005002);
        boolean bl2 = class05015.N(class005003);
        if (bl && bl2) {
            return n;
        }
        class00494 class004943 = bl ? class00389.N() : class005002.U();
        class00494 class004944 = class004942 = bl2 ? class00389.N() : class005003.U();
        if (class00389.y((class00494)class004943, (class00494)class004942, (class07211)class072112)) {
            return 16;
        }
        return n;
    }

    @Override
    public @Nullable class00536 N(class01296 class012962) {
        return ((class04991)this.R).u(class012962.W());
    }

    @Override
    public void N(class07321 class073212, boolean bl) {
        ((class04991)this.R).y(class01296.y((int)class073212.B, (int)class073212.Z), bl);
    }

    protected abstract void N(long var1, long var3);

    protected abstract void N(long var1, long var3, int var5);

    protected abstract void N(long var1);

    public static boolean N(class00500 class005002, class00500 class005003) {
        if (class005003 == class005002) {
            return false;
        }
        return class005003.z() != class005002.z() || class005003.m() != class005002.m() || class005003.W() || class005002.W();
    }

    @Override
    public int N() {
        LongIterator longIterator = this.B.iterator();
        while (longIterator.hasNext()) {
            this.N(longIterator.nextLong());
        }
        this.B.clear();
        this.B.trim(512);
        int n = 0;
        n += this.i();
        this.L();
        ((class04991)this.R).N(this);
        ((class04991)this.R).y();
        return n += this.u();
    }

    protected static boolean N(class00500 class005002) {
        return !class005002.G() || !class005002.W();
    }

    @Override
    public void N(class01296 class012962, boolean bl) {
        ((class04991)this.R).u(class012962.W(), bl);
    }

    public void N(long l, @Nullable class00536 class005362) {
        ((class04991)this.R).N(l, class005362);
    }

    public static class00494 N(class00500 class005002, class07211 class072112) {
        return class05015.N(class005002) ? class00389.N() : class005002.N(class072112);
    }

    protected @Nullable class03482 N(int n, int n2) {
        long l = class07321.u((int)n, (int)n2);
        for (int i = 0; i < 2; ++i) {
            if (l != this.E[i]) continue;
            return this.W[i];
        }
        class03482 class034822 = this.i.y(n, n2);
        for (int i = 1; i > 0; --i) {
            this.E[i] = this.E[i - 1];
            this.W[i] = this.W[i - 1];
        }
        this.E[0] = l;
        this.W[0] = class034822;
        return class034822;
    }

    @Override
    public void N(class07209 class072092) {
        this.B.add(class072092.method_10063());
    }

    @Override
    public boolean au_() {
        return ((class04991)this.R).N() || !this.B.isEmpty() || !this.Z.isEmpty() || !this.z.isEmpty();
    }
}

