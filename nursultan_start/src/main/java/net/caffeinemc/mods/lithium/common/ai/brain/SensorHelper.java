/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.BrainAccessor
 *  net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.SensorAccessor
 */
package net.caffeinemc.mods.lithium.common.ai.brain;

import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.BrainAccessor;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.SensorAccessor;

public class SensorHelper {
    public static <T extends class07438, U extends class05355<T>> void enableSensor(T t, class05340<U> class053402, boolean bl) {
        if (t.method_73183().method_8608()) {
            return;
        }
        class01289 class012892 = t.method_18868();
        class05355 class053552 = (class05355)((BrainAccessor)class012892).getSensors().get(class053402);
        if (class053552 instanceof SensorAccessor) {
            int n;
            SensorAccessor sensorAccessor = (SensorAccessor)class053552;
            long l = sensorAccessor.getLastSenseTime();
            if (l > (long)(n = sensorAccessor.getSenseInterval())) {
                l %= (long)n;
                if (bl) {
                    ((SensorAccessor)class053552).setLastSenseTime(0L);
                    class053552.y((class04782)t.method_73183(), t);
                }
            }
            sensorAccessor.setLastSenseTime(l);
        }
    }

    public static <T extends class07438, U extends class05355<T>> void enableSensor(T t, class05340<U> class053402) {
        SensorHelper.enableSensor(t, class053402, false);
    }

    public static void disableSensor(class07438 class074382, class05340<?> class053402) {
        if (class074382.method_73183().method_8608()) {
            return;
        }
        class01289 class012892 = class074382.method_18868();
        class05355 class053552 = (class05355)((BrainAccessor)class012892).getSensors().get(class053402);
        if (class053552 instanceof SensorAccessor) {
            SensorAccessor sensorAccessor = (SensorAccessor)class053552;
            long l = sensorAccessor.getLastSenseTime();
            int n = sensorAccessor.getSenseInterval();
            long l2 = Long.MAX_VALUE - Long.MAX_VALUE % (long)n;
            l2 -= (long)n;
            sensorAccessor.setLastSenseTime(l2 += l);
        }
    }
}

