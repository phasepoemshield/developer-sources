/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08713;

public class class00410
extends class00891 {
    public static final MapCodec<class00410> N = class00410.y(class00410::new);
    private static final class00494 y = class00891.y((double)16.0, (double)0.0, (double)1.0);
    private static final class00494 L;

    public class00410(class01362 class013622) {
        super(class013622);
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            return L;
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    public MapCodec<? extends class00410> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return !class054872.R(class072092.method_10074());
    }
}

