/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04353
 *  minecraft.class04373
 *  minecraft.class04396
 *  org.joml.Vector3f
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00121;
import minecraft.class01686;
import minecraft.class04353;
import minecraft.class04373;
import minecraft.class04396;
import org.joml.Vector3f;

public class class00094 {
    private final class04353 N;
    private final List<class00121> y;

    private class00094(class04353 class043532, List<class00121> list) {
        this.N = class043532;
        this.y = list;
    }

    public void N(class04396 class043963, float f, float f2) {
        class043963.N(class043962 -> this.N((long)((float)class043962.N(f) * f2), 1.0f));
    }

    public void N(long l, float f) {
        float f2 = this.N(l);
        Vector3f vector3f = new Vector3f();
        Iterator<class00121> var6 = this.y.iterator();
        while (var6.hasNext()) {
            var6.next().N(f2, f, vector3f);
        }
    }

    private float N(long l) {
        float f = (float)l / 1000.0f;
        return this.N.y() ? f % this.N.N() : f;
    }

    static class00094 N(class01686 class016862, class04353 class043532) {
        ArrayList<class00121> arrayList = new ArrayList<class00121>();
        Function var3 = class016862.R();
        for (Map.Entry entry : class043532.L().entrySet()) {
            String string = (String)entry.getKey();
            List var7 = (List)entry.getValue();
            class01686 class016863 = (class01686)var3.apply(string);
            if (class016863 == null) {
                throw new IllegalArgumentException("Cannot animate " + string + ", which does not exist in model");
            }
            for (class04373 class043732 : var7) {
                arrayList.add(new class00121(class016863, class043732.N(), class043732.y()));
            }
        }
        return new class00094(class043532, List.copyOf(arrayList));
    }

    public void N() {
        this.N(0L, 1.0f);
    }

    public void N(float f, float f2, float f3, float f4) {
        long l = (long)(f * 50.0f * f3);
        float f5 = Math.min(f2 * f4, 1.0f);
        this.N(l, f5);
    }

    public void N(class04396 class043962, float f) {
        this.N(class043962, f, 1.0f);
    }
}

