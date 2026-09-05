/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00754
 *  minecraft.class01042
 *  minecraft.class01487
 *  minecraft.class02796
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03796
 *  minecraft.class05042
 *  minecraft.class05081
 *  minecraft.class05212
 *  minecraft.class05474
 *  minecraft.class05934
 *  minecraft.class05976
 *  minecraft.class07001
 *  minecraft.class07074
 *  minecraft.class07086
 *  minecraft.class07229
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07717
 *  minecraft.class07741
 *  minecraft.class07826
 *  minecraft.class08074
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00754;
import minecraft.class01042;
import minecraft.class01487;
import minecraft.class02796;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03796;
import minecraft.class05042;
import minecraft.class05081;
import minecraft.class05212;
import minecraft.class05474;
import minecraft.class05934;
import minecraft.class05976;
import minecraft.class06228;
import minecraft.class07001;
import minecraft.class07074;
import minecraft.class07086;
import minecraft.class07229;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07717;
import minecraft.class07741;
import minecraft.class07826;
import minecraft.class08074;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06207
implements class05081,
class05212 {
    private static final Logger R = LogUtils.getLogger();
    public static final String N = "LevelName";
    protected static final String y = "Player";
    protected static final String L = "WorldGenSettings";
    private class07312 M;
    private final class05934 B;
    private final class06228 Z;
    private final Lifecycle z;
    private class05042 U;
    private long E;
    private long W;
    private final @Nullable class07001 m;
    private final int P;
    private int s;
    private boolean T;
    private int b;
    private boolean j;
    private int v;
    private boolean n;
    private boolean t;
    @Deprecated
    private Optional<class08074> G;
    private class07826 l;
    private @Nullable class07001 d;
    private int w;
    private int k;
    private @Nullable UUID Y;
    private final Set<String> Q;
    private boolean O;
    private final Set<String> g;
    private final class00754<class02796> I;

    public boolean w() {
        return this.Z == class06228.field_40375;
    }

    public long L() {
        return this.W;
    }

    public void L(int n) {
        this.b = n;
    }

    public void L(boolean bl) {
        this.n = bl;
    }

    public int M() {
        return this.v;
    }

    public Optional<class08074> P() {
        return this.G;
    }

    public boolean T() {
        return this.t;
    }

    public class03776 Q() {
        return this.M.M();
    }

    private class06207(@Nullable class07001 class070012, boolean bl, class05042 class050422, long l, long l2, int n, int n2, int n3, boolean bl2, int n4, boolean bl3, boolean bl4, boolean bl5, Optional<class08074> optional, int n5, int n6, @Nullable UUID uUID, Set<String> set, Set<String> set2, class00754<class02796> class007542, @Nullable class07001 class070013, class07826 class078262, class07312 class073122, class05934 class059342, class06228 class062282, Lifecycle lifecycle) {
        this.O = bl;
        this.U = class050422;
        this.E = l;
        this.W = l2;
        this.P = n;
        this.s = n2;
        this.b = n3;
        this.T = bl2;
        this.v = n4;
        this.j = bl3;
        this.n = bl4;
        this.t = bl5;
        this.G = optional;
        this.w = n5;
        this.k = n6;
        this.Y = uUID;
        this.Q = set;
        this.g = set2;
        this.m = class070012;
        this.I = class007542;
        this.d = class070013;
        this.l = class078262;
        this.M = class073122;
        this.B = class059342;
        this.Z = class062282;
        this.z = lifecycle;
    }

    public class06207(class07312 class073122, class05934 class059342, class06228 class062282, Lifecycle lifecycle) {
        this(null, false, class05042.N, 0L, 0L, 19133, 0, 0, false, 0, false, false, false, Optional.empty(), 0, 0, null, Sets.newLinkedHashSet(), new HashSet<String>(), (class00754<class02796>)new class00754(class07229.N), null, class07826.Z, class073122.B(), class059342, class062282, lifecycle);
    }

    public boolean B() {
        return this.T;
    }

    public Set<String> I() {
        return ImmutableSet.copyOf(this.Q);
    }

    public Set<String> J() {
        return Set.copyOf(this.g);
    }

    public int Z() {
        return this.b;
    }

    public void i(int n) {
        this.k = n;
    }

    public int i() {
        return this.s;
    }

    public class00754<class02796> b() {
        return this.I;
    }

    public class07086 s() {
        return this.M.u();
    }

    public @Nullable UUID n() {
        return this.Y;
    }

    public class05934 l() {
        return this.B;
    }

    public boolean d() {
        return this.Z == class06228.field_40374;
    }

    public class07305 m() {
        return this.M.R();
    }

    public class05212 o() {
        return this;
    }

    public Lifecycle k() {
        return this.z;
    }

    public @Nullable class07001 t() {
        return this.m;
    }

    public boolean g() {
        return this.O;
    }

    public int v() {
        return this.k;
    }

    public int j() {
        return this.w;
    }

    public class07312 q() {
        return this.M.B();
    }

    public boolean U() {
        return this.M.L();
    }

    public class07282 z() {
        return this.M.y();
    }

    public void u(int n) {
        this.w = n;
    }

    public void u(boolean bl) {
        this.t = bl;
    }

    public String u() {
        return this.M.N();
    }

    public void y(boolean bl) {
        this.T = bl;
    }

    public void y(long l) {
        this.W = l;
    }

    public long y() {
        return this.E;
    }

    public void y(int n) {
        this.v = n;
    }

    public boolean E() {
        return this.M.i();
    }

    public void N(@Nullable class07001 class070012) {
        this.d = class070012;
    }

    public void N(Optional<class08074> optional) {
        this.G = optional;
    }

    public void N(UUID uUID) {
        this.Y = uUID;
    }

    public void N(String string, boolean bl) {
        this.Q.add(string);
        this.O |= bl;
    }

    public class05042 N() {
        return this.U;
    }

    public void N(class05042 class050422) {
        this.U = class050422;
    }

    public void N(class07086 class070862) {
        this.M = this.M.N(class070862);
    }

    private void N(class01042 class010422, class07001 class070012, @Nullable class07001 class070013) {
        class070012.N("ServerBrands", (class07709)class06207.N(this.Q));
        class070012.N("WasModded", this.O);
        if (!this.g.isEmpty()) {
            class070012.N("removed_features", (class07709)class06207.N(this.g));
        }
        class07001 class070014 = new class07001();
        class070014.N_67("Name", class07529.y().comp_4025());
        class070014.N("Id", class07529.y().comp_4026().y());
        class070014.N("Snapshot", !class07529.y().comp_4031());
        class070014.N_67("Series", class07529.y().comp_4026().L());
        class070012.N("Version", (class07709)class070014);
        class07717.i((class07001)class070012);
        class03796.N((DynamicOps)class010422.N((DynamicOps)class07713.N), (class05934)this.B, (class01042)class010422).resultOrPartial(class07536.N((String)"WorldGenSettings: ", arg_0 -> ((Logger)R).error(arg_0))).ifPresent(class077092 -> class070012.N(L, class077092));
        class070012.N("GameType", this.M.y().N());
        class070012.N("spawn", class05042.L, (Object)this.U);
        class070012.N("Time", this.E);
        class070012.N("DayTime", this.W);
        class070012.N("LastPlayed", class07536.i());
        class070012.N_67(N, this.M.N());
        class070012.N("version", 19133);
        class070012.N("clearWeatherTime", this.s);
        class070012.N("rainTime", this.b);
        class070012.N("raining", this.T);
        class070012.N("thunderTime", this.v);
        class070012.N("thundering", this.j);
        class070012.N("hardcore", this.M.L());
        class070012.N("allowCommands", this.M.i());
        class070012.N("initialized", this.n);
        this.G.ifPresent(class080742 -> class070012.N("world_border", class08074.y, class080742));
        class070012.N("Difficulty", (byte)this.M.u().N());
        class070012.N("DifficultyLocked", this.t);
        class070012.N("game_rules", class07305.N((class03767)this.K()), (Object)this.M.R());
        class070012.N("DragonFight", class07826.B, (Object)this.l);
        if (class070013 != null) {
            class070012.N(y, (class07709)class070013);
        }
        class070012.N(class03776.y, (Object)this.M.M());
        if (this.d != null) {
            class070012.N("CustomBossEvents", (class07709)this.d);
        }
        class070012.N("ScheduledEvents", (class07709)this.I.y());
        class070012.N("WanderingTraderSpawnDelay", this.w);
        class070012.N("WanderingTraderSpawnChance", this.k);
        class070012.y("WanderingTraderId", class01487.N, (Object)this.Y);
    }

    public void N(int n) {
        this.s = n;
    }

    public void N(boolean bl) {
        this.j = bl;
    }

    public void N(long l) {
        this.E = l;
    }

    public void N(class07282 class072822) {
        this.M = this.M.N(class072822);
    }

    public void N(class07826 class078262) {
        this.l = class078262;
    }

    public static <T> class06207 N(Dynamic<T> dynamic2, class07312 class073122, class06228 class062282, class05934 class059342, Lifecycle lifecycle) {
        long l = dynamic2.get("Time").asLong(0L);
        return new class06207(dynamic2.get(y).flatMap(arg_0 -> ((Codec)class07001.N).parse(arg_0)).result().orElse(null), dynamic2.get("WasModded").asBoolean(false), dynamic2.get("spawn").read((Decoder)class05042.L).result().orElse(class05042.N), l, dynamic2.get("DayTime").asLong(l), class05976.N(dynamic2).N(), dynamic2.get("clearWeatherTime").asInt(0), dynamic2.get("rainTime").asInt(0), dynamic2.get("raining").asBoolean(false), dynamic2.get("thunderTime").asInt(0), dynamic2.get("thundering").asBoolean(false), dynamic2.get("initialized").asBoolean(true), dynamic2.get("DifficultyLocked").asBoolean(false), class08074.y.parse(dynamic2.get("world_border").orElseEmptyMap()).result(), dynamic2.get("WanderingTraderSpawnDelay").asInt(0), dynamic2.get("WanderingTraderSpawnChance").asInt(0), dynamic2.get("WanderingTraderId").read((Decoder)class01487.N).result().orElse(null), dynamic2.get("ServerBrands").asStream().flatMap(dynamic -> dynamic.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)), dynamic2.get("removed_features").asStream().flatMap(dynamic -> dynamic.asString().result().stream()).collect(Collectors.toSet()), (class00754<class02796>)new class00754(class07229.N, dynamic2.get("ScheduledEvents").asStream()), (class07001)dynamic2.get("CustomBossEvents").orElseEmptyMap().getValue(), dynamic2.get("DragonFight").read((Decoder)class07826.B).resultOrPartial(arg_0 -> ((Logger)R).error(arg_0)).orElse(class07826.Z), class073122, class059342, class062282, lifecycle);
    }

    public void N(class03776 class037762) {
        this.M = this.M.N(class037762);
    }

    private static class07741 N(Set<String> set) {
        class07741 class077412 = new class07741();
        set.stream().map(class07707::N).forEach(arg_0 -> class077412.add(arg_0));
        return class077412;
    }

    public class07001 N(class01042 class010422, @Nullable class07001 class070012) {
        if (class070012 == null) {
            class070012 = this.m;
        }
        class07001 class070013 = new class07001();
        this.N(class010422, class070013, class070012);
        return class070013;
    }

    public void N(class07074 class070742, class05474 class054742) {
        super.N(class070742, class054742);
        super.N(class070742);
    }

    public boolean W() {
        return this.n;
    }

    public boolean R() {
        return this.j;
    }

    public @Nullable class07001 O() {
        return this.d;
    }

    public int G() {
        return this.P;
    }

    public class07826 Y() {
        return this.l;
    }
}

