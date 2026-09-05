/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import minecraft.class05095;
import minecraft.class05118;
import minecraft.class05121;
import minecraft.class05126;
import minecraft.class05133;
import minecraft.class05137;
import org.jspecify.annotations.Nullable;

public abstract class class05134<T extends class05134<T>> {
    public HttpURLConnection N;
    private boolean L;
    protected String y;
    private static final int u = 60000;
    private static final int i = 5000;
    private static final String R = "Is-Prerelease";
    private static final String M = "Cookie";

    public static class05134<?> L(String string, String string2) {
        return new class05137(string, string2, 5000, 60000);
    }

    public String L(String string) {
        return class05134.N(this.N, string);
    }

    public String L() {
        try {
            this.u();
            String string = this.y() >= 400 ? this.N(this.N.getErrorStream()) : this.N(this.N.getInputStream());
            this.R();
            return string;
        }
        catch (IOException iOException) {
            throw new class05121(iOException.getMessage(), iOException);
        }
    }

    public class05134(String string, int n, int n2) {
        try {
            this.y = string;
            Proxy proxy = class05133.N();
            this.N = proxy != null ? (HttpURLConnection)new URL(string).openConnection(proxy) : (HttpURLConnection)new URL(string).openConnection();
            this.N.setConnectTimeout(n);
            this.N.setReadTimeout(n2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new class05121(malformedURLException.getMessage(), malformedURLException);
        }
        catch (IOException iOException) {
            throw new class05121(iOException.getMessage(), iOException);
        }
    }

    protected abstract T i();

    protected T u() {
        if (this.L) {
            return (T)this;
        }
        T t = this.i();
        this.L = true;
        return t;
    }

    public static class05134<?> y(String string) {
        return new class05095(string, 5000, 60000);
    }

    public static class05134<?> y(String string, String string2) {
        return new class05118(string, string2, 5000, 60000);
    }

    public static class05134<?> y(String string, String string2, int n, int n2) {
        return new class05137(string, string2, n, n2);
    }

    public int y() {
        try {
            this.u();
            return this.N.getResponseCode();
        }
        catch (Exception exception) {
            throw new class05121(exception.getMessage(), exception);
        }
    }

    public static void N(HttpURLConnection httpURLConnection, String string, String string2) {
        String string3 = httpURLConnection.getRequestProperty(M);
        if (string3 == null) {
            httpURLConnection.setRequestProperty(M, string + "=" + string2);
        } else {
            httpURLConnection.setRequestProperty(M, string3 + ";" + string + "=" + string2);
        }
    }

    public static class05134<?> N(String string, String string2, int n, int n2) {
        return new class05118(string, string2, n, n2);
    }

    public void N(String string, String string2) {
        class05134.N(this.N, string, string2);
    }

    public static String N(HttpURLConnection httpURLConnection, String string) {
        try {
            return httpURLConnection.getHeaderField(string);
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static int N(HttpURLConnection httpURLConnection) {
        String string = httpURLConnection.getHeaderField("Retry-After");
        try {
            return Integer.valueOf(string);
        }
        catch (Exception exception) {
            return 5;
        }
    }

    private String N(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int n = inputStreamReader.read();
        while (n != -1) {
            stringBuilder.append((char)n);
            n = inputStreamReader.read();
        }
        return stringBuilder.toString();
    }

    public int N() {
        return class05134.N(this.N);
    }

    public static class05134<?> N(String string, int n, int n2) {
        return new class05126(string, n, n2);
    }

    public static class05134<?> N(String string) {
        return new class05126(string, 5000, 60000);
    }

    public void N(boolean bl) {
        this.N.addRequestProperty(R, String.valueOf(bl));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void R() {
        byte[] byArray = new byte[1024];
        try {
            InputStream inputStream = this.N.getInputStream();
            while (inputStream.read(byArray) > 0) {
            }
            inputStream.close();
        }
        catch (Exception exception) {
            InputStream inputStream;
            block13: {
                inputStream = this.N.getErrorStream();
                if (inputStream != null) break block13;
                return;
            }
            try {
                while (inputStream.read(byArray) > 0) {
                }
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        finally {
            if (this.N != null) {
                this.N.disconnect();
            }
        }
    }
}

