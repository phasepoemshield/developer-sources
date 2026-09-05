/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05534
 */
package minecraft;

import minecraft.class05534;

class class04630 {
    private final class05534 N;
    private int y;

    public boolean L() {
        return this.N.N().y().y("HasNectar", false);
    }

    class04630(class05534 class055342) {
        this.N = class055342;
        this.y = class055342.y();
    }

    public class05534 y() {
        return new class05534(this.N.N(), this.y, this.N.L());
    }

    public boolean N() {
        return this.y++ > this.N.L();
    }
}

