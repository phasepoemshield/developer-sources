/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08743
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelAccess
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter$Bufferer
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08743;
import minecraft.class08877;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.render.helper.ListStorage;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext$BlockEmitter;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter;

public class DefaultModelEmitter
implements PlatformModelEmitter {
    public void emitModel(class08887 class088872, Predicate<class07211> predicate, MutableQuadViewImpl mutableQuadViewImpl, class06069 class060692, class07295 class072952, class07209 class072092, class00500 class005002, PlatformModelEmitter.Bufferer bufferer) {
        class08743 class087432;
        List list = PlatformModelAccess.getInstance().collectPartsOf(class088872, class072952, class072092, class005002, class060692, (ListStorage)mutableQuadViewImpl);
        if (mutableQuadViewImpl instanceof AbstractBlockRenderContext$BlockEmitter) {
            AbstractBlockRenderContext$BlockEmitter abstractBlockRenderContext$BlockEmitter = (AbstractBlockRenderContext$BlockEmitter)mutableQuadViewImpl;
            class087432 = class05885.N((class00500)class005002);
            for (int i = 0; i < list.size(); ++i) {
                if (PlatformModelAccess.getInstance().getPartRenderType((class08877)list.get(i), class005002, class087432) == class087432) continue;
                abstractBlockRenderContext$BlockEmitter.markInvalidToDowngrade();
                break;
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            class087432 = (class08877)list.get(i);
            bufferer.emit((class08877)class087432, predicate, MutableQuadViewImpl::emitDirectly);
        }
    }
}

