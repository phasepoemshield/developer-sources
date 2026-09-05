/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.api.util;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSystemUtil {
    private static Path getPath(URI uri) throws IOException {
        try {
            return Paths.get(uri);
        }
        catch (FileSystemNotFoundException e) {
            FileSystems.newFileSystem(uri, Collections.emptyMap());
            return Paths.get(uri);
        }
    }

    public static Map<Path, byte[]> getFilesInDirectory(String assetPath) throws IOException, URISyntaxException {
        Path path = FileSystemUtil.getPath(FileSystemUtil.class.getClassLoader().getResource(assetPath).toURI());
        return FileSystemUtil.getFilesInPath(path);
    }

    private static Map<Path, byte[]> getFilesInPath(Path path) throws IOException {
        try (Stream<Path> stream = Files.list(path);){
            Map map = stream.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).sorted(Comparator.comparing(Path::toString)).collect(Collectors.toMap(f -> f, f -> {
                try {
                    return Files.readAllBytes(f);
                }
                catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }, (u, v) -> {
                throw new IllegalStateException("Duplicate key");
            }, LinkedHashMap::new));
            return map;
        }
    }
}

