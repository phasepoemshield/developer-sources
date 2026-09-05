/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.listener.AbstractGameEventListener
 *  baritone.utils.IRenderer
 *  minecraft.class00734
 *  minecraft.class01421
 *  minecraft.class07209
 *  minecraft.class07331
 */
package baritone.command.defaults;

import baritone.Baritone;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.command.defaults.SelCommand;
import baritone.utils.IRenderer;
import java.awt.Color;
import minecraft.class00734;
import minecraft.class01421;
import minecraft.class07209;
import minecraft.class07331;

class SelCommand$1
implements AbstractGameEventListener {
    final /* synthetic */ SelCommand this$0;

    SelCommand$1(SelCommand selCommand) {
        this.this$0 = selCommand;
    }

    public void onRenderPass(RenderEvent renderEvent) {
        if (!((Boolean)Baritone.settings().renderSelectionCorners.value).booleanValue() || this.this$0.pos1 == null) {
            return;
        }
        Color color = (Color)Baritone.settings().colorSelectionPos1.value;
        float f = ((Float)Baritone.settings().selectionOpacity.value).floatValue();
        float f2 = ((Float)Baritone.settings().selectionLineWidth.value).floatValue();
        boolean bl = (Boolean)Baritone.settings().renderSelectionIgnoreDepth.value;
        class07331 class073312 = IRenderer.startLines((Color)color, (float)f);
        IRenderer.emitAABB((class07331)class073312, (class01421)renderEvent.getModelViewStack(), (class00734)new class00734((class07209)this.this$0.pos1), (float)f2);
        IRenderer.endLines((class07331)class073312, (boolean)bl);
    }
}

