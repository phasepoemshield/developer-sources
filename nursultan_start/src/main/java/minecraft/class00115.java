/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02102
 *  minecraft.class05096
 *  minecraft.class06343
 *  minecraft.class06366
 *  minecraft.class08737
 *  minecraft.class08997
 *  minecraft.class09025
 */
package minecraft;

import java.util.Collection;
import minecraft.class00127;
import minecraft.class00129;
import minecraft.class02102;
import minecraft.class05096;
import minecraft.class06343;
import minecraft.class06366;
import minecraft.class08737;
import minecraft.class08997;
import minecraft.class09025;

class class00115
implements class00127<class08997> {
    class00115() {
    }

    @Override
    public void N(class08997 class089972, class05096 class050962, class00129 class001292) {
        class09025 class090252 = class089972.y().orElse((class09025)class089972.u().getFirst());
        class06366 class063662 = class06366.N(class09025::N, (Object)class090252).N((Collection)class089972.u()).N(!class089972.R() ? class06343.field_64540 : class06343.field_64539).N(0, 0, class089972.L(), 20, class089972.i());
        class001292.accept((class02102)class063662, class08737.N(() -> ((class09025)class063662.y()).y()));
    }
}

