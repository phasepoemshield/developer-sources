/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02071
 *  minecraft.class05978
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02071;
import minecraft.class05978;

public final class class05226
extends class05978 {
    private final class02071 N;

    public class05226(class00392 class003922, class01590 class015902) {
        this.N = new class02071(class003922, class015902);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.N.y(this.method_73388() - this.N.method_25368() / 2, this.method_73385() - this.N.method_25364() / 2);
        this.N.method_25394(class010542, n, n2, f);
    }

    public class00392 method_37006() {
        return this.N.method_25369();
    }
}

