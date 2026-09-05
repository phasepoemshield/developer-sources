/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00783
 *  minecraft.class01231
 *  minecraft.class01763
 *  minecraft.class02119
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04604
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumMap;
import minecraft.class00500;
import minecraft.class00783;
import minecraft.class01231;
import minecraft.class01763;
import minecraft.class02119;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04604;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class00461
extends class02119 {
    private final boolean N;
    private final Long2ObjectMap<class04425> y = new Long2ObjectOpenHashMap();

    public class00461(boolean bl) {
        this.N = bl;
    }

    public class01763 y() {
        return this.L(class04995.N((double)this.u.method_5829().N), class04995.N((double)(this.u.method_5829().y + 0.5)), class04995.N((double)this.u.method_5829().L));
    }

    private static boolean y(@Nullable class01763 class017632) {
        return class017632 != null && class017632.U >= 0.0f;
    }

    protected class04425 y(int n, int n2, int n3) {
        return (class04425)this.y.computeIfAbsent(class07209.method_10064((int)n, (int)n2, (int)n3), l -> this.N(this.L, n, n2, n3));
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        return this.N(class026822, n, n2, n3, this.u);
    }

    protected @Nullable class01763 N(int n, int n2, int n3) {
        float f;
        class01763 class017632 = null;
        class04425 class044252 = this.y(n, n2, n3);
        if ((this.N && class044252 == class04425.field_16 || class044252 == class04425.field_18) && (f = this.u.N(class044252)) >= 0.0f) {
            class017632 = this.L(n, n2, n3);
            class017632.E = class044252;
            class017632.U = Math.max(class017632.U, f);
            if (this.L.N().method_8316(new class07209(n, n2, n3)).W()) {
                class017632.U += 8.0f;
            }
        }
        return class017632;
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3, class07079 class070792) {
        class07218 class072182 = new class07218();
        for (int i = n; i < n + this.R; ++i) {
            for (int j = n2; j < n2 + this.M; ++j) {
                for (int k = n3; k < n3 + this.B; ++k) {
                    class00500 class005002 = class026822.N((class07209)class072182.N(i, j, k));
                    class04688 class046882 = class005002.Y();
                    if (class046882.W() && class005002.N(class08791.field_48) && class005002.P()) {
                        return class04425.field_16;
                    }
                    if (class046882.N(class01231.N)) continue;
                    return class04425.field_22;
                }
            }
        }
        class00500 class005003 = class026822.N((class07209)class072182);
        if (class005003.N(class08791.field_48)) {
            return class04425.field_18;
        }
        return class04425.field_22;
    }

    public void N(class00783 class007832, class07079 class070792) {
        super.N(class007832, class070792);
        this.y.clear();
    }

    public void N() {
        super.N();
        this.y.clear();
    }

    public class04604 N(double d, double d2, double d3) {
        return this.y(d, d2, d3);
    }

    public int N(class01763[] class01763Array, class01763 class017632) {
        int n = 0;
        EnumMap enumMap = Maps.newEnumMap(class07211.class);
        for (class07211 class072112 : class07211.values()) {
            class01763 class017633 = this.N(class017632.N + class072112.P(), class017632.y + class072112.s(), class017632.L + class072112.T());
            enumMap.put(class072112, class017633);
            if (!this.N(class017633)) continue;
            class01763Array[n++] = class017633;
        }
        for (class07211 class072113 : class07221.field_11062) {
            class07211 class072112;
            class07211 class072114 = class072113.R();
            if (!class00461.y((class01763)enumMap.get(class072113)) || !class00461.y((class01763)enumMap.get(class072114)) || !this.N((class01763)(class072112 = this.N(class017632.N + class072113.P() + class072114.P(), class017632.y, class017632.L + class072113.T() + class072114.T())))) continue;
            class01763Array[n++] = class072112;
        }
        return n;
    }

    protected boolean N(@Nullable class01763 class017632) {
        return class017632 != null && !class017632.Z;
    }
}

