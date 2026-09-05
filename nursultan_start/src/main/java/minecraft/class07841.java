/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01198
 *  minecraft.class01339
 *  minecraft.class04552
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.mixin.world.combined_heightmap_update.HeightmapAccessor
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01198;
import minecraft.class01339;
import minecraft.class04552;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07830;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.mixin.world.combined_heightmap_update.HeightmapAccessor;
import org.slf4j.Logger;

public class class07841
implements HeightmapAccessor {
    private static final Logger L = LogUtils.getLogger();
    static final Predicate<class00500> N = class005002 -> !class005002.P();
    static final Predicate<class00500> y = class01339::M;
    private final class04552 u;
    private final Predicate<class00500> i;
    private final class08050 R;

    private static int L(int n, int n2) {
        return n + n2 * 16;
    }

    public class07841(class08050 class080502, class07830 class078302) {
        this.i = class078302.u();
        this.R = class080502;
        int n = class04995.R((int)(class080502.method_31605() + 1));
        this.u = new class01198(n, 256);
    }

    public int y(int n, int n2) {
        return this.N(class07841.L(n, n2)) - 1;
    }

    public long[] N() {
        return this.u.N();
    }

    public void N(class08050 class080502, class07830 class078302, long[] lArray) {
        long[] lArray2 = this.u.N();
        if (lArray2.length == lArray.length) {
            System.arraycopy(lArray, 0, lArray2, 0, lArray.length);
            return;
        }
        L.warn("Ignoring heightmap data for chunk {}, size does not match; expected: {}, got: {}", new Object[]{class080502.R(), lArray2.length, lArray.length});
        class07841.N(class080502, EnumSet.of(class078302));
    }

    public static void N(class08050 class080502, Set<class07830> set) {
        if (set.isEmpty()) {
            return;
        }
        int n = set.size();
        ObjectArrayList objectArrayList = new ObjectArrayList(n);
        ObjectListIterator objectListIterator = objectArrayList.iterator();
        int n2 = class080502.y() + 16;
        class07218 class072182 = new class07218();
        for (int i = 0; i < 16; ++i) {
            block1: for (int j = 0; j < 16; ++j) {
                for (class07830 class078302 : set) {
                    objectArrayList.add((Object)class080502.N(class078302));
                }
                for (int k = n2 - 1; k >= class080502.method_31607(); --k) {
                    class07830 class078302;
                    class072182.N(i, k, j);
                    class078302 = class080502.method_8320((class07209)class072182);
                    if (class078302.N(class00869.N)) continue;
                    while (objectListIterator.hasNext()) {
                        class07841 class078412 = (class07841)objectListIterator.next();
                        if (!class078412.i.test((class00500)class078302)) continue;
                        class078412.N(i, j, k + 1);
                        objectListIterator.remove();
                    }
                    if (objectArrayList.isEmpty()) continue block1;
                    objectListIterator.back(n);
                }
            }
        }
    }

    public boolean N(int n, int n2, int n3, class00500 class005002) {
        int n4 = this.N(n, n3);
        if (n2 <= n4 - 2) {
            return false;
        }
        if (this.i.test(class005002)) {
            if (n2 >= n4) {
                this.N(n, n3, n2 + 1);
                return true;
            }
        } else if (n4 - 1 == n2) {
            class07218 class072182 = new class07218();
            for (int i = n2 - 1; i >= this.R.method_31607(); --i) {
                class072182.N(n, i, n3);
                if (!this.i.test(this.R.method_8320((class07209)class072182))) continue;
                this.N(n, n3, i + 1);
                return true;
            }
            this.N(n, n3, this.R.method_31607());
            return true;
        }
        return false;
    }

    public int N(int n, int n2) {
        return this.N(class07841.L(n, n2));
    }

    private int N(int n) {
        return this.u.N(n) + this.R.method_31607();
    }

    private void N(int n, int n2, int n3) {
        this.u.y(class07841.L(n, n2), n3 - this.R.method_31607());
    }

    public /* synthetic */ Predicate getBlockPredicate() {
        return this.i;
    }

    public /* synthetic */ void callSet(int n, int n2, int n3) {
        this.N(n, n2, n3);
    }
}

