/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.sprite.FabricErrorCollectingSpriteGetter
 */
package net.fabricmc.fabric.mixin.renderer.client.sprite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricErrorCollectingSpriteGetter;

@Environment(value=EnvType.CLIENT)
public interface SpriteGetterMixin
extends FabricErrorCollectingSpriteGetter {
}

