/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.nativeutils;

import de.maxhenkel.nativeutils.UnknownPlatformException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;

class LibraryLoader {
    private static final String OS_NAME = System.getProperty("os.name").toLowerCase();
    private static final String OS_ARCH = System.getProperty("os.arch").toLowerCase();

    private static String getLibraryName(String string) throws UnknownPlatformException {
        return String.format("%s.%s", string, LibraryLoader.getLibraryExtension());
    }

    private static boolean isMac() {
        return OS_NAME.contains("mac");
    }

    LibraryLoader() {
    }

    public static void load(String string) throws UnknownPlatformException, IOException {
        boolean bl;
        Object object;
        String string2;
        String string3 = LibraryLoader.getResourcePath(string);
        try (Object object2 = LibraryLoader.getResource(string3);){
            if (object2 == null) {
                throw new UnknownPlatformException(String.format("Could not find %s natives for platform %s", string, LibraryLoader.getNativeFolderName()));
            }
            string2 = LibraryLoader.checksum((InputStream)object2);
        }
        object2 = new File(LibraryLoader.getTempDir(), String.format("%s-%s", string, string2));
        ((File)object2).mkdirs();
        File file = new File((File)object2, LibraryLoader.getLibraryName(string));
        if (file.exists()) {
            try (InputStream inputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);){
                object = LibraryLoader.checksum(inputStream);
            }
            if (!((String)object).equals(string2)) {
                Files.deleteIfExists(file.toPath());
                bl = true;
            } else {
                bl = false;
            }
        } else {
            bl = true;
        }
        if (bl) {
            object = LibraryLoader.getResource(string3);
            try {
                if (object == null) {
                    throw new UnknownPlatformException(String.format("Could not find %s natives for platform %s", string, LibraryLoader.getNativeFolderName()));
                }
                Files.copy((InputStream)object, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            finally {
                if (object != null) {
                    ((InputStream)object).close();
                }
            }
        }
        try {
            System.load(file.getAbsolutePath());
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new UnknownPlatformException(String.format("Could not load %s natives for %s", string, LibraryLoader.getNativeFolderName()), unsatisfiedLinkError);
        }
    }

    @Nullable
    private static InputStream getResource(String string) {
        return LibraryLoader.class.getClassLoader().getResourceAsStream(string);
    }

    private static boolean isWindows() {
        return OS_NAME.contains("win");
    }

    private static boolean isLinux() {
        return OS_NAME.contains("nux");
    }

    private static File getTempDir() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    private static String getPlatform() throws UnknownPlatformException {
        if (LibraryLoader.isWindows()) {
            return "windows";
        }
        if (LibraryLoader.isMac()) {
            return "mac";
        }
        if (LibraryLoader.isLinux()) {
            return "linux";
        }
        throw new UnknownPlatformException(String.format("Unknown operating system: %s", OS_NAME));
    }

    private static String checksum(InputStream inputStream) throws IOException {
        try {
            int n;
            byte[] byArray = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            do {
                if ((n = inputStream.read(byArray)) <= 0) continue;
                messageDigest.update(byArray, 0, n);
            } while (n != -1);
            inputStream.close();
            byte[] byArray2 = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte by : byArray2) {
                stringBuilder.append(String.format("%02x", by));
            }
            return stringBuilder.toString();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IOException(noSuchAlgorithmException);
        }
    }

    private static String getArchitecture() {
        switch (OS_ARCH) {
            case "i386": 
            case "i486": 
            case "i586": 
            case "i686": 
            case "x86": 
            case "x86_32": {
                return "x86";
            }
            case "amd64": 
            case "x86_64": 
            case "x86-64": {
                return "x64";
            }
            case "aarch64": {
                return "aarch64";
            }
        }
        return OS_ARCH;
    }

    private static String getLibraryExtension() throws UnknownPlatformException {
        if (LibraryLoader.isWindows()) {
            return "dll";
        }
        if (LibraryLoader.isMac()) {
            return "dylib";
        }
        if (LibraryLoader.isLinux()) {
            return "so";
        }
        throw new UnknownPlatformException(String.format("Unknown operating system: %s", OS_NAME));
    }

    private static String getNativeFolderName() throws UnknownPlatformException {
        return String.format("%s-%s", LibraryLoader.getPlatform(), LibraryLoader.getArchitecture());
    }

    private static String getResourcePath(String string) throws UnknownPlatformException {
        return String.format("natives/%s/%s", LibraryLoader.getNativeFolderName(), LibraryLoader.getLibraryName(string));
    }
}

