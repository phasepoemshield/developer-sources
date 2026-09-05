/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04499
 *  minecraft.class07072
 *  minecraft.class08007
 */
package minecraft;

import minecraft.class00690;
import minecraft.class00692;
import minecraft.class04499;
import minecraft.class07072;
import minecraft.class08007;

public abstract class class00685
extends class00692 {
    public class00685(class00690 class006902) {
        super(class006902);
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public float N(class07072 class070722, float f) {
        if (class070722.L() instanceof class08007 || class070722.L() instanceof class04499) {
            class070722.L().method_5639(1.0f);
            return 0.0f;
        }
        return super.N(class070722, f);
    }
}

