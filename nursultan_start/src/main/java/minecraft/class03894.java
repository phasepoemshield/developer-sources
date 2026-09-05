/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03897;
import minecraft.class03909;
import minecraft.class03979;

public interface class03894
extends class03877 {
    @Override
    default public class03979<? extends class03877> L() {
        return this.i().field_37089;
    }

    public class03909 i();

    public class03877 u();

    @Override
    default public class03877 N(class03881 class038812) {
        return class038812.apply(new class03897(this.i(), this.u().N(class038812)));
    }
}

