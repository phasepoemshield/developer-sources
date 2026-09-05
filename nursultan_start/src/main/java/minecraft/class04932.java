/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class03298
 *  minecraft.class03300
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06198
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07741
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.List;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class03300;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06198;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07741;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04932 {
    public static final String N = "INVALID";
    public static final class04932 y = new class04932(null, new class07321(0, 0), 0, new class03300(List.of()));
    private static final Logger L = LogUtils.getLogger();
    private final class04748 u;
    private final class03300 i;
    private final class07321 R;
    private int M;
    private volatile @Nullable class05163 B;

    public class07321 L() {
        return this.R;
    }

    protected int M() {
        return 1;
    }

    public class04932(class04748 class047482, class07321 class073212, int n, class03300 class033002) {
        this.u = class047482;
        this.R = class073212;
        this.M = n;
        this.i = class033002;
    }

    public class04748 B() {
        return this.u;
    }

    public List<class04890> Z() {
        return this.i.L();
    }

    public void i() {
        ++this.M;
    }

    public boolean u() {
        return this.M < this.M();
    }

    public boolean y() {
        return !this.i.N();
    }

    public static @Nullable class04932 N(class03298 class032982, class07001 class070012, long l) {
        String string = class070012.y("id", "");
        if (N.equals(string)) {
            return y;
        }
        class04748 class047482 = (class04748)class032982.y().L(class04227.yj).N(class01894.N((String)string));
        if (class047482 == null) {
            L.error("Unknown stucture id: {}", (Object)string);
            return null;
        }
        class07321 class073212 = new class07321(class070012.y("ChunkX", 0), class070012.y("ChunkZ", 0));
        int n = class070012.y("references", 0);
        class07741 class077412 = class070012.s("Children");
        try {
            class03300 class033002 = class03300.N((class07741)class077412, (class03298)class032982);
            if (class047482 instanceof class06198) {
                class033002 = class06198.N((class07321)class073212, (long)l, (class03300)class033002);
            }
            return new class04932(class047482, class073212, n, class033002);
        }
        catch (Exception exception) {
            L.error("Failed Start with id {}", (Object)string, (Object)exception);
            return null;
        }
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212) {
        List var7 = this.i.L();
        if (var7.isEmpty()) {
            return;
        }
        class05163 class051633 = ((class04890)var7.get((int)0)).k;
        class07209 class072092 = class051633.M();
        class07209 class072093 = new class07209(class072092.method_10263(), class051633.Z(), class072092.method_10260());
        for (class04890 class048902 : var7) {
            if (!class048902.L().N(class051632)) continue;
            class048902.N(class059742, class053242, class080882, class060692, class051632, class073212, class072093);
        }
        this.u.N(class059742, class053242, class080882, class060692, class051632, class073212, this.i);
    }

    public class05163 N() {
        class05163 class051632 = this.B;
        if (class051632 == null) {
            this.B = class051632 = this.u.N(this.i.y());
        }
        return class051632;
    }

    public class07001 N(class03298 class032982, class07321 class073212) {
        class07001 class070012 = new class07001();
        if (!this.y()) {
            class070012.N_67("id", N);
            return class070012;
        }
        class070012.N_67("id", class032982.y().L(class04227.yj).y((Object)this.u).toString());
        class070012.N("ChunkX", class073212.B);
        class070012.N("ChunkZ", class073212.Z);
        class070012.N("references", this.M);
        class070012.N("Children", this.i.N(class032982));
        return class070012;
    }

    public int R() {
        return this.M;
    }
}

