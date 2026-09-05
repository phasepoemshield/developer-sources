/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  minecraft.class06607
 *  net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import com.google.common.primitives.Floats;
import it.unimi.dsi.fastutil.ints.IntArrays;
import minecraft.class03326;
import minecraft.class06607;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class03337 {
    public static final class03337 N = class03337.N(0.0f, 0.0f, 0.0f);
    public static final class03337 L = class03337.N((Vector3f vector3f) -> -vector3f.z());

    public int[] sort(class06607 var1);

    private static class03337 N_38(class03337 class033372) {
        return VertexSorters.orthographicZ();
    }

    public static class03337 N(class03326 class033262) {
        return VertexSorters.fallback((class03326)class033262);
    }

    public static class03337 N(float f, float f2, float f3) {
        return VertexSorters.distance((float)f, (float)f2, (float)f3);
    }

    public static class03337 N(Vector3fc vector3fc) {
        return class03337.N(arg_0 -> ((Vector3fc)vector3fc).distanceSquared(arg_0));
    }

    private static /* synthetic */ int[] N(class03326 class033262, class06607 class066072) {
        Vector3f vector3f = new Vector3f();
        float[] fArray = new float[class066072.N()];
        int[] nArray = new int[class066072.N()];
        for (int i = 0; i < class066072.N(); ++i) {
            fArray[i] = class033262.apply(class066072.N(i, vector3f));
            nArray[i] = i;
        }
        IntArrays.mergeSort((int[])nArray, (n, n2) -> Floats.compare((float)fArray[n2], (float)fArray[n]));
        return nArray;
    }
}

