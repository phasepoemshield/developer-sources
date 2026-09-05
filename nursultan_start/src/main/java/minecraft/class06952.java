/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class02680
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class04770
 *  minecraft.class04911
 *  minecraft.class05851
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07049
 *  minecraft.class07288
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08013
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class02680;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class04770;
import minecraft.class04911;
import minecraft.class05851;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06917;
import minecraft.class06928;
import minecraft.class06937;
import minecraft.class07049;
import minecraft.class07288;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08013;
import minecraft.class08036;
import minecraft.class08044;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06952
extends class07482 {
    protected static final int N = 0;
    protected static final int y = 1;
    protected static final int L = 2;
    private static final int u = 3;
    private static final int i = 30;
    private static final int R = 30;
    private static final int j = 39;
    private static final int v = 136;
    private static final int n = 162;
    private static final int t = 220;
    private static final int G = 37;
    private final class07288 l;
    private final class06917 d;
    private int w;
    private boolean k;
    private boolean Y;

    public void M(int n) {
        this.w = n;
    }

    public boolean P() {
        return this.Y;
    }

    public boolean T() {
        return this.k;
    }

    public class06952(int n, class08044 class080442) {
        this(n, class080442, (class07288)new class08013(class080442.z));
    }

    public class06952(int n, class08044 class080442, class07288 class072882) {
        super(class05851.field_17340, n);
        this.l = class072882;
        this.d = new class06917(class072882);
        this.N(new class06937(this.d, 0, 136, 37));
        this.N(new class06937(this.d, 1, 162, 37));
        this.N(new class06928(class080442.z, class072882, this.d, 2, 220, 37));
        this.L((class06695)class080442, 108, 84);
    }

    public void B(int n) {
        class06584 class065842;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (n < 0 || this.s().size() <= n) {
            return;
        }
        class06584 class065843 = this.d.method_5438(0);
        if (!class065843.R()) {
            if (!this.N(class065843, 3, 39, true)) {
                return;
            }
            this.d.method_5447(0, class065843);
        }
        if (!(class065842 = this.d.method_5438(1)).R()) {
            if (!this.N(class065842, 3, 39, true)) {
                return;
            }
            this.d.method_5447(1, class065842);
        }
        if (this.d.method_5438(0).R() && this.d.method_5438(1).R()) {
            class07324 class073242 = (class07324)this.s().get(n);
            this.N(0, class073242.u());
            class073242.i().ifPresent(class026802 -> this.N(1, (class02680)class026802));
        }
    }

    private void b() {
        if (!this.l.L()) {
            class07049 class070492 = (class07049)this.l;
            class070492.method_73183().method_8486(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), this.l.R(), class04911.field_15254, 1.0f, 1.0f, false);
        }
    }

    public class07316 s() {
        return this.l.y();
    }

    public int m() {
        return this.w;
    }

    public void y(boolean bl) {
        this.Y = bl;
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.l.N(null);
        if (this.l.L()) {
            return;
        }
        if (!class080362.method_5805() || class080362 instanceof class04770 && ((class04770)class080362).method_14239()) {
            class06584 class065842 = this.d.method_5441(0);
            if (!class065842.R()) {
                class080362.method_7328(class065842, false);
            }
            if (!(class065842 = this.d.method_5441(1)).R()) {
                class080362.method_7328(class065842, false);
            }
        } else if (class080362 instanceof class04770) {
            class080362.method_31548().B(this.d.method_5441(0));
            class080362.method_31548().B(this.d.method_5441(1));
        }
    }

    public void y(class06695 class066952) {
        this.d.N();
        super.y(class066952);
    }

    public int E() {
        return this.l.u();
    }

    public void N(class07316 class073162) {
        this.l.N(class073162);
    }

    private void N(int n, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            int n2;
            callbackInfo.cancel();
            if (n >= this.s().size()) {
                return;
            }
            class03443 class034432 = (class03443)class06202.Nq().T_2;
            class04453 class044532 = (class04453)class06202.Nq().T_4;
            if (!this.d.method_5438(0).R()) {
                n2 = this.d.method_5438(0).c();
                class034432.N(this.b, 0, 0, class07510.field_7794, (class08036)class044532);
                if (n2 == this.d.method_5438(0).c()) {
                    return;
                }
            }
            if (!this.d.method_5438(1).R()) {
                n2 = this.d.method_5438(1).c();
                class034432.N(this.b, 1, 0, class07510.field_7794, (class08036)class044532);
                if (n2 == this.d.method_5438(1).c()) {
                    return;
                }
            }
            if (this.d.method_5438(0).R() && this.d.method_5438(1).R()) {
                class07324 class073242 = (class07324)this.s().get(n);
                this.N(class034432, class044532, 0, class073242.u());
                class073242.i().ifPresent(class026802 -> this.N(class034432, class044532, 1, (class02680)class026802));
            }
        }
    }

    private void N(class06584 class065842, class06937 class069372, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private void N(class03443 class034432, class04453 class044532, int n, class02680 class026802) {
        class06584 class065842;
        class06584 class065843;
        int n2;
        for (n2 = 3; n2 < 39 && ((class065843 = ((class06937)this.T.get(n2)).i()).R() || !class026802.N(class065843) || !(class065842 = this.d.method_5438(n)).R() && !class06584.L((class06584)class065843, (class06584)class065842)); ++n2) {
        }
        if (n2 == 39) {
            return;
        }
        boolean bl = !((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R();
        class034432.N(this.b, n2, 0, class07510.field_7790, (class08036)class044532);
        class034432.N(this.b, n2, 0, class07510.field_7793, (class08036)class044532);
        class034432.N(this.b, n, 0, class07510.field_7790, (class08036)class044532);
        if (bl) {
            class034432.N(this.b, n2, 0, class07510.field_7790, (class08036)class044532);
        }
    }

    public void N(int n) {
        this.d.N(n);
    }

    public boolean N(class08036 class080362) {
        return this.l.y(class080362);
    }

    public void N(boolean bl) {
        this.k = bl;
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n == 2) {
                if (!this.N(class065843, 3, 39, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
                this.b();
            } else if (n == 0 || n == 1 ? !this.N(class065843, 3, 39, false) : (n >= 3 && n < 30 ? !this.N(class065843, 30, 39, false) : n >= 30 && n < 39 && !this.N(class065843, 3, 30, false))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
        }
        return class065842;
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class069372, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return false;
    }

    private void N(int n, class02680 class026802) {
        for (int i = 3; i < 39; ++i) {
            class06584 class065842;
            class06584 class065843 = ((class06937)this.T.get(i)).i();
            if (class065843.R() || !class026802.N(class065843) || !(class065842 = this.d.method_5438(n)).R() && !class06584.L((class06584)class065843, (class06584)class065842)) continue;
            int n2 = class065843.U();
            int n3 = Math.min(n2 - class065842.c(), class065843.c());
            class06584 class065844 = class065843.L(class065842.c() + n3);
            class065843.B(n3);
            this.d.method_5447(n, class065844);
            if (class065844.c() >= n2) break;
        }
    }

    public int W() {
        return this.d.L();
    }

    public void R(int n) {
        this.l.N(n);
    }
}

