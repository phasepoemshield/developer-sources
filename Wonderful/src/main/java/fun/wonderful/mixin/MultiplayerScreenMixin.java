package fun.wonderful.mixin;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MultiplayerScreen.class}, priority=900)
public abstract class MultiplayerScreenMixin
extends Screen {
    @Unique
    private static final String WONDERFUL_VFP_BUTTON_TEXT = "ViaFabricPlus";
    @Unique
    private static final String WONDERFUL_VFP_PROTOCOL_SCREEN = "com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen";

    protected MultiplayerScreenMixin(Text title) {
        super(title);
    }

    @Inject(method={"init"}, at={@At(value="TAIL")})
    private void wonderful$moveViaFabricPlusButton(CallbackInfo ci) {
        this.wonderful$organizeViaFabricPlusButton();
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void wonderful$keepViaFabricPlusButtonInPlace(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.wonderful$organizeViaFabricPlusButton();
    }

    @Unique
    private void wonderful$organizeViaFabricPlusButton() {
        if (!MultiplayerScreenMixin.wonderful$isViaFabricPlusLoaded()) {
            return;
        }
        ArrayList<ButtonWidget> topRow = new ArrayList<ButtonWidget>();
        ArrayList<ButtonWidget> duplicateViaButtons = new ArrayList<ButtonWidget>();
        ButtonWidget viaButton = null;
        for (Element class_3642 : this.children()) {
            if (!(class_3642 instanceof ButtonWidget)) continue;
            ButtonWidget button2 = (ButtonWidget)class_3642;
            if (WONDERFUL_VFP_BUTTON_TEXT.equals(button2.getMessage().getString())) {
                if (viaButton == null) {
                    viaButton = button2;
                    continue;
                }
                duplicateViaButtons.add(button2);
                continue;
            }
            if (button2.getWidth() < 90) continue;
            topRow.add(button2);
        }
        for (Element class_3643 : duplicateViaButtons) {
            this.remove(class_3643);
        }
        if (viaButton == null) {
            viaButton = this.addDrawableChild(ButtonWidget.builder(Text.literal(WONDERFUL_VFP_BUTTON_TEXT), button -> MultiplayerScreenMixin.wonderful$openViaFabricPlusScreen()).dimensions(0, 0, 98, 20).build());
        }
        if (topRow.size() >= 3) {
            this.wonderful$placeInMainButtonRow(topRow, viaButton);
        } else {
            this.wonderful$placeFallback(viaButton);
        }
    }

    @Unique
    private void wonderful$placeInMainButtonRow(List<ButtonWidget> topRow, ButtonWidget viaButton) {
        topRow.sort((first, second) -> Integer.compare(first.getX(), second.getX()));
        int gap = 4;
        int buttonWidth = Math.min(98, Math.max(68, (this.width - 24 - gap * 3) / 4));
        int totalWidth = buttonWidth * 4 + gap * 3;
        int x2 = this.width / 2 - totalWidth / 2;
        int y2 = topRow.get(0).getY();
        int height = topRow.get(0).getHeight();
        for (int i2 = 0; i2 < 3; ++i2) {
            topRow.get(i2).setDimensionsAndPosition(buttonWidth, height, x2 + i2 * (buttonWidth + gap), y2);
        }
        viaButton.setDimensionsAndPosition(buttonWidth, height, x2 + 3 * (buttonWidth + gap), y2);
    }

    @Unique
    private void wonderful$placeFallback(ButtonWidget viaButton) {
        int buttonWidth = Math.min(98, Math.max(68, this.width - 24));
        viaButton.setDimensionsAndPosition(buttonWidth, 20, this.width / 2 - buttonWidth / 2, this.height - 88);
    }

    @Unique
    private static boolean wonderful$isViaFabricPlusLoaded() {
        try {
            Class.forName(WONDERFUL_VFP_PROTOCOL_SCREEN, false, MultiplayerScreenMixin.class.getClassLoader());
            return true;
        }
        catch (Throwable ignored) {
            return false;
        }
    }

    @Unique
    private static void wonderful$openViaFabricPlusScreen() {
        try {
            Object screen = MultiplayerScreenMixin.wonderful$getStaticField(WONDERFUL_VFP_PROTOCOL_SCREEN, "INSTANCE");
            if (screen == null) {
                return;
            }
            Method open = screen.getClass().getMethod("open", Screen.class);
            open.invoke(screen, MinecraftClient.getInstance().currentScreen);
        }
        catch (Throwable throwable) {
            
        }
    }

    @Unique
    private static Object wonderful$getStaticField(String className, String fieldName) throws Exception {
        Class<?> clazz = Class.forName(className);
        Field field = clazz.getField(fieldName);
        return field.get(null);
    }
}