/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06289
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08934
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03448;
import minecraft.class06289;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08934;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

final class class08896
extends class08934 {
    class08896(String string, int n, String string2) {
        super(string, n, string2);
    }

    public @Nullable class06289 N(class03448 class034482, class06584 class065842, @Nullable class08961 class089612) {
        class07438 class074382 = class089612 == null ? null : class089612.method_72393();
        return class074382 instanceof class08036 ? (class06289)((class08036)class074382).method_43122().orElse(null) : null;
    }
}

