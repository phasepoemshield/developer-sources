/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package net.fabricmc.fabric.impl.gamerule.rpc;

import minecraft.class05033;

public enum FabricGameRuleType implements class05033
{
    DOUBLE("fabric:double"),
    ENUM("fabric:enum");

    private final String name;

    private FabricGameRuleType(String string2) {
        this.name = string2;
    }

    public String method_15434() {
        return this.name;
    }
}

