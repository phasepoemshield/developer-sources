/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class01256 {
    private final List<Pattern> N;
    private final List<Pattern> y;
    private final List<Pattern> L;

    class01256(List<Pattern> list, List<Pattern> list2, List<Pattern> list3) {
        this.N = list;
        this.y = list2;
        this.L = list3;
    }

    private static String N(List<Pattern> list, String string) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator<Pattern> iterator = list.iterator();
        while (iterator.hasNext()) {
            Matcher matcher = iterator.next().matcher(string);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
        }
        return String.join((CharSequence)", ", arrayList);
    }

    ImmutableMap<String, String> N() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        GpuDevice gpuDevice = RenderSystem.getDevice();
        if (gpuDevice.getBackendName().equals("OpenGL")) {
            String string;
            String string2;
            String string3 = class01256.N(this.N, gpuDevice.getRenderer());
            if (!string3.isEmpty()) {
                builder.put((Object)"renderer", (Object)string3);
            }
            if (!(string2 = class01256.N(this.y, gpuDevice.getVersion())).isEmpty()) {
                builder.put((Object)"version", (Object)string2);
            }
            if (!(string = class01256.N(this.L, gpuDevice.getVendor())).isEmpty()) {
                builder.put((Object)"vendor", (Object)string);
            }
        }
        return builder.build();
    }
}

