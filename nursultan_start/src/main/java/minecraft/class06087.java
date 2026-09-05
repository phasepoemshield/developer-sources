/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04842
 *  minecraft.class04853
 *  minecraft.class04858
 *  minecraft.class04884
 *  minecraft.class04927
 *  minecraft.class05044
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class06601
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04842;
import minecraft.class04853;
import minecraft.class04858;
import minecraft.class04884;
import minecraft.class04927;
import minecraft.class05044;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06116;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06601;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06087
extends class05096 {
    private static final class00392 y = class00392.L((String)"jigsaw_block.joint_label");
    private static final class00392 L = class00392.L((String)"jigsaw_block.pool");
    private static final class00392 u = class00392.L((String)"jigsaw_block.name");
    private static final class00392 i = class00392.L((String)"jigsaw_block.target");
    private static final class00392 R = class00392.L((String)"jigsaw_block.final_state");
    private static final class00392 M = class00392.L((String)"jigsaw_block.placement_priority");
    private static final class00392 B = class00392.L((String)"jigsaw_block.placement_priority.tooltip");
    private static final class00392 Z = class00392.L((String)"jigsaw_block.selection_priority");
    private static final class00392 z = class00392.L((String)"jigsaw_block.selection_priority.tooltip");
    private final class04858 U;
    private class04927 E;
    private class04927 W;
    private class04927 m;
    private class04927 P;
    private class04927 s;
    private class04927 T;
    int N;
    private boolean b = true;
    private class06366<class04853> j;
    private class05362 v;
    private class05362 n;
    private class04853 t;

    private void L() {
        this.field_22787.NE().N((class00381)new class04842(this.U.d(), class01894.N((String)this.E.method_1882()), class01894.N((String)this.W.method_1882()), class01894.N((String)this.m.method_1882()), this.P.method_1882(), this.t, this.y(this.s.method_1882()), this.y(this.T.method_1882())));
    }

    public class06087(class04858 class048582) {
        super(class05153.N);
        this.U = class048582;
    }

    private void i() {
        boolean bl;
        this.v.field_22763 = bl = class06087.N(this.E.method_1882()) && class06087.N(this.W.method_1882()) && class06087.N(this.m.method_1882());
        this.n.field_22763 = bl;
    }

    private void u() {
        this.field_22787.NE().N((class00381)new class05044(this.U.d(), this.N, this.b));
    }

    private void y() {
        this.field_22787.N(null);
    }

    private int y(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (!((Boolean)DebugSettings.INSTANCE.hideModernJigsawScreenFeatures.getValue()).booleanValue()) {
            return;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            this.s.field_22763 = false;
            this.T.field_22763 = false;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            this.E.field_22763 = false;
            this.j.field_22763 = false;
            int n = this.method_25396().indexOf(this.j);
            ((class06478)this.method_25396().get((int)(n + 1))).field_22763 = false;
            ((class06478)this.method_25396().get((int)(n + 2))).field_22763 = false;
            ((class06478)this.method_25396().get((int)(n + 3))).field_22763 = false;
        }
    }

    public static boolean N(String string) {
        return class01894.L((String)string) != null;
    }

    private void N(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (((Boolean)DebugSettings.INSTANCE.hideModernJigsawScreenFeatures.getValue()).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            this.E.method_1852(this.W.method_1882());
        }
    }

    private void N() {
        this.L();
        this.field_22787.N(null);
    }

    public void method_25426() {
        boolean bl2;
        this.m = new class04927(this.field_22793, this.field_22789 / 2 - 153, 20, 300, 20, L);
        this.m.method_1880(128);
        this.m.method_1852(this.U.u().N().toString());
        this.m.method_1863(string -> this.i());
        this.method_25429((class04654)this.m);
        this.E = new class04927(this.field_22793, this.field_22789 / 2 - 153, 55, 300, 20, u);
        this.E.method_1880(128);
        this.E.method_1852(this.U.N().toString());
        this.E.method_1863(string -> this.i());
        this.method_25429((class04654)this.E);
        this.W = new class04927(this.field_22793, this.field_22789 / 2 - 153, 90, 300, 20, i);
        this.W.method_1880(128);
        this.W.method_1852(this.U.L().toString());
        this.W.method_1863(string -> this.i());
        this.method_25429((class04654)this.W);
        this.P = new class04927(this.field_22793, this.field_22789 / 2 - 153, 125, 300, 20, R);
        this.P.method_1880(256);
        this.P.method_1852(this.U.R());
        this.method_25429((class04654)this.P);
        this.s = new class04927(this.field_22793, this.field_22789 / 2 - 153, 160, 98, 20, Z);
        this.s.method_1880(3);
        this.s.method_1852(Integer.toString(this.U.Z()));
        this.s.method_47400(class04141.N((class00392)z));
        this.method_25429((class04654)this.s);
        this.T = new class04927(this.field_22793, this.field_22789 / 2 - 50, 160, 98, 20, M);
        this.T.method_1880(3);
        this.T.method_1852(Integer.toString(this.U.B()));
        this.T.method_47400(class04141.N((class00392)B));
        this.method_25429((class04654)this.T);
        this.t = this.U.M();
        this.j = (class06366)this.method_37063((class04654)class06366.N(class04853::N, (Object)this.t).N((Object[])class04853.values()).N().N(this.field_22789 / 2 + 54, 160, 100, 20, y, (class063662, class048532) -> {
            this.t = class048532;
        }));
        this.j.field_22763 = bl2 = class04884.U((class00500)this.U.w()).z().y();
        this.j.field_22764 = bl2;
        this.method_37063((class04654)new class06116(this, this.field_22789 / 2 - 154, 185, 100, 20, class05220.N, 0.0));
        this.method_37063((class04654)class06366.N((boolean)this.b).N(this.field_22789 / 2 - 50, 185, 100, 20, (class00392)class00392.L((String)"jigsaw_block.keep_jigsaws"), (class063662, bl) -> {
            this.b = bl;
        }));
        this.n = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"jigsaw_block.generate"), class053622 -> {
            this.N();
            this.u();
        }).N(this.field_22789 / 2 + 54, 185, 100, 20).N());
        this.v = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
        this.i();
        this.N((CallbackInfo)null);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.m);
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        if (this.v.field_22763 && class066012.u()) {
            this.N();
            return true;
        }
        return false;
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.N(class010542, n, n2, f, null);
        super.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, L, this.field_22789 / 2 - 153, 10, -6250336);
        this.m.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, u, this.field_22789 / 2 - 153, 45, -6250336);
        this.E.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, i, this.field_22789 / 2 - 153, 80, -6250336);
        this.W.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, R, this.field_22789 / 2 - 153, 115, -6250336);
        this.P.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, Z, this.field_22789 / 2 - 153, 150, -6250336);
        this.T.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, M, this.field_22789 / 2 - 50, 150, -6250336);
        this.s.method_25394(class010542, n, n2, f);
        if (class04884.U((class00500)this.U.w()).z().y()) {
            class010542.y(this.field_22793, y, this.field_22789 / 2 + 53, 150, -6250336);
        }
    }

    public void method_25419() {
        this.y();
    }

    public void method_25410(int n, int n2) {
        String string = this.E.method_1882();
        String string2 = this.W.method_1882();
        String string3 = this.m.method_1882();
        String string4 = this.P.method_1882();
        String string5 = this.s.method_1882();
        String string6 = this.T.method_1882();
        int n3 = this.N;
        class04853 class048532 = this.t;
        this.method_25423(n, n2);
        this.E.method_1852(string);
        this.W.method_1852(string2);
        this.m.method_1852(string3);
        this.P.method_1852(string4);
        this.N = n3;
        this.t = class048532;
        this.j.N((Object)class048532);
        this.s.method_1852(string5);
        this.T.method_1852(string6);
    }
}

