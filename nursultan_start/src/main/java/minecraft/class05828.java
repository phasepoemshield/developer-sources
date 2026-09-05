/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class04991
 *  minecraft.class05017
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04991;
import minecraft.class05017;
import minecraft.class05818;
import minecraft.class07209;
import minecraft.class07211;

public class class05828
extends class04991<class05818> {
    protected int L() {
        return ((class05818)this.u).y;
    }

    protected class00536 M(long l) {
        class00536 class005362;
        class00536 class005363 = (class00536)this.M.get(l);
        if (class005363 != null) {
            return class005363;
        }
        int n = ((class05818)this.u).L.get(class01296.R((long)l));
        if (n == ((class05818)this.u).y || class01296.L((long)l) >= n) {
            if (this.z(l)) {
                return new class00536(15);
            }
            return new class00536();
        }
        long l2 = class01296.N((long)l, (class07211)class07211.field_11036);
        while ((class005362 = this.N(l2, true)) == null) {
            l2 = class01296.N((long)l2, (class07211)class07211.field_11036);
        }
        return class05828.N(class005362);
    }

    protected class05828(class00538 class005382) {
        super(class00772.field_9284, class005382, (class05017)new class05818((Long2ObjectOpenHashMap<class00536>)new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
    }

    protected void B(long l) {
        long l2;
        int n = class01296.L((long)l);
        if (((class05818)this.u).y > n) {
            ((class05818)this.u).y = n;
            ((class05818)this.u).L.defaultReturnValue(((class05818)this.u).y);
        }
        if (((class05818)this.u).L.get(l2 = class01296.R((long)l)) < n + 1) {
            ((class05818)this.u).L.put(l2, n + 1);
        }
    }

    protected void Z(long l) {
        long l2 = class01296.R((long)l);
        int n = class01296.L((long)l);
        if (((class05818)this.u).L.get(l2) == n + 1) {
            long l3 = l;
            while (!this.y(l3) && this.N(n)) {
                --n;
                l3 = class01296.N((long)l3, (class07211)class07211.field_11033);
            }
            if (this.y(l3)) {
                ((class05818)this.u).L.put(l2, n + 1);
            } else {
                ((class05818)this.u).L.remove(l2);
            }
        }
    }

    protected int i(long l, boolean bl) {
        long l2 = class01296.i((long)l);
        int n = class01296.L((long)l2);
        class05818 class058182 = bl ? (class05818)this.u : (class05818)this.L;
        int n2 = class058182.L.get(class01296.R((long)l2));
        if (n2 == class058182.y || n >= n2) {
            if (bl && !this.z(l2)) {
                return 0;
            }
            return 15;
        }
        class00536 class005362 = this.N(class058182, l2);
        if (class005362 == null) {
            l = class07209.method_10091((long)l);
            while (class005362 == null) {
                if (++n >= n2) {
                    return 15;
                }
                l2 = class01296.N((long)l2, (class07211)class07211.field_11036);
                class005362 = this.N(class058182, l2);
            }
        }
        return class005362.N(class01296.y((int)class07209.method_10061((long)l)), class01296.y((int)class07209.method_10071((long)l)), class01296.y((int)class07209.method_10083((long)l)));
    }

    protected int m(long l) {
        return ((class05818)this.u).L.get(l);
    }

    private static class00536 N(class00536 class005362) {
        if (class005362.L()) {
            return class005362.y();
        }
        byte[] byArray = class005362.N();
        byte[] byArray2 = new byte[2048];
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(byArray, 0, byArray2, i * 128, 128);
        }
        return new class00536(byArray2);
    }

    protected boolean N(int n) {
        return n >= ((class05818)this.u).y;
    }

    protected int N(long l) {
        return this.i(l, false);
    }

    protected boolean W(long l) {
        long l2 = class01296.R((long)l);
        int n = ((class05818)this.u).L.get(l2);
        return n == ((class05818)this.u).y || class01296.L((long)l) >= n;
    }
}

