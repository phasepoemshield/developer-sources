package fun.nexisdlc.client.utils.connection;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class StandaloneProxy {
    private String bindIp;
    private int bindPort;
    private volatile String targetHost;
    private volatile int targetPort;
    private volatile Proxy upstreamProxy = Proxy.NO_PROXY;
    private volatile boolean upstreamEnabled = false;
    private volatile String upstreamHost = "";
    private volatile int upstreamPort = 0;
    private volatile boolean upstreamSocks5 = true;
    private volatile String upstreamLogin = "";
    private volatile String upstreamPassword = "";
    private int controlPort;
    private ServerSocket proxyServer;
    private ServerSocket controlServer;
    private volatile Socket remoteSocket;
    private volatile InputStream remoteIn;
    private volatile OutputStream remoteOut;
    private final CopyOnWriteArrayList<ClientEntry> clients = new CopyOnWriteArrayList<>();
    private volatile int activeIdx = 0;
    private final Object cacheLock = new Object();
    private final List<byte[]> cachedPackets = new ArrayList<>();
    private volatile int s2cCount = 0;
    private volatile boolean firstReady = false;
    private volatile long firstReadyAtMs = 0L;
    private volatile long firstS2CAtMs = 0L;
    private volatile boolean remoteUp = false;
    private volatile int protocol = 0;
    private volatile double playerX, playerY, playerZ;
    private volatile double playerVX, playerVY, playerVZ;
    private volatile float playerYaw, playerPitch;
    private volatile boolean posKnown = false;
    private volatile double lastInjectX = Double.NaN, lastInjectY = Double.NaN, lastInjectZ = Double.NaN;
    private volatile int nextTpId = 30000;
    private volatile boolean running = true;
    private boolean embeddedMode = false;
    private static final long ACTIVE_MOVE_SYNC_MIN_MS = 15L;
    private static final long FIRST_READY_STABILIZE_MS = 2500L;
    private static final long BOOTSTRAP_CACHE_WINDOW_MS = 5000L;
    private volatile int detectedSyncPacketId = -1;
    private volatile boolean detectedModernSync = false;
    private volatile byte[] detectedModernTail = null;
    private volatile long setPosCmdCount = 0L;
    private volatile long injectTickCount = 0L;
    private volatile long lastInjectFromMoveMs = 0L;
    private volatile int compressionThreshold = -1;
    private static final long INJECT_READY_GRACE_MS = 250L;
    private static final int[][] C2S_MOVE = {
            {770, 0x1D, 0x1E, 0x1F},
            {768, 0x1C, 0x1D, 0x1E},
            {765, 0x1A, 0x1B, 0x1C},
            {764, 0x17, 0x18, 0x19},
            {0,   0x16, 0x17, 0x18},
    };
    private static final int[][] S2C_SYNC = {
            {774, 0x46}, {773, 0x46}, {772, 0x41}, {770, 0x43}, {768, 0x42}, {767, 0x40}, {766, 0x40}, {765, 0x3E}, {0, 0x3C},
    };
    private int[] c2sMoveIds() {
        for (int[] e : C2S_MOVE) if (protocol >= e[0]) return new int[]{e[1], e[2], e[3]};
        return new int[]{0x16, 0x17, 0x18};
    }
    private int s2cSyncId() {
        for (int[] e : S2C_SYNC) if (protocol >= e[0]) return e[1];
        return 0x46;
    }
    private boolean newSync() {
        return protocol >= 768;
    }
    private static boolean finite(double v) {
        return !Double.isNaN(v) && !Double.isInfinite(v);
    }
    private static boolean finite(float v) {
        return !Float.isNaN(v) && !Float.isInfinite(v);
    }
    private static boolean plausiblePos(double x, double y, double z) {
        return finite(x) && finite(y) && finite(z)
                && Math.abs(x) <= 60_000_000d
                && Math.abs(z) <= 60_000_000d
                && Math.abs(y) <= 10_000_000d;
    }
    private static class ClientEntry {
        final Socket socket;
        final InputStream in;
        final OutputStream out;
        volatile boolean ready = false;
        volatile long readyAtMs = 0L;
        ClientEntry(Socket s) throws IOException {
            this.socket = s;
            this.in = s.getInputStream();
            this.out = s.getOutputStream();
        }
        void markReady() {
            this.ready = true;
            this.readyAtMs = System.currentTimeMillis();
        }
        void close() {
            try { socket.close(); } catch (Exception ignored) {}
        }
        boolean isClosed() {
            return socket.isClosed();
        }
    }
    public static void main(String[] args) {
        String cfg = System.getenv("PROXY_CFG");
        if (cfg == null || cfg.isEmpty()) {
            if (args.length >= 5) cfg = String.join(",", args);
            else { System.exit(1); return; }
        }
        String[] p = cfg.split(",");
        if (p.length < 5) { System.exit(1); return; }
        StandaloneProxy proxy = new StandaloneProxy();
        proxy.controlPort = Integer.parseInt(p[0].trim());
        proxy.bindIp      = p[1].trim();
        proxy.bindPort    = Integer.parseInt(p[2].trim());
        proxy.targetHost  = p[3].trim();
        proxy.targetPort  = Integer.parseInt(p[4].trim());
        proxy.loadUpstreamProxyFromEnv();
        proxy.run();
    }
    public static Thread startEmbedded(int controlPort, String bindIp, int bindPort, String targetHost, int targetPort) {
        StandaloneProxy proxy = new StandaloneProxy();
        proxy.embeddedMode = true;
        proxy.controlPort = controlPort;
        proxy.bindIp = bindIp;
        proxy.bindPort = bindPort;
        proxy.targetHost = targetHost;
        proxy.targetPort = targetPort;
        proxy.loadUpstreamProxyFromEnv();
        Thread t = new Thread(proxy::run, "StandaloneProxy-embedded");
        t.setDaemon(true);
        t.start();
        return t;
    }
    private void run() {
        try {
            controlServer = new ServerSocket();
            controlServer.setReuseAddress(true);
            controlServer.bind(new InetSocketAddress("127.0.0.1", controlPort));
            Thread ct = new Thread(this::controlLoop, "ctrl");
            ct.setDaemon(false);
            ct.start();
            try {
                proxyServer = new ServerSocket();
                proxyServer.setReuseAddress(true);
                proxyServer.bind(new InetSocketAddress(bindIp, bindPort));
            } catch (BindException e) {
                log("FATAL: Cannot bind proxy port " + bindIp + ":" + bindPort + " - " + e.getMessage());
                running = false;
                controlServer.close();
                if (!embeddedMode) System.exit(2);
                return;
            }
            log("UP " + bindIp + ":" + bindPort + " -> " + targetHost + ":" + targetPort +
                    " ctrl=" + controlPort + " pid=" + ProcessHandle.current().pid());
            acceptLoop();
        } catch (Exception e) {
            log("Fatal: " + e.getMessage());
            e.printStackTrace();
            if (!embeddedMode) System.exit(1);
        }
    }
    private void controlLoop() {
        while (running) {
            try {
                Socket c = controlServer.accept();
                c.setTcpNoDelay(true);
                Thread t = new Thread(() -> handleControl(c), "ctrl-h");
                t.setDaemon(true);
                t.start();
            } catch (IOException e) {
                if (!running) break;
            }
        }
    }
    private void handleControl(Socket client) {
        try (var r = new BufferedReader(new InputStreamReader(client.getInputStream(), StandardCharsets.UTF_8));
             var w = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), StandardCharsets.UTF_8), true)) {
            client.setSoTimeout(60000);
            String line;
            while ((line = r.readLine()) != null) {
                String resp = processCmd(line.trim());
                w.println(resp);
                if ("BYE".equals(resp)) {
                    shutdown();
                    return;
                }
            }
        } catch (Exception ignored) {
        } finally {
            close(client);
        }
    }
    private synchronized String processCmd(String cmd) {
        if (cmd.isEmpty()) return "ERROR empty";
        String[] p = cmd.split("\\s+");
        String a = p[0].toUpperCase();
        return switch (a) {
            case "PING" -> "PONG nxp";
            case "PID" -> "PID " + ProcessHandle.current().pid();
            case "STATUS" -> "STATUS running=" + running + " clients=" + clients.size() +
                    " active=" + activeIdx + " target=" + targetHost + ":" + targetPort +
                    " remote=" + remoteUp + " proto=" + protocol +
                    " pos=" + posKnown + " cached=" + cachedPackets.size() +
                    " setpos=" + setPosCmdCount + " inj=" + injectTickCount +
                    " syncId=" + (detectedSyncPacketId >= 0 ? detectedSyncPacketId : s2cSyncId()) +
                    " cmp=" + compressionThreshold +
                    " upstream=" + upstreamStatusToken();
            case "SWITCH" -> "ERROR disabled";
            case "TARGET" -> {
                if (p.length < 3) yield "ERROR usage: TARGET host port";
                try {
                    String h = p[1];
                    int pt = Integer.parseInt(p[2]);
                    targetHost = h;
                    targetPort = pt;
                    resetConnection();
                    log("Retarget -> " + h + ":" + pt);
                    yield "OK";
                } catch (NumberFormatException e) {
                    yield "ERROR bad_port";
                }
            }
            case "SETPOS" -> {
                if (p.length < 6) yield "ERROR usage: SETPOS x y z yaw pitch";
                try {
                    double x = Double.parseDouble(p[1]);
                    double y = Double.parseDouble(p[2]);
                    double z = Double.parseDouble(p[3]);
                    float yaw = Float.parseFloat(p[4]);
                    float pitch = Float.parseFloat(p[5]);
                    if (!plausiblePos(x, y, z) || !finite(yaw) || !finite(pitch)) {
                        yield "ERROR bad_pos";
                    }
                    playerX = x;
                    playerY = y;
                    playerZ = z;
                    playerYaw = yaw;
                    playerPitch = pitch;
                    posKnown = true;
                    setPosCmdCount++;
                    if (clients.size() > 1) {
                        injectPosToInactive();
                    }
                    yield "OK";
                } catch (Exception e) {
                    yield "ERROR bad_number";
                }
            }
            case "STOP" -> "BYE";
            default -> "ERROR unknown: " + a;
        };
    }
    private void shutdown() {
        log("Shutdown");
        running = false;
        resetConnection();
        try { proxyServer.close(); } catch (Exception ignored) {}
        try { controlServer.close(); } catch (Exception ignored) {}
        if (!embeddedMode) System.exit(0);
    }
    private void acceptLoop() {
        while (running) {
            try {
                Socket c = proxyServer.accept();
                c.setTcpNoDelay(true);
                Thread t = new Thread(() -> {
                    try {
                        handleIncoming(c);
                    } catch (Exception e) {
                        close(c);
                    }
                }, "ph");
                t.setDaemon(true);
                t.start();
            } catch (IOException e) {
                if (!running || proxyServer.isClosed()) break;
            }
        }
    }
    private void handleIncoming(Socket client) throws Exception {
        client.setSoTimeout(30000);
        InputStream in = client.getInputStream();
        int len = readVarInt(in);
        byte[] body = readExact(in, len);
        int off = 0;
        int[] c = new int[1];
        int pktId = rvi(body, off, c);
        off += c[0];
        if (pktId != 0x00) {
            client.close();
            return;
        }
        int proto = rvi(body, off, c); off += c[0];
        int sLen  = rvi(body, off, c); off += c[0];
        off += sLen;
        off += 2;
        int nextState = rvi(body, off, c);
        byte[] handshake = buildHandshake(proto, targetHost, targetPort, nextState);
        if (nextState == 1) {
            statusPing(client, handshake);
        } else if (nextState == 2) {
            client.setSoTimeout(0);
            gameLogin(client, handshake, proto);
        } else {
            client.close();
        }
    }
    private void statusPing(Socket client, byte[] handshake) {
        Socket tmp = null;
        try {
            tmp = connectTarget(4000);
            tmp.setTcpNoDelay(true);
            tmp.setSoTimeout(5000);
            client.setSoTimeout(5000);
            OutputStream ro = tmp.getOutputStream();
            InputStream  ri = tmp.getInputStream();
            InputStream  ci = client.getInputStream();
            OutputStream co = client.getOutputStream();
            ro.write(handshake); ro.flush();
            for (int i = 0; i < 2; i++) {
                byte[] c2s = readPacket(ci); ro.write(c2s); ro.flush();
                byte[] s2c = readPacket(ri); co.write(s2c); co.flush();
            }
        } catch (Exception ignored) {
        } finally {
            close(tmp);
            close(client);
        }
    }
    private void gameLogin(Socket client, byte[] handshake, int proto) {
        try {
            ClientEntry entry = new ClientEntry(client);
            boolean isFirst;
            synchronized (this) {
                isFirst = !remoteUp;
                if (isFirst) {
                    remoteUp = true;
                    if (protocol == 0) {
                        protocol = proto;
                        log("Protocol: " + proto);
                    }
                }
            }
            if (isFirst) {
                firstClient(entry, handshake);
            } else {
                nextClient(entry);
            }
        } catch (Exception e) {
            log("Login error: " + e.getMessage());
            close(client);
        }
    }
    private void firstClient(ClientEntry e, byte[] handshake) throws IOException {
        remoteSocket = connectTarget(10000);
        remoteSocket.setTcpNoDelay(true);
        remoteSocket.setSoTimeout(30000);
        remoteIn  = remoteSocket.getInputStream();
        remoteOut = remoteSocket.getOutputStream();
        remoteOut.write(handshake);
        remoteOut.flush();
        e.markReady();
        clients.add(e);
        log("First client connected (active)");
        startS2C();
        startC2S(e);
    }
    private void nextClient(ClientEntry e) {
        try {
            byte[] discard = readPacket(e.in);
            log("Discarded Login Start (" + discard.length + "b)");
            // Start draining C2S right after Login Start is consumed by this method.
            // This prevents a read race on the same input stream.
            startC2S(e);

            long t0 = System.currentTimeMillis();
            while (!firstReady) {
                if (e.isClosed() || remoteSocket == null || remoteSocket.isClosed()) {
                    e.close();
                    return;
                }
                Thread.sleep(100);
                if (System.currentTimeMillis() - t0 > 120_000) {
                    e.close();
                    return;
                }
            }
            while (System.currentTimeMillis() - firstReadyAtMs < FIRST_READY_STABILIZE_MS) {
                if (e.isClosed() || remoteSocket == null || remoteSocket.isClosed()) {
                    e.close();
                    return;
                }
                Thread.sleep(50);
                if (System.currentTimeMillis() - t0 > 120_000) {
                    e.close();
                    return;
                }
            }
            List<byte[]> snap;
            synchronized (cacheLock) {
                snap = new ArrayList<>(cachedPackets);
            }
            log("Replaying " + snap.size() + " packets to client");
            for (byte[] pkt : snap) {
                if (e.isClosed()) return;
                if (!shouldReplayToSecondary(pkt)) {
                    continue;
                }
                e.out.write(pkt);
            }
            e.out.flush();
            e.markReady();
            clients.add(e);
            log("Client #" + clients.size() + " ready (inactive)");
            if (posKnown) {
                sendSyncPos(e);
            }
        } catch (Exception ex) {
            log("Next client err: " + ex.getMessage());
            e.close();
        }
    }

    private boolean shouldReplayToSecondary(byte[] fullPacket) {
        try {
            int[] consumed = new int[1];
            int frameLen = rvi(fullPacket, 0, consumed);
            if (consumed[0] <= 0 || frameLen <= 0 || consumed[0] + frameLen > fullPacket.length) {
                return true;
            }
            byte[] frameData = Arrays.copyOfRange(fullPacket, consumed[0], consumed[0] + frameLen);
            byte[] payload = unpackPayload(frameData);
            if (payload == null || payload.length == 0) {
                return true;
            }

            int[] idConsumed = new int[1];
            int packetId = rvi(payload, 0, idConsumed);
            if (idConsumed[0] <= 0 || idConsumed[0] >= payload.length) {
                return true;
            }

            int off = idConsumed[0];
            int[] strConsumed = new int[1];
            int teamNameLen = rvi(payload, off, strConsumed);
            if (strConsumed[0] <= 0) {
                return true;
            }
            off += strConsumed[0];
            if (teamNameLen < 0 || off + teamNameLen >= payload.length) {
                return true;
            }
            String teamName = new String(payload, off, teamNameLen, StandardCharsets.UTF_8);
            off += teamNameLen;
            if (off >= payload.length) {
                return true;
            }

            int method = payload[off] & 0xFF;
            if (method < 0 || method > 4) {
                return true;
            }
            // Keep this filter narrow to avoid dropping unrelated packets needed by Via world tracking.
            if (teamName.startsWith("collideRule_")) {
                return false;
            }
        } catch (Exception ignored) {
        }
        return true;
    }
    private void startS2C() {
        Thread t = new Thread(() -> {
            try {
                while (running && remoteIn != null && remoteSocket != null && !remoteSocket.isClosed()) {
                    byte[] full;
                    try {
                        full = readPacket(remoteIn);
                    } catch (SocketTimeoutException e) {
                        continue;
                    } catch (IOException e) {
                        if (running) log("S2C read: " + e.getMessage());
                        break;
                    }
                    try {
                        int[] c = new int[1];
                        rvi(full, 0, c);
                        byte[] frameData = Arrays.copyOfRange(full, c[0], full.length);
                        try { maybeDetectCompression(frameData); } catch (Exception ignored) {}
                        byte[] packetData = unpackPayload(frameData);
                        long now = System.currentTimeMillis();
                        if (firstS2CAtMs == 0L) {
                            firstS2CAtMs = now;
                        }
                        s2cCount++;
                        synchronized (cacheLock) {
                            if (!firstReady) {
                                cachedPackets.add(full);
                            }
                        }
                        boolean bootstrapWindowDone = firstS2CAtMs > 0L && (now - firstS2CAtMs) >= BOOTSTRAP_CACHE_WINDOW_MS;
                        if (!firstReady && bootstrapWindowDone) {
                            firstReady = true;
                            firstReadyAtMs = now;
                            log("Cache ready (" + s2cCount + " pkts, window=" + BOOTSTRAP_CACHE_WINDOW_MS + "ms)");
                        }
                        if (packetData != null) {
                            try { parseS2CSync(packetData); } catch (Exception ignored) {}
                        }
                        List<ClientEntry> dead = new ArrayList<>();
                        boolean activeDied = false;
                        for (ClientEntry cl : clients) {
                            if (!cl.ready) continue;
                            try {
                                cl.out.write(full);
                                cl.out.flush();
                            } catch (IOException ex) {
                                dead.add(cl);
                                if (clients.indexOf(cl) == activeIdx) activeDied = true;
                            }
                        }
                        for (ClientEntry cl : dead) removeClient(cl);
                        if (activeDied && !clients.isEmpty()) {
                            handleActiveClientDisconnected();
                        }
                        if (clients.isEmpty()) {
                            log("S2C: no clients left");
                            break;
                        }
                    } catch (Exception e) {
                        if (running) log("S2C packet error: " + e.getMessage());
                    }
                }
            } catch (Exception e) {
                if (running) log("S2C fatal: " + e.getMessage());
            } finally {
                log("S2C done");
                if (clients.isEmpty()) {
                    resetConnection();
                } else {
                    resetRemoteOnly();
                }
            }
        }, "s2c");
        t.setDaemon(true);
        t.start();
    }
    private void startC2S(ClientEntry entry) {
        Thread t = new Thread(() -> {
            try {
                while (!entry.isClosed()) {
                    byte[] full;
                    try {
                        full = readPacket(entry.in);
                    } catch (IOException e) {
                        if (!entry.isClosed()) log("C2S read: " + e.getMessage());
                        break;
                    }
                    try {
                        int idx;
                        boolean fwd;
                        synchronized (StandaloneProxy.this) {
                            idx = clients.indexOf(entry);
                            fwd = (idx == 0 && !firstReady) || (idx >= 0 && idx == activeIdx);
                        }
                        if (!fwd) {
                            trySnapbackInactive(entry, full, idx);
                            continue;
                        }
                        if (remoteOut == null) {
                            continue;
                        }
                        int[] c = new int[1];
                        rvi(full, 0, c);
                        byte[] frameData = Arrays.copyOfRange(full, c[0], full.length);
                        byte[] payload = extractMovePayloadFromFrame(frameData);
                        if (payload != null) {
                            try { parseC2SMove(payload); } catch (Exception ignored) {}
                        }
                        try {
                            synchronized (remoteOut) {
                                remoteOut.write(full);
                                remoteOut.flush();
                            }
                        } catch (IOException ex) {
                            if (!entry.isClosed()) log("C2S write: " + ex.getMessage());
                            break;
                        }
                    } catch (Exception e) {
                        if (!entry.isClosed()) log("C2S packet error: " + e.getMessage());
                    }
                }
            } catch (Exception e) {
                if (!entry.isClosed()) log("C2S fatal: " + e.getMessage());
            } finally {
                removeClient(entry);
            }
        }, "c2s");
        t.setDaemon(true);
        t.start();
    }
    private byte[] extractMovePayloadFromFrame(byte[] frameData) {
        if (frameData == null || frameData.length == 0) return null;
        if (compressionThreshold >= 0) {
            return unpackPayload(frameData);
        }
        if (detectMoveFlags(frameData) != 0) {
            return frameData;
        }
        byte[] zeroWrapped = unwrapZeroCompressed(frameData);
        if (zeroWrapped != null && detectMoveFlags(zeroWrapped) != 0) {
            compressionThreshold = 0;
            log("Compression inferred from C2S movement (threshold unknown)");
            return zeroWrapped;
        }
        return frameData;
    }
    private byte[] unwrapZeroCompressed(byte[] frameData) {
        if (frameData == null || frameData.length == 0) return null;
        int[] c = new int[1];
        int dataLen = rvi(frameData, 0, c);
        if (c[0] <= 0 || c[0] >= frameData.length) return null;
        if (dataLen != 0) return null;
        return Arrays.copyOfRange(frameData, c[0], frameData.length);
    }
    private void parseC2SMove(byte[] data) {
        int flags = detectMoveFlags(data);
        if (flags == 0) return;
        int[] c = new int[1];
        int id = rvi(data, 0, c);
        int off = c[0];
        int[] ids = c2sMoveIds();
        boolean hasPos = (id == ids[0] || id == ids[1]);
        boolean hasRot = (id == ids[1] || id == ids[2]);
        if (!hasPos && !hasRot) {
            int remaining = data.length - off;
            switch (remaining) {
                case 25, 26 -> hasPos = true;
                case 9, 10 -> hasRot = true;
                case 33, 34 -> {
                    hasPos = true;
                    hasRot = true;
                }
            }
        }
        if (!hasPos && !hasRot) return;
        ByteBuffer buf = ByteBuffer.wrap(data, off, data.length - off);
        if (hasPos && hasRot) {
            if (buf.remaining() < 33) return;
            playerX = buf.getDouble();
            playerY = buf.getDouble();
            playerZ = buf.getDouble();
            playerYaw = buf.getFloat();
            playerPitch = buf.getFloat();
            posKnown = true;
        } else if (hasPos) {
            if (buf.remaining() < 25) return;
            playerX = buf.getDouble();
            playerY = buf.getDouble();
            playerZ = buf.getDouble();
            posKnown = true;
        } else if (hasRot) {
            if (buf.remaining() < 9) return;
            playerYaw = buf.getFloat();
            playerPitch = buf.getFloat();
            posKnown = true;
        }
        if (clients.size() > 1) {
            injectPosToInactive();
        }
    }
    private int detectMoveFlags(byte[] data) {
        if (data == null || data.length < 2 || protocol == 0) return 0;
        int[] c = new int[1];
        int id = rvi(data, 0, c);
        int off = c[0];
        int[] ids = c2sMoveIds();
        boolean hasPos = (id == ids[0] || id == ids[1]);
        boolean hasRot = (id == ids[1] || id == ids[2]);
        if (!hasPos && !hasRot) {
            int remaining = data.length - off;
            switch (remaining) {
                case 25, 26 -> hasPos = true;
                case 9, 10 -> hasRot = true;
                case 33, 34 -> {
                    hasPos = true;
                    hasRot = true;
                }
            }
        }
        return (hasPos ? 1 : 0) | (hasRot ? 2 : 0);
    }
    private void trySnapbackInactive(ClientEntry entry, byte[] fullPacket, int idx) {
        try {
            if (fullPacket == null || fullPacket.length == 0) return;
            int[] c = new int[1];
            int frameLen = rvi(fullPacket, 0, c);
            if (c[0] <= 0 || frameLen <= 0 || c[0] + frameLen > fullPacket.length) return;
            byte[] frameData = Arrays.copyOfRange(fullPacket, c[0], c[0] + frameLen);
            byte[] payload = unpackPayload(frameData);
            if (payload == null || payload.length == 0) return;
            int[] idC = new int[1];
            int pktId = rvi(payload, 0, idC);
            // Harmless C2S packets from inactive client are silently swallowed:
            // keepalive (8b long), chunk ack (4b float), tick end (0b), client status (1b)
            int remaining = payload.length - idC[0];
            if (remaining == 8 || remaining == 4 || remaining == 0 || remaining == 1) {
                return;
            }
            // Also suppress movement packets just in case
            if (detectMoveFlags(payload) != 0) {
                return;
            }
        } catch (Exception ignored) {
        }
    }
    private void parseS2CSync(byte[] data) {
        int[] c = new int[1];
        int id = rvi(data, 0, c);
        int off = c[0];
        if (off <= 0 || off >= data.length) return;

        boolean lockPacketId = detectedSyncPacketId < 0;
        if (!lockPacketId && id != detectedSyncPacketId) {
            return;
        }

        if (tryParseModernSync(data, off, lockPacketId)) return;
        if (tryParseLegacySync(data, off)) return;

        if (lockPacketId) {
            // Auto-detect first valid sync packet id (Takker-like tolerant behavior).
            if (tryParseModernSync(data, off, true)) return;
            tryParseLegacySync(data, off);
        }
    }

    private boolean tryParseModernSync(byte[] data, int off, boolean lockPacketId) {
        int[] c = new int[1];
        int tpId = rvi(data, off, c);
        if (c[0] <= 0) return false;
        off += c[0];
        if (tpId < 0 || tpId > 2_000_000_000) return false;

        int tailStart = off + 56;
        int remainingAfterPose = data.length - tailStart;
        if (remainingAfterPose < 4) return false;

        int tailLen;
        if (lockPacketId) {
            // First successful parse: remember exact tail shape for this protocol/server combo.
            if (remainingAfterPose > 16) return false;
            tailLen = remainingAfterPose;
        } else if (detectedModernTail != null && detectedModernTail.length > 0) {
            tailLen = detectedModernTail.length;
            if (remainingAfterPose != tailLen) return false;
        } else {
            tailLen = 4;
            if (remainingAfterPose != 4) return false;
        }

        ByteBuffer buf = ByteBuffer.wrap(data, off, data.length - off);
        double x = buf.getDouble();
        double y = buf.getDouble();
        double z = buf.getDouble();
        double vx = buf.getDouble();
        double vy = buf.getDouble();
        double vz = buf.getDouble();
        float yaw = buf.getFloat();
        float pitch = buf.getFloat();
        if (!plausiblePos(x, y, z) || !finite(yaw) || !finite(pitch)) return false;

        byte[] tail = Arrays.copyOfRange(data, tailStart, tailStart + tailLen);

        playerX = x;
        playerY = y;
        playerZ = z;
        playerVX = vx;
        playerVY = vy;
        playerVZ = vz;
        playerYaw = yaw;
        playerPitch = pitch;
        posKnown = true;

        if (lockPacketId) {
            int[] idConsumed = new int[1];
            int pktId = rvi(data, 0, idConsumed);
            detectedSyncPacketId = pktId;
            detectedModernSync = true;
            detectedModernTail = tail;
        }
        return true;
    }
    private boolean tryParseLegacySync(byte[] data, int off) {
        ByteBuffer buf = ByteBuffer.wrap(data, off, data.length - off);
        if (buf.remaining() < 32) return false;

        int remain = buf.remaining();
        if (remain != 32 && remain != 34) return false;

        double x = buf.getDouble();
        double y = buf.getDouble();
        double z = buf.getDouble();
        float yaw = buf.getFloat();
        float pitch = buf.getFloat();
        if (!plausiblePos(x, y, z) || !finite(yaw) || !finite(pitch)) return false;

        playerX = x;
        playerY = y;
        playerZ = z;
        playerYaw = yaw;
        playerPitch = pitch;
        posKnown = true;

        if (detectedSyncPacketId < 0) {
            int[] idConsumed = new int[1];
            int pktId = rvi(data, 0, idConsumed);
            detectedSyncPacketId = pktId;
        }
        return true;
    }
    private void injectPosToInactive() {
        if (!posKnown || clients.size() < 2) return;
        long now = System.currentTimeMillis();
        if (now - lastInjectFromMoveMs < ACTIVE_MOVE_SYNC_MIN_MS) return;
        double dx = playerX - lastInjectX;
        double dy = playerY - lastInjectY;
        double dz = playerZ - lastInjectZ;
        if (Double.isFinite(dx) && Double.isFinite(dy) && Double.isFinite(dz)
                && dx * dx + dy * dy + dz * dz < 0.0001) {
            return; // skip inject if position barely changed (< 0.01)
        }
        lastInjectFromMoveMs = now;
        lastInjectX = playerX;
        lastInjectY = playerY;
        lastInjectZ = playerZ;
        for (ClientEntry e : clients) {
            int idx = clients.indexOf(e);
            if (idx == activeIdx) continue;
            if (!canInjectTo(e)) continue;
            sendSyncPos(e);
        }
        injectTickCount++;
    }
    private void sendSyncPos(ClientEntry e) {
        if (!canInjectTo(e)) return;
        byte[] pkt = buildSyncPacket();
        if (pkt == null) return;
        try {
            e.out.write(pkt);
            e.out.flush();
        } catch (IOException ignored) {}
    }
    private byte[] buildSyncPacket() {
        if (!posKnown) return null;
        int syncId = detectedSyncPacketId >= 0 ? detectedSyncPacketId : s2cSyncId();
        ByteArrayOutputStream payload = new ByteArrayOutputStream();
        try {
            writeVarInt(payload, syncId);
            if (newSync() || detectedModernSync) {
                writeVarInt(payload, nextTpId++);
                ByteBuffer b = ByteBuffer.allocate(56);
                b.putDouble(playerX);
                b.putDouble(playerY);
                b.putDouble(playerZ);
                b.putDouble(playerVX);
                b.putDouble(playerVY);
                b.putDouble(playerVZ);
                b.putFloat(playerYaw);
                b.putFloat(playerPitch);
                payload.write(b.array());
                payload.write(detectedModernTail != null && detectedModernTail.length > 0
                        ? detectedModernTail
                        : new byte[]{0, 0, 0, 0});
            } else {
                ByteBuffer b = ByteBuffer.allocate(32);
                b.putDouble(playerX);
                b.putDouble(playerY);
                b.putDouble(playerZ);
                b.putFloat(playerYaw);
                b.putFloat(playerPitch);
                byte flags = 0;
                int teleportId = nextTpId++;
                payload.write(b.array());
                payload.write(flags);
                writeVarInt(payload, teleportId);
            }
            return packPayload(payload.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }
    private boolean canInjectTo(ClientEntry entry) {
        if (entry == null || !entry.ready || entry.isClosed()) return false;
        long readyMs = entry.readyAtMs;
        return readyMs > 0L && (System.currentTimeMillis() - readyMs) >= INJECT_READY_GRACE_MS;
    }
    private void resetConnection() {
        for (ClientEntry c : clients) c.close();
        clients.clear();
        resetRemoteOnly();
    }

    private void resetRemoteOnly() {
        close(remoteSocket);
        remoteSocket = null;
        remoteIn     = null;
        remoteOut    = null;
        remoteUp     = false;
        activeIdx    = 0;
        lastInjectX = Double.NaN;
        lastInjectY = Double.NaN;
        lastInjectZ = Double.NaN;
        firstReady   = false;
        firstReadyAtMs = 0L;
        firstS2CAtMs = 0L;
        s2cCount     = 0;
        posKnown     = false;
        nextTpId     = 30000;
        protocol     = 0;
        detectedSyncPacketId = -1;
        detectedModernSync = false;
        detectedModernTail = null;
        lastInjectFromMoveMs = 0L;
        compressionThreshold = -1;
        synchronized (cacheLock) {
            cachedPackets.clear();
        }
    }

    private void handleActiveClientDisconnected() {
        log("Active client disconnected, finding next...");
        synchronized (this) {
            if (clients.isEmpty()) {
                resetRemoteOnly();
                return;
            }
            for (int i = 0; i < clients.size(); i++) {
                int idx = (activeIdx + i) % clients.size();
                ClientEntry e = clients.get(idx);
                if (e.ready) {
                    activeIdx = idx;
                    log("Switched active to client #" + (idx + 1));
                    if (posKnown && canInjectTo(e)) sendSyncPos(e);
                    return;
                }
            }
            resetRemoteOnly();
        }
    }
    private void loadUpstreamProxyFromEnv() {
        try {
            boolean enabled = Boolean.parseBoolean(getenvOrProperty("PROXY_UPSTREAM_ENABLED", "false"));
            if (!enabled) {
                return;
            }
            String host = getenvOrProperty("PROXY_UPSTREAM_HOST", "").trim();
            int port = parsePort(getenvOrProperty("PROXY_UPSTREAM_PORT", null), -1);
            if (host.isEmpty() || port < 1 || port > 65535) {
                return;
            }
            upstreamSocks5 = !"SOCKS4".equalsIgnoreCase(getenvOrProperty("PROXY_UPSTREAM_TYPE", "SOCKS5"));
            upstreamLogin = getenvOrProperty("PROXY_UPSTREAM_LOGIN", "");
            upstreamPassword = getenvOrProperty("PROXY_UPSTREAM_PASSWORD", "");
            upstreamHost = host;
            upstreamPort = port;
            upstreamProxy = new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(host, port));
            upstreamEnabled = true;

            System.setProperty("socksProxyVersion", upstreamSocks5 ? "5" : "4");
            if (!upstreamLogin.isEmpty()) {
                System.setProperty("java.net.socks.username", upstreamLogin);
            }
            if (!upstreamPassword.isEmpty()) {
                System.setProperty("java.net.socks.password", upstreamPassword);
            }
            if (!upstreamLogin.isEmpty() || !upstreamPassword.isEmpty()) {
                final String user = upstreamLogin;
                final char[] pass = upstreamPassword.toCharArray();
                Authenticator.setDefault(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, pass);
                    }
                });
            }
            log("Upstream proxy: " + upstreamStatusToken());
        } catch (Exception e) {
            upstreamProxy = Proxy.NO_PROXY;
            upstreamEnabled = false;
            upstreamHost = "";
            upstreamPort = 0;
            upstreamLogin = "";
            upstreamPassword = "";
        }
    }
    private static String getenvOrProperty(String key, String def) {
        String env = System.getenv(key);
        if (env != null) return env;
        String prop = System.getProperty(key);
        return prop != null ? prop : def;
    }
    private Socket connectTarget(int timeoutMs) throws IOException {
        boolean viaUpstream = shouldUseUpstreamForTarget();
        Socket socket = viaUpstream ? new Socket(upstreamProxy) : new Socket(Proxy.NO_PROXY);
        InetSocketAddress address = viaUpstream
                ? InetSocketAddress.createUnresolved(targetHost, targetPort)
                : new InetSocketAddress(targetHost, targetPort);
        socket.connect(address, timeoutMs);
        return socket;
    }
    private boolean shouldUseUpstreamForTarget() {
        if (!upstreamEnabled) return false;
        if (targetHost == null || targetHost.isBlank()) return false;
        String host = targetHost.trim().toLowerCase(Locale.ROOT);
        if ("localhost".equals(host)
                || "127.0.0.1".equals(host)
                || "0.0.0.0".equals(host)
                || "::1".equals(host)
                || "[::1]".equals(host)
                || "0:0:0:0:0:0:0:1".equals(host)) {
            return false;
        }
        try {
            InetAddress resolved = InetAddress.getByName(targetHost);
            if (resolved.isAnyLocalAddress() || resolved.isLoopbackAddress()) {
                return false;
            }
            if (NetworkInterface.getByInetAddress(resolved) != null) {
                return false;
            }
        } catch (Exception ignored) {
        }
        return true;
    }
    private String upstreamStatusToken() {
        if (!upstreamEnabled) return "off";
        String auth = (upstreamLogin.isEmpty() && upstreamPassword.isEmpty()) ? "na" : "auth";
        return (upstreamSocks5 ? "s5@" : "s4@") + upstreamHost + ":" + upstreamPort + ":" + auth;
    }
    private static int parsePort(String raw, int fallback) {
        try {
            return Integer.parseInt(raw == null ? "" : raw.trim());
        } catch (Exception e) {
            return fallback;
        }
    }
    private void maybeDetectCompression(byte[] frameData) {
        if (compressionThreshold >= 0 || frameData == null || frameData.length == 0) return;
        int[] c = new int[1];
        int id = rvi(frameData, 0, c);
        if (c[0] <= 0) return;
        int off = c[0];
        if (id != 0x03) return;
        int[] c2 = new int[1];
        int threshold = rvi(frameData, off, c2);
        if (c2[0] <= 0) return;
        off += c2[0];
        if (off != frameData.length) return;
        if (threshold < 0 || threshold > 2_000_000) return;
        compressionThreshold = threshold;
        log("Compression enabled, threshold=" + threshold);
    }
    private byte[] unpackPayload(byte[] frameData) {
        if (frameData == null) return null;
        if (compressionThreshold < 0) return frameData;
        int[] c = new int[1];
        int dataLen = rvi(frameData, 0, c);
        if (c[0] <= 0 || c[0] > frameData.length) return null;
        int off = c[0];
        if (dataLen == 0) {
            return Arrays.copyOfRange(frameData, off, frameData.length);
        }
        if (dataLen < 0 || dataLen > 8_388_608) return null;
        byte[] compressed = Arrays.copyOfRange(frameData, off, frameData.length);
        return inflateExact(compressed, dataLen);
    }
    private byte[] packPayload(byte[] payload) throws IOException {
        ByteArrayOutputStream frameBody = new ByteArrayOutputStream();
        if (compressionThreshold >= 0) {
            if (compressionThreshold > 0 && payload.length >= compressionThreshold) {
                writeVarInt(frameBody, payload.length);
                frameBody.write(deflate(payload));
            } else {
                writeVarInt(frameBody, 0);
                frameBody.write(payload);
            }
        } else {
            frameBody.write(payload);
        }
        byte[] body = frameBody.toByteArray();
        ByteArrayOutputStream packet = new ByteArrayOutputStream();
        writeVarInt(packet, body.length);
        packet.write(body);
        return packet.toByteArray();
    }
    private static byte[] deflate(byte[] input) {
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        while (!deflater.finished()) {
            int n = deflater.deflate(buf);
            if (n <= 0) break;
            out.write(buf, 0, n);
        }
        deflater.end();
        return out.toByteArray();
    }
    private static byte[] inflateExact(byte[] compressed, int expectedLen) {
        Inflater inflater = new Inflater();
        inflater.setInput(compressed);
        byte[] out = new byte[expectedLen];
        int off = 0;
        try {
            while (off < expectedLen) {
                int n = inflater.inflate(out, off, expectedLen - off);
                if (n <= 0) {
                    if (inflater.finished() || inflater.needsInput() || inflater.needsDictionary()) {
                        break;
                    }
                } else {
                    off += n;
                }
            }
            if (off != expectedLen) return null;
            return out;
        } catch (DataFormatException e) {
            return null;
        } finally {
            inflater.end();
        }
    }
    private void removeClient(ClientEntry c) {
        int idx = clients.indexOf(c);
        c.close();
        if (!clients.remove(c)) return;
        log("Client removed, left: " + clients.size());
        if (clients.isEmpty()) {
            activeIdx = 0;
        } else {
            if (idx >= 0 && idx < activeIdx) {
                activeIdx--;
            }
            if (activeIdx >= clients.size()) {
                activeIdx = clients.size() - 1;
            }
        }
    }
    private static int readVarInt(InputStream in) throws IOException {
        int n = 0, r = 0;
        byte b;
        do {
            int v = in.read();
            if (v == -1) throw new EOFException();
            b = (byte) v;
            r |= (b & 0x7F) << (7 * n++);
            if (n > 5) throw new RuntimeException("VarInt too big");
        } while ((b & 0x80) != 0);
        return r;
    }
    private static void writeVarInt(OutputStream o, int v) throws IOException {
        do {
            byte t = (byte) (v & 0x7F);
            v >>>= 7;
            if (v != 0) t |= 0x80;
            o.write(t);
        } while (v != 0);
    }
    private static int rvi(byte[] d, int off, int[] consumed) {
        int n = 0, r = 0;
        byte b;
        do {
            if (off + n >= d.length) break;
            b = d[off + n];
            r |= (b & 0x7F) << (7 * n++);
            if (n > 5) throw new RuntimeException("VarInt too big");
        } while ((b & 0x80) != 0);
        consumed[0] = n;
        return r;
    }
    private byte[] readExact(InputStream in, int len) throws IOException {
        byte[] d = new byte[len];
        int off = 0;
        while (off < len) {
            int r = in.read(d, off, len - off);
            if (r == -1) throw new EOFException();
            off += r;
        }
        return d;
    }
    private byte[] readPacket(InputStream in) throws IOException {
        int len = readVarInt(in);
        byte[] body = readExact(in, len);
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        writeVarInt(a, len);
        a.write(body);
        return a.toByteArray();
    }
    private byte[] buildHandshake(int ver, String host, int port, int state) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        writeVarInt(b, 0x00);
        writeVarInt(b, ver);
        byte[] hb = host.getBytes(StandardCharsets.UTF_8);
        writeVarInt(b, hb.length);
        b.write(hb);
        b.write((port >>> 8) & 0xFF);
        b.write(port & 0xFF);
        writeVarInt(b, state);
        ByteArrayOutputStream p = new ByteArrayOutputStream();
        writeVarInt(p, b.size());
        p.write(b.toByteArray());
        return p.toByteArray();
    }
    private void close(Socket s) {
        try { if (s != null) s.close(); } catch (Exception ignored) {}
    }
    private void log(String m) {
        System.out.println("[" + java.time.LocalTime.now().toString().substring(0, 8) + "] " + m);
    }
}
