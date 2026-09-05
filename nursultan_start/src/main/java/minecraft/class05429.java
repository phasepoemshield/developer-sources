/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00683
 *  minecraft.class01217
 *  minecraft.class01894
 *  minecraft.class06546
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07479
 *  minecraft.class07610
 *  minecraft.class07862
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00683;
import minecraft.class01217;
import minecraft.class01894;
import minecraft.class06546;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07479;
import minecraft.class07610;
import minecraft.class07862;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;

public class class05429
extends class06546<class07479> {
    private static final class01894 n = class01894.y((String)"container/slot");
    private static final class01894 t = class01894.y((String)"container/horse/chest_slots");
    private static final class01894 G = class01894.y((String)"textures/gui/container/horse.png");

    protected @Nullable class01894 L() {
        return t;
    }

    public class05429(class07479 class074792, class08044 class080442, class07862 class078622, int n) {
        super((class07610)class074792, class080442, class078622.method_5476(), n, (class07438)class078622);
    }

    protected boolean i() {
        return this.u.method_56991(class07085.field_55946) && this.u.method_5864().N(class01217.V);
    }

    protected class01894 y() {
        return n;
    }

    protected class01894 N() {
        return G;
    }

    protected boolean R() {
        return this.u.method_56991(class07085.field_48824) && (this.u.method_5864().N(class01217.H) || this.u instanceof class00683);
    }
}

