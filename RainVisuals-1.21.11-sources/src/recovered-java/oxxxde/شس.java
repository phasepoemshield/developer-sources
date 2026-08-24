/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062b\u064f;
import oxxxde.\u062c\u0634;
import oxxxde.\u0630\u0646;
import oxxxde.\u0630\u064e;
import oxxxde.\u0632\u0622;
import oxxxde.\u0632\u062b;
import oxxxde.\u0632\u0644;
import oxxxde.\u0636\u0648;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Loxxxde/\u0634\u0633;", "", "<init>", "()V", "", "name", "path", "", "register", "(Ljava/lang/String;Ljava/lang/String;)V", "load", "loadSingle", "Loxxxde/\u0636;", "get", "(Ljava/lang/String;)Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "", "loadQueue", "Ljava/util/Map;", "", "bootstrapped", "Z", "rain-visuals"})
public final class \u0634\u0633 {
    @NotNull
    public static final \u0634\u0633 INSTANCE = new \u0634\u0633();
    @NotNull
    private static final Map<String, String> loadQueue = new HashMap();
    private static boolean bootstrapped;

    private \u0634\u0633() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void loadSingle(String name, String path) {
        String resourcePath = "assets/" + \u0632\u062b.getCLIENT_ID() + "/" + path;
        InputStream stream = \u0632\u0644.fromAssets(resourcePath);
        if (stream == null) {
            System.err.println("Texture file not found: " + path);
            return;
        }
        try {
            Closeable closeable = stream;
            Throwable throwable = null;
            try {
                InputStream it = (InputStream)closeable;
                boolean bl = false;
                \u0630\u0646 info = \u062b\u064f.INPUT_STREAM.load(it, \u0636\u0648.RGBA, \u0632\u0622.SMOOTH, \u062c\u0634.DEFAULT);
                GLTexture texture = GLTexture.of(name, info);
                boolean ok = \u0630\u064e.addTexture(name, texture);
                System.out.println((Object)((ok ? "[SUCCESS]" : "[FAILED]") + " Loaded texture: " + name));
                Unit unit = Unit.INSTANCE;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseableKt.closeFinally(closeable, throwable);
            }
        }
        catch (Exception e) {
            void var5_6;
            System.err.println("Failed to load texture: " + name);
            var5_6.printStackTrace();
        }
    }

    @Nullable
    public final GLTexture get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return \u0630\u064e.getTexture(name);
    }

    public final void load() {
        if (bootstrapped) {
            return;
        }
        System.out.println((Object)"Starting texture loading...");
        long start = System.currentTimeMillis();
        Map<String, String> $this$forEach$iv = loadQueue;
        boolean $i$f$forEach = false;
        Iterator<Map.Entry<String, String>> iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> element$iv;
            Map.Entry<String, String> entry = element$iv = iterator2.next();
            boolean bl = false;
            String name = entry.getKey();
            String path = entry.getValue();
            INSTANCE.loadSingle(name, path);
        }
        loadQueue.clear();
        bootstrapped = true;
        System.out.println((Object)("Loaded textures in " + (System.currentTimeMillis() - start) + " ms"));
    }

    public final void register(@NotNull String name, @NotNull String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        if (bootstrapped) {
            this.loadSingle(name, path);
        } else {
            loadQueue.put(name, path);
        }
    }
}

