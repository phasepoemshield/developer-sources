/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03286
 *  minecraft.class03661
 *  minecraft.class05096
 *  minecraft.class05362
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03286;
import minecraft.class03661;
import minecraft.class05096;
import minecraft.class05191;
import minecraft.class05213;
import minecraft.class05362;

class class05219
extends class03286 {
    private static final class00392 y = class00392.L((String)"createWorld.tab.more.title");
    private static final class00392 L = class00392.L((String)"selectWorld.gameRules");
    private static final class00392 u = class00392.L((String)"selectWorld.dataPacks");
    final /* synthetic */ class05213 N;

    class05219(class05213 class052132) {
        this.N = class052132;
        super(y);
        class02080 class020802 = this.Z.y(8).u(1);
        class020802.N((class02102)class05362.method_46430((class00392)L, class053622 -> this.N()).N(210).N());
        class020802.N((class02102)class05362.method_46430((class00392)class05213.L, class053622 -> this.N.N(this.N.R.U().B())).N(210).N());
        class020802.N((class02102)class05362.method_46430((class00392)u, class053622 -> this.N.y(this.N.R.U().B())).N(210).N());
    }

    private void N() {
        class05213.R(this.N).N((class05096)new class05191(this.N.R.T().y(this.N.R.U().B().y()), optional -> {
            class05213.M(this.N).N((class05096)this.N);
            optional.ifPresent(arg_0 -> ((class03661)this.N.R).N(arg_0));
        }));
    }
}

