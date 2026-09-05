/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04551
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05976
 *  minecraft.class06541
 *  minecraft.class07282
 *  minecraft.class07312
 *  minecraft.class07529
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.nio.file.Path;
import minecraft.class00392;
import minecraft.class04551;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05976;
import minecraft.class06449;
import minecraft.class06541;
import minecraft.class07282;
import minecraft.class07312;
import minecraft.class07529;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class06434
implements Comparable<class06434> {
    public static final class00392 N = class00392.L((String)"selectWorld.select");
    private final class07312 y;
    private final class05976 L;
    private final String u;
    private final boolean i;
    private final boolean R;
    private final boolean M;
    private final Path B;
    private @Nullable class00392 Z;

    private class00392 w() {
        class05216 class052162;
        if (this.s()) {
            return class00392.L((String)"selectWorld.locked").N(class06541.field_1061);
        }
        if (this.u()) {
            return class00392.L((String)"selectWorld.conversion").N(class06541.field_1061);
        }
        if (!this.b()) {
            return class00392.N((String)"selectWorld.incompatible.info", (Object[])new Object[]{this.U()}).N(class06541.field_1061);
        }
        class05216 class052163 = class052162 = this.Z() ? class00392.i().y((class00392)class00392.L((String)"gameMode.hardcore").y(-65536)) : class00392.L((String)("gameMode." + this.B().y()));
        if (this.z()) {
            class052162.i(", ").y((class00392)class00392.L((String)"selectWorld.commands"));
        }
        if (this.i()) {
            class052162.i(", ").y((class00392)class00392.L((String)"selectWorld.experimental").N(class06541.field_1054));
        }
        class05216 class052164 = this.U();
        class05216 class052165 = class00392.y((String)", ").y((class00392)class00392.L((String)"selectWorld.version")).y(class05220.l);
        if (this.W()) {
            class052165.y((class00392)class052164.N(this.m() ? class06541.field_1061 : class06541.field_1056));
        } else {
            class052165.y((class00392)class052164);
        }
        class052162.y((class00392)class052165);
        return class052162;
    }

    public Path L() {
        return this.B;
    }

    public class07312 M() {
        return this.y;
    }

    public class06449 P() {
        class04551 class045512 = class07529.y();
        int n = class045512.comp_4026().y();
        int n2 = this.L.u().y();
        if (!class045512.comp_4031() && n2 < n) {
            return class06449.field_28439;
        }
        if (n2 > n) {
            return class06449.field_28438;
        }
        return class06449.field_28437;
    }

    public boolean T() {
        if (this.s() || this.u()) {
            return true;
        }
        return !this.b();
    }

    public class06434(class07312 class073122, class05976 class059762, String string, boolean bl, boolean bl2, boolean bl3, Path path) {
        this.y = class073122;
        this.L = class059762;
        this.u = string;
        this.R = bl2;
        this.M = bl3;
        this.B = path;
        this.i = bl;
    }

    public class07282 B() {
        return this.y.y();
    }

    public boolean Z() {
        return this.y.L();
    }

    public boolean i() {
        return this.M;
    }

    public boolean b() {
        return class07529.y().comp_4026().N(this.L.u());
    }

    public boolean s() {
        return this.R;
    }

    public boolean n() {
        return !this.T();
    }

    public boolean l() {
        return !this.T();
    }

    public boolean d() {
        return true;
    }

    public boolean m() {
        return this.P() == class06449.field_28438;
    }

    public boolean t() {
        return !this.u() && !this.s();
    }

    public class00392 v() {
        return N;
    }

    public class00392 j() {
        if (this.Z == null) {
            this.Z = this.w();
        }
        return this.Z;
    }

    public class05216 U() {
        if (class05018.y((String)this.L.L())) {
            return class00392.L((String)"selectWorld.versionUnknown");
        }
        return class00392.y((String)this.L.L());
    }

    public boolean z() {
        return this.y.i();
    }

    public boolean u() {
        return this.i;
    }

    public String y() {
        return StringUtils.isEmpty((CharSequence)this.y.N()) ? this.u : this.y.N();
    }

    public class05976 E() {
        return this.L;
    }

    @Override
    public int compareTo(class06434 class064342) {
        if (this.R() < class064342.R()) {
            return 1;
        }
        if (this.R() > class064342.R()) {
            return -1;
        }
        return this.u.compareTo(class064342.u);
    }

    public String N() {
        return this.u;
    }

    public boolean W() {
        return this.P().N();
    }

    public long R() {
        return this.L.y();
    }

    public boolean G() {
        return !this.T();
    }
}

