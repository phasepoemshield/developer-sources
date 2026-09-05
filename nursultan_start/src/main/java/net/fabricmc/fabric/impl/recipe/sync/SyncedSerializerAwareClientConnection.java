/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06514
 */
package net.fabricmc.fabric.impl.recipe.sync;

import java.util.Set;
import minecraft.class06514;

public interface SyncedSerializerAwareClientConnection {
    public Set<class06514<?>> fabric_getSyncedRecipeSerializers();

    public void fabric_setSyncedRecipeSerializers(Set<class06514<?>> var1);
}

