/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07755
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07755;

public final class class02837 {
    public static final class02837 N = new class02837(new class07001());
    public static final Codec<class07001> y = Codec.withAlternative((Codec)class07001.N, (Codec)class07755.i);
    public static final Codec<class02837> L = y.xmap(class02837::new, class028372 -> class028372.i);
    @Deprecated
    public static final class02362<ByteBuf, class02837> u = class02389.j.N_10(class02837::new, class028372 -> class028372.i);
    private final class07001 i;

    private class02837(class07001 class070012) {
        this.i = class070012;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof class02837) {
            class02837 class028372 = (class02837)object;
            return this.i.equals((Object)class028372.i);
        }
        return false;
    }

    public String toString() {
        return this.i.toString();
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public boolean y(class07001 class070012) {
        return class07717.N((class07709)class070012, (class07709)this.i, (boolean)true);
    }

    private static /* synthetic */ class07001 y(class02837 class028372) {
        return class028372.i;
    }

    public class07001 y() {
        return this.i.N();
    }

    public static void N(class02477<class02837> class024772, class06584 class065842, Consumer<class07001> consumer) {
        class02837 class028372 = ((class02837)class065842.a_(class024772, (Object)N)).N(consumer);
        if (class028372.i.z()) {
            class065842.y(class024772);
        } else {
            class065842.N(class024772, (Object)class028372);
        }
    }

    public static void N(class02477<class02837> class024772, class06584 class065842, class07001 class070012) {
        if (!class070012.z()) {
            class065842.N(class024772, (Object)class02837.N(class070012));
        } else {
            class065842.y(class024772);
        }
    }

    private static /* synthetic */ class07001 N(class02837 class028372) {
        return class028372.i;
    }

    public class02837 N(Consumer<class07001> consumer) {
        class07001 class070012 = this.i.N();
        consumer.accept(class070012);
        return new class02837(class070012);
    }

    public boolean N() {
        return this.i.z();
    }

    public static class02837 N(class07001 class070012) {
        return new class02837(class070012.N());
    }
}

