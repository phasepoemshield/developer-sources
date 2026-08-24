/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.Arm
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RotationAxis
 *  org.joml.Quaternionfc
 */
package oxxxde;

import kotakbaz.rain.event.events.HandSwingEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2={"Loxxxde/\u062b\u0650;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0631\u0623;", "event", "", "onHandSwing", "(Lkotakbaz/rain/event/events/HandSwingEvent;)V", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_1306;", "arm", "applyEquipOffset", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;)V", "", "MODE_1", "I", "MODE_2", "MODE_3", "MODE_4", "MODE_5", "Loxxxde/\u0638\u064a;", "modeSetting", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "strength", "Loxxxde/\u0637\u064f;", "rain-visuals"})
public final class \u062b\u0650
extends Module {
    private static final int MODE_4 = 3;
    @NotNull
    private static final ModeSetting modeSetting;
    private static final int MODE_5 = 4;
    @NotNull
    public static final \u062b\u0650 INSTANCE;
    @NotNull
    private static final SliderSetting strength;
    private static final int MODE_2 = 1;
    private static final int MODE_3 = 2;
    private static final int MODE_1 = 0;

    @Commando
    public final void onHandSwing(@NotNull HandSwingEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null || (clientPlayerEntity = clientPlayerEntity.getMainArm()) == null) {
            return;
        }
        ClientPlayerEntity arm = clientPlayerEntity;
        if (event.getArm() != arm) {
            return;
        }
        MatrixStack matrices = event.getMatrices();
        float swingProgress = event.getSwingProgress();
        float g = (float)Math.sin((double)MathHelper.sqrt((float)swingProgress) * Math.PI);
        float anim = (float)Math.sin((double)swingProgress * 1.5707963267948966 * 2.0);
        float side = arm == Arm.LEFT ? -1.0f : 1.0f;
        this.applyEquipOffset(matrices, (Arm)arm);
        switch (modeSetting.getSelectedIndex()) {
            case 0: {
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(side * (45.0f + anim * -20.0f)));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(side * g * -20.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(g * -80.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(side * -45.0f));
                break;
            }
            case 1: {
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(50.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(side * -60.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(side * (110.0f + ((Number)strength.getValue()).floatValue() * g)));
                break;
            }
            case 2: {
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(50.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(side * (-30.0f * (1.0f - g) - 30.0f + (((Number)strength.getValue()).floatValue() - 20.0f) * g)));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(side * 110.0f));
                break;
            }
            case 3: {
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(side * 90.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(side * -30.0f));
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-90.0f - ((Number)strength.getValue()).floatValue() * anim + 10.0f));
                break;
            }
            case 4: {
                float rotation = swingProgress * -360.0f;
                matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(rotation));
            }
        }
        event.setCancel(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean strength$lambda$0() {
        if (modeSetting.getSelectedIndex() == 0) return false;
        if (modeSetting.getSelectedIndex() == 4) return false;
        return true;
    }

    private final void applyEquipOffset(MatrixStack matrices, Arm arm) {
        double side = arm == Arm.RIGHT ? 1.0 : -1.0;
        matrices.translate(side * 0.56, -0.52, -0.72);
    }

    private \u062b\u0650() {
        super("SwingAnimation", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0443\u0434\u0430\u0440\u0430");
    }

    static {
        INSTANCE = new \u062b\u0650();
        String[] stringArray = new String[5];
        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";
        stringArray[3] = "4";
        stringArray[4] = "5";
        modeSetting = Module.mode$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0430\u0446\u0438\u044f", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        strength = Module.slider$default(INSTANCE, "\u0421\u0438\u043b\u0430", 20.0f, 20.0f, 75.0f, 0.1f, null, 32, null).setVisible(\u062b\u0650::strength$lambda$0);
    }
}

