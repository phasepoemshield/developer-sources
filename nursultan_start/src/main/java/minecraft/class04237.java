/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00140
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class02047
 *  minecraft.class02067
 *  minecraft.class02069
 *  minecraft.class02081
 *  minecraft.class03265
 *  minecraft.class03273
 *  minecraft.class03698
 *  minecraft.class03702
 *  minecraft.class04212
 *  minecraft.class05001
 *  minecraft.class08534
 *  minecraft.class08814
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.UnbakedModelJsonDeserializer
 *  net.fabricmc.fabric.mixin.client.model.loading.BlockModelAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00140;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class02047;
import minecraft.class02067;
import minecraft.class02069;
import minecraft.class02081;
import minecraft.class03265;
import minecraft.class03273;
import minecraft.class03698;
import minecraft.class03702;
import minecraft.class04212;
import minecraft.class05001;
import minecraft.class08534;
import minecraft.class08814;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.UnbakedModelJsonDeserializer;
import net.fabricmc.fabric.mixin.client.model.loading.BlockModelAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class class04237
extends Record
implements class00167,
BlockModelAccessor {
    private final @Nullable class08534 geometry;
    private final @Nullable class00140 guiLight;
    private final @Nullable Boolean ambientOcclusion;
    private final @Nullable class03702 transforms;
    private final class08814 textureSlots;
    private final @Nullable class01894 parent;
    static final Gson y = class04237.N(new GsonBuilder().registerTypeAdapter(class04237.class, (Object)new class04212()).registerTypeAdapter(class02081.class, (Object)new class02069()).registerTypeAdapter(class02067.class, (Object)new class02047()).registerTypeAdapter(class03265.class, (Object)new class03273()).registerTypeAdapter(class03702.class, (Object)new class03698())).create();

    public class04237(@Nullable class08534 class085342, @Nullable class00140 class001402, @Nullable Boolean bl, @Nullable class03702 class037022, class08814 class088142, @Nullable class01894 class018942) {
        this.geometry = class085342;
        this.guiLight = class001402;
        this.ambientOcclusion = bl;
        this.transforms = class037022;
        this.textureSlots = class088142;
        this.parent = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04237.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "geometry", "guiLight", "ambientOcclusion", "transforms", "textureSlots", "parent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04237.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "geometry", "guiLight", "ambientOcclusion", "transforms", "textureSlots", "parent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04237.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "geometry", "guiLight", "ambientOcclusion", "transforms", "textureSlots", "parent"}, this);
    }

    private static GsonBuilder N(GsonBuilder gsonBuilder) {
        return gsonBuilder.registerTypeHierarchyAdapter(class00167.class, (Object)new UnbakedModelJsonDeserializer());
    }

    public static /* synthetic */ Gson N() {
        return y;
    }

    public static class04237 N(Reader reader) {
        return (class04237)((Object)class05001.N((Gson)y, (Reader)reader, class04237.class));
    }

    public @Nullable Boolean comp_3741() {
        return this.ambientOcclusion;
    }

    public class08814 comp_3743() {
        return this.textureSlots;
    }

    public @Nullable class01894 comp_3744() {
        return this.parent;
    }

    public @Nullable class03702 comp_3742() {
        return this.transforms;
    }

    public @Nullable class00140 comp_3740() {
        return this.guiLight;
    }

    public @Nullable class08534 comp_3739() {
        return this.geometry;
    }
}

