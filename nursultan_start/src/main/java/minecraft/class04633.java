/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05097
 *  minecraft.class05111
 */
package minecraft;

import minecraft.class04621;
import minecraft.class05097;
import minecraft.class05111;

@FunctionalInterface
public interface class04633
extends class04621<Void> {
    public void accept(class05111 var1) throws class05097;

    @Override
    default public Void apply(class05111 class051112) throws class05097 {
        this.accept(class051112);
        return null;
    }
}

