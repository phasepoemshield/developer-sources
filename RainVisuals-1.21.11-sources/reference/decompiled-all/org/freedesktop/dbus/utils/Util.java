package org.freedesktop.dbus.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.freedesktop.dbus.TypeRef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from Util.java
public final class Util {
   private static final Random RANDOM = new Random();
   private static final Logger LOGGER = LoggerFactory.getLogger(Util.class);
   private static final char[] SYMBOLS;

   public static Object[] toObjectArray(Object _obj) {
      if (_obj != null && _obj.getClass().isArray()) {
         int length = Array.getLength(_obj);
         Object[] ret = new Object[length];

         for (int i = 0; i < length; i++) {
            ret[i] = Array.get(_obj, i);
         }

         return ret;
      } else {
         return new Object[0];
      }
   }

   public static boolean isMacOs() {
      String osName = System.getProperty("os.name");
      return osName != null && osName.toLowerCase(Locale.US).startsWith("mac");
   }

   public static List<String> readTextFileFromStream(InputStream _input, Charset _silent, boolean _charset) {
      if (_input == null) {
         return null;
      }

      try {
         ArrayList _ex;
         try (BufferedReader dis = new BufferedReader(new InputStreamReader(_input, _charset))) {
            _ex = new ArrayList();

            String s;
            while ((s = dis.readLine()) != null) {
               _ex.add(s);
            }
         }

         return !_ex.isEmpty() ? _ex : null;
      } catch (IOException var9) {
         if (!_silent) {
            LOGGER.warn("Error while reading file:", var9);
         }

         return null;
      }
   }

   public static boolean writeTextFile(String _charset, String _fileContent, Charset _append, boolean _fileName) {
      if (isBlank(_fileName)) {
         return false;
      }

      String allText = "";
      if (_append) {
         File _ex = new File(_fileName);
         if (_ex.exists()) {
            allText = readFileToString(_ex);
         }
      }

      allText = allText + _fileContent;

      try (OutputStreamWriter var12 = new OutputStreamWriter(new FileOutputStream(_fileName), _charset)) {
         var12.write(allText);
      } catch (IOException var10) {
         LOGGER.error("Could not write file to '" + _fileName + "'", var10);
         return false;
      }

      return true;
   }

   public static String snakeToCamelCase(String _input) {
      if (isBlank(_input)) {
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

      return result;
   }

   private Util() {
   }

   public static <T> boolean collectionContainsAny(Collection<T> _needles, Collection<T> _haystack) {
      if (_haystack != null && _needles != null) {
         for (T t : _needles) {
            if (_haystack.contains(t)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static {
      StringBuilder tmp = new StringBuilder();

      for (char ch = '0'; ch <= '9'; ch++) {
         tmp.append(ch);
      }

      for (char ch = 'a'; ch <= 'z'; ch++) {
         tmp.append(ch);
      }

      for (char ch = 'A'; ch <= 'Z'; ch++) {
         tmp.append(ch);
      }

      SYMBOLS = tmp.toString().toCharArray();
   }

   public static int checkIntInRange(int _min, int _check, int _max) {
      if (_check >= _min && _check <= _max) {
         return _check;
      } else {
         throw new IllegalArgumentException("Value " + _check + " is out ouf range (< " + _min + " && > " + _max + ")");
      }
   }

   public static void setFilePermissions(Path _fileUnixPermissions, String _fileOwner, String _path, Set<PosixFilePermission> _fileGroup) {
      Objects.requireNonNull(_path, "Path required");
      UserPrincipalLookupService userPrincipalLookupService = _path.getFileSystem().getUserPrincipalLookupService();
      if (userPrincipalLookupService == null) {
         LOGGER.error("Unable to set user/group permissions on {}", _path);
      } else {
         if (!isBlank(_fileOwner)) {
            try {
               UserPrincipal userPrincipal = userPrincipalLookupService.lookupPrincipalByName(_fileOwner);
               if (userPrincipal != null) {
                  Files.getFileAttributeView(_path, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS).setOwner(userPrincipal);
               }
            } catch (IOException var8) {
               LOGGER.error("Could not change owner of {} to {}", _path, _fileOwner, var8);
            }
         }

         if (!isBlank(_fileGroup)) {
            try {
               IOException _ex = userPrincipalLookupService.lookupPrincipalByGroupName(_fileGroup);
               if (_ex != null) {
                  Files.getFileAttributeView(_path, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS).setGroup(_ex);
               }
            } catch (IOException var7) {
               LOGGER.error("Could not change group of {} to {}", _path, _fileGroup, var7);
            }
         }

         if (!isWindows() && _fileUnixPermissions != null) {
            try {
               Files.setPosixFilePermissions(_path, _fileUnixPermissions);
            } catch (Exception var6) {
               LOGGER.error("Could not set file permissions of {} to {}", _path, _fileUnixPermissions, var6);
            }
         }
      }
   }

   public static String getCurrentUser() {
      String[] sysPropParms = new String[]{"user.name", "USER", "USERNAME"};

      for (int i = 0; i < sysPropParms.length; i++) {
         String val = System.getProperty(sysPropParms[i]);
         if (!isEmpty(val)) {
            return val;
         }
      }

      return null;
   }

   public static boolean isBlank(String _str) {
      return _str == null ? true : _str.isBlank();
   }

   public static <T extends Throwable> void waitFor(String _lockName, IThrowingSupplier<Boolean, T> _sleepTime, long _timeoutMs, long _wait) throws T {
      long waited = 0L;
      boolean wait = false;
      T lastEx = null;

      do {
         try {
            lastEx = null;
            wait = _wait.get();
         } catch (Throwable var11) {
            lastEx = var11;
            wait = false;
         }

         if (waited >= _timeoutMs) {
            if (lastEx != null) {
               throw (Throwable)lastEx;
            }

            throw new IllegalStateException(_lockName + " not available in the specified time of " + _timeoutMs + " ms");
         }

         try {
            Thread.sleep(_sleepTime);
         } catch (InterruptedException var12) {
            LOGGER.debug("Interrupted while waiting for {}", _lockName);
            Thread.currentThread().interrupt();
            return;
         }

         waited += _sleepTime;
         LOGGER.debug("Waiting for {} to be available: {} of {} ms waited", _lockName, waited, _timeoutMs);
      } while (!wait);
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

      String regex = "[0-9]+$";
      if (_allowNegative) {
         regex = "^-?" + regex;
      } else {
         regex = "^" + regex;
      }

      return _str.matches(regex);
   }

   public static String randomString(int _length) {
      if (_length <= 0) {
         return "";
      }

      char[] buf = new char[_length];

      for (int idx = 0; idx < buf.length; idx++) {
         buf[idx] = SYMBOLS[RANDOM.nextInt(SYMBOLS.length)];
      }

      return new String(buf);
   }

   public static Type unwrapTypeRef(Class<?> _type) {
      return Arrays.stream(_type.getGenericInterfaces())
         .filter(ParameterizedType.class::isInstance)
         .map(ParameterizedType.class::cast)
         .filter(t -> TypeRef.class.equals(t.getRawType()))
         .map(t -> t.getActualTypeArguments()[0])
         .findFirst()
         .orElse(null);
   }

   public static String createDynamicSessionAddress(boolean _listeningSocket, boolean _abstract) {
      String address = "unix:";
      String path = new File(System.getProperty("java.io.tmpdir"), "dbus-XXXXXXXXXX").getAbsolutePath();

      do {
         StringBuilder sb = new StringBuilder();

         for (int i = 0; i < 10; i++) {
            sb.append((char)(Math.abs(RANDOM.nextInt(0, Integer.MAX_VALUE)) % 26) + 'A');
         }

         path = path.replaceAll("..........$", sb.toString());
         LoggerFactory.getLogger(Util.class).trace("Trying path {}", path);
      } while (new File(path).exists());

      if (_abstract) {
         address = address + "abstract=" + path;
      } else {
         address = address + "path=" + path;
      }

      if (_listeningSocket) {
         address = address + ",listen=true";
      }

      address = address + ",guid=" + genGUID();
      LoggerFactory.getLogger(Util.class).debug("Created Session address: {}", address);
      return address;
   }

   public static boolean isWindows() {
      String osName = System.getProperty("os.name");
      return osName != null && osName.toLowerCase(Locale.US).startsWith("windows");
   }

   public static boolean strEquals(String _str2, String _str1) {
      if (_str1 == _str2) {
         return true;
      } else if (_str1 != null && _str2 != null) {
         return _str1.length() != _str2.length() ? false : _str1.equals(_str2);
      } else {
         return false;
      }
   }

   public static String getHostName() {
      try {
         return InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException _ex) {
         return null;
      }
   }

   public static List<String> readFileToList(String _fileName) {
      return getTextfileFromUrl(_fileName, Charset.defaultCharset(), false);
   }

   public static int getJavaVersion() {
      String version = System.getProperty("java.version");
      if (version.startsWith("1.")) {
         version = version.substring(2, 3);
      } else {
         int dot = version.indexOf(46);
         if (dot != -1) {
            version = version.substring(0, dot);
         }
      }

      return Integer.parseInt(version);
   }

   public static String readFileToString(File _file) {
      return String.join(System.lineSeparator(), readFileToList(_file.getAbsolutePath()));
   }

   public static boolean isValidNetworkPort(String _str, boolean _allowWellKnown) {
      return isInteger(_str, false) ? isValidNetworkPort(Integer.parseInt(_str), _allowWellKnown) : false;
   }

   public static Properties readProperties(InputStream _stream) {
      Properties props = new Properties();
      if (_stream == null) {
         return null;
      }

      try {
         props.load(_stream);
         return props;
      } catch (IOException | NumberFormatException var3) {
         LOGGER.warn("Could not properties: ", var3);
         return null;
      }
   }

   public static String upperCaseFirstChar(String _str) {
      if (_str == null) {
         return null;
      } else {
         return _str.isEmpty() ? _str : _str.substring(0, 1).toUpperCase() + _str.substring(1);
      }
   }

   public static List<String> getTextfileFromUrl(String _url, Charset _charset, boolean _silent) {
      if (_url == null) {
         return null;
      }

      String fileUrl = _url;
      if (!fileUrl.contains("://")) {
         fileUrl = "file://" + fileUrl;
      }

      try {
         URL _ex;
         if (fileUrl.startsWith("file:/")) {
            _ex = new URL("file", "", fileUrl.replaceFirst("file:\\/{1,2}", ""));
         } else {
            _ex = new URL(fileUrl);
         }

         URLConnection urlConn = _ex.openConnection();
         urlConn.setDoInput(true);
         urlConn.setUseCaches(false);
         return readTextFileFromStream(urlConn.getInputStream(), _charset, _silent);
      } catch (IOException var6) {
         if (!_silent) {
            LOGGER.warn("Error while reading file:", var6);
         }

         return null;
      }
   }

   public static Properties readProperties(File _file) {
      if (_file.exists()) {
         try {
            return readProperties(new FileInputStream(_file));
         } catch (FileNotFoundException _ex) {
            LOGGER.info("Could not load properties file: " + _file, _ex);
         }
      }

      return null;
   }

   public static boolean isEmpty(String _str) {
      return _str == null ? true : _str.isEmpty();
   }

   public static boolean isValidNetworkPort(int _allowWellKnown, boolean _port) {
      return _allowWellKnown ? _port > 0 && _port < 65536 : _port > 1024 && _port < 65536;
   }

   public static String abbreviate(String _str, int _length) {
      if (_str == null) {
         return null;
      } else {
         return _str.length() <= _length ? _str : _str.substring(0, _length + -3) + "...";
      }
   }
}
