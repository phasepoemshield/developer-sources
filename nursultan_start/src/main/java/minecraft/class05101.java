/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10489
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.mojang.logging.LogUtils
 *  javax.annotation.CheckReturnValue
 *  minecraft.class03103
 *  minecraft.class03142
 *  minecraft.class04151
 *  minecraft.class04741
 *  minecraft.class04777
 *  minecraft.class04779
 *  minecraft.class04785
 *  minecraft.class04945
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveInputStream
 *  org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10489;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Locale;
import java.util.OptionalLong;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.CheckReturnValue;
import minecraft.class03103;
import minecraft.class03142;
import minecraft.class04151;
import minecraft.class04741;
import minecraft.class04777;
import minecraft.class04779;
import minecraft.class04785;
import minecraft.class04945;
import minecraft.class05103;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class07536;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05101 {
    private static final Logger N = LogUtils.getLogger();
    private volatile boolean y;
    private volatile boolean L;
    private volatile boolean u;
    private volatile boolean i;
    private volatile @Nullable File R;
    private volatile File M;
    private volatile @Nullable CompletableFuture<?> B;
    private @Nullable Thread Z;
    private static final String[] z = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    private static HttpRequest.Builder L(String string) {
        return HttpRequest.newBuilder(URI.create(string)).timeout(Duration.ofMinutes(2L));
    }

    public boolean L() {
        return this.u;
    }

    private static HttpClient i() {
        return HttpClient.newBuilder().executor((Executor)class07536.z()).connectTimeout(Duration.ofMinutes(2L)).build();
    }

    public boolean u() {
        return this.i;
    }

    public static String y(String object) {
        object = ((String)object).replaceAll("[\\./\"]", "_");
        for (String string : z) {
            if (!((String)object).equalsIgnoreCase(string)) continue;
            object = "_" + (String)object + "_";
        }
        return object;
    }

    public boolean y() {
        return this.L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(String string, @Nullable File file, class04777 class047772) throws IOException {
        Object object;
        Pattern pattern = Pattern.compile(".*-([0-9]+)$");
        int n = 1;
        for (char c : class07529.yM) {
            string = string.replace(c, '_');
        }
        if (StringUtils.isEmpty((CharSequence)string)) {
            string = "Realm";
        }
        string = class05101.y(string);
        try {
            for (class04779 class047792 : class047772.y()) {
                String string2 = class047792.N();
                if (!string2.toLowerCase(Locale.ROOT).startsWith(string.toLowerCase(Locale.ROOT))) continue;
                Matcher matcher = pattern.matcher(string2);
                if (matcher.matches()) {
                    int n2 = Integer.parseInt(matcher.group(1));
                    if (n2 <= n) continue;
                    n = n2;
                    continue;
                }
                ++n;
            }
        }
        catch (Exception exception) {
            N.error("Error getting level list", (Throwable)exception);
            this.u = true;
            return;
        }
        if (!class047772.N(string) || n > 1) {
            object = string + (String)(n == 1 ? "" : "-" + n);
            if (!class047772.N((String)object)) {
                boolean bl = false;
                while (!bl) {
                    if (!class047772.N((String)(object = string + (String)(++n == 1 ? "" : "-" + n)))) continue;
                    bl = true;
                }
            }
        } else {
            object = string;
        }
        TarArchiveInputStream tarArchiveInputStream = null;
        File file2 = new File(((File)class06202.Nq().l_1).getAbsolutePath(), "saves");
        try {
            file2.mkdir();
            tarArchiveInputStream = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new BufferedInputStream(new FileInputStream(file))));
            TarArchiveEntry tarArchiveEntry = tarArchiveInputStream.getNextTarEntry();
            while (tarArchiveEntry != null) {
                File file3 = new File(file2, tarArchiveEntry.getName().replace("world", (CharSequence)object));
                if (tarArchiveEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    file3.createNewFile();
                    try (FileOutputStream fileOutputStream = new FileOutputStream(file3);){
                        IOUtils.copy((InputStream)tarArchiveInputStream, (OutputStream)fileOutputStream);
                    }
                }
                tarArchiveEntry = tarArchiveInputStream.getNextTarEntry();
            }
        }
        catch (Exception exception) {
            N.error("Error extracting world", (Throwable)exception);
            this.u = true;
        }
        finally {
            if (tarArchiveInputStream != null) {
                tarArchiveInputStream.close();
            }
            if (file != null) {
                file.delete();
            }
            try (class04785 class047852 = class047772.u((String)object);){
                class047852.y((String)object);
            }
            catch (IOException | class03103 | class03142 throwable) {
                N.error("Failed to modify unpacked realms level {}", object, (Object)throwable);
            }
            catch (class04151 class041512) {
                N.warn("Failed to download file", (Throwable)class041512);
            }
            this.M = new File(file2, (String)object + File.separator + "resources.zip");
        }
    }

    private void N(String string, File file, class04777 class047772, class04741 class047412) {
        if (class047412.N >= class047412.y && !this.y && !this.u) {
            try {
                this.i = true;
                this.N(string, file, class047772);
            }
            catch (IOException iOException) {
                N.error("Error extracting archive", (Throwable)iOException);
                this.u = true;
            }
        }
    }

    private void N(class04741 class047412, File file, class04945 class049452) {
        if (class047412.N >= class047412.y && !this.y) {
            try {
                String string = Hashing.sha1().hashBytes(Files.toByteArray((File)file)).toString();
                if (string.equals(class049452.L())) {
                    FileUtils.copyFile((File)file, (File)this.M);
                    this.L = true;
                } else {
                    N.error("Resourcepack had wrong hash (expected {}, found {}). Deleting it.", (Object)class049452.L(), (Object)string);
                    FileUtils.deleteQuietly((File)file);
                    this.u = true;
                }
            }
            catch (IOException iOException) {
                N.error("Error copying resourcepack file: {}", (Object)iOException.getMessage());
                this.u = true;
            }
        }
    }

    @CheckReturnValue
    public static OptionalLong N(String string) {
        OptionalLong optionalLong;
        block8: {
            HttpClient httpClient = class05101.i();
            try {
                HttpResponse<Void> var2 = httpClient.send(class05101.L(string).HEAD().build(), HttpResponse.BodyHandlers.discarding());
                optionalLong = var2.headers().firstValueAsLong("Content-Length");
                if (httpClient == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (httpClient != null) {
                        try {
                            httpClient.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    N.error("Unable to get content length for download");
                    return OptionalLong.empty();
                }
            }
            httpClient.close();
        }
        return optionalLong;
    }

    public void N() {
        if (this.R != null) {
            this.R.delete();
            this.R = null;
        }
        this.y = true;
        CompletableFuture<?> var1 = this.B;
        if (var1 != null) {
            var1.cancel(true);
        }
    }

    private <T> @Nullable T N(CompletableFuture<T> completableFuture) throws Throwable {
        this.B = completableFuture;
        if (this.y) {
            completableFuture.cancel(true);
            return null;
        }
        try {
            try {
                return completableFuture.join();
            }
            catch (CompletionException completionException) {
                throw completionException.getCause();
            }
        }
        catch (CancellationException cancellationException) {
            return null;
        }
    }

    private void N(class04741 class047412, HttpClient httpClient, String string, File file) throws IOException {
        HttpResponse<InputStream> var6;
        HttpRequest httpRequest = class05101.L(string).GET().build();
        try {
            var6 = this.N(httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofInputStream()));
        }
        catch (Error error) {
            throw error;
        }
        catch (Throwable throwable) {
            N.error("Failed to download {}", (Object)string, (Object)throwable);
            this.u = true;
            return;
        }
        if (var6 == null || this.y) {
            return;
        }
        if (var6.statusCode() != 200) {
            this.u = true;
            return;
        }
        class047412.y = var6.headers().firstValueAsLong("Content-Length").orElse(0L);
        try (InputStream inputStream = var6.body();
             FileOutputStream fileOutputStream = new FileOutputStream(file);){
            inputStream.transferTo((OutputStream)new class10489((OutputStream)fileOutputStream, class047412));
        }
    }

    public void N(class04945 class049452, String string, class04741 class047412, class04777 class047772) {
        if (this.Z != null) {
            return;
        }
        this.Z = new Thread(() -> {
            try (HttpClient httpClient = class05101.i();){
                try {
                    this.R = File.createTempFile("backup", ".tar.gz");
                    this.N(class047412, httpClient, class049452.N(), this.R);
                    this.N(string.trim(), this.R, class047772, class047412);
                }
                catch (Exception exception) {
                    N.error("Caught exception while downloading world", (Throwable)exception);
                    this.u = true;
                }
                finally {
                    this.B = null;
                    if (this.R != null) {
                        this.R.delete();
                    }
                    this.R = null;
                }
                if (this.u) {
                    return;
                }
                String string2 = class049452.y();
                if (!string2.isEmpty() && !class049452.L().isEmpty()) {
                    try {
                        this.R = File.createTempFile("resources", ".tar.gz");
                        this.N(class047412, httpClient, string2, this.R);
                        this.N(class047412, this.R, class049452);
                    }
                    catch (Exception exception) {
                        N.error("Caught exception while downloading resource pack", (Throwable)exception);
                        this.u = true;
                    }
                    finally {
                        this.B = null;
                        if (this.R != null) {
                            this.R.delete();
                        }
                        this.R = null;
                    }
                }
                this.L = true;
            }
        });
        this.Z.setUncaughtExceptionHandler(new class05103(N));
        this.Z.start();
    }
}

