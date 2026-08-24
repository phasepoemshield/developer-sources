/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.freedesktop.dbus.TypeRef;
import org.freedesktop.dbus.utils.Hexdump;
import org.freedesktop.dbus.utils.IThrowingSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Util {
    private static final Random RANDOM;
    private static final Logger LOGGER;
    private static final char[] SYMBOLS;

    /*
     * WARNING - void declaration
     */
    public static Object[] toObjectArray(Object _obj) {
        void var2_2;
        block4: {
            block3: {
                if (_obj == null) break block3;
                if (_obj.getClass().isArray()) break block4;
            }
            return new Object[0];
        }
        int length = Array.getLength(_obj);
        Object[] ret = new Object[length];
        int i = 0;
        while (i < length) {
            void var3_3;
            ret[i] = Array.get(_obj, i);
            ++var3_3;
        }
        return var2_2;
    }

    public static boolean isMacOs() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase(Locale.US).startsWith("mac");
    }

    /*
     * WARNING - void declaration
     */
    public static List<String> readTextFileFromStream(InputStream _input, Charset _charset, boolean _silent) {
        if (_input == null) {
            return null;
        }
        try {
            ArrayList<String> fileContent;
            try (BufferedReader dis = new BufferedReader(new InputStreamReader(_input, _charset));){
                String s;
                fileContent = new ArrayList<String>();
                while ((s = dis.readLine()) != null) {
                    fileContent.add(s);
                }
            }
            return !fileContent.isEmpty() ? fileContent : null;
        }
        catch (IOException _ex) {
            if (!_silent) {
                void var3_5;
                LOGGER.warn("Error while reading file:", (Throwable)var3_5);
            }
            return null;
        }
    }

    public static boolean writeTextFile(String _fileName, String _fileContent, Charset _charset, boolean _append) {
        File file;
        if (Util.isBlank(_fileName)) {
            return false;
        }
        Object allText = "";
        if (_append && (file = new File(_fileName)).exists()) {
            allText = Util.readFileToString(file);
        }
        allText = (String)allText + _fileContent;
        try (OutputStreamWriter writer = new OutputStreamWriter((OutputStream)new FileOutputStream(_fileName), _charset);){
            writer.write((String)allText);
        }
        catch (IOException _ex) {
            LOGGER.error("Could not write file to '" + _fileName + "'", _ex);
            return false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static String snakeToCamelCase(String _input) {
        void var3_3;
        if (Util.isBlank(_input)) {
            return _input;
        }
        Pattern compile = Pattern.compile("_[a-zA-Z]");
        Matcher matcher = compile.matcher(_input);
        String result = _input;
        while (matcher.find()) {
            String match = matcher.group();
            String replacement = match.replace("_", "");
            replacement = replacement.toUpperCase();
            result = result.replaceFirst(match, replacement);
        }
        return var3_3;
    }

    private Util() {
    }

    public static <T> boolean collectionContainsAny(Collection<T> _haystack, Collection<T> _needles) {
        block4: {
            block3: {
                if (_haystack == null) break block3;
                if (_needles != null) break block4;
            }
            return false;
        }
        Iterator<T> iterator2 = _needles.iterator();
        while (iterator2.hasNext()) {
            T t = iterator2.next();
            if (!_haystack.contains(t)) continue;
            return true;
        }
        return false;
    }

    static {
        char ch;
        RANDOM = new Random();
        LOGGER = LoggerFactory.getLogger(Util.class);
        StringBuilder tmp = new StringBuilder();
        for (ch = '0'; ch <= '9'; ch = (char)(ch + '\u0001')) {
            tmp.append(ch);
        }
        for (ch = 'a'; ch <= 'z'; ch = (char)(ch + '\u0001')) {
            tmp.append(ch);
        }
        for (ch = 'A'; ch <= 'Z'; ch = (char)(ch + '\u0001')) {
            tmp.append(ch);
        }
        SYMBOLS = tmp.toString().toCharArray();
    }

    public static int checkIntInRange(int _check, int _min, int _max) {
        if (_check >= _min) {
            if (_check <= _max) {
                return _check;
            }
        }
        throw new IllegalArgumentException("Value " + _check + " is out ouf range (< " + _min + " && > " + _max + ")");
    }

    /*
     * WARNING - void declaration
     */
    public static void setFilePermissions(Path _path, String _fileOwner, String _fileGroup, Set<PosixFilePermission> _fileUnixPermissions) {
        Objects.requireNonNull(_path, "Path required");
        UserPrincipalLookupService userPrincipalLookupService = _path.getFileSystem().getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            LOGGER.error("Unable to set user/group permissions on {}", (Object)_path);
            return;
        }
        if (!Util.isBlank(_fileOwner)) {
            try {
                UserPrincipal userPrincipal = userPrincipalLookupService.lookupPrincipalByName(_fileOwner);
                if (userPrincipal != null) {
                    LinkOption[] linkOptionArray = new LinkOption[1];
                    linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                    Files.getFileAttributeView(_path, PosixFileAttributeView.class, linkOptionArray).setOwner(userPrincipal);
                }
            }
            catch (IOException _ex) {
                Object[] objectArray = new Object[3];
                objectArray[0] = _path;
                objectArray[1] = _fileOwner;
                objectArray[2] = _ex;
                LOGGER.error("Could not change owner of {} to {}", objectArray);
            }
        }
        if (!Util.isBlank(_fileGroup)) {
            try {
                GroupPrincipal groupPrincipal = userPrincipalLookupService.lookupPrincipalByGroupName(_fileGroup);
                if (groupPrincipal != null) {
                    void _ex;
                    LinkOption[] linkOptionArray = new LinkOption[1];
                    linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                    Files.getFileAttributeView(_path, PosixFileAttributeView.class, linkOptionArray).setGroup((GroupPrincipal)_ex);
                }
            }
            catch (IOException _ex) {
                Object[] objectArray = new Object[3];
                objectArray[0] = _path;
                objectArray[1] = _fileGroup;
                objectArray[2] = _ex;
                LOGGER.error("Could not change group of {} to {}", objectArray);
            }
        }
        if (!Util.isWindows()) {
            if (_fileUnixPermissions != null) {
                try {
                    Files.setPosixFilePermissions(_path, _fileUnixPermissions);
                }
                catch (Exception _ex) {
                    void var5_8;
                    void var3_3;
                    Path path;
                    Object[] objectArray = new Object[3];
                    objectArray[0] = path;
                    objectArray[1] = var3_3;
                    objectArray[2] = var5_8;
                    LOGGER.error("Could not set file permissions of {} to {}", objectArray);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String getCurrentUser() {
        String[] stringArray = new String[3];
        stringArray[0] = "user.name";
        stringArray[1] = "USER";
        stringArray[2] = "USERNAME";
        String[] sysPropParms = stringArray;
        int i = 0;
        while (i < sysPropParms.length) {
            void var1_1;
            String val = System.getProperty(sysPropParms[i]);
            if (!Util.isEmpty(val)) {
                void var2_2;
                return var2_2;
            }
            ++var1_1;
        }
        return null;
    }

    public static boolean isBlank(String _str) {
        if (_str == null) {
            return true;
        }
        return _str.isBlank();
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Throwable> void waitFor(String _lockName, IThrowingSupplier<Boolean, T> _wait, long _timeoutMs, long _sleepTime) throws T {
        void var8_5;
        long waited = 0L;
        boolean wait = false;
        Throwable lastEx = null;
        do {
            try {
                lastEx = null;
                wait = _wait.get();
            }
            catch (Throwable _ex) {
                lastEx = _ex;
                wait = false;
            }
            if (waited >= _timeoutMs) {
                if (lastEx != null) {
                    throw lastEx;
                }
                throw new IllegalStateException(_lockName + " not available in the specified time of " + _timeoutMs + " ms");
            }
            try {
                Thread.sleep(_sleepTime);
            }
            catch (InterruptedException _ex) {
                LOGGER.debug("Interrupted while waiting for {}", (Object)_lockName);
                Thread.currentThread().interrupt();
                break;
            }
            waited += _sleepTime;
            Object[] objectArray = new Object[3];
            objectArray[0] = _lockName;
            objectArray[1] = waited;
            objectArray[2] = _timeoutMs;
            LOGGER.debug("Waiting for {} to be available: {} of {} ms waited", objectArray);
        } while (var8_5 == false);
    }

    public static String genGUID() {
        byte[] buf = new byte[16];
        RANDOM.nextBytes(buf);
        return Hexdump.toHex(buf, false);
    }

    public static boolean isFreeBsd() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase(Locale.US).startsWith("freebsd");
    }

    public static boolean isInteger(String _str, boolean _allowNegative) {
        if (_str == null) {
            return false;
        }
        Object regex = "[0-9]+$";
        regex = _allowNegative ? "^-?" + (String)regex : "^" + (String)regex;
        return _str.matches((String)regex);
    }

    /*
     * WARNING - void declaration
     */
    public static String randomString(int _length) {
        void var1_1;
        if (_length <= 0) {
            return "";
        }
        char[] buf = new char[_length];
        for (int idx = 0; idx < buf.length; ++idx) {
            buf[idx] = SYMBOLS[RANDOM.nextInt(SYMBOLS.length)];
        }
        return new String((char[])var1_1);
    }

    public static Type unwrapTypeRef(Class<?> _type) {
        return Arrays.stream(_type.getGenericInterfaces()).filter(ParameterizedType.class::isInstance).map(ParameterizedType.class::cast).filter(t -> TypeRef.class.equals((Object)t.getRawType())).map(t -> t.getActualTypeArguments()[0]).findFirst().orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    public static String createDynamicSessionAddress(boolean _listeningSocket, boolean _abstract) {
        void var2_2;
        Object address = "unix:";
        String path = new File(System.getProperty("java.io.tmpdir"), "dbus-XXXXXXXXXX").getAbsolutePath();
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; ++i) {
                sb.append((char)(Math.abs(RANDOM.nextInt(0, Integer.MAX_VALUE)) % 26) + 65);
            }
            path = path.replaceAll("..........$", sb.toString());
            LoggerFactory.getLogger(Util.class).trace("Trying path {}", (Object)path);
        } while (new File(path).exists());
        address = _abstract ? (String)address + "abstract=" + path : (String)address + "path=" + path;
        if (_listeningSocket) {
            address = (String)address + ",listen=true";
        }
        address = (String)address + ",guid=" + Util.genGUID();
        LoggerFactory.getLogger(Util.class).debug("Created Session address: {}", (Object)var2_2);
        return var2_2;
    }

    public static boolean isWindows() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase(Locale.US).startsWith("windows");
    }

    /*
     * WARNING - void declaration
     */
    public static boolean strEquals(String _str1, String _str2) {
        void var1_1;
        block6: {
            block5: {
                if (_str1 == _str2) {
                    return true;
                }
                if (_str1 == null) break block5;
                if (_str2 != null) break block6;
            }
            return false;
        }
        if (_str1.length() != _str2.length()) {
            return false;
        }
        return _str1.equals(var1_1);
    }

    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        }
        catch (UnknownHostException _ex) {
            return null;
        }
    }

    public static List<String> readFileToList(String _fileName) {
        return Util.getTextfileFromUrl(_fileName, Charset.defaultCharset(), false);
    }

    /*
     * WARNING - void declaration
     */
    public static int getJavaVersion() {
        void var0;
        String version = System.getProperty("java.version");
        if (version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(46);
            if (dot != -1) {
                void var1_1;
                version = version.substring(0, (int)var1_1);
            }
        }
        return Integer.parseInt((String)var0);
    }

    public static String readFileToString(File _file) {
        return String.join((CharSequence)System.lineSeparator(), Util.readFileToList(_file.getAbsolutePath()));
    }

    public static boolean isValidNetworkPort(String _str, boolean _allowWellKnown) {
        if (Util.isInteger(_str, false)) {
            return Util.isValidNetworkPort(Integer.parseInt(_str), _allowWellKnown);
        }
        return false;
    }

    public static Properties readProperties(InputStream _stream) {
        Properties props = new Properties();
        if (_stream == null) {
            return null;
        }
        try {
            props.load(_stream);
            return props;
        }
        catch (IOException | NumberFormatException _ex) {
            LOGGER.warn("Could not properties: ", _ex);
            return null;
        }
    }

    public static String upperCaseFirstChar(String _str) {
        if (_str == null) {
            return null;
        }
        if (_str.isEmpty()) {
            return _str;
        }
        return _str.substring(0, 1).toUpperCase() + _str.substring(1);
    }

    /*
     * WARNING - void declaration
     */
    public static List<String> getTextfileFromUrl(String _url, Charset _charset, boolean _silent) {
        if (_url == null) {
            return null;
        }
        Object fileUrl = _url;
        if (!((String)fileUrl).contains("://")) {
            fileUrl = "file://" + (String)fileUrl;
        }
        try {
            URL dlUrl = ((String)fileUrl).startsWith("file:/") ? new URL("file", "", ((String)fileUrl).replaceFirst("file:\\/{1,2}", "")) : new URL((String)fileUrl);
            URLConnection urlConn = dlUrl.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);
            return Util.readTextFileFromStream(urlConn.getInputStream(), _charset, _silent);
        }
        catch (IOException _ex) {
            if (!_silent) {
                void var4_5;
                LOGGER.warn("Error while reading file:", (Throwable)var4_5);
            }
            return null;
        }
    }

    public static Properties readProperties(File _file) {
        if (_file.exists()) {
            try {
                return Util.readProperties(new FileInputStream(_file));
            }
            catch (FileNotFoundException _ex) {
                LOGGER.info("Could not load properties file: " + String.valueOf(_file), _ex);
            }
        }
        return null;
    }

    public static boolean isEmpty(String _str) {
        if (_str == null) {
            return true;
        }
        return _str.isEmpty();
    }

    public static boolean isValidNetworkPort(int _port, boolean _allowWellKnown) {
        if (_allowWellKnown) {
            return _port > 0 && _port < 65536;
        }
        return _port > 1024 && _port < 65536;
    }

    public static String abbreviate(String _str, int _length) {
        if (_str == null) {
            return null;
        }
        if (_str.length() <= _length) {
            return _str;
        }
        return _str.substring(0, _length + -3) + "...";
    }
}

