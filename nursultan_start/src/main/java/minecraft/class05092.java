/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00050
 *  minecraft.class00053
 *  minecraft.class00061
 *  minecraft.class00065
 *  minecraft.class00072
 *  minecraft.class00073
 *  minecraft.class00081
 *  minecraft.class00082
 *  minecraft.class00083
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class03271
 *  minecraft.class03281
 *  minecraft.class03686
 *  minecraft.class04141
 *  minecraft.class04601
 *  minecraft.class04654
 *  minecraft.class04691
 *  minecraft.class04700
 *  minecraft.class04702
 *  minecraft.class04708
 *  minecraft.class04710
 *  minecraft.class04732
 *  minecraft.class04950
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class05018
 *  minecraft.class05213
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05685
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class08300
 *  minecraft.class08394
 *  minecraft.class08745
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class00050;
import minecraft.class00053;
import minecraft.class00061;
import minecraft.class00065;
import minecraft.class00072;
import minecraft.class00073;
import minecraft.class00081;
import minecraft.class00082;
import minecraft.class00083;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class03271;
import minecraft.class03281;
import minecraft.class03686;
import minecraft.class04141;
import minecraft.class04601;
import minecraft.class04654;
import minecraft.class04691;
import minecraft.class04700;
import minecraft.class04702;
import minecraft.class04708;
import minecraft.class04710;
import minecraft.class04732;
import minecraft.class04950;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class05018;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05124;
import minecraft.class05129;
import minecraft.class05213;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05685;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class08300;
import minecraft.class08394;
import minecraft.class08745;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05092
extends class05407 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.selectServer.play");
    private final class05685 u;
    private @Nullable class04981 i;
    private @Nullable class00053 R;
    private final Map<class00082, class00073> M = new LinkedHashMap<class00082, class00073>();
    private final long B;
    private boolean Z;
    private final class03271 z = new class03271(class046542 -> {
        class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
    }, class046542 -> this.method_37066((class04654)class046542), this::N, this::y);
    private @Nullable class05362 U;
    private @Nullable class03281 E;
    final class03686 N = new class03686((class05096)((Object)this));

    public class05096 L() {
        return this.u;
    }

    public class05092(class05685 class056852, long l, @Nullable class04981 class049812, @Nullable class00053 class000532) {
        super((class00392)class00392.i());
        this.u = class056852;
        this.B = l;
        this.i = class049812;
        this.R = class000532;
    }

    public class05092(class05685 class056852, long l) {
        this(class056852, l, null, null);
    }

    public class05092 Z() {
        class05092 class050922 = new class05092(this.u, this.B);
        class050922.Z = this.Z;
        return class050922;
    }

    public void i() {
        class05092 class050922 = this.N(this.i);
        this.field_22787.N((class05096)new class04708((class05096)((Object)this.Z()), new class05129[]{new class04732(this.i, class050922)}));
    }

    public void u() {
        class04601.N(class05111::R, (Consumer)class04601.N(this::N, (String)"Couldn't get realms region data")).thenAcceptAsync(class000532 -> {
            this.R = class000532;
            this.W();
        }, (Executor)this.field_22787);
    }

    private void y(class03241 class032412) {
        if (this.i != null && class032412 instanceof class00061) {
            ((class00061)class032412).L(this.i);
        }
    }

    public int y() {
        return this.N.L();
    }

    private void E() {
        if (this.i != null && this.U != null) {
            this.U.field_22763 = this.i.M();
            if (!this.U.field_22763 && this.i.R == class04961.field_19433) {
                this.U.method_47400(class04141.N((class00392)class04981.N));
            }
        }
    }

    public boolean N(long l, String string) {
        class05111 class051112 = class05111.N();
        try {
            List<class04950> var5 = class051112.N(l, string);
            if (this.i != null) {
                this.i.Z = var5;
            } else {
                this.i = class051112.N(l);
            }
            this.R();
        }
        catch (class05097 class050972) {
            y.error("Couldn't invite user", (Throwable)class050972);
            return false;
        }
        return true;
    }

    public class05092 N(class04981 class049812) {
        class05092 class050922 = new class05092(this.u, this.B, class049812, this.R);
        class050922.Z = this.Z;
        return class050922;
    }

    public void N(boolean bl) {
        class05092 class050922 = this.N(this.i);
        this.field_22787.N((class05096)new class04708((class05096)((Object)this.Z()), new class05129[]{new class04691(this.i, (class05096)((Object)class050922), bl, this.field_22787)}));
    }

    public class05096 N(class05097 class050972) {
        return new class04702(class050972, (class05096)this.u);
    }

    private void N(class03241 class032412) {
        if (this.i != null && class032412 instanceof class00061) {
            ((class00061)class032412).y(this.i);
        }
    }

    public void N(long l) {
        class04601.N(class051112 -> class051112.N(l), (Consumer)class04601.N(this::N, (String)"Couldn't get own world")).thenAcceptAsync(class049812 -> {
            this.i = class049812;
            this.W();
        }, (Executor)this.field_22787);
    }

    public int N() {
        return this.N.u();
    }

    public void N(class00072 class000722) {
        class00072 class000723 = (class00072)this.i.z.get(this.i.T);
        class000722.y.M = class000723.y.M;
        class000722.y.B = class000723.y.B;
        class05111 class051112 = class05111.N();
        try {
            if (this.i.T != class000722.N) {
                throw new class05097(class05124.u());
            }
            class051112.N(this.i.y, class000722.N, class000722.y, class000722.L);
            this.i.z.put(this.i.T, class000722);
            if (class000722.y.u != class000723.y.u || class000722.y() != class000723.y()) {
                class05685.u();
            }
            this.R();
        }
        catch (class05097 class050972) {
            y.error("Couldn't save slot settings", (Throwable)class050972);
            this.field_22787.N((class05096)new class04702(class050972, (class05096)((Object)this)));
            return;
        }
        this.field_22787.N((class05096)((Object)this));
    }

    public void N(String string, String string2, class00050 class000502, @Nullable class00082 class000822) {
        String string3 = class05018.B((String)string2) ? "" : string2;
        String string4 = class05018.B((String)string) ? "" : string;
        class05111 class051112 = class05111.N();
        try {
            class00072 class000722 = (class00072)this.i.z.get(this.i.T);
            class00082 class000823 = class000502 == class00050.field_60228 ? class000822 : null;
            class00081 class000812 = new class00081(class000502, class000823);
            class051112.N(this.i.y, string4, string3, class000812, class000722.N, class000722.y, class000722.L);
            this.i.d = class000812;
            this.i.u = string;
            this.i.i = string3;
            this.R();
        }
        catch (class05097 class050972) {
            y.error("Couldn't save settings", (Throwable)class050972);
            this.field_22787.N((class05096)new class04702(class050972, (class05096)((Object)this)));
            return;
        }
        this.field_22787.N((class05096)((Object)this));
    }

    public void method_25426() {
        if (this.i == null) {
            this.N(this.B);
        }
        if (this.R == null) {
            this.u();
        }
        class05216 class052162 = class00392.L((String)"mco.configure.world.loading");
        this.E = class03281.method_48623((class03271)this.z, (int)this.field_22789).N(new class03241[]{new class08745(this.method_64506(), class08300.N, (class00392)class052162), new class08745(this.method_64506(), class04710.y, (class00392)class052162), new class08745(this.method_64506(), class04700.N, (class00392)class052162), new class08745(this.method_64506(), class00083.N, (class00392)class052162)}).N();
        this.E.method_71522(3, false);
        this.method_37063((class04654)this.E);
        class01885 class018852 = (class01885)this.N.y((class02102)class01885.i().N(8));
        this.U = (class05362)class018852.N((class02102)class05362.method_46430((class00392)L, class053622 -> {
            this.method_25419();
            class05685.N((class04981)this.i, (class05096)((Object)((Object)((Object)this))));
        }).N(150).N());
        this.U.field_22763 = false;
        class018852.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.N.method_48206(class064782 -> {
            class064782.method_48591(1);
            this.method_37063((class04654)class064782);
        });
        this.E.method_48987(0, false);
        this.method_48640();
        if (this.i != null && this.R != null) {
            this.W();
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (this.E.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        if (this.E == null) {
            return;
        }
        this.E.method_48618(this.field_22789);
        this.E.method_49613();
        int n = this.E.method_48202().L();
        class03255 class032552 = new class03255(0, n, this.field_22789, this.field_22790 - this.N.y() - n);
        this.z.N(class032552);
        this.N.y(n);
        this.N.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.N.y() - 2, 0.0f, 0.0f, this.field_22789, 2, 32, 2);
    }

    public void method_25419() {
        class03241 class032412;
        if (this.i != null && (class032412 = this.z.N()) instanceof class00061) {
            ((class00061)class032412).L(this.i);
        }
        this.field_22787.N((class05096)this.u);
        if (this.Z) {
            this.u.i();
        }
    }

    protected void method_57735(class01054 class010542) {
        class010542.N(class08394.Na, class05213.i, 0, 0, 0.0f, 0.0f, this.field_22789, this.N.L(), 16, 16);
        this.method_57736(class010542, 0, this.N.L(), this.field_22789, this.field_22790);
    }

    private void W() {
        if (this.i == null || this.R == null) {
            return;
        }
        this.M.clear();
        for (class00065 class000652 : this.R.y()) {
            if (class000652.N() == class00082.field_60199) continue;
            this.M.put(class000652.N(), class000652.y());
        }
        int n = -1;
        if (this.E != null) {
            n = this.E.method_71284().indexOf(this.z.N());
        }
        if (this.E != null) {
            this.method_37066((class04654)this.E);
        }
        this.E = (class03281)this.method_37063((class04654)class03281.method_48623((class03271)this.z, (int)this.field_22789).N(new class03241[]{new class08300(this, Objects.requireNonNull(this.field_22787), this.i), new class04710(this, this.field_22787, this.i), new class04700(this, this.field_22787, this.i), new class00083(this, this.field_22787, this.i, this.M)}).N());
        this.method_25395((class04654)this.E);
        if (n != -1) {
            this.E.method_48987(n, false);
        }
        this.E.method_71522(3, !this.i.U);
        if (this.i.U) {
            this.E.method_71521(3, class04141.N((class00392)class00392.L((String)"mco.configure.world.settings.expired")));
        } else {
            this.E.method_71521(3, null);
        }
        this.E();
        this.method_48640();
    }

    public void R() {
        this.Z = true;
        if (this.E != null) {
            for (class03241 class032412 : this.E.method_71284()) {
                if (!(class032412 instanceof class00061)) continue;
                ((class00061)class032412).N(this.i);
            }
        }
    }
}

