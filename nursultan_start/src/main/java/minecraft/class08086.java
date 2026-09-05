/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10883
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00056
 *  minecraft.class00528
 *  minecraft.class00555
 *  minecraft.class00572
 *  minecraft.class01894
 *  minecraft.class02412
 *  minecraft.class02414
 *  minecraft.class02418
 *  minecraft.class02430
 *  minecraft.class02433
 *  minecraft.class02435
 *  minecraft.class02447
 *  minecraft.class02452
 *  minecraft.class02456
 *  minecraft.class02734
 *  minecraft.class02762
 *  minecraft.class08053
 *  minecraft.class08394
 *  minecraft.class08419
 *  minecraft.class08627
 *  minecraft.class08918
 */
package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00056;
import minecraft.class00528;
import minecraft.class00555;
import minecraft.class00572;
import minecraft.class01894;
import minecraft.class02412;
import minecraft.class02414;
import minecraft.class02418;
import minecraft.class02430;
import minecraft.class02433;
import minecraft.class02435;
import minecraft.class02447;
import minecraft.class02452;
import minecraft.class02456;
import minecraft.class02734;
import minecraft.class02762;
import minecraft.class08053;
import minecraft.class08066;
import minecraft.class08394;
import minecraft.class08419;
import minecraft.class08627;
import minecraft.class08918;

public class class08086
implements AutoCloseable {
    public static final class01894 N = class01894.y((String)"main");
    private final List<class00555> y;
    private final Map<class01894, class02430> L;
    private final Set<class01894> u;
    private final Map<class01894, class08066> i = new HashMap<class01894, class08066>();
    private final class00056 R;

    private class08086(List<class00555> list, Map<class01894, class02430> map, Set<class01894> set, class00056 class000562) {
        this.y = list;
        this.L = map;
        this.u = set;
        this.R = class000562;
    }

    @Override
    public void close() {
        this.i.values().forEach(class08066::N);
        this.i.clear();
        Iterator<class00555> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().close();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static class00555 N(class08627 class086272, class02433 class024332, class01894 class018942) throws class10883 {
        Object object2222;
        RenderPipeline.Builder builder = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class08394.G}).withFragmentShader(class024332.L()).withVertexShader(class024332.y()).withLocation(class018942);
        for (Object object2222 : class024332.u()) {
            builder.withSampler(object2222.N() + "Sampler");
        }
        builder.withUniform("SamplerInfo", class08419.field_60031);
        for (Object object2222 : class024332.R().keySet()) {
            builder.withUniform((String)object2222, class08419.field_60031);
        }
        Iterator<Object> iterator = builder.build();
        object2222 = new ArrayList();
        Iterator var6 = class024332.u().iterator();
        block9: while (var6.hasNext()) {
            Object object3;
            class02435 class024352;
            Objects.requireNonNull((class02435)var6.next());
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class02412.class, class02447.class}, (Object)class024352, (int)n)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    boolean bl5;
                    boolean bl4;
                    boolean bl3;
                    Object object5;
                    Object object4;
                    class02412 class024122 = (class02412)class024352;
                    try {
                        boolean bl2;
                        object4 = object3 = class024122.N();
                        object5 = object3 = class024122.L();
                        bl3 = bl2 = class024122.u();
                        bl4 = bl2 = class024122.i();
                        bl5 = bl2 = (boolean)class024122.R();
                    }
                    catch (Throwable throwable) {
                        throw new MatchException(throwable.toString(), throwable);
                    }
                    object3 = class086272.y(object5.N(string -> "textures/effect/" + string + ".png"));
                    object2222.add(new class00528((String)object4, (class08918)object3, bl3 ? 1 : 0, bl4 ? 1 : 0, bl5));
                    continue block9;
                }
                case 1: 
            }
            object3 = (class02447)class024352;
            {
                boolean bl;
                String string2;
                String string3 = string2 = object3.N();
                String string4 = string2 = object3.L();
                boolean bl6 = bl = object3.u();
                boolean bl7 = bl = object3.i();
                object2222.add(new class00572(string3, (class01894)string4, bl6, bl7));
            }
        }
        return new class00555(iterator, class024332.i(), class024332.R(), (List)object2222);
    }

    private class08066 N(class01894 class018942, class02456 class024562) {
        class08066 class080662 = this.i.get(class018942);
        if (class080662 == null || class080662.N != class024562.y() || class080662.y != class024562.L()) {
            if (class080662 != null) {
                class080662.N();
            }
            class080662 = class024562.R();
            class024562.N(class080662);
            this.i.put(class018942, class080662);
        }
        return class080662;
    }

    public static class08086 N(class02414 class024142, class08627 class086272, Set<class01894> set, class01894 class018943, class00056 class000562) throws class10883 {
        Set<class01894> set2 = class024142.y().stream().flatMap(class02433::N).filter(class018942 -> !class024142.N().containsKey(class018942)).collect(Collectors.toSet());
        Sets.SetView setView = Sets.difference(set2, set);
        if (!setView.isEmpty()) {
            throw new class10883("Referenced external targets are not available in this context: " + String.valueOf(setView));
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < class024142.y().size(); ++i) {
            class02433 class024332 = (class02433)class024142.y().get(i);
            builder.add((Object)class08086.N(class086272, class024332, class018943.M("/" + i)));
        }
        return new class08086((List<class00555>)builder.build(), class024142.N(), set2, class000562);
    }

    @Deprecated
    public void N(class08066 class080662, class02762 class027622) {
        class02734 class027342 = new class02734();
        class08053 class080532 = class08053.N((class01894)N, (class02452)class027342.N("main", (Object)class080662));
        this.N(class027342, class080662.N, class080662.y, class080532);
        class027342.N(class027622);
    }

    public void N(class02734 class027342, int n, int n2, class08053 class080532) {
        GpuBufferSlice gpuBufferSlice = this.R.y((float)n, (float)n2);
        HashMap<class01894, class02452> hashMap = new HashMap<class01894, class02452>(this.L.size() + this.u.size());
        for (class01894 object : this.u) {
            hashMap.put(object, class080532.y(object));
        }
        for (Map.Entry entry : this.L.entrySet()) {
            class01894 class018942 = (class01894)entry.getKey();
            class02430 class024302 = (class02430)entry.getValue();
            class02456 class024562 = new class02456(class024302.N().orElse(n).intValue(), class024302.y().orElse(n2).intValue(), true, class024302.u());
            if (class024302.L()) {
                class08066 class080662 = this.N(class018942, class024562);
                hashMap.put(class018942, class027342.N(class018942.toString(), (Object)class080662));
                continue;
            }
            hashMap.put(class018942, class027342.N(class018942.toString(), (class02418)class024562));
        }
        for (class00555 class005552 : this.y) {
            class005552.N(class027342, hashMap, gpuBufferSlice);
        }
        for (class01894 class018943 : this.u) {
            class080532.y(class018943, (class02452)hashMap.get(class018943));
        }
    }
}

