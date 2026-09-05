/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import minecraft.class02973;
import minecraft.class02975;
import minecraft.class02993;
import minecraft.class02994;
import org.jspecify.annotations.Nullable;

class class02970
extends FileSystemProvider {
    public static final String N = "x-mc-link";

    class02970() {
    }

    @Override
    public boolean isHidden(Path path) {
        return false;
    }

    @Override
    public void delete(Path path) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public void checkAccess(Path path, AccessMode ... accessModeArray) throws IOException {
        if (accessModeArray.length == 0 && !class02970.N(path).M()) {
            throw new NoSuchFileException(path.toString());
        }
        block4: for (AccessMode accessMode : accessModeArray) {
            switch (accessMode) {
                case READ: {
                    if (class02970.N(path).M()) continue block4;
                    throw new NoSuchFileException(path.toString());
                }
                case EXECUTE: 
                case WRITE: {
                    throw new AccessDeniedException(accessMode.toString());
                }
            }
        }
    }

    @Override
    public void copy(Path path, Path path2, CopyOption ... copyOptionArray) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public String getScheme() {
        return N;
    }

    @Override
    public Path getPath(URI uRI) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createDirectory(Path path, FileAttribute<?> ... fileAttributeArray) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public FileSystem getFileSystem(URI uRI) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isSameFile(Path path, Path path2) {
        return path instanceof class02973 && path2 instanceof class02973 && path.equals(path2);
    }

    @Override
    public FileSystem newFileSystem(URI uRI, Map<String, ?> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> set, FileAttribute<?> ... fileAttributeArray) throws IOException {
        if (set.contains(StandardOpenOption.CREATE_NEW) || set.contains(StandardOpenOption.CREATE) || set.contains(StandardOpenOption.APPEND) || set.contains(StandardOpenOption.WRITE)) {
            throw new UnsupportedOperationException();
        }
        Path path2 = ((class02973)class02970.N(path).toAbsolutePath()).B();
        if (path2 == null) {
            throw new NoSuchFileException(path.toString());
        }
        return Files.newByteChannel(path2, set, fileAttributeArray);
    }

    @Override
    public FileStore getFileStore(Path path) {
        return ((class02993)class02970.N(path).getFileSystem()).N();
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path path, DirectoryStream.Filter<? super Path> filter) throws IOException {
        class02994 class029942 = ((class02973)class02970.N(path).toAbsolutePath()).Z();
        if (class029942 == null) {
            throw new NotDirectoryException(path.toString());
        }
        return new class02975(this, class029942, filter);
    }

    @Override
    public void setAttribute(Path path, String string, Object object, LinkOption ... linkOptionArray) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public Map<String, Object> readAttributes(Path path, String string, LinkOption ... linkOptionArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> clazz, LinkOption ... linkOptionArray) throws IOException {
        Path path2 = class02970.N(path).toAbsolutePath();
        if (clazz == BasicFileAttributes.class) {
            return (A)((class02973)path2).U();
        }
        throw new UnsupportedOperationException("Attributes of type " + clazz.getName() + " not supported");
    }

    private static class02973 N(@Nullable Path path) {
        if (path == null) {
            throw new NullPointerException();
        }
        if (path instanceof class02973) {
            return (class02973)path;
        }
        throw new ProviderMismatchException();
    }

    @Override
    public <V extends FileAttributeView> @Nullable V getFileAttributeView(Path path, Class<V> clazz, LinkOption ... linkOptionArray) {
        class02973 class029732 = class02970.N(path);
        if (clazz == BasicFileAttributeView.class) {
            return (V)class029732.z();
        }
        return null;
    }

    @Override
    public void move(Path path, Path path2, CopyOption ... copyOptionArray) {
        throw new ReadOnlyFileSystemException();
    }
}

