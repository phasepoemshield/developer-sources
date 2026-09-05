/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterBackground
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterRender
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeRender
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$Remove
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseScroll
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.impl.client.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ScreenEventFactory {
    private ScreenEventFactory() {
    }

    public static Event<ScreenEvents.Remove> createRemoveEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.Remove.class, removeArray -> class050962 -> {
            for (ScreenEvents.Remove remove : removeArray) {
                remove.onRemove(class050962);
            }
        });
    }

    public static Event<ScreenKeyboardEvents.AllowKeyPress> createAllowKeyPressEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.AllowKeyPress.class, allowKeyPressArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.AllowKeyPress allowKeyPress : allowKeyPressArray) {
                if (allowKeyPress.allowKeyPress(class050962, class066012)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenKeyboardEvents.AfterKeyRelease> createAfterKeyReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.AfterKeyRelease.class, afterKeyReleaseArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.AfterKeyRelease afterKeyRelease : afterKeyReleaseArray) {
                afterKeyRelease.afterKeyRelease(class050962, class066012);
            }
        });
    }

    public static Event<ScreenEvents.AfterTick> createAfterTickEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.AfterTick.class, afterTickArray -> class050962 -> {
            for (ScreenEvents.AfterTick afterTick : afterTickArray) {
                afterTick.afterTick(class050962);
            }
        });
    }

    public static Event<ScreenEvents.AfterBackground> createAfterBackgroundEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.AfterBackground.class, afterBackgroundArray -> (class050962, class010542, n, n2, f) -> {
            for (ScreenEvents.AfterBackground afterBackground : afterBackgroundArray) {
                afterBackground.afterBackground(class050962, class010542, n, n2, f);
            }
        });
    }

    public static Event<ScreenKeyboardEvents.BeforeKeyPress> createBeforeKeyPressEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.BeforeKeyPress.class, beforeKeyPressArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.BeforeKeyPress beforeKeyPress : beforeKeyPressArray) {
                beforeKeyPress.beforeKeyPress(class050962, class066012);
            }
        });
    }

    public static Event<ScreenKeyboardEvents.AfterKeyPress> createAfterKeyPressEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.AfterKeyPress.class, afterKeyPressArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.AfterKeyPress afterKeyPress : afterKeyPressArray) {
                afterKeyPress.afterKeyPress(class050962, class066012);
            }
        });
    }

    public static Event<ScreenMouseEvents.AllowMouseClick> createAllowMouseClickEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AllowMouseClick.class, allowMouseClickArray -> (class050962, class066132) -> {
            for (ScreenMouseEvents.AllowMouseClick allowMouseClick : allowMouseClickArray) {
                if (allowMouseClick.allowMouseClick(class050962, class066132)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenMouseEvents.BeforeMouseDrag> createBeforeMouseDragEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.BeforeMouseDrag.class, beforeMouseDragArray -> (class050962, class066132, d, d2) -> {
            for (ScreenMouseEvents.BeforeMouseDrag beforeMouseDrag : beforeMouseDragArray) {
                beforeMouseDrag.beforeMouseDrag(class050962, class066132, d, d2);
            }
        });
    }

    public static Event<ScreenMouseEvents.AfterMouseDrag> createAfterMouseDragEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AfterMouseDrag.class, afterMouseDragArray -> (class050962, class066132, d, d2, bl) -> {
            boolean bl2 = false;
            for (ScreenMouseEvents.AfterMouseDrag afterMouseDrag : afterMouseDragArray) {
                bl2 |= afterMouseDrag.afterMouseDrag(class050962, class066132, d, d2, bl2 | bl);
            }
            return bl2;
        });
    }

    public static Event<ScreenMouseEvents.AfterMouseClick> createAfterMouseClickEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AfterMouseClick.class, afterMouseClickArray -> (class050962, class066132, bl) -> {
            boolean bl2 = false;
            for (ScreenMouseEvents.AfterMouseClick afterMouseClick : afterMouseClickArray) {
                bl2 |= afterMouseClick.afterMouseClick(class050962, class066132, bl2 | bl);
            }
            return bl2;
        });
    }

    public static Event<ScreenKeyboardEvents.AllowKeyRelease> createAllowKeyReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.AllowKeyRelease.class, allowKeyReleaseArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.AllowKeyRelease allowKeyRelease : allowKeyReleaseArray) {
                if (allowKeyRelease.allowKeyRelease(class050962, class066012)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenEvents.BeforeRender> createBeforeRenderEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.BeforeRender.class, beforeRenderArray -> (class050962, class010542, n, n2, f) -> {
            for (ScreenEvents.BeforeRender beforeRender : beforeRenderArray) {
                beforeRender.beforeRender(class050962, class010542, n, n2, f);
            }
        });
    }

    public static Event<ScreenMouseEvents.AllowMouseDrag> createAllowMouseDragEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AllowMouseDrag.class, allowMouseDragArray -> (class050962, class066132, d, d2) -> {
            for (ScreenMouseEvents.AllowMouseDrag allowMouseDrag : allowMouseDragArray) {
                if (allowMouseDrag.allowMouseDrag(class050962, class066132, d, d2)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenEvents.AfterRender> createAfterRenderEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.AfterRender.class, afterRenderArray -> (class050962, class010542, n, n2, f) -> {
            for (ScreenEvents.AfterRender afterRender : afterRenderArray) {
                afterRender.afterRender(class050962, class010542, n, n2, f);
            }
        });
    }

    public static Event<ScreenEvents.BeforeTick> createBeforeTickEvent() {
        return EventFactory.createArrayBacked(ScreenEvents.BeforeTick.class, beforeTickArray -> class050962 -> {
            for (ScreenEvents.BeforeTick beforeTick : beforeTickArray) {
                beforeTick.beforeTick(class050962);
            }
        });
    }

    public static Event<ScreenMouseEvents.AfterMouseScroll> createAfterMouseScrollEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AfterMouseScroll.class, afterMouseScrollArray -> (class050962, d, d2, d3, d4, bl) -> {
            boolean bl2 = false;
            for (ScreenMouseEvents.AfterMouseScroll afterMouseScroll : afterMouseScrollArray) {
                bl2 |= afterMouseScroll.afterMouseScroll(class050962, d, d2, d3, d4, bl2 | bl);
            }
            return bl2;
        });
    }

    public static Event<ScreenMouseEvents.BeforeMouseClick> createBeforeMouseClickEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.BeforeMouseClick.class, beforeMouseClickArray -> (class050962, class066132) -> {
            for (ScreenMouseEvents.BeforeMouseClick beforeMouseClick : beforeMouseClickArray) {
                beforeMouseClick.beforeMouseClick(class050962, class066132);
            }
        });
    }

    public static Event<ScreenKeyboardEvents.BeforeKeyRelease> createBeforeKeyReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenKeyboardEvents.BeforeKeyRelease.class, beforeKeyReleaseArray -> (class050962, class066012) -> {
            for (ScreenKeyboardEvents.BeforeKeyRelease beforeKeyRelease : beforeKeyReleaseArray) {
                beforeKeyRelease.beforeKeyRelease(class050962, class066012);
            }
        });
    }

    public static Event<ScreenMouseEvents.AllowMouseScroll> createAllowMouseScrollEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AllowMouseScroll.class, allowMouseScrollArray -> (class050962, d, d2, d3, d4) -> {
            for (ScreenMouseEvents.AllowMouseScroll allowMouseScroll : allowMouseScrollArray) {
                if (allowMouseScroll.allowMouseScroll(class050962, d, d2, d3, d4)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenMouseEvents.BeforeMouseScroll> createBeforeMouseScrollEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.BeforeMouseScroll.class, beforeMouseScrollArray -> (class050962, d, d2, d3, d4) -> {
            for (ScreenMouseEvents.BeforeMouseScroll beforeMouseScroll : beforeMouseScrollArray) {
                beforeMouseScroll.beforeMouseScroll(class050962, d, d2, d3, d4);
            }
        });
    }

    public static Event<ScreenMouseEvents.AllowMouseRelease> createAllowMouseReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AllowMouseRelease.class, allowMouseReleaseArray -> (class050962, class066132) -> {
            for (ScreenMouseEvents.AllowMouseRelease allowMouseRelease : allowMouseReleaseArray) {
                if (allowMouseRelease.allowMouseRelease(class050962, class066132)) continue;
                return false;
            }
            return true;
        });
    }

    public static Event<ScreenMouseEvents.BeforeMouseRelease> createBeforeMouseReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.BeforeMouseRelease.class, beforeMouseReleaseArray -> (class050962, class066132) -> {
            for (ScreenMouseEvents.BeforeMouseRelease beforeMouseRelease : beforeMouseReleaseArray) {
                beforeMouseRelease.beforeMouseRelease(class050962, class066132);
            }
        });
    }

    public static Event<ScreenMouseEvents.AfterMouseRelease> createAfterMouseReleaseEvent() {
        return EventFactory.createArrayBacked(ScreenMouseEvents.AfterMouseRelease.class, afterMouseReleaseArray -> (class050962, class066132, bl) -> {
            boolean bl2 = false;
            for (ScreenMouseEvents.AfterMouseRelease afterMouseRelease : afterMouseReleaseArray) {
                bl2 |= afterMouseRelease.afterMouseRelease(class050962, class066132, bl2 | bl);
            }
            return bl2;
        });
    }
}

