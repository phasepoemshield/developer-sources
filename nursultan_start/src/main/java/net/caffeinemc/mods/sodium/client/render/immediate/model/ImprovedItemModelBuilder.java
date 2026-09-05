/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01991
 *  minecraft.class02052
 *  minecraft.class02067
 *  minecraft.class02081
 *  minecraft.class02124
 *  minecraft.class08511
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.immediate.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import minecraft.class01991;
import minecraft.class02052;
import minecraft.class02067;
import minecraft.class02081;
import minecraft.class02124;
import minecraft.class08511;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder$FaceStorage;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder$SideFace;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class ImprovedItemModelBuilder {
    public static List<class02081> bakeSideQuads(class01991 class019912, String string, int n) {
        ArrayList<class02081> arrayList = new ArrayList<class02081>();
        float f = 16.0f / (float)class019912.method_45807();
        float f2 = 16.0f / (float)class019912.method_45815();
        for (ImprovedItemModelBuilder$SideFace improvedItemModelBuilder$SideFace : ImprovedItemModelBuilder.buildSideFaces(class019912)) {
            class02124 class021242 = improvedItemModelBuilder$SideFace.facing();
            int n2 = improvedItemModelBuilder$SideFace.anchor();
            int n3 = improvedItemModelBuilder$SideFace.min();
            int n4 = improvedItemModelBuilder$SideFace.max();
            float f3 = class021242.y() ? (float)n3 : (float)n2;
            float f4 = class021242.y() ? (float)n2 : (float)n3;
            float f5 = (float)(n4 - n3) + 1.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            if (class021242.y()) {
                f6 = f3 + 0.1f;
                f7 = f4 + 0.1f;
                f8 = f3 + f5 - 0.1f;
                f9 = f4 + 1.0f - 0.1f;
            } else {
                f6 = f3 + 0.1f;
                f7 = f4 + f5 - 0.1f;
                f8 = f3 + 1.0f - 0.1f;
                f9 = f4 + 0.1f;
            }
            float f10 = f3;
            float f11 = f4;
            float f12 = f3;
            float f13 = f4;
            switch (class021242) {
                case field_4281: {
                    f12 = f3 + f5;
                    break;
                }
                case field_4277: {
                    f13 = f4 + f5;
                    break;
                }
                case field_4278: {
                    f11 = f4 + 1.0f;
                    f13 = f4 + 1.0f;
                    f12 = f3 + f5;
                    break;
                }
                case field_4283: {
                    f10 = f3 + 1.0f;
                    f12 = f3 + 1.0f;
                    f13 = f4 + f5;
                }
            }
            f10 *= f;
            f11 *= f2;
            f12 *= f;
            f13 *= f2;
            f11 = 16.0f - f11;
            f13 = 16.0f - f13;
            switch (class021242) {
                case field_4283: {
                    f10 = f12;
                    break;
                }
                case field_4278: {
                    f11 = f13;
                    break;
                }
                case field_4277: {
                    f12 = f10;
                    break;
                }
                case field_4281: {
                    f13 = f11;
                }
            }
            arrayList.add(new class02081((Vector3fc)new Vector3f(f10, f11, 7.5f), (Vector3fc)new Vector3f(f12, f13, 8.5f), Map.of(class021242.N(), new class02067(null, n, string, new class02052(f6 * f, f7 * f2, f8 * f, f9 * f2), class08511.field_57029))));
        }
        return arrayList;
    }

    private static Collection<ImprovedItemModelBuilder$SideFace> buildSideFaces(class01991 class019912) {
        int n = class019912.method_45807();
        int n2 = class019912.method_45815();
        ImprovedItemModelBuilder$FaceStorage improvedItemModelBuilder$FaceStorage = new ImprovedItemModelBuilder$FaceStorage();
        class019912.method_45817().forEach(n3 -> {
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < n; ++j) {
                    improvedItemModelBuilder$FaceStorage.tryInsertPixel(class019912, n3, j, i, n, n2);
                }
            }
        });
        return improvedItemModelBuilder$FaceStorage.buildSideFaces();
    }
}

