/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.util.Platform
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.util.Platform;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

final class PipeLocator {
    private static Logger log = LogManager.getLogger((String)"fun.crashsystem.jdrpc.connection.PipeLocator");
    private static final List<String> TMP_ENV_VARS;
    private static final Path UNIX_TMP_DIR;
    static final int MAX_PIPE_INDEX = 10;

    private PipeLocator() {
    }

    static String getPath(int n) {
        return switch (Platform.CURRENT) {
            default -> throw new IncompatibleClassChangeError();
            case Platform.WINDOWS -> "\\\\.\\pipe\\discord-ipc-" + n;
            case Platform.MACOS, Platform.LINUX -> UNIX_TMP_DIR.resolve("discord-ipc-" + n).toString();
        };
    }

    static List<String> locateAll() {
        ArrayList<String> arrayList = new ArrayList<String>(10);
        for (int i = 0; i < 10; ++i) {
            arrayList.add(PipeLocator.getPath(i));
        }
        return arrayList;
    }

    static Path resolveUnixPipeDir(Map<String, String> map, String string, String string2) {
        for (String object2 : TMP_ENV_VARS) {
            Path path = PipeLocator.validateUnixPipeDir(map.get(object2), string2);
            if (path == null) continue;
            log.debug("Using {} = {} for pipe directory", (Object)object2, (Object)path);
            return path;
        }
        Path path = PipeLocator.validateUnixPipeDir(string, string2);
        if (path != null) {
            log.debug("Using java.io.tmpdir = {} for pipe directory", (Object)path);
            return path;
        }
        Path path2 = PipeLocator.validateUnixPipeDir("/tmp", string2);
        if (path2 != null) {
            return path2;
        }
        return Path.of("/tmp", new String[0]).toAbsolutePath().normalize();
    }

    private static boolean supportsPosix(Path path) {
        return path.getFileSystem().supportedFileAttributeViews().contains("posix");
    }

    private static boolean isTrustedOwner(Path path, String string) throws IOException {
        if (string == null || string.isBlank()) {
            return true;
        }
        String string2 = Files.getOwner(path, LinkOption.NOFOLLOW_LINKS).getName();
        return string.equals(string2) || "root".equals(string2);
    }

    static Path validateUnixPipeDir(String string, String string2) {
        if (string == null || string.isBlank()) {
            return null;
        }
        try {
            return PipeLocator.validateUnixPipeDir(Path.of(string, new String[0]), string2);
        }
        catch (InvalidPathException invalidPathException) {
            log.debug("Ignoring invalid pipe directory path: {}", (Object)string, (Object)invalidPathException);
            return null;
        }
    }

    static Path validateUnixPipeDir(Path path, String string) {
        if (path == null) {
            return null;
        }
        try {
            if (Files.isSymbolicLink(path) || !Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                return null;
            }
            Path path2 = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
            if (!Files.isDirectory(path2, LinkOption.NOFOLLOW_LINKS)) {
                return null;
            }
            if (PipeLocator.supportsPosix(path2) && !PipeLocator.isTrustedOwner(path2, string)) {
                log.debug("Ignoring pipe directory not owned by trusted user: {}", (Object)path2);
                return null;
            }
            return path2;
        }
        catch (IOException iOException) {
            log.debug("Ignoring unusable pipe directory: {}", (Object)path, (Object)iOException);
            return null;
        }
    }
}

