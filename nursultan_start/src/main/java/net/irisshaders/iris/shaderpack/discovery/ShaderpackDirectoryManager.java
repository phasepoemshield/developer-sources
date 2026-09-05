/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.discovery;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;

public class ShaderpackDirectoryManager {
    private final Path root;

    public ShaderpackDirectoryManager(Path path) {
        this.root = path;
    }

    public List<String> enumerate() throws IOException {
        boolean bl = Iris.getIrisConfig().areDebugOptionsEnabled();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER.thenComparing(Comparator.naturalOrder());
        Comparator comparator2 = (path, path2) -> {
            if (bl) {
                if (Files.isDirectory(path, new LinkOption[0])) {
                    if (!Files.isDirectory(path2, new LinkOption[0])) {
                        return -1;
                    }
                } else if (Files.isDirectory(path2, new LinkOption[0]) && !Files.isDirectory(path, new LinkOption[0])) {
                    return 1;
                }
            }
            return comparator.compare(ShaderpackDirectoryManager.removeFormatting(path.getFileName().toString()), ShaderpackDirectoryManager.removeFormatting(path2.getFileName().toString()));
        };
        try (Stream<Path> stream = Files.list(this.root);){
            List<String> list = stream.filter(Iris::isValidToShowPack).sorted(comparator2).map(path -> path.getFileName().toString()).collect(Collectors.toList());
            return list;
        }
    }

    public void copyPackIntoDirectory(String string, Path path2) throws IOException {
        Path path3 = Iris.getShaderpacksDirectory().resolve(string);
        Files.copy(path2, path3, new CopyOption[0]);
        if (Files.isDirectory(path2, new LinkOption[0])) {
            Path path4;
            try (Stream<Path> stream = Files.walk(path2, new FileVisitOption[0]);){
                for (Path path5 : stream.filter(path -> Files.isDirectory(path, new LinkOption[0])).toList()) {
                    path4 = path2.relativize(path5);
                    if (Files.exists(path4, new LinkOption[0])) continue;
                    Files.createDirectory(path3.resolve(path4), new FileAttribute[0]);
                }
            }
            stream = Files.walk(path2, new FileVisitOption[0]);
            try {
                for (Path path5 : stream.filter(path -> !Files.isDirectory(path, new LinkOption[0])).collect(Collectors.toSet())) {
                    path4 = path2.relativize(path5);
                    Files.copy(path5, path3.resolve(path4), new CopyOption[0]);
                }
            }
            finally {
                if (stream != null) {
                    stream.close();
                }
            }
        }
    }

    public URI getDirectoryUri() {
        return this.root.toUri();
    }

    private static String removeFormatting(String string) {
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        for (int i = 0; i < cArray.length; ++i) {
            if (cArray[i] == '\u00a7') {
                ++i;
                continue;
            }
            cArray2[n++] = cArray[i];
        }
        return new String(cArray2, 0, n);
    }
}

