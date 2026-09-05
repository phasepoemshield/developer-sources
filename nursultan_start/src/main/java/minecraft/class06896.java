/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10682
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03710
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07126
 *  minecraft.class07138
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10682;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03710;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06896
extends class03710 {
    public static final MapCodec<class06896> u = class06896.y(class06896::new);
    public static final class06667 i = class06665.n;
    private static final Map<class07290, List<class10682>> N = new WeakHashMap<class07290, List<class10682>>();
    public static final int R = 60;
    public static final int M = 8;
    public static final int B = 160;
    private static final int y = 2;

    public class06896(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)i, (Comparable)Boolean.valueOf(true)));
    }

    private void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class02733 class027332 = this.N(class072992, class005002);
        for (class07211 class072112 : class07211.values()) {
            class072992.method_8452(class072092.method_10093(class072112), (class00891)this, class02752.N((class02733)class027332, (class07211)class072112));
        }
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11033) {
            return class005002.N(class072902, class072092, class072112);
        }
        return 0;
    }

    protected @Nullable class02733 N(class07299 class072992, class00500 class005002) {
        return class02752.N((class07299)class072992, null, (class07211)class07211.field_11036);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return;
        }
        double d = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 0.2;
        double d2 = (double)class072092.method_10264() + 0.7 + (class060692.U() - 0.5) * 0.2;
        double d3 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 0.2;
        class072992.method_8406((class07126)class07138.y, d, d2, d3, 0.0, 0.0, 0.0);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{i});
    }

    private static boolean N(class07299 class072992, class07209 class072092, boolean bl) {
        List var3 = N.computeIfAbsent((class07290)class072992, class072902 -> Lists.newArrayList());
        if (bl) {
            var3.add(new class10682(class072092.method_10062(), class072992.N()));
        }
        int n = 0;
        Iterator var5 = var3.iterator();
        while (var5.hasNext()) {
            if (!((class10682)var5.next()).N.equals((Object)class072092) || ++n < 8) continue;
            return true;
        }
        return false;
    }

    public MapCodec<? extends class06896> N() {
        return u;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl) {
            this.y((class07299)class047822, class072092, class005002);
        }
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue() && class07211.field_11036 != class072112) {
            return 15;
        }
        return 0;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        this.y(class072992, class072092, class005002);
    }

    protected boolean N(class07299 class072992, class07209 class072092, class00500 class005002) {
        return class072992.L(class072092.method_10074(), class07211.field_11033);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue() == this.N(class072992, class072092, class005002) && !class072992.method_8397().y(class072092, (Object)this)) {
            class072992.N(class072092, (class00891)this, 2);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        boolean bl = this.N((class07299)class047822, class072092, class005002);
        List<class10682> var6 = N.get(class047822);
        while (var6 != null && !var6.isEmpty() && class047822.N() - var6.get((int)0).y > 60L) {
            var6.remove(0);
        }
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            if (bl) {
                class047822.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(false)), 3);
                if (class06896.N((class07299)class047822, class072092, true)) {
                    class047822.N(1502, class072092, 0);
                    class047822.N(class072092, class047822.method_8320(class072092).i(), 160);
                }
            }
        } else if (!bl && !class06896.N((class07299)class047822, class072092, false)) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(true)), 3);
        }
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

