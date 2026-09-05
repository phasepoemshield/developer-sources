/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import java.util.ListIterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer;

@Environment(value=EnvType.CLIENT)
interface HudElementRegistryImpl$LayerVisitor {
    public boolean visit(HudLayer var1, ListIterator<HudLayer> var2);
}

