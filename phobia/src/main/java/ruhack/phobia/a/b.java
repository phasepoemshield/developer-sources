/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.ChatEvent
 *  baritone.api.event.events.TabCompleteEvent
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.TabCompleteEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.fl;

@Pseudo
@Mixin(targets={"baritone/command/ExampleBaritoneControl"}, remap=false)
public abstract class b {
    @Inject(method={"onSendChatMessage"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void phobia$disableUnhookedCommands(ChatEvent event, CallbackInfo ci2) {
        if (fl.isUnhooked()) {
            ci2.cancel();
        }
    }

    @Inject(method={"onPreTabComplete"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void phobia$disableUnhookedSuggestions(TabCompleteEvent event, CallbackInfo ci2) {
        if (fl.isUnhooked()) {
            event.cancel();
            ci2.cancel();
        }
    }
}

