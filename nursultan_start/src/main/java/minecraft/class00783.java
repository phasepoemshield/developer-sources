/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00558
 *  minecraft.class00561
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04688
 *  minecraft.class05474
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07322
 *  minecraft.class08050
 *  minecraft.class08057
 *  net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.world.ChunkView
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00558;
import minecraft.class00561;
import minecraft.class00734;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04688;
import minecraft.class05474;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07322;
import minecraft.class08050;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.world.ChunkView;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00783
implements class07290,
class07322,
ChunkView {
    protected final int N;
    protected final int y;
    protected final class08050[][] L;
    protected boolean u;
    protected final class07299 i;
    private final Supplier<class03556<class00780>> R;
    private static final class00500 M = class00869.N.W();
    private class08050[] B;
    private int Z;
    private int z;
    private int U;
    private int E;

    public int method_31607() {
        return this.i.method_31607();
    }

    public class00500 method_8320(class07209 class072092) {
        int n = class072092.method_10264();
        if (n >= this.U && n <= this.E) {
            class00554 class005542;
            class08050 class080502;
            int n2 = class072092.method_10263();
            int n3 = class072092.method_10260();
            int n4 = Pos.ChunkCoord.fromBlockCoord((int)n2) - this.N;
            int n5 = Pos.ChunkCoord.fromBlockCoord((int)n3) - this.y;
            if (n4 >= 0 && n4 < this.Z && n5 >= 0 && n5 < this.z && (class080502 = this.B[n4 * this.z + n5]) != null && (class005542 = class080502.u()[Pos.SectionYIndex.fromBlockCoord((class05474)this, (int)n)]) != null) {
                return class005542.N(n2 & 0xF, n & 0xF, n3 & 0xF);
            }
        }
        return M;
    }

    public List<class00494> method_20743(@Nullable class07049 class070492, class00734 class007342) {
        return List.of();
    }

    public class08057 method_8621() {
        return this.i.method_8621();
    }

    public class04688 method_8316(class07209 class072092) {
        return this.method_8320(class072092).Y();
    }

    public class00783(class07299 class072992, class07209 class072092, class07209 class072093) {
        int n;
        int n2;
        this.i = class072992;
        this.R = Suppliers.memoize(() -> class072992.method_30349().L(class04227.NA).y(class00795.y));
        this.N = class01296.N((int)class072092.method_10263());
        this.y = class01296.N((int)class072092.method_10260());
        int n3 = class01296.N((int)class072093.method_10263());
        int n4 = class01296.N((int)class072093.method_10260());
        this.L = new class08050[n3 - this.N + 1][n4 - this.y + 1];
        class00558 class005582 = class072992.method_8398();
        this.u = true;
        for (n2 = this.N; n2 <= n3; ++n2) {
            for (n = this.y; n <= n4; ++n) {
                this.L[n2 - this.N][n - this.y] = class005582.N(n2, n);
            }
        }
        for (n2 = class01296.N((int)class072092.method_10263()); n2 <= class01296.N((int)class072093.method_10263()); ++n2) {
            for (n = class01296.N((int)class072092.method_10260()); n <= class01296.N((int)class072093.method_10260()); ++n) {
                class08050 class080502 = this.L[n2 - this.N][n - this.y];
                if (class080502 == null || class080502.N(class072092.method_10264(), class072093.method_10264())) continue;
                this.u = false;
                this.N(class072992, class072092, class072093, null);
                return;
            }
        }
        this.N(class072992, class072092, class072093, null);
    }

    private void N(class07299 class072992, class07209 class072092, class07209 class072093, CallbackInfo callbackInfo) {
        this.Z = 1 + Pos.ChunkCoord.fromBlockCoord((int)class072093.method_10263()) - Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10263());
        this.z = 1 + Pos.ChunkCoord.fromBlockCoord((int)class072093.method_10260()) - Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10260());
        this.B = new class08050[this.Z * this.z];
        for (int i = 0; i < this.Z; ++i) {
            System.arraycopy(this.L[i], 0, this.B, i * this.z, this.z);
        }
        this.U = this.method_31607();
        this.E = this.method_31600();
    }

    private class08050 method_22338(int n, int n2) {
        int n3 = n - this.N;
        int n4 = n2 - this.y;
        if (n3 < 0 || n3 >= this.L.length || n4 < 0 || n4 >= this.L[n3].length) {
            return new class00561(this.i, new class07321(n, n2), this.R.get());
        }
        class08050 class080502 = this.L[n3][n4];
        return class080502 != null ? class080502 : new class00561(this.i, new class07321(n, n2), this.R.get());
    }

    private class08050 N(class07209 class072092) {
        return this.method_22338(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
    }

    public class08050 lithium$getLoadedChunk(int n, int n2) {
        return this.method_22338(n, n2);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return this.N(class072092).method_8321(class072092);
    }

    public int method_31605() {
        return this.i.method_31605();
    }
}

