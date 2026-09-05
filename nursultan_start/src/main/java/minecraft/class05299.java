/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00295
 *  minecraft.class00311
 *  minecraft.class00329
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01894
 *  minecraft.class02422
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05311
 *  minecraft.class05317
 *  minecraft.class05319
 *  minecraft.class05328
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class00295;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01894;
import minecraft.class02422;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05287;
import minecraft.class05311;
import minecraft.class05317;
import minecraft.class05319;
import minecraft.class05328;
import minecraft.class06613;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05299
implements class01294,
class04654 {
    private static final class01894 L = class01894.y((String)"recipe_book/overlay_recipe");
    private static final int u = 4;
    private static final int i = 5;
    private static final float R = 0.375f;
    public static final int N = 25;
    private final List<class05328> M = Lists.newArrayList();
    private boolean B;
    private int Z;
    private int z;
    private class05287 U = class05287.N;
    private @Nullable class00329 E;
    final class02422 y;
    private final boolean W;

    public boolean L() {
        return this.B;
    }

    public class05299(class02422 class024222, boolean bl) {
        this.y = class024222;
        this.W = bl;
    }

    public @Nullable class00329 y() {
        return this.E;
    }

    public class05287 N() {
        return this.U;
    }

    public void N(boolean bl) {
        this.B = bl;
    }

    public void N(class05287 class052872, class00311 class003112, boolean bl, int n, int n2, int n3, int n4, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.U = class052872;
        List<class00295> var9 = class052872.N(class05317.field_52848);
        List var10 = bl ? Collections.emptyList() : class052872.N(class05317.field_52849);
        int n5 = var9.size();
        int n6 = n5 + var10.size();
        int n7 = n6 <= 16 ? 4 : 5;
        int n8 = (int)Math.ceil((float)n6 / (float)n7);
        this.Z = n;
        this.z = n2;
        float f7 = this.Z + Math.min(n6, n7) * 25;
        if (f7 > (f6 = (float)(n3 + 50))) {
            this.Z = (int)((float)this.Z - f * (float)((int)((f7 - f6) / f)));
        }
        if ((f5 = (float)(this.z + n8 * 25)) > (f4 = (float)(n4 + 50))) {
            this.z = (int)((float)this.z - f * (float)class04995.u((float)((f5 - f4) / f)));
        }
        if ((f3 = (float)this.z) < (f2 = (float)(n4 - 100))) {
            this.z = (int)((float)this.z - f * (float)class04995.u((float)((f3 - f2) / f)));
        }
        this.B = true;
        this.M.clear();
        for (int i = 0; i < n6; ++i) {
            boolean bl2 = i < n5;
            class00295 class002952 = bl2 ? var9.get(i) : (class00295)var10.get(i - n5);
            int n9 = this.Z + 4 + 25 * (i % n7);
            int n10 = this.z + 5 + 25 * (i / n7);
            if (this.W) {
                this.M.add((class05328)new class05311(this, n9, n10, class002952.N(), class002952.y(), class003112, bl2));
                continue;
            }
            this.M.add((class05328)new class05319(this, n9, n10, class002952.N(), class002952.y(), class003112, bl2));
        }
        this.E = null;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.B) {
            return;
        }
        int n3 = this.M.size() <= 16 ? 4 : 5;
        int n4 = Math.min(this.M.size(), n3);
        int n5 = class04995.u((float)((float)this.M.size() / (float)n3));
        int n6 = 4;
        class010542.N(class08394.Na, L, this.Z, this.z, n4 * 25 + 8, n5 * 25 + 8);
        Iterator<class05328> var9 = this.M.iterator();
        while (var9.hasNext()) {
            var9.next().method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25405(double d, double d2) {
        return false;
    }

    public void method_25365(boolean bl) {
    }

    public boolean method_25370() {
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() != 0) {
            return false;
        }
        for (class05328 class053282 : this.M) {
            if (!class053282.method_25402(class066132, bl)) continue;
            this.E = class053282.N;
            return true;
        }
        return false;
    }
}

