package fun.nexisdlc.mixins.render;

import net.minecraft.client.gui.screen.pack.PackScreen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.io.File;
import java.nio.file.Path;

@Mixin(PackScreen.class)
public abstract class PackScreenMixin {
    @Unique
    private static final Text OPEN_FOLDER = Text.translatable("pack.openFolder");
    @Unique
    private static final Text FOLDER_INFO = Text.translatable("pack.folderInfo");

    @Shadow
    private Path file;

    @Redirect(
            method = "init",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/widget/ButtonWidget$Builder;build()Lnet/minecraft/client/gui/widget/ButtonWidget;"
            )
    )
    private ButtonWidget nexis$redirectOpenFolderButton(ButtonWidget.Builder builder) {
        if (builder.message.equals(OPEN_FOLDER)) {
            return ButtonWidget.builder(OPEN_FOLDER, button -> {
                File folderToOpen = file.toFile();
                if (!folderToOpen.exists()) {
                    return;
                }
                Util.getOperatingSystem().open(folderToOpen);
            }).tooltip(Tooltip.of(FOLDER_INFO)).build();
        }
        return builder.build();
    }
}
