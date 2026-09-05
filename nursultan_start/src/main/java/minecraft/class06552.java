/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class03556
 *  minecraft.class04398
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05835
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06653
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07113
 *  minecraft.class07200
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08026
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class03556;
import minecraft.class04398;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06653;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07113;
import minecraft.class07200;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08026;
import minecraft.class08036;
import minecraft.class08092;

public class class06552
extends class06581 {
    public class06552(class06573 class065732) {
        super(class065732);
    }

    private boolean N(class08036 class080362, class07050 class070502) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_11);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class06183 class061832 = class06552.N(class072992, class080362, class05835.field_1348);
        if (class061832.N() == class07113.field_1332 && class072992.method_8320(class061832.u()).N(class00869.Mm)) {
            return class07082.i;
        }
        class08036 class080363 = class080362;
        class07050 class070503 = class070502;
        if (this.N(class080363, class070503)) {
            class080363.method_6019(class070503);
        }
        if (class072992 instanceof class04782) {
            class07209 class072092 = ((class04782)class072992).method_8487(class04398.N, class080362.method_24515(), 100, false);
            if (class072092 == null) {
                return class07082.L;
            }
            class08026 class080262 = new class08026(class072992, class080362.method_23317(), class080362.method_23323(0.5), class080362.method_23321());
            class080262.N(class065842);
            class080262.N(class06889.N((class00753)class072092));
            class072992.method_32888((class03556)class01194.V, class080262.method_73189(), class01164.N((class07049)class080362));
            class072992.method_8649((class07049)class080262);
            if (class080362 instanceof class04770) {
                class04770 class047702 = (class04770)class080362;
                class06912.m.N(class047702, class072092);
            }
            float f = class04995.B((float)class072992.field_9229.z(), (float)0.33f, (float)0.5f);
            class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.zp, class04911.field_15254, 1.0f, f);
            class065842.N(1, (class07438)class080362);
            class080362.method_7259(class01235.L.y((Object)this));
        }
        return class07082.y;
    }

    @Override
    public int N(class06584 class065842, class07438 class074382) {
        return 0;
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        class00500 class005002 = class072992.method_8320(class072092 = class065012.method_8037());
        if (!class005002.N(class00869.Mm) || ((Boolean)class005002.L((class08092)class07200.L)).booleanValue()) {
            return class07082.i;
        }
        if (class072992.method_8608()) {
            return class07082.N;
        }
        class00500 class005003 = (class00500)class005002.y((class08092)class07200.L, (Comparable)Boolean.valueOf(true));
        class00891.N_19((class00500)class005002, (class00500)class005003, (class07284)class072992, (class07209)class072092);
        class072992.method_8652(class072092, class005003, 2);
        class072992.method_8455(class072092, class00869.Mm);
        class065012.method_8041().B(1);
        class072992.N(1503, class072092, 0);
        class06653 class066532 = class07200.y().N((class05487)class072992, class072092);
        if (class066532 != null) {
            class07209 class072093 = class066532.N().method_10069(-3, 0, -3);
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    class07209 class072094 = class072093.method_10069(i, 0, j);
                    class072992.N(class072094, true, null);
                    class072992.method_8652(class072094, class00869.MW.W(), 2);
                }
            }
            class072992.method_8474(1038, class072093.method_10069(1, 0, 1), 0);
        }
        return class07082.N;
    }
}

