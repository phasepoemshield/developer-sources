/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class03042
 *  minecraft.class04809
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.util.TriState
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.mesh;

import minecraft.class02022;
import minecraft.class03042;
import minecraft.class04809;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface QuadView {
    public int color(int var1);

    public float x(int var1);

    public float v(int var1);

    public float z(int var1);

    public float u(int var1);

    public float y(int var1);

    public int tag();

    public @Nullable class08915 glint();

    public QuadAtlas atlas();

    public float normalZ(int var1);

    public float normalX(int var1);

    public float normalY(int var1);

    default public class02022 toBakedQuad(class08388 class083882) {
        Vector3f vector3f = this.copyPos(0, null);
        Vector3f vector3f2 = this.copyPos(1, null);
        Vector3f vector3f3 = this.copyPos(2, null);
        Vector3f vector3f4 = this.copyPos(3, null);
        long l = class04809.N((float)this.u(0), (float)this.v(0));
        long l2 = class04809.N((float)this.u(1), (float)this.v(1));
        long l3 = class04809.N((float)this.u(2), (float)this.v(2));
        long l4 = class04809.N((float)this.u(3), (float)this.v(3));
        int n = 15;
        if (!this.emissive()) {
            for (int i = 0; i < 4; ++i) {
                int n2 = this.lightmap(i);
                if (n2 == 0) {
                    n = 0;
                    break;
                }
                int n3 = class03042.N((int)n2);
                int n4 = class03042.y((int)n2);
                n = Math.min(n, Math.min(n3, n4));
            }
        }
        return new class02022((Vector3fc)vector3f, (Vector3fc)vector3f2, (Vector3fc)vector3f3, (Vector3fc)vector3f4, l, l2, l3, l4, this.tintIndex(), this.lightFace(), class083882, this.diffuseShade(), n);
    }

    public float posByIndex(int var1, int var2);

    public Vector3f copyPos(int var1, @Nullable Vector3f var2);

    public Vector2f copyUv(int var1, @Nullable Vector2f var2);

    public boolean emissive();

    public @Nullable class07211 cullFace();

    public ShadeMode shadeMode();

    public boolean hasNormal(int var1);

    public class07211 lightFace();

    public Vector3fc faceNormal();

    public @Nullable Vector3f copyNormal(int var1, @Nullable Vector3f var2);

    public int lightmap(int var1);

    public @Nullable class08743 renderLayer();

    public @Nullable class07211 nominalFace();

    public boolean diffuseShade();

    public TriState ambientOcclusion();

    public int tintIndex();
}

