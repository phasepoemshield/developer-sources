/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  minecraft.class02022
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class05911
 *  minecraft.class06584
 *  minecraft.class08517
 *  minecraft.class08808
 *  minecraft.class08898
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class02022;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class05911;
import minecraft.class06584;
import minecraft.class08517;
import minecraft.class08808;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08931;
import minecraft.class08943;
import minecraft.class08961;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class08908
implements class08910 {
    private final List<class02022> N;
    private final Supplier<Vector3fc[]> y;
    private final class08517 L;

    public class08908(List<class02022> list, class08517 class085172) {
        this.N = list;
        this.L = class085172;
        this.y = Suppliers.memoize(() -> class08808.N(this.N));
    }

    @Override
    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class088982.N((Object)this);
        class08931 class089312 = class088982.N();
        class089312.N(class05911.Z());
        this.L.N(class089312, class036622);
        class089312.N(this.y);
        class089312.y().addAll(this.N);
    }
}

