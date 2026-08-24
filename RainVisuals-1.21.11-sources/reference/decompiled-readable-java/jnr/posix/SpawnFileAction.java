/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jnr.ffi.Pointer;
import jnr.posix.POSIX;
import jnr.posix.UnixLibC;

public abstract class SpawnFileAction {
    public static SpawnFileAction close(int fd) {
        return new Close(fd);
    }

    public static SpawnFileAction open(String path, int fd, int flags, int mode) {
        return new Open(path, fd, flags, mode);
    }

    public static SpawnFileAction dup(int fd, int newfd) {
        return new Dup(fd, newfd);
    }

    abstract boolean act(POSIX var1, Pointer var2);

    private static final class Dup
    extends SpawnFileAction {
        final int newfd;
        final int fd;

        public Dup(int fd, int newfd) {
            this.fd = fd;
            this.newfd = newfd;
        }

        @Override
        final boolean act(POSIX posix, Pointer nativeFileActions) {
            return ((UnixLibC)posix.libc()).posix_spawn_file_actions_adddup2(nativeFileActions, this.fd, this.newfd) == 0;
        }

        public String toString() {
            return "SpawnFileAction::Dup(old = " + this.fd + ", new = " + this.newfd + ")";
        }
    }

    private static final class Close
    extends SpawnFileAction {
        final int fd;

        public Close(int fd) {
            this.fd = fd;
        }

        @Override
        final boolean act(POSIX posix, Pointer nativeFileActions) {
            return ((UnixLibC)posix.libc()).posix_spawn_file_actions_addclose(nativeFileActions, this.fd) == 0;
        }

        public String toString() {
            return "SpawnFileAction::Close(fd = " + this.fd + ")";
        }
    }

    private static final class Open
    extends SpawnFileAction {
        final int fd;
        final ByteBuffer nativePath;
        final String path;
        final int flags;
        final int mode;

        /*
         * WARNING - void declaration
         */
        private ByteBuffer defensiveCopy(String path) {
            void var5_5;
            CharsetEncoder encoder = Charset.defaultCharset().newEncoder();
            int bpc = (int)encoder.maxBytesPerChar();
            int size = (path.length() + 1) * bpc;
            ByteBuffer nativePath = ByteBuffer.allocateDirect(size);
            encoder.encode(CharBuffer.wrap(path), nativePath, true);
            nativePath.flip();
            nativePath.limit(nativePath.limit() + bpc);
            return var5_5;
        }

        public Open(String path, int fd, int flags, int mode) {
            this.path = path;
            this.fd = fd;
            this.flags = flags;
            this.mode = mode;
            this.nativePath = this.defensiveCopy(path);
        }

        @Override
        final boolean act(POSIX posix, Pointer nativeFileActions) {
            return ((UnixLibC)posix.libc()).posix_spawn_file_actions_addopen(nativeFileActions, this.fd, this.nativePath, this.flags, this.mode) == 0;
        }

        public String toString() {
            return "SpawnFileAction::Open(path = '" + this.path + "', fd = " + this.fd + ", flags = " + Integer.toHexString(this.flags) + ", mode = " + Integer.toHexString(this.mode) + ")";
        }
    }
}

