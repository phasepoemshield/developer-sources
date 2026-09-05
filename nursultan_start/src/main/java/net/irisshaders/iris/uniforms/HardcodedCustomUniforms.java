/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00772
 *  minecraft.class00780
 *  minecraft.class00801
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07209
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  org.joml.Math
 */
package net.irisshaders.iris.uniforms;

import minecraft.class00737;
import minecraft.class00772;
import minecraft.class00780;
import minecraft.class00801;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.CameraUniforms$CameraPositionTracker;
import net.irisshaders.iris.uniforms.CelestialUniforms;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import net.irisshaders.iris.uniforms.WorldTimeUniforms;
import net.irisshaders.iris.uniforms.transforms.SmoothedFloat;
import org.joml.Math;

public class HardcodedCustomUniforms {
    private static final class06202 client = class06202.Nq();
    private static class03556<class00780> storedBiome;

    private static float getDay() {
        return Math.clamp((float)0.0f, (float)1.0f, (float)(5.4f - HardcodedCustomUniforms.getAdjTime()));
    }

    private static float getEyeSkyBrightness() {
        if (client.F() == null || (class03448)HardcodedCustomUniforms.client.T_3 == null) {
            return 0.0f;
        }
        class06889 class068892 = client.F().method_73189();
        class06889 class068893 = new class06889(class068892.M, client.F().method_23320(), class068892.Z);
        class07209 class072092 = class07209.method_49638((class00737)class068893);
        int n = ((class03448)HardcodedCustomUniforms.client.T_3).method_8314(class00772.field_9284, class072092);
        return n * 16;
    }

    private static float getHyperSpeedStrength(SmoothedFloat smoothedFloat) {
        return (float)(1.0 - Math.exp((double)(-smoothedFloat.getAsFloat() * 0.003906f)));
    }

    public static void addHardcodedCustomUniforms(UniformHolder uniformHolder, FrameUpdateNotifier frameUpdateNotifier) {
        frameUpdateNotifier.addListener(() -> {
            storedBiome = (class03448)class06202.Nq().T_3 != null ? ((class03448)class06202.Nq().T_3).i(class06202.Nq().F().method_24515()) : null;
        });
        CameraUniforms$CameraPositionTracker cameraUniforms$CameraPositionTracker = new CameraUniforms$CameraPositionTracker(frameUpdateNotifier);
        SmoothedFloat smoothedFloat = new SmoothedFloat(6.0f, 12.0f, HardcodedCustomUniforms::getEyeInCave, frameUpdateNotifier);
        SmoothedFloat smoothedFloat2 = HardcodedCustomUniforms.rainStrengthS(frameUpdateNotifier, 15.0f, 15.0f);
        SmoothedFloat smoothedFloat3 = HardcodedCustomUniforms.rainStrengthS(frameUpdateNotifier, 10.0f, 11.0f);
        SmoothedFloat smoothedFloat4 = HardcodedCustomUniforms.rainStrengthS(frameUpdateNotifier, 70.0f, 1.0f);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "timeAngle", HardcodedCustomUniforms::getTimeAngle);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "timeBrightness", HardcodedCustomUniforms::getTimeBrightness);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "moonBrightness", HardcodedCustomUniforms::getMoonBrightness);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "shadowFade", HardcodedCustomUniforms::getShadowFade);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "rainStrengthS", (FloatSupplier)smoothedFloat2);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "rainStrengthShiningStars", (FloatSupplier)smoothedFloat3);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "rainStrengthS2", (FloatSupplier)smoothedFloat4);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "blindFactor", HardcodedCustomUniforms::getBlindFactor);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "isDry", (FloatSupplier)new SmoothedFloat(20.0f, 10.0f, () -> HardcodedCustomUniforms.getRawPrecipitation() == 0.0f ? 1.0f : 0.0f, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "isRainy", (FloatSupplier)new SmoothedFloat(20.0f, 10.0f, () -> HardcodedCustomUniforms.getRawPrecipitation() == 1.0f ? 1.0f : 0.0f, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "isSnowy", (FloatSupplier)new SmoothedFloat(20.0f, 10.0f, () -> HardcodedCustomUniforms.getRawPrecipitation() == 2.0f ? 1.0f : 0.0f, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "isEyeInCave", () -> CommonUniforms.isEyeInWater() == 0 ? smoothedFloat.getAsFloat() : 0.0f);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "velocity", () -> HardcodedCustomUniforms.getVelocity(cameraUniforms$CameraPositionTracker));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "starter", (FloatSupplier)HardcodedCustomUniforms.getStarter(cameraUniforms$CameraPositionTracker, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "frameTimeSmooth", (FloatSupplier)new SmoothedFloat(5.0f, 5.0f, SystemTimeUniforms.TIMER::getLastFrameTime, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "eyeBrightnessM", (FloatSupplier)new SmoothedFloat(5.0f, 5.0f, HardcodedCustomUniforms::getEyeBrightnessM, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "rainFactor", (FloatSupplier)smoothedFloat2);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "BiomeTemp", () -> {
            if (storedBiome == null) {
                return 0.0f;
            }
            return ((class00780)storedBiome.N()).i();
        });
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "day", HardcodedCustomUniforms::getDay);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "night", HardcodedCustomUniforms::getNight);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "dawnDusk", HardcodedCustomUniforms::getDawnDusk);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "shdFade", HardcodedCustomUniforms::getShdFade);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "isPrecipitationRain", (FloatSupplier)new SmoothedFloat(6.0f, 6.0f, () -> HardcodedCustomUniforms.getRawPrecipitation() == 1.0f && cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().y < 96.0 ? 1.0f : 0.0f, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "touchmybody", (FloatSupplier)new SmoothedFloat(0.0f, 0.1f, HardcodedCustomUniforms::getHurtFactor, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "sneakSmooth", (FloatSupplier)new SmoothedFloat(2.0f, 0.9f, HardcodedCustomUniforms::getSneakFactor, frameUpdateNotifier));
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "burningSmooth", (FloatSupplier)new SmoothedFloat(1.0f, 2.0f, HardcodedCustomUniforms::getBurnFactor, frameUpdateNotifier));
        SmoothedFloat smoothedFloat5 = new SmoothedFloat(1.0f, 1.5f, () -> HardcodedCustomUniforms.getVelocity(cameraUniforms$CameraPositionTracker) / SystemTimeUniforms.TIMER.getLastFrameTime(), frameUpdateNotifier);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "effectStrength", () -> HardcodedCustomUniforms.getHyperSpeedStrength(smoothedFloat5));
    }

    private static float getRawPrecipitation() {
        if (storedBiome == null) {
            return 0.0f;
        }
        class00801 class008012 = ((class00780)storedBiome.N()).N(class06202.Nq().F().method_24515(), ((class03448)class06202.Nq().T_3).method_8615());
        return switch (class008012) {
            case class00801.field_9382 -> 1.0f;
            case class00801.field_9383 -> 2.0f;
            default -> 0.0f;
        };
    }

    private static float getEyeBrightnessM() {
        return HardcodedCustomUniforms.getEyeSkyBrightness() / 240.0f;
    }

    private static float getHurtFactor() {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        return class044532.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0 || class044532.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0 ? 0.4f : 0.0f;
    }

    private static float getVelocity(CameraUniforms$CameraPositionTracker cameraUniforms$CameraPositionTracker) {
        float f = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().x - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().x);
        float f2 = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().y - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().y);
        float f3 = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().z - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().z);
        return Math.sqrt((float)(f * f + f2 * f2 + f3 * f3));
    }

    private static float getMoonBrightness() {
        return (float)java.lang.Math.max(java.lang.Math.sin((double)HardcodedCustomUniforms.getTimeAngle() * java.lang.Math.PI * -2.0), 0.0);
    }

    private static float getBlindFactor() {
        float f = (float)Math.clamp((double)0.0, (double)1.0, (double)((double)CommonUniforms.getBlindness() * 2.0 - 1.0));
        return f * f;
    }

    private static int getWorldDayTime() {
        class03448 class034482 = (class03448)class06202.Nq().T_3;
        long l = class034482.method_8532();
        long l2 = class034482.method_8597().u() ? 0L : l % 24000L;
        return (int)l2;
    }

    private static float getTimeBrightness() {
        return (float)java.lang.Math.max(java.lang.Math.sin((double)HardcodedCustomUniforms.getTimeAngle() * java.lang.Math.PI * 2.0), 0.0);
    }

    private static float getSneakFactor() {
        return ((class04453)class06202.Nq().T_4).method_18276() ? 1.0f : 0.0f;
    }

    private static float getShadowFade() {
        return (float)Math.clamp((double)0.0, (double)1.0, (double)(1.0 - (java.lang.Math.abs(java.lang.Math.abs((double)CelestialUniforms.getSunAngle(CelestialUniforms.isDay()) - 0.5) - 0.25) - 0.23) * 100.0));
    }

    private static float getDawnDusk() {
        return 1.0f - HardcodedCustomUniforms.getDay() - HardcodedCustomUniforms.getNight();
    }

    private static float getEyeInCave() {
        if (client.F().method_23320() < 5.0) {
            return 1.0f - HardcodedCustomUniforms.getEyeSkyBrightness() / 240.0f;
        }
        return 0.0f;
    }

    private static float getBurnFactor() {
        return ((class04453)class06202.Nq().T_4).method_5809() ? 1.0f : 0.0f;
    }

    private static float getTimeAngle() {
        return (float)HardcodedCustomUniforms.getWorldDayTime() / 24000.0f;
    }

    private static SmoothedFloat rainStrengthS(FrameUpdateNotifier frameUpdateNotifier, float f, float f2) {
        return new SmoothedFloat(f, f2, CommonUniforms::getRainStrength, frameUpdateNotifier);
    }

    private static float frac(float f) {
        return java.lang.Math.abs(f % 1.0f);
    }

    private static float getShdFade() {
        return (float)Math.clamp((double)0.0, (double)1.0, (double)(1.0 - (Math.abs((double)(Math.abs((double)((double)CelestialUniforms.getSunAngle(true) - 0.5)) - 0.25)) - 0.225) * 40.0));
    }

    private static float getNight() {
        return Math.clamp((float)0.0f, (float)1.0f, (float)(HardcodedCustomUniforms.getAdjTime() - 6.0f));
    }

    private static float getMoving(CameraUniforms$CameraPositionTracker cameraUniforms$CameraPositionTracker) {
        float f = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().x - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().x);
        float f2 = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().y - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().y);
        float f3 = (float)(cameraUniforms$CameraPositionTracker.getCurrentCameraPosition().z - cameraUniforms$CameraPositionTracker.getPreviousCameraPosition().z);
        float f4 = Math.abs((float)f) + Math.abs((float)f2) + Math.abs((float)f3);
        return f4 > 0.0f && f4 < 1.0f ? 1.0f : 0.0f;
    }

    private static float getAdjTime() {
        return Math.abs((float)(((float)WorldTimeUniforms.getWorldDayTime() / 1000.0f + 6.0f) % 24.0f - 12.0f));
    }

    private static SmoothedFloat getStarter(CameraUniforms$CameraPositionTracker cameraUniforms$CameraPositionTracker, FrameUpdateNotifier frameUpdateNotifier) {
        return new SmoothedFloat(20.0f, 20.0f, new SmoothedFloat(0.0f, 3.1536E7f, () -> HardcodedCustomUniforms.getMoving(cameraUniforms$CameraPositionTracker), frameUpdateNotifier), frameUpdateNotifier);
    }
}

