package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.render.EventHeldItemRenderer;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RotationAxis;

@FunctionAdd(name = "ViewModel", alias = "View Model", category = Category.Render, description = "Позволяет менять координаты и размер рук")
public class ViewModel extends Function {
    // Смещение
    public SliderSetting mainHandX = new SliderSetting("Основная рука X", 0f, -3f, 3f, 0.1f);
    public SliderSetting mainHandY = new SliderSetting("Основная рука Y", 0f, -3f, 3f, 0.1f);
    public SliderSetting mainHandZ = new SliderSetting("Основная рука Z", 0f, -3f, 3f, 0.1f);
    public SliderSetting offHandX = new SliderSetting("Вторая рука X", 0f, -3f, 3f, 0.1f);
    public SliderSetting offHandY = new SliderSetting("Вторая рука Y", 0f, -3f, 3f, 0.1f);
    public SliderSetting offHandZ = new SliderSetting("Вторая рука Z", 0f, -3f, 3f, 0.1f);

    // поворот
    public SliderSetting rotateX = new SliderSetting("Поворот X", 0f, -180f, 180f, 1f);
    public SliderSetting rotateY = new SliderSetting("Поворот Y", 0f, -180f, 180f, 1f);
    public SliderSetting rotateZ = new SliderSetting("Поворот Z", 0f, -180f, 180f, 1f);

    // Масштаб
    public SliderSetting scaleMain = new SliderSetting("Размер основной руки", 1f, 0.1f, 1.5f, 0.1f);
    public SliderSetting scaleOff = new SliderSetting("Размер второй руки", 1f, 0.1f, 1.5f, 0.1f);

    // Положение еды
    public SliderSetting eatX = new SliderSetting("Еда X", 1f, -1f, 2f, 0.1f);
    public SliderSetting eatY = new SliderSetting("Еда Y", 1f, -1f, 2f, 0.1f);

    public ViewModel() {
        addSettings(
                mainHandX, mainHandY, mainHandZ,
                offHandX, offHandY, offHandZ,
                rotateX, rotateY, rotateZ,
                scaleMain, scaleOff,
                eatX, eatY);
    }

    @EventHandler
    public void onRenderHand(EventHeldItemRenderer event) {
        if (event.getHand() == Hand.MAIN_HAND) {
            event.getStack().translate(mainHandX.get(), mainHandY.get(), mainHandZ.get());
            event.getStack().scale(scaleMain.get(), scaleMain.get(), scaleMain.get());

            event.getStack().multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotateX.get()));
            event.getStack().multiply(RotationAxis.POSITIVE_Y.rotationDegrees(rotateY.get()));
            event.getStack().multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotateZ.get()));
        } else {
            event.getStack().translate(offHandX.get(), offHandY.get(), offHandZ.get());
            event.getStack().scale(scaleOff.get(), scaleOff.get(), scaleOff.get());
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}

