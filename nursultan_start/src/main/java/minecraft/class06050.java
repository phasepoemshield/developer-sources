/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00869
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00869;

public class class06050 {
    public static final class06050 N = new class06050(false, class00869.Bs.W(), class00869.Te.W(), class00869.iX.W(), class00869.ND.W());
    public static final Codec<class06050> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("debug_mode", (Object)false).forGetter(class06050::N), (App)class00500.N.optionalFieldOf("air_state", (Object)N.y()).forGetter(class06050::y), (App)class00500.N.optionalFieldOf("water_state", (Object)N.y()).forGetter(class06050::L), (App)class00500.N.optionalFieldOf("lava_state", (Object)N.y()).forGetter(class06050::u), (App)class00500.N.optionalFieldOf("barrier_state", (Object)N.y()).forGetter(class06050::i)).apply(instance, class06050::new));
    private final boolean L;
    private final class00500 u;
    private final class00500 i;
    private final class00500 R;
    private final class00500 M;

    public class00500 L() {
        return this.i;
    }

    private class06050(boolean bl, class00500 class005002, class00500 class005003, class00500 class005004, class00500 class005005) {
        this.L = bl;
        this.u = class005002;
        this.i = class005003;
        this.R = class005004;
        this.M = class005005;
    }

    public class00500 i() {
        return this.M;
    }

    public class00500 u() {
        return this.R;
    }

    public class00500 y() {
        return this.u;
    }

    public static class06050 N(boolean bl, class00500 class005002, class00500 class005003, class00500 class005004, class00500 class005005) {
        return new class06050(bl, class005002, class005003, class005004, class005005);
    }

    public static class06050 N(class00500 class005002, class00500 class005003, class00500 class005004, class00500 class005005) {
        return new class06050(false, class005002, class005003, class005004, class005005);
    }

    public static class06050 N(boolean bl, class00500 class005002) {
        return new class06050(bl, class005002, N.L(), N.u(), N.i());
    }

    public boolean N() {
        return this.L;
    }
}

