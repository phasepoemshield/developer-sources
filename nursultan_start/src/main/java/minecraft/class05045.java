/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05068
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05059;
import minecraft.class05068;

public class class05045
extends class05068 {
    private final class01590 y;
    private final class00392 L;

    public class05045(class05059 class050592, class01590 class015902, class00392 class003922) {
        super(class050592);
        this.y = class015902;
        this.L = class003922;
    }

    public String N() {
        return "";
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_46426() + this.method_25368() / 2;
        int n4 = this.method_73385();
        Objects.requireNonNull(this.y);
        class010542.N(this.y, this.L, n3, n4 - 4, -1);
    }

    public class00392 method_37006() {
        return this.L;
    }
}

