/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class08289
 *  minecraft.class08303
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.DynamicOps;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class08289;
import minecraft.class08303;
import minecraft.class08329;

class class08328
implements class08289 {
    private final String N;
    private final class04490 y;
    private final DynamicOps<class07709> L;
    private final class07741 u;

    public boolean L() {
        return this.u.isEmpty();
    }

    class08328(String string, class04490 class044902, DynamicOps<class07709> dynamicOps, class07741 class077412) {
        this.N = string;
        this.y = class044902;
        this.L = dynamicOps;
        this.u = class077412;
    }

    public void y() {
        this.u.removeLast();
    }

    public class08329 N() {
        int n = this.u.size();
        class07001 class070012 = new class07001();
        this.u.add((Object)class070012);
        return new class08303(this.y.N_46((class04489)new class10416(this.N, n)), this.L, class070012);
    }
}

