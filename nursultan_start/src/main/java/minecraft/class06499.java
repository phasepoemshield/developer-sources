/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class02749
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05847
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 *  net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02749;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05847;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;
import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;

public class class06499
extends class06581
implements ShovelItemAccessor {
    protected static final Map<class00891, class00500> N = Maps.newHashMap((Map)new ImmutableMap.Builder().put((Object)class00869.Z, (Object)class00869.Ek.W()).put((Object)class00869.z, (Object)class00869.Ek.W()).put((Object)class00869.E, (Object)class00869.Ek.W()).put((Object)class00869.U, (Object)class00869.Ek.W()).put((Object)class00869.RC, (Object)class00869.Ek.W()).put((Object)class00869.nM, (Object)class00869.Ek.W()).build());

    public class06499(class02749 class027492, float f, float f2, class06573 class065732) {
        super(class065732.u(class027492, f, f2));
    }

    public class07082 N(class06501 class065012) {
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class00500 class005002 = class072992.method_8320(class072092);
        if (class065012.method_8038() != class07211.field_11033) {
            class08036 class080362 = class065012.method_8036();
            class00891 class008912 = class005002.i();
            Map<class00891, class00500> var8 = N;
            class00500 class005003 = (class00500)this.N(var8, class008912);
            class00500 class005004 = null;
            if (class005003 != null && class072992.method_8320(class072092.method_10084()).P()) {
                class072992.method_8396((class07049)class080362, class072092, class04909.wF, class04911.field_15245, 1.0f, 1.0f);
                class005004 = class005003;
            } else if (class005002.i() instanceof class05847 && ((Boolean)class005002.L((class08092)class05847.y)).booleanValue()) {
                if (!class072992.method_8608()) {
                    class072992.method_8444(null, 1009, class072092, 0);
                }
                class05847.N((class07049)class065012.method_8036(), (class07284)class072992, (class07209)class072092, (class00500)class005002);
                class005004 = (class00500)class005002.y((class08092)class05847.y, (Comparable)Boolean.valueOf(false));
            }
            if (class005004 != null) {
                if (!class072992.method_8608()) {
                    class072992.method_8652(class072092, class005004, 11);
                    class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)class005004));
                    if (class080362 != null) {
                        class065012.method_8041().N(1, (class07438)class080362, class065012.method_20287().N());
                    }
                }
                return class07082.N;
            }
            return class07082.i;
        }
        return class07082.i;
    }

    private Object N(Map map, Object object) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return null;
        }
        return map.get(object);
    }

    public static /* synthetic */ Map N() {
        return N;
    }
}

