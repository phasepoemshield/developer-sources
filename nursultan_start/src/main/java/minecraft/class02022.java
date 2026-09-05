/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03042
 *  minecraft.class04809
 *  minecraft.class07211
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFlags
 *  org.joml.Vector3fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Objects;
import minecraft.class03042;
import minecraft.class04809;
import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFlags;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class02022
implements BakedQuadView {
    private Vector3fc position0;
    private Vector3fc position1;
    private Vector3fc position2;
    private Vector3fc position3;
    private long packedUV0;
    private long packedUV1;
    private long packedUV2;
    private long packedUV3;
    private int tintIndex;
    private class07211 direction;
    private class08388 sprite;
    private boolean shade;
    private int lightEmission;
    public static final int N = 4;
    private int P;
    private int s;
    private ModelQuadFacing T = null;

    public Vector3fc L() {
        return this.position1;
    }

    public int getFlags() {
        return this.P;
    }

    public long M() {
        return this.packedUV1;
    }

    public int getLight(int n) {
        return 0;
    }

    public class02022(Vector3fc vector3fc, Vector3fc vector3fc2, Vector3fc vector3fc3, Vector3fc vector3fc4, long l, long l2, long l3, long l4, int n, class07211 class072112, class08388 class083882, boolean bl, int n2) {
        this.position0 = vector3fc;
        this.position1 = vector3fc2;
        this.position2 = vector3fc3;
        this.position3 = vector3fc4;
        this.packedUV0 = l;
        this.packedUV1 = l2;
        this.packedUV2 = l3;
        this.packedUV3 = l4;
        this.tintIndex = n;
        this.direction = class072112;
        this.sprite = class083882;
        this.shade = bl;
        this.lightEmission = n2;
        this.N(vector3fc, vector3fc2, vector3fc3, vector3fc4, l, l2, l3, l4, n, class072112, class083882, bl, n2, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class02022 && Objects.equals(this.position0, ((class02022)object).position0) && Objects.equals(this.position1, ((class02022)object).position1) && Objects.equals(this.position2, ((class02022)object).position2) && Objects.equals(this.position3, ((class02022)object).position3) && this.packedUV0 == ((class02022)object).packedUV0 && this.packedUV1 == ((class02022)object).packedUV1 && this.packedUV2 == ((class02022)object).packedUV2 && this.packedUV3 == ((class02022)object).packedUV3 && this.tintIndex == ((class02022)object).tintIndex && Objects.equals(this.direction, ((class02022)object).direction) && Objects.equals(this.sprite, ((class02022)object).sprite) && this.shade == ((class02022)object).shade && this.lightEmission == ((class02022)object).lightEmission;
    }

    public final String toString() {
        return "class02022[position0=" + Objects.toString(this.position0) + ", position1=" + Objects.toString(this.position1) + ", position2=" + Objects.toString(this.position2) + ", position3=" + Objects.toString(this.position3) + ", packedUV0=" + Long.toString(this.packedUV0) + ", packedUV1=" + Long.toString(this.packedUV1) + ", packedUV2=" + Long.toString(this.packedUV2) + ", packedUV3=" + Long.toString(this.packedUV3) + ", tintIndex=" + Integer.toString(this.tintIndex) + ", direction=" + Objects.toString(this.direction) + ", sprite=" + Objects.toString(this.sprite) + ", shade=" + Boolean.toString(this.shade) + ", lightEmission=" + Integer.toString(this.lightEmission) + "]";
    }

    public final int hashCode() {
        return ((((((((((((0 * 31 + Objects.hashCode(this.position0)) * 31 + Objects.hashCode(this.position1)) * 31 + Objects.hashCode(this.position2)) * 31 + Objects.hashCode(this.position3)) * 31 + Long.hashCode(this.packedUV0)) * 31 + Long.hashCode(this.packedUV1)) * 31 + Long.hashCode(this.packedUV2)) * 31 + Long.hashCode(this.packedUV3)) * 31 + Integer.hashCode(this.tintIndex)) * 31 + Objects.hashCode(this.direction)) * 31 + Objects.hashCode(this.sprite)) * 31 + Boolean.hashCode(this.shade)) * 31 + Integer.hashCode(this.lightEmission);
    }

    public long B() {
        return this.packedUV2;
    }

    public long Z() {
        return this.packedUV3;
    }

    public Vector3fc i() {
        return this.position3;
    }

    public int m() {
        return this.lightEmission;
    }

    public class07211 U() {
        return this.direction;
    }

    public int z() {
        return this.tintIndex;
    }

    public Vector3fc u() {
        return this.position2;
    }

    public long y(int n) {
        return switch (n) {
            case 0 -> this.packedUV0;
            case 1 -> this.packedUV1;
            case 2 -> this.packedUV2;
            case 3 -> this.packedUV3;
            default -> throw new IndexOutOfBoundsException(n);
        };
    }

    public Vector3fc y() {
        return this.position0;
    }

    public class08388 E() {
        return this.sprite;
    }

    private void N(Vector3fc vector3fc, Vector3fc vector3fc2, Vector3fc vector3fc3, Vector3fc vector3fc4, long l, long l2, long l3, long l4, int n, class07211 class072112, class08388 class083882, boolean bl, int n2, CallbackInfo callbackInfo) {
        this.s = this.calculateNormal();
        this.T = ModelQuadFacing.fromPackedNormal((int)this.s);
        this.P = ModelQuadFlags.getQuadFlags((ModelQuadView)this, (class07211)class072112);
    }

    public boolean N() {
        return this.tintIndex != -1;
    }

    public Vector3fc N(int n) {
        return switch (n) {
            case 0 -> this.position0;
            case 1 -> this.position1;
            case 2 -> this.position2;
            case 3 -> this.position3;
            default -> throw new IndexOutOfBoundsException(n);
        };
    }

    public float getY(int n) {
        return this.N(n).y();
    }

    public float getX(int n) {
        return this.N(n).x();
    }

    public float getZ(int n) {
        return this.N(n).z();
    }

    public boolean W() {
        return this.shade;
    }

    public long R() {
        return this.packedUV0;
    }

    public int getColor(int n) {
        return -1;
    }

    public boolean hasAO() {
        return true;
    }

    public float getTexU(int n) {
        return class04809.N((long)this.y(n));
    }

    public boolean hasShade() {
        return this.shade;
    }

    public float getTexV(int n) {
        return class04809.y((long)this.y(n));
    }

    public class08388 getSprite() {
        return this.sprite;
    }

    public int getVertexNormal(int n) {
        return 0;
    }

    public int getMaxLightQuad(int n) {
        return class03042.y((int)this.getLight(n), (int)this.m());
    }

    public int getFaceNormal() {
        return this.s;
    }

    public class07211 getLightFace() {
        return this.direction;
    }

    public ModelQuadFacing getNormalFace() {
        return this.T;
    }

    public int getTintIndex() {
        return this.tintIndex;
    }
}

