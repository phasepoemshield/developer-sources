/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$KeyboardEvent;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$MouseEvent;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class InputEvents {
    public static final Event<ClientCompatibilityManager$KeyboardEvent> KEYBOARD_KEY = EventFactory.createArrayBacked(ClientCompatibilityManager$KeyboardEvent.class, clientCompatibilityManager$KeyboardEventArray -> class066012 -> {
        for (ClientCompatibilityManager$KeyboardEvent clientCompatibilityManager$KeyboardEvent : clientCompatibilityManager$KeyboardEventArray) {
            clientCompatibilityManager$KeyboardEvent.onKeyboardEvent(class066012);
        }
    });
    public static final Event<ClientCompatibilityManager$MouseEvent> MOUSE_KEY = EventFactory.createArrayBacked(ClientCompatibilityManager$MouseEvent.class, clientCompatibilityManager$MouseEventArray -> (class065952, n) -> {
        for (ClientCompatibilityManager$MouseEvent clientCompatibilityManager$MouseEvent : clientCompatibilityManager$MouseEventArray) {
            clientCompatibilityManager$MouseEvent.onMouseEvent(class065952, n);
        }
    });
    public static final Event<Runnable> HANDLE_KEYBINDS = EventFactory.createArrayBacked(Runnable.class, runnableArray -> () -> {
        for (Runnable runnable : runnableArray) {
            runnable.run();
        }
    });
}

