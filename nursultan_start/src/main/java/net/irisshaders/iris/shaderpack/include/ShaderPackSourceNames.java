/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.UnmodifiableIterator
 */
package net.irisshaders.iris.shaderpack.include;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.loading.ProgramArrayId;
import net.irisshaders.iris.shaderpack.loading.ProgramId;

public class ShaderPackSourceNames {
    public static final ImmutableList<String> POTENTIAL_STARTS = ShaderPackSourceNames.findPotentialStarts();

    private static void addStarts(ImmutableList.Builder<String> builder, String string) {
        builder.add((Object)(string + ".vsh"));
        builder.add((Object)(string + ".tcs"));
        builder.add((Object)(string + ".tes"));
        builder.add((Object)(string + ".gsh"));
        builder.add((Object)(string + ".fsh"));
    }

    private static void addComputeStarts(ImmutableList.Builder<String> builder, String string) {
        ShaderPackSourceNames.addStarts(builder, string);
        for (int i = 0; i < 27; ++i) {
            Object object;
            if (i == 0) {
                object = "";
            } else {
                char c = (char)(97 + i - 1);
                object = "_" + c;
            }
            builder.add((Object)(string + (String)object + ".csh"));
        }
    }

    public static boolean findPresentSources(ImmutableList.Builder<AbsolutePackPath> builder, Path path2, AbsolutePackPath absolutePackPath, ImmutableList<String> immutableList) throws IOException {
        Set set;
        Path path3 = absolutePackPath.resolved(path2);
        if (!Files.exists(path3, new LinkOption[0])) {
            return false;
        }
        boolean bl = false;
        try (UnmodifiableIterator unmodifiableIterator = Files.list(path3);){
            set = unmodifiableIterator.map(path -> path.getFileName().toString()).collect(Collectors.toSet());
        }
        for (String string : immutableList) {
            if (!set.contains(string)) continue;
            builder.add((Object)absolutePackPath.resolve(string));
            bl = true;
        }
        return bl;
    }

    private static ImmutableList<String> findPotentialStarts() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (ProgramArrayId enum_ : ProgramArrayId.values()) {
            for (int i = 0; i < enum_.getNumPrograms(); ++i) {
                String string = enum_.getSourcePrefix();
                String string2 = "";
                if (i > 0) {
                    string2 = Integer.toString(i);
                }
                ShaderPackSourceNames.addComputeStarts((ImmutableList.Builder<String>)builder, string + string2);
            }
        }
        for (Enum enum_ : ProgramId.values()) {
            if (enum_ == ProgramId.Final || enum_ == ProgramId.Shadow) {
                ShaderPackSourceNames.addComputeStarts((ImmutableList.Builder<String>)builder, ((ProgramId)enum_).getSourceName());
                continue;
            }
            ShaderPackSourceNames.addStarts((ImmutableList.Builder<String>)builder, ((ProgramId)enum_).getSourceName());
        }
        return builder.build();
    }
}

