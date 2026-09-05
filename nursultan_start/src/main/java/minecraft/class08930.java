/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  minecraft.class00368
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class08517
 *  minecraft.class08898
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import java.util.HashSet;
import java.util.function.Supplier;
import minecraft.class00368;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class08517;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08915;
import minecraft.class08931;
import minecraft.class08943;
import minecraft.class08961;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class08930<T>
implements class08910 {
    private final class00368<T> N;
    private final class08517 y;
    private final Supplier<Vector3fc[]> L;

    public class08930(class00368<T> class003682, class08517 class085172) {
        this.N = class003682;
        this.y = class085172;
        this.L = Suppliers.memoize(() -> {
            HashSet hashSet = new HashSet();
            class003682.N(hashSet::add);
            return hashSet.toArray(new Vector3fc[0]);
        });
    }

    @Override
    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        Object object;
        class088982.N((Object)this);
        class08931 class089312 = class088982.N();
        if (class065842.Q()) {
            object = class08915.field_55342;
            class089312.N((class08915)((Object)object));
            class088982.L();
            class088982.N(object);
        }
        object = this.N.y(class065842);
        class089312.N(this.L);
        class089312.N(this.N, object);
        if (object != null) {
            class088982.N(object);
        }
        this.y.N(class089312, class036622);
    }
}

