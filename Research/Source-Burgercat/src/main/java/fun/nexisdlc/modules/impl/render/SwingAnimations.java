package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.SwingUtils;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

import static fun.nexisdlc.client.utils.player.SwingUtils.*;

@FunctionAdd(name = "SwingAnimations", alias = "Swing Animations", category = Category.Render, description = "Позволяет вам менять анимацию, силу ваших рук")
public class SwingAnimations extends Function {
    public ModeSetting mode = new ModeSetting("Анимация", "Обычная (Первая)", "Обычная (Первая)", "Обычная (Вторая)", "Обычная (Третья)", "К себе", "Перед собой", "Тап");
    public SliderSetting swingPower = new SliderSetting("Сила", 4f, 4f, 30f, 0.1f);
    public SliderSetting swingSpeed = new SliderSetting("Скорость", 5.0f, 1f, 15.0f, 0.1f);
    public SliderSetting rotationX = new SliderSetting("Поворот X", 0f, -180f, 180f, 0.1f);
    public SliderSetting rotationZ = new SliderSetting("Поворот Z", 0f, -180f, 180f, 0.1f);
    public BooleanSetting onlyAura = new BooleanSetting("Только с аурой", false);
    public BooleanSetting smooth = new BooleanSetting("Плавная анимация", false);
    public BooleanSetting invert = new BooleanSetting("Инверсия", false);

    public SwingAnimations() {
        addSettings(mode, swingPower, swingSpeed, rotationX, rotationZ, onlyAura, smooth, invert);
    }

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        if (mc.world == null)
            return;
        if (SwingUtils.getSwingAnimations().onlyAura.get() &&
                !SwingUtils.hasCombatTargetForSwing())
            return;
    }

    public void renderSwordAnimation(MatrixStack matrices, float f, float swingProgress, float equipProgress, Arm arm, boolean mainHand, Runnable viewModelTransform) {
        if (!mainHand) {
            applyEquipOffset(matrices, arm, equipProgress);
            viewModelTransform.run();
            applySwingOffset(matrices, arm, swingProgress);
            return;
        }

        int side = arm == Arm.RIGHT ? 1 : -1;
        float smoothProgress = smooth.get()
                ? (swingProgress > 0 ? MathHelper.lerp(swingProgress, 0.0f, swingProgress) : swingProgress)
                : swingProgress;

        switch (mode.get()) {
            case "Обычная (Первая)" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-g * (swingPower.get() * 2.6f)));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -g * (swingPower.get() * 0.18f)));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * g * (swingPower.get() * 2.8f)));

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }

            case "Обычная (Вторая)" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-g * (swingPower.get() * 2.6f)));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -g * (swingPower.get() * 0.18f)));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * g * (swingPower.get() * 1.6f)));

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }

            case "Обычная (Третья)" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-g * (swingPower.get() * 2.6f)));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -g * (swingPower.get() * 0.18f)));

                float zProgress = MathHelper.clamp((smoothProgress - 0.1f) / 1, 0.0f, 1.0f);
                zProgress = zProgress * zProgress * (3.0f - 2.0f * zProgress);
                float gZ = MathHelper.sin(MathHelper.sqrt(zProgress) * 3.1415927F);
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * gZ * (swingPower.get() * 1.2f)));

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }

            case "К себе" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50f));
                matrices.multiply(
                        RotationAxis.POSITIVE_Y.rotationDegrees(side * (-35f * (1f - (g * (swingPower.get() * 0.06f))) - 30f)));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * 110f));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }
            case "Тап" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();

                float forward = g * 0.2f;
                matrices.translate(0, 0, -forward);

                float downTilt = g * -swingPower.get() * 0.5f;
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50f + downTilt));

                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -60f));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * (110f + swingPower.get() * 2.2f * g)));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }
            case "Перед собой" -> {
                float g = MathHelper.sin(MathHelper.sqrt(smoothProgress) * 3.1415927F);
                g = invert.get() ? -g : g;
                applyEquipOffset(matrices, arm, 0);
                viewModelTransform.run();

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(68f));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * (-30f + (g * swingPower.get() * 2.5f))));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * 110f));

                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotationX.get()));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationZ.get()));
            }
        }
    }
}

