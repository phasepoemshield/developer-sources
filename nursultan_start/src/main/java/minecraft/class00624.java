/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11066
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class08036
 *  minecraft.class08052
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class11066;
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
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class08036;
import minecraft.class08052;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class00624
extends class07101
implements class06084,
class11066 {
    public static final MapCodec<class00624> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01960.N.fieldOf("block_set_type").forGetter(class006242 -> class006242.B), (App)class00624.t()).apply(instance, class00624::new));
    public static final class06667 y = class06665.d;
    public static final class08064<class08052> L = class06665.NZ;
    public static final class06667 u = class06665.k;
    public static final class06667 i = class06665.q;
    private static final Map<class07211, class00494> M = class00389.u((class00494)class00891.L((double)16.0, (double)13.0, (double)16.0));
    private final class01960 B;
    private static final Map Z;

    public class01960 L() {
        return this.B;
    }

    public class00624(class01960 class019602, class01362 class013622) {
        super(class013622.N(class019602.M()));
        this.B = class019602;
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)y, (Comparable)Boolean.valueOf(false))).y(L, (Comparable)class08052.field_12617)).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false)));
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return M.get((Boolean)class005002.L((class08092)y) != false ? class005002.L((class08092)R) : (class005002.L(L) == class08052.field_12619 ? class07211.field_11033 : class07211.field_11036));
        }
        return super.z(class005002);
    }

    private Map u() {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return Z;
        }
        return M;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private void y(class00500 class005002, class07299 class072992, class07209 class072092, @Nullable class08036 class080362) {
        class00500 class005003 = (class00500)class005002.N((class08092)y);
        class072992.method_8652(class072092, class005003, 2);
        if (((Boolean)class005003.L((class08092)i)).booleanValue()) {
            class072992.N(class072092, (class04651)class04684.L, class04684.L.N((class05487)class072992));
        }
        this.N(class080362, class072992, class072092, (Boolean)class005003.L((class08092)y));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, y, L, u, i});
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!this.B.L()) {
            return class07082.i;
        }
        this.y(class005002, class072992, class072092, class080362);
        return class07082.N;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        switch (class087912) {
            case field_50: {
                return (Boolean)class005002.L((class08092)y);
            }
            case field_48: {
                return (Boolean)class005002.L((class08092)i);
            }
            case field_51: {
                return (Boolean)class005002.L((class08092)y);
            }
        }
        return false;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (class00494)this.u().get((Boolean)class005002.L((class08092)y) != false ? class005002.L((class08092)R) : (class005002.L(L) == class08052.field_12619 ? class07211.field_11033 : class07211.field_11036));
    }

    public MapCodec<? extends class00624> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002 = this.W();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07211 class072112 = class069422.method_8038();
        class005002 = class069422.y() || !class072112.z().L() ? (class00500)((class00500)class005002.y((class08092)R, (Comparable)class069422.method_8042().b())).y(L, (Comparable)(class072112 == class07211.field_11036 ? class08052.field_12617 : class08052.field_12619)) : (class00500)((class00500)class005002.y((class08092)R, (Comparable)class072112)).y(L, (Comparable)(class069422.method_17698().B - (double)class069422.method_8037().method_10264() > 0.5 ? class08052.field_12619 : class08052.field_12617));
        if (class069422.method_8045().W(class069422.method_8037())) {
            class005002 = (class00500)((class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true))).y((class08092)u, (Comparable)Boolean.valueOf(true));
        }
        return (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        boolean bl2 = class072992.W(class072092);
        if (bl2 != (Boolean)class005002.L((class08092)u)) {
            if ((Boolean)class005002.L((class08092)y) != bl2) {
                class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(bl2));
                this.N(null, class072992, class072092, bl2);
            }
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(bl2)), 2);
            if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
                class072992.N(class072092, (class04651)class04684.L, class04684.L.N((class05487)class072992));
            }
        }
    }

    protected void N(@Nullable class08036 class080362, class07299 class072992, class07209 class072092, boolean bl) {
        class072992.method_8396((class07049)class080362, class072092, bl ? this.B.U() : this.B.z(), class04911.field_15245, 1.0f, class072992.method_8409().z() * 0.1f + 0.9f);
        class072992.N((class07049)class080362, (class03556)(bl ? class01194.B : class01194.u), class072092);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M() && this.B.u() && !((Boolean)class005002.L((class08092)u)).booleanValue()) {
            this.y(class005002, (class07299)class047822, class072092, null);
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    public /* synthetic */ class01960 am_() {
        return this.L();
    }
}

