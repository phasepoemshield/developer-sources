/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UndashedUuid
 *  minecraft.class00050
 *  minecraft.class00053
 *  minecraft.class00064
 *  minecraft.class00065
 *  minecraft.class00070
 *  minecraft.class00080
 *  minecraft.class00081
 *  minecraft.class00082
 *  minecraft.class00093
 *  minecraft.class03576
 *  minecraft.class04609
 *  minecraft.class04942
 *  minecraft.class04944
 *  minecraft.class04945
 *  minecraft.class04947
 *  minecraft.class04950
 *  minecraft.class04951
 *  minecraft.class04956
 *  minecraft.class04957
 *  minecraft.class04964
 *  minecraft.class04966
 *  minecraft.class04967
 *  minecraft.class04968
 *  minecraft.class04969
 *  minecraft.class04971
 *  minecraft.class04976
 *  minecraft.class04979
 *  minecraft.class04980
 *  minecraft.class04981
 *  minecraft.class04987
 *  minecraft.class05434
 *  minecraft.class05685
 *  minecraft.class06202
 *  minecraft.class06727
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import minecraft.class00050;
import minecraft.class00053;
import minecraft.class00064;
import minecraft.class00065;
import minecraft.class00070;
import minecraft.class00080;
import minecraft.class00081;
import minecraft.class00082;
import minecraft.class00093;
import minecraft.class03576;
import minecraft.class04609;
import minecraft.class04942;
import minecraft.class04944;
import minecraft.class04945;
import minecraft.class04947;
import minecraft.class04950;
import minecraft.class04951;
import minecraft.class04956;
import minecraft.class04957;
import minecraft.class04964;
import minecraft.class04966;
import minecraft.class04967;
import minecraft.class04968;
import minecraft.class04969;
import minecraft.class04971;
import minecraft.class04976;
import minecraft.class04979;
import minecraft.class04980;
import minecraft.class04981;
import minecraft.class04987;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05104;
import minecraft.class05108;
import minecraft.class05116;
import minecraft.class05121;
import minecraft.class05124;
import minecraft.class05127;
import minecraft.class05133;
import minecraft.class05134;
import minecraft.class05434;
import minecraft.class05685;
import minecraft.class06202;
import minecraft.class06727;
import minecraft.class07529;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05111 {
    public static final class05104 N = Optional.ofNullable(System.getenv("realms.environment")).or(() -> Optional.ofNullable(System.getProperty("realms.environment"))).flatMap(class05104::N).orElse(class05104.field_19586);
    private static final Logger y = LogUtils.getLogger();
    private static volatile @Nullable class05111 L = null;
    private final CompletableFuture<Set<String>> u;
    private final String i;
    private final String R;
    private final class06202 M;
    private static final String B = "worlds";
    private static final String Z = "invites";
    private static final String z = "mco";
    private static final String U = "subscriptions";
    private static final String E = "activities";
    private static final String W = "ops";
    private static final String m = "regions/ping/stat";
    private static final String P = "regions/preferredRegions";
    private static final String s = "trial";
    private static final String T = "notifications";
    private static final String b = "feature/v1";
    private static final String j = "/listUserWorldsOfType/any";
    private static final String v = "/$PARENT_WORLD_ID/createPrereleaseRealm";
    private static final String n = "/listPrereleaseEligibleWorlds";
    private static final String t = "/$WORLD_ID/initialize";
    private static final String G = "/liveplayerlist";
    private static final String l = "/$WORLD_ID";
    private static final String d = "/$WORLD_ID/$PROFILE_UUID";
    private static final String w = "/minigames/$MINIGAME_ID/$WORLD_ID";
    private static final String k = "/available";
    private static final String Y = "/templates/$WORLD_TYPE";
    private static final String Q = "/v1/$ID/join/pc";
    private static final String O = "/$ID";
    private static final String g = "/$WORLD_ID";
    private static final String I = "/$WORLD_ID/invite/$UUID";
    private static final String J = "/pending";
    private static final String o = "/accept/$INVITATION_ID";
    private static final String q = "/reject/$INVITATION_ID";
    private static final String K = "/$WORLD_ID";
    private static final String V = "/$WORLD_ID/configuration";
    private static final String e = "/$WORLD_ID/slot/$SLOT_ID";
    private static final String H = "/$WORLD_ID/open";
    private static final String c = "/$WORLD_ID/close";
    private static final String X = "/$WORLD_ID/reset";
    private static final String a = "/$WORLD_ID";
    private static final String p = "/$WORLD_ID/backups";
    private static final String F = "/$WORLD_ID/slot/$SLOT_ID/download";
    private static final String A = "/$WORLD_ID/backups/upload";
    private static final String f = "/client/compatible";
    private static final String C = "/tos/agreed";
    private static final String S = "/v1/news";
    private static final String x = "/seen";
    private static final String D = "/dismiss";
    private static final class04968 h = new class04968();

    private String L(String string) throws class05097 {
        return this.N(string, null);
    }

    public class04967 L() throws class05097 {
        Object object = this.L(B);
        if (class05685.N()) {
            object = (String)object + j;
        }
        String string = this.N(class05134.N((String)object));
        return class04967.N((class04968)h, (String)string);
    }

    public void L(long l) throws class05097 {
        String string = this.L(Z + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)));
        this.N(class05134.y(string));
    }

    private static JsonArray L(List<UUID> list) {
        JsonArray jsonArray = new JsonArray();
        for (UUID uUID : list) {
            if (uUID == null) continue;
            jsonArray.add(uUID.toString());
        }
        return jsonArray;
    }

    public class04964 L(long l, UUID uUID) throws class05097 {
        String string = d.replace("$WORLD_ID", String.valueOf(l)).replace("$PROFILE_UUID", UndashedUuid.toString((UUID)uUID));
        String string2 = this.L(W + string);
        return class04964.N((String)this.N(class05134.y(string2)));
    }

    public Boolean L(long l, String string) throws class05097 {
        String string2 = w.replace("$MINIGAME_ID", string).replace("$WORLD_ID", String.valueOf(l));
        String string3 = this.L(B + string2);
        return Boolean.valueOf(this.N(class05134.L(string3, "")));
    }

    public class04966 M() throws class05097 {
        String string = this.L("activities/liveplayerlist");
        return class04966.N((String)this.N(class05134.N(string)));
    }

    public class04944 M(long l) throws class05097 {
        String string = this.L(U + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)));
        return class04944.N((String)this.N(class05134.N(string)));
    }

    private Set<String> P() {
        return Set.of();
    }

    private class05111(String string, String string2, class06202 class062022) {
        this.i = string;
        this.R = string2;
        this.M = class062022;
        class05133.N(class062022.NJ());
        this.u = CompletableFuture.supplyAsync(this::P, (Executor)class07536.z());
    }

    public @Nullable class04987 B(long l) throws class05097 {
        String string;
        String string2 = this.L(B + A.replace("$WORLD_ID", String.valueOf(l)));
        class04987 class049872 = class04987.N((String)this.N(class05134.L(string2, class04987.y((String)(string = class04609.N((long)l))))));
        if (class049872 != null) {
            class04609.N((long)l, (String)class049872.y());
        }
        return class049872;
    }

    public boolean B() throws class05097 {
        String string = this.L("mco/available");
        return Boolean.parseBoolean(this.N(class05134.N(string)));
    }

    public class05127 Z() throws class05097 {
        class05127 class051272;
        String string = this.L("mco/client/compatible");
        String string2 = this.N(class05134.N(string));
        try {
            class051272 = class05127.valueOf(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new class05097(class05124.N(string2));
        }
        return class051272;
    }

    public void Z(long l) throws class05097 {
        String string = this.L(B + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)));
        this.N(class05134.y(string));
    }

    public Boolean i(long l) throws class05097 {
        String string = this.L(B + H.replace("$WORLD_ID", String.valueOf(l)));
        return Boolean.valueOf(this.N(class05134.L(string, "")));
    }

    public List<class03576> i() throws class05097 {
        String string = this.L(T);
        return class03576.N((String)this.N(class05134.N(string)));
    }

    public Boolean m() throws class05097 {
        String string = this.L(s);
        return Boolean.valueOf(this.N(class05134.N(string)));
    }

    public class04956 U() throws class05097 {
        String string = this.L("invites/pending");
        class04956 class049562 = class04956.N((String)this.N(class05134.N(string)));
        class049562.N().removeIf(this::N);
        return class049562;
    }

    public int z() throws class05097 {
        return this.U().N().size();
    }

    public class04976 u(long l) throws class05097 {
        String string = this.L(B + p.replace("$WORLD_ID", String.valueOf(l)));
        return class04976.N((String)this.N(class05134.N(string)));
    }

    public Boolean u(long l, String string) throws class05097 {
        class04947 class049472 = new class04947(null, Long.valueOf(string).longValue(), -1, false, Set.of());
        String string2 = this.L(B + X.replace("$WORLD_ID", String.valueOf(l)));
        return Boolean.valueOf(this.N(class05134.N(string2, h.N((class04942)class049472), 30000, 80000)));
    }

    public List<class04981> u() throws class05097 {
        String string = this.L("worlds/listPrereleaseEligibleWorlds");
        String string2 = this.N(class05134.N(string));
        return class04967.N((class04968)h, (String)string2).N();
    }

    public class04964 y(long l, UUID uUID) throws class05097 {
        String string = d.replace("$WORLD_ID", String.valueOf(l)).replace("$PROFILE_UUID", UndashedUuid.toString((UUID)uUID));
        String string2 = this.L(W + string);
        return class04964.N((String)this.N(class05134.y(string2, "")));
    }

    public class04945 y(long l, int n) throws class05097 {
        String string = this.L(B + F.replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(n)));
        return class04945.N((String)this.N(class05134.N(string)));
    }

    public void y(String string) throws class05097 {
        String string2 = this.L(Z + q.replace("$INVITATION_ID", string));
        this.N(class05134.L(string2, ""));
    }

    public Set<String> y() {
        return this.u.join();
    }

    public void y(List<UUID> list) throws class05097 {
        String string = this.L("notifications/dismiss");
        this.N(class05134.y(string, h.N((JsonElement)class05111.L(list))));
    }

    public void y(long l, String string) throws class05097 {
        String string2 = this.N(B + p.replace("$WORLD_ID", String.valueOf(l)), "backupId=" + string);
        this.N(class05134.y(string2, "", 40000, 600000));
    }

    public class00093 y(long l) throws class05097 {
        String string = this.L(B + Q.replace("$ID", "" + l));
        String string2 = this.N(class05134.N(string, 5000, 30000));
        return class00093.N((class04968)h, (String)string2);
    }

    public void E() throws class05097 {
        String string = this.L("mco/tos/agreed");
        this.N(class05134.y(string, ""));
    }

    public void N(List<UUID> list) throws class05097 {
        String string = this.L("notifications/seen");
        this.N(class05134.y(string, h.N((JsonElement)class05111.L(list))));
    }

    public void N(class04971 class049712) throws class05097 {
        String string = this.L(m);
        this.N(class05134.y(string, h.N((class04942)class049712)));
    }

    public class04981 N(long l) throws class05097 {
        String string = this.L(B + O.replace("$ID", String.valueOf(l)));
        String string2 = this.N(class05134.N(string));
        return class04981.N((class04968)h, (String)string2);
    }

    public static class05111 N() {
        return class05111.N(class06202.Nq());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class05111 N(class06202 class062022) {
        String string = class062022.Ny().L();
        String string2 = class062022.Ny().N();
        class05111 class051112 = L;
        if (class051112 != null) {
            return class051112;
        }
        Class<class05111> var4 = class05111.class;
        synchronized (class05111.class) {
            class05111 class051113 = L;
            if (class051113 != null) {
                // ** MonitorExit[var4] (shouldn't be in output)
                return class051113;
            }
            L = class051113 = new class05111(string2, string, class062022);
            // ** MonitorExit[var4] (shouldn't be in output)
            return class051113;
        }
    }

    private String N(class05134<?> class051342) throws class05097 {
        class051342.N("sid", this.i);
        class051342.N("user", this.R);
        class051342.N("version", class07529.y().comp_4025());
        class051342.N(class05685.N());
        try {
            int n = class051342.y();
            if (n == 503 || n == 277) {
                int n2 = class051342.N();
                throw new class05098(n2, n);
            }
            String string = class051342.L();
            if (n < 200 || n >= 300) {
                if (n == 401) {
                    String string2 = class051342.L("WWW-Authenticate");
                    y.info("Could not authorize you against Realms server: {}", (Object)string2);
                    throw new class05097(new class05116(string2));
                }
                String string3 = class051342.N.getContentType();
                if (string3 != null && string3.startsWith("text/html")) {
                    throw new class05097(class05124.y(n, string));
                }
                class05108 class051082 = class05108.N(n, string);
                throw new class05097(class051082);
            }
            return string;
        }
        catch (class05121 class051212) {
            throw new class05097(class05124.N(class051212));
        }
    }

    private static String N(String string, @Nullable String string2, boolean bl) {
        try {
            return new URI(class05111.N.field_19590, bl ? class05111.N.field_57919 : class05111.N.field_19589, "/" + string, string2, null).toASCIIString();
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException(string, uRISyntaxException);
        }
    }

    private String N(String string, @Nullable String string2) {
        return class05111.N(string, string2, this.y().contains("realms_in_aks"));
    }

    public class04981 N(Long l) throws class05097 {
        String string = String.valueOf(l);
        String string2 = this.L(B + v.replace("$PARENT_WORLD_ID", string));
        return class04981.N((class04968)h, (String)this.N(class05134.y(string2, string)));
    }

    public void N(long l, UUID uUID) throws class05097 {
        String string = this.L(Z + I.replace("$WORLD_ID", String.valueOf(l)).replace("$UUID", UndashedUuid.toString((UUID)uUID)));
        this.N(class05134.y(string));
    }

    public class05434 N(int n, int n2, class04969 class049692) throws class05097 {
        String string = this.N(B + Y.replace("$WORLD_TYPE", class049692.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", n, n2));
        return class05434.N((String)this.N(class05134.N(string)));
    }

    public void N(long l, String string, String string2, @Nullable class00081 class000812, int n, class04980 class049802, List<class00064> list) throws class05097 {
        class00081 class000813 = class000812 != null ? class000812 : new class00081(class00050.field_60229, null);
        class04951 class049512 = new class04951(string, string2);
        class00070 class000702 = new class00070(n, class049802, class00064.N(list));
        class00080 class000802 = new class00080(class000702, list, class000813, class049512);
        String string3 = this.L(B + V.replace("$WORLD_ID", String.valueOf(l)));
        this.N(class05134.y(string3, h.N((class04942)class000802)));
    }

    public void N(long l, int n, class04980 class049802, List<class00064> list) throws class05097 {
        String string = this.L(B + e.replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(n)));
        String string2 = h.N((class04942)new class00070(n, class049802, class00064.N(list)));
        this.N(class05134.y(string, string2));
    }

    public boolean N(long l, int n) throws class05097 {
        String string = this.L(B + e.replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(n)));
        return Boolean.valueOf(this.N(class05134.L(string, "")));
    }

    public void N(String string) throws class05097 {
        String string2 = this.L(Z + o.replace("$INVITATION_ID", string));
        this.N(class05134.L(string2, ""));
    }

    public List<class04950> N(long l, String string) throws class05097 {
        class06727 class067272 = new class06727();
        class067272.N = string;
        String string2 = this.L(Z + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)));
        String string3 = this.N(class05134.y(string2, h.N((class04942)class067272)));
        return class04981.N((class04968)class05111.h, (String)string3).Z;
    }

    private boolean N(class04957 class049572) {
        return this.M.yv().i(class049572.u());
    }

    public void N(long l, String string, String string2) throws class05097 {
        class04951 class049512 = new class04951(string, string2);
        String string3 = this.L(B + t.replace("$WORLD_ID", String.valueOf(l)));
        String string4 = h.N((class04942)class049512);
        this.N(class05134.N(string3, string4, 5000, 10000));
    }

    public class04979 W() throws class05097 {
        String string = this.L("mco/v1/news");
        return class04979.N((String)this.N(class05134.N(string, 5000, 10000)));
    }

    public Boolean R(long l) throws class05097 {
        String string = this.L(B + c.replace("$WORLD_ID", String.valueOf(l)));
        return Boolean.valueOf(this.N(class05134.L(string, "")));
    }

    public class00053 R() throws class05097 {
        String string = this.L(P);
        String string2 = this.N(class05134.N(string));
        try {
            class00053 class000532 = (class00053)h.N(string2, class00053.class);
            if (class000532 == null) {
                return class00053.N();
            }
            Set set = class000532.y().stream().map(class00065::N).collect(Collectors.toSet());
            for (class00082 class000822 : class00082.values()) {
                if (class000822 == class00082.field_60199 || set.contains(class000822)) continue;
                y.debug("No realms region matching {} in server response", (Object)class000822);
            }
            return class000532;
        }
        catch (Exception exception) {
            y.error("Could not parse PreferredRegionSelections", (Throwable)exception);
            return class00053.N();
        }
    }
}

