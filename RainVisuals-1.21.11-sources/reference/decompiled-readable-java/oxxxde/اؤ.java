/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.util.other.KeyMappings;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.container.Data;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Btn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062e\u064b;
import oxxxde.\u0637\u063a;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2={"Loxxxde/\u0627\u0624;", "Loxxxde/\u0632\u0643;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "", "Loxxxde/\u0635\u0647;", "Loxxxde/\u062a\u0650;", "getCurrentData", "()Ljava/util/Map;", "", "size", "ensureSnapshotCapacity", "(I)V", "Ljava/util/LinkedHashMap;", "map", "Ljava/util/LinkedHashMap;", "", "Loxxxde/\u062f\u0650;", "visibleModules", "[Loxxxde/\u062f\u0650;", "", "visibleKeys", "[I", "visibleCount", "I", "rain-visuals"})
public final class \u0627\u0624
extends RainMainMenuScreen$Btn {
    private static int visibleCount;
    @NotNull
    private static Module[] visibleModules;
    @NotNull
    public static final \u0627\u0624 INSTANCE;
    @NotNull
    private static int[] visibleKeys;
    @NotNull
    private static final LinkedHashMap<Data.First, Data.Second> map;

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    protected Map<Data.First, Data.Second> getCurrentData() {
        int n;
        List<Module> modules = \u062e\u064b.INSTANCE.getModules();
        this.ensureSnapshotCapacity(modules.size());
        int nextCount = 0;
        boolean changed = false;
        int moduleIndex = 0;
        while (moduleIndex < modules.size()) {
            Module module;
            block9: {
                block8: {
                    if (!(module = modules.get(moduleIndex++)).isEnabled() || !module.canBind() || !module.canToggle() || module.getKey() == -1) continue;
                    int key = module.getKey();
                    if (visibleModules[nextCount] != module) break block8;
                    if (visibleKeys[nextCount] == key) break block9;
                }
                changed = true;
            }
            \u0627\u0624.visibleModules[nextCount] = module;
            \u0627\u0624.visibleKeys[nextCount] = n;
            ++nextCount;
        }
        if (nextCount != visibleCount) {
            changed = true;
        }
        visibleCount = nextCount;
        if (!changed) {
            return map;
        }
        map.clear();
        int index = 0;
        n = visibleCount;
        while (index < n) {
            void var5_6;
            if (visibleModules[index] != null) {
                Module module;
                String keyName = KeyMappings.INSTANCE.getKey(visibleKeys[index]);
                ((Map)map).put(new Data.First(module.getName(), new Data.Leading.Glyph(module.getCategory().getIcon())), new Data.Second(keyName, \u0637\u063a.INSTANCE.getVALUE_COLOR()));
            }
            ++var5_6;
        }
        return map;
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.renderContainer(event);
    }

    private \u0627\u0624() {
        super("KeyBinds", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0435 \u0431\u0438\u043d\u0434\u044b", 200.0f, 200.0f, "r");
    }

    static {
        INSTANCE = new \u0627\u0624();
        map = new LinkedHashMap();
        visibleModules = new Module[0];
        visibleKeys = new int[0];
    }

    private final void ensureSnapshotCapacity(int size) {
        if (visibleModules.length >= size) {
            return;
        }
        visibleModules = new Module[size];
        visibleKeys = new int[size];
        visibleCount = 0;
    }
}

