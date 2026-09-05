/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer;

@Environment(value=EnvType.CLIENT)
class HudLayer$1
implements HudLayer {
    final /* synthetic */ class01894 val$id;
    final /* synthetic */ Function val$operator;
    final /* synthetic */ boolean val$isRemoved;

    HudLayer$1() {
        this.val$id = var1_1;
        this.val$operator = var2_2;
        this.val$isRemoved = n;
    }

    @Override
    public class01894 id() {
        return this.val$id;
    }

    @Override
    public HudElement element(HudElement hudElement) {
        return (HudElement)this.val$operator.apply(hudElement);
    }

    @Override
    public boolean isRemoved() {
        return this.val$isRemoved;
    }
}

