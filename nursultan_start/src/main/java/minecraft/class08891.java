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

class class08891
extends class08499 {
    class08891(class08524 class085242, class08524 class085243) {
        super(class085242, class085243);
    }

    protected boolean N(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
        };
    }
}

