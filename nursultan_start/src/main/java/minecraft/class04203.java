/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03069
 *  minecraft.class04233
 *  minecraft.class04235
 *  minecraft.class08326
 *  minecraft.class08923
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class03069;
import minecraft.class04204;
import minecraft.class04223;
import minecraft.class04233;
import minecraft.class04235;
import minecraft.class08326;
import minecraft.class08923;
import org.slf4j.Logger;

public class class04203 {
    private static final Logger N = LogUtils.getLogger();
    private static final class03069 y = new class03069("atlases", ".json");
    private final List<class04233> L;

    private class04203(List<class04233> list) {
        this.L = list;
    }

    public List<class04235> N(class01089 class010892) {
        HashMap hashMap = new HashMap();
        class04204 class042042 = new class04204(this, hashMap);
        this.L.forEach(class042332 -> class042332.N(class010892, class042042));
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(class016402 -> class08923.y());
        builder.addAll(hashMap.values());
        return builder.build();
    }

    public static class04203 N(class01089 class010892, class01894 class018942) {
        class01894 class018943 = y.N(class018942);
        ArrayList<class04233> arrayList = new ArrayList<class04233>();
        for (class01079 class010792 : class010892.N(class018943)) {
            try {
                BufferedReader bufferedReader = class010792.method_43039();
                try {
                    Dynamic dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)class08326.N((Reader)bufferedReader));
                    arrayList.addAll((Collection)class04223.y.parse(dynamic).getOrThrow());
                }
                finally {
                    if (bufferedReader == null) continue;
                    bufferedReader.close();
                }
            }
            catch (Exception exception) {
                N.error("Failed to parse atlas definition {} in pack {}", new Object[]{class018943, class010792.method_14480(), exception});
            }
        }
        return new class04203(arrayList);
    }
}

