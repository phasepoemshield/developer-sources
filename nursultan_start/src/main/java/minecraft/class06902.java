/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00734
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class01963
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07768
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class01963;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07768;
import minecraft.class08092;

public class class06902
extends class07768 {
    public static final MapCodec<class06902> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01960.N.fieldOf("block_set_type").forGetter(class069022 -> class069022.y), (App)class06902.t()).apply(instance, class06902::new));
    public static final class06667 u = class06665.k;

    public class06902(class01960 class019602, class01362 class013622) {
        super(class013622, class019602);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected int U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)u) != false ? 15 : 0;
    }

    protected int y(class07299 class072992, class07209 class072092) {
        Class<class07049> clazz = switch (this.y.R()) {
            default -> throw new MatchException(null, null);
            case class01963.field_11361 -> class07049.class;
            case class01963.field_11362 -> class07438.class;
        };
        return class06902.N((class07299)class072992, (class00734)N.N(class072092), clazz) > 0 ? 15 : 0;
    }

    public MapCodec<class06902> N() {
        return L;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u});
    }

    protected class00500 N(class00500 class005002, int n) {
        return (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(n > 0));
    }
}

