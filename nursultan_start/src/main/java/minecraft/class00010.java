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
 *  minecraft.class00945
 *  minecraft.class04995
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
import minecraft.class00945;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07299;

class class00010
extends class00037 {
    private float u;

    public class00010(UUID uUID, class00028 class000282, float f) {
        super(Either.left((Object)uUID), class000282, class00025.field_59781);
        this.u = f;
    }

    public class00010(Either<UUID, String> either, class00028 class000282, class00667 class006672) {
        super(either, class000282, class00025.field_59781);
        this.u = class006672.readFloat();
    }

    public void y(ByteBuf byteBuf) {
        byteBuf.writeFloat(this.u);
    }

    public double N(class07049 class070492) {
        return Double.POSITIVE_INFINITY;
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
        return class04995.u((float)class000232.N(), (float)(this.u * 57.295776f));
    }

    public void N(class00037 class000372) {
        if (class000372 instanceof class00010) {
            class00010 class000102 = (class00010)class000372;
            this.u = class000102.u;
        } else {
            class00037.N.warn("Unsupported Waypoint update operation: {}", class000372.getClass());
        }
    }
}

