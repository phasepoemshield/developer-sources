/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.gamerule.v1;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;

public abstract class GameRuleBuilder$NumberRuleBuilder<T extends Number>
extends GameRuleBuilder<T> {
    GameRuleBuilder$NumberRuleBuilder(T t) {
        super(t);
    }

    public abstract GameRuleBuilder$NumberRuleBuilder<T> range(T var1, T var2);

    public abstract GameRuleBuilder$NumberRuleBuilder<T> minValue(T var1);
}

