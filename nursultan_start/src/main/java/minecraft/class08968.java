/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02733
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08153
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02733;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08153;
import minecraft.class08713;
import minecraft.class08791;
import minecraft.class08951;
import minecraft.class08960;
import minecraft.class08972;
import minecraft.class08990;
import org.jspecify.annotations.Nullable;

public class class08968
extends class07796
implements class06084,
class08960,
class08990 {
    public static final MapCodec<class08968> N = class08968.y(class08968::new);
    public static final class06667 y = class06665.k;
    public static final class08064<class07211> L = class06665.f;
    public static final class08064<class08972> u = class06665.Nz;
    public static final class06667 i = class06665.q;
    private static final Map<class07211, class00494> R = class00389.L((class00494)class00389.N((class00494)class00891.N((double)0.0, (double)12.0, (double)11.0, (double)16.0, (double)16.0, (double)13.0), (class00494[])new class00494[]{class00891.N((double)0.0, (double)0.0, (double)13.0, (double)16.0, (double)16.0, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)4.0, (double)13.0)}));

    @Override
    public int L() {
        return 3;
    }

    @Override
    public class07211 M(class00500 class005002) {
        return (class07211)class005002.L(L);
    }

    public class08968(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11043)).y((class08092)y, (Comparable)Boolean.valueOf(false))).y(u, (Comparable)((Object)class08972.field_61446))).y((class08092)i, (Comparable)Boolean.valueOf(false)));
    }

    @Override
    public boolean B(class00500 class005002) {
        return class005002.N(class01210.m) && class005002.y((class08092)y) && (Boolean)class005002.L((class08092)y) != false;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    @Override
    public int u() {
        return 3;
    }

    @Override
    public int y() {
        return 1;
    }

    @Override
    public class00500 N(class00500 class005002, class08972 class089722) {
        return (class00500)class005002.y(u, (Comparable)((Object)class089722));
    }

    private boolean N(class07299 class072992, class07209 class072092, class08044 class080442) {
        List var4 = this.N((class07284)class072992, class072092);
        if (var4.isEmpty()) {
            return false;
        }
        boolean bl = false;
        for (int i = 0; i < var4.size(); ++i) {
            class08951 class089512 = (class08951)class072992.method_8321((class07209)var4.get(i));
            if (class089512 == null) continue;
            for (int j = 0; j < class089512.method_5439(); ++j) {
                int n = 9 - (var4.size() - i) * class089512.method_5439() + j;
                if (n < 0 || n > class080442.method_5439()) continue;
                class06584 class065842 = class080442.method_5441(n);
                class06584 class065843 = class089512.y(j, class065842);
                if (class065842.R() && class065843.R()) continue;
                class080442.method_5447(n, class065843);
                bl = true;
            }
            class080442.method_5431();
            class089512.N((class03529<class01194>)class01194.b);
        }
        return bl;
    }

    private boolean N(class06584 class065842) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_11) && class065842.R();
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        if (class072992.method_8608()) {
            return 0;
        }
        if (class072112 != ((class07211)class005002.L(L)).b()) {
            return 0;
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class08951) {
            class08951 class089512 = (class08951)class003942;
            int n = class089512.method_5438(0).R() ? 0 : 1;
            int n2 = class089512.method_5438(1).R() ? 0 : 1;
            int n3 = class089512.method_5438(2).R() ? 0 : 1;
            return n | n2 << 1 | n3 << 2;
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    private void N(class07284 class072842, class07209 class072092, class04891 class048912) {
        class072842.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            this.N((class07284)class072992, class072092, class005002, class005003);
        } else {
            this.a_((class07284)class072992, class072092, class005002);
        }
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class08951(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, y, u, i});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
        this.a_((class07284)class047822, class072092, class005002);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        boolean bl2 = class072992.W(class072092);
        if ((Boolean)class005002.L((class08092)y) != bl2) {
            class00500 class005003 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(bl2));
            if (!bl2) {
                class005003 = (class00500)class005003.y(u, (Comparable)((Object)class08972.field_61446));
            }
            class072992.method_8652(class072092, class005003, 3);
            this.N((class07284)class072992, class072092, bl2 ? class04909.ww : class04909.wY);
            class072992.N((class03556)(bl2 ? class01194.N : class01194.i), class072092, class01164.N((class00500)class005003));
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return class087912 == class08791.field_48 && class005002.Y().N(class01231.N);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R.get(class005002.L(L));
    }

    public MapCodec<class08968> N() {
        return N;
    }

    private static boolean N(class06584 class065842, class08036 class080362, class08951 class089512, int n, class08044 class080442) {
        class06584 class065843 = class089512.y(n, class065842);
        class06584 class065844 = class080362.method_56992() && class065843.R() ? class065842.t() : class065843;
        class080442.method_5447(class080442.N(), class065844);
        class080442.method_5431();
        class089512.N((class03529<class01194>)(class065844.L(class02484.M) && !((class08153)class065844.method_58694(class02484.M)).y() ? null : class01194.Q));
        return !class065843.R();
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class08951 class089512;
        Object object;
        block13: {
            block12: {
                object = class072992.method_8321(class072092);
                if (!(object instanceof class08951)) break block12;
                class089512 = (class08951)object;
                if (!class070502.equals((Object)class07050.field_5810)) break block13;
            }
            return class07082.i;
        }
        object = this.N(class061832, (class07211)class005002.L(L));
        if (((OptionalInt)object).isEmpty()) {
            return class07082.i;
        }
        class08044 class080442 = class080362.method_31548();
        if (class072992.method_8608()) {
            class06584 class065843 = class080442.y();
            return this.N(class065843) ? class07082.i : class07082.N;
        }
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            boolean bl = class08968.N(class065842, class080362, class089512, ((OptionalInt)object).getAsInt(), class080442);
            if (bl) {
                this.N((class07284)class072992, class072092, class065842.R() ? class04909.wK : class04909.wo);
            } else if (!class065842.R()) {
                this.N((class07284)class072992, class072092, class04909.wJ);
            } else {
                return class07082.i;
            }
            return class07082.N.N(class065842);
        }
        class06584 class065844 = class080442.y();
        if (!this.N(class072992, class072092, class080442)) {
            return class07082.L;
        }
        this.N((class07284)class072992, class072092, class04909.wg);
        if (class065844 == class080442.y()) {
            return class07082.N;
        }
        return class07082.N.N(class080442.y());
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return (class00500)((class00500)((class00500)this.W().y(L, (Comparable)class069422.method_8042().b())).y((class08092)y, (Comparable)Boolean.valueOf(class069422.method_8045().W(class069422.method_8037())))).y((class08092)i, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    @Override
    public class08972 R(class00500 class005002) {
        return (class08972)((Object)class005002.L(u));
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

