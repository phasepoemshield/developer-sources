/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  net.minecraft.class_342
 *  net.minecraft.class_4717
 *  net.minecraft.class_4717$class_464
 *  net.minecraft.class_5481
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_342;
import net.minecraft.class_4717;
import net.minecraft.class_5481;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.de;
import ruhack.phobia.fl;

@Mixin(value={class_4717.class})
public abstract class h {
    @Shadow
    @Final
    class_342 field_21599;
    @Shadow
    @Final
    private List<class_5481> field_21607;
    @Shadow
    private ParseResults<?> field_21610;
    @Shadow
    private CompletableFuture<Suggestions> field_21611;
    @Shadow
    private class_4717.class_464 field_21612;
    @Shadow
    boolean field_21614;

    @Shadow
    public abstract void method_23920(boolean var1);

    @Inject(method={"method_23934"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRefresh(CallbackInfo ci2) {
        String text = this.field_21599.method_1882();
        int cursor = this.field_21599.method_1881();
        String prefix = text.substring(0, Math.min(text.length(), cursor));
        if (fl.isUnhooked() && (prefix.startsWith(".") || prefix.startsWith("#"))) {
            ci2.cancel();
            this.field_21610 = null;
            this.field_21599.method_1887(null);
            this.field_21612 = null;
            this.field_21607.clear();
            this.field_21611 = Suggestions.empty();
            return;
        }
        de event = new de(prefix);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
            return;
        }
        if (event.completions != null) {
            ci2.cancel();
            this.field_21610 = null;
            if (this.field_21614) {
                return;
            }
            this.field_21599.method_1887(null);
            this.field_21612 = null;
            this.field_21607.clear();
            if (event.completions.length == 0) {
                this.field_21611 = Suggestions.empty();
            } else {
                int lastSpace = prefix.lastIndexOf(32);
                StringRange range = StringRange.between((int)(lastSpace + 1), (int)prefix.length());
                List suggestionList = Stream.of(event.completions).map(s2 -> new Suggestion(range, s2)).collect(Collectors.toList());
                Suggestions suggestions = new Suggestions(range, suggestionList);
                this.field_21611 = new CompletableFuture();
                this.field_21611.complete(suggestions);
            }
            this.method_23920(true);
        }
    }
}

