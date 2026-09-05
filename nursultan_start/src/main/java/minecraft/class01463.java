/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09665
 *  Nursultan.class10951
 *  Nursultan.class10964
 *  Nursultan.class11368
 *  Nursultan.class11938
 *  com.google.common.collect.Sets
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02408
 *  minecraft.class02457
 *  minecraft.class02484
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05868
 *  minecraft.class06202
 *  minecraft.class06357
 *  minecraft.class06428
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.joml.Matrix3x2fStack
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09665;
import Nursultan.class10951;
import Nursultan.class10964;
import Nursultan.class11368;
import Nursultan.class11938;
import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01441;
import minecraft.class01894;
import minecraft.class02408;
import minecraft.class02457;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05868;
import minecraft.class06202;
import minecraft.class06357;
import minecraft.class06428;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public abstract class class01463<T extends class07482>
extends class05096
implements class09665,
class05868<T> {
    public static final class01894 i = class01894.y((String)"textures/gui/container/inventory.png");
    private static final class01894 N = class01894.y((String)"container/slot_highlight_back");
    private static final class01894 y = class01894.y((String)"container/slot_highlight_front");
    protected static final int R = 256;
    protected static final int M = 256;
    private static final float L = 100.0f;
    private static final int u = 500;
    protected int B = 176;
    protected int Z = 166;
    protected int z;
    protected int U;
    protected int E;
    protected int W;
    private final List<class02457> n;
    protected final T m;
    protected final class00392 P;
    protected @Nullable class06937 s;
    private @Nullable class06937 t;
    private @Nullable class06937 G;
    private @Nullable class06937 l;
    private @Nullable class01441 d;
    protected int T;
    protected int b;
    private boolean w;
    private class06584 k = class06584.E;
    private long Y;
    protected final Set<class06937> j = Sets.newHashSet();
    protected boolean v;
    private int Q;
    private int O;
    private boolean g;
    private int I;
    private boolean J;
    private class06584 o = class06584.E;

    public void L(class01054 class010542, int n, int n2) {
        class06584 class065842;
        class06584 class065843 = class065842 = this.k.R() ? this.m.M() : this.k;
        if (!class065842.R()) {
            int n3 = 8;
            int n4 = this.k.R() ? 8 : 16;
            String string = null;
            if (!this.k.R() && this.w) {
                class065842 = class065842.L(class04995.u((float)((float)class065842.c() / 2.0f)));
            } else if (this.v && this.j.size() > 1 && (class065842 = class065842.L(this.I)).R()) {
                string = String.valueOf(class06541.field_1054) + "0";
            }
            class010542.L();
            this.N(class010542, class065842, n - 8, n2 - n4, string);
        }
    }

    private void L(class01054 class010542) {
        if (this.s != null && this.s.Z()) {
            class010542.N(class08394.Na, y, this.s.i - 4, this.s.R - 4, 24, 24);
        }
    }

    public class01463(T t, class08044 class080442, class00392 class003922) {
        super(class003922);
        this.m = t;
        this.P = class080442.method_5476();
        this.g = true;
        this.z = 8;
        this.U = 6;
        this.E = 8;
        this.W = this.Z - 94;
        this.n = new ArrayList<class02457>();
    }

    public void Z() {
        this.k = class06584.E;
        this.t = null;
    }

    public /* synthetic */ int U() {
        return this.O;
    }

    public /* synthetic */ boolean z() {
        return this.v;
    }

    protected void u(class01054 class010542, int n, int n2) {
        class010542.N(this.field_22793, this.field_22785, this.z, this.U, -12566464, false);
        class010542.N(this.field_22793, this.P, this.E, this.W, -12566464, false);
    }

    protected void u() {
    }

    private @Nullable class06937 y(double d, double d2) {
        for (class06937 class069372 : ((class07482)this.m).T) {
            if (!class069372.N() || !this.N(class069372, d, d2)) continue;
            return class069372;
        }
        return null;
    }

    private void y(class06613 class066132, double d, double d2, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.r1_5tor1_5_1)) {
            callbackInfoReturnable.setReturnValue((Object)super.method_25403(class066132, d, d2));
        }
    }

    public /* synthetic */ void y(boolean bl) {
        this.g = bl;
    }

    private boolean y(class06613 class066132) {
        return class066132.W() && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_6_1);
    }

    public /* synthetic */ void y(class06937 class069372, int n, int n2, class07510 class075102) {
        this.N(class069372, n, n2, class075102);
    }

    private boolean y(class06584 class065842) {
        return class065842.N().map(class06357::N).map(class06357::N).orElse(false);
    }

    private void y(class01054 class010542) {
        if (this.s != null && this.s.Z()) {
            class010542.N(class08394.Na, N, this.s.i - 4, this.s.R - 4, 24, 24);
        }
    }

    public T E() {
        return this.m;
    }

    private void N(class06613 class066132, CallbackInfoReturnable callbackInfoReturnable) {
        if (super.method_25406(class066132)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private void N(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo) {
        class10951 class109512 = class10951.N((class01054)class010542, (String)class06541.N((String)this.method_25440().getString()));
        class11938.L().L((Object)class109512);
    }

    private void N(class06613 class066132, double d, double d2, CallbackInfoReturnable callbackInfoReturnable) {
        if (super.method_25403(class066132, d, d2)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    protected void N(int n, int n2, boolean bl) {
        ((class03443)this.field_22787.T_2).N(n, n2, bl);
    }

    protected boolean N(class06601 class066012) {
        if (this.m.M().R() && this.s != null) {
            if (((class05630)this.field_22787.i_7).Q.N(class066012)) {
                this.N(this.s, this.s.u, 40, class07510.field_7791);
                return true;
            }
            for (int i = 0; i < 9; ++i) {
                class06428 class064282 = ((class05630)this.field_22787.i_7).f[i];
                class06601 class066013 = class066012;
                if (!this.N(class064282, class066013)) continue;
                this.N(this.s, this.s.u, i, class07510.field_7791);
                return true;
            }
        }
        return false;
    }

    private void N(class06937 class069372) {
        if (class069372.R()) {
            for (class02457 class024572 : this.n) {
                if (!class024572.N(class069372)) continue;
                class024572.y(class069372);
            }
        }
    }

    protected void N(class01054 class010542, int n, int n2) {
        for (class06937 class069372 : ((class07482)this.m).T) {
            if (!class069372.N()) continue;
            this.N(class010542, class069372, n, n2);
        }
    }

    private boolean N(class01463 class014632, class06937 class069372, int n, int n2, class07510 class075102) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_2);
    }

    private boolean N(class06428 class064282, class06601 class066012) {
        return class064282.N(class066012) && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_2);
    }

    public /* synthetic */ class06937 N(double d, double d2) {
        return this.y(d, d2);
    }

    protected void N(class02457 class024572) {
        this.n.add(class024572);
    }

    public /* synthetic */ void N(boolean bl) {
        this.v = bl;
    }

    private void N(class01054 class010542, int n, int n2, CallbackInfo callbackInfo) {
        class10964 class109642 = class10964.N((class01054)class010542, (class06584)this.s.i(), (int)n, (int)n2);
        class11938.L().L((Object)class109642);
        if (class109642.y()) {
            callbackInfo.cancel();
        }
    }

    private void N(class06937 class069372, int n, int n2, class07510 class075102, CallbackInfo callbackInfo) {
        class11368 class113682 = class11368.N((int)((class07482)this.m).b, (int)n, (int)n2, (class06937)class069372, (class07510)class075102, this.m);
        class11938.L().L((Object)class113682);
        if (class113682.y()) {
            callbackInfo.cancel();
        }
    }

    public void N(class01054 class010542) {
        if (this.d != null) {
            float f = class04995.N((float)((float)(class07536.L() - this.d.u()) / 100.0f), (float)0.0f, (float)1.0f);
            int n = this.d.L().x - this.d.y().x;
            int n2 = this.d.L().y - this.d.y().y;
            int n3 = this.d.y().x + (int)((float)n * f);
            int n4 = this.d.y().y + (int)((float)n2 * f);
            class010542.L();
            this.N(class010542, this.d.N(), n3, n4, null);
            if (f >= 1.0f) {
                this.d = null;
            }
        }
    }

    public void N(class01054 class010542, int n, int n2, float f) {
        int n3 = this.T;
        int n4 = this.b;
        super.method_25394(class010542, n, n2, f);
        class010542.i().pushMatrix();
        class010542.i().translate((float)n3, (float)n4);
        this.u(class010542, n, n2);
        class06937 class069372 = this.s;
        this.s = this.y(n, n2);
        this.y(class010542);
        this.N(class010542, n, n2);
        this.L(class010542);
        if (class069372 != null && class069372 != this.s) {
            this.N(class069372);
        }
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        this.N(class010542, n, n2, f, null);
        matrix3x2fStack.popMatrix();
    }

    private void N(class01054 class010542, class06584 class065842, int n, int n2, @Nullable String string) {
        class010542.N(class065842, n, n2);
        class010542.N(this.field_22793, class065842, n, n2 - (this.k.R() ? 0 : 8), string);
    }

    protected List<class00392> N(class06584 class065842) {
        return class01463.method_25408((class06202)this.field_22787, (class06584)class065842);
    }

    private boolean N(class06937 class069372, double d, double d2) {
        return this.N(class069372.i, class069372.R, 16, 16, d, d2);
    }

    protected void N(class01054 class010542, class06937 class069372, int n, int n2) {
        class01894 class018942;
        int n3;
        int n4 = class069372.i;
        int n5 = class069372.R;
        class06584 class065842 = class069372.i();
        boolean bl = false;
        boolean bl2 = class069372 == this.t && !this.k.R() && !this.w;
        class06584 class065843 = this.m.M();
        String string = null;
        if (class069372 == this.t && !this.k.R() && this.w && !class065842.R()) {
            class065842 = class065842.L(class065842.c() / 2);
        } else if (this.v && this.j.contains(class069372) && !class065843.R()) {
            if (this.j.size() == 1) {
                return;
            }
            if (class07482.N((class06937)class069372, (class06584)class065843, (boolean)true) && this.m.y(class069372)) {
                bl = true;
                n3 = Math.min(class065843.U(), class069372.b_(class065843));
                int n6 = class069372.i().R() ? 0 : class069372.i().c();
                int n7 = class07482.N(this.j, (int)this.Q, (class06584)class065843) + n6;
                if (n7 > n3) {
                    n7 = n3;
                    string = class06541.field_1054.toString() + n3;
                }
                class065842 = class065843.L(n7);
            } else {
                this.j.remove(class069372);
                this.N();
            }
        }
        if (class065842.R() && class069372.N() && (class018942 = class069372.L()) != null) {
            class010542.N(class08394.Na, class018942, n4, n5, 16, 16);
            bl2 = true;
        }
        if (!bl2) {
            if (bl) {
                class010542.N(n4, n5, n4 + 16, n5 + 16, -2130706433);
            }
            n3 = class069372.i + class069372.R * this.B;
            if (class069372.u()) {
                class010542.y(class065842, n4, n5, n3);
            } else {
                class010542.N(class065842, n4, n5, n3);
            }
            class010542.N(this.field_22793, class065842, n4, n5, string);
        }
    }

    private void N() {
        class06584 class065842 = this.m.M();
        if (class065842.R() || !this.v) {
            return;
        }
        if (this.Q == 2) {
            this.I = class065842.U();
            return;
        }
        this.I = class065842.c();
        for (class06937 class069372 : this.j) {
            class06584 class065843 = class069372.i();
            int n = class065843.R() ? 0 : class065843.c();
            int n2 = Math.min(class065842.U(), class069372.b_(class065842));
            int n3 = Math.min(class07482.N(this.j, (int)this.Q, (class06584)class065842) + n, n2);
            this.I -= n3 - n;
        }
    }

    protected abstract void N(class01054 var1, float var2, int var3, int var4);

    private void N(class06613 class066132) {
        if (this.s != null && this.m.M().R()) {
            if (((class05630)this.field_22787.i_7).Q.N(class066132)) {
                this.N(this.s, this.s.u, 40, class07510.field_7791);
                return;
            }
            for (int i = 0; i < 9; ++i) {
                if (!((class05630)this.field_22787.i_7).f[i].N(class066132)) continue;
                this.N(this.s, this.s.u, i, class07510.field_7791);
            }
        }
    }

    protected boolean N(double d, double d2, int n, int n2) {
        return d < (double)n || d2 < (double)n2 || d >= (double)(n + this.B) || d2 >= (double)(n2 + this.Z);
    }

    public void N(@Nullable class06937 class069372, class07510 class075102) {
        if (class069372 != null && class069372.R()) {
            for (class02457 class024572 : this.n) {
                if (!class024572.N(class069372)) continue;
                class024572.N(class069372, class075102);
            }
        }
    }

    protected boolean N(int n, int n2, int n3, int n4, double d, double d2) {
        int n5 = this.T;
        int n6 = this.b;
        return (d -= (double)n5) >= (double)(n - 1) && d < (double)(n + n3 + 1) && (d2 -= (double)n6) >= (double)(n2 - 1) && d2 < (double)(n2 + n4 + 1);
    }

    protected void N(class06937 class069372, int n, int n2, class07510 class075102) {
        if (class069372 != null) {
            n = class069372.u;
        }
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class069372, n, n2, class075102, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class069372, class075102);
        ((class03443)this.field_22787.T_2).N(((class07482)this.m).b, n, n2, class075102, (class08036)((class04453)this.field_22787.T_4));
    }

    public void method_25426() {
        this.T = (this.field_22789 - this.B) / 2;
        this.b = (this.field_22790 - this.Z) / 2;
        this.n.clear();
        this.N((class02457)new class02408(this.field_22787));
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        if (((class05630)this.field_22787.i_7).Y.N(class066012)) {
            this.method_25419();
            return true;
        }
        this.N(class066012);
        if (this.s != null && this.s.R()) {
            if (((class05630)this.field_22787.i_7).J.N(class066012)) {
                class01463 class014632 = this;
                class06937 class069372 = this.s;
                int n = this.s.u;
                int n2 = 0;
                class07510 class075102 = class07510.field_7796;
                if (this.N(class014632, class069372, n, n2, class075102)) {
                    class014632.N(class069372, n, n2, class075102);
                }
            } else if (((class05630)this.field_22787.i_7).O.N(class066012)) {
                this.N(this.s, this.s.u, class066012.m() ? 1 : 0, class07510.field_7795);
            }
        }
        return false;
    }

    public final void method_25393() {
        super.method_25393();
        if (!((class04453)this.field_22787.T_4).method_5805() || ((class04453)this.field_22787.T_4).method_31481()) {
            ((class04453)this.field_22787.T_4).method_7346();
        } else {
            this.u();
        }
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25432() {
        if ((class04453)this.field_22787.T_4 == null) {
            return;
        }
        this.m.y((class08036)((class04453)this.field_22787.T_4));
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        this.N(class010542, f, n, n2);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.N(class010542, n, n2, f);
        this.L(class010542, n, n2);
        this.N(class010542);
    }

    public void method_25419() {
        ((class04453)this.field_22787.T_4).method_7346();
        if (this.s != null) {
            this.N(this.s);
        }
        super.method_25419();
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class066132, d, d2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.y(class066132, d, d2, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return callbackInfoReturnable2.getReturnValueZ();
        }
        class06937 class069372 = this.y(class066132.n(), class066132.t());
        class06584 class065842 = this.m.M();
        if (this.t != null && ((Boolean)((class05630)this.field_22787.i_7).Nm().method_41753()).booleanValue()) {
            if (class066132.v() == 0 || class066132.v() == 1) {
                if (this.k.R()) {
                    if (class069372 != this.t && !this.t.i().R()) {
                        this.k = this.t.i().t();
                    }
                } else if (this.k.c() > 1 && class069372 != null && class07482.N((class06937)class069372, (class06584)this.k, (boolean)false)) {
                    long l = class07536.L();
                    if (this.G == class069372) {
                        if (l - this.Y > 500L) {
                            this.N(this.t, this.t.u, 0, class07510.field_7790);
                            this.N(class069372, class069372.u, 1, class07510.field_7790);
                            this.N(this.t, this.t.u, 0, class07510.field_7790);
                            this.Y = l + 750L;
                            this.k.B(1);
                        }
                    } else {
                        this.G = class069372;
                        this.Y = l;
                    }
                }
            }
            return true;
        }
        if (this.v && class069372 != null && !class065842.R() && (class065842.c() > this.j.size() || this.Q == 2) && class07482.N((class06937)class069372, (class06584)class065842, (boolean)true) && class069372.N(class065842) && this.m.y(class069372)) {
            this.j.add(class069372);
            this.N();
            return true;
        }
        if (class069372 == null && this.m.M().R()) {
            return super.method_25403(class066132, d, d2);
        }
        return true;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.s != null && this.s.R()) {
            for (class02457 class024572 : this.n) {
                if (!class024572.N(this.s) || !class024572.N(d3, d4, this.s.u, this.s.i())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class066132, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class06937 class069372 = this.y(class066132.n(), class066132.t());
        int n = this.T;
        int n2 = this.b;
        boolean bl = this.N(class066132.n(), class066132.t(), n, n2);
        int n3 = -1;
        if (class069372 != null) {
            n3 = class069372.u;
        }
        if (bl) {
            n3 = -999;
        }
        if (this.J && class069372 != null && class066132.v() == 0 && this.m.N(class06584.E, class069372)) {
            class06613 class066133 = class066132;
            if (this.y(class066133)) {
                if (!this.o.R()) {
                    for (class06937 class069373 : ((class07482)this.m).T) {
                        if (class069373 == null || !class069373.N((class08036)((class04453)this.field_22787.T_4)) || !class069373.R() || class069373.L != class069372.L || !class07482.N((class06937)class069373, (class06584)this.o, (boolean)true)) continue;
                        this.N(class069373, class069373.u, class066132.v(), class07510.field_7794);
                    }
                }
            } else {
                this.N(class069372, n3, class066132.v(), class07510.field_7793);
            }
            this.J = false;
        } else {
            if (this.v && this.O != class066132.v()) {
                this.v = false;
                this.j.clear();
                this.g = true;
                return true;
            }
            if (this.g) {
                this.g = false;
                return true;
            }
            if (this.t != null && ((Boolean)((class05630)this.field_22787.i_7).Nm().method_41753()).booleanValue()) {
                if (class066132.v() == 0 || class066132.v() == 1) {
                    if (this.k.R() && class069372 != this.t) {
                        this.k = this.t.i();
                    }
                    boolean bl2 = class07482.N((class06937)class069372, (class06584)this.k, (boolean)false);
                    if (n3 != -1 && !this.k.R() && bl2) {
                        this.N(this.t, this.t.u, class066132.v(), class07510.field_7790);
                        this.N(class069372, n3, 0, class07510.field_7790);
                        if (this.m.M().R()) {
                            this.d = null;
                        } else {
                            this.N(this.t, this.t.u, class066132.v(), class07510.field_7790);
                            this.d = new class01441(this.k, new Vector2i((int)class066132.n(), (int)class066132.t()), new Vector2i(this.t.i + n, this.t.R + n2), class07536.L());
                        }
                    } else if (!this.k.R()) {
                        this.d = new class01441(this.k, new Vector2i((int)class066132.n(), (int)class066132.t()), new Vector2i(this.t.i + n, this.t.R + n2), class07536.L());
                    }
                    this.Z();
                }
            } else if (this.v && !this.j.isEmpty()) {
                this.N(null, -999, class07482.L((int)0, (int)this.Q), class07510.field_7789);
                for (class06937 class069374 : this.j) {
                    this.N(class069374, class069374.u, class07482.L((int)1, (int)this.Q), class07510.field_7789);
                }
                this.N(null, -999, class07482.L((int)2, (int)this.Q), class07510.field_7789);
            } else if (!this.m.M().R()) {
                if (((class05630)this.field_22787.i_7).J.N(class066132)) {
                    this.N(class069372, n3, class066132.v(), class07510.field_7796);
                } else {
                    class06613 class066134;
                    boolean bl3;
                    boolean bl4 = bl3 = n3 != -999 && this.y(class066134 = class066132);
                    if (bl3) {
                        this.o = class069372 != null && class069372.R() ? class069372.i().t() : class06584.E;
                    }
                    this.N(class069372, n3, class066132.v(), bl3 ? class07510.field_7794 : class07510.field_7790);
                }
            }
        }
        this.v = false;
        return true;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (super.method_25402(class066132, bl)) {
            return true;
        }
        boolean bl2 = ((class05630)this.field_22787.i_7).J.N(class066132) && ((class04453)this.field_22787.T_4).method_56992();
        class06937 class069372 = this.y(class066132.n(), class066132.t());
        this.J = this.l == class069372 && bl;
        this.g = false;
        if (class066132.v() == 0 || class066132.v() == 1 || bl2) {
            int n = this.T;
            int n2 = this.b;
            boolean bl3 = this.N(class066132.n(), class066132.t(), n, n2);
            int n3 = -1;
            if (class069372 != null) {
                n3 = class069372.u;
            }
            if (bl3) {
                n3 = -999;
            }
            if (((Boolean)((class05630)this.field_22787.i_7).Nm().method_41753()).booleanValue() && bl3 && this.m.M().R()) {
                this.method_25419();
                return true;
            }
            if (n3 != -1) {
                if (((Boolean)((class05630)this.field_22787.i_7).Nm().method_41753()).booleanValue()) {
                    if (class069372 != null && class069372.R()) {
                        this.t = class069372;
                        this.k = class06584.E;
                        this.w = class066132.v() == 1;
                    } else {
                        this.t = null;
                    }
                } else if (!this.v) {
                    if (this.m.M().R()) {
                        if (bl2) {
                            this.N(class069372, n3, class066132.v(), class07510.field_7796);
                        } else {
                            class06613 class066133;
                            boolean bl4 = n3 != -999 && this.y(class066133 = class066132);
                            class07510 class075102 = class07510.field_7790;
                            if (bl4) {
                                this.o = class069372 != null && class069372.R() ? class069372.i().t() : class06584.E;
                                class075102 = class07510.field_7794;
                            } else if (n3 == -999) {
                                class075102 = class07510.field_7795;
                            }
                            this.N(class069372, n3, class066132.v(), class075102);
                        }
                        this.g = true;
                    } else {
                        this.v = true;
                        this.O = class066132.v();
                        this.j.clear();
                        if (class066132.v() == 0) {
                            this.Q = 0;
                        } else if (class066132.v() == 1) {
                            this.Q = 1;
                        } else if (bl2) {
                            this.Q = 2;
                        }
                    }
                }
            }
        } else {
            this.N(class066132);
        }
        this.l = class069372;
        return true;
    }

    protected void a_(class01054 class010542, int n, int n2) {
        if (this.s == null || !this.s.R()) {
            return;
        }
        class06584 class065842 = this.s.i();
        if (this.m.M().R() || this.y(class065842)) {
            List<class00392> list = this.N(class065842);
            Optional optional = class065842.N();
            class01894 class018942 = (class01894)class065842.method_58694(class02484.V);
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(class010542, n, n2, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class010542.N(this.field_22793, list, optional, n, n2, class018942);
        }
    }
}

