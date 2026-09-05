/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  minecraft.class00394
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00667
 *  minecraft.class01296
 *  minecraft.class01806
 *  minecraft.class01810
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07830
 *  minecraft.class07841
 */
package minecraft;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class00394;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class01296;
import minecraft.class01806;
import minecraft.class01810;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07830;
import minecraft.class07841;

public class class01839 {
    private static final class02362<ByteBuf, Map<class07830, long[]>> N = class02389.N(n -> new EnumMap(class07830.class), (class02362)class07830.field_56679, (class02362)class02389.P);
    private static final int y = 0x200000;
    private final Map<class07830, long[]> L;
    private final byte[] u;
    private final List<class01810> i;

    private ByteBuf L() {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])this.u);
        byteBuf.writerIndex(0);
        return byteBuf;
    }

    public class01839(class00570 class005702) {
        this.L = class005702.i().stream().filter(entry -> ((class07830)entry.getKey()).y()).collect(Collectors.toMap(Map.Entry::getKey, entry -> (long[])((class07841)entry.getValue()).N().clone()));
        this.u = new byte[class01839.N(class005702)];
        class01839.N(new class00667(this.L()), class005702);
        this.i = Lists.newArrayList();
        for (Map.Entry entry2 : class005702.o().entrySet()) {
            this.i.add(class01810.N((class00394)((class00394)entry2.getValue())));
        }
    }

    public class01839(class04247 class042472, int n, int n2) {
        this.L = (Map)N.decode((Object)class042472);
        int n3 = class042472.E();
        if (n3 > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.u = new byte[n3];
        class042472.readBytes(this.u);
        this.i = (List)class01810.y.decode((Object)class042472);
    }

    public Map<class07830, long[]> y() {
        return this.L;
    }

    private void N(class01806 class018062, int n, int n2) {
        int n3 = 16 * n;
        int n4 = 16 * n2;
        class07218 class072182 = new class07218();
        for (class01810 class018102 : this.i) {
            int n5 = n3 + class01296.y((int)(class018102.L >> 4));
            int n6 = n4 + class01296.y((int)class018102.L);
            class072182.N(n5, class018102.u, n6);
            class018062.accept((class07209)class072182, class018102.i, class018102.R);
        }
    }

    public static void N(class00667 class006672, class00570 class005702) {
        class00554[] class00554Array = class005702.u();
        int n = class00554Array.length;
        for (int i = 0; i < n; ++i) {
            class00554Array[i].L(class006672);
        }
        if (class006672.writerIndex() != class006672.capacity()) {
            throw new IllegalStateException("Didn't fill chunk buffer: expected " + class006672.capacity() + " bytes, got " + class006672.writerIndex());
        }
    }

    public Consumer<class01806> N(int n, int n2) {
        return class018062 -> this.N((class01806)class018062, n, n2);
    }

    public void N(class04247 class042472) {
        N.encode((Object)class042472, this.L);
        class042472.L(this.u.length);
        class042472.writeBytes(this.u);
        class01810.y.encode((Object)class042472, this.i);
    }

    public class00667 N() {
        return new class00667(Unpooled.wrappedBuffer((byte[])this.u));
    }

    private static int N(class00570 class005702) {
        int n = 0;
        for (class00554 class005542 : class005702.u()) {
            n += class005542.z();
        }
        return n;
    }
}

