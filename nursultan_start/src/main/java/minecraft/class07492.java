/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.recipe.Recipes1_11_2
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01015
 *  minecraft.class01894
 *  minecraft.class02763
 *  minecraft.class02932
 *  minecraft.class03507
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07043
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import minecraft.class01015;
import minecraft.class01894;
import minecraft.class02763;
import minecraft.class02932;
import minecraft.class03507;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07043;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07485;
import minecraft.class07516;
import minecraft.class08036;
import minecraft.class08044;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07492
extends class02763 {
    public static final int N = 0;
    public static final int y = 0;
    private static final int o = 2;
    private static final int q = 2;
    public static final int L = 1;
    public static final int u = 4;
    public static final int i = 5;
    public static final int R = 5;
    public static final int j = 4;
    public static final int v = 9;
    public static final int n = 9;
    public static final int t = 36;
    public static final int G = 36;
    public static final int l = 45;
    public static final int d = 45;
    public static final class01894 w = class01894.y((String)"container/slot/helmet");
    public static final class01894 k = class01894.y((String)"container/slot/chestplate");
    public static final class01894 Y = class01894.y((String)"container/slot/leggings");
    public static final class01894 Q = class01894.y((String)"container/slot/boots");
    public static final class01894 O = class01894.y((String)"container/slot/shield");
    private static final Map<class07085, class01894> K = Map.of(class07085.field_6166, Q, class07085.field_6172, Y, class07085.field_6174, k, class07085.field_6169, w);
    private static final class07085[] V = new class07085[]{class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166};
    public final boolean g;
    private final class08036 e;

    public class01015 P() {
        return class01015.field_25763;
    }

    public class03507 T() {
        return this.I;
    }

    public class07492(class08044 class080442, boolean bl, class08036 class080362) {
        super(null, 0, 2, 2);
        this.g = bl;
        this.e = class080362;
        this.N(class080362, 154, 28);
        this.u(98, 18);
        for (int i = 0; i < 4; ++i) {
            class07085 class070852 = V[i];
            class01894 class018942 = K.get(class070852);
            this.N((class06937)new class02932((class06695)class080442, (class07438)class080362, class070852, 39 - i, 8, 8 + i * 18, class018942));
        }
        this.L((class06695)class080442, 8, 84);
        class07516 class075162 = new class07516(this, (class06695)class080442, 40, 77, 62, class080362);
        class07492 class074922 = this;
        this.N(class074922, (class06937)class075162);
    }

    protected class08036 s() {
        return this.e;
    }

    public List<class06937> m() {
        return this.T.subList(1, 5);
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.J.method_5448();
        if (class080362.method_73183().method_8608()) {
            return;
        }
        this.N(class080362, (class06695)this.I);
    }

    public void y(class06695 class066952) {
        this.N(class066952, null);
        class07299 class072992 = this.e.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class07485.N((class07482)((Object)this), class047822, this.e, this.I, this.J, null);
        }
    }

    private class06937 N(class07492 class074922, class06937 class069372) {
        return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? null : this.N(class069372);
    }

    public static boolean N(int n) {
        return n >= 36 && n < 45 || n == 45;
    }

    public boolean N(class08036 class080362) {
        return true;
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372.R()) {
            int n2;
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            class07085 class070852 = class080362.method_32326(class065842);
            if (n == 0) {
                if (!this.N(class065843, 9, 45, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n >= 1 && n < 5 ? !this.N(class065843, 9, 45, false) : (n >= 5 && n < 9 ? !this.N(class065843, 9, 45, false) : (class070852.N() == class07043.field_6178 && !((class06937)this.T.get(8 - class070852.y())).R() ? !this.N(class065843, n2 = 8 - class070852.y(), n2 + 1, false) : (class070852 == class07085.field_6171 && !((class06937)this.T.get(45)).R() ? !this.N(class065843, 45, 46, false) : (n >= 9 && n < 36 ? !this.N(class065843, 36, 45, false) : (n >= 36 && n < 45 ? !this.N(class065843, 9, 36, false) : !this.N(class065843, 9, 45, false))))))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.N(class06584.E, class065842);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
            if (n == 0) {
                class080362.method_7328(class065843, false);
            }
        }
        return class065842;
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != this.J && super.N(class065842, class069372);
    }

    private void N(class06695 class066952, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            Recipes1_11_2.setCraftingResultSlot((int)this.b, (class07482)((Object)this), (class03507)this.I);
        }
    }

    public class06937 W() {
        return (class06937)this.T.get(0);
    }
}

