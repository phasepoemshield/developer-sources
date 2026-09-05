/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06897
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08080
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06897;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08080;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public abstract class class07760
extends class00891
implements class06084 {
    public static final class06667 N = class06665.q;
    private static final class00494 y = class00891.y((double)16.0, (double)0.0, (double)2.0);
    private static final class00494 L = class00891.y((double)16.0, (double)0.0, (double)8.0);
    private final boolean u;
    private static final class00494 i;
    private static final class00494 R;
    private static final class00494 M;

    public abstract class08092<class08080> L();

    public class07760(boolean bl, class01362 class013622) {
        super(class013622);
        this.u = bl;
    }

    public static boolean U(class00500 class005002) {
        return class005002.N(class01210.e) && class005002.i() instanceof class07760;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)N)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private class00494 u() {
        if (ProtocolTranslator.getTargetVersion().equalTo(ProtocolVersion.v1_10)) {
            return i;
        }
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_9, ProtocolVersion.v1_9_3)) {
            return R;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return M;
        }
        return L;
    }

    public boolean y() {
        return this.u;
    }

    protected class08080 N(class08080 class080802, class06993 class069932) {
        return switch (class069932) {
            case class06993.field_11464 -> {
                switch (class080802) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_12665: {
                        yield class08080.field_12665;
                    }
                    case field_12674: {
                        yield class08080.field_12674;
                    }
                    case field_12667: {
                        yield class08080.field_12666;
                    }
                    case field_12666: {
                        yield class08080.field_12667;
                    }
                    case field_12670: {
                        yield class08080.field_12668;
                    }
                    case field_12668: {
                        yield class08080.field_12670;
                    }
                    case field_12664: {
                        yield class08080.field_12672;
                    }
                    case field_12671: {
                        yield class08080.field_12663;
                    }
                    case field_12672: {
                        yield class08080.field_12664;
                    }
                    case field_12663: 
                }
                yield class08080.field_12671;
            }
            case class06993.field_11465 -> {
                switch (class080802) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_12665: {
                        yield class08080.field_12674;
                    }
                    case field_12674: {
                        yield class08080.field_12665;
                    }
                    case field_12667: {
                        yield class08080.field_12670;
                    }
                    case field_12666: {
                        yield class08080.field_12668;
                    }
                    case field_12670: {
                        yield class08080.field_12666;
                    }
                    case field_12668: {
                        yield class08080.field_12667;
                    }
                    case field_12664: {
                        yield class08080.field_12663;
                    }
                    case field_12671: {
                        yield class08080.field_12664;
                    }
                    case field_12672: {
                        yield class08080.field_12671;
                    }
                    case field_12663: 
                }
                yield class08080.field_12672;
            }
            case class06993.field_11463 -> {
                switch (class080802) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_12665: {
                        yield class08080.field_12674;
                    }
                    case field_12674: {
                        yield class08080.field_12665;
                    }
                    case field_12667: {
                        yield class08080.field_12668;
                    }
                    case field_12666: {
                        yield class08080.field_12670;
                    }
                    case field_12670: {
                        yield class08080.field_12667;
                    }
                    case field_12668: {
                        yield class08080.field_12666;
                    }
                    case field_12664: {
                        yield class08080.field_12671;
                    }
                    case field_12671: {
                        yield class08080.field_12672;
                    }
                    case field_12672: {
                        yield class08080.field_12663;
                    }
                    case field_12663: 
                }
                yield class08080.field_12664;
            }
            default -> class080802;
        };
    }

    public class00500 N(class06942 class069422) {
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        class00500 class005002 = super.W();
        class07211 class072112 = class069422.method_8042();
        boolean bl2 = class072112 == class07211.field_11034 || class072112 == class07211.field_11039;
        return (class00500)((class00500)class005002.y(this.L(), (Comparable)(bl2 ? class08080.field_12674 : class08080.field_12665))).y((class08092)N, (Comparable)Boolean.valueOf(bl));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (bl) {
            return;
        }
        if (((class08080)class005002.L(this.L())).y()) {
            class047822.method_8408(class072092.method_10084(), (class00891)this);
        }
        if (this.u) {
            class047822.method_8408(class072092, (class00891)this);
            class047822.method_8408(class072092.method_10074(), (class00891)this);
        }
    }

    protected class08080 N(class08080 class080802, class07111 class071112) {
        return switch (class071112) {
            case class07111.field_11300 -> {
                switch (class080802) {
                    case field_12670: {
                        yield class08080.field_12668;
                    }
                    case field_12668: {
                        yield class08080.field_12670;
                    }
                    case field_12664: {
                        yield class08080.field_12663;
                    }
                    case field_12671: {
                        yield class08080.field_12672;
                    }
                    case field_12672: {
                        yield class08080.field_12671;
                    }
                    case field_12663: {
                        yield class08080.field_12664;
                    }
                }
                yield class080802;
            }
            case class07111.field_11301 -> {
                switch (class080802) {
                    case field_12667: {
                        yield class08080.field_12666;
                    }
                    case field_12666: {
                        yield class08080.field_12667;
                    }
                    case field_12664: {
                        yield class08080.field_12671;
                    }
                    case field_12671: {
                        yield class08080.field_12664;
                    }
                    case field_12672: {
                        yield class08080.field_12663;
                    }
                    case field_12663: {
                        yield class08080.field_12672;
                    }
                }
                yield class080802;
            }
            default -> class080802;
        };
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)N)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public static boolean N(class07299 class072992, class07209 class072092) {
        return class07760.U(class072992.method_8320(class072092));
    }

    protected class00500 N(class00500 class005002, class07299 class072992, class07209 class072092, boolean bl) {
        class005002 = this.N(class072992, class072092, class005002, true);
        if (this.u) {
            class072992.method_41410(class005002, class072092, (class00891)this, null, bl);
        }
        return class005002;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        this.N(class005002, class072992, class072092, bl);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return ((class08080)class005002.L(this.L())).y() ? this.u() : y;
    }

    protected abstract MapCodec<? extends class07760> N();

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912) {
    }

    protected class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl) {
        if (class072992.method_8608()) {
            return class005002;
        }
        class08080 class080802 = (class08080)class005002.L(this.L());
        return new class06897(class072992, class072092, class005002).N(class072992.W(class072092), bl, class080802).L();
    }

    private static boolean N(class07209 class072092, class07299 class072992, class08080 class080802) {
        if (!class07760.L((class07290)class072992, (class07209)class072092.method_10074())) {
            return true;
        }
        switch (class080802) {
            case field_12667: {
                return !class07760.L((class07290)class072992, (class07209)class072092.method_10078());
            }
            case field_12666: {
                return !class07760.L((class07290)class072992, (class07209)class072092.method_10067());
            }
            case field_12670: {
                return !class07760.L((class07290)class072992, (class07209)class072092.method_10095());
            }
            case field_12668: {
                return !class07760.L((class07290)class072992, (class07209)class072092.method_10072());
            }
        }
        return false;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608() || !class072992.method_8320(class072092).N((class00891)this)) {
            return;
        }
        class08080 class080802 = (class08080)class005002.L(this.L());
        if (class07760.N(class072092, class072992, class080802)) {
            class07760.y((class00500)class005002, (class07299)class072992, (class07209)class072092);
            class072992.method_8650(class072092, bl);
        } else {
            this.N(class005002, class072992, class072092, class008912);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class07760.L((class07290)class054872, (class07209)class072092.method_10074());
    }
}

