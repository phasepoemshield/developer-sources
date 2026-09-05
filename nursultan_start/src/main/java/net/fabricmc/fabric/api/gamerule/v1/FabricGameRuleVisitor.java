/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05706
 *  minecraft.class06839
 */
package net.fabricmc.fabric.api.gamerule.v1;

import minecraft.class05706;
import minecraft.class06839;

public interface FabricGameRuleVisitor
extends class05706 {
    default public <E extends Enum<E>> void visitEnum(class06839<E> class068392) {
    }

    default public void visitDouble(class06839<Double> class068392) {
    }
}

