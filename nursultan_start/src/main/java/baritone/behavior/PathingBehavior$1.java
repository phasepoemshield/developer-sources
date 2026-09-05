/*
 * Decompiled with CFR 0.152.
 */
package baritone.behavior;

import baritone.api.event.events.type.EventState;

class PathingBehavior$1 {
    static final /* synthetic */ int[] $SwitchMap$baritone$api$event$events$type$EventState;

    static {
        $SwitchMap$baritone$api$event$events$type$EventState = new int[EventState.values().length];
        try {
            PathingBehavior$1.$SwitchMap$baritone$api$event$events$type$EventState[EventState.PRE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PathingBehavior$1.$SwitchMap$baritone$api$event$events$type$EventState[EventState.POST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

