/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02102
 *  minecraft.class05096
 *  minecraft.class05725
 *  minecraft.class09020
 */
package minecraft;

import minecraft.class00119;
import minecraft.class00127;
import minecraft.class00129;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02102;
import minecraft.class05096;
import minecraft.class05725;
import minecraft.class09020;

class class00110
implements class00127<class09020> {
    class00110() {
    }

    @Override
    public void N(class09020 class090202, class05096 class050962, class00129 class001292) {
        class01590 class015902 = class050962.method_64506();
        class05725 class057252 = class05725.y((class00392)class090202.y(), (class01590)class015902).N(class090202.L()).N();
        class001292.accept((class02102)class057252, new class00119(this, class057252, class090202));
    }
}

