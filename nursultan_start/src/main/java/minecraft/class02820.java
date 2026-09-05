/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class08562
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class08562;

public final class class02820
implements class02694 {
    public static final class02820 N = new class02820(List.of());
    public static final Codec<class02820> y = class06584.y.listOf().xmap(class02820::new, class028202 -> class028202.u);
    public static final class02362<class04247, class02820> L = class06584.z.N_33(class02389.N()).N_10(class02820::new, class028202 -> class028202.u);
    private final List<class06584> u;

    private class02820(List<class06584> list) {
        this.u = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class02820)) return false;
        class02820 class028202 = (class02820)object;
        if (!class06584.N(this.u, class028202.u)) return false;
        return true;
    }

    public String toString() {
        return "ChargedProjectiles[items=" + String.valueOf(this.u) + "]";
    }

    public int hashCode() {
        return class06584.N(this.u);
    }

    private static /* synthetic */ List y(class02820 class028202) {
        return class028202.u;
    }

    public boolean y() {
        return this.u.isEmpty();
    }

    private static void N(class06591 class065912, Consumer<class00392> consumer, class06584 class065842, int n) {
        if (n == 1) {
            consumer.accept((class00392)class00392.N((String)"item.minecraft.crossbow.projectile.single", (Object[])new Object[]{class065842.V()}));
        } else {
            consumer.accept((class00392)class00392.N((String)"item.minecraft.crossbow.projectile.multiple", (Object[])new Object[]{n, class065842.V()}));
        }
        class08562 class085622 = (class08562)class065842.a_(class02484.v, (Object)class08562.L);
        class065842.N(class065912, class085622, null, (class06497)class06497.N, class003922 -> consumer.accept((class00392)class00392.y((String)"  ").y(class003922).N(class06541.field_1080)));
    }

    private static /* synthetic */ List N(class02820 class028202) {
        return class028202.u;
    }

    public static class02820 N(List<class06584> list) {
        return new class02820(List.copyOf(Lists.transform(list, class06584::t)));
    }

    public List<class06584> N() {
        return Lists.transform(this.u, class06584::t);
    }

    public static class02820 N(class06584 class065842) {
        return new class02820(List.of(class065842.t()));
    }

    public boolean N(class06581 class065812) {
        Iterator<class06584> var2 = this.u.iterator();
        while (var2.hasNext()) {
            if (!var2.next().N(class065812)) continue;
            return true;
        }
        return false;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class06584 class065842 = null;
        int n = 0;
        for (class06584 class065843 : this.u) {
            if (class065842 == null) {
                class065842 = class065843;
                n = 1;
                continue;
            }
            if (class06584.N((class06584)class065842, (class06584)class065843)) {
                ++n;
                continue;
            }
            class02820.N(class065912, consumer, class065842, n);
            class065842 = class065843;
            n = 1;
        }
        if (class065842 != null) {
            class02820.N(class065912, consumer, class065842, n);
        }
    }
}

