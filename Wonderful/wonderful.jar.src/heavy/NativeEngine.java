package heavy;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class NativeEngine {
    private static boolean libraryLoaded = false;
    private static NativeEngine instance = null;
    private static String cachedUsername = null;
    private static String cachedAvatar = null;
    private static int cachedUid = 0;
    private static String cachedRole = null;

    private NativeEngine() {
        this.initializeCache();
    }

    private static void loadLibrary() {
        try {
            System.load(NativeEngine.resolveLibraryPath().toFile().getAbsolutePath());
            libraryLoaded = true;
        }
        catch (Exception exception) {
            System.err.println("[embedded-native] Failed to load api.dll: " + String.valueOf(exception));
            exception.printStackTrace();
            libraryLoaded = false;
        }
    }

    private static Path resolveLibraryPath() throws Exception {
        Path path = Path.of("api.dll", new String[0]).toAbsolutePath().normalize();
        if (Files.exists(path, new LinkOption[0])) {
            return path;
        }
        try (InputStream inputStream = NativeEngine.class.getClassLoader().getResourceAsStream("natives/api.dll");){
            Path path2;
            if (inputStream == null) {
                throw new FileNotFoundException("natives/api.dll resource not found inside jar");
            }
            byte[] byArray = inputStream.readAllBytes();
            String string = NativeEngine.sha256(byArray).substring(0, 16);
            Path path3 = Path.of(System.getProperty("java.io.tmpdir"), "wonderful-api-" + string + ".dll");
            if (!Files.exists(path3, new LinkOption[0]) || Files.size(path3) != (long)byArray.length) {
                path2 = Files.createTempFile("wonderful-api-", ".dll", new FileAttribute[0]);
                try (OutputStream outputStream = Files.newOutputStream(path2, StandardOpenOption.TRUNCATE_EXISTING);){
                    outputStream.write(byArray);
                }
                Files.move(path2, path3, StandardCopyOption.REPLACE_EXISTING);
            }
            path2 = path3;
            return path2;
        }
    }

    private static String sha256(byte[] byArray) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] byArray2 = messageDigest.digest(byArray);
        StringBuilder stringBuilder = new StringBuilder(byArray2.length * 2);
        for (byte by : byArray2) {
            stringBuilder.append(String.format("%02x", by));
        }
        return stringBuilder.toString();
    }

    private void initializeCache() {
        if (cachedUsername == null) {
            cachedUsername = this.getUsernameNative();
        }
        if (cachedUid == 0) {
            cachedUid = this.getUidNative();
        }
        if (cachedRole == null) {
            cachedRole = this.getRoleNative();
        }
        if (cachedAvatar == null) {
            cachedAvatar = this.getAvatarNative();
        }
    }

    public static NativeEngine getInstance() {
        if (!libraryLoaded) {
            throw new RuntimeException("Native library failed to load");
        }
        if (instance == null) {
            instance = new NativeEngine();
        }
        return instance;
    }

    private native int getUidNative();

    private native String getUsernameNative();

    private native String getRoleNative();

    private native String getAvatarNative();

    public int getUid() {
        return cachedUid;
    }

    public String getUsername() {
        return cachedUsername != null ? cachedUsername : "Unknown";
    }

    public String getAvatar() {
        return cachedAvatar != null ? cachedAvatar : "Unknown";
    }

    public String getRole() {
        return cachedRole != null ? cachedRole : "Unknown";
    }

    private static native void initializeNative();

    public static void initialize() {
        if (!libraryLoaded) {
            throw new RuntimeException("Native library failed to load");
        }
        if (instance == null) {
            instance = new NativeEngine();
        }
    }

    static {
        NativeEngine.loadLibrary();
    }
}