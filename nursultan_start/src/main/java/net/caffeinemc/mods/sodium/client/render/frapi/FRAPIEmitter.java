/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter$Bufferer
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 */
package net.caffeinemc.mods.sodium.client.render.frapi;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedMutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;

public class FRAPIEmitter
implements PlatformModelEmitter {
    public void emitModel(class08887 class088872, Predicate<class07211> predicate, MutableQuadViewImpl mutableQuadViewImpl, class06069 class060692, class07295 class072952, class07209 class072092, class00500 class005002, PlatformModelEmitter.Bufferer bufferer) {
        class088872.emitQuads((QuadEmitter)((ExtendedMutableQuadViewImpl)mutableQuadViewImpl).getWrapper(), class072952, class072092, class005002, class060692, predicate);
    }
}

