/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.irisshaders.iris.shaderpack.include.AbsolutePackPath
 *  net.irisshaders.iris.shaderpack.include.IncludeGraph
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.include.IncludeGraph;
import net.irisshaders.iris.shaderpack.option.OptionAnnotatedSource;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.OptionSet$Builder;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class ShaderPackOptions {
    private final OptionSet optionSet;
    private final OptionValues optionValues;
    private final IncludeGraph includes;

    public OptionValues getOptionValues() {
        return this.optionValues;
    }

    public OptionSet getOptionSet() {
        return this.optionSet;
    }

    public ShaderPackOptions(IncludeGraph includeGraph2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        OptionSet$Builder optionSet$Builder = OptionSet.builder();
        includeGraph2.computeWeaklyConnectedComponents().forEach(includeGraph -> {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            HashSet hashSet = new HashSet();
            includeGraph.getNodes().forEach((absolutePackPath, fileNode) -> {
                OptionAnnotatedSource optionAnnotatedSource = new OptionAnnotatedSource((ImmutableList<String>)fileNode.getLines());
                builder.put(absolutePackPath, (Object)optionAnnotatedSource);
                hashSet.addAll(optionAnnotatedSource.getBooleanDefineReferences().keySet());
            });
            ImmutableMap immutableMap = builder.build();
            Set set = Collections.unmodifiableSet(hashSet);
            immutableMap.forEach((absolutePackPath, optionAnnotatedSource) -> {
                OptionSet optionSet = optionAnnotatedSource.getOptionSet((AbsolutePackPath)absolutePackPath, set);
                optionSet$Builder.addAll(optionSet);
            });
            hashMap.putAll(immutableMap);
        });
        this.optionSet = optionSet$Builder.build();
        this.optionValues = new MutableOptionValues(this.optionSet, map);
        this.includes = includeGraph2.map(absolutePackPath -> ((OptionAnnotatedSource)hashMap.get(absolutePackPath)).asTransform(this.optionValues));
    }

    public IncludeGraph getIncludes() {
        return this.includes;
    }
}

