/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08055
 *  minecraft.class08057
 */
package net.caffeinemc.mods.lithium.common.world.listeners;

import minecraft.class08055;
import minecraft.class08057;

public interface WorldBorderListenerOnce
extends class08055 {
    default public void method_11931(class08057 class080572, double d, double d2, long l, long l2) {
        this.lithium$onWorldBorderShapeChange(class080572);
    }

    default public void onAreaReplaced(class08057 class080572) {
        this.lithium$onWorldBorderShapeChange(class080572);
    }

    default public void method_11935(class08057 class080572, double d) {
    }

    default public void method_11932(class08057 class080572, int n) {
    }

    default public void method_11933(class08057 class080572, int n) {
    }

    default public void method_11929(class08057 class080572, double d) {
    }

    default public void method_11934(class08057 class080572, double d) {
        this.lithium$onWorldBorderShapeChange(class080572);
    }

    default public void method_11930(class08057 class080572, double d, double d2) {
        this.lithium$onWorldBorderShapeChange(class080572);
    }

    default public void lithium$onWorldBorderShapeChange(class08057 class080572) {
    }
}

