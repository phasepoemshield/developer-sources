/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import kotakbaz.rain.command.Command;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.network.ClientCommandSource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ChatInputSuggestor.class})
public abstract class MixinChatInputSuggestor {
    @Shadow
    @Final
    TextFieldWidget field_21599;
    @Shadow
    private ParseResults<?> field_21610;
    @Shadow
    private CompletableFuture<Suggestions> field_21611;

    @Shadow
    public abstract void method_23920(boolean var1);

    @Inject(method={"method_23934"}, at={@At(value="INVOKE", target="Lcom/mojang/brigadier/StringReader;canRead()Z", remap=false)}, cancellable=true)
    private void onRefresh(CallbackInfo ci, @Local StringReader reader) {
        String prefix = Command.INSTANCE.getPrefix();
        if (!reader.canRead(prefix.length()) || !reader.getString().startsWith(prefix, reader.getCursor())) {
            return;
        }
        reader.setCursor(reader.getCursor() + prefix.length());
        ParseResults<ClientCommandSource> parseResults = Command.INSTANCE.parse(reader);
        if (parseResults == null) {
            return;
        }
        this.field_21610 = parseResults;
        int cursor = this.field_21599.getCursor();
        if (cursor >= prefix.length()) {
            this.field_21611 = Command.INSTANCE.suggest(this.field_21610, cursor);
            this.field_21611.thenRun(() -> {
                if (this.field_21611.isDone()) {
                    this.method_23920(false);
                }
            });
        }
        ci.cancel();
    }
}

