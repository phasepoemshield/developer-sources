/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08522
 *  minecraft.class08524
 */
package minecraft;

import minecraft.class08522;
import minecraft.class08524;

class class08851
extends class08522 {
    class08851(int n, class08524 class085242) {
        super(n, class085242);
    }

    protected boolean N(char c) {
        return switch (c) {
            case '\"', '\'', '\\' -> false;
            default -> true;
        };
    }
}

