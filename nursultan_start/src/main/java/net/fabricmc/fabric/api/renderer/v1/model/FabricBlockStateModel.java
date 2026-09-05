/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08877;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricBlockStateModel {
    default public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, Predicate<@Nullable class07211> predicate) {
        List list = ((class08887)this).method_68512(class060692);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            ((class08877)list.get(i)).emitQuads(quadEmitter, predicate);
        }
    }

    default public class08388 particleSprite(class07295 class072952, class07209 class072092, class00500 class005002) {
        return ((class08887)this).method_68511();
    }

    default public @Nullable Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        return null;
    }
}

