/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00263
 *  minecraft.class01015
 *  minecraft.class02741
 *  minecraft.class03729
 *  minecraft.class04056
 *  minecraft.class04393
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05838
 *  minecraft.class05845
 *  minecraft.class05851
 *  minecraft.class05853
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06910
 *  minecraft.class06923
 *  minecraft.class06937
 *  minecraft.class06941
 *  minecraft.class07075
 *  minecraft.class07299
 *  minecraft.class07313
 *  minecraft.class08036
 *  minecraft.class08044
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import minecraft.class00263;
import minecraft.class01015;
import minecraft.class02741;
import minecraft.class03729;
import minecraft.class04056;
import minecraft.class04393;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05838;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05853;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06910;
import minecraft.class06923;
import minecraft.class06937;
import minecraft.class06941;
import minecraft.class07075;
import minecraft.class07299;
import minecraft.class07313;
import minecraft.class07481;
import minecraft.class07483;
import minecraft.class07503;
import minecraft.class08036;
import minecraft.class08044;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public abstract class class07476
extends class06923 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    public static final int u = 3;
    public static final int i = 4;
    private static final int v = 3;
    private static final int n = 30;
    private static final int t = 30;
    private static final int G = 39;
    final class06695 R;
    private final class05845 l;
    protected final class07299 j;
    private final class05838<? extends class07313> d;
    private final class00263 w;
    private final class01015 k;

    protected boolean L(class06584 class065842) {
        return this.j.method_61269().N(class065842);
    }

    public class01015 P() {
        return this.k;
    }

    protected class07476(class05851<?> class058512, class05838<? extends class07313> class058382, class05946<class00263> class059462, class01015 class010152, int n, class08044 class080442) {
        this(class058512, class058382, class059462, class010152, n, class080442, (class06695)new class07075(3), (class05845)new class05853(4));
    }

    protected class07476(class05851<?> class058512, class05838<? extends class07313> class058382, class05946<class00263> class059462, class01015 class010152, int n, class08044 class080442, class06695 class066952, class05845 class058452) {
        super(class058512, n);
        this.d = class058382;
        this.k = class010152;
        class07476.N((class06695)class066952, (int)3);
        class07476.N((class05845)class058452, (int)4);
        this.R = class066952;
        this.l = class058452;
        this.j = class080442.z.method_73183();
        this.w = this.j.method_8433().N(class059462);
        this.N(new class06937(class066952, 0, 56, 17));
        this.N(new class07483(this, class066952, 1, 56, 53));
        this.N(new class07481(class080442.z, class066952, 2, 116, 35));
        this.L((class06695)class080442, 8, 84);
        this.N(class058452);
    }

    public boolean s() {
        return this.l.N(0) > 0;
    }

    public float m() {
        int n = this.l.N(1);
        if (n == 0) {
            n = 200;
        }
        return class04995.N((float)((float)this.l.N(0) / (float)n), (float)0.0f, (float)1.0f);
    }

    private boolean y(class07476 class074762, class06584 class065842) {
        return this.L(class065842) && ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_2_1tor1_2_3);
    }

    protected boolean y(class06584 class065842) {
        return this.w.N(class065842);
    }

    public class06937 E() {
        return (class06937)this.T.get(2);
    }

    public void N(class02741 class027412) {
        if (this.R instanceof class06941) {
            ((class06941)this.R).N(class027412);
        }
    }

    private boolean N(class07476 class074762, class06584 class065842) {
        return this.y(class065842) && ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_2_1tor1_2_3);
    }

    public class06910 N(boolean bl, boolean bl2, class03729<?> class037292, class04782 class047822, class08044 class080442) {
        List<class06937> list = List.of(this.L(0), this.L(2));
        class03729<?> class037293 = class037292;
        return class04393.N((class04056)new class07503(this, list, class047822), (int)1, (int)1, List.of(this.L(0)), list, (class08044)class080442, class037293, (boolean)bl, (boolean)bl2);
    }

    public boolean N(class08036 class080362) {
        return this.R.method_5443(class080362);
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843;
            class07476 class074762;
            class06584 class065844 = class069372.i();
            class065842 = class065844.t();
            if (n == 2) {
                if (!this.N(class065844, 3, 39, true)) {
                    return class06584.E;
                }
                class069372.y(class065844, class065842);
            } else if (n == 1 || n == 0 ? !this.N(class065844, 3, 39, false) : (this.N(class074762 = this, class065843 = class065844) ? !this.N(class065844, 0, 1, false) : (this.y(class074762 = this, class065843 = class065844) ? !this.N(class065844, 1, 2, false) : (n >= 3 && n < 30 ? !this.N(class065844, 30, 39, false) : n >= 30 && n < 39 && !this.N(class065844, 3, 30, false))))) {
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
        }
        return class065842;
    }

    public float W() {
        int n = this.l.N(2);
        int n2 = this.l.N(3);
        if (n2 == 0 || n == 0) {
            return 0.0f;
        }
        return class04995.N((float)((float)n / (float)n2), (float)0.0f, (float)1.0f);
    }
}

