/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06290
 *  minecraft.class06955
 *  minecraft.class06974
 *  minecraft.class07536
 *  minecraft.class08280
 *  minecraft.class08627
 *  minecraft.class08829
 *  minecraft.class08918
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06290;
import minecraft.class06955;
import minecraft.class06974;
import minecraft.class07536;
import minecraft.class08280;
import minecraft.class08627;
import minecraft.class08829;
import minecraft.class08918;
import org.slf4j.Logger;

public class class08377 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 64;
    private static final int L = 64;
    private static final int u = 32;
    private final Proxy i;
    private final class08627 R;
    private final Executor M;

    public class08377(Proxy proxy, class08627 class086272, Executor executor) {
        this.i = proxy;
        this.R = class086272;
        this.M = executor;
    }

    private static void y(class08280 class082802, int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                class082802.y(i, j, class02566.M((int)class082802.N(i, j)));
            }
        }
    }

    private static void N(class08280 class082802, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        for (n6 = n; n6 < n3; ++n6) {
            for (n5 = n2; n5 < n4; ++n5) {
                if (class02566.y((int)class082802.N(n6, n5)) >= 128) continue;
                return;
            }
        }
        for (n6 = n; n6 < n3; ++n6) {
            for (n5 = n2; n5 < n4; ++n5) {
                class082802.y(n6, n5, class082802.N(n6, n5) & 0xFFFFFF);
            }
        }
    }

    private CompletableFuture<class06955> N(class06955 class069552, class08280 class082802) {
        return CompletableFuture.supplyAsync(() -> {
            class08829 class088292 = new class08829(() -> ((class01894)class069552.y()).toString(), class082802);
            this.R.N(class069552.y(), (class08918)class088292);
            return class069552;
        }, this.M);
    }

    private static class08280 N(class08280 class082802, String string) {
        boolean bl;
        int n = class082802.y();
        int n2 = class082802.N();
        if (n2 != 64 || n != 32 && n != 64) {
            class082802.close();
            throw new IllegalStateException("Discarding incorrectly sized (" + n2 + "x" + n + ") skin texture from " + string);
        }
        boolean bl2 = bl = n == 32;
        if (bl) {
            class08280 class082803 = new class08280(64, 64, true);
            class082803.N(class082802);
            class082802.close();
            class082802 = class082803;
            class082802.N(0, 32, 64, 32, 0);
            class082802.N(4, 16, 16, 32, 4, 4, true, false);
            class082802.N(8, 16, 16, 32, 4, 4, true, false);
            class082802.N(0, 20, 24, 32, 4, 12, true, false);
            class082802.N(4, 20, 16, 32, 4, 12, true, false);
            class082802.N(8, 20, 8, 32, 4, 12, true, false);
            class082802.N(12, 20, 16, 32, 4, 12, true, false);
            class082802.N(44, 16, -8, 32, 4, 4, true, false);
            class082802.N(48, 16, -8, 32, 4, 4, true, false);
            class082802.N(40, 20, 0, 32, 4, 12, true, false);
            class082802.N(44, 20, -8, 32, 4, 12, true, false);
            class082802.N(48, 20, -16, 32, 4, 12, true, false);
            class082802.N(52, 20, -8, 32, 4, 12, true, false);
        }
        class08377.y(class082802, 0, 0, 32, 16);
        if (bl) {
            class08377.N(class082802, 32, 0, 64, 32);
        }
        class08377.y(class082802, 0, 16, 64, 32);
        class08377.y(class082802, 16, 48, 48, 64);
        return class082802;
    }

    public CompletableFuture<class06955> N(class01894 class018942, Path path, String string, boolean bl) {
        class06974 class069742 = new class06974(class018942, string);
        return CompletableFuture.supplyAsync(() -> {
            class08280 class082802;
            try {
                class082802 = this.N(path, class069742.L());
            }
            catch (IOException iOException) {
                throw new UncheckedIOException(iOException);
            }
            return bl ? class08377.N(class082802, class069742.L()) : class082802;
        }, class07536.z().N("downloadTexture")).thenCompose(class082802 -> this.N((class06955)class069742, (class08280)class082802));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class08280 N(Path path, String string) throws IOException {
        if (Files.isRegularFile(path, new LinkOption[0])) {
            N.debug("Loading HTTP texture from local cache ({})", (Object)path);
            try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
                class08280 class082802 = class08280.N((InputStream)inputStream);
                return class082802;
            }
        }
        HttpURLConnection httpURLConnection = null;
        N.debug("Downloading HTTP texture from {} to {}", (Object)string, (Object)path);
        URI uRI = URI.create(string);
        try {
            httpURLConnection = (HttpURLConnection)uRI.toURL().openConnection(this.i);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            int n = httpURLConnection.getResponseCode();
            if (n / 100 != 2) {
                throw new IOException("Failed to open " + String.valueOf(uRI) + ", HTTP error code: " + n);
            }
            byte[] byArray = httpURLConnection.getInputStream().readAllBytes();
            try {
                class06290.L((Path)path.getParent());
                Files.write(path, byArray, new OpenOption[0]);
            }
            catch (IOException iOException) {
                N.warn("Failed to cache texture {} in {}", (Object)string, (Object)path);
            }
            class08280 class082803 = class08280.N((byte[])byArray);
            return class082803;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

