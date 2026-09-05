/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01706
 *  minecraft.class04838
 *  minecraft.class06069
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor
 *  org.joml.Matrix3f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01687;
import minecraft.class01689;
import minecraft.class01699;
import minecraft.class01706;
import minecraft.class04838;
import minecraft.class06069;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor;
import org.joml.Matrix3f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class class01686
implements ModelPartAccessor {
    public static final float N = 1.0f;
    public float y;
    public float L;
    public float u;
    public float i;
    public float R;
    public float M;
    public float B = 1.0f;
    public float Z = 1.0f;
    public float z = 1.0f;
    public boolean U = true;
    public boolean E;
    public final List<class01687> W;
    private final Map<String, class01686> m;
    private class04838 P = class04838.N;

    public void L() {
        this.y(this.P);
    }

    public void L(Vector3f vector3f) {
        this.B += vector3f.x();
        this.Z += vector3f.y();
        this.z += vector3f.z();
    }

    public class01686(List<class01687> list, Map<String, class01686> map) {
        this.W = list;
        this.m = map;
    }

    public List<class01686> i() {
        ArrayList<class01686> arrayList = new ArrayList<class01686>();
        arrayList.add(this);
        this.N((String string, class01686 class016862) -> arrayList.add((class01686)class016862));
        return List.copyOf(arrayList);
    }

    public boolean u() {
        return this.W.isEmpty();
    }

    public class01686 y(String string) {
        class01686 class016862 = this.m.get(string);
        if (class016862 == null) {
            throw new NoSuchElementException("Can't find part " + string);
        }
        return class016862;
    }

    public void y(Vector3f vector3f) {
        this.i += vector3f.x();
        this.R += vector3f.y();
        this.M += vector3f.z();
    }

    public void y(float f, float f2, float f3) {
        this.i = f;
        this.R = f2;
        this.M = f3;
    }

    public class04838 y() {
        return this.P;
    }

    public void y(class04838 class048382) {
        this.y = class048382.N();
        this.L = class048382.y();
        this.u = class048382.L();
        this.i = class048382.u();
        this.R = class048382.i();
        this.M = class048382.R();
        this.B = class048382.M();
        this.Z = class048382.B();
        this.z = class048382.Z();
    }

    public void N(Vector3f vector3f) {
        this.y += vector3f.x();
        this.L += vector3f.y();
        this.u += vector3f.z();
    }

    public class01687 N(class06069 class060692) {
        return this.W.get(class060692.y(this.W.size()));
    }

    public void N(class01421 class014212) {
        if (this.y != 0.0f || this.L != 0.0f || this.u != 0.0f) {
            class014212.N(this.y * 0.0625f, this.L * 0.0625f, this.u * 0.0625f);
        }
        if (this.i != 0.0f || this.R != 0.0f || this.M != 0.0f) {
            MatrixHelper.rotateZYX((class01423)class014212.L(), (float)this.M, (float)this.R, (float)this.i);
        }
        if (this.B != 1.0f || this.Z != 1.0f || this.z != 1.0f) {
            class014212.y(this.B, this.Z, this.z);
        }
    }

    private void N(BiConsumer<String, class01686> biConsumer) {
        for (Map.Entry<String, class01686> object : this.m.entrySet()) {
            biConsumer.accept(object.getKey(), object.getValue());
        }
        for (class01686 class016862 : this.m.values()) {
            class016862.N(biConsumer);
        }
    }

    public void N(class01421 class014212, class01391 class013912, int n, int n2, int n3) {
        if (!this.U) {
            return;
        }
        if (this.W.isEmpty() && this.m.isEmpty()) {
            return;
        }
        class014212.N();
        this.N(class014212);
        if (!this.E) {
            this.N(class014212.L(), class013912, n, n2, n3);
        }
        Iterator<class01686> var6 = this.m.values().iterator();
        while (var6.hasNext()) {
            var6.next().N(class014212, class013912, n, n2, n3);
        }
        class014212.y();
    }

    public class04838 N() {
        return class04838.N((float)this.y, (float)this.L, (float)this.u, (float)this.i, (float)this.R, (float)this.M);
    }

    public void N(class01421 class014212, class01391 class013912, int n, int n2) {
        this.N(class014212, class013912, n, n2, -1);
    }

    public void N(float f, float f2, float f3) {
        this.y = f;
        this.L = f2;
        this.u = f3;
    }

    public boolean N(String string) {
        return this.m.containsKey(string);
    }

    public void N(class04838 class048382) {
        this.P = class048382;
    }

    private void N(class01423 class014232, class01391 class013912, int n, int n2, int n3) {
        Iterator<class01687> var6 = this.W.iterator();
        while (var6.hasNext()) {
            var6.next().N(class014232, class013912, n, n2, n3);
        }
    }

    private void N(class01421 class014212, class01689 class016892, String string) {
        if (this.W.isEmpty() && this.m.isEmpty()) {
            return;
        }
        class014212.N();
        this.N(class014212);
        class01423 class014232 = class014212.L();
        for (int i = 0; i < this.W.size(); ++i) {
            class016892.method_35748(class014232, string, i, this.W.get(i));
        }
        String string3 = string + "/";
        this.m.forEach((string2, class016862) -> class016862.N(class014212, class016892, string3 + string2));
        class014212.y();
    }

    public void N(class01421 class014212, class01689 class016892) {
        this.N(class014212, class016892, "");
    }

    public void N(class01421 class014212, Consumer<Vector3fc> consumer) {
        this.N(class014212, (class01423 class014232, String string, int n, class01687 class016872) -> {
            class01706[] class01706Array = class016872.N;
            int n2 = class01706Array.length;
            for (int i = 0; i < n2; ++i) {
                for (class01699 class016992 : class01706Array[i].N()) {
                    float f = class016992.N();
                    float f2 = class016992.y();
                    float f3 = class016992.L();
                    Vector3f vector3f = class014232.N().transformPosition(f, f2, f3, new Vector3f());
                    consumer.accept((Vector3fc)vector3f);
                }
            }
        });
    }

    public void N(Quaternionf quaternionf) {
        Vector3f vector3f = new Matrix3f().rotationZYX(this.M, this.R, this.i).rotate((Quaternionfc)quaternionf).getEulerAnglesZYX(new Vector3f());
        this.y(vector3f.x, vector3f.y, vector3f.z);
    }

    public Function<String, @Nullable class01686> R() {
        HashMap<String, class01686> hashMap = new HashMap<String, class01686>();
        hashMap.put("root", this);
        this.N(hashMap::putIfAbsent);
        return hashMap::get;
    }

    public /* synthetic */ void fabric$callForEachChild(BiConsumer biConsumer) {
        this.N(biConsumer);
    }
}

