/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06761
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07228
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08058
 *  minecraft.class08059
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06761;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07228;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08058;
import minecraft.class08059;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class07196
extends class00891 {
    public static final MapCodec<class07196> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01960.N.fieldOf("block_set_type").forGetter(class07196::y), (App)class07196.t()).apply(instance, class07196::new));
    public static final class08064<class07211> y = class07101.R;
    public static final class08064<class08059> L = class06665.NB;
    public static final class08064<class08058> u = class06665.yz;
    public static final class06667 i = class06665.d;
    public static final class06667 R = class06665.k;
    private static final Map<class07211, class00494> M = class00389.L((class00494)class00891.L((double)16.0, (double)13.0, (double)16.0));
    private final class01960 B;
    private static final Map Z;

    private Map L() {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return Z;
        }
        return M;
    }

    public class07196(class01960 class019602, class01362 class013622) {
        super(class013622.N(class019602.M()));
        this.B = class019602;
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class07211.field_11043))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y(u, (Comparable)class08058.field_12588)).y((class08092)R, (Comparable)Boolean.valueOf(false))).y(L, (Comparable)class08059.field_12607));
    }

    public boolean U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)i);
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return M.get(class005002.L(y));
        }
        return super.z(class005002);
    }

    private class08058 y(class06942 class069422) {
        boolean bl;
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class07211 class072112 = class069422.method_8042();
        class07209 class072093 = class072092.method_10084();
        class07211 class072113 = class072112.M();
        class07209 class072094 = class072092.method_10093(class072113);
        class00500 class005002 = class072992.method_8320(class072094);
        class07209 class072095 = class072093.method_10093(class072113);
        class00500 class005003 = class072992.method_8320(class072095);
        class07211 class072114 = class072112.R();
        class07209 class072096 = class072092.method_10093(class072114);
        class00500 class005004 = class072992.method_8320(class072096);
        class07209 class072097 = class072093.method_10093(class072114);
        class00500 class005005 = class072992.method_8320(class072097);
        int n = (class005002.W((class07290)class072992, class072094) ? -1 : 0) + (class005003.W((class07290)class072992, class072095) ? -1 : 0) + (class005004.W((class07290)class072992, class072096) ? 1 : 0) + (class005005.W((class07290)class072992, class072097) ? 1 : 0);
        boolean bl2 = class005002.i() instanceof class07196 && class005002.L(L) == class08059.field_12607;
        boolean bl3 = bl = class005004.i() instanceof class07196 && class005004.L(L) == class08059.field_12607;
        if (bl2 && !bl || n > 0) {
            return class08058.field_12586;
        }
        if (bl && !bl2 || n < 0) {
            return class08058.field_12588;
        }
        int n2 = class072112.P();
        int n3 = class072112.T();
        class06889 class068892 = class069422.method_17698();
        double d = class068892.M - (double)class072092.method_10263();
        double d2 = class068892.Z - (double)class072092.method_10260();
        return n2 < 0 && d2 < 0.5 || n2 > 0 && d2 > 0.5 || n3 < 0 && d > 0.5 || n3 > 0 && d < 0.5 ? class08058.field_12586 : class08058.field_12588;
    }

    public class01960 y() {
        return this.B;
    }

    public static boolean E(class00500 class005002) {
        class00891 class008912 = class005002.i();
        return class008912 instanceof class07196 && ((class07196)class008912).y().L();
    }

    protected long N(class00500 class005002, class07209 class072092) {
        return class04995.y((int)class072092.method_10263(), (int)class072092.method_10087(class005002.L(L) == class08059.field_12607 ? 0 : 1).method_10264(), (int)class072092.method_10260());
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        if (class071112 == class07111.field_11302) {
            return class005002;
        }
        return (class00500)class005002.N(class071112.N((class07211)((Object)class005002.L(y)))).N(u);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)((Object)class069932.N((class07211)((Object)class005002.L(y)))));
    }

    private void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, boolean bl) {
        class072992.method_8396(class070492, class072092, bl ? this.B.Z() : this.B.B(), class04911.field_15245, 1.0f, class072992.method_8409().z() * 0.1f + 0.9f);
    }

    public MapCodec<? extends class07196> N() {
        return N;
    }

    public static boolean N(class07299 class072992, class07209 class072092) {
        return class07196.E(class072992.method_8320(class072092));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, y, i, u, R});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class07211 class072112 = (class07211)((Object)class005002.L(y));
        class07211 class072113 = ((Boolean)class005002.L((class08092)i)).booleanValue() ? (class005002.L(u) == class08058.field_12586 ? class072112.M() : class072112.R()) : class072112;
        return (class00494)this.L().get((Object)class072113);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return switch (class07228.N[class087912.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1, 2 -> (Boolean)class005002.L((class08092)i);
            case 3 -> false;
        };
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!(class072992.method_8608() || !class080362.method_66324() && class080362.method_7305(class005002))) {
            class06761.y((class07299)class072992, (class07209)class072092, (class00500)class005002, (class08036)class080362);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M() && class005002.L(L) == class08059.field_12607 && this.B.u() && !((Boolean)class005002.L((class08092)R)).booleanValue()) {
            this.N(null, (class07299)class047822, class005002, class072092, !this.U(class005002));
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class08059 class080592 = (class08059)class005002.L(L);
        if (class072112.z() == class07185.field_11052 && class080592 == class08059.field_12607 == (class072112 == class07211.field_11036)) {
            if (class005003.i() instanceof class07196 && class005003.L(L) != class080592) {
                return (class00500)class005003.y(L, (Comparable)class080592);
            }
            return class00869.N.W();
        }
        if (class080592 == class08059.field_12607 && class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07209 class072092 = class069422.method_8037();
        class07299 class072992 = class069422.method_8045();
        if (class072092.method_10264() < class072992.method_31600() && class072992.method_8320(class072092.method_10084()).N(class069422)) {
            boolean bl = class072992.W(class072092) || class072992.W(class072092.method_10084());
            return (class00500)((class00500)((class00500)((class00500)((class00500)this.W().y(y, (Comparable)((Object)class069422.method_8042()))).y(u, (Comparable)this.y(class069422))).y((class08092)R, (Comparable)Boolean.valueOf(bl))).y((class08092)i, (Comparable)Boolean.valueOf(bl))).y(L, (Comparable)class08059.field_12607);
        }
        return null;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        boolean bl2;
        boolean bl3 = class072992.W(class072092) || class072992.W(class072092.method_10093(class005002.L(L) == class08059.field_12607 ? class07211.field_11036 : class07211.field_11033)) ? true : (bl2 = false);
        if (!this.W().N(class008912) && bl2 != (Boolean)class005002.L((class08092)R)) {
            if (bl2 != (Boolean)class005002.L((class08092)i)) {
                this.N(null, class072992, class072092, bl2);
                class072992.N(null, (class03556)(bl2 ? class01194.B : class01194.u), class072092);
            }
            class072992.method_8652(class072092, (class00500)((class00500)class005002.y((class08092)R, (Comparable)Boolean.valueOf(bl2))).y((class08092)i, (Comparable)Boolean.valueOf(bl2)), 2);
        }
    }

    public void N(@Nullable class07049 class070492, class07299 class072992, class00500 class005002, class07209 class072092, boolean bl) {
        if (!class005002.N((class00891)this) || (Boolean)class005002.L((class08092)i) == bl) {
            return;
        }
        class072992.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(bl)), 10);
        this.N(class070492, class072992, class072092, bl);
        class072992.N(class070492, (class03556)(bl ? class01194.B : class01194.u), class072092);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!this.B.L()) {
            return class07082.i;
        }
        class005002 = (class00500)class005002.N((class08092)i);
        class072992.method_8652(class072092, class005002, 10);
        this.N((class07049)class080362, class072992, class072092, (Boolean)class005002.L((class08092)i));
        class072992.N((class07049)class080362, (class03556)(this.U(class005002) ? class01194.B : class01194.u), class072092);
        return class07082.N;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class072992.method_8652(class072092.method_10084(), (class00500)class005002.y(L, (Comparable)class08059.field_12609), 3);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        if (class005002.L(L) == class08059.field_12607) {
            return class005003.L((class07290)class054872, class072093, class07211.field_11036);
        }
        return class005003.N((class00891)this);
    }
}

