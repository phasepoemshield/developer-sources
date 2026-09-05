/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07185
 *  minecraft.class08064
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07185;
import minecraft.class08064;
import minecraft.class08092;

public class class07004
extends class00891 {
    public static final MapCodec<class07004> y = class07004.y(class07004::new);
    public static final class08064<class07185> L = class06665.V;

    public class07004(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y(L, (Comparable)class07185.field_11052));
    }

    public static class00500 y(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11465: 
            case field_11463: {
                switch ((class07185)class005002.L(L)) {
                    case field_11048: {
                        return (class00500)class005002.y(L, (Comparable)class07185.field_11051);
                    }
                    case field_11051: {
                        return (class00500)class005002.y(L, (Comparable)class07185.field_11048);
                    }
                }
                return class005002;
            }
        }
        return class005002;
    }

    public MapCodec<? extends class07004> N() {
        return y;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(L, (Comparable)class069422.method_8038().z());
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return class07004.y(class005002, class069932);
    }
}

