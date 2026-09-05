/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08499
 *  minecraft.class08524
 */
package minecraft;

import minecraft.class08499;
import minecraft.class08524;

class class08863
extends class08499 {
    class08863(class08524 class085242, class08524 class085243) {
        super(class085242, class085243);
    }

    protected boolean N(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
            default -> false;
        };
    }
}

