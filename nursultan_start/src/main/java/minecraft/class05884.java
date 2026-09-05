/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00560
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class02484
 *  minecraft.class02699
 *  minecraft.class02826
 *  minecraft.class03943
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05671
 *  minecraft.class06005
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06601
 *  minecraft.class06611
 *  minecraft.class07050
 *  minecraft.class08036
 *  minecraft.class08291
 *  minecraft.class08394
 */
package minecraft;

import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00560;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class02699;
import minecraft.class02826;
import minecraft.class03943;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05671;
import minecraft.class06005;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06601;
import minecraft.class06611;
import minecraft.class07050;
import minecraft.class08036;
import minecraft.class08291;
import minecraft.class08394;

public class class05884
extends class05096 {
    public static final int N = 114;
    public static final int y = 126;
    public static final int L = 192;
    public static final int u = 192;
    public static final int i = 256;
    public static final int R = 256;
    private static final int M = 4;
    private static final int B = 98;
    private static final int Z = 157;
    private static final int z = 43;
    private static final int U = 116;
    private static final int E = 16;
    private static final int W = 148;
    private static final class00392 m = class00392.L((String)"book.edit.title");
    private static final class00392 P = class00392.L((String)"book.signButton");
    private final class08036 s;
    private final class06584 T;
    private final class08291 b;
    private int j;
    private final List<String> v = Lists.newArrayList();
    private class06005 n;
    private class06005 t;
    private final class07050 G;
    private class00392 l = class05220.N;
    private class03943 d;

    private int L() {
        return 2;
    }

    private void P() {
        if (this.N() >= this.y(100)) {
            return;
        }
        this.v.add("");
    }

    public class05884(class08036 class080362, class06584 class065842, class07050 class070502, class02699 class026992) {
        super(m);
        this.s = class080362;
        this.T = class065842;
        this.G = class070502;
        class026992.N(class06202.Nq().yi()).forEach(this.v::add);
        if (this.v.isEmpty()) {
            this.v.add("");
        }
        this.b = new class08291(this, class080362, class070502, this.v);
    }

    private void Z() {
        if (this.j < this.N() - 1) {
            ++this.j;
        } else {
            this.P();
            if (this.j < this.N() - 1) {
                ++this.j;
            }
        }
        this.z();
        this.U();
    }

    private class00392 i() {
        return class00392.N((String)"book.pageIndicator", (Object[])new Object[]{this.j + 1, this.N()}).y(-16777216).R();
    }

    private void m() {
        this.T.N(class02484.Ny, (Object)new class02699(this.v.stream().map(class02826::N).toList()));
    }

    private void U() {
        this.t.field_22764 = this.j > 0;
    }

    private void z() {
        this.d.N(this.v.get(this.j), true);
        this.l = this.i();
    }

    private int u() {
        return this.L() + 192 + 2;
    }

    private int y(int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            return 50;
        }
        return n;
    }

    private int y() {
        return (this.field_22789 - 192) / 2;
    }

    private void E() {
        ListIterator<String> var1 = this.v.listIterator(this.v.size());
        while (var1.hasPrevious() && var1.previous().isEmpty()) {
            var1.remove();
        }
    }

    private void N(class00580 class005802) {
        int n = this.y();
        int n2 = this.L();
        class005802.N(class00937.field_62011, n + 148, n2 + 16, this.l);
    }

    private int N(int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            return 256;
        }
        return n;
    }

    private int N() {
        return this.v.size();
    }

    public void method_25426() {
        int n = this.y();
        int n2 = this.L();
        int n3 = 8;
        this.d = class03943.L().L(false).L(-16777216).u(-16777216).y(false).N(false).N((this.field_22789 - 114) / 2 - 8).y(28).N(this.field_22793, 122, 134, class05220.N);
        this.d.N(this.N(1024));
        Objects.requireNonNull(this.field_22793);
        this.d.y(126 / 9);
        this.d.N(string -> this.v.set(this.j, (String)string));
        this.method_37063((class04654)this.d);
        this.z();
        this.l = this.i();
        this.t = (class06005)this.method_37063((class04654)new class06005(n + 43, n2 + 157, false, class053622 -> this.R(), true));
        this.n = (class06005)this.method_37063((class04654)new class06005(n + 116, n2 + 157, true, class053622 -> this.Z(), true));
        this.method_37063((class04654)class05362.method_46430((class00392)P, class053622 -> this.field_22787.N((class05096)this.b)).N(this.field_22789 / 2 - 98 - 2, this.u()).N(98).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> {
            this.field_22787.N(null);
            this.W();
        }).N(this.field_22789 / 2 + 2, this.u()).N(98).N());
        this.U();
    }

    protected void method_56131() {
        this.method_48265((class04654)this.d);
    }

    public boolean method_25404(class06601 class066012) {
        switch (class066012.v()) {
            case 266: {
                this.t.method_25306((class06611)class066012);
                return true;
            }
            case 267: {
                this.n.method_25306((class06611)class066012);
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        class010542.N(class08394.Na, class05671.i, this.y(), this.L(), 0.0f, 0.0f, 192, 192, 256, 256);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.N(class010542.B());
    }

    private void W() {
        this.E();
        this.m();
        int n = this.G == class07050.field_5808 ? this.s.method_31548().N() : 40;
        this.field_22787.NE().N((class00381)new class00560(n, this.v, Optional.empty()));
    }

    private void R() {
        if (this.j > 0) {
            --this.j;
            this.z();
        }
        this.U();
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.i()});
    }
}

