package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.implement.EventChunkReload;
import fun.wonderful.api.utils.client.ClientSoundPlayer;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.client.modules.impl.misc.AutoJoin;
import fun.wonderful.client.ui.MenuPanel;
import net.minecraft.client.Keyboard;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Keyboard.class})
public class KeyboardMixin
implements QClient {
    @Inject(method={"onKey"}, at={@At(value="HEAD")})
    public void onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        if (action == 1 && key == 344 && this.wonderful$toggleClickGui()) {
            return;
        }
        if (KeyboardMixin.mc.currentScreen == null) {
            KeyBoardUtils.call(key, action);
        }
    }

    @Unique
    private boolean wonderful$toggleClickGui() {
        Screen class_4372 = KeyboardMixin.mc.currentScreen;
        if (class_4372 instanceof MenuPanel) {
            MenuPanel panel = (MenuPanel)class_4372;
            panel.close();
            return true;
        }
        if (KeyboardMixin.mc.currentScreen == null || AutoJoin.INSTANCE.isJoining()) {
            ClientSoundPlayer.playSound("opengui.wav", 0.6, 1.0f);
            mc.setScreen((Screen)new MenuPanel());
            return true;
        }
        return false;
    }

    @Inject(method={"processF3"}, at={@At(value="RETURN")})
    private void processF3(int key, CallbackInfoReturnable<Boolean> cir) {
        if (key == 65 && ((Boolean)cir.getReturnValue()).booleanValue()) {
            new EventChunkReload().call();
        }
    }
}