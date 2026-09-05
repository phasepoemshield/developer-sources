/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.gamerule.rpc;

import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.jspecify.annotations.Nullable;

public interface FabricTypedRule {
    public void setFabricType(FabricGameRuleType var1);

    public @Nullable FabricGameRuleType getFabricType();
}

