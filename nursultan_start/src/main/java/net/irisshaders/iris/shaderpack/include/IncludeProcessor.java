/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 */
package net.irisshaders.iris.shaderpack.include;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.include.FileNode;
import net.irisshaders.iris.shaderpack.include.IncludeGraph;

public class IncludeProcessor {
    private final IncludeGraph graph;
    private final Map<AbsolutePackPath, ImmutableList<String>> cache;

    public IncludeProcessor(IncludeGraph includeGraph) {
        this.graph = includeGraph;
        this.cache = new HashMap<AbsolutePackPath, ImmutableList<String>>();
    }

    private ImmutableList<String> process(AbsolutePackPath absolutePackPath) {
        FileNode fileNode = (FileNode)this.graph.getNodes().get((Object)absolutePackPath);
        if (fileNode == null) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList<String> immutableList = fileNode.getLines();
        ImmutableMap<Integer, AbsolutePackPath> immutableMap = fileNode.getIncludes();
        for (int i = 0; i < immutableList.size(); ++i) {
            AbsolutePackPath absolutePackPath2 = (AbsolutePackPath)immutableMap.get((Object)i);
            if (absolutePackPath2 != null) {
                builder.addAll((Iterable)Objects.requireNonNull(this.getIncludedFile(absolutePackPath2)));
                continue;
            }
            builder.add((Object)((String)immutableList.get(i)));
        }
        return builder.build();
    }

    public ImmutableList<String> getIncludedFile(AbsolutePackPath absolutePackPath) {
        ImmutableList<String> immutableList = this.cache.get(absolutePackPath);
        if (immutableList == null) {
            immutableList = this.process(absolutePackPath);
            this.cache.put(absolutePackPath, immutableList);
        }
        return immutableList;
    }
}

