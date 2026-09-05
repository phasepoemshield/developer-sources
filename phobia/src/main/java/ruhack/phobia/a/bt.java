/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_156
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_4011
 *  net.minecraft.class_425
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_156;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4011;
import net.minecraft.class_425;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.ld;
import ruhack.phobia.mh;
import ruhack.phobia.nc;
import ruhack.phobia.nd;

@Mixin(value={class_425.class})
public abstract class bt
implements nc {
    @Shadow
    @Final
    private class_310 field_18217;
    @Shadow
    @Final
    private class_4011 field_17767;
    @Shadow
    private float field_17770;
    @Shadow
    private long field_17771;
    @Shadow
    private long field_18220;

    @Inject(method={"method_25394"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$renderResourceReload(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci2) {
        if (this.field_17767 == null) {
            return;
        }
        ci2.cancel();
        long now = class_156.method_658();
        if (this.field_18220 == -1L) {
            this.field_18220 = now;
        }
        float actualProgress = this.field_17767.method_18229();
        this.field_17770 = class_3532.method_15363((float)(this.field_17770 * 0.95f + actualProgress * 0.05f), (float)0.0f, (float)1.0f);
        if (this.field_17771 > -1L && now - this.field_17771 >= 2000L) {
            mh.protectFromFancyMenu(this.field_18217.field_1755);
            this.field_18217.method_18502(null);
        }
    }

    @Override
    public void phobia$renderAboveGui(class_332 context) {
        block4: {
            try {
                ld.render();
            }
            catch (Throwable ignored) {
                context.method_25296(0, 0, context.method_51421(), context.method_51443(), -15263716, -16250613);
                if (kv.BOLD == null) break block4;
                ld.shutdown();
            }
        }
        try {
            this.phobia$renderProgressBar(context);
        }
        catch (Throwable ignored) {
            this.phobia$renderFallbackProgressBar(context);
        }
    }

    private void phobia$renderProgressBar(class_332 context) {
        float screenWidth = ki.getFixedScaledWidth();
        float screenHeight = ki.getFixedScaledHeight();
        float width = Math.max(135.0f, Math.min(180.0f, screenWidth * 0.36f));
        float height = 3.5f;
        float x2 = (screenWidth - width) * 0.5f;
        float y2 = screenHeight * 0.58f;
        String title = "PHOBIA";
        float titleSize = 23.0f;
        boolean fontsReady = kq.hasFonts();
        if (fontsReady && kv.HAMBURG_REGULAR != null) {
            float titleX = x2 + width * 0.5f - kq.width(kv.HAMBURG_REGULAR, title, titleSize) * 0.5f;
            float titleY = y2 - 38.0f;
            kq.text(context, kv.HAMBURG_REGULAR, title, titleX, titleY, titleSize, nd.rgba(176, 176, 180, 255), false);
        } else {
            int titleY = Math.round(y2 - 37.0f);
            context.method_25300(this.field_18217.field_1772, title, Math.round(screenWidth * 0.5f), titleY, nd.rgba(176, 176, 180, 255));
        }
        float filledWidth = width * class_3532.method_15363((float)this.field_17770, (float)0.0f, (float)1.0f);
        if (filledWidth > 0.35f) {
            ki.rect(context, x2 - 4.0f, y2 - 4.0f, filledWidth + 8.0f, height + 8.0f, 5.75f, nd.rgba(255, 255, 255, 7), false);
            ki.rect(context, x2 - 2.5f, y2 - 2.5f, filledWidth + 5.0f, height + 5.0f, 4.25f, nd.rgba(255, 255, 255, 12), false);
            ki.rect(context, x2 - 1.25f, y2 - 1.25f, filledWidth + 2.5f, height + 2.5f, 3.0f, nd.rgba(255, 255, 255, 20), false);
        }
        ki.rect(context, x2, y2, width, height, 1.75f, nd.rgba(255, 255, 255, 32), false);
        if (filledWidth > 0.35f) {
            ki.rect(context, x2, y2, filledWidth, height, Math.min(1.75f, filledWidth * 0.5f), nd.rgba(245, 245, 248, 255), false);
        }
    }

    private void phobia$renderFallbackProgressBar(class_332 context) {
        int screenWidth = context.method_51421();
        int screenHeight = context.method_51443();
        int width = Math.max(135, Math.min(180, Math.round((float)screenWidth * 0.36f)));
        int x2 = (screenWidth - width) / 2;
        int y2 = Math.round((float)screenHeight * 0.58f);
        int filled = Math.round((float)width * class_3532.method_15363((float)this.field_17770, (float)0.0f, (float)1.0f));
        context.method_25294(x2, y2, x2 + width, y2 + 3, 0x2AFFFFFF);
        if (filled > 0) {
            context.method_25294(x2, y2, x2 + filled, y2 + 3, -657928);
        }
    }
}
