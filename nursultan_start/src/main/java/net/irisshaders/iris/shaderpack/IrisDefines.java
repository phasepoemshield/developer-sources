/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  net.irisshaders.iris.gl.shader.StandardMacros
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.parsing.BiomeCategories
 *  net.irisshaders.iris.uniforms.BiomeUniforms
 */
package net.irisshaders.iris.shaderpack;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import net.irisshaders.iris.gl.shader.StandardMacros;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.parsing.BiomeCategories;
import net.irisshaders.iris.uniforms.BiomeUniforms;

public class IrisDefines {
    private static final Pattern SEMVER_PATTERN = Pattern.compile("(?<major>\\d+)\\.(?<minor>\\d+)\\.*(?<bugfix>\\d*)(.*)");

    private static void define(List<StringPair> list, String string, String string2) {
        list.add(new StringPair(string, string2));
    }

    private static void define(List<StringPair> list, String string) {
        list.add(new StringPair(string, ""));
    }

    public static ImmutableList<StringPair> createIrisReplacements() {
        ArrayList<StringPair> arrayList = new ArrayList<StringPair>((Collection<StringPair>)StandardMacros.createStandardEnvironmentDefines());
        BiomeUniforms.getBiomeMap().forEach((class059462, n) -> IrisDefines.define(arrayList, "BIOME_" + class059462.N().N().toUpperCase(Locale.ROOT), String.valueOf(n)));
        BiomeCategories[] biomeCategoriesArray = BiomeCategories.values();
        for (int i = 0; i < biomeCategoriesArray.length; ++i) {
            IrisDefines.define(arrayList, "CAT_" + biomeCategoriesArray[i].name().toUpperCase(Locale.ROOT), String.valueOf(i));
        }
        IrisDefines.define(arrayList, "PPT_NONE", "0");
        IrisDefines.define(arrayList, "PPT_RAIN", "1");
        IrisDefines.define(arrayList, "PPT_SNOW", "2");
        return ImmutableList.copyOf(arrayList);
    }
}

