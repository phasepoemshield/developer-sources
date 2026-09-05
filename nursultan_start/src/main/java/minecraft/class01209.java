/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00892
 *  minecraft.class01001
 *  minecraft.class01224
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03298
 *  minecraft.class04227
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08070
 *  minecraft.class08088
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00892;
import minecraft.class01001;
import minecraft.class01207;
import minecraft.class01224;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03298;
import minecraft.class04227;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08070;
import minecraft.class08088;
import org.slf4j.Logger;

public abstract class class01209
extends class04890 {
    private static final Logger i = LogUtils.getLogger();
    protected final String N;
    protected class01207 y;
    protected class01233 L;
    protected class07209 u;

    public class01209(class04878 class048782, int n, class01224 class012242, class01894 class018942, String string, class01233 class012332, class07209 class072092) {
        super(class048782, n, class012242.N(class018942).y(class012332, class072092));
        this.N(class07211.field_11043);
        this.N = string;
        this.u = class072092;
        this.y = class012242.N(class018942);
        this.L = class012332;
    }

    public class01209(class04878 class048782, class07001 class070012, class01224 class012242, Function<class01894, class01233> function) {
        super(class048782, class070012);
        this.N(class07211.field_11043);
        this.N = class070012.y("Template", "");
        this.u = new class07209(class070012.y("TPX", 0), class070012.y("TPY", 0), class070012.y("TPZ", 0));
        class01894 class018942 = this.N();
        this.y = class012242.N(class018942);
        this.L = function.apply(class018942);
        this.k = this.y.y(this.L, this.u);
    }

    public class01207 Z() {
        return this.y;
    }

    public class01233 U() {
        return this.L;
    }

    public class07209 z() {
        return this.u;
    }

    @Deprecated
    public void N(int n, int n2, int n3) {
        super.N(n, n2, n3);
        this.u = this.u.method_10069(n, n2, n3);
    }

    protected void N(class03298 class032982, class07001 class070012) {
        class070012.N("TPX", this.u.method_10263());
        class070012.N("TPY", this.u.method_10264());
        class070012.N("TPZ", this.u.method_10260());
        class070012.N_67("Template", this.N);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.L.N(class051632);
        this.k = this.y.y(this.L, this.u);
        if (this.y.N((class01001)class059742, this.u, class072092, this.L, class060692, 2)) {
            for (class01228 class012282 : this.y.N(this.u, this.L, class00869.sh)) {
                class08070 class080702;
                if (class012282.L() == null || (class080702 = (class08070)class012282.L().N_15("mode", class08070.field_56673).orElseThrow()) != class08070.field_12696) continue;
                this.N(class012282.L().y("metadata", ""), class012282.N(), (class01001)class059742, class060692, class051632);
            }
            List<class01228> var9 = this.y.N(this.u, this.L, class00869.sr);
            for (class01228 class012282 : var9) {
                if (class012282.L() == null) continue;
                String string = class012282.L().y("final_state", "minecraft:air");
                class00500 class005002 = class00869.N.W();
                try {
                    class005002 = class00892.N((class01905)class059742.N_51(class04227.Z), (String)string, (boolean)true).N();
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    i.error("Error while parsing blockstate {} in jigsaw block @ {}", (Object)string, (Object)class012282.N());
                }
                class059742.method_8652(class012282.N(), class005002, 3);
            }
        }
    }

    protected abstract void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5);

    protected class01894 N() {
        return class01894.N((String)this.N);
    }

    public class06993 R() {
        return this.L.u();
    }
}

