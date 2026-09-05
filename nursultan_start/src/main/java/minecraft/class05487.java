/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00611
 *  minecraft.class00734
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01146
 *  minecraft.class01231
 *  minecraft.class01296
 *  minecraft.class01905
 *  minecraft.class03202
 *  minecraft.class03556
 *  minecraft.class03589
 *  minecraft.class03767
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07322
 *  minecraft.class07376
 *  minecraft.class07830
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.world.ChunkView
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00611;
import minecraft.class00734;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01146;
import minecraft.class01231;
import minecraft.class01296;
import minecraft.class01905;
import minecraft.class03202;
import minecraft.class03556;
import minecraft.class03589;
import minecraft.class03767;
import minecraft.class04995;
import minecraft.class05517;
import minecraft.class05527;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07322;
import minecraft.class07376;
import minecraft.class07830;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.world.ChunkView;
import org.jspecify.annotations.Nullable;

public interface class05487
extends class03589,
class05527,
class07295,
class07322,
ChunkView {
    default public Stream<class00500> L(class00734 class007342) {
        int n;
        int n2 = class04995.N((double)class007342.N);
        int n3 = class04995.N((double)class007342.u);
        int n4 = class04995.N((double)class007342.y);
        int n5 = class04995.N((double)class007342.i);
        int n6 = class04995.N((double)class007342.L);
        if (this.N(n2, n4, n6, n3, n5, n = class04995.N((double)class007342.R))) {
            return this.N(class007342);
        }
        return Stream.empty();
    }

    default public boolean M(class07209 class072092) {
        if (class072092.method_10264() >= this.method_8615()) {
            return this.N_17(class072092);
        }
        class07209 class072093 = new class07209(class072092.method_10263(), this.method_8615(), class072092.method_10260());
        if (!this.N_17(class072093)) {
            return false;
        }
        class072093 = class072093.method_10074();
        while (class072093.method_10264() > class072092.method_10264()) {
            class00500 class005002 = this.method_8320(class072093);
            if (class005002.z() > 0 && !class005002.T()) {
                return false;
            }
            class072093 = class072093.method_10074();
        }
        return true;
    }

    public class01042 method_30349();

    public boolean method_8608();

    default public int method_31607() {
        return this.method_8597().B();
    }

    default public float B(class07209 class072092) {
        return this.Z(class072092) - 0.5f;
    }

    @Deprecated
    default public float Z(class07209 class072092) {
        float f = (float)this.U(class072092) / 15.0f;
        float f2 = f / (4.0f - 3.0f * f);
        return class04995.B((float)this.method_8597().E(), (float)f2, (float)1.0f);
    }

    default public class03556<class00780> i(class07209 class072092) {
        return this.method_22385().N(class072092);
    }

    default public int U(class07209 class072092) {
        return this.N(class072092, this.method_8594());
    }

    default public boolean z(class07209 class072092) {
        return this.method_8316(class072092).N(class01231.N);
    }

    default public boolean u(class00734 class007342) {
        int n = class04995.N((double)class007342.N);
        int n2 = class04995.L((double)class007342.u);
        int n3 = class04995.N((double)class007342.y);
        int n4 = class04995.L((double)class007342.i);
        int n5 = class04995.N((double)class007342.L);
        int n6 = class04995.L((double)class007342.R);
        class07218 class072182 = new class07218();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    if (this.method_8320((class07209)class072182.N(i, j, k)).Y().W()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    default public boolean y(int n, int n2) {
        return this.N(class01296.N((int)n), class01296.N((int)n2));
    }

    default public int y(class07830 class078302, class07209 class072092) {
        return this.method_8624(class078302, class072092.method_10263(), class072092.method_10260());
    }

    @Deprecated
    default public boolean E(class07209 class072092) {
        return this.y(class072092.method_10263(), class072092.method_10260());
    }

    default public <T> class01905<T> N_51(class05946<? extends class00751<? extends T>> class059462) {
        return this.method_30349().L(class059462).N(this.method_45162());
    }

    @Deprecated
    public boolean N(int var1, int var2);

    @Deprecated
    default public boolean N(int n, int n2, int n3, int n4) {
        int n5 = class01296.N((int)n);
        int n6 = class01296.N((int)n3);
        int n7 = class01296.N((int)n2);
        int n8 = class01296.N((int)n4);
        for (int i = n5; i <= n6; ++i) {
            for (int j = n7; j <= n8; ++j) {
                if (this.N(i, j)) continue;
                return false;
            }
        }
        return true;
    }

    default public class07209 N(class07830 class078302, class07209 class072092) {
        return new class07209(class072092.method_10263(), this.method_8624(class078302, class072092.method_10263(), class072092.method_10260()), class072092.method_10260());
    }

    @Deprecated
    default public boolean N(class07209 class072092, class07209 class072093) {
        return this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072093.method_10263(), class072093.method_10264(), class072093.method_10260());
    }

    default public int N(class07209 class072092, int n) {
        if (class072092.method_10263() < -30000000 || class072092.method_10260() < -30000000 || class072092.method_10263() >= 30000000 || class072092.method_10260() >= 30000000) {
            return 15;
        }
        return this.method_22335(class072092, n);
    }

    @Deprecated
    default public boolean N(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 < this.method_31607() || n2 > this.method_31600()) {
            return false;
        }
        return this.N(n, n3, n4, n6);
    }

    default public boolean R(class07209 class072092) {
        return this.method_8320(class072092).P();
    }

    default public class08050 lithium$getLoadedChunk(int n, int n2) {
        return this.method_8402(n, n2, class00549.m, false);
    }

    default public boolean hasBiomes() {
        return true;
    }

    public class03556<class00780> method_22387(int var1, int var2, int var3);

    public @Nullable class08050 method_8402(int var1, int var2, class00549 var3, boolean var4);

    public int method_8615();

    public class07376 method_8597();

    public class00611 method_75598();

    public int method_8624(class07830 var1, int var2, int var3);

    public class03767 method_45162();

    default public class08050 method_8392(int n, int n2) {
        return this.method_8402(n, n2, class00549.m, true);
    }

    default public class08050 method_8500(class07209 class072092) {
        return this.method_8392(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
    }

    public class05517 method_22385();

    default public class08050 method_22342(int n, int n2, class00549 class005492) {
        return this.method_8402(n, n2, class005492, true);
    }

    default public @Nullable class07290 method_22338(int n, int n2) {
        return this.method_8402(n, n2, class00549.L, false);
    }

    public int method_8594();

    default public int method_31605() {
        return this.method_8597().Z();
    }

    default public int method_23752(class07209 class072092, class03202 class032022) {
        return class032022.getColor((class00780)this.i(class072092).N(), (double)class072092.method_10263(), (double)class072092.method_10260());
    }

    @Override
    default public class03556<class00780> method_16359(int n, int n2, int n3) {
        class08050 class080502 = this.method_8402(class01146.i((int)n), class01146.i((int)n3), class00549.R, false);
        if (class080502 != null) {
            return class080502.method_16359(n, n2, n3);
        }
        return this.method_22387(n, n2, n3);
    }

    default public class03556 getBiomeFabric(class07209 class072092) {
        return this.i(class072092);
    }
}

