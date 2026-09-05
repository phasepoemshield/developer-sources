/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class02022
 *  minecraft.class06202
 *  minecraft.class07211
 *  minecraft.class08589
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import minecraft.class02022;
import minecraft.class06202;
import minecraft.class07211;
import minecraft.class08589;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
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

    public static List<class02022>[] toQuadLists(Mesh mesh) {
        SpriteFinder spriteFinder = class06202.Nq().yW().N(class08589.u).spriteFinder();
        ImmutableList.Builder[] builderArray = new ImmutableList.Builder[7];
        for (int i = 0; i < 7; ++i) {
            builderArray[i] = ImmutableList.builder();
        }
        mesh.forEach(quadView -> {
            class07211 class072112 = quadView.cullFace();
            builderArray[class072112 == null ? 6 : class072112.L()].add((Object)quadView.toBakedQuad(spriteFinder.find((QuadView)quadView)));
        });
        List[] listArray = new List[7];
        for (int i = 0; i < 7; ++i) {
            listArray[i] = builderArray[i].build();
        }
        return listArray;
    }
}

