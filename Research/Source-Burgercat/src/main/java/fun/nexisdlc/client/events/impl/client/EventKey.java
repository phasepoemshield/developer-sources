package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@AllArgsConstructor
@Getter
@Setter
public class EventKey extends Event {
    public static final int MOUSE_BUTTON_OFFSET = 1000;

    private int key;
    private int action;
    private InputUtil.Type type;

    public boolean isKeyDown(int bind) {
        if (mc.currentScreen != null) return false;
        if (bind <= 0) return false;
        return getConvertedKey() == bind || key == bind;
    }

    public int getConvertedKey() {
        if (type == InputUtil.Type.MOUSE && key >= GLFW.GLFW_MOUSE_BUTTON_LEFT && key <= GLFW.GLFW_MOUSE_BUTTON_LAST) {
            return MOUSE_BUTTON_OFFSET + key;
        }
        return key;
    }
}
