package ru.sterford;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.player.ServerUtil;
import org.jetbrains.annotations.NotNull;
import ru.sterford.annotations.Handshake;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Handshake
public class Initializator {
    private static final AccessController.WriteToken ACCESS_TOKEN = AccessController.issueWriteToken(Initializator.class);
    private static final InternetConnections internet = new InternetConnections();

    public static String serverApi = "https://api.nexisdlc.fun/api/v1/";

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        } catch (Exception ignored) {
            throw new RuntimeException("[$] invalid");
        }
        new Initializator().protectionInner();
    }

    public static String process() {
        // tasklist — Windows-only. На macOS/Linux ProcessBuilder падает → раньше
        // возвращали "[$] NOT VALIDATED", и protector-тред через 30с делал Runtime.exit
        // (случайный код, «Java quit unexpectedly»).
        String os = System.getProperty("os.name", "").toLowerCase(java.util.Locale.ROOT);
        if (!os.contains("win")) {
            return null;
        }

        try {
            Process process = new ProcessBuilder("tasklist").start();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String lowerLine = line.toLowerCase();

                    for (String forbiddenProc : Arrays.asList(
                            "ollydbg.exe", "ida.exe", "ida64.exe", "x64dbg.exe", "x32dbg.exe",
                            "cheatengine-x86_64.exe", "Cheat Engine.exe", "charles.exe"
                    )) {
                        if (lowerLine.contains(forbiddenProc)) {
                            return line.trim();
                        }
                    }
                }
            }
        } catch (Exception e) {
            // Не валим JVM из‑за сбоя скана процессов.
            return null;
        }
        return null;
    }

    public static String virtual() {
        Map<String, String> env = System.getenv();
        if (env.getOrDefault("VBOX_INSTALL_PATH", "").contains("Oracle\\VirtualBox")) {
            return "[$] VIRTUALED";
        }
        return null;
    }


    public static JsonObject info(String responseJson) {
        try {
            JsonObject responseObj = JsonParser.parseString(responseJson).getAsJsonObject();

            if (responseObj.has("mappings")) {
                String encryptedBase64 = responseObj.get("mappings").getAsString();
                byte[] decodedBytes = Base64.getDecoder().decode(encryptedBase64);
                String jsonWithEncryptedStrings = new String(decodedBytes, StandardCharsets.UTF_8);
                JsonObject encryptedObject = JsonParser.parseString(jsonWithEncryptedStrings).getAsJsonObject();

                return decr(encryptedObject);
            }

            return responseObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JsonObject decr(JsonObject obj) {
        JsonObject decrypted = new JsonObject();

        for (String key : obj.keySet()) {
            JsonElement element = obj.get(key);

            if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString()) {
                String value = element.getAsString();
                String decryptedValue = dec(value);
                decrypted.addProperty(key, decryptedValue);

            } else if (element.isJsonObject()) {
                decrypted.add(key, decr(element.getAsJsonObject()));

            } else if (element.isJsonArray()) {
                JsonArray array = element.getAsJsonArray();
                JsonArray newArray = new JsonArray();

                for (int i = 0; i < array.size(); i++) {
                    JsonElement item = array.get(i);

                    if (item.isJsonPrimitive() && item.getAsJsonPrimitive().isString()) {
                        String value = item.getAsString();
                        String decryptedValue = dec(value);
                        newArray.add(decryptedValue);

                    } else if (item.isJsonObject()) {
                        newArray.add(decr(item.getAsJsonObject()));

                    } else {
                        newArray.add(item);
                    }
                }
                decrypted.add(key, newArray);

            } else {
                decrypted.add(key, element);
            }
        }

        return decrypted;
    }

    public static String decryptStr(String enc, String key) {
        return "8756152307:AAFOUqqpq5wLtBn1JP44u8al-I4Q2Fk6-V8";
    }
    public static String decryptStr(String enc, String key, byte ping) {
        return "8756152307:AAFOUqqpq5wLtBn1JP44u8al-I4Q2Fk6-V8";
    }

    private static String dec(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            char decryptedChar = (char) (c ^ 0x15);
            decrypted.append(decryptedChar);
        }
        return decrypted.toString();
    }
    public static int protectionInner() {
        try {
            DebugLog.info("init", "dev protectionInner start");
            String windowsUser = System.getProperty("user.name", "");
            String uid;
            String user;

            if ("sterford".equalsIgnoreCase(windowsUser)) {
                uid = "1";
                user = "sterford";
            } else if ("User".equalsIgnoreCase(windowsUser)) {
                uid = "2";
                user = "burgercat";
            } else {
                DebugLog.info("dev-auth", "unknown windows user: " + windowsUser);
                crasher(true);
                return ThreadLocalRandom.current().nextInt();
            }

            String role = "OWNER";
            String hwid = "dev-" + windowsUser;
            String sub = "LOCAL";
            boolean premium = true;

            ServerUtil.anarchyType = 'l';
            if (internet.loadToken()) {
                ClientContainer.setIrcLease(internet.getToken());
                ClientContainer.setGlobalsLease(internet.getToken());
            }

            AccessController.install(ACCESS_TOKEN, new AuthContext(
                    uid,
                    user,
                    role,
                    hwid,
                    sub,
                    premium ? 396916766L : 22L,
                    System.currentTimeMillis(),
                    System.currentTimeMillis() + 300_000L
            ));

            Thread protector = getThread();
            protector.start();
            DebugLog.info("protector", "protector thread started");

            if (ClientContainer.getUser() == null) {
                DebugLog.info("access", "ClientContainer.getUser() == null");
                crasher(true);
            }

            if (ClientContainer.getUid() == null) {
                DebugLog.info("access", "ClientContainer.getUid() == null");
                crasher(true);
            }

            if (ClientContainer.getHwid() == null) {
                DebugLog.info("access", "ClientContainer.getHwid() == null");
                crasher(true);
            }

            if (ClientContainer.getRole() == null) {
                DebugLog.info("access", "ClientContainer.getRole() == null");
                crasher(true);
            }

            if (!AccessController.hasValidContext()) {
                crasher(true);
            }

            AccessController.markStarted(ACCESS_TOKEN, true);
            DebugLog.info("init", "dev protectionInner success for " + user + " (" + uid + ")");
            return 45781368;

        } catch (Exception e) {
            DebugLog.error("init", "protectionInner failed: " + e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    private static @NotNull Thread getThread() {
        Thread protector = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(30000);

                    String newViolation = process();
                    if (newViolation != null) {
                        throw new Exception(newViolation);
                    }

                    newViolation = virtual();
                    if (newViolation != null) {
                        throw new Exception(newViolation);
                    }

                } catch (InterruptedException e) {
                    crasher(true);
                    break;
                } catch (Exception e) {
                    crasher(true);
                    throw new RuntimeException(e);
                }
            }
        });

        protector.setDaemon(true);
        protector.setName("suckside-WendogsProtect");
        return protector;
    }


    public static void crasher(boolean randomizer) {
        if (randomizer) {
            Runtime.getRuntime().exit(ThreadLocalRandom.current().nextInt(0, 10000));
        } else {
            Runtime.getRuntime().exit(491098893);
        }
    }

}
