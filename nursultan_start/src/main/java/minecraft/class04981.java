/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09108
 *  com.google.common.collect.ComparisonChain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UUIDTypeAdapter
 *  minecraft.class00072
 *  minecraft.class00081
 *  minecraft.class00392
 *  minecraft.class04568
 *  minecraft.class04585
 *  minecraft.class04942
 *  minecraft.class05105
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.apache.commons.lang3.builder.EqualsBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09108;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import com.mojang.util.UUIDTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00072;
import minecraft.class00081;
import minecraft.class00392;
import minecraft.class04568;
import minecraft.class04585;
import minecraft.class04942;
import minecraft.class04949;
import minecraft.class04950;
import minecraft.class04961;
import minecraft.class04968;
import minecraft.class04969;
import minecraft.class05105;
import minecraft.class06202;
import minecraft.class07536;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04981
extends class05105
implements class04942 {
    private static final Logger w = LogUtils.getLogger();
    private static final int k = -1;
    public static final class00392 N = class00392.L((String)"mco.play.button.realm.closed");
    @SerializedName(value="id")
    public long y = -1L;
    @SerializedName(value="remoteSubscriptionId")
    public @Nullable String L;
    @SerializedName(value="name")
    public @Nullable String u;
    @SerializedName(value="motd")
    public String i = "";
    @SerializedName(value="state")
    public class04961 R = class04961.field_19433;
    @SerializedName(value="owner")
    public @Nullable String M;
    @SerializedName(value="ownerUUID")
    @JsonAdapter(value=UUIDTypeAdapter.class)
    public UUID B = class07536.R;
    @SerializedName(value="players")
    public List<class04950> Z = Lists.newArrayList();
    @SerializedName(value="slots")
    private List<class00072> Y = class04981.U();
    @class09108
    public Map<Integer, class00072> z = new HashMap<Integer, class00072>();
    @SerializedName(value="expired")
    public boolean U;
    @SerializedName(value="expiredTrial")
    public boolean E = false;
    @SerializedName(value="daysLeft")
    public int W;
    @SerializedName(value="worldType")
    public class04969 m = class04969.field_19437;
    @SerializedName(value="isHardcore")
    public boolean P = false;
    @SerializedName(value="gameMode")
    public int s = -1;
    @SerializedName(value="activeSlot")
    public int T = -1;
    @SerializedName(value="minigameName")
    public @Nullable String b;
    @SerializedName(value="minigameId")
    public int j = -1;
    @SerializedName(value="minigameImage")
    public @Nullable String v;
    @SerializedName(value="parentWorldId")
    public long n = -1L;
    @SerializedName(value="parentWorldName")
    public @Nullable String t;
    @SerializedName(value="activeVersion")
    public String G = "";
    @SerializedName(value="compatibility")
    public class04949 l = class04949.field_46697;
    @SerializedName(value="regionSelectionPreference")
    public @Nullable class00081 d;

    private static void L(class04981 class049812) {
        class049812.Y.forEach(class000722 -> class049812.z.put(class000722.N, (class00072)class000722));
        for (int i = 1; i <= 3; ++i) {
            if (class049812.z.containsKey(i)) continue;
            class049812.z.put(i, class00072.N((int)i));
        }
    }

    public class04568 L(String string) {
        return new class04568(Objects.requireNonNullElse(this.u, "unknown server"), string, class04585.field_45610);
    }

    public @Nullable String L() {
        return this.b;
    }

    public boolean M() {
        return !this.U && this.R == class04961.field_19434 && (this.u() || this.i() || this.E());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass() != ((Object)((Object)this)).getClass()) {
            return false;
        }
        class04981 class049812 = (class04981)((Object)object);
        return new EqualsBuilder().append(this.y, class049812.y).append((Object)this.u, (Object)class049812.u).append((Object)this.i, (Object)class049812.i).append((Object)this.R, (Object)class049812.R).append((Object)this.M, (Object)class049812.M).append(this.U, class049812.U).append((Object)this.m, (Object)this.m).isEquals();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.y, this.u, this.i, this.R, this.M, this.U});
    }

    public class04981 B() {
        class04981 class049812 = new class04981();
        class049812.y = this.y;
        class049812.L = this.L;
        class049812.u = this.u;
        class049812.i = this.i;
        class049812.R = this.R;
        class049812.M = this.M;
        class049812.Z = this.Z;
        class049812.Y = this.Y.stream().map(class00072::N).toList();
        class049812.z = this.N(this.z);
        class049812.U = this.U;
        class049812.E = this.E;
        class049812.W = this.W;
        class049812.m = this.m;
        class049812.P = this.P;
        class049812.s = this.s;
        class049812.B = this.B;
        class049812.b = this.b;
        class049812.T = this.T;
        class049812.j = this.j;
        class049812.v = this.v;
        class049812.t = this.t;
        class049812.n = this.n;
        class049812.G = this.G;
        class049812.l = this.l;
        class049812.d = this.d != null ? this.d.N() : null;
        return class049812;
    }

    public boolean Z() {
        return this.n != -1L;
    }

    public boolean i() {
        return this.l.y();
    }

    private static List<class00072> U() {
        ArrayList<class00072> arrayList = new ArrayList<class00072>();
        arrayList.add(class00072.N((int)1));
        arrayList.add(class00072.N((int)2));
        arrayList.add(class00072.N((int)3));
        return arrayList;
    }

    public boolean z() {
        return this.m == class04969.field_19438;
    }

    public boolean u() {
        return this.l.N();
    }

    private static void y(class04981 class049812) {
        class049812.Z.sort((class049502, class049503) -> ComparisonChain.start().compareFalseFirst(class049503.u, class049502.u).compare((Comparable)((Object)class049502.N.toLowerCase(Locale.ROOT)), (Comparable)((Object)class049503.N.toLowerCase(Locale.ROOT))).result());
    }

    public @Nullable String y() {
        return this.u;
    }

    public void y(String string) {
        this.i = string;
    }

    private boolean E() {
        return class06202.Nq().y(this.B);
    }

    public String N(int n) {
        if (this.u == null) {
            return this.z.get((Object)Integer.valueOf((int)n)).y.N(n);
        }
        return this.u + " (" + this.z.get((Object)Integer.valueOf((int)n)).y.N(n) + ")";
    }

    public String N() {
        return this.i;
    }

    public static void N(class04981 class049812) {
        if (class049812.Z == null) {
            class049812.Z = Lists.newArrayList();
        }
        if (class049812.Y == null) {
            class049812.Y = class04981.U();
        }
        if (class049812.z == null) {
            class049812.z = new HashMap<Integer, class00072>();
        }
        if (class049812.m == null) {
            class049812.m = class04969.field_19437;
        }
        if (class049812.G == null) {
            class049812.G = "";
        }
        if (class049812.l == null) {
            class049812.l = class04949.field_46697;
        }
        if (class049812.d == null) {
            class049812.d = class00081.N;
        }
        class04981.y(class049812);
        class04981.L(class049812);
    }

    public void N(String string) {
        this.u = string;
    }

    public static class04981 N(class04968 class049682, String string) {
        try {
            class04981 class049812 = class049682.N(string, class04981.class);
            if (class049812 == null) {
                w.error("Could not parse McoServer: {}", (Object)string);
                return new class04981();
            }
            class04981.N(class049812);
            return class049812;
        }
        catch (Exception exception) {
            w.error("Could not parse McoServer", (Throwable)exception);
            return new class04981();
        }
    }

    public Map<Integer, class00072> N(Map<Integer, class00072> map) {
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry<Integer, class00072> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new class00072(entry.getKey().intValue(), entry.getValue().y.L(), entry.getValue().L));
        }
        return hashMap;
    }

    public boolean R() {
        return this.l.L();
    }
}

