/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.minecraft.client.MinecraftClient
 */
package kotakbaz.rain;

import java.util.Collection;
import kotakbaz.rain.config.ConfigManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062b\u064c;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u000f\u00a8\u0006\u0016"}, d2={"Loxxxde/\u0631\u064c;", "", "<init>", "()V", "", "initialize", "restoreCurrentState", "requestSave", "flushPendingSave", "", "saveCurrentState", "()Z", "persistSnapshot", "", "SAVE_DEBOUNCE_NANOS", "J", "initialized", "Z", "stateRestored", "shutdownSnapshotSaved", "savePending", "saveAfterNanos", "rain-visuals"})
public final class Rain {
    private static final long SAVE_DEBOUNCE_NANOS = 750000000L;
    private static boolean savePending;
    private static boolean initialized;
    private static boolean stateRestored;
    @NotNull
    public static final Rain INSTANCE;
    private static boolean shutdownSnapshotSaved;
    private static long saveAfterNanos;

    private static final void initialize$lambda$0(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.restoreCurrentState();
    }

    private static final void initialize$lambda$1(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.saveCurrentState();
    }

    public final synchronized void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        ConfigManager.INSTANCE.captureCleanRuntimeSnapshot();
        ClientLifecycleEvents.CLIENT_STARTED.register(Rain::initialize$lambda$0);
        ClientLifecycleEvents.CLIENT_STOPPING.register(Rain::initialize$lambda$1);
        ClientTickEvents.END_CLIENT_TICK.register(Rain::initialize$lambda$2);
    }

    public final synchronized void requestSave() {
        if (!initialized || !stateRestored || shutdownSnapshotSaved) {
            return;
        }
        savePending = true;
        saveAfterNanos = System.nanoTime() + 750000000L;
    }

    private Rain() {
    }

    private static final void initialize$lambda$2(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.flushPendingSave();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean persistSnapshot() {
        if (!ConfigManager.INSTANCE.unloadActiveCloudConfig()) {
            return false;
        }
        boolean configSaved = ConfigManager.INSTANCE.save("AutoLoad");
        boolean draggablesSaved = \u062b\u064c.INSTANCE.save();
        if (!configSaved) return false;
        if (!draggablesSaved) return false;
        return true;
    }

    static {
        INSTANCE = new Rain();
    }

    /*
     * WARNING - void declaration
     */
    public final synchronized boolean saveCurrentState() {
        void var1_1;
        block6: {
            block5: {
                if (!initialized) break block5;
                if (stateRestored) break block6;
            }
            return false;
        }
        if (shutdownSnapshotSaved) {
            return true;
        }
        boolean saved = this.persistSnapshot();
        if (saved) {
            savePending = false;
            shutdownSnapshotSaved = true;
        }
        return (boolean)var1_1;
    }

    /*
     * Unable to fully structure code
     */
    private final synchronized void restoreCurrentState() {
        block4: {
            if (Rain.stateRestored) {
                return;
            }
            $this$any$iv = ConfigManager.INSTANCE.getConfigNames();
            $i$f$any = false;
            if (!($this$any$iv instanceof Collection)) ** GOTO lbl-1000
            if (((Collection)$this$any$iv).isEmpty()) {
                v0 = false;
            } else lbl-1000:
            // 3 sources

            {
                for (T element$iv : $this$any$iv) {
                    it = (String)element$iv;
                    $i$a$-any-AutoConfigService$restoreCurrentState$autoLoadExists$1 = false;
                    if (!StringsKt.equals(it, "AutoLoad", true)) continue;
                    v0 = true;
                    break block4;
                }
                v0 = false;
            }
        }
        autoLoadExists = v0;
        configRestored = !autoLoadExists || ConfigManager.INSTANCE.load("AutoLoad");
        \u062b\u064c.INSTANCE.load();
        Rain.stateRestored = var2_2;
        Rain.savePending = false;
    }

    private final synchronized void flushPendingSave() {
        if (!savePending || System.nanoTime() < saveAfterNanos) {
            return;
        }
        if (this.persistSnapshot()) {
            savePending = false;
        } else {
            saveAfterNanos = System.nanoTime() + 750000000L;
        }
    }
}

