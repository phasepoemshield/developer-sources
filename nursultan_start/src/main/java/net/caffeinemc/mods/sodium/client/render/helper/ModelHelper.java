/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.helper;

import java.util.Arrays;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public final class ModelHelper {
    private static final class07211[] FACES = Arrays.copyOf(class07211.values(), 7);
    public static final int NULL_FACE_ID = 6;

    private ModelHelper() {
    }

    public static @Nullable class07211 faceFromIndex(int n) {
        return FACES[n];
    }

    public static int toFaceIndex(@Nullable class07211 class072112) {
        return class072112 == null ? 6 : class072112.L();
    }
}

