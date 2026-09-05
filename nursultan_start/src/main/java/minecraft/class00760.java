/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class01043
 *  minecraft.class03218
 *  minecraft.class05214
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07428
 *  minecraft.class07529
 *  minecraft.class08050
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class00803;
import minecraft.class01043;
import minecraft.class03218;
import minecraft.class05214;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07428;
import minecraft.class07529;
import minecraft.class08050;
import org.jspecify.annotations.Nullable;

public class class00760 {
    private final int N;
    private final Object2IntOpenHashMap<class07428> y;
    private final class05214 L;
    private final Object2IntMap<class07428> u;
    private final class03218 i;
    private @Nullable class07209 R;
    private @Nullable class07078<?> M;
    private double B;

    class00760(int n, Object2IntOpenHashMap<class07428> object2IntOpenHashMap, class05214 class052142, class03218 class032182) {
        this.N = n;
        this.y = object2IntOpenHashMap;
        this.L = class052142;
        this.i = class032182;
        this.u = Object2IntMaps.unmodifiable(object2IntOpenHashMap);
    }

    public Object2IntMap<class07428> y() {
        return this.u;
    }

    boolean N(class07428 class074282, class07321 class073212) {
        return this.i.N(class074282, class073212) || class07529.Nb;
    }

    boolean N(class07428 class074282) {
        int n = class074282.y() * this.N / class00803.u;
        return this.y.getInt((Object)class074282) < n;
    }

    public int N() {
        return this.N;
    }

    public void N(class07079 class070792, class08050 class080502) {
        class01043 class010432;
        class07078 var3 = class070792.method_5864();
        class07209 class072092 = class070792.method_24515();
        double d = class072092.equals((Object)this.R) && var3 == this.M ? this.B : ((class010432 = class00803.N(class072092, class080502).N().N(var3)) != null ? class010432.y() : 0.0);
        this.L.N(class072092, d);
        class010432 = var3.i();
        this.y.addTo((Object)class010432, 1);
        this.i.N(new class07321(class072092), (class07428)class010432);
    }

    public boolean N(class07078<?> class070782, class07209 class072092, class08050 class080502) {
        double d;
        this.R = class072092;
        this.M = class070782;
        class01043 class010432 = class00803.N(class072092, class080502).N().N(class070782);
        if (class010432 == null) {
            this.B = 0.0;
            return true;
        }
        this.B = d = class010432.y();
        return this.L.y(class072092, d) <= class010432.N();
    }
}

