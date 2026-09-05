/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import minecraft.class02362;
import minecraft.class02389;

public final class class06681
extends Enum<class06681> {
    public static final /* enum */ class06681 field_12400 = new class06681(0);
    public static final /* enum */ class06681 field_12398 = new class06681(1);
    public static final /* enum */ class06681 field_12403 = new class06681(2);
    public static final /* enum */ class06681 field_12401 = new class06681(3);
    public static final /* enum */ class06681 field_12397 = new class06681(4);
    public static final /* enum */ class06681 field_54090 = new class06681(5);
    public static final /* enum */ class06681 field_54091 = new class06681(6);
    public static final /* enum */ class06681 field_54092 = new class06681(7);
    public static final /* enum */ class06681 field_54093 = new class06681(8);
    public static final Set<class06681> field_40710;
    public static final Set<class06681> field_40711;
    public static final Set<class06681> field_54094;
    public static final class02362<ByteBuf, Set<class06681>> field_54095;
    private final int field_12399;
    private static final /* synthetic */ class06681[] field_12402;

    private class06681(int n2) {
        this.field_12399 = n2;
    }

    static {
        field_12402 = class06681.y();
        field_40710 = Set.of(class06681.values());
        field_40711 = Set.of(field_12397, field_12401);
        field_54094 = Set.of(field_54090, field_54091, field_54092, field_54093);
        field_54095 = class02389.M.N_10(class06681::N, class06681::N);
    }

    public static class06681[] values() {
        return (class06681[])field_12402.clone();
    }

    public static class06681 valueOf(String string) {
        return Enum.valueOf(class06681.class, string);
    }

    private boolean y(int n) {
        return (n & this.N()) == this.N();
    }

    public static Set<class06681> y(boolean bl, boolean bl2, boolean bl3) {
        EnumSet<class06681> var3 = EnumSet.noneOf(class06681.class);
        if (bl) {
            var3.add(field_54090);
        }
        if (bl2) {
            var3.add(field_54091);
        }
        if (bl3) {
            var3.add(field_54092);
        }
        return var3;
    }

    private static /* synthetic */ class06681[] y() {
        return new class06681[]{field_12400, field_12398, field_12403, field_12401, field_12397, field_54090, field_54091, field_54092, field_54093};
    }

    public static Set<class06681> N(int n) {
        EnumSet<class06681> var1 = EnumSet.noneOf(class06681.class);
        for (class06681 class066812 : class06681.values()) {
            if (!class066812.y(n)) continue;
            var1.add(class066812);
        }
        return var1;
    }

    public static int N(Set<class06681> set) {
        int n = 0;
        for (class06681 class066812 : set) {
            n |= class066812.N();
        }
        return n;
    }

    @SafeVarargs
    public static Set<class06681> N(Set<class06681> ... setArray) {
        HashSet<class06681> hashSet = new HashSet<class06681>();
        for (Set<class06681> set : setArray) {
            hashSet.addAll(set);
        }
        return hashSet;
    }

    private int N() {
        return 1 << this.field_12399;
    }

    public static Set<class06681> N(boolean bl, boolean bl2, boolean bl3) {
        EnumSet<class06681> var3 = EnumSet.noneOf(class06681.class);
        if (bl) {
            var3.add(field_12400);
        }
        if (bl2) {
            var3.add(field_12398);
        }
        if (bl3) {
            var3.add(field_12403);
        }
        return var3;
    }

    public static Set<class06681> N(boolean bl, boolean bl2) {
        EnumSet<class06681> var2 = EnumSet.noneOf(class06681.class);
        if (bl) {
            var2.add(field_12401);
        }
        if (bl2) {
            var2.add(field_12397);
        }
        return var2;
    }
}

