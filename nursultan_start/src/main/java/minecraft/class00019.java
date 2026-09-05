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
 *  minecraft.class07321
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
import minecraft.class07321;

class class00019
extends class00037 {
    private class07321 u;

    public class00019(UUID uUID, class00028 class000282, class07321 class073212) {
        super(Either.left((Object)uUID), class000282, class00025.field_59780);
        this.u = class073212;
    }

    public class00019(Either<UUID, String> either, class00028 class000282, class00667 class006672) {
        super(either, class000282, class00025.field_59780);
        this.u = new class07321(class006672.E(), class006672.E());
    }

    public void y(ByteBuf byteBuf) {
        class01657.N((ByteBuf)byteBuf, (int)this.u.B);
        class01657.N((ByteBuf)byteBuf, (int)this.u.Z);
    }

    public double N(class07049 class070492) {
        return class070492.method_5707(class06889.y((class00753)this.u.L(class070492.method_31478())));
    }

    public class00036 N(class07299 class072992, class00007 class000072, class00945 class009452) {
        double d = class000072.N();
        if (d < -1.0) {
            return class00036.field_60425;
        }
        if (d > 1.0) {
            return class00036.field_60424;
        }
        return class00036.field_60423;
    }

    public double N(class07299 class072992, class00023 class000232, class00945 class009452) {
        class06889 class068892 = class000232.y();
        class06889 class068893 = class068892.u(this.N(class068892.y())).U();
        float f = (float)class04995.u((double)class068893.L(), (double)class068893.N()) * 57.295776f;
        return class04995.u((float)class000232.N(), (float)f);
    }

    private class06889 N(double d) {
        return class06889.y((class00753)this.u.L((int)d));
    }

    public void N(class00037 class000372) {
        if (class000372 instanceof class00019) {
            class00019 class000192 = (class00019)class000372;
            this.u = class000192.u;
        } else {
            class00037.N.warn("Unsupported Waypoint update operation: {}", class000372.getClass());
        }
    }
}

