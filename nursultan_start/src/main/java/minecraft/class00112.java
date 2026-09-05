/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05801
 *  minecraft.class09011
 */
package minecraft;

import minecraft.class00392;
import minecraft.class05801;
import minecraft.class09011;

class class00112
extends class05801 {
    private final class09011 N;

    public float L() {
        return class00112.N(this.N, this.field_22753);
    }

    private static class00392 L(class09011 class090112, double d) {
        return class090112.N(class00112.y(class090112, d));
    }

    class00112(class09011 class090112, double d) {
        super(0, 0, class090112.y(), 20, class00112.L(class090112, d), d);
        this.N = class090112;
    }

    private static String y(class09011 class090112, double d) {
        return class00112.N(class00112.N(class090112, d));
    }

    public String y() {
        return class00112.y(this.N, this.field_22753);
    }

    private static String N(float f) {
        int n = (int)f;
        if ((float)n == f) {
            return Integer.toString(n);
        }
        return Float.toString(f);
    }

    private static float N(class09011 class090112, double d) {
        return class090112.i().N((float)d);
    }

    protected void method_25344() {
    }

    protected void method_25346() {
        this.method_25355(class00112.L(this.N, this.field_22753));
    }
}

