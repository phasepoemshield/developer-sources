/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class03476
 *  minecraft.class07211
 *  minecraft.class08388
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.data;

import java.util.Collection;
import java.util.EnumSet;
import java.util.function.IntFunction;
import minecraft.class00394;
import minecraft.class03476;
import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo$Builder;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.VisibilityEncoding;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class BuiltSectionInfo {
    public static final BuiltSectionInfo EMPTY = BuiltSectionInfo.createEmptyData();
    public final int flags;
    public final long visibilityData;
    public final class00394 @Nullable [] globalBlockEntities;
    public final class00394 @Nullable [] culledBlockEntities;
    public final class08388 @Nullable [] animatedSprites;

    BuiltSectionInfo(@NonNull Collection<TerrainRenderPass> collection, @NonNull Collection<class00394> collection2, @NonNull Collection<class00394> collection3, @NonNull Collection<class08388> collection4, @NonNull class03476 class034762) {
        this.globalBlockEntities = BuiltSectionInfo.toArray(collection2, class00394[]::new);
        this.culledBlockEntities = BuiltSectionInfo.toArray(collection3, class00394[]::new);
        this.animatedSprites = BuiltSectionInfo.toArray(collection4, class08388[]::new);
        int n = 0;
        if (!collection.isEmpty()) {
            n |= 1;
        }
        if (!collection3.isEmpty()) {
            n |= 2;
        }
        if (!collection4.isEmpty()) {
            n |= 4;
        }
        this.flags = n;
        this.visibilityData = VisibilityEncoding.encode(class034762);
    }

    private static <T> T[] toArray(Collection<T> collection, IntFunction<T[]> intFunction) {
        if (collection.isEmpty()) {
            return null;
        }
        return collection.toArray(intFunction);
    }

    private static BuiltSectionInfo createEmptyData() {
        class03476 class034762 = new class03476();
        class034762.N(EnumSet.allOf(class07211.class));
        BuiltSectionInfo$Builder builtSectionInfo$Builder = new BuiltSectionInfo$Builder();
        builtSectionInfo$Builder.setOcclusionData(class034762);
        return builtSectionInfo$Builder.build();
    }
}

