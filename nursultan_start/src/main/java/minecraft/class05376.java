/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class02149
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import minecraft.class02149;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07438;

public class class05376
extends class02149 {
    private static final ImmutableMap<class07078<?>, Float> N = ImmutableMap.builder().put((Object)class07078.X, (Object)Float.valueOf(8.0f)).put((Object)class07078.x, (Object)Float.valueOf(12.0f)).put((Object)class07078.Nb, (Object)Float.valueOf(8.0f)).put((Object)class07078.Nj, (Object)Float.valueOf(12.0f)).put((Object)class07078.yy, (Object)Float.valueOf(15.0f)).put((Object)class07078.yB, (Object)Float.valueOf(12.0f)).put((Object)class07078.yV, (Object)Float.valueOf(8.0f)).put((Object)class07078.yH, (Object)Float.valueOf(10.0f)).put((Object)class07078.yS, (Object)Float.valueOf(10.0f)).put((Object)class07078.yx, (Object)Float.valueOf(8.0f)).put((Object)class07078.yr, (Object)Float.valueOf(8.0f)).build();

    protected boolean u(class04782 class047822, class07438 class074382, class07438 class074383) {
        return this.y(class074383) && this.N(class074382, class074383);
    }

    protected class05378<class07438> y() {
        return class05378.Y;
    }

    private boolean y(class07438 class074382) {
        return N.containsKey((Object)class074382.method_5864());
    }

    private boolean N(class07438 class074382, class07438 class074383) {
        float f = ((Float)N.get((Object)class074383.method_5864())).floatValue();
        return class074383.method_5858((class07049)class074382) <= (double)(f * f);
    }
}

