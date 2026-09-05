/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class11273
 *  Nursultan.class11791
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07049
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class11273;
import Nursultan.class11791;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class08036;

public class class11005
extends class11273 {
    public class11005(EntityESP entityESP, String string, boolean bl) {
        super(entityESP, string, bl);
    }

    public class05216 L(class08036 class080362) {
        return super.L(class080362).i(String.valueOf(class06541.field_1080) + " [" + String.valueOf(class06541.field_1060) + "F" + String.valueOf(class06541.field_1080) + "]" + String.valueOf(class06541.field_1070));
    }

    public int u(class08036 class080362) {
        return -1442807808;
    }

    public boolean test(class07049 class070492) {
        return class11791.E().or(class11791.z()).and(class11791.y().negate()).and(class11791.N()).test(class070492);
    }
}

