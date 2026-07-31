package fun.nexisdlc.client.utils.connection;

import fun.nexisdlc.ui.screen.proxy.ProxyHandler;
import lombok.Getter;
import net.minecraft.util.Formatting;

import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class ProxyProcessManager {
    private static ProxyProcessManager instance;

    public String bindIp = "127.0.0.1";
    public int bindPort = 25565;
    public String targetHost = "";
    public int targetPort = 25565;
    public String detectedSrvInfo = "";

    @Getter
    private volatile int controlPort = -1;

    private volatile Process proxyProcess;
    private volatile Socket ctrlSocket;
    private volatile PrintWriter ctrlWriter;
    private volatile BufferedReader ctrlReader;
    private final Object ctrlLock = new Object();

    private static final int PORT_SCAN_RANGE = 5;

    public static synchronized ProxyProcessManager get() {
        if (instance == null) instance = new ProxyProcessManager();
        return instance;
    }

    static int computeControlPort(int bindPort) {
        int p = bindPort + 30000;
        return (p > 65000) ? 40000 + (bindPort % 20000) : p;
    }

    public String start(String localIp, int localPort, String targetRaw) {
        this.bindIp = (localIp == null || localIp.isBlank()) ? "127.0.0.1" : localIp.trim();
        this.bindPort = localPort;

        TargetAddress addr = resolveTarget(targetRaw);
        if (addr == null) return Formatting.RED + "Не удалось разрешить адрес: " + targetRaw;

        this.targetHost = addr.host();
        this.targetPort = addr.port();

        if (tryReconnect()) {
            String st = sendCommand("STATUS");
            String expectedUpstream = expectedUpstreamStatusToken();
            if (st == null || !st.contains("cmp=") || !st.contains("upstream=" + expectedUpstream)) {
                restartConnectedProxy();
            }
        }

        if (tryReconnect()) {
            String r = sendCommand("TARGET " + targetHost + " " + targetPort);
            if (r != null && r.startsWith("OK")) {
                long pid = getRemotePid();
                String msg = Formatting.GREEN + "Прокси (процесс): переподключено" +
                        (pid > 0 ? " PID " + pid : "") +
                        Formatting.WHITE + " -> " + Formatting.AQUA + targetHost + ":" + targetPort;
                if (!detectedSrvInfo.isEmpty()) msg += Formatting.GRAY + " (" + detectedSrvInfo + ")";
                return msg;
            }
            disconnectCtrl();
        }

        try {
            launch();
            long pid = getRemotePid();
            String msg = Formatting.GREEN + "Прокси: " + Formatting.AQUA + bindIp + ":" + bindPort +
                    Formatting.WHITE + " -> " + Formatting.AQUA + targetHost + ":" + targetPort;
            if (pid > 0) msg += Formatting.GRAY + " (PID " + pid + ")";
            if (!detectedSrvInfo.isEmpty()) msg += Formatting.GRAY + " (" + detectedSrvInfo + ")";
            return msg;
        } catch (Exception e) {
            return Formatting.RED + "Ошибка запуска: " + e.getMessage();
        }
    }

    private void restartConnectedProxy() {
        long pid = getRemotePid();
        sendCommand("STOP");
        disconnectCtrl();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
        if (pid > 0) {
            ProcessHandle.of(pid).filter(ProcessHandle::isAlive).ifPresent(ProcessHandle::destroyForcibly);
        }
        proxyProcess = null;
        controlPort = -1;
    }

    public String switchControl() {
        if (!ensureConnected()) return Formatting.RED + "Прокси-процесс недоступен.";
        String r = sendCommand("SWITCH");
        if (r == null) return Formatting.RED + "Нет ответа.";

        if (r.startsWith("ERROR disabled")) {
            return Formatting.YELLOW + "Ручной switch отключён (строгий Takker-режим). Второй клиент станет активным только после отключения первого.";
        }

        if (r.startsWith("SWITCHED")) {
            return Formatting.GREEN + "Управление: Клиент #" + (Integer.parseInt(r.substring(9).trim()) + 1);
        }

        if (r.startsWith("ERROR")) {
            String e = r.substring(6);
            return switch (e) {
                case "no_clients" -> Formatting.RED + "Нет подключений.";
                case "only_one" -> Formatting.YELLOW + "Только 1 подключение.";
                default -> Formatting.RED + "Ошибка: " + e;
            };
        }

        return Formatting.RED + r;
    }

    public void stop() {
        long pid = -1;
        if (ensureConnected()) {
            pid = getRemotePid();
            sendCommand("STOP");
        }

        disconnectCtrl();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ignored) {
        }

        if (pid > 0) ProcessHandle.of(pid).filter(ProcessHandle::isAlive).ifPresent(ProcessHandle::destroyForcibly);
        if (proxyProcess != null && proxyProcess.isAlive()) proxyProcess.destroyForcibly();

        proxyProcess = null;
        controlPort = -1;
    }

    public void detach() {
        disconnectCtrl();
    }

    public boolean isRunning() {
        return ensureConnected() && "PONG nxp".equals(sendCommand("PING"));
    }

    public List<String> getDebugStatusLines() {
        List<String> lines = new ArrayList<>();
        boolean ok = ensureConnected();
        lines.add("Proxy Process: " + (ok ? Formatting.GREEN + "CONNECTED" : Formatting.RED + "DISCONNECTED"));

        if (ok) {
            long pid = getRemotePid();
            if (pid > 0) lines.add("PID: " + Formatting.AQUA + pid);
           // String st = sendCommand("STATUS");
        //    if (st != null) lines.add(Formatting.GRAY + st);
        }

        if (!targetHost.isEmpty()) lines.add("Target: " + Formatting.AQUA + targetHost + ":" + targetPort);
        if (!detectedSrvInfo.isEmpty()) lines.add(Formatting.GRAY + detectedSrvInfo);
        return lines;
    }

    public boolean pushMainPosition(double x, double y, double z, float yaw, float pitch) {
        if (!ensureConnected()) return false;
        if (!Double.isFinite(x) || !Double.isFinite(y) || !Double.isFinite(z)
                || !Float.isFinite(yaw) || !Float.isFinite(pitch)) return false;

        String cmd = String.format(Locale.US, "SETPOS %.5f %.5f %.5f %.4f %.4f", x, y, z, yaw, pitch);
        String r = sendCommand(cmd);
        if (r != null && r.startsWith("OK")) return true;
        if (!tryReconnect()) return false;
        r = sendCommand(cmd);
        return r != null && r.startsWith("OK");
    }

    private void launch() throws Exception {
        int base = computeControlPort(bindPort);
        int ctrlPort = findFreeInRange(base, PORT_SCAN_RANGE);
        if (ctrlPort < 0) throw new RuntimeException("Нет свободного control-порта в диапазоне " + base + "-" + (base + PORT_SCAN_RANGE));

        String java = findJava();
        String cp = findClasspath();

        List<String> cmd = new ArrayList<>();
        cmd.add(java);
        cmd.add("-cp");
        cmd.add(cp);
        cmd.add(StandaloneProxy.class.getName());

        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.environment().put("PROXY_CFG", ctrlPort + "," + bindIp + "," + bindPort + "," + targetHost + "," + targetPort);
        applyUpstreamProxyEnv(pb.environment());

        Path logFile = Path.of(System.getProperty("java.io.tmpdir"), "rt_" + ctrlPort + ".log");
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(logFile.toFile()));
        pb.redirectErrorStream(true);

        boolean win = System.getProperty("os.name", "").toLowerCase().contains("win");
        pb.redirectInput(ProcessBuilder.Redirect.from(new File(win ? "NUL" : "/dev/null")));

        try {
            proxyProcess = pb.start();
            System.out.println("[PPM] Launched PID " + proxyProcess.pid() + " ctrl=" + ctrlPort);

            for (int i = 0; i < 50; i++) {
                Thread.sleep(100);
                if (!proxyProcess.isAlive()) {
                    throw new RuntimeException("Process terminated (exit " + proxyProcess.exitValue() + "), log: " + logFile);
                }
                if (connectCtrl(ctrlPort)) {
                    controlPort = ctrlPort;
                    return;
                }
            }

            throw new RuntimeException("Failed to connect to control port in 5s. Log: " + logFile);
        } catch (Exception externalFail) {
            if (proxyProcess != null && proxyProcess.isAlive()) {
                proxyProcess.destroyForcibly();
            }
            proxyProcess = null;
            disconnectCtrl();
            launchEmbedded(ctrlPort);
            controlPort = ctrlPort;
            System.out.println("[PPM] External proxy failed, switched to embedded mode: " + externalFail.getMessage());
        }
    }

    private void launchEmbedded(int ctrlPort) throws Exception {
        applyUpstreamProxyProps();
        StandaloneProxy.startEmbedded(ctrlPort, bindIp, bindPort, targetHost, targetPort);
        for (int i = 0; i < 50; i++) {
            Thread.sleep(100);
            if (connectCtrl(ctrlPort)) return;
        }
        throw new RuntimeException("Embedded proxy failed to open control port " + ctrlPort);
    }

    private boolean tryReconnect() {
        int base = computeControlPort(bindPort);
        for (int off = 0; off < PORT_SCAN_RANGE; off++) {
            int port = base + off;
            if (port > 65535) break;
            if (connectCtrl(port)) {
                String r = sendCommand("PING");
                if ("PONG nxp".equals(r)) {
                    controlPort = port;
                    System.out.println("[PPM] Reconnected on port " + port);
                    return true;
                }
                disconnectCtrl();
            }
        }
        return false;
    }

    private boolean connectCtrl(int port) {
        synchronized (ctrlLock) {
            try {
                Socket s = new Socket(Proxy.NO_PROXY);
                s.connect(new InetSocketAddress("127.0.0.1", port), 1000);
                s.setTcpNoDelay(true);
                s.setSoTimeout(5000);
                ctrlSocket = s;
                ctrlWriter = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), StandardCharsets.UTF_8), true);
                ctrlReader = new BufferedReader(new InputStreamReader(s.getInputStream(), StandardCharsets.UTF_8));
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    private boolean ensureConnected() {
        synchronized (ctrlLock) {
            if (ctrlSocket != null && !ctrlSocket.isClosed()) return true;
            return tryReconnect();
        }
    }

    private String sendCommand(String cmd) {
        synchronized (ctrlLock) {
            if (ctrlWriter == null || ctrlReader == null) return null;
            try {
                ctrlWriter.println(cmd);
                return ctrlReader.readLine();
            } catch (Exception e) {
                disconnectCtrl();
                return null;
            }
        }
    }

    private long getRemotePid() {
        String r = sendCommand("PID");
        if (r != null && r.startsWith("PID ")) {
            try {
                return Long.parseLong(r.substring(4).trim());
            } catch (Exception ignored) {
            }
        }
        return -1;
    }

    private void disconnectCtrl() {
        synchronized (ctrlLock) {
            try {
                if (ctrlSocket != null) ctrlSocket.close();
            } catch (Exception ignored) {
            }
            ctrlSocket = null;
            ctrlWriter = null;
            ctrlReader = null;
        }
    }

    private static int findFreeInRange(int base, int range) {
        for (int off = 0; off < range; off++) {
            int port = base + off;
            if (port > 65535) continue;
            try (ServerSocket ss = new ServerSocket(port)) {
                ss.setReuseAddress(true);
                return port;
            } catch (IOException ignored) {
            }
        }
        return -1;
    }

    private static String findJava() {
        String home = System.getProperty("java.home");
        String sep = File.separator;
        boolean win = System.getProperty("os.name", "").toLowerCase().contains("win");
        File javaw = new File(home + sep + "bin" + sep + (win ? "javaw.exe" : "java"));
        if (javaw.exists()) return javaw.getAbsolutePath();
        return home + sep + "bin" + sep + (win ? "java.exe" : "java");
    }

    private static String findClasspath() {
        String sysCp = System.getProperty("java.class.path", "");
        LinkedHashSet<String> entries = new LinkedHashSet<>();

        if (sysCp != null && !sysCp.isBlank()) {
            String sep = File.pathSeparator;
            for (String e : sysCp.split(java.util.regex.Pattern.quote(sep))) {
                if (e != null && !e.isBlank()) entries.add(e.trim());
            }
        }

        try {
            var cs = ProxyProcessManager.class.getProtectionDomain().getCodeSource();
            if (cs != null && cs.getLocation() != null) {
                String codeSourcePath = new File(cs.getLocation().toURI()).getAbsolutePath();
                if (!codeSourcePath.isBlank()) entries.add(codeSourcePath);
            }
        } catch (Exception ignored) {
        }

        if (entries.isEmpty()) return sysCp;
        return String.join(File.pathSeparator, entries);
    }

    private String expectedUpstreamStatusToken() {
        if (!(ProxyHandler.useProxy()
                && ProxyHandler.getCurrentProxy() != Proxy.NO_PROXY
                && ProxyHandler.getCurrentProxy().address() instanceof InetSocketAddress addr)) {
            return "off";
        }
        String login = ProxyHandler.getProxyLogin() == null ? "" : ProxyHandler.getProxyLogin();
        String password = ProxyHandler.getProxyPassword() == null ? "" : ProxyHandler.getProxyPassword();
        String auth = (login.isEmpty() && password.isEmpty()) ? "na" : "auth";
        return (ProxyHandler.isSocks5() ? "s5@" : "s4@") + addr.getHostString() + ":" + addr.getPort() + ":" + auth;
    }

    private void applyUpstreamProxyEnv(Map<String, String> env) {
        env.put("PROXY_UPSTREAM_ENABLED", "false");
        env.put("PROXY_UPSTREAM_TYPE", "");
        env.put("PROXY_UPSTREAM_HOST", "");
        env.put("PROXY_UPSTREAM_PORT", "0");
        env.put("PROXY_UPSTREAM_LOGIN", "");
        env.put("PROXY_UPSTREAM_PASSWORD", "");

        if (!(ProxyHandler.useProxy()
                && ProxyHandler.getCurrentProxy() != Proxy.NO_PROXY
                && ProxyHandler.getCurrentProxy().address() instanceof InetSocketAddress addr)) {
            return;
        }

        env.put("PROXY_UPSTREAM_ENABLED", "true");
        env.put("PROXY_UPSTREAM_TYPE", ProxyHandler.isSocks5() ? "SOCKS5" : "SOCKS4");
        env.put("PROXY_UPSTREAM_HOST", addr.getHostString());
        env.put("PROXY_UPSTREAM_PORT", String.valueOf(addr.getPort()));
        env.put("PROXY_UPSTREAM_LOGIN", ProxyHandler.getProxyLogin() == null ? "" : ProxyHandler.getProxyLogin());
        env.put("PROXY_UPSTREAM_PASSWORD", ProxyHandler.getProxyPassword() == null ? "" : ProxyHandler.getProxyPassword());
    }

    private void applyUpstreamProxyProps() {
        Properties props = System.getProperties();
        props.setProperty("PROXY_UPSTREAM_ENABLED", "false");
        props.setProperty("PROXY_UPSTREAM_TYPE", "");
        props.setProperty("PROXY_UPSTREAM_HOST", "");
        props.setProperty("PROXY_UPSTREAM_PORT", "0");
        props.setProperty("PROXY_UPSTREAM_LOGIN", "");
        props.setProperty("PROXY_UPSTREAM_PASSWORD", "");

        if (!(ProxyHandler.useProxy()
                && ProxyHandler.getCurrentProxy() != Proxy.NO_PROXY
                && ProxyHandler.getCurrentProxy().address() instanceof InetSocketAddress addr)) {
            return;
        }

        props.setProperty("PROXY_UPSTREAM_ENABLED", "true");
        props.setProperty("PROXY_UPSTREAM_TYPE", ProxyHandler.isSocks5() ? "SOCKS5" : "SOCKS4");
        props.setProperty("PROXY_UPSTREAM_HOST", addr.getHostString());
        props.setProperty("PROXY_UPSTREAM_PORT", String.valueOf(addr.getPort()));
        props.setProperty("PROXY_UPSTREAM_LOGIN", ProxyHandler.getProxyLogin() == null ? "" : ProxyHandler.getProxyLogin());
        props.setProperty("PROXY_UPSTREAM_PASSWORD", ProxyHandler.getProxyPassword() == null ? "" : ProxyHandler.getProxyPassword());
    }

    private TargetAddress resolveTarget(String raw) {
        String s = raw.trim();
        if (s.isEmpty()) return null;

        detectedSrvInfo = "";

        if (s.contains(":")) {
            try {
                String[] p = s.split(":");
                return new TargetAddress(p[0], Integer.parseInt(p[1]));
            } catch (Exception e) {
                return null;
            }
        }

        TargetAddress srv = lookupSrv(s);
        if (srv != null) {
            detectedSrvInfo = "SRV: " + srv.host + ":" + srv.port;
            return srv;
        }

        return new TargetAddress(s, 25565);
    }

    private TargetAddress lookupSrv(String domain) {
        try {
            Hashtable<String, String> env = new Hashtable<>();
            env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            env.put("java.naming.provider.url", "dns:");

            DirContext ctx = new InitialDirContext(env);
            Attribute attr = ctx.getAttributes("_minecraft._tcp." + domain, new String[]{"SRV"}).get("SRV");
            if (attr == null) return null;

            NamingEnumeration<?> en = attr.getAll();
            TargetAddress best = null;
            int minP = Integer.MAX_VALUE;

            while (en.hasMore()) {
                String[] p = String.valueOf(en.next()).trim().split("\\s+");
                if (p.length < 4) continue;

                int prio = Integer.parseInt(p[0]);
                int port = Integer.parseInt(p[2]);
                String host = p[3].endsWith(".") ? p[3].substring(0, p[3].length() - 1) : p[3];
                if (prio < minP) {
                    minP = prio;
                    best = new TargetAddress(host, port);
                }
            }

            return best;
        } catch (Exception e) {
            return null;
        }
    }

    public record TargetAddress(String host, int port) {}
}
