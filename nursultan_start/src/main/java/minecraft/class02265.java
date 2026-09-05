/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class02705
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07769
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02705;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07769;

public final class class02265
extends Record
implements class02694 {
    private final int id;
    public static final Codec<class02265> N = Codec.INT.xmap(class02265::new, class02265::y);
    public static final class02362<ByteBuf, class02265> y = class02389.B.N_10(class02265::new, class02265::y);
    private static final class00392 u = class00392.L((String)"filled_map.locked").N(class06541.field_1080);

    public class02265(int n) {
        this.id = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02265.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02265.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02265.class, "id", "id"}, this);
    }

    public int y() {
        return this.id;
    }

    public String N() {
        return "map_" + this.id;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class07769 class077692 = class065912.N(this);
        if (class077692 == null) {
            consumer.accept((class00392)class00392.L((String)"filled_map.unknown").N(class06541.field_1080));
            return;
        }
        class02705 class027052 = (class02705)class026662.method_58694(class02484.S);
        if (class026662.method_58694(class02484.B) == null && class027052 == null) {
            consumer.accept((class00392)class00392.N((String)"filled_map.id", (Object[])new Object[]{this.id}).N(class06541.field_1080));
        }
        if (class077692.Z || class027052 == class02705.field_49353) {
            consumer.accept(u);
        }
        if (class064972.N()) {
            byte by = class027052 == class02705.field_49354 ? (byte)1 : 0;
            int n = Math.min(class077692.M + by, 4);
            consumer.accept((class00392)class00392.N((String)"filled_map.scale", (Object[])new Object[]{1 << n}).N(class06541.field_1080));
            consumer.accept((class00392)class00392.N((String)"filled_map.level", (Object[])new Object[]{n, 4}).N(class06541.field_1080));
        }
    }
}

