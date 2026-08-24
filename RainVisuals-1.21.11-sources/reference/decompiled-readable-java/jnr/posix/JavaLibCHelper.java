/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import jnr.constants.platform.Errno;
import jnr.posix.FileStat;
import jnr.posix.HANDLE;
import jnr.posix.JavaFileStat;
import jnr.posix.JavaPOSIX;
import jnr.posix.JavaPasswd;
import jnr.posix.JavaSecuredFile;
import jnr.posix.POSIXHandler;
import jnr.posix.Passwd;
import jnr.posix.util.Chmod;
import jnr.posix.util.ExecIt;
import jnr.posix.util.JavaCrypt;
import jnr.posix.util.Platform;

public class JavaLibCHelper {
    private final POSIXHandler handler;
    private static final ThreadLocal<Integer> errno = new ThreadLocal();
    public static final int STDERR = 2;
    public static final int STDOUT = 1;
    ThreadLocal<Integer> pwIndex = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    private final Map<String, String> env = new HashMap<String, String>();
    public static final int STDIN = 0;

    public String getlogin() {
        return System.getProperty("user.name");
    }

    /*
     * WARNING - void declaration
     */
    public int getpid() {
        try {
            return this.handler.getPID();
        }
        catch (UnsupportedOperationException uoe) {
            try {
                Class<?> processHandle = Class.forName("java.lang.ProcessHandle");
                Object current = processHandle.getMethod("current", new Class[0]).invoke(null, new Object[0]);
                return (int)((Long)processHandle.getMethod("pid", new Class[0]).invoke(current, new Object[0])).longValue();
            }
            catch (Exception runtimeName2) {
                void var1_1;
                try {
                    String runtimeName2 = ManagementFactory.getRuntimeMXBean().getName();
                    int index = runtimeName2.indexOf(64);
                    if (index > 0) {
                        void var3_7;
                        void var2_4;
                        return (int)Long.parseLong(var2_4.substring(0, (int)var3_7));
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                throw var1_1;
            }
        }
    }

    public int getfd(FileDescriptor descriptor2) {
        return JavaLibCHelper.getfdFromDescriptor(descriptor2);
    }

    public int endpwent() {
        this.pwIndex.set(0);
        return 0;
    }

    public static byte[] crypt(byte[] original, byte[] salt) {
        return JavaCrypt.crypt(new String(original), new String(salt)).toString().getBytes();
    }

    public int chmod(String filename, int mode) {
        return Chmod.chmod(new JavaSecuredFile(filename), Integer.toOctalString(mode));
    }

    public int readlink(String oldpath, ByteBuffer buffer, int length) throws IOException {
        try {
            byte[] bytes;
            block5: {
                block4: {
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    String[] stringArray = new String[2];
                    stringArray[0] = "readlink";
                    stringArray[1] = oldpath;
                    new PosixExec(this.handler).runAndWait((OutputStream)baos, stringArray);
                    bytes = baos.toByteArray();
                    if (bytes.length > length) break block4;
                    if (bytes.length != 0) break block5;
                }
                return -1;
            }
            buffer.put(bytes, 0, bytes.length - 1);
            return buffer.position();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            JavaLibCHelper.errno(Errno.ENOENT);
            return -1;
        }
    }

    public int mkdir(String path, int mode) {
        JavaSecuredFile dir = new JavaSecuredFile(path);
        if (!((File)dir).mkdir()) {
            return -1;
        }
        this.chmod(path, mode);
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static FileDescriptor getDescriptorFromChannel(Channel channel) {
        if (ReflectiveAccess.SEL_CH_IMPL_GET_FD != null && ReflectiveAccess.SEL_CH_IMPL.isInstance(channel)) {
            try {
                return (FileDescriptor)ReflectiveAccess.SEL_CH_IMPL_GET_FD.invoke((Object)channel, new Object[0]);
            }
            catch (Exception exception) {}
        } else if (ReflectiveAccess.FILE_CHANNEL_IMPL_FD != null && ReflectiveAccess.FILE_CHANNEL_IMPL.isInstance(channel)) {
            try {
                return (FileDescriptor)ReflectiveAccess.FILE_CHANNEL_IMPL_FD.get(channel);
            }
            catch (Exception exception) {
            }
        } else if (ReflectiveAccess.FILE_DESCRIPTOR_FD != null) {
            FileDescriptor unixFD = new FileDescriptor();
            try {
                void var1_3;
                Method getFD = channel.getClass().getMethod("getFD", new Class[0]);
                ReflectiveAccess.FILE_DESCRIPTOR_FD.set(unixFD, (Integer)getFD.invoke((Object)channel, new Object[0]));
                return var1_3;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return new FileDescriptor();
    }

    public static int chdir(String path) {
        System.setProperty("user.dir", path);
        return 0;
    }

    public static int getfdFromDescriptor(FileDescriptor descriptor2) {
        block7: {
            block6: {
                if (descriptor2 == null) break block6;
                if (ReflectiveAccess.FILE_DESCRIPTOR_FD != null) break block7;
            }
            return -1;
        }
        try {
            return ReflectiveAccess.FILE_DESCRIPTOR_FD.getInt(descriptor2);
        }
        catch (SecurityException securityException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int chown(String filename, int user, int group) {
        void var6_6;
        PosixExec launcher = new PosixExec(this.handler);
        int chownResult = -1;
        int chgrpResult = -1;
        try {
            if (user != -1) {
                String[] stringArray = new String[3];
                stringArray[0] = "chown";
                stringArray[1] = "" + user;
                stringArray[2] = filename;
                chownResult = launcher.runAndWait(stringArray);
            }
            if (group != -1) {
                String[] stringArray = new String[3];
                stringArray[0] = "chgrp ";
                stringArray[1] = "" + user;
                stringArray[2] = filename;
                chgrpResult = launcher.runAndWait(stringArray);
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        catch (Exception exception) {
        }
        if (chownResult == -1) return 1;
        if (var6_6 == -1) return 1;
        return 0;
    }

    static int errno() {
        Integer errno = JavaLibCHelper.errno.get();
        return errno != null ? errno : 0;
    }

    public int stat(String path, FileStat stat) {
        JavaFileStat jstat = (JavaFileStat)stat;
        try {
            JavaSecuredFile file = new JavaSecuredFile(path);
            if (!((File)file).exists()) {
                JavaLibCHelper.errno(Errno.ENOENT);
                return -1;
            }
            jstat.setup(((File)file).getCanonicalPath());
        }
        catch (IOException iOException) {
        }
        return 0;
    }

    public int rmdir(String path) {
        return new JavaSecuredFile(path).delete() ? 0 : -1;
    }

    /*
     * WARNING - void declaration
     */
    public static FileDescriptor toFileDescriptor(int fileDescriptor) {
        void var1_1;
        FileDescriptor descriptor2 = new FileDescriptor();
        try {
            ReflectiveAccess.FILE_DESCRIPTOR_FD.set(descriptor2, fileDescriptor);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return var1_1;
    }

    public static CharSequence crypt(CharSequence original, CharSequence salt) {
        return JavaCrypt.crypt(original, salt);
    }

    public Map<String, String> getEnv() {
        return this.env;
    }

    public static HANDLE gethandle(FileDescriptor descriptor2) {
        if (descriptor2 == null || ReflectiveAccess.FILE_DESCRIPTOR_HANDLE == null) {
            return HANDLE.valueOf(-1L);
        }
        try {
            return JavaLibCHelper.gethandle(ReflectiveAccess.FILE_DESCRIPTOR_HANDLE.getLong(descriptor2));
        }
        catch (SecurityException securityException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        return HANDLE.valueOf(-1L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int isatty(int fd) {
        if (fd == 1) return 1;
        if (fd == 0) return 1;
        if (fd != 2) return 0;
        return 1;
    }

    public int link(String oldpath, String newpath) {
        try {
            String[] stringArray = new String[3];
            stringArray[0] = "ln";
            stringArray[1] = oldpath;
            stringArray[2] = newpath;
            return new PosixExec(this.handler).runAndWait(stringArray);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        catch (Exception exception) {
            // empty catch block
        }
        JavaLibCHelper.errno(Errno.EINVAL);
        return -1;
    }

    public Passwd getpwuid(int which) {
        return which == JavaPOSIX.LoginInfo.UID ? new JavaPasswd(this.handler) : null;
    }

    public JavaLibCHelper(POSIXHandler handler) {
        this.handler = handler;
    }

    public int lstat(String path, FileStat stat) {
        JavaSecuredFile file = new JavaSecuredFile(path);
        if (!((File)file).exists()) {
            JavaLibCHelper.errno(Errno.ENOENT);
            return -1;
        }
        JavaFileStat jstat = (JavaFileStat)stat;
        jstat.setup(path);
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static FileDescriptor toFileDescriptor(HANDLE fileDescriptor) {
        void var1_1;
        FileDescriptor descriptor2 = new FileDescriptor();
        try {
            ReflectiveAccess.FILE_DESCRIPTOR_HANDLE.set(descriptor2, fileDescriptor.toPointer().address());
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return var1_1;
    }

    static void errno(int errno) {
        JavaLibCHelper.errno.set(errno);
    }

    public static HANDLE gethandle(long descriptor2) {
        return HANDLE.valueOf(descriptor2);
    }

    public int setpwent() {
        return 0;
    }

    static void errno(Errno errno) {
        JavaLibCHelper.errno.set(errno.intValue());
    }

    /*
     * WARNING - void declaration
     */
    public Passwd getpwent() {
        void var1_1;
        JavaPasswd retVal = this.pwIndex.get() == 0 ? new JavaPasswd(this.handler) : null;
        this.pwIndex.set(this.pwIndex.get() + 1);
        return var1_1;
    }

    public String gethostname() {
        String hn = System.getenv("HOSTNAME");
        if (hn == null) {
            hn = System.getenv("COMPUTERNAME");
        }
        return hn;
    }

    public int symlink(String oldpath, String newpath) {
        try {
            String[] stringArray = new String[4];
            stringArray[0] = "ln";
            stringArray[1] = "-s";
            stringArray[2] = oldpath;
            stringArray[3] = newpath;
            return new PosixExec(this.handler).runAndWait(stringArray);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        catch (Exception exception) {
            // empty catch block
        }
        JavaLibCHelper.errno(Errno.EEXIST);
        return -1;
    }

    private static final class ErrnoParsingOutputStream
    extends OutputStream {
        private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        static Map<Pattern, Errno> errorPatterns = new HashMap<Pattern, Errno>();
        private final AtomicReference<Errno> errno;

        void parseError(String errorString) {
            Iterator<Map.Entry<Pattern, Errno>> iterator2 = errorPatterns.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<Pattern, Errno> entry = iterator2.next();
                if (!entry.getKey().matcher(errorString).find()) continue;
                this.errno.set(entry.getValue());
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void write(int b2) throws IOException {
            if (b2 != 13 && b2 != 10) {
                if (b2 != -1) {
                    this.baos.write(b2);
                    return;
                }
            }
            if (this.baos.size() <= 0) return;
            String errorString = this.baos.toString();
            this.baos.reset();
            this.parseError(errorString);
        }

        static {
            errorPatterns.put(Pattern.compile("File exists"), Errno.EEXIST);
            errorPatterns.put(Pattern.compile("Operation not permitted"), Errno.EPERM);
            errorPatterns.put(Pattern.compile("No such file or directory"), Errno.ENOENT);
            errorPatterns.put(Pattern.compile("Input/output error"), Errno.EIO);
            errorPatterns.put(Pattern.compile("Not a directory"), Errno.ENOTDIR);
            errorPatterns.put(Pattern.compile("No space left on device"), Errno.ENOSPC);
            errorPatterns.put(Pattern.compile("Read-only file system"), Errno.EROFS);
            errorPatterns.put(Pattern.compile("Too many links"), Errno.EMLINK);
        }

        private ErrnoParsingOutputStream(AtomicReference<Errno> errno) {
            this.errno = errno;
        }
    }

    private static class PosixExec
    extends ExecIt {
        private final AtomicReference<Errno> errno = new AtomicReference<Errno>(Errno.EINVAL);
        private final ErrnoParsingOutputStream errorStream = new ErrnoParsingOutputStream(this.errno);

        public PosixExec(POSIXHandler handler) {
            super(handler);
        }

        private int parseResult(int result) {
            if (result == 0) {
                return result;
            }
            JavaLibCHelper.errno(this.errno.get());
            return -1;
        }

        @Override
        public int runAndWait(String ... args2) throws IOException, InterruptedException {
            return this.runAndWait((OutputStream)this.handler.getOutputStream(), this.errorStream, args2);
        }

        @Override
        public int runAndWait(OutputStream output, OutputStream error, String ... args2) throws InterruptedException, IOException {
            return this.parseResult(super.runAndWait(output, error, args2));
        }

        @Override
        public int runAndWait(OutputStream output, String ... args2) throws InterruptedException, IOException {
            return this.runAndWait(output, this.errorStream, args2);
        }
    }

    private static class ReflectiveAccess {
        private static final Method SEL_CH_IMPL_GET_FD;
        private static final Class FILE_CHANNEL_IMPL;
        private static final Field FILE_DESCRIPTOR_HANDLE;
        private static final Field FILE_DESCRIPTOR_FD;
        private static final Class SEL_CH_IMPL;
        private static final Field FILE_CHANNEL_IMPL_FD;

        private ReflectiveAccess() {
        }

        static {
            Field ffd;
            Field fd;
            Class<?> fileChannelImpl;
            Method getFD;
            Class<?> selChImpl;
            try {
                selChImpl = Class.forName("sun.nio.ch.SelChImpl");
                try {
                    getFD = selChImpl.getMethod("getFD", new Class[0]);
                    getFD.setAccessible(true);
                }
                catch (Exception e) {
                    getFD = null;
                }
            }
            catch (Exception e) {
                selChImpl = null;
                getFD = null;
            }
            SEL_CH_IMPL = selChImpl;
            SEL_CH_IMPL_GET_FD = getFD;
            try {
                fileChannelImpl = Class.forName("sun.nio.ch.FileChannelImpl");
                try {
                    fd = fileChannelImpl.getDeclaredField("fd");
                    fd.setAccessible(true);
                }
                catch (Exception e) {
                    fd = null;
                }
            }
            catch (Exception e) {
                fileChannelImpl = null;
                fd = null;
            }
            FILE_CHANNEL_IMPL = fileChannelImpl;
            FILE_CHANNEL_IMPL_FD = fd;
            try {
                ffd = FileDescriptor.class.getDeclaredField("fd");
                ffd.setAccessible(true);
            }
            catch (Exception e) {
                ffd = null;
            }
            FILE_DESCRIPTOR_FD = ffd;
            if (Platform.IS_WINDOWS) {
                Object var5_10;
                try {
                    Field handle = FileDescriptor.class.getDeclaredField("handle");
                    handle.setAccessible(true);
                }
                catch (Exception exception) {
                    var5_10 = null;
                }
                FILE_DESCRIPTOR_HANDLE = var5_10;
            } else {
                FILE_DESCRIPTOR_HANDLE = null;
            }
        }
    }
}

