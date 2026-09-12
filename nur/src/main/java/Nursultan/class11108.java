package Nursultan;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.ConnectException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
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
   public static Object N_2 = Duration.ofSeconds(20L);
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
   public static Object u_2 = HttpClient.newBuilder().connectTimeout((Duration)N_2).version(Version.HTTP_2).followRedirects(Redirect.NEVER).build();
   public static Object i_0 = LogManager.getLogger(String.class);
   public static Object i_1;
   public static Object i_2;

   private static JsonObject w(String var0) {
      return JsonParser.parseString(var0).getAsJsonObject();
   }

   private static HttpResponse<String> L(String var0, String var1) {
      return N(var0, var1, T[4]);
   }

   private class11108() {
      throw new UnsupportedOperationException(U[5]);
   }

   static {
      i();
      R();
   }

   private static void i() {
      W = new String[2];
      W[0] = "https://login.live.com/oauth20_token.srf";
      W[1] = "account.modal.microsoft.error.generic";
      M = new String[5];
      M[0] = "https://login.live.com/oauth20_token.srf";
      M[1] = "account.modal.microsoft.error.generic";
      M[2] = "id";
      M[3] = "name";
      M[4] = "AuthMethod";
      n = new String[8];
      n[0] = "RPS";
      n[1] = "SiteName";
      n[2] = "user.auth.xboxlive.com";
      n[3] = "RpsTicket";
      n[4] = "Properties";
      n[5] = "RelyingParty";
      n[6] = "http://auth.xboxlive.com";
      n[7] = "TokenType";
      v = new String[3];
      v[0] = "JWT";
      v[1] = "https://user.auth.xboxlive.com/user/authenticate";
      v[2] = "account.modal.microsoft.error.generic";
      l = new String[7];
      l[0] = "UserTokens";
      l[1] = "SandboxId";
      l[2] = "RETAIL";
      l[3] = "Properties";
      l[4] = "RelyingParty";
      l[5] = "rp://api.minecraftservices.com/";
      l[6] = "TokenType";
      Y = new String[7];
      Y[0] = "JWT";
      Y[1] = "https://xsts.auth.xboxlive.com/xsts/authorize";
      Y[2] = "XErr";
      Y[3] = "XErr";
      Y[4] = "account.modal.microsoft.error.no-xbox";
      Y[5] = "No Xbox profile linked.";
      Y[6] = "account.modal.microsoft.error.xbox-region";
      b = new String[4];
      b[0] = "Xbox Live not available in region.";
      b[1] = "account.modal.microsoft.error.xbox-adult";
      b[2] = "Adult verification required.";
      b[3] = "account.modal.microsoft.error.generic";
      d = new String[7];
      d[0] = "account.modal.microsoft.error.generic";
      d[1] = "identityToken";
      d[2] = "https://api.minecraftservices.com/authentication/login_with_xbox";
      d[3] = "account.modal.microsoft.error.generic";
      d[4] = "access_token";
      d[5] = "https://api.minecraftservices.com/minecraft/profile";
      d[6] = "User-Agent";
      w = new String[2];
      w[0] = "Nursultan/1.0 (Minecraft client)";
      w[1] = "Authorization";
      B = new String[7];
      B[0] = "account.modal.microsoft.error.no-minecraft";
      B[1] = "Account does not own Minecraft.";
      B[2] = "account.modal.microsoft.error.generic";
      B[3] = "access_token";
      B[4] = "refresh_token";
      B[5] = "Token";
      B[6] = "DisplayClaims";
      T = new String[6];
      T[0] = "xui";
      T[1] = "uhs";
      T[2] = "xid";
      T[3] = "xid";
      T[4] = "application/x-www-form-urlencoded";
      T[5] = "application/json";
      Q = new String[6];
      Q[0] = "User-Agent";
      Q[1] = "Nursultan/1.0 (Minecraft client)";
      Q[2] = "Accept";
      Q[3] = "application/json";
      Q[4] = "Content-Type";
      Q[5] = "account.modal.microsoft.error.connect";
      U = new String[7];
      U[0] = "Unable to reach Microsoft servers.";
      U[1] = "account.modal.microsoft.error.generic";
      U[2] = "Microsoft request failed.";
      U[3] = "account.modal.microsoft.error.generic";
      U[4] = "-";
      U[5] = "This is a utility class and cannot be instantiated";
      U[6] = "54fd49e4-2103-4044-9603-2b028c814ec3";
      z = new String[3];
      z[0] = "XboxLive.signin%20XboxLive.offline_access";
      z[1] = "account.modal.microsoft.error.connect";
      z[2] = "account.modal.microsoft.error.generic";
      P = new String[4];
      P[0] = "account.modal.microsoft.error.no-minecraft";
      P[1] = "account.modal.microsoft.error.no-xbox";
      P[2] = "account.modal.microsoft.error.xbox-region";
      P[3] = "account.modal.microsoft.error.xbox-adult";
      j = new String[6];
      j[0] = "Nursultan/1.0 (Minecraft client)";
      j[1] = "https://login.live.com/oauth20_token.srf";
      j[2] = "https://user.auth.xboxlive.com/user/authenticate";
      j[3] = "https://xsts.auth.xboxlive.com/xsts/authorize";
      j[4] = "https://api.minecraftservices.com/authentication/login_with_xbox";
      j[5] = "https://api.minecraftservices.com/minecraft/profile";
   }

   private static JsonObject s(String var0) {
      HttpResponse<String> var1;
      try {
         var1 = ((HttpClient)u_2)
            .send(
               HttpRequest.newBuilder(URI.create(d[5])).header(d[6], w[0]).header(w[1], "Bearer " + var0).timeout((Duration)N_2).GET().build(),
               BodyHandlers.ofString()
            );
      } catch (Throwable var2) {
         throw N(var2);
      }

      if (var1.statusCode() == 404) {
         throw new class11001(B[0], B[1]);
      } else if (var1.statusCode() != 200) {
         throw new class11001(B[2], "Profile request failed: " + var1.statusCode());
      } else {
         return w(var1.body());
      }
   }

   private static class11670 l(String var0) {
      JsonArray var1 = new JsonArray();
      var1.add(var0);
      JsonObject var2 = new JsonObject();
      var2.add(l[0], var1);
      var2.addProperty(l[1], l[2]);
      JsonObject var3 = new JsonObject();
      var3.add(l[3], var2);
      var3.addProperty(l[4], l[5]);
      var3.addProperty(l[6], Y[0]);
      HttpResponse<String> var4 = y(Y[1], var3.toString());
      if (var4.statusCode() == 401) {
         JsonObject var5 = w(var4.body());
         long var6 = var5.has(Y[2]) ? var5.get(Y[3]).getAsLong() : 0L;
         if (var6 == 2148916233L) {
            throw new class11001(Y[4], Y[5]);
         } else if (var6 == 2148916235L) {
            throw new class11001(Y[6], b[0]);
         } else if (var6 != 2148916236L && var6 != 2148916237L && var6 != 2148916238L) {
            throw new class11001(b[3], "XSTS denied: " + var6);
         } else {
            throw new class11001(b[1], b[2]);
         }
      } else if (var4.statusCode() != 200) {
         throw new class11001(d[0], "XSTS request failed: " + var4.statusCode());
      } else {
         return y(w(var4.body()));
      }
   }

   private static String u(String var0, String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty(d[1], "XBL3.0 x=" + var1 + ";" + var0);
      HttpResponse<String> var3 = y(d[2], var2.toString());
      if (var3.statusCode() != 200) {
         throw new class11001(d[3], "MCA request failed: " + var3.statusCode());
      } else {
         return N(w(var3.body()), d[4]);
      }
   }

   private static UUID u(String var0) {
      return var0.contains(U[4])
         ? UUID.fromString(var0)
         : UUID.fromString(
            var0.substring(0, 8) + "-" + var0.substring(8, 12) + "-" + var0.substring(12, 16) + "-" + var0.substring(16, 20) + "-" + var0.substring(20, 32)
         );
   }

   private static HttpResponse<String> y(String var0, String var1) {
      return N(var0, var1, T[5]);
   }

   private static class11670 y(JsonObject var0) {
      String var1 = N(var0, B[5]);
      JsonObject var3 = var0.getAsJsonObject(B[6]).getAsJsonArray(T[0]).get(0).getAsJsonObject();
      String var4 = var3.get(T[1]).getAsString();
      String var5 = var3.has(T[2]) ? var3.get(T[3]).getAsString() : null;
      return new class11670(var1, var4, var5);
   }

   public static class10885 N(String var0, String var1) {
      String var2 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&code="
         + URLEncoder.encode(var0, StandardCharsets.UTF_8)
         + "&grant_type=authorization_code&redirect_uri="
         + URLEncoder.encode(var1, StandardCharsets.UTF_8)
         + "&scope=XboxLive.signin%20XboxLive.offline_access";
      HttpResponse<String> var3 = L(W[0], var2);
      if (var3.statusCode() != 200) {
         throw new class11001(W[1], "Code exchange failed: " + var3.statusCode());
      } else {
         return N(w(var3.body()));
      }
   }

   private static HttpResponse<String> N(String var0, String var1, String var2) {
      try {
         return ((HttpClient)u_2)
            .send(
               HttpRequest.newBuilder(URI.create(var0))
                  .header(Q[0], Q[1])
                  .header(Q[2], Q[3])
                  .header(Q[4], var2)
                  .timeout((Duration)N_2)
                  .POST(BodyPublishers.ofString(var1))
                  .build(),
               BodyHandlers.ofString()
            );
      } catch (Throwable var3) {
         throw N(var3);
      }
   }

   public static class11540 N(class10885 var0) {
      class11670 var2 = l(Y(var0.N()).y());
      String var3 = u(var2.y(), var2.N());
      JsonObject var4 = s(var3);
      UUID var5 = u(N(var4, M[2]));
      String var6 = N(var4, M[3]);
      return new class11540(var5, var6, var3, var0.y(), var2.L());
   }

   private static class10885 N(JsonObject var0) {
      return new class10885(N(var0, B[3]), N(var0, B[4]));
   }

   public static class10885 N(String var0) {
      String var1 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&refresh_token="
         + URLEncoder.encode(var0, StandardCharsets.UTF_8)
         + "&grant_type=refresh_token&scope=XboxLive.signin%20XboxLive.offline_access";
      HttpResponse<String> var2 = L(M[0], var1);
      if (var2.statusCode() != 200) {
         throw new class11001(M[1], "Refresh failed: " + var2.statusCode());
      } else {
         return N(w(var2.body()));
      }
   }

   private static String N(JsonObject var0, String var1) {
      if (var0.has(var1) && !var0.get(var1).isJsonNull()) {
         return var0.get(var1).getAsString();
      } else {
         throw new class11001(U[3], "Missing field: " + var1);
      }
   }

   private static class11001 N(Throwable var0) {
      return !(var0 instanceof UnresolvedAddressException) && !(var0 instanceof HttpTimeoutException) && !(var0 instanceof ConnectException)
         ? new class11001(U[1], U[2], var0)
         : new class11001(Q[5], U[0], var0);
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

   private static class11670 Y(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty(M[4], n[0]);
      var1.addProperty(n[1], n[2]);
      var1.addProperty(n[3], "d=" + var0);
      JsonObject var2 = new JsonObject();
      var2.add(n[4], var1);
      var2.addProperty(n[5], n[6]);
      var2.addProperty(n[7], v[0]);
      HttpResponse<String> var3 = y(v[1], var2.toString());
      if (var3.statusCode() != 200) {
         throw new class11001(v[2], "XBL request failed: " + var3.statusCode());
      } else {
         return y(w(var3.body()));
      }
   }
}
