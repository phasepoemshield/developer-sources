/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06143
 *  minecraft.class08388
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.particle.v1;

import java.util.List;
import minecraft.class06143;
import minecraft.class08388;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricSpriteProvider
extends class06143 {
    public List<class08388> getSprites();

    public class08626 getAtlas();
}

