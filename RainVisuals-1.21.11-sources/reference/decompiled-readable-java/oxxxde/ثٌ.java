/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062c\u062c;
import oxxxde.\u0639\u062d;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2={"Loxxxde/\u062b\u064c;", "", "<init>", "()V", "Loxxxde/\u062f\u0650;", "module", "", "name", "", "x", "y", "Loxxxde/\u0638\u0630;", "create", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;FF)Lkotakbaz/rain/client/draggable/Draggable;", "", "save", "()Z", "", "load", "ensureParentDirectory", "Ljava/util/LinkedHashMap;", "draggables", "Ljava/util/LinkedHashMap;", "getDraggables", "()Ljava/util/LinkedHashMap;", "Ljava/io/File;", "configFile", "Ljava/io/File;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Companion", "rain-visuals"})
public final class \u062b\u064c {
    @NotNull
    private final LinkedHashMap<String, Draggable> draggables = new LinkedHashMap();
    @JvmField
    @NotNull
    public static final \u062b\u064c INSTANCE;
    @NotNull
    public static final \u062c\u062c Companion;
    @NotNull
    private final File configFile = new File(System.getProperty("user.dir"), "Rain/other/drags.json");
    @NotNull
    private final Gson gson;

    static {
        Companion = new \u062c\u062c(null);
        INSTANCE = new \u062b\u064c();
    }

    private \u062b\u064c() {
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        Intrinsics.checkNotNullExpressionValue(gson, "create(...)");
        this.gson = gson;
    }

    public final void load() {
        block5: {
            Object object;
            if (!this.configFile.exists()) {
                this.ensureParentDirectory();
                return;
            }
            Object object2 = this;
            try {
                Map loadedDraggables;
                \u062b\u064c $this$load_u24lambda_u240 = object2;
                boolean bl = false;
                String json = Files.readString($this$load_u24lambda_u240.configFile.toPath());
                Map map = (Map)$this$load_u24lambda_u240.gson.fromJson(json, new \u0639\u062d().getType());
                if (map == null) {
                    return;
                }
                Map $this$forEach$iv = loadedDraggables = map;
                boolean $i$f$forEach = false;
                Iterator iterator2 = $this$forEach$iv.entrySet().iterator();
                while (iterator2.hasNext()) {
                    Draggable current;
                    Map.Entry element$iv;
                    Map.Entry entry = element$iv = iterator2.next();
                    boolean bl2 = false;
                    String name = (String)entry.getKey();
                    Draggable loaded = (Draggable)entry.getValue();
                    if ($this$load_u24lambda_u240.draggables.get(name) == null) continue;
                    current.restoreTo(loaded.getX(), loaded.getY());
                    ((Map)$this$load_u24lambda_u240.draggables).put(name, current);
                }
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block5;
            object = throwable;
            Object object3 = object;
            boolean bl = false;
            ((Throwable)object3).printStackTrace();
        }
    }

    @NotNull
    public final LinkedHashMap<String, Draggable> getDraggables() {
        return this.draggables;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Draggable create(@NotNull Module module, @NotNull String name, float x, float y) {
        void var5_5;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(name, "name");
        Draggable draggable = new Draggable(module, name, x, y);
        ((Map)this.draggables).put(name, draggable);
        return var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public final synchronized boolean save() {
        void var3_14;
        Object object;
        Object $this$save_u24lambda_u240;
        Path target = this.configFile.toPath();
        if (!target.getFileSystem().isOpen()) {
            System.err.println("File system closed. Could not save drag data.");
            return false;
        }
        Path temporary = target.resolveSibling(target.getFileName() + ".tmp");
        Object object2 = this;
        try {
            $this$save_u24lambda_u240 = object2;
            boolean bl = false;
            super.ensureParentDirectory();
            Object object3 = new OpenOption[3];
            object3[0] = StandardOpenOption.CREATE;
            object3[1] = StandardOpenOption.TRUNCATE_EXISTING;
            object3[2] = StandardOpenOption.WRITE;
            Files.writeString(temporary, (CharSequence)((\u062b\u064c)$this$save_u24lambda_u240).gson.toJson(((\u062b\u064c)$this$save_u24lambda_u240).draggables), (OpenOption[])object3);
            try {
                object3 = new CopyOption[2];
                object3[0] = StandardCopyOption.ATOMIC_MOVE;
                object3[1] = StandardCopyOption.REPLACE_EXISTING;
                object3 = Files.move(temporary, target, (CopyOption[])object3);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                object3 = Files.move(temporary, target, copyOptionArray);
            }
            $this$save_u24lambda_u240 = Result.constructor-impl(object3);
        }
        catch (Throwable bl) {
            $this$save_u24lambda_u240 = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = $this$save_u24lambda_u240;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            Object p0 = $this$save_u24lambda_u240 = throwable;
            boolean bl = false;
            ((Throwable)p0).printStackTrace();
        }
        boolean saved = Result.isSuccess-impl(object2);
        object2 = this;
        try {
            object = (\u062b\u064c)object2;
            boolean bl = false;
            object = Result.constructor-impl(Files.deleteIfExists(temporary));
        }
        catch (Throwable throwable2) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable2));
        }
        return (boolean)var3_14;
    }

    private final void ensureParentDirectory() {
        block0: {
            Comparable<File> comparable = this.configFile.getParentFile();
            if (comparable == null || (comparable = comparable.toPath()) == null) break block0;
            Comparable<File> it = comparable;
            boolean bl = false;
            Files.createDirectories((Path)it, new FileAttribute[0]);
        }
    }
}

