/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class06069
 *  minecraft.class06638
 *  minecraft.class07209
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class06069;
import minecraft.class06638;
import minecraft.class07209;
import minecraft.class08092;
import minecraft.class08950;

public class class08984
extends class08950
implements class02674 {
    public static final MapCodec<class08984> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class08950::y), (App)class04206.y.T().fieldOf("open_sound").forGetter(class00860::j), (App)class04206.y.T().fieldOf("close_sound").forGetter(class00860::v), (App)class08984.t()).apply(instance, class08984::new));

    @Override
    public boolean L() {
        return false;
    }

    public class08984(class02774 class027742, class04891 class048912, class04891 class048913, class01362 class013622) {
        super(class027742, class048912, class048913, class013622);
    }

    public class02774 i() {
        return this.y();
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00394 class003942;
        if (!((class06638)class005002.L((class08092)class00860.i)).equals((Object)class06638.field_12571) && (class003942 = class047822.method_8321(class072092)) instanceof class00379 && ((class00379)class003942).j_().isEmpty()) {
            this.a_(class005002, class047822, class072092, class060692);
        }
    }

    public MapCodec<class08984> N() {
        return y;
    }

    protected boolean e_(class00500 class005002) {
        return class02674.L((class00891)class005002.i()).isPresent();
    }
}

