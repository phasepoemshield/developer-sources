/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06942
 *  minecraft.class07101
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06942;
import minecraft.class07101;
import minecraft.class08092;

public class class00738
extends class07101 {
    public static final MapCodec<class00738> N = class00738.y(class00738::new);

    public class00738(class01362 class013622) {
        super(class013622);
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)R, (Comparable)class069422.method_8042().b());
    }

    public MapCodec<class00738> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R});
    }
}

