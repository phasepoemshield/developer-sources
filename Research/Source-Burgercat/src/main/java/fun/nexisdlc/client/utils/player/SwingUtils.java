package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.render.SwingAnimations;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class SwingUtils {

    public static void applyEquipOffset(@NotNull MatrixStack matrices, Arm arm, float equipProgress) {
        int i = arm == Arm.RIGHT ? 1 : -1;
        matrices.translate((float) i * 0.56F, -0.52F + equipProgress * -0.6F, -0.72F);
    }

    public static void applySwingOffset(@NotNull MatrixStack matrices, Arm arm, float swingProgress) {
        float powerFactor = MathHelper.clamp(NexisClient.getFunctionManager().getSwingAnimations().swingPower.get() / 10.0f, 0.4f, 2.0f);
        applySwingOffset(matrices, arm, swingProgress, powerFactor);
    }

    public static void applyVanillaSwingOffset(@NotNull MatrixStack matrices, Arm arm, float swingProgress) {
        applySwingOffset(matrices, arm, swingProgress, 1.0f);
    }

    private static void applySwingOffset(@NotNull MatrixStack matrices, Arm arm, float swingProgress, float powerFactor) {
        int i = arm == Arm.RIGHT ? 1 : -1;
        float f = MathHelper.sin(swingProgress * swingProgress * 3.1415927F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float) i * (30.0F + f * -15.0F * powerFactor)));
        float g = MathHelper.sin(MathHelper.sqrt(swingProgress) * 3.1415927F);
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float) i * g * -10.0F * powerFactor));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(g * -40.0F * powerFactor));
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float) i * -30.0F));
    }

    public static void applyEatOrDrinkTransformationCustom(MatrixStack matrices, float tickDelta, Arm arm, float equipProgress) {
        float f = (float) mc.player.getItemUseTimeLeft() - tickDelta + 1.0F;
        float g = f / (float) mc.player.getActiveItem().getMaxUseTime(mc.player);
        float h;
        if (g < 0.8F) {
            h = MathHelper.abs(MathHelper.cos(f / 4.0F * 3.1415927F) * 0.005F);
            matrices.translate(0.0F, h, 0.0F);
        }
        h = 1.0F - (float) Math.pow(g, 27.0);
        int i = arm == Arm.RIGHT ? 1 : -1;

        matrices.translate(h * 0.6F * (float) i * NexisClient.getFunctionManager()
                .getViewModel().eatX.get(), h * -0.5F * NexisClient.getFunctionManager()
                .getViewModel().eatY.get(), h * 0.0F);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float) i * h * 90.0F));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(h * 10.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float) i * h * 30.0F));
    }

    public static boolean isSwingAnimEnabled() {
        return NexisClient.getFunctionManager().getSwingAnimations().isState();
    }

    public static boolean hasCombatTargetForSwing() {
        return AuraModule.target != null;
    }

    public static SwingAnimations getSwingAnimations() {
        return NexisClient.getFunctionManager().getSwingAnimations();
    }
}
