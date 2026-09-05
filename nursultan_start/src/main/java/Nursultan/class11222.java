/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11001
 */
package Nursultan;

import Nursultan.class11001;
import com.sun.net.httpserver.HttpServer;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class11222
implements Closeable {
    private static String[] L;
    private static String[] u;
    private static String[] R;
    private static String[] B;
    private static String[] j;
    private static String[] d;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;

    public CompletableFuture<String> L() {
        return (CompletableFuture)this.N_2;
    }

    public class11222() {
        this.E();
        this.N_2 = new CompletableFuture();
        try {
            this.N_0 = HttpServer.create();
            SecureRandom secureRandom = SecureRandom.getInstanceStrong();
            int n = secureRandom.nextInt(96, 128);
            StringBuilder stringBuilder = new StringBuilder(n);
            for (int i = 0; i < n; ++i) {
                stringBuilder.append(L[0].charAt(secureRandom.nextInt(L[1].length())));
            }
            this.N_1 = stringBuilder.toString();
        }
        catch (Throwable throwable) {
            throw new class11001(L[2], L[3], throwable);
        }
    }

    static {
        class11222.i();
        class11222.B();
        int[] nArray = new int[]{59125, 59126, 59127, 59128, 59129, 59130, 59131, 59132, 59133, 59134, 59135, 1234, 1235, 1236, 1237, 80, 8080, 19364, 19365, 19366, 27930, 27931, 27932, 27933, 27934, 42069};
        y_0 = nArray;
        y_4 = Pattern.compile(u[3]);
    }

    private static void B() {
        y_1 = u[4];
        y_2 = u[5];
        y_3 = u[6];
        y_5 = u[7];
    }

    private static void i() {
        L = new String[4];
        class11222.L[0] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
        class11222.L[1] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
        class11222.L[2] = "account.modal.microsoft.error.generic";
        class11222.L[3] = "Unable to create auth server.";
        B = new String[7];
        class11222.B[0] = "/";
        class11222.B[1] = "account.modal.microsoft.error.generic";
        class11222.B[2] = "Empty redirect query.";
        class11222.B[3] = "access_denied";
        class11222.B[4] = "account.modal.microsoft.error.cancelled";
        class11222.B[5] = "User cancelled.";
        class11222.B[6] = "account.modal.microsoft.error.generic";
        R = new String[2];
        class11222.R[0] = "Malformed redirect.";
        class11222.R[1] = "account.modal.microsoft.error.generic";
        d = new String[2];
        class11222.d[0] = "State mismatch.";
        class11222.d[1] = "localhost";
        j = new String[2];
        class11222.j[0] = "account.modal.microsoft.error.generic";
        class11222.j[1] = "Unable to bind any port.";
        u = new String[8];
        class11222.u[0] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Nursultan</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
        class11222.u[1] = "Content-Type";
        class11222.u[2] = "text/html; charset=UTF-8";
        class11222.u[3] = "code=([^&]*)&state=([^&]*)";
        class11222.u[4] = "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
        class11222.u[5] = "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account";
        class11222.u[6] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
        class11222.u[7] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Nursultan</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
    }

    @Override
    public void close() {
        ((HttpServer)this.N_0).stop(0);
    }

    private void z() {
        Throwable throwable = null;
        for (int n : (int[])y_0) {
            try {
                ((HttpServer)this.N_0).bind(new InetSocketAddress(d[1], n), 0);
                this.N_3 = n;
                return;
            }
            catch (IOException iOException) {
            }
        }
        throw new class11001(j[0], j[1], throwable);
    }

    public void u() {
        this.z();
        ((HttpServer)this.N_0).createContext(B[0], httpExchange -> {
            try {
                if (((Boolean)this.N_4).booleanValue() || !httpExchange.getRemoteAddress().getAddress().isLoopbackAddress()) {
                    httpExchange.close();
                    return;
                }
                this.N_4 = true;
                String string = httpExchange.getRequestURI().getQuery();
                byte[] byArray = u[0].getBytes(StandardCharsets.UTF_8);
                httpExchange.getResponseHeaders().add(u[1], u[2]);
                httpExchange.sendResponseHeaders(200, byArray.length);
                try (OutputStream outputStream = httpExchange.getResponseBody();){
                    outputStream.write(byArray);
                }
                httpExchange.close();
                this.R(string);
            }
            catch (Throwable throwable) {
                httpExchange.close();
                ((CompletableFuture)this.N_2).completeExceptionally(throwable);
            }
        });
        ((HttpServer)this.N_0).start();
    }

    public String y() {
        return "http://localhost:" + (Integer)this.N_3 + "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
    }

    private void E() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = 0;
            this.N_4 = false;
        }
    }

    public String N() {
        return "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account&redirect_uri=" + String.valueOf(URI.create(this.y())) + "&state=" + (String)this.N_1;
    }

    private void R(String string) {
        if (string == null) {
            ((CompletableFuture)this.N_2).completeExceptionally((Throwable)new class11001(B[1], B[2]));
            return;
        }
        if (string.toLowerCase(Locale.ROOT).contains(B[3])) {
            ((CompletableFuture)this.N_2).completeExceptionally((Throwable)new class11001(B[4], B[5]));
            return;
        }
        Matcher matcher = ((Pattern)y_4).matcher(string);
        if (!matcher.find()) {
            ((CompletableFuture)this.N_2).completeExceptionally((Throwable)new class11001(B[6], R[0]));
            return;
        }
        if (!((String)this.N_1).equals(matcher.group(2))) {
            ((CompletableFuture)this.N_2).completeExceptionally((Throwable)new class11001(R[1], d[0]));
            return;
        }
        ((CompletableFuture)this.N_2).complete(matcher.group(1));
    }
}

