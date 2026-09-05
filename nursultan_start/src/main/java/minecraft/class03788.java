/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class00429
 *  minecraft.class00435
 *  minecraft.class00570
 *  minecraft.class00737
 *  minecraft.class01148
 *  minecraft.class01159
 *  minecraft.class01163
 *  minecraft.class01164
 *  minecraft.class01166
 *  minecraft.class01194
 *  minecraft.class01296
 *  minecraft.class03556
 *  minecraft.class04751
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.ChunkConstants
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00429;
import minecraft.class00435;
import minecraft.class00570;
import minecraft.class00737;
import minecraft.class01148;
import minecraft.class01159;
import minecraft.class01163;
import minecraft.class01164;
import minecraft.class01166;
import minecraft.class01194;
import minecraft.class01296;
import minecraft.class03556;
import minecraft.class04751;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.ChunkConstants;
import net.caffeinemc.mods.lithium.common.world.LithiumData;

public class class03788 {
    private final class04782 N;

    public class03788(class04782 class047822) {
        this.N = class047822;
    }

    private class00570 N(class04751 class047512, int n, int n2) {
        return ChunkConstants.DUMMY_CHUNK;
    }

    private class01166 N(class08050 class080502, int n) {
        return null;
    }

    private boolean N(class01166 class011662, class03556 class035562, class06889 class068892, class01164 class011642, class01159 class011592, int n, int n2, int n3) {
        if (class011662 == null) {
            Int2ObjectMap var9 = ((LithiumData)this.N).lithium$getData().gameEventDispatchers().get(class07321.u((int)n, (int)n2));
            class011662 = var9 == null ? null : (class01166)var9.get(n3);
        }
        return class011662 != null && class011662.N(class035562, class068892, class011642, class011592);
    }

    private boolean N(class01166 class011662, class03556 class035562, class06889 class068892, class01164 class011642, class01159 class011592, LocalIntRef localIntRef, LocalIntRef localIntRef2, LocalIntRef localIntRef3) {
        return this.N(class011662, class035562, class068892, class011642, class011592, localIntRef.get(), localIntRef2.get(), localIntRef3.get());
    }

    private void N(List<class01148> list) {
        Collections.sort(list);
        for (class01148 class011482 : list) {
            class011482.u().N(this.N, class011482.N(), class011482.L(), class011482.y());
        }
    }

    public void N(class03556<class01194> class035562, class06889 class068892, class01164 class011642) {
        int n = ((class01194)class035562.N()).N();
        class07209 class072092 = class07209.method_49638((class00737)class068892);
        int n2 = class01296.N((int)(class072092.method_10263() - n));
        int n3 = class01296.N((int)(class072092.method_10264() - n));
        int n4 = class01296.N((int)(class072092.method_10260() - n));
        int n5 = class01296.N((int)(class072092.method_10263() + n));
        int n6 = class01296.N((int)(class072092.method_10264() + n));
        int n7 = class01296.N((int)(class072092.method_10260() + n));
        ArrayList<class01148> arrayList = new ArrayList<class01148>();
        class01159 class011592 = (class011872, class068893) -> {
            if (class011872.L() == class01163.field_40354) {
                arrayList.add(new class01148(class035562, class068892, class011642, class011872, class068893));
            } else {
                class011872.N(this.N, class035562, class011642, class068892);
            }
        };
        boolean bl = false;
        for (int i = n2; i <= n5; ++i) {
            for (int j = n4; j <= n7; ++j) {
                int n8 = j;
                int n9 = i;
                class04751 class047512 = this.N.method_14178();
                class00570 class005702 = this.N(class047512, n9, n8);
                if (class005702 == null) continue;
                for (int k = n3; k <= n6; ++k) {
                    n9 = k;
                    class047512 = class005702;
                    class01159 class011593 = class011592;
                    class01164 class011643 = class011642;
                    class06889 class068894 = class068892;
                    class03556<class01194> class035563 = class035562;
                    class047512 = this.N((class08050)class047512, n9);
                    LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
                    LocalIntRefImpl localIntRefImpl2 = new LocalIntRefImpl();
                    LocalIntRefImpl localIntRefImpl3 = new LocalIntRefImpl();
                    localIntRefImpl.init(i);
                    localIntRefImpl2.init(j);
                    localIntRefImpl3.init(k);
                    k = localIntRefImpl3.dispose();
                    j = localIntRefImpl2.dispose();
                    i = localIntRefImpl.dispose();
                    bl |= this.N((class01166)class047512, class035563, class068894, class011643, class011593, (LocalIntRef)localIntRefImpl, (LocalIntRef)localIntRefImpl2, (LocalIntRef)localIntRefImpl3);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.N(arrayList);
        }
        if (bl) {
            this.N.method_74535().y(class07209.method_49638((class00737)class068892), class00429.s, (Object)new class00435(class035562, class068892));
        }
    }
}

