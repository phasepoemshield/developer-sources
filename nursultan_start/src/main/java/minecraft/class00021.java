/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00025
 *  minecraft.class00028
 *  minecraft.class00036
 *  minecraft.class00037
 *  minecraft.class00667
 *  minecraft.class00753
 *  minecraft.class00945
 *  minecraft.class01657
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00007;
import minecraft.class00023;
import minecraft.class00025;
import minecraft.class00028;
import minecraft.class00036;
import minecraft.class00037;
import minecraft.class00667;
import minecraft.class00753;
import minecraft.class00945;
import minecraft.class01657;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;

class class00021
extends class00037 {
    private class00753 u;

    public class00021(UUID uUID, class00028 class000282, class00753 class007532) {
        super(Either.left((Object)uUID), class000282, class00025.field_59779);
        this.u = class007532;
    }

    public class00021(Either<UUID, String> either, class00028 class000282, class00667 class006672) {
        super(either, class000282, class00025.field_59779);
        this.u = new class00753(class006672.E(), class006672.E(), class006672.E());
    }

    public void y(ByteBuf byteBuf) {
        class01657.N((ByteBuf)byteBuf, (int)this.u.method_10263());
        class01657.N((ByteBuf)byteBuf, (int)this.u.method_10264());
        class01657.N((ByteBuf)byteBuf, (int)this.u.method_10260());
    }

    public double N(class07049 class070492) {
        return class070492.method_5707(class06889.y((class00753)this.u));
    }

    public class00036 N(class07299 class072992, class00007 class000072, class00945 class009452) {
        double d;
        class06889 class068892 = class000072.N(this.N(class072992, class009452));
        boolean bl = class068892.Z > 1.0;
        double d2 = d = bl ? -class068892.B : class068892.B;
        if (d < -1.0) {
            return class00036.field_60425;
        }
        if (d > 1.0) {
            return class00036.field_60424;
        }
        if (bl) {
            if (class068892.B > 0.0) {
                return class00036.field_60424;
            }
            if (class068892.B < 0.0) {
                return class00036.field_60425;
            }
        }
        return class00036.field_60423;
    }

    public double N(class07299 class072992, class00023 class000232, class00945 class009452) {
        class06889 class068892 = class000232.y().u(this.N(class072992, class009452)).U();
        float f = (float)class04995.u((double)class068892.L(), (double)class068892.N()) * 57.295776f;
        return class04995.u((float)class000232.N(), (float)f);
    }

    private class06889 N(class07299 class072992, class00945 class009452) {
        return this.L.left().map(arg_0 -> ((class07299)class072992).method_66347(arg_0)).map(class070492 -> {
            if (class070492.method_24515().method_19455(this.u) > 3) {
                return null;
            }
            return class070492.method_5836(class009452.apply(class070492));
        }).orElseGet(() -> class06889.y((class00753)this.u));
    }

    public void N(class00037 class000372) {
        if (class000372 instanceof class00021) {
            class00021 class000212 = (class00021)class000372;
            this.u = class000212.u;
        } else {
            class00037.N.warn("Unsupported Waypoint update operation: {}", class000372.getClass());
        }
    }
}

