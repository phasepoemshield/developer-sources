/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10885
 *  Nursultan.class11540
 *  Nursultan.class11670
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.logging.log4j.LogManager
 */
package Nursultan;

import Nursultan.class10885;
import Nursultan.class11001;
import Nursultan.class11540;
import Nursultan.class11670;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.ConnectException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.nio.channels.UnresolvedAddressException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;

public class class11108 {
    private static String[] M;
    private static String[] B;
    private static String[] z;
    private static String[] U;
    private static String[] W;
    private static String[] P;
    private static String[] T;
    private static String[] b;
    private static String[] j;
    private static String[] v;
    private static String[] n;
    private static String[] l;
    private static String[] d;
    private static String[] w;
    private static String[] Y;
    private static String[] Q;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object L_0;
    public static Object L_1;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;

    private static JsonObject w(String string) {
        return JsonParser.parseString((String)string).getAsJsonObject();
    }

    private static HttpResponse<String> L(String string, String string2) {
        return class11108.N(string, string2, T[4]);
    }

    private class11108() {
        throw new UnsupportedOperationException(U[5]);
    }

    static {
        class11108.i();
        class11108.R();
        i_0 = LogManager.getLogger(String.class);
        N_2 = Duration.ofSeconds(20L);
        u_2 = HttpClient.newBuilder().connectTimeout((Duration)N_2).version(HttpClient.Version.HTTP_2).followRedirects(HttpClient.Redirect.NEVER).build();
    }

    private static void i() {
        W = new String[2];
        class11108.W[0] = "https://login.live.com/oauth20_token.srf";
        class11108.W[1] = "account.modal.microsoft.error.generic";
        M = new String[5];
        class11108.M[0] = "https://login.live.com/oauth20_token.srf";
        class11108.M[1] = "account.modal.microsoft.error.generic";
        class11108.M[2] = "id";
        class11108.M[3] = "name";
        class11108.M[4] = "AuthMethod";
        n = new String[8];
        class11108.n[0] = "RPS";
        class11108.n[1] = "SiteName";
        class11108.n[2] = "user.auth.xboxlive.com";
        class11108.n[3] = "RpsTicket";
        class11108.n[4] = "Properties";
        class11108.n[5] = "RelyingParty";
        class11108.n[6] = "http://auth.xboxlive.com";
        class11108.n[7] = "TokenType";
        v = new String[3];
        class11108.v[0] = "JWT";
        class11108.v[1] = "https://user.auth.xboxlive.com/user/authenticate";
        class11108.v[2] = "account.modal.microsoft.error.generic";
        l = new String[7];
        class11108.l[0] = "UserTokens";
        class11108.l[1] = "SandboxId";
        class11108.l[2] = "RETAIL";
        class11108.l[3] = "Properties";
        class11108.l[4] = "RelyingParty";
        class11108.l[5] = "rp://api.minecraftservices.com/";
        class11108.l[6] = "TokenType";
        Y = new String[7];
        class11108.Y[0] = "JWT";
        class11108.Y[1] = "https://xsts.auth.xboxlive.com/xsts/authorize";
        class11108.Y[2] = "XErr";
        class11108.Y[3] = "XErr";
        class11108.Y[4] = "account.modal.microsoft.error.no-xbox";
        class11108.Y[5] = "No Xbox profile linked.";
        class11108.Y[6] = "account.modal.microsoft.error.xbox-region";
        b = new String[4];
        class11108.b[0] = "Xbox Live not available in region.";
        class11108.b[1] = "account.modal.microsoft.error.xbox-adult";
        class11108.b[2] = "Adult verification required.";
        class11108.b[3] = "account.modal.microsoft.error.generic";
        d = new String[7];
        class11108.d[0] = "account.modal.microsoft.error.generic";
        class11108.d[1] = "identityToken";
        class11108.d[2] = "https://api.minecraftservices.com/authentication/login_with_xbox";
        class11108.d[3] = "account.modal.microsoft.error.generic";
        class11108.d[4] = "access_token";
        class11108.d[5] = "https://api.minecraftservices.com/minecraft/profile";
        class11108.d[6] = "User-Agent";
        w = new String[2];
        class11108.w[0] = "Nursultan/1.0 (Minecraft client)";
        class11108.w[1] = "Authorization";
        B = new String[7];
        class11108.B[0] = "account.modal.microsoft.error.no-minecraft";
        class11108.B[1] = "Account does not own Minecraft.";
        class11108.B[2] = "account.modal.microsoft.error.generic";
        class11108.B[3] = "access_token";
        class11108.B[4] = "refresh_token";
        class11108.B[5] = "Token";
        class11108.B[6] = "DisplayClaims";
        T = new String[6];
        class11108.T[0] = "xui";
        class11108.T[1] = "uhs";
        class11108.T[2] = "xid";
        class11108.T[3] = "xid";
        class11108.T[4] = "application/x-www-form-urlencoded";
        class11108.T[5] = "application/json";
        Q = new String[6];
        class11108.Q[0] = "User-Agent";
        class11108.Q[1] = "Nursultan/1.0 (Minecraft client)";
        class11108.Q[2] = "Accept";
        class11108.Q[3] = "application/json";
        class11108.Q[4] = "Content-Type";
        class11108.Q[5] = "account.modal.microsoft.error.connect";
        U = new String[7];
        class11108.U[0] = "Unable to reach Microsoft servers.";
        class11108.U[1] = "account.modal.microsoft.error.generic";
        class11108.U[2] = "Microsoft request failed.";
        class11108.U[3] = "account.modal.microsoft.error.generic";
        class11108.U[4] = "-";
        class11108.U[5] = "This is a utility class and cannot be instantiated";
        class11108.U[6] = "54fd49e4-2103-4044-9603-2b028c814ec3";
        z = new String[3];
        class11108.z[0] = "XboxLive.signin%20XboxLive.offline_access";
        class11108.z[1] = "account.modal.microsoft.error.connect";
        class11108.z[2] = "account.modal.microsoft.error.generic";
        P = new String[4];
        class11108.P[0] = "account.modal.microsoft.error.no-minecraft";
        class11108.P[1] = "account.modal.microsoft.error.no-xbox";
        class11108.P[2] = "account.modal.microsoft.error.xbox-region";
        class11108.P[3] = "account.modal.microsoft.error.xbox-adult";
        j = new String[6];
        class11108.j[0] = "Nursultan/1.0 (Minecraft client)";
        class11108.j[1] = "https://login.live.com/oauth20_token.srf";
        class11108.j[2] = "https://user.auth.xboxlive.com/user/authenticate";
        class11108.j[3] = "https://xsts.auth.xboxlive.com/xsts/authorize";
        class11108.j[4] = "https://api.minecraftservices.com/authentication/login_with_xbox";
        class11108.j[5] = "https://api.minecraftservices.com/minecraft/profile";
    }

    private static JsonObject s(String string) {
        HttpResponse<String> var1;
        try {
            var1 = ((HttpClient)u_2).send(HttpRequest.newBuilder(URI.create(d[5])).header(d[6], w[0]).header(w[1], "Bearer " + string).timeout((Duration)N_2).GET().build(), HttpResponse.BodyHandlers.ofString());
        }
        catch (Throwable throwable) {
            throw class11108.N(throwable);
        }
        if (var1.statusCode() == 404) {
            throw new class11001(B[0], B[1]);
        }
        if (var1.statusCode() != 200) {
            throw new class11001(B[2], "Profile request failed: " + var1.statusCode());
        }
        return class11108.w(var1.body());
    }

    private static class11670 l(String string) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(string);
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(l[0], (JsonElement)jsonArray);
        jsonObject.addProperty(l[1], l[2]);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add(l[3], (JsonElement)jsonObject);
        jsonObject2.addProperty(l[4], l[5]);
        jsonObject2.addProperty(l[6], Y[0]);
        HttpResponse<String> var4 = class11108.y(Y[1], jsonObject2.toString());
        if (var4.statusCode() == 401) {
            long l;
            JsonObject jsonObject3 = class11108.w(var4.body());
            long l2 = l = jsonObject3.has(Y[2]) ? jsonObject3.get(Y[3]).getAsLong() : 0L;
            if (l == 2148916233L) {
                throw new class11001(Y[4], Y[5]);
            }
            if (l == 2148916235L) {
                throw new class11001(Y[6], b[0]);
            }
            if (l == 2148916236L || l == 2148916237L || l == 2148916238L) {
                throw new class11001(b[1], b[2]);
            }
            throw new class11001(b[3], "XSTS denied: " + l);
        }
        if (var4.statusCode() != 200) {
            throw new class11001(d[0], "XSTS request failed: " + var4.statusCode());
        }
        return class11108.y(class11108.w(var4.body()));
    }

    private static String u(String string, String string2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(d[1], "XBL3.0 x=" + string2 + ";" + string);
        HttpResponse<String> var3 = class11108.y(d[2], jsonObject.toString());
        if (var3.statusCode() != 200) {
            throw new class11001(d[3], "MCA request failed: " + var3.statusCode());
        }
        return class11108.N(class11108.w(var3.body()), d[4]);
    }

    private static UUID u(String string) {
        if (string.contains(U[4])) {
            return UUID.fromString(string);
        }
        return UUID.fromString(string.substring(0, 8) + "-" + string.substring(8, 12) + "-" + string.substring(12, 16) + "-" + string.substring(16, 20) + "-" + string.substring(20, 32));
    }

    private static HttpResponse<String> y(String string, String string2) {
        return class11108.N(string, string2, T[5]);
    }

    private static class11670 y(JsonObject jsonObject) {
        String string = class11108.N(jsonObject, B[5]);
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(B[6]).getAsJsonArray(T[0]).get(0).getAsJsonObject();
        String string2 = jsonObject2.get(T[1]).getAsString();
        String string3 = jsonObject2.has(T[2]) ? jsonObject2.get(T[3]).getAsString() : null;
        return new class11670(string, string2, string3);
    }

    public static class10885 N(String string, String string2) {
        String string3 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&code=" + URLEncoder.encode(string, StandardCharsets.UTF_8) + "&grant_type=authorization_code&redirect_uri=" + URLEncoder.encode(string2, StandardCharsets.UTF_8) + "&scope=XboxLive.signin%20XboxLive.offline_access";
        HttpResponse<String> var3 = class11108.L(W[0], string3);
        if (var3.statusCode() != 200) {
            throw new class11001(W[1], "Code exchange failed: " + var3.statusCode());
        }
        return class11108.N(class11108.w(var3.body()));
    }

    private static HttpResponse<String> N(String string, String string2, String string3) {
        try {
            return ((HttpClient)u_2).send(HttpRequest.newBuilder(URI.create(string)).header(Q[0], Q[1]).header(Q[2], Q[3]).header(Q[4], string3).timeout((Duration)N_2).POST(HttpRequest.BodyPublishers.ofString(string2)).build(), HttpResponse.BodyHandlers.ofString());
        }
        catch (Throwable throwable) {
            throw class11108.N(throwable);
        }
    }

    public static class11540 N(class10885 class108852) {
        class11670 class116702 = class11108.l(class11108.Y(class108852.N()).y());
        String string = class11108.u(class116702.y(), class116702.N());
        JsonObject jsonObject = class11108.s(string);
        UUID uUID = class11108.u(class11108.N(jsonObject, M[2]));
        String string2 = class11108.N(jsonObject, M[3]);
        return new class11540(uUID, string2, string, class108852.y(), class116702.L());
    }

    private static class10885 N(JsonObject jsonObject) {
        return new class10885(class11108.N(jsonObject, B[3]), class11108.N(jsonObject, B[4]));
    }

    public static class10885 N(String string) {
        String string2 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&refresh_token=" + URLEncoder.encode(string, StandardCharsets.UTF_8) + "&grant_type=refresh_token&scope=XboxLive.signin%20XboxLive.offline_access";
        HttpResponse<String> var2 = class11108.L(M[0], string2);
        if (var2.statusCode() != 200) {
            throw new class11001(M[1], "Refresh failed: " + var2.statusCode());
        }
        return class11108.N(class11108.w(var2.body()));
    }

    private static String N(JsonObject jsonObject, String string) {
        if (!jsonObject.has(string) || jsonObject.get(string).isJsonNull()) {
            throw new class11001(U[3], "Missing field: " + string);
        }
        return jsonObject.get(string).getAsString();
    }

    private static class11001 N(Throwable throwable) {
        if (throwable instanceof UnresolvedAddressException || throwable instanceof HttpTimeoutException || throwable instanceof ConnectException) {
            return new class11001(Q[5], U[0], throwable);
        }
        return new class11001(U[1], U[2], throwable);
    }

    private static void R() {
        i_1 = U[6];
        i_2 = z[0];
        L_0 = z[1];
        L_1 = z[2];
        y_0 = P[0];
        y_1 = P[1];
        y_2 = P[2];
        N_0 = P[3];
        N_1 = j[0];
        N_3 = j[1];
        N_4 = j[2];
        N_5 = j[3];
        u_0 = j[4];
        u_1 = j[5];
    }

    private static class11670 Y(String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(M[4], n[0]);
        jsonObject.addProperty(n[1], n[2]);
        jsonObject.addProperty(n[3], "d=" + string);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add(n[4], (JsonElement)jsonObject);
        jsonObject2.addProperty(n[5], n[6]);
        jsonObject2.addProperty(n[7], v[0]);
        HttpResponse<String> var3 = class11108.y(v[1], jsonObject2.toString());
        if (var3.statusCode() != 200) {
            throw new class11001(v[2], "XBL request failed: " + var3.statusCode());
        }
        return class11108.y(class11108.w(var3.body()));
    }
}

