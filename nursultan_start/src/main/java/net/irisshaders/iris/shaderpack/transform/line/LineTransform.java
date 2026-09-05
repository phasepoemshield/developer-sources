/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package net.irisshaders.iris.shaderpack.transform.line;

import com.google.common.collect.ImmutableList;

public interface LineTransform {
    public static ImmutableList<String> apply(ImmutableList<String> immutableList, LineTransform lineTransform) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int n = 0;
        for (String string : immutableList) {
            builder.add((Object)lineTransform.transform(n, string));
            ++n;
        }
        return builder.build();
    }

    public String transform(int var1, String var2);
}

