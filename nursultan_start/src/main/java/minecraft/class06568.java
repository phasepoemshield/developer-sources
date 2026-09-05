/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01235
 *  minecraft.class02484
 *  minecraft.class03729
 *  minecraft.class05946
 *  minecraft.class06482
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.slf4j.Logger
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class01235;
import minecraft.class02484;
import minecraft.class03729;
import minecraft.class05946;
import minecraft.class06482;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import org.slf4j.Logger;

public class class06568
extends class06581 {
    private static final Logger N = LogUtils.getLogger();

    public class06568(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        List list = (List)class065842.a_(class02484.Nm, List.of());
        class08036 class080363 = class080362;
        int n = 1;
        class06584 class065843 = class065842;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class070502);
        this.N(class065843, n, (class07438)class080363, (LocalRef)localRefImpl);
        class070502 = (class07050)localRefImpl.dispose();
        if (list.isEmpty()) {
            return class07082.u;
        }
        if (!class072992.method_8608()) {
            class06482 class064822 = class072992.method_8503().yM();
            ArrayList<class03729> arrayList = new ArrayList<class03729>(list.size());
            for (class05946 class059462 : list) {
                Optional var10 = class064822.y(class059462);
                if (var10.isPresent()) {
                    arrayList.add((class03729)var10.get());
                    continue;
                }
                N.error("Invalid recipe: {}", (Object)class059462);
                return class07082.u;
            }
            class080362.method_7254(arrayList);
            class080362.method_7259(class01235.L.y((Object)this));
        }
        return class07082.N;
    }

    private void N(class06584 class065842, int n, class07438 class074382, class07050 class070502) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            if (!class074382.method_56992()) {
                class074382.method_6122(class070502, class06584.E);
            }
        } else {
            class065842.N(n, class074382);
        }
    }

    private void N(class06584 class065842, int n, class07438 class074382, LocalRef localRef) {
        this.N(class065842, n, class074382, (class07050)localRef.get());
    }
}

