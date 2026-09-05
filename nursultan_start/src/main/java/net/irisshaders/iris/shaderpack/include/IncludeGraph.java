/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.transform.line.LineTransform
 */
package net.irisshaders.iris.shaderpack.include;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.error.RusticError;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.include.FileIncludeException;
import net.irisshaders.iris.shaderpack.include.FileNode;
import net.irisshaders.iris.shaderpack.transform.line.LineTransform;

public class IncludeGraph {
    private final ImmutableMap<AbsolutePackPath, FileNode> nodes;
    private final ImmutableMap<AbsolutePackPath, RusticError> failures;

    private IncludeGraph(ImmutableMap<AbsolutePackPath, FileNode> immutableMap, ImmutableMap<AbsolutePackPath, RusticError> immutableMap2) {
        this.nodes = immutableMap;
        this.failures = immutableMap2;
    }

    public IncludeGraph(Path path, ImmutableList<AbsolutePackPath> immutableList, boolean bl) {
        HashMap<AbsolutePackPath, AbsolutePackPath> hashMap = new HashMap<AbsolutePackPath, AbsolutePackPath>();
        HashMap<AbsolutePackPath, Integer> hashMap2 = new HashMap<AbsolutePackPath, Integer>();
        HashMap<AbsolutePackPath, Object> hashMap3 = new HashMap<AbsolutePackPath, Object>();
        HashMap<AbsolutePackPath, RusticError> hashMap4 = new HashMap<AbsolutePackPath, RusticError>();
        ArrayList<AbsolutePackPath> arrayList = new ArrayList<AbsolutePackPath>((Collection<AbsolutePackPath>)immutableList);
        HashSet<AbsolutePackPath> hashSet = new HashSet<AbsolutePackPath>((Collection<AbsolutePackPath>)immutableList);
        while (!arrayList.isEmpty()) {
            String string;
            Object object;
            Path path2;
            AbsolutePackPath absolutePackPath = (AbsolutePackPath)arrayList.removeLast();
            try {
                path2 = absolutePackPath.resolved(path);
                if (Iris.getIrisConfig().areDebugOptionsEnabled() && !bl) {
                    object = path2.toAbsolutePath().toString().replace("\\", "/");
                    object = ((String)object).substring(((String)object).lastIndexOf("shaders/") + 8);
                    String string2 = path2.toFile().getCanonicalPath().replace("\\", "/");
                    if (!((String)object).equals(string2 = string2.substring(string2.lastIndexOf("shaders/") + 8))) {
                        throw new FileIncludeException("'" + absolutePackPath.getPathString() + "' doesn't exist, did you mean '" + string2 + "'?");
                    }
                }
                string = IncludeGraph.readFile(path2);
            }
            catch (IOException iOException) {
                String string3;
                Object object2;
                object = (AbsolutePackPath)hashMap.get(absolutePackPath);
                if (object == null) {
                    throw new RuntimeException("unexpected error: failed to read " + absolutePackPath.getPathString(), iOException);
                }
                if (iOException instanceof FileIncludeException) {
                    object2 = "failed to resolve #include directive\n" + iOException.getMessage();
                    string3 = "file not found";
                } else if (iOException instanceof NoSuchFileException) {
                    object2 = "failed to resolve #include directive";
                    string3 = "file not found";
                } else {
                    object2 = "unexpected I/O error while resolving #include directive: " + String.valueOf(iOException);
                    string3 = "IO error";
                }
                Object object3 = ((String)((FileNode)hashMap3.get(object)).getLines().get(((Integer)hashMap2.get(absolutePackPath)).intValue())).trim();
                RusticError rusticError = new RusticError("error", (String)object2, string3, ((AbsolutePackPath)object).getPathString(), (Integer)hashMap2.get(absolutePackPath) + 1, (String)object3);
                hashMap4.put(absolutePackPath, rusticError);
                continue;
            }
            path2 = ImmutableList.copyOf((Object[])string.split("\\R"));
            object = new FileNode(absolutePackPath, (ImmutableList<String>)path2);
            boolean bl2 = false;
            for (Object object3 : ((FileNode)object).getIncludes().entrySet()) {
                int n = (Integer)object3.getKey();
                AbsolutePackPath absolutePackPath2 = (AbsolutePackPath)object3.getValue();
                if (absolutePackPath.equals(absolutePackPath2)) {
                    bl2 = true;
                    hashMap4.put(absolutePackPath, new RusticError("error", "trivial #include cycle detected", "file includes itself", absolutePackPath.getPathString(), n + 1, (String)path2.get(n)));
                    break;
                }
                if (hashSet.contains(absolutePackPath2)) continue;
                arrayList.add(absolutePackPath2);
                hashSet.add(absolutePackPath2);
                hashMap.put(absolutePackPath2, absolutePackPath);
                hashMap2.put(absolutePackPath2, n);
            }
            if (bl2) continue;
            hashMap3.put(absolutePackPath, object);
        }
        this.nodes = ImmutableMap.copyOf(hashMap3);
        this.failures = ImmutableMap.copyOf(hashMap4);
        this.detectCycle();
    }

    public IncludeGraph map(Function<AbsolutePackPath, LineTransform> function) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        this.nodes.forEach((absolutePackPath, fileNode) -> builder.put(absolutePackPath, (Object)fileNode.map((LineTransform)function.apply((AbsolutePackPath)absolutePackPath))));
        return new IncludeGraph((ImmutableMap<AbsolutePackPath, FileNode>)builder.build(), this.failures);
    }

    private static String readFile(Path path) throws IOException {
        return Files.readString(path);
    }

    public List<IncludeGraph> computeWeaklyConnectedComponents() {
        return Collections.singletonList(this);
    }

    public ImmutableMap<AbsolutePackPath, FileNode> getNodes() {
        return this.nodes;
    }

    public ImmutableMap<AbsolutePackPath, RusticError> getFailures() {
        return this.failures;
    }

    private boolean exploreForCycles(AbsolutePackPath absolutePackPath, List<AbsolutePackPath> list, Set<AbsolutePackPath> set) {
        if (set.contains(absolutePackPath)) {
            list.add(absolutePackPath);
            return true;
        }
        list.add(absolutePackPath);
        set.add(absolutePackPath);
        for (AbsolutePackPath absolutePackPath2 : ((FileNode)this.nodes.get((Object)absolutePackPath)).getIncludes().values()) {
            if (!this.nodes.containsKey((Object)absolutePackPath2) || !this.exploreForCycles(absolutePackPath2, list, set)) continue;
            return true;
        }
        list.removeLast();
        set.remove(absolutePackPath);
        return false;
    }

    private void detectCycle() {
        ArrayList<AbsolutePackPath> arrayList = new ArrayList<AbsolutePackPath>();
        HashSet<AbsolutePackPath> hashSet = new HashSet<AbsolutePackPath>();
        for (AbsolutePackPath absolutePackPath : this.nodes.keySet()) {
            if (!this.exploreForCycles(absolutePackPath, arrayList, hashSet)) continue;
            AbsolutePackPath absolutePackPath2 = null;
            StringBuilder stringBuilder = new StringBuilder();
            for (AbsolutePackPath absolutePackPath3 : arrayList) {
                Object object2;
                if (absolutePackPath2 == null) {
                    absolutePackPath2 = absolutePackPath3;
                    continue;
                }
                FileNode fileNode = (FileNode)this.nodes.get((Object)absolutePackPath2);
                int n = -1;
                for (Object object2 : fileNode.getIncludes().entrySet()) {
                    if (object2.getValue() != absolutePackPath3) continue;
                    n = (Integer)object2.getKey() + 1;
                }
                Object object3 = (String)fileNode.getLines().get(n - 1);
                Object object4 = object2 = absolutePackPath3.equals(absolutePackPath) ? "final #include in cycle" : "#include involved in cycle";
                if (absolutePackPath2.equals(absolutePackPath)) {
                    stringBuilder.append((Object)new RusticError("error", "#include cycle detected", (String)object2, absolutePackPath2.getPathString(), n, (String)object3));
                } else {
                    stringBuilder.append("\n  = ").append((Object)new RusticError("note", "cycle involves another file", (String)object2, absolutePackPath2.getPathString(), n, (String)object3));
                }
                absolutePackPath2 = absolutePackPath3;
            }
            stringBuilder.append("  note: #include directives are resolved before any other preprocessor directives, any form of #include guard will not work\n\n  note: other cycles may still exist, only the first detected non-trivial cycle will be reported\n");
            Iris.logger.error(stringBuilder.toString());
            throw new IllegalStateException("Cycle detected in #include graph, see previous messages for details");
        }
    }
}

