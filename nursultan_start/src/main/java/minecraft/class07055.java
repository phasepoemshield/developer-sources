/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class07126
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ComparisonChain;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class07053;
import minecraft.class07062;
import minecraft.class07069;
import minecraft.class07072;
import minecraft.class07084;
import minecraft.class07126;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07055
implements Comparable<class07055> {
    private static final Logger R = LogUtils.getLogger();
    public static final int N = -1;
    public static final int y = 0;
    public static final int L = 255;
    public static final Codec<class07055> u = RecordCodecBuilder.create(instance -> instance.group((App)class07084.N.fieldOf("id").forGetter(class07055::L), (App)class07069.N.forGetter(class07055::E)).apply(instance, class07055::new));
    public static final class02362<class04247, class07055> i = class02362.N(class07084.y, class07055::L, class07069.y, class07055::E, class07055::new);
    private final class03556<class07084> M;
    private int B;
    private int Z;
    private boolean z;
    private boolean U;
    private boolean E;
    private @Nullable class07055 W;
    private final class07053 m = new class07053();

    public class03556<class07084> L() {
        return this.M;
    }

    @Override
    public int compareTo(class07055 class070552) {
        int n = 32147;
        if (this.u() > 32147 && class070552.u() > 32147 || this.R() && class070552.R()) {
            return ComparisonChain.start().compare(Boolean.valueOf(this.R()), Boolean.valueOf(class070552.R())).compare(((class07084)this.L().N()).Z(), ((class07084)class070552.L().N()).Z()).result();
        }
        return ComparisonChain.start().compareFalseFirst(this.R(), class070552.R()).compareFalseFirst(this.y(), class070552.y()).compare(this.u(), class070552.u()).compare(((class07084)this.L().N()).Z(), ((class07084)class070552.L().N()).Z()).result();
    }

    public boolean M() {
        return this.U;
    }

    private boolean P() {
        if (this.B == 0 && this.W != null) {
            this.N(this.W);
            this.W = this.W.W;
            return true;
        }
        return false;
    }

    public class07055(class07055 class070552) {
        this.M = class070552.M;
        this.N(class070552);
    }

    private class07055(class03556<class07084> class035562, class07069 class070693) {
        this(class035562, class070693.y(), class070693.N(), class070693.L(), class070693.u(), class070693.i(), class070693.R().map(class070692 -> new class07055(class035562, (class07069)((Object)class070692))).orElse(null));
    }

    public class07055(class03556<class07084> class035562) {
        this(class035562, 0, 0);
    }

    public class07055(class03556<class07084> class035562, int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        this(class035562, n, n2, bl, bl2, bl3, null);
    }

    public class07055(class03556<class07084> class035562, int n, int n2, boolean bl, boolean bl2) {
        this(class035562, n, n2, bl, bl2, bl2);
    }

    public class07055(class03556<class07084> class035562, int n, int n2) {
        this(class035562, n, n2, false, true);
    }

    public class07055(class03556<class07084> class035562, int n) {
        this(class035562, n, 0);
    }

    public class07055(class03556<class07084> class035562, int n, int n2, boolean bl, boolean bl2, boolean bl3, @Nullable class07055 class070552) {
        this.M = class035562;
        this.B = n;
        int n3 = 255;
        int n4 = 0;
        int n5 = n2;
        this.Z = this.N(n5, n4, n3);
        this.z = bl;
        this.U = bl2;
        this.E = bl3;
        this.W = class070552;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class07055) {
            class07055 class070552 = (class07055)object;
            return this.B == class070552.B && this.Z == class070552.Z && this.z == class070552.z && this.U == class070552.U && this.E == class070552.E && this.M.equals(class070552.M);
        }
        return false;
    }

    public String toString() {
        String string = this.Z > 0 ? this.z() + " x " + (this.Z + 1) + ", Duration: " + this.s() : this.z() + ", Duration: " + this.s();
        if (!this.U) {
            string = string + ", Particles: false";
        }
        if (!this.E) {
            string = string + ", Show Icon: false";
        }
        return string;
    }

    public int hashCode() {
        int n = this.M.hashCode();
        n = 31 * n + this.B;
        n = 31 * n + this.Z;
        n = 31 * n + (this.z ? 1 : 0);
        n = 31 * n + (this.U ? 1 : 0);
        n = 31 * n + (this.E ? 1 : 0);
        return n;
    }

    public boolean B() {
        return this.E;
    }

    public void Z() {
        if (this.W()) {
            this.m();
            this.P();
        }
        this.m.y(this);
    }

    public int i() {
        return this.Z;
    }

    private boolean i(class07055 class070552) {
        return !this.y() && (this.B < class070552.B || class070552.y());
    }

    private String s() {
        if (this.y()) {
            return "infinite";
        }
        return Integer.toString(this.B);
    }

    private void m() {
        if (this.W != null) {
            this.W.m();
        }
        this.B = this.N(n -> n - 1);
    }

    public void U() {
        this.m.N(this);
    }

    public String z() {
        return ((class07084)this.M.N()).R();
    }

    public void u(class07055 class070552) {
        this.m.N(class070552.m);
    }

    public int u() {
        return this.B;
    }

    public boolean y() {
        return this.B == -1;
    }

    public boolean y(class07055 class070552) {
        if (!this.M.equals(class070552.M)) {
            R.warn("This method should only be called for matching effects!");
        }
        boolean bl = false;
        if (class070552.Z > this.Z) {
            if (class070552.i(this)) {
                class07055 class070553 = this.W;
                this.W = new class07055(this);
                this.W.W = class070553;
            }
            this.Z = class070552.Z;
            this.B = class070552.B;
            bl = true;
        } else if (this.i(class070552)) {
            if (class070552.Z == this.Z) {
                this.B = class070552.B;
                bl = true;
            } else if (this.W == null) {
                this.W = new class07055(class070552);
            } else {
                this.W.y(class070552);
            }
        }
        if (!class070552.z && this.z || bl) {
            this.z = class070552.z;
            bl = true;
        }
        if (class070552.U != this.U) {
            this.U = class070552.U;
            bl = true;
        }
        if (class070552.E != this.E) {
            this.E = class070552.E;
            bl = true;
        }
        return bl;
    }

    public void y(class07438 class074382) {
        ((class07084)this.M.N()).y(class074382, this.Z);
    }

    private class07069 E() {
        return new class07069(this.i(), this.u(), this.R(), this.M(), this.B(), Optional.ofNullable(this.W).map(class07055::E));
    }

    private int N(int n, int n2, int n3) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            return n;
        }
        return class04995.N((int)n, (int)n2, (int)n3);
    }

    public boolean N(class03556<class07084> class035562) {
        return this.M.equals(class035562);
    }

    public int N(Int2IntFunction int2IntFunction) {
        if (this.y() || this.B == 0) {
            return this.B;
        }
        return int2IntFunction.applyAsInt(this.B);
    }

    public class07055 N(float f) {
        class07055 class070552 = new class07055(this);
        class070552.B = class070552.N(n -> Math.max(class04995.y((float)((float)n * f)), 1));
        return class070552;
    }

    public boolean N(int n) {
        return !this.y() && this.B <= n;
    }

    void N(class07055 class070552) {
        this.B = class070552.B;
        this.Z = class070552.Z;
        this.z = class070552.z;
        this.U = class070552.U;
        this.E = class070552.E;
    }

    public class07126 N() {
        return ((class07084)this.M.N()).N(this);
    }

    public float N(class07438 class074382, float f) {
        return this.m.N(class074382, f);
    }

    public void N(class04782 class047822, class07438 class074382, class07062 class070622) {
        ((class07084)this.M.N()).N(class047822, class074382, this.Z, class070622);
    }

    public void N(class04782 class047822, class07438 class074382, class07072 class070722, float f) {
        ((class07084)this.M.N()).N(class047822, class074382, this.Z, class070722, f);
    }

    public void N(class07438 class074382) {
        ((class07084)this.M.N()).N(class074382, this.Z);
    }

    public boolean N(class04782 class047822, class07438 class074382, Runnable runnable) {
        int n;
        if (!this.W()) {
            return false;
        }
        int n2 = n = this.y() ? class074382.field_6012 : this.B;
        if (((class07084)this.M.N()).N(n, this.Z) && !((class07084)this.M.N()).N(class047822, class074382, this.Z)) {
            return false;
        }
        this.m();
        if (this.P()) {
            runnable.run();
        }
        return this.W();
    }

    private boolean W() {
        return this.y() || this.B > 0;
    }

    public boolean R() {
        return this.z;
    }
}

