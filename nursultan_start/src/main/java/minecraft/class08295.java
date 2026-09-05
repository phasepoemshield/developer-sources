/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.google.common.collect.Streams
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class08308
 *  minecraft.class08319
 *  minecraft.class08324
 *  minecraft.class08325
 */
package minecraft;

import Nursultan.class10416;
import com.google.common.collect.Streams;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class08296;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08319;
import minecraft.class08324;
import minecraft.class08325;

class class08295
implements class08319 {
    private final class04490 y;
    private final String L;
    final class08296 N;
    private final class07741 u;

    class08295(class04490 class044902, String string, class08296 class082962, class07741 class077412) {
        this.y = class044902;
        this.L = string;
        this.N = class082962;
        this.u = class077412;
    }

    public Iterator<class08299> iterator() {
        Iterator var1 = this.u.iterator();
        return new class08325(this, var1);
    }

    public Stream<class08299> y() {
        return Streams.mapWithIndex((Stream)this.u.stream(), (class077092, l) -> {
            if (class077092 instanceof class07001) {
                class07001 class070012 = (class07001)class077092;
                return class08308.N((class04490)this.N((int)l), (class08296)this.N, (class07001)class070012);
            }
            this.N((int)l, (class07709)class077092);
            return null;
        }).filter(Objects::nonNull);
    }

    void N(int n, class07709 class077092) {
        this.y.N_47((class04480)new class08324(this.L, n, class07001.y, class077092.u()));
    }

    class04490 N(int n) {
        return this.y.N_46((class04489)new class10416(this.L, n));
    }

    public boolean N() {
        return this.u.isEmpty();
    }
}

