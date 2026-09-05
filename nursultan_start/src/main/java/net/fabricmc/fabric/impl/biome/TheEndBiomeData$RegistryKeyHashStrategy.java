/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  minecraft.class03556
 */
package net.fabricmc.fabric.impl.biome;

import it.unimi.dsi.fastutil.Hash;
import minecraft.class03556;

enum TheEndBiomeData$RegistryKeyHashStrategy implements Hash.Strategy<class03556<?>>
{
    INSTANCE;


    public boolean equals(class03556<?> class035562, class03556<?> class035563) {
        if (class035562 == class035563) {
            return true;
        }
        if (class035562 == null || class035563 == null) {
            return false;
        }
        if (class035562.R() != class035563.R()) {
            return false;
        }
        return (Boolean)class035562.u().map(class059462 -> class035563.i().get() == class059462, class035563.N()::equals);
    }

    public int hashCode(class03556<?> class035562) {
        if (class035562 == null) {
            return 0;
        }
        return (Integer)class035562.u().map(System::identityHashCode, Object::hashCode);
    }
}

