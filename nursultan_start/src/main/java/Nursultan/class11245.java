/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11535
 *  minecraft.class01054
 */
package Nursultan;

import Nursultan.class11227;
import Nursultan.class11535;
import java.util.function.Consumer;
import minecraft.class01054;

public class class11245
extends class11535
implements class11227 {
    public Object N_0;

    public class11245(String string, boolean bl, class11227 class112272, Consumer<class11535> consumer) {
        super(string, bl, consumer);
        this.N();
        this.N_0 = class112272;
    }

    private void N() {
    }

    @Override
    public void draw(class01054 class010542, int n, int n2, int n3) {
        this.N();
        ((class11227)this.N_0).draw(class010542, n, n2, n3);
    }
}

