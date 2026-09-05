/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class05096
 *  minecraft.class08734
 *  minecraft.class08770
 *  minecraft.class08781
 *  minecraft.class09032
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00134;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class05096;
import minecraft.class08734;
import minecraft.class08770;
import minecraft.class08781;
import minecraft.class09032;
import org.jspecify.annotations.Nullable;

public class class00113<T extends class09032>
extends class00134<T> {
    public class00113(@Nullable class05096 class050962, T t, class08781 class087812) {
        super(class050962, t, class087812);
    }

    @Override
    protected void N(class03686 class036862, class08770 class087702, T t, class08781 class087812) {
        super.N(class036862, class087702, t, class087812);
        class01885 class018852 = class01885.i().N(8);
        for (class08734 class087342 : t.y()) {
            class018852.N((class02102)class087702.N(class087342).N());
        }
        class036862.y((class02102)class018852);
    }
}

