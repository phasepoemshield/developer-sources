/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06901
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07536
 *  minecraft.class08092
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06901;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07536;
import minecraft.class08092;
import minecraft.class08791;

public abstract class class06788
extends class00891
implements class06084,
ICrossCollisionBlock {
    public static final class06667 y = class06901.y;
    public static final class06667 L = class06901.L;
    public static final class06667 u = class06901.u;
    public static final class06667 i = class06901.i;
    public static final class06667 R = class06665.q;
    public static final Map<class07211, class06667> M = (Map)class06901.B.entrySet().stream().filter(entry -> ((class07211)entry.getKey()).z().L()).collect(class07536.N());
    private final Function<class00500, class00494> N;
    private final Function<class00500, class00494> B;
    private final Object2IntMap Z = new Object2IntOpenHashMap();

    public class06788(float f, float f2, float f3, float f4, float f5, class01362 class013622) {
        super(class013622);
        this.N = this.N(f, f5, f3, 0.0f, f5);
        this.B = this.N(f, f2, f3, 0.0f, f4);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected boolean y(class00500 class005002) {
        return (Boolean)class005002.L((class08092)R) == false;
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.N.apply(class005002);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        switch (class071112) {
            case field_11300: {
                return (class00500)((class00500)class005002.y((class08092)y, (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)y)));
            }
            case field_11301: {
                return (class00500)((class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)L)));
            }
        }
        return super.N(class005002, class071112);
    }

    protected abstract MapCodec<? extends class06788> N();

    protected Function<class00500, class00494> N(float f, float f2, float f3, float f4, float f5) {
        class00494 class004942 = class00891.y((double)f, (double)0.0, (double)f2);
        Map var7 = class00389.L((class00494)class00891.N((double)f3, (double)f4, (double)f5, (double)0.0, (double)8.0));
        return this.N((T class005002) -> {
            class00494 class004943 = class004942;
            for (Map.Entry<class07211, class06667> entry : M.entrySet()) {
                if (!((Boolean)class005002.L((class08092)entry.getValue())).booleanValue()) continue;
                class004943 = class00389.N((class00494)class004943, (class00494)((class00494)var7.get(entry.getKey())));
            }
            return class004943;
        }, new class08092[]{R});
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.B.apply(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11464: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)y, (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)y)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)L)));
            }
            case field_11465: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)y, (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)y)));
            }
            case field_11463: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)y, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)y)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)u)));
            }
        }
        return class005002;
    }

    public int viaFabricPlus$getShapeIndex(class00500 class005002) {
        return this.Z.computeIfAbsent((Object)class005002, object -> {
            int n = 0;
            if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
                n |= 1 << class07211.field_11043.u();
            }
            if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
                n |= 1 << class07211.field_11034.u();
            }
            if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
                n |= 1 << class07211.field_11035.u();
            }
            if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
                n |= 1 << class07211.field_11039.u();
            }
            return n;
        });
    }
}

