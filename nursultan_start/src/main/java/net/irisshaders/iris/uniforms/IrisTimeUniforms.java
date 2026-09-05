/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  org.joml.Vector2i
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.uniforms;

import java.time.LocalDateTime;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import org.joml.Vector2i;
import org.joml.Vector3i;

public class IrisTimeUniforms {
    private static LocalDateTime dateTime;

    public static void updateTime() {
        dateTime = LocalDateTime.now();
    }

    public static void addTimeUniforms(UniformHolder uniformHolder) {
        Vector3i vector3i = new Vector3i();
        Vector3i vector3i2 = new Vector3i();
        Vector2i vector2i = new Vector2i();
        uniformHolder.uniform3i(UniformUpdateFrequency.PER_TICK, "currentDate", () -> vector3i.set(dateTime.getYear(), dateTime.getMonthValue(), dateTime.getDayOfMonth()));
        uniformHolder.uniform3i(UniformUpdateFrequency.PER_TICK, "currentTime", () -> vector3i2.set(dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond()));
        uniformHolder.uniform2i(UniformUpdateFrequency.PER_TICK, "currentYearTime", () -> vector2i.set((dateTime.getDayOfYear() - 1) * 86400 + dateTime.getHour() * 3600 + dateTime.getMinute() * 60 + dateTime.getSecond(), dateTime.toLocalDate().lengthOfYear() * 86400 - ((dateTime.getDayOfYear() - 1) * 86400 + dateTime.getHour() * 3600 + dateTime.getMinute() * 60 + dateTime.getSecond())));
    }
}

