/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.irisshaders.iris.shaderpack.transform.line.LineTransform
 */
package net.irisshaders.iris.shaderpack.include;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.transform.line.LineTransform;

public class FileNode {
    private final AbsolutePackPath path;
    private final ImmutableList<String> lines;
    private final ImmutableMap<Integer, AbsolutePackPath> includes;

    public ImmutableList<String> getLines() {
        return this.lines;
    }

    private FileNode(AbsolutePackPath absolutePackPath, ImmutableList<String> immutableList, ImmutableMap<Integer, AbsolutePackPath> immutableMap) {
        this.path = absolutePackPath;
        this.lines = immutableList;
        this.includes = immutableMap;
    }

    public FileNode(AbsolutePackPath absolutePackPath, ImmutableList<String> immutableList) {
        this.path = absolutePackPath;
        this.lines = immutableList;
        AbsolutePackPath absolutePackPath2 = absolutePackPath.parent().orElseThrow(() -> new IllegalArgumentException("Not a valid shader file name: " + String.valueOf(absolutePackPath)));
        this.includes = FileNode.findIncludes(absolutePackPath2, immutableList);
    }

    public FileNode map(LineTransform lineTransform) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int n = 0;
        for (String string : this.lines) {
            String string2 = lineTransform.transform(n, string);
            if (this.includes.containsKey((Object)n) && !Objects.equals(string, string2)) {
                throw new IllegalStateException("Attempted to modify an #include line in LineTransform.");
            }
            builder.add((Object)string2);
            ++n;
        }
        return new FileNode(this.path, (ImmutableList<String>)builder.build(), this.includes);
    }

    public AbsolutePackPath getPath() {
        return this.path;
    }

    public ImmutableMap<Integer, AbsolutePackPath> getIncludes() {
        return this.includes;
    }

    private static ImmutableMap<Integer, AbsolutePackPath> findIncludes(AbsolutePackPath absolutePackPath, ImmutableList<String> immutableList) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (int i = 0; i < immutableList.size(); ++i) {
            String string = ((String)immutableList.get(i)).trim();
            if (!string.startsWith("#include")) continue;
            String string2 = string.substring("#include ".length()).trim();
            if (string2.startsWith("\"")) {
                string2 = string2.substring(1);
            }
            if (string2.endsWith("\"")) {
                string2 = string2.substring(0, string2.length() - 1);
            }
            builder.put((Object)i, (Object)absolutePackPath.resolve(string2));
        }
        return builder.build();
    }
}

