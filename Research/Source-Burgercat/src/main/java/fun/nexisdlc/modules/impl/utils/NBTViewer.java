package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;

@FunctionAdd(name = "NBTViewer", alias = "NBT Viewer", category = Category.Utilities, description = "Копирует компоненты предмета из основной руки")
public class NBTViewer extends Function {
    private final BindSetting copyBind = new BindSetting("Копировать NBT", -1);

    public NBTViewer() {
        addSettings(copyBind);
    }

    @EventHandler
    public void onKey(EventKey event) {
        if (!event.isKeyDown(copyBind.get()) || nullCheck()) return;

        ItemStack stack = mc.player.getMainHandStack();
        if (stack.isEmpty()) {
            sendMessage("В основной руке нет предмета.");
            return;
        }

        MinecraftClient.getInstance().keyboard.setClipboard(stack.getComponents().toString());
        sendMessage("NBT скопирован: " + stack.getName().getString());
    }
}
