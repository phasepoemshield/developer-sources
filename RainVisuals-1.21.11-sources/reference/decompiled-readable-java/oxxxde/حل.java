/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.ChatScreen
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.listener.Listener;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotakbaz.rain.ui.menu.MenuScreen;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screen.ChatScreen;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0637;
import oxxxde.\u062b\u064c;
import oxxxde.\u062e\u064b;
import oxxxde.\u0631\u0638;
import oxxxde.\u0633\u0631;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u064f;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Loxxxde/\u062d\u0644;", "Loxxxde/\u062a\u0645;", "<init>", "()V", "", "init", "Loxxxde/\u062a\u0632;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "mouseX", "()I", "mouseY", "", "Loxxxde/\u0638\u064f;", "binds", "Ljava/util/List;", "rain-visuals"})
public final class \u062d\u0644
extends Listener {
    @NotNull
    public static final \u062d\u0644 INSTANCE = new \u062d\u0644();
    @NotNull
    private static final List<\u0638\u064f> binds = new ArrayList();

    @Override
    public void init() {
        \u0631\u0638.INSTANCE.register(this);
        binds.clear();
        binds.addAll((Collection<\u0638\u064f>)\u062e\u064b.INSTANCE.getModules());
    }

    public final int mouseX() {
        return (int)(\u0636\u0643.getMc().mouse.getX() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
    }

    /*
     * Unable to fully structure code
     */
    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        block25: {
            block24: {
                Intrinsics.checkNotNullParameter(event, "event");
                v0 = event.get(KeyEvent.Companion.getBUTTON());
                if (v0 == null) {
                    return;
                }
                button = v0;
                eventRelease = event.get(KeyEvent.Companion.getRELEASE());
                eventMouse = event.get(KeyEvent.Companion.getMOUSE());
                released = Intrinsics.areEqual(eventRelease, true);
                mouseEvent = Intrinsics.areEqual(eventMouse, true);
                mouseX = this.mouseX();
                mouseY = this.mouseY();
                canProcessDraggables = \u0635\u0635.INSTANCE.getCustomScreen() == null && \u0636\u0643.getMc().currentScreen instanceof ChatScreen;
                if (!mouseEvent || !canProcessDraggables) break block24;
                if (!released) {
                    if (RainMainMenuScreen$Link.INSTANCE.onRemoteNotificationClick(mouseX, mouseY, button)) {
                        return;
                    }
                }
                if (!released) {
                    if (\u0628\u0637.INSTANCE.onChatClick(mouseX, mouseY, button)) {
                        return;
                    }
                }
                action = released ? 0 : 1;
                v1 = \u062b\u064c.INSTANCE.getDraggables().values();
                Intrinsics.checkNotNullExpressionValue(v1, "<get-values>(...)");
                $this$filter$iv = v1;
                $i$f$filter = false;
                var14_17 = $this$filter$iv;
                destination$iv$iv = new ArrayList<E>();
                $i$f$filterTo = false;
                var17_25 = $this$filterTo$iv$iv.iterator();
                while (var17_25.hasNext()) {
                    element$iv$iv = var17_25.next();
                    it = (Draggable)element$iv$iv;
                    var20_31 = false;
                    if (!var19_30.getModule().isEnabled()) continue;
                    destination$iv$iv.add(element$iv$iv);
                }
                draggables = (List)destination$iv$iv;
                if (released) ** GOTO lbl-1000
                if (button != 0) lbl-1000:
                // 2 sources

                {
                    $this$forEach$iv = draggables;
                    $i$f$forEach = false;
                    $this$filterTo$iv$iv = $this$forEach$iv.iterator();
                    while ($this$filterTo$iv$iv.hasNext()) {
                        element$iv = $this$filterTo$iv$iv.next();
                        draggable = (Draggable)element$iv;
                        $i$a$-forEach-InputListener$onKey$1 = false;
                        draggable.onClick(button, action);
                    }
                } else {
                    block23: {
                        $this$firstOrNull$iv = CollectionsKt.asReversed(draggables);
                        $i$f$firstOrNull = false;
                        for (T element$iv : $this$firstOrNull$iv) {
                            it = (Draggable)element$iv;
                            var18_29 = false;
                            if (!it.isHovering()) continue;
                            v2 = element$iv;
                            break block23;
                        }
                        v2 = null;
                    }
                    $this$forEach$iv = v2;
                    if ($this$forEach$iv != null) {
                        $this$forEach$iv.onClick(button, (int)$this$forEach$iv);
                    }
                }
            }
            if (released) break block25;
            $this$forEach$iv = \u062d\u0644.binds;
            $i$f$forEach = false;
            for (T element$iv : $this$forEach$iv) {
                it = (\u0638\u064f)element$iv;
                $i$a$-forEach-InputListener$onKey$3 = false;
                validSituations = \u0635\u0635.INSTANCE.getCustomScreen() == null && \u0636\u0643.getMc().currentScreen == null && \u0636\u0643.getMc().player != null && \u0636\u0643.getMc().world != null;
                if (button != it.getKey()) ** GOTO lbl-1000
                if (it.getKey() != -1) {
                    v3 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v3 = false;
                }
                if (!(var17_27 = v3) || var16_22 == false) continue;
                var14_19.onKey();
            }
        }
        v4 = \u0635\u0635.INSTANCE.getCustomScreen();
        if (v4 != null) {
            it = v4;
            $i$a$-let-InputListener$onKey$4 = false;
            if (!mouseEvent && !released) {
                if (button == 256) {
                    it.close();
                    return;
                }
            }
            if (!mouseEvent && !released) {
                it.onKeyPress(mouseX, mouseY, button);
            }
            if (mouseEvent) {
                if (released) {
                    var12_12.onMouseRelease(mouseX, mouseY, button);
                } else {
                    var12_12.onMouseClick(mouseX, mouseY, button);
                }
            }
        }
        if (!mouseEvent && !released && \u0635\u0635.INSTANCE.getCustomScreen() == null && \u0636\u0643.getMc().currentScreen == null) {
            if (var2_2 == \u0633\u0631.INSTANCE.getOpenKey()) {
                \u0635\u0635.INSTANCE.setCustomScreen(MenuScreen.INSTANCE);
            }
        }
    }

    public final int mouseY() {
        return (int)(\u0636\u0643.getMc().mouse.getY() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
    }

    private \u062d\u0644() {
    }
}

