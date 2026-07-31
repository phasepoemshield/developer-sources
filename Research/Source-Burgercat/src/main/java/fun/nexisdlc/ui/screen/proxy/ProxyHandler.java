package fun.nexisdlc.ui.screen.proxy;

import fun.nexisdlc.ClientContainer;
import lombok.Getter;
import lombok.Setter;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Locale;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProxyHandler {
    private static final Path CONFIG_PATH = Paths.get(ClientContainer.getName(), "proxy", "proxy_settings.txt");
    @Getter
    private static Proxy currentProxy = Proxy.NO_PROXY;
    @Getter
    @Setter
    private static String proxyLogin = "";
    @Setter
    @Getter
    private static String proxyPassword = "";
    @Getter
    @Setter
    private static String proxyIp = "";
    @Getter
    @Setter
    private static int proxyPort = 0;
    private static boolean isSocks5 = true;
    private static boolean useProxy = false;

    static {
        loadConfig();
    }

    public static void setProxy(String ip, int port, String login, String password, Proxy.Type type, boolean isSocks5) {
        currentProxy = new Proxy(type, new InetSocketAddress(ip, port));
        proxyIp = ip;
        proxyPort = port;
        proxyLogin = login;
        proxyPassword = password;
        ProxyHandler.isSocks5 = isSocks5;
        useProxy = true;
    }

    public static void disableProxy() {
        currentProxy = Proxy.NO_PROXY;
        useProxy = false;
    }

    public static boolean isSocks5() {
        return isSocks5;
    }

    public static boolean useProxy() {
        return useProxy;
    }

    public static boolean shouldUseProxyFor(SocketAddress remoteAddress) {
        if (!useProxy || currentProxy == Proxy.NO_PROXY) {
            return false;
        }
        if (remoteAddress == null) {
            return false;
        }
        if (!(remoteAddress instanceof InetSocketAddress inetSocketAddress)) {
            return true;
        }
        return !isLocalAddress(inetSocketAddress);
    }

    private static boolean isLocalAddress(InetSocketAddress address) {
        InetAddress inetAddress = address.getAddress();
        if (inetAddress != null) {
            if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
                return true;
            }
            try {
                if (NetworkInterface.getByInetAddress(inetAddress) != null) {
                    return true;
                }
            } catch (Exception ignored) {
            }
        }

        String host = address.getHostString();
        if (host == null || host.isBlank()) {
            return false;
        }
        String normalized = host.trim().toLowerCase(Locale.ROOT);
        return "localhost".equals(normalized)
                || "127.0.0.1".equals(normalized)
                || "0.0.0.0".equals(normalized)
                || "::1".equals(normalized)
                || "[::1]".equals(normalized)
                || "0:0:0:0:0:0:0:1".equals(normalized);
    }

    public static void loadConfig() {
        if (!Files.exists(CONFIG_PATH)) {
            return;
        }

        try {
            for (String line : Files.readAllLines(CONFIG_PATH)) {
                String[] parts = line.split("=", 2);
                if (parts.length != 2) continue;
                switch (parts[0]) {
                    case "ip" -> proxyIp = parts[1].trim();
                    case "port" -> {
                        try {
                            proxyPort = Integer.parseInt(parts[1].trim());
                        } catch (NumberFormatException ignored) {
                            proxyPort = 0;
                        }
                    }
                    case "login" -> proxyLogin = parts[1].trim();
                    case "password" -> proxyPassword = parts[1].trim();
                    case "isSocks5" -> isSocks5 = Boolean.parseBoolean(parts[1].trim());
                    case "useProxy" -> useProxy = Boolean.parseBoolean(parts[1].trim());
                }
            }

            if (useProxy && !proxyIp.isEmpty() && proxyPort > 0) {
                currentProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(proxyIp, proxyPort));
            } else {
                currentProxy = Proxy.NO_PROXY;
            }
        } catch (Exception ignored) {
            currentProxy = Proxy.NO_PROXY;
        }
    }
}
