/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01283
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.resource.v1;

import minecraft.class01283;
import org.slf4j.LoggerFactory;

public interface FabricResource {
    default public class01283 getFabricPackSource() {
        LoggerFactory.getLogger(FabricResource.class).error("Unknown Resource implementation {}, returning PACK_SOURCE_NONE as the source", (Object)this.getClass().getName());
        return class01283.y;
    }
}

