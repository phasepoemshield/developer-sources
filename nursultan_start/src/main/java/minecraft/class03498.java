/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01296
 *  minecraft.class03150
 *  minecraft.class03202
 *  minecraft.class03556
 *  minecraft.class04688
 *  minecraft.class05795
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class07299
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01296;
import minecraft.class03150;
import minecraft.class03202;
import minecraft.class03556;
import minecraft.class04688;
import minecraft.class05795;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class07299;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class03498
implements class07295,
RenderDataMapConsumer {
    public static final int N = 1;
    public static final int y = 3;
    private final int L;
    private final int u;
    private final int i;
    private final class03150[] R;
    private final class07299 M;
    private @Nullable Long2ObjectMap B;

    public int method_31607() {
        return this.M.method_31607();
    }

    public class00500 method_8320(class07209 class072092) {
        return this.N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10264()), class01296.N((int)class072092.method_10260())).y(class072092);
    }

    public class04688 method_8316(class07209 class072092) {
        return this.N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10264()), class01296.N((int)class072092.method_10260())).y(class072092).Y();
    }

    class03498(class07299 class072992, int n, int n2, int n3, class03150[] class03150Array) {
        this.M = class072992;
        this.L = n;
        this.u = n2;
        this.i = n3;
        this.R = class03150Array;
    }

    private class03150 N(int n, int n2, int n3) {
        return this.R[class03498.N(this.L, this.u, this.i, n, n2, n3)];
    }

    public static int N(int n, int n2, int n3, int n4, int n5, int n6) {
        return n4 - n + (n5 - n2) * 3 + (n6 - n3) * 3 * 3;
    }

    public Object getBlockEntityRenderData(class07209 class072092) {
        return this.B == null ? null : this.B.get(class072092.method_10063());
    }

    public boolean hasBiomes() {
        return true;
    }

    public float method_24852(class07211 class072112, boolean bl) {
        return this.M.method_24852(class072112, bl);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return this.N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10264()), class01296.N((int)class072092.method_10260())).N(class072092);
    }

    public class05795 method_22336() {
        return this.M.method_22336();
    }

    public int method_31605() {
        return this.M.method_31605();
    }

    public int method_23752(class07209 class072092, class03202 class032022) {
        return this.M.method_23752(class072092, class032022);
    }

    public class03556 getBiomeFabric(class07209 class072092) {
        return this.M.i(class072092);
    }

    public void fabric_acceptRenderDataMap(Long2ObjectMap long2ObjectMap) {
        this.B = long2ObjectMap;
    }
}

