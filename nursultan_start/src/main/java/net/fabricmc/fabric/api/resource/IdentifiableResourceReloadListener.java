/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01894
 */
package net.fabricmc.fabric.api.resource;

import java.util.Collection;
import java.util.Collections;
import minecraft.class01081;
import minecraft.class01894;

@Deprecated
public interface IdentifiableResourceReloadListener
extends class01081 {
    public class01894 getFabricId();

    default public Collection<class01894> getFabricDependencies() {
        return Collections.emptyList();
    }
}

