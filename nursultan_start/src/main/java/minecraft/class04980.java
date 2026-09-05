/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09108
 *  com.google.gson.annotations.SerializedName
 *  minecraft.class04942
 *  minecraft.class05105
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07312
 *  minecraft.class08392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09108;
import com.google.gson.annotations.SerializedName;
import minecraft.class04942;
import minecraft.class04949;
import minecraft.class04968;
import minecraft.class05018;
import minecraft.class05105;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07312;
import minecraft.class08392;
import org.jspecify.annotations.Nullable;

public class class04980
extends class05105
implements class04942 {
    @SerializedName(value="spawnProtection")
    public int N = 0;
    @SerializedName(value="forceGameMode")
    public boolean y = false;
    @SerializedName(value="difficulty")
    public int L = 2;
    @SerializedName(value="gameMode")
    public int u = 0;
    @SerializedName(value="slotName")
    private String z = "";
    @SerializedName(value="version")
    public String i = "";
    @SerializedName(value="compatibility")
    public class04949 R = class04949.field_46697;
    @SerializedName(value="worldTemplateId")
    public long M = -1L;
    @SerializedName(value="worldTemplateImage")
    public @Nullable String B = null;
    @class09108
    public boolean Z;

    public class04980 L() {
        return new class04980(this.N, this.L, this.u, this.y, this.z, this.i, this.R);
    }

    private class04980() {
    }

    public class04980(int n, int n2, int n3, boolean bl, String string, String string2, class04949 class049492) {
        this.N = n;
        this.L = n2;
        this.u = n3;
        this.y = bl;
        this.z = string;
        this.i = string2;
        this.R = class049492;
    }

    public static class04980 y() {
        class04980 class049802 = class04980.N();
        class049802.N(true);
        return class049802;
    }

    public String y(int n) {
        return class08392.N((String)"mco.configure.world.slot", (Object[])new Object[]{n});
    }

    private static void N(class04980 class049802) {
        if (class049802.z == null) {
            class049802.z = "";
        }
        if (class049802.i == null) {
            class049802.i = "";
        }
        if (class049802.R == null) {
            class049802.R = class04949.field_46697;
        }
    }

    public void N(boolean bl) {
        this.Z = bl;
    }

    public String N(int n) {
        if (class05018.B(this.z)) {
            if (this.Z) {
                return class08392.N((String)"mco.configure.world.slot.empty", (Object[])new Object[0]);
            }
            return this.y(n);
        }
        return this.z;
    }

    public static class04980 N() {
        return new class04980();
    }

    public static class04980 N(class07282 class072822, class07086 class070862, boolean bl, String string, String string2) {
        class04980 class049802 = class04980.N();
        class049802.L = class070862.N();
        class049802.u = class072822.N();
        class049802.z = string2;
        class049802.i = string;
        return class049802;
    }

    public static class04980 N(class07312 class073122, String string) {
        return class04980.N(class073122.y(), class073122.u(), class073122.L(), string, class073122.N());
    }

    public static class04980 N(class04968 class049682, String string) {
        class04980 class049802 = class049682.N(string, class04980.class);
        if (class049802 == null) {
            return class04980.N();
        }
        class04980.N(class049802);
        return class049802;
    }
}

