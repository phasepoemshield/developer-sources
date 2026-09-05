/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.recipe.Recipes1_11_2
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00496
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01015
 *  minecraft.class01929
 *  minecraft.class02763
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03507
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05838
 *  minecraft.class05851
 *  minecraft.class05857
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00496;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01015;
import minecraft.class01929;
import minecraft.class02763;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03507;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05838;
import minecraft.class05851;
import minecraft.class05857;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07485
extends class02763 {
    private static final int y = 3;
    private static final int L = 3;
    public static final int N = 0;
    private static final int u = 1;
    private static final int i = 9;
    private static final int R = 10;
    private static final int j = 10;
    private static final int v = 37;
    private static final int n = 37;
    private static final int t = 46;
    private final class05880 G;
    private final class08036 l;
    private boolean d;

    public class01015 P() {
        return class01015.field_25763;
    }

    public class07485(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class07485(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17333, n, 3, 3);
        this.G = class058802;
        this.l = class080442.z;
        this.N(this.l, 124, 35);
        this.u(30, 17);
        this.L((class06695)class080442, 8, 84);
    }

    protected class08036 s() {
        return this.l;
    }

    public List<class06937> m() {
        return this.T.subList(1, 10);
    }

    public void y(class06695 class066952) {
        this.N(class066952, null);
        if (!this.d) {
            this.G.N_53((class072992, class072092) -> {
                if (class072992 instanceof class04782) {
                    class04782 class047822 = (class04782)class072992;
                    class07485.N((class07482)((Object)this), class047822, this.l, this.I, this.J, null);
                }
            });
        }
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.G.N_53((class072992, class072092) -> this.N(class080362, (class06695)this.I));
    }

    public void E() {
        this.d = true;
    }

    private boolean N(class07485 class074852, class06584 class065842, int n, int n2, boolean bl) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_4) && this.N(class065842, n, n2, bl);
    }

    private void N(class06695 class066952, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            Recipes1_11_2.setCraftingResultSlot((int)this.b, (class07482)((Object)this), (class03507)this.I);
        }
    }

    public void N(class04782 class047822, class03729<class05857> class037292) {
        this.d = false;
        class07485.N((class07482)((Object)this), class047822, this.l, this.I, this.J, class037292);
    }

    protected static void N(class07482 class074822, class04782 class047822, class08036 class080362, class03507 class035072, class06919 class069192, @Nullable class03729<class05857> class037292) {
        class02903 class029032 = class035072.u();
        class04770 class047702 = (class04770)class080362;
        class06584 class065842 = class06584.E;
        Optional var9 = class047822.method_8503().yM().N(class05838.N, (class02950)class029032, (class07299)class047822, class037292);
        if (var9.isPresent()) {
            class06584 class065843;
            class03729 var10 = (class03729)var9.get();
            class05857 class058572 = (class05857)var10.y();
            if (class069192.N(class047702, var10) && (class065843 = class058572.method_8116((class02950)class029032, (class01929)class047822.method_30349())).N(class047822.method_45162())) {
                class065842 = class065843;
            }
        }
        class069192.method_5447(0, class065842);
        class074822.N(0, class065842);
        class047702.field_13987.method_14364((class00381)new class00496(class074822.b, class074822.U(), 0, class065842));
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            boolean bl;
            int n2;
            int n3;
            class06584 class065843;
            class07485 class074852;
            class06584 class065844 = class069372.i();
            class065842 = class065844.t();
            if (n == 0) {
                class065844.B().L(class065844, class080362);
                if (!this.N(class065844, 10, 46, true)) {
                    return class06584.E;
                }
                class069372.y(class065844, class065842);
            } else if (n >= 10 && n < 46 ? !this.N(class074852 = this, class065843 = class065844, n3 = 1, n2 = 10, bl = false) && (n < 37 ? !this.N(class065844, 37, 46, false) : !this.N(class065844, 10, 37, false)) : !this.N(class065844, 10, 46, false)) {
                return class06584.E;
            }
            if (class065844.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
            if (class065844.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065844);
            if (n == 0) {
                class080362.method_7328(class065844, false);
            }
        }
        return class065842;
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != this.J && super.N(class065842, class069372);
    }

    public boolean N(class08036 class080362) {
        return class07485.N((class05880)this.G, (class08036)class080362, (class00891)class00869.LD);
    }

    public class06937 W() {
        return (class06937)this.T.get(0);
    }
}

