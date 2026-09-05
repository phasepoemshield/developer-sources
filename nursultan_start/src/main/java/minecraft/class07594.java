/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00585
 *  minecraft.class00587
 *  minecraft.class00589
 *  minecraft.class00594
 *  minecraft.class00599
 *  minecraft.class00601
 *  minecraft.class00607
 *  minecraft.class00608
 *  minecraft.class00614
 *  minecraft.class00619
 *  minecraft.class02566
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import minecraft.class00585;
import minecraft.class00587;
import minecraft.class00589;
import minecraft.class00594;
import minecraft.class00599;
import minecraft.class00601;
import minecraft.class00607;
import minecraft.class00608;
import minecraft.class00614;
import minecraft.class00619;
import minecraft.class02566;
import minecraft.class07593;
import minecraft.class07609;

public class class07594 {
    public static final class00587 N = class00587.N().N(class00608.Z, (class00619)class00589.z, (Object)new class00614(0.6f, 0.75f)).N(class00608.N, (class00619)class00589.B, (Object)class02566.N((float)1.0f, (float)0.5f, (float)0.5f, (float)0.6f)).N(class00608.U, (class00619)class00589.z, (Object)new class00614(0.24f, 0.5f)).N(class00608.w, (class00619)class00585.i, (Object)new class00601(4.0f, 0.3125f)).N(class00608.b, (class00619)class00589.i, (Object)class02566.N((float)0.3125f, (int)class07593.M)).N(class00608.j, (class00619)class00585.i, (Object)new class00601(0.24f, 0.3125f)).N(class00608.T, (Object)Float.valueOf(0.0f)).N(class00608.z, (class00619)class00589.Z, (Object)class02566.N((float)1.0f, (float)0.5f, (float)0.5f, (float)0.6f)).N(class00608.X, (Object)true).N();
    public static final class00587 y = class00587.N().N(class00608.Z, (class00619)class00589.z, (Object)new class00614(0.24f, 0.94f)).N(class00608.N, (class00619)class00589.B, (Object)class02566.N((float)1.0f, (float)0.25f, (float)0.25f, (float)0.3f)).N(class00608.U, (class00619)class00589.z, (Object)new class00614(0.095f, 0.94f)).N(class00608.w, (class00619)class00585.i, (Object)new class00601(4.0f, 0.52734375f)).N(class00608.b, (class00619)class00589.i, (Object)class02566.N((float)0.52734375f, (int)class07593.M)).N(class00608.j, (class00619)class00585.i, (Object)new class00601(0.24f, 0.52734375f)).N(class00608.T, (Object)Float.valueOf(0.0f)).N(class00608.z, (class00619)class00589.Z, (Object)class02566.N((float)1.0f, (float)0.25f, (float)0.25f, (float)0.3f)).N(class00608.X, (Object)true).N();
    private static final Set<class00607<?>> L = Sets.union((Set)N.y(), (Set)y.y());

    public static void N(class00594 class005942, class07609 class076092) {
        for (class00607<?> var3 : L) {
            class07594.N(class005942, class076092, var3);
        }
    }

    private static <Value> void N(class00594 class005942, class07609 class076092, class00607<Value> class006072) {
        class00599 class005992 = N.N(class006072);
        class00599 class005993 = y.N(class006072);
        class005942.N(class006072, (Value object, int n) -> {
            Object object2;
            float f = class076092.y();
            float f2 = class076092.N() - f;
            if (class005992 != null && f2 > 0.0f) {
                object2 = class005992.N(object);
                object = class006072.N().i().apply(f2, object, object2);
            }
            if (class005993 != null && f > 0.0f) {
                object2 = class005993.N(object);
                object = class006072.N().i().apply(f, object, object2);
            }
            return object;
        });
    }
}

