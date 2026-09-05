/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00429
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class04782
 *  minecraft.class06884
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08075
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class00429;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class02759;
import minecraft.class02761;
import minecraft.class04782;
import minecraft.class06884;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08075;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class02732
extends class02761 {
    private final Deque<class07209> y = new ArrayDeque<class07209>();
    private final Deque<class07209> L = new ArrayDeque<class07209>();
    private final Object2IntMap<class07209> u = new Object2IntLinkedOpenHashMap();

    public class02732(class06884 class068842) {
        super(class068842);
    }

    private void y(class07299 class072992, class07209 class072092, int n, class02733 class027332, boolean bl) {
        class00500 class005002 = class072992.method_8320(class072092);
        if (class005002.N((class00891)this.N)) {
            int n2 = this.N(class072092, class005002);
            if (n2 < n - 1 && !this.L.contains(class072092)) {
                this.L.add(class072092);
                this.N(class072092, n2, class027332);
            }
            if (bl && n2 > n && !this.y.contains(class072092)) {
                this.y.add(class072092);
                this.N(class072092, n2, class027332);
            }
        }
    }

    private static int y(int n) {
        return n & 0xF;
    }

    @Override
    public int N(class07209 class072092, class00500 class005002) {
        int n = this.u.getOrDefault((Object)class072092, -1);
        if (n != -1) {
            return class02732.y(n);
        }
        return super.N(class072092, class005002);
    }

    @Override
    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class02733 class027332, boolean bl) {
        class02733 class027333 = class02732.N(class072992, class027332);
        this.N(class072992, class072092, class027333);
        ObjectIterator var7 = this.u.object2IntEntrySet().iterator();
        boolean bl2 = true;
        while (var7.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)var7.next();
            class07209 class072093 = (class07209)entry.getKey();
            int n = class02732.y(entry.getIntValue());
            class00500 class005003 = class072992.method_8320(class072093);
            if (class005003.N((class00891)this.N) && !((Integer)class005003.L((class08092)class06884.R)).equals(n)) {
                int n2 = 2;
                if (!bl || !bl2) {
                    n2 |= 0x80;
                }
                class072992.method_8652(class072093, (class00500)class005003.y((class08092)class06884.R, (Comparable)Integer.valueOf(n)), n2);
            } else {
                var7.remove();
            }
            bl2 = false;
        }
        this.N(class072992);
    }

    private void N(class07299 class072992, class07209 class072092, int n, class02733 class027332, boolean bl) {
        class07209 class072093;
        for (class07211 class072112 : class027332.M()) {
            class072093 = class072092.method_10093(class072112);
            this.y(class072992, class072093, n, class027332.y(class072112), bl);
        }
        for (class07211 class072112 : class027332.B()) {
            class072093 = class072092.method_10093(class072112);
            boolean bl2 = class072992.method_8320(class072093).u((class07290)class072992, class072093);
            for (class07211 class072113 : class027332.M()) {
                class07209 class072094;
                class07209 class072095 = class072092.method_10093(class072113);
                if (class072112 == class07211.field_11036 && !bl2) {
                    class072094 = class072093.method_10093(class072113);
                    this.y(class072992, class072094, n, class027332.y(class072113), bl);
                    continue;
                }
                if (class072112 != class07211.field_11033 || class072992.method_8320(class072095).u((class07290)class072992, class072095)) continue;
                class072094 = class072093.method_10093(class072113);
                this.y(class072992, class072094, n, class027332.y(class072113), bl);
            }
        }
    }

    private void N(class07209 class072093, int n, class02733 class027332) {
        this.u.compute((Object)class072093, (class072092, n2) -> {
            if (n2 == null) {
                return class02732.N(class027332, n);
            }
            return class02732.N(class02732.N(n2), n);
        });
    }

    private static boolean N(class00500 class005002, class07211 class072112) {
        class08064 var2 = (class08064)class06884.M.get(class072112);
        if (var2 == null) {
            return class072112 == class07211.field_11033;
        }
        return ((class08075)class005002.L((class08092)var2)).N();
    }

    private static class02733 N(class07299 class072992, @Nullable class02733 class027332) {
        class02733 class027333 = class027332 != null ? class027332 : class02733.N(class072992.field_9229);
        return class027333.N(class07211.field_11036).N(class02759.field_52681);
    }

    private void N(class07299 class072992, class07209 class072092, class02733 class027332) {
        int n;
        int n2;
        int n3;
        int n4;
        class07209 class072093;
        class00500 class005002 = class072992.method_8320(class072092);
        if (class005002.N((class00891)this.N)) {
            this.N(class072092, (Integer)class005002.L((class08092)class06884.R), class027332);
            this.y.add(class072092);
        } else {
            this.N(class072992, class072092, 0, class027332, true);
        }
        while (!this.y.isEmpty()) {
            int n5;
            class072093 = this.y.removeFirst();
            n4 = this.u.getInt((Object)class072093);
            class02733 class027333 = class02732.N(n4);
            n3 = class02732.y(n4);
            n2 = this.N(class072992, class072093);
            int n6 = Math.max(n2, n = this.y(class072992, class072093));
            if (n6 < n3) {
                if (n2 > 0 && !this.L.contains(class072093)) {
                    this.L.add(class072093);
                }
                n5 = 0;
            } else {
                n5 = n6;
            }
            if (n5 != n3) {
                this.N(class072093, n5, class027333);
            }
            this.N(class072992, class072093, n5, class027333, n3 > n6);
        }
        while (!this.L.isEmpty()) {
            class072093 = this.L.removeFirst();
            n4 = this.u.getInt((Object)class072093);
            int n7 = class02732.y(n4);
            n3 = this.N(class072992, class072093);
            n2 = this.y(class072992, class072093);
            n = Math.max(n3, n2);
            class02733 class027334 = class02732.N(n4);
            if (n > n7) {
                this.N(class072093, n, class027334);
            } else if (n < n7) {
                throw new IllegalStateException("Turning off wire while trying to turn it on. Should not happen.");
            }
            this.N(class072992, class072093, n, class027334, false);
        }
    }

    private static int N(class02733 class027332, int n) {
        return class027332.Z() << 4 | n;
    }

    private static class02733 N(int n) {
        return class02733.N(n >> 4);
    }

    private void N(class07299 class072992) {
        class04782 class047822;
        this.u.forEach((class072092, n) -> {
            class02733 class027332 = class02732.N(n);
            class00500 class005002 = class072992.method_8320(class072092);
            for (class07211 class072112 : class027332.R()) {
                if (!class02732.N(class005002, class072112)) continue;
                class07209 class072093 = class072092.method_10093(class072112);
                class00500 class005003 = class072992.method_8320(class072093);
                class02733 class027333 = class027332.L(class072112);
                class072992.method_41410(class005003, class072093, (class00891)this.N, class027333, false);
                if (!class005003.u((class07290)class072992, class072093)) continue;
                for (class07211 class072113 : class027333.R()) {
                    if (class072113 == class072112.b()) continue;
                    class072992.method_8492(class072093.method_10093(class072113), (class00891)this.N, class027333.L(class072113));
                }
            }
        });
        if (class072992 instanceof class04782 && (class047822 = (class04782)class072992).method_74535().y(class00429.z)) {
            this.u.forEach((class072092, n) -> class047822.method_74535().N(class072092, class00429.z, (Object)class02732.N(n)));
        }
    }
}

