/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01108
 *  minecraft.class01226
 *  minecraft.class01362
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01108;
import minecraft.class01226;
import minecraft.class01362;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08965;
import minecraft.class08981;

public class class08986
extends class08981
implements class02674 {
    public static final MapCodec<class08986> i = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class01108::i), (App)class08986.t()).apply(instance, class08986::new));

    public class02774 i() {
        return this.y();
    }

    public class08986(class02774 class027742, class01362 class013622) {
        super(class027742, class013622);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.a_(class005002, class047822, class072092, class060692);
    }

    public MapCodec<class08986> N() {
        return i;
    }

    @Override
    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        Object object = class072992.method_8321(class072092);
        if (object instanceof class08965) {
            class08965 class089652 = (class08965)((Object)object);
            if (class065842.N(class01226.Ly)) {
                if (this.i().equals((Object)class02774.field_28704)) {
                    object = class089652.N(class005002);
                    class065842.N(1, (class07438)class080362, class070502.N());
                    if (object != null) {
                        class072992.method_8649((class07049)object);
                        class072992.method_8650(class072092, false);
                        return class07082.N;
                    }
                }
            } else {
                if (class065842.N(class06570.wR)) {
                    return class07082.i;
                }
                this.N(class072992, class005002, class072092, class080362);
                return class07082.N;
            }
        }
        return class07082.i;
    }

    protected boolean e_(class00500 class005002) {
        return class02674.L((class00891)class005002.i()).isPresent();
    }
}

