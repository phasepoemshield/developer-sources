/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01226
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class06338
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06559
 *  minecraft.class06584
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01226;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class06338;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06559;
import minecraft.class06584;
import minecraft.class06591;

public final class class02816
extends Record
implements class02694 {
    private final int rgb;
    public static final Codec<class02816> N = class06338.E.xmap(class02816::new, class02816::N);
    public static final class02362<ByteBuf, class02816> y = class02362.N((class02362)class02389.M, class02816::N, class02816::new);
    public static final int L = -6265536;

    public class02816(int n) {
        this.rgb = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02816.class, "rgb", "rgb"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02816.class, "rgb", "rgb"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02816.class, "rgb", "rgb"}, this);
    }

    public static class06584 N(class06584 class065842, List<class06559> list) {
        int n;
        int n2;
        int n3;
        if (!class065842.N(class01226.Lz)) {
            return class06584.E;
        }
        class06584 class065843 = class065842.L(1);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        class02816 class028162 = (class02816)((Object)class065843.method_58694(class02484.F));
        if (class028162 != null) {
            int n9 = class02566.L((int)class028162.N());
            n3 = class02566.u((int)class028162.N());
            n2 = class02566.i((int)class028162.N());
            n7 += Math.max(n9, Math.max(n3, n2));
            n4 += n9;
            n5 += n3;
            n6 += n2;
            ++n8;
        }
        for (class06559 class065592 : list) {
            n2 = class065592.N().L();
            int n10 = class02566.L((int)n2);
            int n11 = class02566.u((int)n2);
            n = class02566.i((int)n2);
            n7 += Math.max(n10, Math.max(n11, n));
            n4 += n10;
            n5 += n11;
            n6 += n;
            ++n8;
        }
        int n12 = n4 / n8;
        n3 = n5 / n8;
        n2 = n6 / n8;
        float f = (float)n7 / (float)n8;
        float f2 = Math.max(n12, Math.max(n3, n2));
        n12 = (int)((float)n12 * f / f2);
        n3 = (int)((float)n3 * f / f2);
        n2 = (int)((float)n2 * f / f2);
        n = class02566.y((int)0, (int)n12, (int)n3, (int)n2);
        class065843.N(class02484.F, (Object)new class02816(n));
        return class065843;
    }

    public int N() {
        return this.rgb;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (class064972.N()) {
            consumer.accept((class00392)class00392.N((String)"item.color", (Object[])new Object[]{String.format(Locale.ROOT, "#%06X", this.rgb)}).N(class06541.field_1080));
        } else {
            consumer.accept((class00392)class00392.L((String)"item.dyed").N(new class06541[]{class06541.field_1080, class06541.field_1056}));
        }
    }

    public static int N(class06584 class065842, int n) {
        class02816 class028162 = (class02816)((Object)class065842.method_58694(class02484.F));
        return class028162 != null ? class02566.M((int)class028162.N()) : n;
    }
}

