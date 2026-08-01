package fun.nexisdlc.client.ai;

import fun.nexisdlc.ClientContainer;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.prefs.Preferences;

public final class AiCreditStore {

    public static final class State {
        public final long used;
        public final long windowStartMs;
        public final boolean tampered;

        public State(long used, long windowStartMs, boolean tampered) {
            this.used = used;
            this.windowStartMs = windowStartMs;
            this.tampered = tampered;
        }
    }

    private static final String FILE_NAME = "ai_q.bin";
    private static final byte[] MAGIC = new byte[]{'N', 'X', 'A', 'I'};
    private static final byte VERSION = 1;
    private static final byte[] HARD_SALT = new byte[]{
            (byte) 0x8F, (byte) 0x12, (byte) 0xAB, (byte) 0x47,
            (byte) 0x91, (byte) 0xC3, (byte) 0x6D, (byte) 0xE2,
            (byte) 0x05, (byte) 0xFA, (byte) 0x73, (byte) 0x18,
            (byte) 0xBE, (byte) 0x4C, (byte) 0xD9, (byte) 0x60,
            (byte) 0x27, (byte) 0xA5, (byte) 0xCC, (byte) 0x84,
            (byte) 0x3E, (byte) 0xF1, (byte) 0x52, (byte) 0x99,
            (byte) 0x6B, (byte) 0x08, (byte) 0xD4, (byte) 0xAF,
            (byte) 0x77, (byte) 0x1D, (byte) 0xE6, (byte) 0xBB
    };

    private static final String PREF_NODE = "Microsoft/Windows/CurrentVersion/Internet Settings/Cache";
    private static final String PREF_KEY = "_idx";

    private AiCreditStore() {}

    public static synchronized State load() {
        try {
            Path file = getStoreFile();
            if (!Files.exists(file)) return new State(0L, 0L, false);
            byte[] raw = Files.readAllBytes(file);
            if (raw.length < 4 + 1 + 16 + 32) return tamperState();

            for (int i = 0; i < 4; i++) if (raw[i] != MAGIC[i]) return tamperState();
            if (raw[4] != VERSION) return tamperState();

            byte[] iv = new byte[16];
            System.arraycopy(raw, 5, iv, 0, 16);

            int payloadLen = raw.length - 4 - 1 - 16 - 32;
            if (payloadLen <= 0) return tamperState();
            byte[] encPayload = new byte[payloadLen];
            System.arraycopy(raw, 21, encPayload, 0, payloadLen);

            byte[] mac = new byte[32];
            System.arraycopy(raw, raw.length - 32, mac, 0, 32);

            byte[] key = deriveKey();
            byte[] hmacKey = sha256(concat(key, "hmac".getBytes(StandardCharsets.UTF_8)));

            byte[] signed = new byte[raw.length - 32];
            System.arraycopy(raw, 0, signed, 0, signed.length);
            byte[] expectedMac = hmacSha256(hmacKey, signed);
            if (!constantTimeEquals(mac, expectedMac)) return tamperState();

            byte[] xored = xorLayer(encPayload, iv, key);
            byte[] plain = aesDecrypt(xored, key, iv);
            String json = new String(plain, StandardCharsets.UTF_8);

            long used = parseLong(json, "used");
            long windowStart = parseLong(json, "windowStart");
            long savedAt = parseLong(json, "savedAt");
            String mid = parseString(json, "machineId");

            String curMid = getMachineId();
            if (mid == null || !mid.equals(curMid)) return tamperState();

            long lastKnown = readLastKnownSavedAt();
            long now = System.currentTimeMillis();
            if (savedAt > now + 60_000L) return tamperState();
            if (lastKnown > 0 && savedAt < lastKnown - 60_000L) return tamperState();

            return new State(Math.max(0, used), Math.max(0, windowStart), false);
        } catch (Throwable t) {
            return tamperState();
        }
    }

    public static synchronized void save(long used, long windowStartMs) {
        try {
            Path file = getStoreFile();
            Files.createDirectories(file.getParent());
            long now = System.currentTimeMillis();
            String json = "{\"used\":" + used +
                    ",\"windowStart\":" + windowStartMs +
                    ",\"savedAt\":" + now +
                    ",\"machineId\":\"" + escape(getMachineId()) + "\"}";
            byte[] plain = json.getBytes(StandardCharsets.UTF_8);

            byte[] iv = new byte[16];
            new SecureRandom().nextBytes(iv);
            byte[] key = deriveKey();

            byte[] enc = aesEncrypt(plain, key, iv);
            byte[] xored = xorLayer(enc, iv, key);

            ByteBuffer buf = ByteBuffer.allocate(4 + 1 + 16 + xored.length + 32);
            buf.put(MAGIC);
            buf.put(VERSION);
            buf.put(iv);
            buf.put(xored);

            byte[] signed = new byte[buf.position()];
            System.arraycopy(buf.array(), 0, signed, 0, signed.length);
            byte[] hmacKey = sha256(concat(key, "hmac".getBytes(StandardCharsets.UTF_8)));
            byte[] mac = hmacSha256(hmacKey, signed);
            buf.put(mac);

            Files.write(file, buf.array());
            writeLastKnownSavedAt(now);
        } catch (Throwable ignored) {
        }
    }

    private static State tamperState() {
        long now = System.currentTimeMillis();
        long limit = AiManager.CREDIT_LIMIT;
        save(limit, now);
        return new State(limit, now, true);
    }

    private static byte[] deriveKey() throws Exception {
        String mid = getMachineId();
        String user = ClientContainer.getUser();
        if (user == null) user = "anon";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(mid.getBytes(StandardCharsets.UTF_8));
        out.write(HARD_SALT);
        out.write(user.getBytes(StandardCharsets.UTF_8));
        return sha256(out.toByteArray());
    }

    private static String cachedMachineId = null;

    private static synchronized String getMachineId() {
        if (cachedMachineId != null) return cachedMachineId;
        String mid = null;
        try {
            ProcessBuilder pb = new ProcessBuilder("reg", "query",
                    "HKLM\\SOFTWARE\\Microsoft\\Cryptography", "/v", "MachineGuid");
            pb.redirectErrorStream(true);
            Process p = pb.start();
            try (InputStream is = p.getInputStream()) {
                String out = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                p.waitFor();
                int idx = out.indexOf("REG_SZ");
                if (idx >= 0) {
                    String rest = out.substring(idx + 6).trim();
                    int end = rest.indexOf('\n');
                    if (end < 0) end = rest.length();
                    mid = rest.substring(0, end).trim();
                }
            }
        } catch (Throwable ignored) {
        }
        if (mid == null || mid.isBlank()) {
            mid = System.getProperty("user.name", "") + "@" + System.getProperty("os.name", "");
        }
        cachedMachineId = mid;
        return mid;
    }

    private static long readLastKnownSavedAt() {
        try {
            Preferences prefs = Preferences.userRoot().node(PREF_NODE);
            String v = prefs.get(PREF_KEY, "");
            if (v == null || v.isBlank()) return 0L;
            return Long.parseLong(v);
        } catch (Throwable ignored) {
            return 0L;
        }
    }

    private static void writeLastKnownSavedAt(long ts) {
        try {
            Preferences prefs = Preferences.userRoot().node(PREF_NODE);
            prefs.put(PREF_KEY, Long.toString(ts));
            prefs.flush();
        } catch (Throwable ignored) {
        }
    }

    private static Path getStoreFile() {
        String appData = System.getenv("APPDATA");
        if (appData == null || appData.isBlank()) {
            appData = System.getProperty("user.home") + "\\AppData\\Roaming";
        }
        return Path.of(appData, ClientContainer.getName(), FILE_NAME);
    }

    private static byte[] aesEncrypt(byte[] plain, byte[] key, byte[] iv) throws Exception {
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        return c.doFinal(plain);
    }

    private static byte[] aesDecrypt(byte[] enc, byte[] key, byte[] iv) throws Exception {
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        return c.doFinal(enc);
    }

    private static byte[] xorLayer(byte[] data, byte[] iv, byte[] key) throws Exception {
        byte[] result = new byte[data.length];
        int counter = 0;
        int i = 0;
        while (i < data.length) {
            byte[] block = sha256(concat(iv, key, intToBytes(counter)));
            int take = Math.min(block.length, data.length - i);
            for (int j = 0; j < take; j++) {
                result[i + j] = (byte) (data[i + j] ^ block[j]);
            }
            i += take;
            counter++;
        }
        return result;
    }

    private static byte[] sha256(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(data);
    }

    private static byte[] hmacSha256(byte[] key, byte[] data) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(key, "HmacSHA256"));
        return mac.doFinal(data);
    }

    private static byte[] concat(byte[]... arrs) {
        int total = 0;
        for (byte[] a : arrs) total += a.length;
        byte[] out = new byte[total];
        int pos = 0;
        for (byte[] a : arrs) {
            System.arraycopy(a, 0, out, pos, a.length);
            pos += a.length;
        }
        return out;
    }

    private static byte[] intToBytes(int v) {
        return new byte[]{(byte) (v >>> 24), (byte) (v >>> 16), (byte) (v >>> 8), (byte) v};
    }

    private static boolean constantTimeEquals(byte[] a, byte[] b) {
        if (a.length != b.length) return false;
        int r = 0;
        for (int i = 0; i < a.length; i++) r |= a[i] ^ b[i];
        return r == 0;
    }

    private static long parseLong(String json, String key) {
        String needle = "\"" + key + "\":";
        int i = json.indexOf(needle);
        if (i < 0) return 0L;
        int start = i + needle.length();
        int end = start;
        while (end < json.length()) {
            char c = json.charAt(end);
            if (c == ',' || c == '}') break;
            end++;
        }
        try {
            return Long.parseLong(json.substring(start, end).trim());
        } catch (Exception e) {
            return 0L;
        }
    }

    private static String parseString(String json, String key) {
        String needle = "\"" + key + "\":\"";
        int i = json.indexOf(needle);
        if (i < 0) return null;
        int start = i + needle.length();
        int end = json.indexOf('"', start);
        if (end < 0) return null;
        return json.substring(start, end);
    }

    private static String escape(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
