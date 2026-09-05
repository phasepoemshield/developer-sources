/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00405
 *  minecraft.class00578
 *  minecraft.class00941
 *  minecraft.class02566
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class05194
 *  minecraft.class05197
 *  minecraft.class05247
 *  minecraft.class07915
 *  minecraft.class07948
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00405;
import minecraft.class00578;
import minecraft.class00941;
import minecraft.class01590;
import minecraft.class01608;
import minecraft.class01609;
import minecraft.class02566;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class05194;
import minecraft.class05197;
import minecraft.class05247;
import minecraft.class07915;
import minecraft.class07948;
import org.jspecify.annotations.Nullable;

public class class01588
implements class01608,
class05197 {
    private final boolean i;
    private final int R;
    private final int M;
    private final boolean B;
    float N;
    float y;
    private float Z = Float.MAX_VALUE;
    private float z = Float.MAX_VALUE;
    private float U = -3.4028235E38f;
    private float E = -3.4028235E38f;
    private float W = Float.MAX_VALUE;
    private float m = Float.MAX_VALUE;
    private float P = -3.4028235E38f;
    private float s = -3.4028235E38f;
    final List<class07915> L = new ArrayList<class07915>();
    private @Nullable List<class00941> T;
    private @Nullable List<class00578> b;
    final /* synthetic */ class01590 u;
    private static final float j = 0.5f;

    public class01588(class01590 class015902, float f, float f2, int n, boolean bl, boolean bl2) {
        this(class015902, f, f2, n, 0, bl, bl2);
    }

    public class01588(class01590 class015902, float f, float f2, int n, int n2, boolean bl, boolean bl2) {
        this.u = class015902;
        this.N = f;
        this.y = f2;
        this.i = bl;
        this.R = n;
        this.M = n2;
        this.B = bl2;
        this.N(f, f2, 0.0f);
    }

    public boolean accept(int n, class00405 class004052, int n2) {
        class07948 class079482 = this.u.N(n2, class004052);
        return this.N(n, class004052, class079482);
    }

    private float y(float f) {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return f - 0.5f;
        }
        return f;
    }

    private int N(class00405 class004052, int n) {
        Integer n2 = class004052.y();
        if (n2 != null) {
            float f = class02566.W((int)n);
            float f2 = class02566.W((int)n2);
            if (f != 1.0f) {
                return class02566.R((int)class02566.u((float)(f * f2)), (int)n2);
            }
            return n2;
        }
        if (this.i) {
            return class02566.y((int)n, (float)0.25f);
        }
        return 0;
    }

    private int N(@Nullable class05194 class051942) {
        if (class051942 != null) {
            int n = class02566.y((int)this.R);
            int n2 = class051942.N();
            return class02566.R((int)n, (int)n2);
        }
        return this.R;
    }

    @Override
    public void N(class01609 class016092) {
        if (class02566.y((int)this.M) != 0) {
            class016092.N(this.u.L.N().N(this.W, this.m, this.P, this.s, -0.01f, this.M, 0, 0.0f));
        }
        for (class07915 class079152 : this.L) {
            class016092.N(class079152);
        }
        if (this.T != null) {
            for (class00941 class009412 : this.T) {
                class016092.N(class009412);
            }
        }
        if (this.b != null) {
            for (class00578 class005782 : this.b) {
                class016092.N(class005782);
            }
        }
    }

    @Override
    public @Nullable class03255 N() {
        if (this.Z >= this.U || this.z >= this.E) {
            return null;
        }
        int n = class04995.y((float)this.Z);
        int n2 = class04995.y((float)this.z);
        int n3 = class04995.u((float)this.U);
        int n4 = class04995.u((float)this.E);
        return new class03255(n, n2, n3 - n, n4 - n2);
    }

    private float N(float f) {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return f - 0.5f;
        }
        return f;
    }

    private void N(float f, float f2, float f3) {
        if (class02566.y((int)this.M) == 0) {
            return;
        }
        this.W = Math.min(this.W, f - 1.0f);
        this.m = Math.min(this.m, f2 - 1.0f);
        this.P = Math.max(this.P, f + f3);
        this.s = Math.max(this.s, f2 + 9.0f);
        this.N(this.W, this.m, this.P, this.s);
    }

    private void N(class07915 class079152) {
        this.L.add(class079152);
        this.N(class079152.U(), class079152.E(), class079152.W(), class079152.m());
    }

    private void N(class00941 class009412) {
        if (this.T == null) {
            this.T = new ArrayList<class00941>();
        }
        this.T.add(class009412);
        this.N(class009412.U(), class009412.E(), class009412.W(), class009412.m());
    }

    private void N(class00578 class005782) {
        if (this.b == null) {
            this.b = new ArrayList<class00578>();
        }
        this.b.add(class005782);
    }

    private void N(float f, float f2, float f3, float f4) {
        this.Z = Math.min(this.Z, f);
        this.z = Math.min(this.z, f2);
        this.U = Math.max(this.U, f3);
        this.E = Math.max(this.E, f4);
    }

    public boolean N(int n, class00405 class004052, class07948 class079482) {
        float f;
        float f2;
        int n2;
        float f3;
        float f4;
        class05247 class052472 = class079482.N();
        boolean bl = class004052.L();
        class05194 class051942 = class004052.N();
        int n3 = this.N(class051942);
        int n4 = this.N(class004052, n3);
        float f5 = class052472.N(bl);
        float f6 = n == 0 ? this.N - 1.0f : this.N;
        float f7 = bl ? class052472.N() : 0.0f;
        class07915 class079152 = class079482.N(this.N, this.y, n3, n4, class004052, f7, f4 = class052472.y());
        if (class079152 != null) {
            this.N(class079152);
        } else if (this.B) {
            this.N(new class00578(this.N, this.y, f5, 7.0f, 9.0f, class004052));
        }
        this.N(this.N, this.y, f5);
        if (class004052.i()) {
            f3 = f4;
            n2 = n4;
            int n5 = n3;
            float f8 = 0.01f;
            float f9 = this.y + 4.5f;
            f2 = this.N + f5;
            f = this.y + 4.5f - 1.0f;
            float f10 = this.N(f);
            float f11 = f2;
            float f12 = f3;
            int n6 = n2;
            int n7 = n5;
            f2 = f8;
            f = f9;
            this.N(this.u.L.N().N(f6, f10, f11, this.y(f), f2, n7, n6, f12));
        }
        if (class004052.R()) {
            f3 = f4;
            n2 = n4;
            int n8 = n3;
            float f13 = 0.01f;
            float f14 = this.y + 9.0f;
            f2 = this.N + f5;
            f = this.y + 9.0f - 1.0f;
            float f15 = this.N(f);
            float f16 = f2;
            float f17 = f3;
            int n9 = n2;
            int n10 = n8;
            f2 = f13;
            f = f14;
            this.N(this.u.L.N().N(f6, f15, f16, this.y(f), f2, n10, n9, f17));
        }
        this.N += f5;
        return true;
    }
}

