/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container$1;

abstract class Container {
    private Container() {
    }

    /* synthetic */ Container(Container$1 container$1) {
        this();
    }

    abstract Object get(String var1);

    abstract void put(String var1, Object var2);

    abstract boolean isImplicit();

    abstract boolean accepts(String var1);
}

