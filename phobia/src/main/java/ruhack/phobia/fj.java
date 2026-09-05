/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_7439
 */
package ruhack.phobia;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import net.minecraft.class_7439;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.cr;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.pp;

public class fj
extends ds {
    private boolean hasLastPos;
    private static int[] hxhl = new int[1135];
    private PrintWriter senderWriter;
    private Socket clientSocket;
    private String currentRegionName;
    private boolean connectionMessagePrinted;
    private boolean serverRunning;
    private Socket senderSocket;
    private double lastPlayerX;
    private ServerSocket serverSocket;
    public static final int b;
    private String lastUsername;
    private PrintWriter writer;
    private int serverLimit;
    private double lastPlayerY;
    private final Queue<String> messageQueue;
    private boolean awaitingRegionList;
    public static final boolean a;
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static int[] hxhm;
    private double lastPlayerZ;
    private boolean awaitingLimitMessage;
    private final kf mode;
    protected static final long pb = -3322977449239204616L;
    private static final long RETRY_DELAY_MS = 3000L;
    private final Queue<String> commandQueue;
    private final kg regionRadius;
    private BufferedReader reader;
    private BufferedReader senderReader;
    private JsonObject lastReceivedMessage;
    private static final int RECEIVER_PORT = 12449;
    private final ka sendKey;
    private long lastSendTime;
    private static long[] hxht;
    private boolean awaitingClaim;
    private ScheduledExecutorService scheduler;
    private Thread senderThread;
    private static long[] hxhu;
    private static final SecureRandom RANDOM;
    public static final boolean c;
    private boolean clientConnected;
    private int currentRadius;
    private static final long COMMAND_DELAY_MS = 500L;
    private Thread serverThread;
    private static final long SEND_COOLDOWN_MS = 5000L;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @aw
    public void onPacket(cr var1_1) {
        block396: {
            block401: {
                block398: {
                    block400: {
                        block399: {
                            block397: {
                                var13_2 = fj.c;
                                var12_3 /* !! */  = fj.b;
                                var11_4 = fj.a;
                                if (var13_2) {
                                    throw null;
                                }
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                if (!this.mode.isSelected("\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c")) ** GOTO lbl-1000
                                if (var11_4 != false) return;
                                var3_5 = var1_1.getPacket();
                                if (var11_4 != false) return;
                                if (var3_5 instanceof class_7439) {
                                    if (var11_4 != false) return;
                                    var2_6 = (class_7439)var3_5;
                                    if (var11_4 != false) return;
                                    if (var11_4 != false) return;
                                    if (var13_2) {
                                        throw null;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    if (var11_4 != false) return;
                                    if (var11_4 != false) return;
                                    return;
                                }
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                var3_5 = var2_6.comp_763().getString();
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                if (!this.awaitingRegionList) break block397;
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                if (var3_5.contains("(FAWE)")) {
                                    if (var11_4 != false) return;
                                    if (var11_4 != false) return;
                                    this.awaitingRegionList = fj.hxhn("hyid", hxhp(int ), (int)410);
                                    if (var11_4 != false) return;
                                    if (var11_4 != false) return;
                                    if (var3_5.contains("No results found.")) {
                                        if (var11_4 != false) return;
                                        if (var11_4 != false) return;
                                        this.queueRegionCommands();
                                        if (var11_4 != false) return;
                                        if (var13_2) {
                                            throw null;
                                        }
                                    } else {
                                        block395: {
                                            if (var11_4 != false) return;
                                            if (var11_4 != false) return;
                                            var4_7 = Pattern.compile("\\+\\s+(rgab_\\w{8})");
                                            if (var11_4 != false) return;
                                            if (var11_4 != false) return;
                                            var5_13 = var4_7.matcher((CharSequence)var3_5);
                                            if (var11_4 != false) return;
                                            do {
                                                if (var11_4 != false) return;
                                                if (var11_4 != false) return;
                                                if (!var5_13.find()) break block395;
                                                if (var11_4 != false) return;
                                                if (var11_4 != false) return;
                                                var6_16 = var5_13.group((int)fj.hxhn("hyie", hxhp(int ), (int)411));
                                                if (var11_4 != false) return;
                                                if (var11_4 != false) return;
                                                this.commandQueue.offer("/rg remove " + var6_16);
                                                if (var11_4 != false) return;
                                                if (var11_4 != false) return;
                                            } while (!var13_2);
                                            throw null;
                                        }
                                        if (var11_4 != false) return;
                                        if (var11_4 != false) return;
                                        CompletableFuture.runAsync((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacket$4(), ()V)((fj)this));
                                        if (var11_4 != false) return;
                                        if (var11_4 != false) return;
                                        if (var13_2) {
                                            throw null;
                                        }
                                    }
                                }
                                ** GOTO lbl314
                            }
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            if (!this.awaitingClaim) break block398;
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            if (!var3_5.contains("\u0412\u044b \u0437\u0430\u043f\u0440\u0438\u0432\u0430\u0442\u0438\u043b\u0438")) break block399;
                            if (var11_4 != false) return;
                            if (!var3_5.contains(this.currentRegionName)) break block399;
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            this.awaitingClaim = fj.hxhn("hyif", hxhp(int ), (int)412);
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            this.commandQueue.offer("/rg addMember " + this.currentRegionName + " " + this.lastUsername);
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            var4_8 = this;
                            // MONITORENTER : var4_8
                            if (var11_4 != false) return;
                            try {
                                if (var11_4 != false) return;
                                if (this.writer != null) {
                                    if (var11_4 != false) return;
                                    if (var11_4 != false) return;
                                    this.writer.println("REGION_CLAIMED");
                                    if (var11_4 != false) return;
                                }
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                // MONITOREXIT : var4_8
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                ** if (!var13_2) goto lbl-1000
                            }
                            catch (Throwable var7_18) {
                                if (var11_4 != false) return;
                                // MONITOREXIT : var4_8
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                throw var7_18;
                            }
lbl-1000:
                            // 1 sources

                            {
                                throw null;
                            }
lbl-1000:
                            // 1 sources

                            {
                            }
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            if (var13_2) {
                                throw null;
                            }
                            ** GOTO lbl314
                        }
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        if (!var3_5.contains("\u042d\u0442\u043e \u0440\u0435\u0433\u0438\u043e\u043d \u043f\u0435\u0440\u0435\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0447\u0443\u0436\u043e\u0439 \u0440\u0435\u0433\u0438\u043e\u043d.")) break block400;
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        var4_9 = this;
                        // MONITORENTER : var4_9
                        if (var11_4 != false) return;
                        try {
                            if (var11_4 != false) return;
                            if (this.writer != null) {
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                this.writer.println("OVERLAP_ERROR");
                                if (var11_4 != false) return;
                            }
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_9
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            ** if (!var13_2) goto lbl-1000
                        }
                        catch (Throwable var8_19) {
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_9
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            throw var8_19;
                        }
lbl-1000:
                        // 1 sources

                        {
                            throw null;
                        }
lbl-1000:
                        // 1 sources

                        {
                        }
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.awaitingClaim = fj.hxhn("hyig", hxhp(int ), (int)413);
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.commandQueue.clear();
                        if (var11_4 != false) return;
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl314
                    }
                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    if (var3_5.contains("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0437\u0430\u043f\u0440\u0438\u0432\u0430\u0442\u0438\u0442\u044c")) {
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.awaitingLimitMessage = fj.hxhn("hyih", hxhp(int ), (int)414);
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.commandQueue.clear();
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        var4_10 = this;
                        // MONITORENTER : var4_10
                        if (var11_4 != false) return;
                        try {
                            if (var11_4 != false) return;
                            if (this.writer != null) {
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                this.writer.println("SIZE_LIMIT_ERROR");
                                if (var11_4 != false) return;
                            }
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_10
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            ** if (!var13_2) goto lbl-1000
                        }
                        catch (Throwable var9_20) {
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_10
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            throw var9_20;
                        }
lbl-1000:
                        // 1 sources

                        {
                            throw null;
                        }
lbl-1000:
                        // 1 sources

                        {
                        }
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.awaitingClaim = fj.hxhn("hyii", hxhp(int ), (int)415);
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        this.commandQueue.clear();
                        if (var11_4 != false) return;
                        if (var13_2) {
                            throw null;
                        }
                    }
                    ** GOTO lbl314
                }
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                if (!this.awaitingLimitMessage) ** GOTO lbl281
                if (var11_4 != false) return;
                if (!var3_5.contains("\u0412\u0430\u0448 \u043b\u0438\u043c\u0438\u0442:")) ** GOTO lbl281
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                var4_11 = Pattern.compile("\u0412\u0430\u0448 \u043b\u0438\u043c\u0438\u0442: (\\d+), \u0432\u044b \u043f\u043e\u043f\u044b\u0442\u0430\u043b\u0438\u0441\u044c \u0437\u0430\u043f\u0440\u0438\u0432\u0430\u0442\u044c: (\\d+)");
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                var5_14 = var4_11.matcher((CharSequence)var3_5);
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                if (!var5_14.find()) ** GOTO lbl276
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                this.serverLimit = Integer.parseInt(var5_14.group((int)fj.hxhn("hyij", hxhp(int ), (int)416)));
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                if (this.lastReceivedMessage == null) ** GOTO lbl269
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                var6_17 = this.calculateNewRadius(this.serverLimit);
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                if (var6_17 < fj.hxhn("hyik", hxhp(int ), (int)417)) break block401;
                if (var11_4 != false) return;
                if (var6_17 >= this.currentRadius) break block401;
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                this.currentRadius = var6_17;
                if (var11_4 != false) return;
                if (var11_4 != false) return;
                CompletableFuture.runAsync((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacket$5(), ()V)((fj)this));
                if (var11_4 != false) return;
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            if (var11_4 != false) return;
            if (var11_4 != false) return;
            this.awaitingLimitMessage = fj.hxhn("hyil", hxhp(int ), (int)418);
            if (var11_4 != false) return;
            if (var11_4 != false) return;
            if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var12_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.awaitingClaim = fj.hxhn("hyim", hxhp(int ), (int)419);
                        if (var11_4 != false) return;
lbl264:
                        // 2 sources

                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl276
                    }
lbl269:
                    // 1 sources

                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    this.awaitingLimitMessage = fj.hxhn("hyin", hxhp(int ), (int)420);
                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    this.awaitingClaim = fj.hxhn("hyio", hxhp(int ), (int)421);
                    if (var11_4 != false) return;
lbl276:
                    // 3 sources

                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl314
lbl281:
                    // 2 sources

                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    if (var3_5.contains("\u041d\u0435 \u0441\u043f\u0430\u043c\u044c!")) {
                        if (var11_4 != false) return;
                        if (var11_4 != false) return;
                        var4_12 = this.commandQueue;
                        // MONITORENTER : var4_12
                        if (var11_4 != false) return;
                        try {
                            if (var11_4 != false) return;
                            if (!this.commandQueue.isEmpty()) {
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                var5_15 = this.commandQueue.peek();
                                if (var11_4 != false) return;
                                if (var11_4 != false) return;
                                CompletableFuture.runAsync((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacket$6(java.lang.String ), ()V)((fj)this, (String)var5_15));
                                if (var11_4 != false) return;
                            }
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_12
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            ** if (!var13_2) goto lbl-1000
                        }
                        catch (Throwable var10_21) {
                            if (var11_4 != false) return;
                            // MONITOREXIT : var4_12
                            if (var11_4 != false) return;
                            if (var11_4 != false) return;
                            throw var10_21;
                        }
lbl-1000:
                        // 1 sources

                        {
                            throw null;
                        }
lbl-1000:
                        // 1 sources

                        {
                        }
                    }
lbl314:
                    // 9 sources

                    if (var11_4 != false) return;
                    if (var11_4 != false) return;
                    return;
                    case 3: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyis", hxhp(int ), (int)425);
                        cfr_temp_0 = 146;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 4: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyit", hxhp(int ), (int)426);
                        cfr_temp_0 = 54;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 7: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiw", hxhp(int ), (int)429);
                        cfr_temp_0 = 82;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 13: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjc", hxhp(int ), (int)435);
                        cfr_temp_0 = 98;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 15: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyje", hxhp(int ), (int)437);
                        cfr_temp_0 = 46;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 18: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjh", hxhp(int ), (int)440);
                        cfr_temp_0 = 74;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 21: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjk", hxhp(int ), (int)443);
                        cfr_temp_0 = 77;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 29: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjs", hxhp(int ), (int)451);
                        cfr_temp_0 = 144;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 32: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjv", hxhp(int ), (int)454);
                        cfr_temp_0 = 136;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 34: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjx", hxhp(int ), (int)456);
                        cfr_temp_0 = 52;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 36: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjz", hxhp(int ), (int)458);
                        cfr_temp_0 = 25;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 38: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykb", hxhp(int ), (int)460);
                        cfr_temp_0 = 127;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 40: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykd", hxhp(int ), (int)462);
                        cfr_temp_0 = 10;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 41: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyke", hxhp(int ), (int)463);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 28: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjr", hxhp(int ), (int)450);
                        cfr_temp_0 = 127;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 43: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykg", hxhp(int ), (int)465);
                        cfr_temp_0 = 83;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 45: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyki", hxhp(int ), (int)467);
                        cfr_temp_0 = 141;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 47: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykk", hxhp(int ), (int)469);
                        cfr_temp_0 = 121;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 48: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykl", hxhp(int ), (int)470);
                        cfr_temp_0 = 87;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 49: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykm", hxhp(int ), (int)471);
                        cfr_temp_0 = 95;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 51: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyko", hxhp(int ), (int)473);
                        cfr_temp_0 = 128;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 53: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykq", hxhp(int ), (int)475);
                        cfr_temp_0 = 52;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 56: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykt", hxhp(int ), (int)478);
                        cfr_temp_0 = 84;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 58: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykv", hxhp(int ), (int)480);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 24: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjn", hxhp(int ), (int)446);
                        cfr_temp_0 = 116;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 61: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyky", hxhp(int ), (int)483);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 42: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykf", hxhp(int ), (int)464);
                        cfr_temp_0 = 16;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 65: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylc", hxhp(int ), (int)487);
                        cfr_temp_0 = 8;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 66: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyld", hxhp(int ), (int)488);
                        cfr_temp_0 = 142;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 68: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylf", hxhp(int ), (int)490);
                        cfr_temp_0 = 86;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 69: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylg", hxhp(int ), (int)491);
                        cfr_temp_0 = 115;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 70: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylh", hxhp(int ), (int)492);
                        cfr_temp_0 = 130;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 73: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylk", hxhp(int ), (int)495);
                        cfr_temp_0 = 135;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 77: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylo", hxhp(int ), (int)499);
                        cfr_temp_0 = 143;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 78: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylp", hxhp(int ), (int)500);
                        cfr_temp_0 = 104;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 80: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylr", hxhp(int ), (int)502);
                        cfr_temp_0 = 169;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 82: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylt", hxhp(int ), (int)504);
                        cfr_temp_0 = 100;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 83: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylu", hxhp(int ), (int)505);
                        cfr_temp_0 = 59;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 86: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylx", hxhp(int ), (int)508);
                        cfr_temp_0 = 125;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 90: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymb", hxhp(int ), (int)512);
                        cfr_temp_0 = 126;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 91: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymc", hxhp(int ), (int)513);
                        cfr_temp_0 = 159;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 92: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymd", hxhp(int ), (int)514);
                        cfr_temp_0 = 153;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 95: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymg", hxhp(int ), (int)517);
                        cfr_temp_0 = 145;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 98: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymj", hxhp(int ), (int)520);
                        cfr_temp_0 = 50;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 100: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyml", hxhp(int ), (int)522);
                        cfr_temp_0 = 105;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 101: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymm", hxhp(int ), (int)523);
                        cfr_temp_0 = 89;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 103: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymo", hxhp(int ), (int)525);
                        cfr_temp_0 = 160;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 104: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymp", hxhp(int ), (int)526);
                        cfr_temp_0 = 64;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 105: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymq", hxhp(int ), (int)527);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyir", hxhp(int ), (int)424);
                        cfr_temp_0 = 116;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 107: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyms", hxhp(int ), (int)529);
                        cfr_temp_0 = 111;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 108: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymt", hxhp(int ), (int)530);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 102: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymn", hxhp(int ), (int)524);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 31: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyju", hxhp(int ), (int)453);
                        cfr_temp_0 = 162;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 109: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymu", hxhp(int ), (int)531);
                        cfr_temp_0 = 129;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 110: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymv", hxhp(int ), (int)532);
                        cfr_temp_0 = 142;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 113: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymy", hxhp(int ), (int)535);
                        cfr_temp_0 = 160;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 114: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymz", hxhp(int ), (int)536);
                        cfr_temp_0 = 67;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 116: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynb", hxhp(int ), (int)538);
                        cfr_temp_0 = 23;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 117: {
                        var12_3 /* !! */  = (int)fj.hxhn("hync", hxhp(int ), (int)539);
                        cfr_temp_0 = 60;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 119: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyne", hxhp(int ), (int)541);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyja", hxhp(int ), (int)433);
                        cfr_temp_0 = 44;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 122: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynh", hxhp(int ), (int)544);
                        cfr_temp_0 = 157;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 123: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyni", hxhp(int ), (int)545);
                        cfr_temp_0 = 1;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 125: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynk", hxhp(int ), (int)547);
                        cfr_temp_0 = 72;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 127: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynm", hxhp(int ), (int)549);
                        cfr_temp_0 = 169;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 128: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynn", hxhp(int ), (int)550);
                        cfr_temp_0 = 93;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 129: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyno", hxhp(int ), (int)551);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 62: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykz", hxhp(int ), (int)484);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiv", hxhp(int ), (int)428);
                        cfr_temp_0 = 118;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 130: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynp", hxhp(int ), (int)552);
                        cfr_temp_0 = 64;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 131: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynq", hxhp(int ), (int)553);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 27: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjq", hxhp(int ), (int)449);
                        cfr_temp_0 = 164;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 134: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynt", hxhp(int ), (int)556);
                        cfr_temp_0 = 96;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 135: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynu", hxhp(int ), (int)557);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 23: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjm", hxhp(int ), (int)445);
                        cfr_temp_0 = 124;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 136: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynv", hxhp(int ), (int)558);
                        cfr_temp_0 = 35;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 137: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynw", hxhp(int ), (int)559);
                        cfr_temp_0 = 64;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 138: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynx", hxhp(int ), (int)560);
                        cfr_temp_0 = 25;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 142: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzr", hxhp(int ), (int)564);
                        cfr_temp_0 = 96;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 143: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzs", hxhp(int ), (int)565);
                        cfr_temp_0 = 124;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 144: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzt", hxhp(int ), (int)566);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiy", hxhp(int ), (int)431);
                        cfr_temp_0 = 81;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 145: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzu", hxhp(int ), (int)567);
                        cfr_temp_0 = 89;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 146: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzv", hxhp(int ), (int)568);
                        cfr_temp_0 = 156;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 147: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzw", hxhp(int ), (int)569);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiq", hxhp(int ), (int)423);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 121: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyng", hxhp(int ), (int)543);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 44: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykh", hxhp(int ), (int)466);
                        cfr_temp_0 = 33;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 148: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzx", hxhp(int ), (int)570);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjl", hxhp(int ), (int)444);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 79: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylq", hxhp(int ), (int)501);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 120: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynf", hxhp(int ), (int)542);
                        cfr_temp_0 = 50;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 149: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzy", hxhp(int ), (int)571);
                        cfr_temp_0 = 161;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 151: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaa", hxhp(int ), (int)573);
                        cfr_temp_0 = 89;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 152: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzab", hxhp(int ), (int)574);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 94: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymf", hxhp(int ), (int)516);
                        cfr_temp_0 = 72;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 153: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzac", hxhp(int ), (int)575);
                        cfr_temp_0 = 171;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 154: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzad", hxhp(int ), (int)576);
                        cfr_temp_0 = 99;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 156: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaf", hxhp(int ), (int)578);
                        cfr_temp_0 = 164;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 157: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzag", hxhp(int ), (int)579);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 39: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykc", hxhp(int ), (int)461);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 67: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyle", hxhp(int ), (int)489);
                        cfr_temp_0 = 59;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 158: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzah", hxhp(int ), (int)580);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjb", hxhp(int ), (int)434);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 155: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzae", hxhp(int ), (int)577);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiz", hxhp(int ), (int)432);
                        cfr_temp_0 = 164;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 159: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzai", hxhp(int ), (int)581);
                        cfr_temp_0 = 35;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 160: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaj", hxhp(int ), (int)582);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjd", hxhp(int ), (int)436);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 106: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymr", hxhp(int ), (int)528);
                        cfr_temp_0 = 87;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 161: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzak", hxhp(int ), (int)583);
                        cfr_temp_0 = 37;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 162: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzal", hxhp(int ), (int)584);
                        cfr_temp_0 = 50;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 163: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzam", hxhp(int ), (int)585);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 140: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzp", hxhp(int ), (int)562);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 97: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymi", hxhp(int ), (int)519);
                        cfr_temp_0 = 169;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 164: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzan", hxhp(int ), (int)586);
                        cfr_temp_0 = 85;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 165: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzao", hxhp(int ), (int)587);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 74: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyll", hxhp(int ), (int)496);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 115: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyna", hxhp(int ), (int)537);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 124: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynj", hxhp(int ), (int)546);
                        cfr_temp_0 = 173;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 167: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaq", hxhp(int ), (int)589);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 72: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylj", hxhp(int ), (int)494);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 84: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylv", hxhp(int ), (int)506);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 30: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjt", hxhp(int ), (int)452);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjw", hxhp(int ), (int)455);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 35: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjy", hxhp(int ), (int)457);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 59: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykw", hxhp(int ), (int)481);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 71: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyli", hxhp(int ), (int)493);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyiu", hxhp(int ), (int)427);
                        cfr_temp_0 = 139;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 169: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzas", hxhp(int ), (int)591);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 132: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynr", hxhp(int ), (int)554);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjg", hxhp(int ), (int)439);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 63: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyla", hxhp(int ), (int)485);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 166: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzap", hxhp(int ), (int)588);
                        cfr_temp_0 = 75;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 170: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzat", hxhp(int ), (int)592);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 52: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykp", hxhp(int ), (int)474);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 76: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyln", hxhp(int ), (int)498);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 26: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjp", hxhp(int ), (int)448);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 141: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzq", hxhp(int ), (int)563);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 81: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyls", hxhp(int ), (int)503);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 171: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzau", hxhp(int ), (int)593);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 60: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykx", hxhp(int ), (int)482);
                        cfr_temp_0 = 85;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 172: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzav", hxhp(int ), (int)594);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 54: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykr", hxhp(int ), (int)476);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 64: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylb", hxhp(int ), (int)486);
                        cfr_temp_0 = 50;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 173: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaw", hxhp(int ), (int)595);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 139: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyny", hxhp(int ), (int)561);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 96: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymh", hxhp(int ), (int)518);
                        cfr_temp_0 = 93;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 174: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzax", hxhp(int ), (int)596);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 93: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyme", hxhp(int ), (int)515);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjj", hxhp(int ), (int)442);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 168: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzar", hxhp(int ), (int)590);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 112: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymx", hxhp(int ), (int)534);
                        cfr_temp_0 = 85;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 176: lbl-1000:
                    // 2 sources

                    {
                        var12_3 /* !! */  = (int)fj.hxhn("hzaz", hxhp(int ), (int)598);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyip", hxhp(int ), (int)422);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjf", hxhp(int ), (int)438);
                        cfr_temp_0 = 0;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 8: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyix", hxhp(int ), (int)430);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 133: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyns", hxhp(int ), (int)555);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 89: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyma", hxhp(int ), (int)511);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 55: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyks", hxhp(int ), (int)477);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 57: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyku", hxhp(int ), (int)479);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 111: {
                        var12_3 /* !! */  = (int)fj.hxhn("hymw", hxhp(int ), (int)533);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 150: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyzz", hxhp(int ), (int)572);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyjo", hxhp(int ), (int)447);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 118: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynd", hxhp(int ), (int)540);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 126: {
                        var12_3 /* !! */  = (int)fj.hxhn("hynl", hxhp(int ), (int)548);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 175: {
                        var12_3 /* !! */  = (int)fj.hxhn("hzay", hxhp(int ), (int)597);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 75: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylm", hxhp(int ), (int)497);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 88: {
                        var12_3 /* !! */  = (int)fj.hxhn("hylz", hxhp(int ), (int)510);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 87: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyly", hxhp(int ), (int)509);
                        cfr_temp_0 = 8;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 19: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyji", hxhp(int ), (int)441);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 37: {
                        var12_3 /* !! */  = (int)fj.hxhn("hyka", hxhp(int ), (int)459);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 46: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykj", hxhp(int ), (int)468);
                        cfr_temp_0 = 19;
                        if (var13_2) {
                            throw null;
                        }
                        break block396;
                    }
                    case 50: {
                        var12_3 /* !! */  = (int)fj.hxhn("hykn", hxhp(int ), (int)472);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 85: lbl-1000:
                    // 2 sources

                    {
                        var12_3 /* !! */  = (int)fj.hxhn("hylw", hxhp(int ), (int)507);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 99: 
                }
                break;
            }
            ** GOTO lbl1226
        }
        do {
            if (true) ** continue;
lbl1226:
            // 2 sources

            var12_3 /* !! */  = (int)fj.hxhn("hymk", hxhp(int ), (int)521);
            cfr_temp_0 = 50;
        } while (!var13_2);
        throw null;
    }

    static {
        hxhm = new int[1135];
        fj.iadt();
        fj.iadv();
        fj.iadx();
        fj.iadz();
        fj.iaec();
        fj.iaef();
        fj.iaej();
        fj.iael();
        fj.iaeq();
        fj.iaev();
        fj.iaex();
        fj.iafb();
        fj.iafd();
        fj.iafe();
        fj.iafg();
        fj.iafk();
        fj.iafo();
        fj.iafp();
        fj.iaft();
        fj.iafw();
        fj.iafx();
        fj.iagb();
        fj.iagf();
        fj.iagh();
        hxht = new long[368];
        hxhu = new long[368];
        fj.iagj();
        fj.iagq();
        fj.iagt();
        fj.iagz();
        fj.iahb();
        fj.iahe();
        fj.iahj();
        fj.iahk();
        RANDOM = new SecureRandom();
    }

    private static /* synthetic */ void iagz() {
        fj.hxht[300] = 7070647497549067378L;
        fj.hxht[301] = 4582534528061177108L;
        fj.hxht[302] = 2409453924709420651L;
        fj.hxht[303] = -4880458807706001270L;
        fj.hxht[304] = -6342691383143454398L;
        fj.hxht[305] = 3253736997390257217L;
        fj.hxht[306] = -1252229004012126377L;
        fj.hxht[307] = -4365150007501504841L;
        fj.hxht[308] = -3457186535804198099L;
        fj.hxht[309] = 877710529615155221L;
        fj.hxht[310] = -6068933645817684359L;
        fj.hxht[311] = -375771684106503441L;
        fj.hxht[312] = -1358868257805796649L;
        fj.hxht[313] = 2393899771301402161L;
        fj.hxht[314] = 7369081350200479089L;
        fj.hxht[315] = 8375390087477732084L;
        fj.hxht[316] = -5684134693304065865L;
        fj.hxht[317] = -4256940275824841187L;
        fj.hxht[318] = -1714072920837467272L;
        fj.hxht[319] = -5817169547775514471L;
        fj.hxht[320] = 2852891783171798660L;
        fj.hxht[321] = 711134060560759298L;
        fj.hxht[322] = -1902354768086784281L;
        fj.hxht[323] = -9128793915626987011L;
        fj.hxht[324] = 416039231587297595L;
        fj.hxht[325] = 8460067480212357456L;
        fj.hxht[326] = -9106216146611363089L;
        fj.hxht[327] = 7039282437655485274L;
        fj.hxht[328] = -2406947221022394590L;
        fj.hxht[329] = -3785882357633227258L;
        fj.hxht[330] = -1804826109504307987L;
        fj.hxht[331] = -2689590485709257496L;
        fj.hxht[332] = -4007505038147182691L;
        fj.hxht[333] = 3111106297612884633L;
        fj.hxht[334] = -2021774715153850793L;
        fj.hxht[335] = -1407672532356504346L;
        fj.hxht[336] = -4444760315316201963L;
        fj.hxht[337] = 5618498572610888367L;
        fj.hxht[338] = 8530982172382964138L;
        fj.hxht[339] = 6805651693831753194L;
        fj.hxht[340] = 5197429920799090879L;
        fj.hxht[341] = -6402068377385307897L;
        fj.hxht[342] = 1744901869576037861L;
        fj.hxht[343] = -4118905479642162283L;
        fj.hxht[344] = 4386647341053368841L;
        fj.hxht[345] = 3893729811661669642L;
        fj.hxht[346] = 454452689037343485L;
        fj.hxht[347] = 3625833192008221779L;
        fj.hxht[348] = 8816293274492073155L;
        fj.hxht[349] = -6428836844961161517L;
        fj.hxht[350] = -6260095954244436458L;
        fj.hxht[351] = -4904273532508856432L;
        fj.hxht[352] = 8580172720274867524L;
        fj.hxht[353] = 7185628450435593469L;
        fj.hxht[354] = -8478384986427885861L;
        fj.hxht[355] = -2601461724354070077L;
        fj.hxht[356] = 6462535189634626038L;
        fj.hxht[357] = 574064289035728719L;
        fj.hxht[358] = -6041942089750077558L;
        fj.hxht[359] = -5864424473785288330L;
        fj.hxht[360] = -9211289462901715612L;
        fj.hxht[361] = -8231791929666183209L;
        fj.hxht[362] = -6029215279669940965L;
        fj.hxht[363] = 4081764320288090826L;
        fj.hxht[364] = 2619425616997395730L;
        fj.hxht[365] = 6777138716761080205L;
        fj.hxht[366] = -2607275140866563877L;
        fj.hxht[367] = 1509345661159477883L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startServer() {
        v0 /* !! */  = fj.pb;
        if (true) ** GOTO lbl5
        block67: while (true) {
            v0 /* !! */  = (long)(fj.hxhn("hxsn", hxhs(int ), (int)103) - fj.hxhn("hxsm", hxhs(int ), (int)102));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1518949128: {
                    break block67;
                }
                case 2036117728: {
                    continue block67;
                }
            }
            break;
        }
        var3_1 = fj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fj.pb - fj.hxhn("hxso", hxhs(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fj.hxhn("hxsp", hxhp(int ), (int)178)) break;
            v1 /* !! */  = (long)fj.hxhn("hxsq", hxhp(int ), (int)179);
        }
        var2_2 /* !! */  = fj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("hxsr", hxhs(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fj.hxhn("hxss", hxhp(int ), (int)180)) break;
            v2 /* !! */  = (long)fj.hxhn("hxst", hxhp(int ), (int)181);
        }
        var1_3 = fj.a;
        if (var3_1) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v3 /* !! */  = fj.pb;
                if (true) ** GOTO lbl36
                block71: while (true) {
                    v3 /* !! */  = (long)(v4 - fj.hxhn("hxsu", hxhs(int ), (int)106));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1577050989: {
                            v4 = fj.hxhn("hxsv", hxhs(int ), (int)107);
                            continue block71;
                        }
                        case -1518949128: {
                            break block71;
                        }
                        case 707176411: {
                            v4 = fj.hxhn("hxsw", hxhs(int ), (int)108);
                            continue block71;
                        }
                        case 1781192879: {
                            v4 = fj.hxhn("hxsx", hxhs(int ), (int)109);
                            continue block71;
                        }
                    }
                    break;
                }
                if (!this.serverRunning) ** GOTO lbl51
                if (var1_3) ** GOTO lbl25
                return;
lbl51:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("hxsy", hxhs(int ), (int)110)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fj.hxhn("hxsz", hxhp(int ), (int)182)) break;
                    v5 /* !! */  = (long)fj.hxhn("hxta", hxhp(int ), (int)183);
                }
                v6 /* !! */  = fj.pb;
                if (true) ** GOTO lbl61
                block73: while (true) {
                    v6 /* !! */  = (long)(v7 - fj.hxhn("hxtb", hxhs(int ), (int)111));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1615830536: {
                            v7 = fj.hxhn("hxtc", hxhs(int ), (int)112);
                            continue block73;
                        }
                        case -1518949128: {
                            break block73;
                        }
                        case -281189332: {
                            v7 = fj.hxhn("hxtd", hxhs(int ), (int)113);
                            continue block73;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c")) ** GOTO lbl197
                if (var1_3 || var1_3) ** GOTO lbl25
                v8 /* !! */  = fj.pb;
                if (true) ** GOTO lbl76
                block74: while (true) {
                    v8 /* !! */  = (long)(v9 - fj.hxhn("hxte", hxhs(int ), (int)114));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1518949128: {
                            break block74;
                        }
                        case -989054734: {
                            v9 = fj.hxhn("hxtf", hxhs(int ), (int)115);
                            continue block74;
                        }
                        case -956091460: {
                            v9 = fj.hxhn("hxtg", hxhs(int ), (int)116);
                            continue block74;
                        }
                        case 981010653: {
                            v9 = fj.hxhn("hxth", hxhs(int ), (int)117);
                            continue block74;
                        }
                    }
                    break;
                }
                v10 /* !! */  = fj.pb;
                if (true) ** GOTO lbl92
                block75: while (true) {
                    v10 /* !! */  = (long)(fj.hxhn("hxtj", hxhs(int ), (int)119) - fj.hxhn("hxti", hxhs(int ), (int)118));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1796177820: {
                            continue block75;
                        }
                        case -1518949128: {
                            break block75;
                        }
                    }
                    break;
                }
                v11 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$startServer$2(), ()V)((fj)this);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("hxtk", hxhs(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fj.hxhn("hxtl", hxhp(int ), (int)184)) break;
                    v12 /* !! */  = (long)fj.hxhn("hxtm", hxhp(int ), (int)185);
                }
                v13 = new Thread(v11);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = fj.pb - fj.hxhn("hxtn", hxhs(int ), (int)121)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fj.hxhn("hxto", hxhp(int ), (int)186)) break;
                    v14 /* !! */  = (long)fj.hxhn("hxtp", hxhp(int ), (int)187);
                }
                this.serverThread = v13;
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = fj.pb - fj.hxhn("hxtq", hxhs(int ), (int)122)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fj.hxhn("hxtr", hxhp(int ), (int)188)) break;
                    v15 /* !! */  = (long)fj.hxhn("hxts", hxhp(int ), (int)189);
                }
                v16 /* !! */  = fj.pb;
                if (true) ** GOTO lbl120
                block79: while (true) {
                    v16 /* !! */  = (long)(v17 - fj.hxhn("hxtt", hxhs(int ), (int)123));
lbl120:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1518949128: {
                            break block79;
                        }
                        case -465373330: {
                            v17 = fj.hxhn("hxtu", hxhs(int ), (int)124);
                            continue block79;
                        }
                        case -405425902: {
                            v17 = fj.hxhn("hxtv", hxhs(int ), (int)125);
                            continue block79;
                        }
                    }
                    break;
                }
                this.serverThread.start();
                if (var1_3 || var1_3) ** GOTO lbl25
                v18 = fj.hxhn("hxtw", hxhp(int ), (int)190);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = fj.pb - fj.hxhn("hxtx", hxhs(int ), (int)126)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fj.hxhn("hxty", hxhp(int ), (int)191)) break;
                    v19 /* !! */  = (long)fj.hxhn("hxtz", hxhp(int ), (int)192);
                }
                v20 = Executors.newScheduledThreadPool((int)v18);
                v21 /* !! */  = fj.pb;
                if (true) ** GOTO lbl142
                block81: while (true) {
                    v21 /* !! */  = (long)(v22 - fj.hxhn("hxua", hxhs(int ), (int)127));
lbl142:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1518949128: {
                            break block81;
                        }
                        case -941202869: {
                            v22 = fj.hxhn("hxub", hxhs(int ), (int)128);
                            continue block81;
                        }
                        case 331106732: {
                            v22 = fj.hxhn("hxuc", hxhs(int ), (int)129);
                            continue block81;
                        }
                        case 1754839935: {
                            v22 = fj.hxhn("hxud", hxhs(int ), (int)130);
                            continue block81;
                        }
                    }
                    break;
                }
                this.scheduler = v20;
                if (var1_3 || var1_3) ** GOTO lbl25
                v23 /* !! */  = fj.pb;
                if (true) ** GOTO lbl160
                block82: while (true) {
                    v23 /* !! */  = (long)(fj.hxhn("hxuf", hxhs(int ), (int)132) - fj.hxhn("hxue", hxhs(int ), (int)131));
lbl160:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1518949128: {
                            break block82;
                        }
                        case 2099584166: {
                            continue block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = fj.pb - fj.hxhn("hxug", hxhs(int ), (int)133)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == fj.hxhn("hxuh", hxhp(int ), (int)193)) break;
                    v24 /* !! */  = (long)fj.hxhn("hxui", hxhp(int ), (int)194);
                }
                v25 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, processCommandQueue(), ()V)((fj)this);
                v26 = fj.hxhn("hxuj", hxhs(int ), (int)134);
                v27 = fj.hxhn("hxuk", hxhs(int ), (int)135);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = fj.pb - fj.hxhn("hxul", hxhs(int ), (int)136)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == fj.hxhn("hxum", hxhp(int ), (int)195)) break;
                    v28 /* !! */  = (long)fj.hxhn("hxun", hxhp(int ), (int)196);
                }
                v29 /* !! */  = fj.pb;
                if (true) ** GOTO lbl182
                block85: while (true) {
                    v29 /* !! */  = (long)(v30 - fj.hxhn("hxuo", hxhs(int ), (int)137));
lbl182:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1518949128: {
                            break block85;
                        }
                        case -174866810: {
                            v30 = fj.hxhn("hxup", hxhs(int ), (int)138);
                            continue block85;
                        }
                        case 393707795: {
                            v30 = fj.hxhn("hxuq", hxhs(int ), (int)139);
                            continue block85;
                        }
                        case 656467836: {
                            v30 = fj.hxhn("hxur", hxhs(int ), (int)140);
                            continue block85;
                        }
                    }
                    break;
                }
                this.scheduler.scheduleAtFixedRate(v25, (long)v26, (long)v27, TimeUnit.MILLISECONDS);
                if (var1_3) ** GOTO lbl25
lbl197:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl200:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fj.hxhn("hxus", hxhp(int ), (int)197);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl205:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)fj.hxhn("hxut", hxhp(int ), (int)198);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 2: {
                var2_2 /* !! */  = (int)fj.hxhn("hxuu", hxhp(int ), (int)199);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
lbl214:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fj.hxhn("hxuv", hxhp(int ), (int)200);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl219:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fj.hxhn("hxuw", hxhp(int ), (int)201);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl224:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fj.hxhn("hxux", hxhp(int ), (int)202);
                if (!var3_1) ** GOTO lbl219
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fj.hxhn("hxuy", hxhp(int ), (int)203);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)fj.hxhn("hxuz", hxhp(int ), (int)204);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl237:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fj.hxhn("hxva", hxhp(int ), (int)205);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl242:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvb", hxhp(int ), (int)206);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 10: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvc", hxhp(int ), (int)207);
                if (var3_1) {
                    throw null;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvd", hxhp(int ), (int)208);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl256:
            // 5 sources

            case 12: {
                var2_2 /* !! */  = (int)fj.hxhn("hxve", hxhp(int ), (int)209);
                if (!var3_1) ** GOTO lbl200
                throw null;
            }
lbl260:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvf", hxhp(int ), (int)210);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl265:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvg", hxhp(int ), (int)211);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
lbl269:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvh", hxhp(int ), (int)212);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)fj.hxhn("hxvi", hxhp(int ), (int)213);
                if (!var3_1) ** GOTO lbl224
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fj.hxhn("hxvj", hxhp(int ), (int)214);
                    if (!var3_1) ** GOTO lbl237
                    throw null;
                }
            }
            case 18: 
        }
        var2_2 /* !! */  = (int)fj.hxhn("hxvk", hxhp(int ), (int)215);
        ** while (!var3_1)
lbl285:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iahe() {
        fj.hxhu[100] = 6263266134237836301L;
        fj.hxhu[101] = -8586758049544664683L;
        fj.hxhu[102] = -3603363782970726632L;
        fj.hxhu[103] = 8786398801838712276L;
        fj.hxhu[104] = 4673193948019546314L;
        fj.hxhu[105] = 7297897873807507297L;
        fj.hxhu[106] = 1673025133989481049L;
        fj.hxhu[107] = 3604477565373467924L;
        fj.hxhu[108] = 6011107382410426200L;
        fj.hxhu[109] = -2519274531675675371L;
        fj.hxhu[110] = 6149888750367137975L;
        fj.hxhu[111] = 5517110964631121985L;
        fj.hxhu[112] = -4775305801244202481L;
        fj.hxhu[113] = -2905532799299159495L;
        fj.hxhu[114] = -2976572928708155056L;
        fj.hxhu[115] = -7840942042589674335L;
        fj.hxhu[116] = -5964470593127758030L;
        fj.hxhu[117] = -4308951136974651719L;
        fj.hxhu[118] = 2549893315391793747L;
        fj.hxhu[119] = 8553993785496939717L;
        fj.hxhu[120] = 8875586236777611919L;
        fj.hxhu[121] = -7969949045237762395L;
        fj.hxhu[122] = 3582672379750189082L;
        fj.hxhu[123] = -6627438152478469796L;
        fj.hxhu[124] = -3377305665778321063L;
        fj.hxhu[125] = -7123021801651748309L;
        fj.hxhu[126] = 5379270342035660520L;
        fj.hxhu[127] = -6691491762523537064L;
        fj.hxhu[128] = 3299240761600947162L;
        fj.hxhu[129] = 1072319199617322484L;
        fj.hxhu[130] = -478945026671068172L;
        fj.hxhu[131] = -8318563424207595802L;
        fj.hxhu[132] = -530588904806953090L;
        fj.hxhu[133] = 6276133149454050041L;
        fj.hxhu[134] = 3425984550834244754L;
        fj.hxhu[135] = -1771465721953292704L;
        fj.hxhu[136] = 8410249074652142560L;
        fj.hxhu[137] = 9005863961777213522L;
        fj.hxhu[138] = -3908092879116634090L;
        fj.hxhu[139] = -8794295913243734711L;
        fj.hxhu[140] = 4283032947928560594L;
        fj.hxhu[141] = -1682418588649362579L;
        fj.hxhu[142] = 4743705856250036523L;
        fj.hxhu[143] = -7265088984493602872L;
        fj.hxhu[144] = 9062202480049262787L;
        fj.hxhu[145] = -6158660414155862003L;
        fj.hxhu[146] = 5471869883947298700L;
        fj.hxhu[147] = -2194489540426935805L;
        fj.hxhu[148] = 802427975051180924L;
        fj.hxhu[149] = 2017636631708334318L;
        fj.hxhu[150] = -2011090917869691666L;
        fj.hxhu[151] = -5091841599632597584L;
        fj.hxhu[152] = 2254624810859503781L;
        fj.hxhu[153] = -4260020793468069265L;
        fj.hxhu[154] = -2259361698313212400L;
        fj.hxhu[155] = 9124628358759593077L;
        fj.hxhu[156] = -4113984651075527217L;
        fj.hxhu[157] = 3508757133568376920L;
        fj.hxhu[158] = -4526568524668930955L;
        fj.hxhu[159] = 288169360925459855L;
        fj.hxhu[160] = -3425617653309193985L;
        fj.hxhu[161] = 6091541434514648440L;
        fj.hxhu[162] = 5888079490284928419L;
        fj.hxhu[163] = 6496755786845505756L;
        fj.hxhu[164] = -6938032681490846490L;
        fj.hxhu[165] = 2654250249647315489L;
        fj.hxhu[166] = 4945547014561995675L;
        fj.hxhu[167] = 6128169025596471120L;
        fj.hxhu[168] = 7903721935597790337L;
        fj.hxhu[169] = -7137615579206464433L;
        fj.hxhu[170] = 4311189746713921789L;
        fj.hxhu[171] = 5862356924244619910L;
        fj.hxhu[172] = -6309636846973924508L;
        fj.hxhu[173] = 7082728611886210757L;
        fj.hxhu[174] = -1841213997676484231L;
        fj.hxhu[175] = -7677966618413069980L;
        fj.hxhu[176] = -7290266496176735436L;
        fj.hxhu[177] = 8174088104618801605L;
        fj.hxhu[178] = 1613563618756719988L;
        fj.hxhu[179] = -8528039381505936680L;
        fj.hxhu[180] = -5373947004477513201L;
        fj.hxhu[181] = 7001297231871454233L;
        fj.hxhu[182] = 81080156871965433L;
        fj.hxhu[183] = -7874102098515471182L;
        fj.hxhu[184] = 5361278924611902089L;
        fj.hxhu[185] = 351442138445260370L;
        fj.hxhu[186] = 8845258941490471507L;
        fj.hxhu[187] = -8320916165303755975L;
        fj.hxhu[188] = 2576358561647947643L;
        fj.hxhu[189] = 401045804917731024L;
        fj.hxhu[190] = 4418213994246913838L;
        fj.hxhu[191] = -8096911110821783322L;
        fj.hxhu[192] = -5225222257000741836L;
        fj.hxhu[193] = 6099905170762742601L;
        fj.hxhu[194] = -4958580463697084993L;
        fj.hxhu[195] = 5320032284834878042L;
        fj.hxhu[196] = -8016975052592062637L;
        fj.hxhu[197] = 7030983563620266282L;
        fj.hxhu[198] = 5458920020432214866L;
        fj.hxhu[199] = -5025779152350510281L;
    }

    private static /* synthetic */ void iadx() {
        fj.hxhl[200] = -661203647;
        fj.hxhl[201] = -734442432;
        fj.hxhl[202] = 1977369863;
        fj.hxhl[203] = 299318425;
        fj.hxhl[204] = -1374781014;
        fj.hxhl[205] = -2056838335;
        fj.hxhl[206] = -1566586336;
        fj.hxhl[207] = 644916250;
        fj.hxhl[208] = 842923580;
        fj.hxhl[209] = 2133099131;
        fj.hxhl[210] = 1735507088;
        fj.hxhl[211] = -390527164;
        fj.hxhl[212] = -421647464;
        fj.hxhl[213] = 321131858;
        fj.hxhl[214] = 535452655;
        fj.hxhl[215] = -1200283313;
        fj.hxhl[216] = 1610718154;
        fj.hxhl[217] = 1783534001;
        fj.hxhl[218] = -1230766923;
        fj.hxhl[219] = -1333989838;
        fj.hxhl[220] = -1414788394;
        fj.hxhl[221] = 1104595272;
        fj.hxhl[222] = 1984120218;
        fj.hxhl[223] = 510039988;
        fj.hxhl[224] = -271137767;
        fj.hxhl[225] = 1419574267;
        fj.hxhl[226] = -150988146;
        fj.hxhl[227] = -125683162;
        fj.hxhl[228] = 103154649;
        fj.hxhl[229] = 1949553127;
        fj.hxhl[230] = -893043642;
        fj.hxhl[231] = 1157046419;
        fj.hxhl[232] = -1979418207;
        fj.hxhl[233] = -1937841354;
        fj.hxhl[234] = 889929027;
        fj.hxhl[235] = 1962965211;
        fj.hxhl[236] = -89175094;
        fj.hxhl[237] = 2019472455;
        fj.hxhl[238] = -721646073;
        fj.hxhl[239] = -1674978438;
        fj.hxhl[240] = 1497314022;
        fj.hxhl[241] = 1966069748;
        fj.hxhl[242] = -1225994053;
        fj.hxhl[243] = -695737760;
        fj.hxhl[244] = 299562943;
        fj.hxhl[245] = -681141318;
        fj.hxhl[246] = 97635626;
        fj.hxhl[247] = 2011443803;
        fj.hxhl[248] = -958147637;
        fj.hxhl[249] = -194922861;
        fj.hxhl[250] = 258263482;
        fj.hxhl[251] = 830356791;
        fj.hxhl[252] = 463083708;
        fj.hxhl[253] = 737200960;
        fj.hxhl[254] = 1429296846;
        fj.hxhl[255] = -16158301;
        fj.hxhl[256] = 1771707796;
        fj.hxhl[257] = -426766417;
        fj.hxhl[258] = -1403720170;
        fj.hxhl[259] = -1421055761;
        fj.hxhl[260] = 1368802049;
        fj.hxhl[261] = -1379574268;
        fj.hxhl[262] = -1983562744;
        fj.hxhl[263] = -1585439073;
        fj.hxhl[264] = -893831778;
        fj.hxhl[265] = -1717599428;
        fj.hxhl[266] = -1340116599;
        fj.hxhl[267] = 26310002;
        fj.hxhl[268] = -971736946;
        fj.hxhl[269] = -15941744;
        fj.hxhl[270] = -1090353583;
        fj.hxhl[271] = 1527189568;
        fj.hxhl[272] = -1121570948;
        fj.hxhl[273] = 1691913519;
        fj.hxhl[274] = 240584447;
        fj.hxhl[275] = -317985807;
        fj.hxhl[276] = 228473690;
        fj.hxhl[277] = -388436095;
        fj.hxhl[278] = 1881692798;
        fj.hxhl[279] = -625048854;
        fj.hxhl[280] = 1513994433;
        fj.hxhl[281] = -2020597021;
        fj.hxhl[282] = -2103973153;
        fj.hxhl[283] = 121452018;
        fj.hxhl[284] = 83169713;
        fj.hxhl[285] = 808590819;
        fj.hxhl[286] = -1983949377;
        fj.hxhl[287] = 1324648664;
        fj.hxhl[288] = -1655145174;
        fj.hxhl[289] = -740935909;
        fj.hxhl[290] = 99229801;
        fj.hxhl[291] = -1016809097;
        fj.hxhl[292] = -1647945588;
        fj.hxhl[293] = 922010064;
        fj.hxhl[294] = 1063085786;
        fj.hxhl[295] = 623135098;
        fj.hxhl[296] = 1181414383;
        fj.hxhl[297] = -959921704;
        fj.hxhl[298] = 533000971;
        fj.hxhl[299] = -1492384918;
    }

    private static /* synthetic */ void iaft() {
        fj.hxhm[600] = -1064714528;
        fj.hxhm[601] = 1934261493;
        fj.hxhm[602] = -201410921;
        fj.hxhm[603] = -1303790792;
        fj.hxhm[604] = 1078619861;
        fj.hxhm[605] = 468706717;
        fj.hxhm[606] = -1264998862;
        fj.hxhm[607] = 1043361831;
        fj.hxhm[608] = -242467987;
        fj.hxhm[609] = -1179646720;
        fj.hxhm[610] = 840641705;
        fj.hxhm[611] = 2080998060;
        fj.hxhm[612] = 1404220707;
        fj.hxhm[613] = -136035466;
        fj.hxhm[614] = -423768517;
        fj.hxhm[615] = 773695292;
        fj.hxhm[616] = -512484936;
        fj.hxhm[617] = 1355849990;
        fj.hxhm[618] = 417463987;
        fj.hxhm[619] = -302863342;
        fj.hxhm[620] = 162092942;
        fj.hxhm[621] = -895313875;
        fj.hxhm[622] = 1476445918;
        fj.hxhm[623] = 2133992346;
        fj.hxhm[624] = -2067107274;
        fj.hxhm[625] = 808773853;
        fj.hxhm[626] = 807324983;
        fj.hxhm[627] = -1352281837;
        fj.hxhm[628] = 1089739847;
        fj.hxhm[629] = 1058443208;
        fj.hxhm[630] = -275073564;
        fj.hxhm[631] = 100383599;
        fj.hxhm[632] = 516725361;
        fj.hxhm[633] = 1735618013;
        fj.hxhm[634] = 1231883749;
        fj.hxhm[635] = 851315325;
        fj.hxhm[636] = -1066712111;
        fj.hxhm[637] = 123823122;
        fj.hxhm[638] = 1822373258;
        fj.hxhm[639] = -1660349879;
        fj.hxhm[640] = 1237791622;
        fj.hxhm[641] = -637737116;
        fj.hxhm[642] = -333316570;
        fj.hxhm[643] = 1707880642;
        fj.hxhm[644] = -1922629757;
        fj.hxhm[645] = 1072451867;
        fj.hxhm[646] = -1887179007;
        fj.hxhm[647] = 805855645;
        fj.hxhm[648] = 827623590;
        fj.hxhm[649] = 848392018;
        fj.hxhm[650] = 412247442;
        fj.hxhm[651] = -783700871;
        fj.hxhm[652] = -1393215478;
        fj.hxhm[653] = 27597238;
        fj.hxhm[654] = -487586579;
        fj.hxhm[655] = -1010380476;
        fj.hxhm[656] = -107463272;
        fj.hxhm[657] = 1416679054;
        fj.hxhm[658] = 1683892346;
        fj.hxhm[659] = -1734027556;
        fj.hxhm[660] = -1567513628;
        fj.hxhm[661] = 2023136250;
        fj.hxhm[662] = 1444826599;
        fj.hxhm[663] = 1620205561;
        fj.hxhm[664] = -674083530;
        fj.hxhm[665] = -2137532033;
        fj.hxhm[666] = 1017883231;
        fj.hxhm[667] = -708253111;
        fj.hxhm[668] = -598069787;
        fj.hxhm[669] = -2008058430;
        fj.hxhm[670] = 442261243;
        fj.hxhm[671] = 851467228;
        fj.hxhm[672] = -773629973;
        fj.hxhm[673] = 496819347;
        fj.hxhm[674] = 243073144;
        fj.hxhm[675] = -557612350;
        fj.hxhm[676] = -2114344010;
        fj.hxhm[677] = 63486253;
        fj.hxhm[678] = 477128234;
        fj.hxhm[679] = 727345906;
        fj.hxhm[680] = 1939620412;
        fj.hxhm[681] = -1862461253;
        fj.hxhm[682] = 814281777;
        fj.hxhm[683] = 493465196;
        fj.hxhm[684] = -926751663;
        fj.hxhm[685] = -1027690210;
        fj.hxhm[686] = 32494825;
        fj.hxhm[687] = -382458974;
        fj.hxhm[688] = 166929212;
        fj.hxhm[689] = 1130270228;
        fj.hxhm[690] = 79029895;
        fj.hxhm[691] = -1192544967;
        fj.hxhm[692] = 494371606;
        fj.hxhm[693] = -820148827;
        fj.hxhm[694] = 728346490;
        fj.hxhm[695] = -658067725;
        fj.hxhm[696] = -2060826419;
        fj.hxhm[697] = -1653350339;
        fj.hxhm[698] = 973893128;
        fj.hxhm[699] = -1852953587;
    }

    private static /* synthetic */ void iafk() {
        fj.hxhm[300] = 1759994579;
        fj.hxhm[301] = -1114560957;
        fj.hxhm[302] = -331898841;
        fj.hxhm[303] = -1136747728;
        fj.hxhm[304] = -1469865044;
        fj.hxhm[305] = -2081313806;
        fj.hxhm[306] = -565853228;
        fj.hxhm[307] = -568832930;
        fj.hxhm[308] = 1949346345;
        fj.hxhm[309] = 1985002754;
        fj.hxhm[310] = 30892395;
        fj.hxhm[311] = 1710851404;
        fj.hxhm[312] = 1997835173;
        fj.hxhm[313] = -2095031409;
        fj.hxhm[314] = -1666696591;
        fj.hxhm[315] = -1844724831;
        fj.hxhm[316] = -1252761346;
        fj.hxhm[317] = -580402960;
        fj.hxhm[318] = -1566067052;
        fj.hxhm[319] = -1452513480;
        fj.hxhm[320] = -1835404884;
        fj.hxhm[321] = -441373377;
        fj.hxhm[322] = 1364907739;
        fj.hxhm[323] = -393827561;
        fj.hxhm[324] = -745691105;
        fj.hxhm[325] = 500067281;
        fj.hxhm[326] = 36000229;
        fj.hxhm[327] = -35459565;
        fj.hxhm[328] = 1272373137;
        fj.hxhm[329] = 487135738;
        fj.hxhm[330] = -1537795858;
        fj.hxhm[331] = 914178249;
        fj.hxhm[332] = -1083559978;
        fj.hxhm[333] = -1767270625;
        fj.hxhm[334] = -406150218;
        fj.hxhm[335] = 1956151840;
        fj.hxhm[336] = 1643843631;
        fj.hxhm[337] = 1238419874;
        fj.hxhm[338] = 1512175555;
        fj.hxhm[339] = 1235222087;
        fj.hxhm[340] = 882871313;
        fj.hxhm[341] = -1414859539;
        fj.hxhm[342] = -1104223580;
        fj.hxhm[343] = -1547329275;
        fj.hxhm[344] = 1351243981;
        fj.hxhm[345] = 702450168;
        fj.hxhm[346] = -729531502;
        fj.hxhm[347] = 1255788642;
        fj.hxhm[348] = 587720096;
        fj.hxhm[349] = -170795942;
        fj.hxhm[350] = -230133713;
        fj.hxhm[351] = 427862825;
        fj.hxhm[352] = -1219817270;
        fj.hxhm[353] = 2073424047;
        fj.hxhm[354] = 624782354;
        fj.hxhm[355] = 1171563286;
        fj.hxhm[356] = 2095379188;
        fj.hxhm[357] = -1098757186;
        fj.hxhm[358] = 60583723;
        fj.hxhm[359] = 7632523;
        fj.hxhm[360] = 2136712464;
        fj.hxhm[361] = 1351115005;
        fj.hxhm[362] = 1234613239;
        fj.hxhm[363] = 1770826934;
        fj.hxhm[364] = -370379856;
        fj.hxhm[365] = 259056986;
        fj.hxhm[366] = -914504465;
        fj.hxhm[367] = 1840918514;
        fj.hxhm[368] = -1225952362;
        fj.hxhm[369] = -850064840;
        fj.hxhm[370] = -233360063;
        fj.hxhm[371] = -1919833490;
        fj.hxhm[372] = -522499193;
        fj.hxhm[373] = 2118247607;
        fj.hxhm[374] = 916893890;
        fj.hxhm[375] = -2127722228;
        fj.hxhm[376] = -23509148;
        fj.hxhm[377] = 1058309432;
        fj.hxhm[378] = -579561694;
        fj.hxhm[379] = 1121896587;
        fj.hxhm[380] = -29947782;
        fj.hxhm[381] = -578714849;
        fj.hxhm[382] = -2092525984;
        fj.hxhm[383] = 1597698279;
        fj.hxhm[384] = 1123051288;
        fj.hxhm[385] = -819789606;
        fj.hxhm[386] = 262338688;
        fj.hxhm[387] = 662954751;
        fj.hxhm[388] = 693197153;
        fj.hxhm[389] = 1502899234;
        fj.hxhm[390] = -301033349;
        fj.hxhm[391] = 604789880;
        fj.hxhm[392] = 1487991652;
        fj.hxhm[393] = 810778241;
        fj.hxhm[394] = 1593881207;
        fj.hxhm[395] = -1593420319;
        fj.hxhm[396] = 550753385;
        fj.hxhm[397] = -493731309;
        fj.hxhm[398] = 1195836216;
        fj.hxhm[399] = -2024366313;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @aw
    public void onKey(cn var1_1) {
        var10_2 = fj.c;
        var9_3 /* !! */  = fj.b;
        var8_4 = fj.a;
        if (var10_2) {
            throw null;
        }
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block55: do {
            switch (cfr_temp_0 == -2147483648 ? var9_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var8_4 || var8_4) return;
                    if (var1_1.key() == this.sendKey.getKey()) {
                        if (var8_4) return;
                        if (this.mode.isSelected("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c")) {
                            if (var8_4) return;
                            if (fj.mc.field_1724 != null) {
                                if (var8_4 || var8_4) return;
                                var2_5 = System.currentTimeMillis();
                                if (var8_4 || var8_4) return;
                                if (var2_5 - this.lastSendTime < fj.hxhn("hxkf", hxhs(int ), (int)21)) {
                                    if (var8_4 || var8_4) return;
                                    this.printregion("\u00a7e\u041f\u043e\u0434\u043e\u0436\u0434\u0438\u0442\u0435, \u043a\u0443\u043b\u0434\u0430\u0443\u043d \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0438: " + (long)((fj.hxhn("hxkg", hxhs(int ), (int)22) - (var2_5 - this.lastSendTime)) / fj.hxhn("hxkh", hxhs(int ), (int)23)) + " \u0441\u0435\u043a.");
                                    if (var8_4 || var8_4) return;
                                    return;
                                }
                                if (var8_4 || var8_4) return;
                                this.lastSendTime = var2_5;
                                if (var8_4 || var8_4) return;
                                var4_6 = new JsonObject();
                                if (var8_4 || var8_4) return;
                                var5_7 = new JsonObject();
                                if (var8_4 || var8_4) return;
                                var5_7.addProperty("x", (Number)((int)fj.mc.field_1724.method_23317()));
                                if (var8_4 || var8_4) return;
                                var5_7.addProperty("y", (Number)((int)fj.mc.field_1724.method_23318()));
                                if (var8_4 || var8_4) return;
                                var5_7.addProperty("z", (Number)((int)fj.mc.field_1724.method_23321()));
                                if (var8_4 || var8_4) return;
                                var4_6.add("position", (JsonElement)var5_7);
                                if (var8_4 || var8_4) return;
                                var4_6.addProperty("radius", (Number)((int)this.regionRadius.getValue()));
                                if (var8_4 || var8_4) return;
                                var4_6.addProperty("username", fj.mc.method_1548().method_1676());
                                if (var8_4 || var8_4) return;
                                this.currentRadius = (int)this.regionRadius.getValue();
                                if (var8_4 || var8_4) return;
                                var6_8 = this.messageQueue;
                                synchronized (var6_8) {
                                    if (var8_4) return;
                                    try {
                                        if (var8_4) return;
                                        this.messageQueue.offer(var4_6.toString());
                                        if (var8_4 || var8_4) return;
                                        this.printregion("\u00a7a\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u044b: " + (int)fj.mc.field_1724.method_23317() + ", " + (int)fj.mc.field_1724.method_23318() + ", " + (int)fj.mc.field_1724.method_23321());
                                        if (var8_4 || var8_4) return;
                                        // MONITOREXIT @DISABLED, blocks:[0, 1, 2, 3, 70, 55, 71, 72] lbl56 : MonitorExitStatement: MONITOREXIT : var6_8
                                        if (var8_4 || var8_4) return;
                                        if (var10_2) {
                                            throw null;
                                        }
                                    }
                                    catch (Throwable var7_9) {
                                        if (var8_4) return;
                                        // MONITOREXIT @DISABLED, blocks:[1, 2, 3, 70, 54, 55, 71, 72] lbl62 : MonitorExitStatement: MONITOREXIT : var6_8
                                        if (var8_4 || var8_4) return;
                                        throw var7_9;
                                    }
                                }
                            }
                        }
                    }
                    if (!var8_4 && !var8_4) return;
                    return;
                }
                case 0: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxki", hxhp(int ), (int)44);
                    cfr_temp_0 = 29;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 1: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkj", hxhp(int ), (int)45);
                    cfr_temp_0 = 12;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 2: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkk", hxhp(int ), (int)46);
                    cfr_temp_0 = 1;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 3: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkl", hxhp(int ), (int)47);
                    cfr_temp_0 = 6;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 4: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkm", hxhp(int ), (int)48);
                    cfr_temp_0 = 27;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 5: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkn", hxhp(int ), (int)49);
                    cfr_temp_0 = 4;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 6: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxko", hxhp(int ), (int)50);
                    cfr_temp_0 = 9;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 7: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkp", hxhp(int ), (int)51);
                    cfr_temp_0 = 4;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 8: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkq", hxhp(int ), (int)52);
                    cfr_temp_0 = 31;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 9: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkr", hxhp(int ), (int)53);
                    cfr_temp_0 = 28;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 10: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxks", hxhp(int ), (int)54);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 11: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkt", hxhp(int ), (int)55);
                    cfr_temp_0 = 33;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 12: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxku", hxhp(int ), (int)56);
                    cfr_temp_0 = 46;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 13: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkv", hxhp(int ), (int)57);
                    cfr_temp_0 = 3;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 14: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkw", hxhp(int ), (int)58);
                    cfr_temp_0 = 18;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 15: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkx", hxhp(int ), (int)59);
                    cfr_temp_0 = 31;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 16: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxky", hxhp(int ), (int)60);
                    cfr_temp_0 = 2;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 17: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxkz", hxhp(int ), (int)61);
                    cfr_temp_0 = 20;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 18: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxla", hxhp(int ), (int)62);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 19: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlb", hxhp(int ), (int)63);
                    cfr_temp_0 = 15;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 20: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlc", hxhp(int ), (int)64);
                    cfr_temp_0 = 45;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 21: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxld", hxhp(int ), (int)65);
                    cfr_temp_0 = 8;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 22: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxle", hxhp(int ), (int)66);
                    cfr_temp_0 = 14;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 23: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlf", hxhp(int ), (int)67);
                    cfr_temp_0 = 0;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 24: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlg", hxhp(int ), (int)68);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 25: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlh", hxhp(int ), (int)69);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 26: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxli", hxhp(int ), (int)70);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 27: {
                    do {
                        var9_3 /* !! */  = (int)fj.hxhn("hxlj", hxhp(int ), (int)71);
                    } while (!var10_2);
                    throw null;
                }
                case 28: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlk", hxhp(int ), (int)72);
                    cfr_temp_0 = 7;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 29: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxll", hxhp(int ), (int)73);
                    cfr_temp_0 = 1;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 30: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_3 /* !! */  = (int)fj.hxhn("hxlm", hxhp(int ), (int)74);
                        cfr_temp_0 = 47;
                        if (!var10_2) continue block55;
                        throw null;
                    }
                }
                case 31: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxln", hxhp(int ), (int)75);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 32: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlo", hxhp(int ), (int)76);
                    cfr_temp_0 = 3;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 33: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlp", hxhp(int ), (int)77);
                    cfr_temp_0 = 1;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 34: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlq", hxhp(int ), (int)78);
                    cfr_temp_0 = 47;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 35: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlr", hxhp(int ), (int)79);
                    cfr_temp_0 = 9;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 36: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxls", hxhp(int ), (int)80);
                    cfr_temp_0 = 14;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 37: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlt", hxhp(int ), (int)81);
                    cfr_temp_0 = 0;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 38: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlu", hxhp(int ), (int)82);
                    cfr_temp_0 = 34;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 39: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlv", hxhp(int ), (int)83);
                    cfr_temp_0 = 0;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 40: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlw", hxhp(int ), (int)84);
                    cfr_temp_0 = 17;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 41: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlx", hxhp(int ), (int)85);
                    cfr_temp_0 = 9;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 42: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxly", hxhp(int ), (int)86);
                    cfr_temp_0 = 30;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 43: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxlz", hxhp(int ), (int)87);
                    cfr_temp_0 = 46;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 44: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxma", hxhp(int ), (int)88);
                    cfr_temp_0 = 12;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 45: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxmb", hxhp(int ), (int)89);
                    cfr_temp_0 = 28;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 46: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxmc", hxhp(int ), (int)90);
                    cfr_temp_0 = 2;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 47: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxmd", hxhp(int ), (int)91);
                    cfr_temp_0 = 18;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 48: {
                    var9_3 /* !! */  = (int)fj.hxhn("hxme", hxhp(int ), (int)92);
                    cfr_temp_0 = 17;
                    if (!var10_2) continue block55;
                    throw null;
                }
                case 49: 
            }
            break;
        } while (true);
        var9_3 /* !! */  = (int)fj.hxhn("hxmf", hxhp(int ), (int)93);
        ** while (!var10_2)
lbl318:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iafo() {
        fj.hxhm[400] = -826829427;
        fj.hxhm[401] = 60694160;
        fj.hxhm[402] = 1900538581;
        fj.hxhm[403] = -1495573013;
        fj.hxhm[404] = -1718743663;
        fj.hxhm[405] = 809251465;
        fj.hxhm[406] = 272074414;
        fj.hxhm[407] = -834055423;
        fj.hxhm[408] = -771195410;
        fj.hxhm[409] = -1566868239;
        fj.hxhm[410] = 221247133;
        fj.hxhm[411] = 1352534266;
        fj.hxhm[412] = -142607060;
        fj.hxhm[413] = 1635883743;
        fj.hxhm[414] = 946618731;
        fj.hxhm[415] = 392384981;
        fj.hxhm[416] = 1904849523;
        fj.hxhm[417] = -1235280495;
        fj.hxhm[418] = -1729590139;
        fj.hxhm[419] = -303909230;
        fj.hxhm[420] = -296044958;
        fj.hxhm[421] = 893697203;
        fj.hxhm[422] = 1772198638;
        fj.hxhm[423] = 36551960;
        fj.hxhm[424] = -397890274;
        fj.hxhm[425] = -2122127135;
        fj.hxhm[426] = -1193752713;
        fj.hxhm[427] = -2016794536;
        fj.hxhm[428] = 66153902;
        fj.hxhm[429] = 508658282;
        fj.hxhm[430] = 1650519598;
        fj.hxhm[431] = 857708209;
        fj.hxhm[432] = -698004858;
        fj.hxhm[433] = 209041495;
        fj.hxhm[434] = 1162606867;
        fj.hxhm[435] = -826924394;
        fj.hxhm[436] = 72666977;
        fj.hxhm[437] = 12080043;
        fj.hxhm[438] = 379061265;
        fj.hxhm[439] = 975956333;
        fj.hxhm[440] = 2046560339;
        fj.hxhm[441] = 1935602411;
        fj.hxhm[442] = 955665452;
        fj.hxhm[443] = -1597924166;
        fj.hxhm[444] = -191715810;
        fj.hxhm[445] = 989788640;
        fj.hxhm[446] = 750083574;
        fj.hxhm[447] = -256081540;
        fj.hxhm[448] = 178885571;
        fj.hxhm[449] = 1831418266;
        fj.hxhm[450] = -847562937;
        fj.hxhm[451] = -2015460905;
        fj.hxhm[452] = -162279076;
        fj.hxhm[453] = -1176922952;
        fj.hxhm[454] = -183283668;
        fj.hxhm[455] = 2048603378;
        fj.hxhm[456] = 1401006121;
        fj.hxhm[457] = -1014619161;
        fj.hxhm[458] = -1235239137;
        fj.hxhm[459] = -927268574;
        fj.hxhm[460] = -606958617;
        fj.hxhm[461] = 962436776;
        fj.hxhm[462] = 683404408;
        fj.hxhm[463] = -1349796793;
        fj.hxhm[464] = -2003616408;
        fj.hxhm[465] = -604173227;
        fj.hxhm[466] = 1309837603;
        fj.hxhm[467] = -573542794;
        fj.hxhm[468] = -521993632;
        fj.hxhm[469] = -2099183259;
        fj.hxhm[470] = -1815102317;
        fj.hxhm[471] = -409462056;
        fj.hxhm[472] = 508823164;
        fj.hxhm[473] = -1571361554;
        fj.hxhm[474] = -1812742666;
        fj.hxhm[475] = -2076331311;
        fj.hxhm[476] = 453523896;
        fj.hxhm[477] = 1794587243;
        fj.hxhm[478] = 1327058090;
        fj.hxhm[479] = -1236166813;
        fj.hxhm[480] = 445464561;
        fj.hxhm[481] = 486099903;
        fj.hxhm[482] = 226933743;
        fj.hxhm[483] = -766554923;
        fj.hxhm[484] = -1211152967;
        fj.hxhm[485] = -1891725447;
        fj.hxhm[486] = 1402439132;
        fj.hxhm[487] = 2055750799;
        fj.hxhm[488] = -274477462;
        fj.hxhm[489] = -1274923175;
        fj.hxhm[490] = -130573929;
        fj.hxhm[491] = 701948232;
        fj.hxhm[492] = 233492349;
        fj.hxhm[493] = 1475302163;
        fj.hxhm[494] = 34134208;
        fj.hxhm[495] = 1245387106;
        fj.hxhm[496] = 1951771932;
        fj.hxhm[497] = -1137224878;
        fj.hxhm[498] = -1134659539;
        fj.hxhm[499] = 984898452;
    }

    private static /* synthetic */ int hxhp(int n2) {
        return hxhl[n2] ^ hxhm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void queueRegionCommands() {
        block83: {
            block82: {
                var13_1 = fj.c;
                var12_2 /* !! */  = fj.b;
                var11_3 = fj.a;
                if (var13_1) {
                    throw null;
lbl6:
                    // 21 sources

                    return;
                }
                if (var11_3 || var11_3) ** GOTO lbl6
                if (this.lastReceivedMessage == null) break block82;
                if (var11_3) ** GOTO lbl6
                if (this.lastReceivedMessage.has("position")) break block83;
                if (var11_3) ** GOTO lbl6
            }
            if (var11_3 || var11_3) ** GOTO lbl6
            return;
        }
        if (var11_3 || var11_3) ** GOTO lbl6
        var1_4 = this.lastReceivedMessage.getAsJsonObject("position");
        if (var11_3 || var11_3) ** GOTO lbl6
        var2_5 = var1_4.get("x").getAsInt();
        if (var11_3 || var11_3) ** GOTO lbl6
        var3_6 = var1_4.get("y").getAsInt();
        if (var11_3 || var11_3) ** GOTO lbl6
        var4_7 = var1_4.get("z").getAsInt();
        if (var11_3 || var11_3) ** GOTO lbl6
        var5_8 = var2_5 - this.currentRadius;
        if (var11_3 || var11_3) ** GOTO lbl6
        var6_9 = var3_6 - this.currentRadius;
        if (var11_3 || var11_3) ** GOTO lbl6
        var7_10 = var4_7 - this.currentRadius;
        if (var11_3 || var11_3) ** GOTO lbl6
        var8_11 = var2_5 + this.currentRadius;
        if (var11_3 || var11_3) ** GOTO lbl6
        var9_12 = var3_6 + this.currentRadius;
        if (var11_3) ** GOTO lbl6
        if (var12_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_3) ** GOTO lbl6
                var10_13 = var4_7 + this.currentRadius;
                if (var11_3 || var11_3) ** GOTO lbl6
                this.commandQueue.offer("//1 " + var5_8 + "," + var6_9 + "," + var7_10);
                if (var11_3 || var11_3) ** GOTO lbl6
                this.commandQueue.offer("//2 " + var8_11 + "," + var9_12 + "," + var10_13);
                if (var11_3 || var11_3) ** GOTO lbl6
                this.currentRegionName = this.generateRegionName();
                if (var11_3 || var11_3) ** GOTO lbl6
                this.commandQueue.offer("/rg claim " + this.currentRegionName);
                if (var11_3 || var11_3) ** GOTO lbl6
                this.awaitingClaim = fj.hxhn("hzcw", hxhp(int ), (int)647);
                if (!var11_3 && !var11_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var12_2 /* !! */  = (int)fj.hxhn("hzcx", hxhp(int ), (int)648);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl62:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_2 /* !! */  = (int)fj.hxhn("hzcy", hxhp(int ), (int)649);
                    if (var13_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
            case 2: {
                var12_2 /* !! */  = (int)fj.hxhn("hzcz", hxhp(int ), (int)650);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl73:
            // 2 sources

            case 3: {
                var12_2 /* !! */  = (int)fj.hxhn("hzda", hxhp(int ), (int)651);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl78:
            // 2 sources

            case 4: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdb", hxhp(int ), (int)652);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl83:
            // 3 sources

            case 5: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdc", hxhp(int ), (int)653);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 6: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdd", hxhp(int ), (int)654);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl93:
            // 2 sources

            case 7: {
                var12_2 /* !! */  = (int)fj.hxhn("hzde", hxhp(int ), (int)655);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 8: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdf", hxhp(int ), (int)656);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 9: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdg", hxhp(int ), (int)657);
                if (!var13_1) ** GOTO lbl78
                throw null;
            }
lbl107:
            // 2 sources

            case 10: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdh", hxhp(int ), (int)658);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl112:
            // 2 sources

            case 11: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdi", hxhp(int ), (int)659);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl117:
            // 3 sources

            case 12: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdj", hxhp(int ), (int)660);
                if (!var13_1) ** GOTO lbl93
                throw null;
            }
            case 13: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdk", hxhp(int ), (int)661);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl126:
            // 4 sources

            case 14: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdl", hxhp(int ), (int)662);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl131:
            // 3 sources

            case 15: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdm", hxhp(int ), (int)663);
                if (!var13_1) ** GOTO lbl83
                throw null;
            }
            case 16: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdn", hxhp(int ), (int)664);
                if (!var13_1) ** GOTO lbl126
                throw null;
            }
lbl139:
            // 2 sources

            case 17: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdo", hxhp(int ), (int)665);
                if (!var13_1) ** GOTO lbl131
                throw null;
            }
lbl143:
            // 2 sources

            case 18: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdp", hxhp(int ), (int)666);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl148:
            // 2 sources

            case 19: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdq", hxhp(int ), (int)667);
                if (!var13_1) ** GOTO lbl73
                throw null;
            }
lbl152:
            // 2 sources

            case 20: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdr", hxhp(int ), (int)668);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 21: {
                var12_2 /* !! */  = (int)fj.hxhn("hzds", hxhp(int ), (int)669);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl162:
            // 2 sources

            case 22: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdt", hxhp(int ), (int)670);
                if (!var13_1) ** GOTO lbl62
                throw null;
            }
            case 23: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdu", hxhp(int ), (int)671);
                if (!var13_1) ** GOTO lbl139
                throw null;
            }
lbl170:
            // 3 sources

            case 24: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdv", hxhp(int ), (int)672);
                if (!var13_1) ** GOTO lbl162
                throw null;
            }
lbl174:
            // 2 sources

            case 25: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdw", hxhp(int ), (int)673);
                if (!var13_1) ** GOTO lbl131
                throw null;
            }
lbl178:
            // 2 sources

            case 26: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdx", hxhp(int ), (int)674);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl183:
            // 2 sources

            case 27: {
                do {
                    var12_2 /* !! */  = (int)fj.hxhn("hzdy", hxhp(int ), (int)675);
                } while (!var13_1);
                throw null;
            }
lbl188:
            // 2 sources

            case 28: {
                var12_2 /* !! */  = (int)fj.hxhn("hzdz", hxhp(int ), (int)676);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl193:
            // 2 sources

            case 29: {
                var12_2 /* !! */  = (int)fj.hxhn("hzea", hxhp(int ), (int)677);
                if (!var13_1) ** GOTO lbl117
                throw null;
            }
lbl197:
            // 3 sources

            case 30: {
                var12_2 /* !! */  = (int)fj.hxhn("hzeb", hxhp(int ), (int)678);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl202:
            // 2 sources

            case 31: {
                var12_2 /* !! */  = (int)fj.hxhn("hzec", hxhp(int ), (int)679);
                if (!var13_1) ** GOTO lbl170
                throw null;
            }
            case 32: {
                var12_2 /* !! */  = (int)fj.hxhn("hzed", hxhp(int ), (int)680);
                if (!var13_1) ** GOTO lbl174
                throw null;
            }
lbl210:
            // 3 sources

            case 33: {
                var12_2 /* !! */  = (int)fj.hxhn("hzee", hxhp(int ), (int)681);
                if (!var13_1) ** GOTO lbl143
                throw null;
            }
lbl214:
            // 2 sources

            case 34: {
                var12_2 /* !! */  = (int)fj.hxhn("hzef", hxhp(int ), (int)682);
                if (!var13_1) ** GOTO lbl126
                throw null;
            }
            case 35: {
                var12_2 /* !! */  = (int)fj.hxhn("hzeg", hxhp(int ), (int)683);
                if (var13_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 36: {
                var12_2 /* !! */  = (int)fj.hxhn("hzeh", hxhp(int ), (int)684);
                if (!var13_1) ** GOTO lbl117
                throw null;
            }
lbl227:
            // 3 sources

            case 37: {
                var12_2 /* !! */  = (int)fj.hxhn("hzei", hxhp(int ), (int)685);
                if (!var13_1) ** GOTO lbl193
                throw null;
            }
lbl231:
            // 3 sources

            case 38: {
                var12_2 /* !! */  = (int)fj.hxhn("hzej", hxhp(int ), (int)686);
                if (!var13_1) ** GOTO lbl83
                throw null;
            }
lbl235:
            // 3 sources

            case 39: {
                var12_2 /* !! */  = (int)fj.hxhn("hzek", hxhp(int ), (int)687);
                if (!var13_1) ** GOTO lbl231
                throw null;
            }
            case 40: 
        }
        var12_2 /* !! */  = (int)fj.hxhn("hzel", hxhp(int ), (int)688);
        ** while (!var13_1)
lbl242:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void printregion(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fj.pb - fj.hxhn("hzll", hxhs(int ), (int)299)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fj.hxhn("hzlm", hxhp(int ), (int)848)) break;
            v0 /* !! */  = (long)fj.hxhn("hzln", hxhp(int ), (int)849);
        }
        var4_2 = fj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("hzlo", hxhs(int ), (int)300)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fj.hxhn("hzlp", hxhp(int ), (int)850)) break;
            v1 /* !! */  = (long)fj.hxhn("hzlq", hxhp(int ), (int)851);
        }
        var3_3 /* !! */  = fj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("hzlr", hxhs(int ), (int)301)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fj.hxhn("hzls", hxhp(int ), (int)852)) break;
            v2 /* !! */  = (long)fj.hxhn("hzlt", hxhp(int ), (int)853);
        }
        var2_4 = fj.a;
        if (var4_2) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("hzlu", hxhs(int ), (int)302)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fj.hxhn("hzlv", hxhp(int ), (int)854)) break;
            v3 /* !! */  = (long)fj.hxhn("hzlw", hxhp(int ), (int)855);
        }
        pp.brandmessage(var1_1);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl37:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)fj.hxhn("hzlx", hxhp(int ), (int)856);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)fj.hxhn("hzly", hxhp(int ), (int)857);
                if (!var4_2) ** GOTO lbl37
                throw null;
            }
lbl46:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)fj.hxhn("hzlz", hxhp(int ), (int)858);
                } while (!var4_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fj.hxhn("hzma", hxhp(int ), (int)859);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)fj.hxhn("hzmb", hxhp(int ), (int)860);
                if (!var4_2) ** GOTO lbl46
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)fj.hxhn("hzmc", hxhp(int ), (int)861);
        ** while (!var4_2)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$onPacket$4() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$activate$7() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iafg() {
        fj.hxhm[200] = -661203638;
        fj.hxhm[201] = -734442422;
        fj.hxhm[202] = 1977369862;
        fj.hxhm[203] = 299318416;
        fj.hxhm[204] = -1374781023;
        fj.hxhm[205] = -2056838332;
        fj.hxhm[206] = -1566586332;
        fj.hxhm[207] = 644916242;
        fj.hxhm[208] = 842923577;
        fj.hxhm[209] = 2133099121;
        fj.hxhm[210] = 1735507102;
        fj.hxhm[211] = -390527158;
        fj.hxhm[212] = -421647478;
        fj.hxhm[213] = 321131856;
        fj.hxhm[214] = 535452643;
        fj.hxhm[215] = -1200283326;
        fj.hxhm[216] = 1610718155;
        fj.hxhm[217] = -2036278741;
        fj.hxhm[218] = 1230766922;
        fj.hxhm[219] = -120232870;
        fj.hxhm[220] = 1414788393;
        fj.hxhm[221] = 1178737938;
        fj.hxhm[222] = 1984120219;
        fj.hxhm[223] = -510039989;
        fj.hxhm[224] = 1583320029;
        fj.hxhm[225] = 1419574271;
        fj.hxhm[226] = -150988154;
        fj.hxhm[227] = -125683157;
        fj.hxhm[228] = 103154652;
        fj.hxhm[229] = 1949553130;
        fj.hxhm[230] = -893043645;
        fj.hxhm[231] = 1157046423;
        fj.hxhm[232] = -1979418192;
        fj.hxhm[233] = -1937841348;
        fj.hxhm[234] = 889929026;
        fj.hxhm[235] = 1962965206;
        fj.hxhm[236] = -89175100;
        fj.hxhm[237] = 2019472468;
        fj.hxhm[238] = -721646076;
        fj.hxhm[239] = -1674978444;
        fj.hxhm[240] = 1497314029;
        fj.hxhm[241] = 1966069734;
        fj.hxhm[242] = -1225994056;
        fj.hxhm[243] = -695737752;
        fj.hxhm[244] = 299562942;
        fj.hxhm[245] = -681141322;
        fj.hxhm[246] = -97635627;
        fj.hxhm[247] = 1412379819;
        fj.hxhm[248] = 958147636;
        fj.hxhm[249] = -1006613659;
        fj.hxhm[250] = -258263483;
        fj.hxhm[251] = -1732467617;
        fj.hxhm[252] = 463083709;
        fj.hxhm[253] = -1186202744;
        fj.hxhm[254] = -1429296847;
        fj.hxhm[255] = -1261180176;
        fj.hxhm[256] = 1771707797;
        fj.hxhm[257] = -768508226;
        fj.hxhm[258] = -1403720165;
        fj.hxhm[259] = -1421055774;
        fj.hxhm[260] = 1368802049;
        fj.hxhm[261] = -1379574271;
        fj.hxhm[262] = -1983562740;
        fj.hxhm[263] = -1585439078;
        fj.hxhm[264] = -893831794;
        fj.hxhm[265] = -1717599425;
        fj.hxhm[266] = -1340116607;
        fj.hxhm[267] = 26310001;
        fj.hxhm[268] = -971736960;
        fj.hxhm[269] = -15941732;
        fj.hxhm[270] = -1090353569;
        fj.hxhm[271] = 1527189584;
        fj.hxhm[272] = -1121570950;
        fj.hxhm[273] = 1691913506;
        fj.hxhm[274] = 240584431;
        fj.hxhm[275] = -317985821;
        fj.hxhm[276] = 228473688;
        fj.hxhm[277] = 388436094;
        fj.hxhm[278] = -1214787524;
        fj.hxhm[279] = 625048853;
        fj.hxhm[280] = -1437460401;
        fj.hxhm[281] = 2020597020;
        fj.hxhm[282] = -394601175;
        fj.hxhm[283] = 121452019;
        fj.hxhm[284] = -222836146;
        fj.hxhm[285] = 808590818;
        fj.hxhm[286] = 1194306517;
        fj.hxhm[287] = -1324648665;
        fj.hxhm[288] = 2119136287;
        fj.hxhm[289] = 740935908;
        fj.hxhm[290] = 1071197220;
        fj.hxhm[291] = -1016809098;
        fj.hxhm[292] = -1647945587;
        fj.hxhm[293] = -1856915093;
        fj.hxhm[294] = 1063085760;
        fj.hxhm[295] = 623135096;
        fj.hxhm[296] = 1181414392;
        fj.hxhm[297] = -959921712;
        fj.hxhm[298] = 533000978;
        fj.hxhm[299] = -1492384912;
    }

    private static /* synthetic */ void iadt() {
        fj.hxhl[0] = -586104572;
        fj.hxhl[1] = 1412403131;
        fj.hxhl[2] = -1906066232;
        fj.hxhl[3] = 1113136797;
        fj.hxhl[4] = -1433555571;
        fj.hxhl[5] = 977457539;
        fj.hxhl[6] = 2091929140;
        fj.hxhl[7] = 1681124484;
        fj.hxhl[8] = 1681201153;
        fj.hxhl[9] = -522168168;
        fj.hxhl[10] = -605319886;
        fj.hxhl[11] = 464955804;
        fj.hxhl[12] = -1845081698;
        fj.hxhl[13] = 1685191943;
        fj.hxhl[14] = 82820713;
        fj.hxhl[15] = 1386822627;
        fj.hxhl[16] = 1901597676;
        fj.hxhl[17] = 613131297;
        fj.hxhl[18] = 1157647642;
        fj.hxhl[19] = 76201375;
        fj.hxhl[20] = -885736018;
        fj.hxhl[21] = -2020344492;
        fj.hxhl[22] = 820382944;
        fj.hxhl[23] = 2088206885;
        fj.hxhl[24] = 1400886776;
        fj.hxhl[25] = 991756263;
        fj.hxhl[26] = 451552989;
        fj.hxhl[27] = 876251148;
        fj.hxhl[28] = -2014571460;
        fj.hxhl[29] = 755240412;
        fj.hxhl[30] = -875402614;
        fj.hxhl[31] = 1843210514;
        fj.hxhl[32] = -425771712;
        fj.hxhl[33] = -1071135852;
        fj.hxhl[34] = 1191413601;
        fj.hxhl[35] = -609681296;
        fj.hxhl[36] = -2020433018;
        fj.hxhl[37] = -1684145009;
        fj.hxhl[38] = 273501685;
        fj.hxhl[39] = 1626896121;
        fj.hxhl[40] = 289679961;
        fj.hxhl[41] = 1098382678;
        fj.hxhl[42] = -1276473255;
        fj.hxhl[43] = 967874195;
        fj.hxhl[44] = 1900385599;
        fj.hxhl[45] = -91878707;
        fj.hxhl[46] = -73083732;
        fj.hxhl[47] = -2063692036;
        fj.hxhl[48] = -739134233;
        fj.hxhl[49] = 799450208;
        fj.hxhl[50] = -2089159121;
        fj.hxhl[51] = -1642391484;
        fj.hxhl[52] = 1904897510;
        fj.hxhl[53] = -1302161157;
        fj.hxhl[54] = 987390898;
        fj.hxhl[55] = -623650871;
        fj.hxhl[56] = 2003574020;
        fj.hxhl[57] = 1653285738;
        fj.hxhl[58] = 1411407465;
        fj.hxhl[59] = -1514455614;
        fj.hxhl[60] = -215046545;
        fj.hxhl[61] = -826099677;
        fj.hxhl[62] = 2140567188;
        fj.hxhl[63] = -78859210;
        fj.hxhl[64] = -972134655;
        fj.hxhl[65] = -644426449;
        fj.hxhl[66] = -966006427;
        fj.hxhl[67] = 1763822501;
        fj.hxhl[68] = -1774272382;
        fj.hxhl[69] = -74683367;
        fj.hxhl[70] = -494262369;
        fj.hxhl[71] = -1095816114;
        fj.hxhl[72] = -1134774858;
        fj.hxhl[73] = 998656584;
        fj.hxhl[74] = -131521973;
        fj.hxhl[75] = 1691962974;
        fj.hxhl[76] = 866862947;
        fj.hxhl[77] = 461317286;
        fj.hxhl[78] = -1916458482;
        fj.hxhl[79] = 137183261;
        fj.hxhl[80] = -399864856;
        fj.hxhl[81] = 1795630738;
        fj.hxhl[82] = 1173518254;
        fj.hxhl[83] = 2072640135;
        fj.hxhl[84] = -1456099286;
        fj.hxhl[85] = -1114689766;
        fj.hxhl[86] = -1850232235;
        fj.hxhl[87] = -1429533762;
        fj.hxhl[88] = 1231247185;
        fj.hxhl[89] = 378149137;
        fj.hxhl[90] = 1121585349;
        fj.hxhl[91] = 1456314490;
        fj.hxhl[92] = -2144923903;
        fj.hxhl[93] = -888228168;
        fj.hxhl[94] = -123037805;
        fj.hxhl[95] = 283126128;
        fj.hxhl[96] = 899066737;
        fj.hxhl[97] = -1868220359;
        fj.hxhl[98] = 1963420237;
        fj.hxhl[99] = 849354226;
    }

    private static /* synthetic */ void iafp() {
        fj.hxhm[500] = -624366604;
        fj.hxhm[501] = -1923139329;
        fj.hxhm[502] = -1346291748;
        fj.hxhm[503] = 381852105;
        fj.hxhm[504] = -213472176;
        fj.hxhm[505] = 656012482;
        fj.hxhm[506] = 1030399525;
        fj.hxhm[507] = -1271751097;
        fj.hxhm[508] = -1013104029;
        fj.hxhm[509] = -437601592;
        fj.hxhm[510] = 1767170607;
        fj.hxhm[511] = -1351086317;
        fj.hxhm[512] = -1628012572;
        fj.hxhm[513] = 1370640071;
        fj.hxhm[514] = 1985974692;
        fj.hxhm[515] = -1239825516;
        fj.hxhm[516] = 1444512480;
        fj.hxhm[517] = 1291226174;
        fj.hxhm[518] = -488505944;
        fj.hxhm[519] = -1613016970;
        fj.hxhm[520] = -268821045;
        fj.hxhm[521] = -874270975;
        fj.hxhm[522] = -854750458;
        fj.hxhm[523] = -1936134703;
        fj.hxhm[524] = 1380854999;
        fj.hxhm[525] = 1207640052;
        fj.hxhm[526] = -50134612;
        fj.hxhm[527] = -998696055;
        fj.hxhm[528] = -1802343288;
        fj.hxhm[529] = -1705260522;
        fj.hxhm[530] = -1448061095;
        fj.hxhm[531] = -999708681;
        fj.hxhm[532] = -59923064;
        fj.hxhm[533] = -892585023;
        fj.hxhm[534] = 1555296660;
        fj.hxhm[535] = -669778744;
        fj.hxhm[536] = -1577434697;
        fj.hxhm[537] = -445704145;
        fj.hxhm[538] = 735941343;
        fj.hxhm[539] = 785307173;
        fj.hxhm[540] = -1838440826;
        fj.hxhm[541] = 9346368;
        fj.hxhm[542] = 1404331820;
        fj.hxhm[543] = 684836884;
        fj.hxhm[544] = -1459244923;
        fj.hxhm[545] = 1064583545;
        fj.hxhm[546] = 1223484304;
        fj.hxhm[547] = -11454947;
        fj.hxhm[548] = -961360839;
        fj.hxhm[549] = 185445968;
        fj.hxhm[550] = -1104122570;
        fj.hxhm[551] = 460300592;
        fj.hxhm[552] = 686598195;
        fj.hxhm[553] = -1385129306;
        fj.hxhm[554] = 994311061;
        fj.hxhm[555] = -950308922;
        fj.hxhm[556] = 1315630173;
        fj.hxhm[557] = 2120436116;
        fj.hxhm[558] = -1984288283;
        fj.hxhm[559] = 549360709;
        fj.hxhm[560] = -1671765354;
        fj.hxhm[561] = 1697100137;
        fj.hxhm[562] = -315593778;
        fj.hxhm[563] = -1239960152;
        fj.hxhm[564] = 654908545;
        fj.hxhm[565] = 1797492467;
        fj.hxhm[566] = 1356749154;
        fj.hxhm[567] = 1206566495;
        fj.hxhm[568] = 102703770;
        fj.hxhm[569] = -1008736002;
        fj.hxhm[570] = -180795827;
        fj.hxhm[571] = 758183283;
        fj.hxhm[572] = 874807433;
        fj.hxhm[573] = 494848025;
        fj.hxhm[574] = -706897845;
        fj.hxhm[575] = -1504770579;
        fj.hxhm[576] = 1947452090;
        fj.hxhm[577] = 1500391071;
        fj.hxhm[578] = -854421287;
        fj.hxhm[579] = 1834588280;
        fj.hxhm[580] = 1003043117;
        fj.hxhm[581] = 1410030837;
        fj.hxhm[582] = 777289263;
        fj.hxhm[583] = 1675060037;
        fj.hxhm[584] = 1746572170;
        fj.hxhm[585] = 56266256;
        fj.hxhm[586] = 664569708;
        fj.hxhm[587] = -675687378;
        fj.hxhm[588] = 348367480;
        fj.hxhm[589] = -1792419783;
        fj.hxhm[590] = 551323667;
        fj.hxhm[591] = 1496561949;
        fj.hxhm[592] = 2017856046;
        fj.hxhm[593] = -63943148;
        fj.hxhm[594] = -1382502730;
        fj.hxhm[595] = 61311663;
        fj.hxhm[596] = 262017609;
        fj.hxhm[597] = 1983183837;
        fj.hxhm[598] = -1930439952;
        fj.hxhm[599] = -748864237;
    }

    public static /* synthetic */ CallSite hxhn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void iaec() {
        fj.hxhl[400] = -826829437;
        fj.hxhl[401] = 60694196;
        fj.hxhl[402] = 1900538560;
        fj.hxhl[403] = -1495573016;
        fj.hxhl[404] = -1718743674;
        fj.hxhl[405] = 809251484;
        fj.hxhl[406] = 272074407;
        fj.hxhl[407] = -834055396;
        fj.hxhl[408] = -771195417;
        fj.hxhl[409] = -1566868245;
        fj.hxhl[410] = 221247133;
        fj.hxhl[411] = 1352534267;
        fj.hxhl[412] = -142607060;
        fj.hxhl[413] = 1635883743;
        fj.hxhl[414] = 946618730;
        fj.hxhl[415] = 392384981;
        fj.hxhl[416] = 1904849522;
        fj.hxhl[417] = -1235280492;
        fj.hxhl[418] = -1729590139;
        fj.hxhl[419] = -303909230;
        fj.hxhl[420] = -296044958;
        fj.hxhl[421] = 893697203;
        fj.hxhl[422] = 1772198554;
        fj.hxhl[423] = 36551941;
        fj.hxhl[424] = -397890230;
        fj.hxhl[425] = -2122127174;
        fj.hxhl[426] = -1193752814;
        fj.hxhl[427] = -2016794413;
        fj.hxhl[428] = 66153927;
        fj.hxhl[429] = 508658424;
        fj.hxhl[430] = 1650519722;
        fj.hxhl[431] = 857708268;
        fj.hxhl[432] = -698004743;
        fj.hxhl[433] = 209041491;
        fj.hxhl[434] = 1162606852;
        fj.hxhl[435] = -826924534;
        fj.hxhl[436] = 72666980;
        fj.hxhl[437] = 12080108;
        fj.hxhl[438] = 379061383;
        fj.hxhl[439] = 975956233;
        fj.hxhl[440] = 2046560375;
        fj.hxhl[441] = 1935602403;
        fj.hxhl[442] = 955665426;
        fj.hxhl[443] = -1597924199;
        fj.hxhl[444] = -191715714;
        fj.hxhl[445] = 989788665;
        fj.hxhl[446] = 750083530;
        fj.hxhl[447] = -256081552;
        fj.hxhl[448] = 178885467;
        fj.hxhl[449] = 1831418136;
        fj.hxhl[450] = -847562917;
        fj.hxhl[451] = -2015460909;
        fj.hxhl[452] = -162278955;
        fj.hxhl[453] = -1176923110;
        fj.hxhl[454] = -183283535;
        fj.hxhl[455] = 2048603348;
        fj.hxhl[456] = 1401006129;
        fj.hxhl[457] = -1014619245;
        fj.hxhl[458] = -1235239079;
        fj.hxhl[459] = -927268563;
        fj.hxhl[460] = -606958775;
        fj.hxhl[461] = 962436749;
        fj.hxhl[462] = 683404543;
        fj.hxhl[463] = -1349796841;
        fj.hxhl[464] = -2003616283;
        fj.hxhl[465] = -604173199;
        fj.hxhl[466] = 1309837599;
        fj.hxhl[467] = -573542899;
        fj.hxhl[468] = -521993528;
        fj.hxhl[469] = -2099183306;
        fj.hxhl[470] = -1815102405;
        fj.hxhl[471] = -409462179;
        fj.hxhl[472] = 508823156;
        fj.hxhl[473] = -1571361662;
        fj.hxhl[474] = -1812742732;
        fj.hxhl[475] = -2076331275;
        fj.hxhl[476] = 453523944;
        fj.hxhl[477] = 1794587206;
        fj.hxhl[478] = 1327058149;
        fj.hxhl[479] = -1236166821;
        fj.hxhl[480] = 445464515;
        fj.hxhl[481] = 486099736;
        fj.hxhl[482] = 226933643;
        fj.hxhl[483] = -766555015;
        fj.hxhl[484] = -1211152999;
        fj.hxhl[485] = -1891725546;
        fj.hxhl[486] = 1402439155;
        fj.hxhl[487] = 2055750793;
        fj.hxhl[488] = -274477324;
        fj.hxhl[489] = -1274923227;
        fj.hxhl[490] = -130573880;
        fj.hxhl[491] = 701948369;
        fj.hxhl[492] = 233492235;
        fj.hxhl[493] = 1475302300;
        fj.hxhl[494] = 34134083;
        fj.hxhl[495] = 1245387009;
        fj.hxhl[496] = 1951771918;
        fj.hxhl[497] = -1137224887;
        fj.hxhl[498] = -1134659560;
        fj.hxhl[499] = 984898530;
    }

    /*
     * Exception decompiling
     */
    private void attemptConnectionSender() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 45[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iagq() {
        fj.hxht[100] = -3831167173504936677L;
        fj.hxht[101] = -676286790942417628L;
        fj.hxht[102] = 6666277232725296802L;
        fj.hxht[103] = 8313404009345586168L;
        fj.hxht[104] = -1335642825677764137L;
        fj.hxht[105] = 2171387661167202920L;
        fj.hxht[106] = 8345132635728683864L;
        fj.hxht[107] = -5803533331239805940L;
        fj.hxht[108] = 5793463762985213764L;
        fj.hxht[109] = -674176169586877968L;
        fj.hxht[110] = 2944569936418365953L;
        fj.hxht[111] = 4249464225637273306L;
        fj.hxht[112] = -8110902797790418830L;
        fj.hxht[113] = 3378711728662290144L;
        fj.hxht[114] = 4955269476387492069L;
        fj.hxht[115] = 5263627360701142986L;
        fj.hxht[116] = 4984896827551972668L;
        fj.hxht[117] = -2666923739952530596L;
        fj.hxht[118] = -5524002692101970638L;
        fj.hxht[119] = 5142184949174581750L;
        fj.hxht[120] = 7034060157426858348L;
        fj.hxht[121] = -5644842239754644069L;
        fj.hxht[122] = -641920017328351495L;
        fj.hxht[123] = -4697265362283703167L;
        fj.hxht[124] = -918472699583953243L;
        fj.hxht[125] = 887445255176851403L;
        fj.hxht[126] = -3311967241801559653L;
        fj.hxht[127] = -284410659477472333L;
        fj.hxht[128] = 5387321115533419491L;
        fj.hxht[129] = 6135794260404174042L;
        fj.hxht[130] = 1353321628045291715L;
        fj.hxht[131] = -5095107527828610654L;
        fj.hxht[132] = 1799251981460432179L;
        fj.hxht[133] = 3613695674379395741L;
        fj.hxht[134] = 3425984550834244754L;
        fj.hxht[135] = -1771465721953292396L;
        fj.hxht[136] = -3233678582395856432L;
        fj.hxht[137] = 738352937180752068L;
        fj.hxht[138] = 7566365206768248955L;
        fj.hxht[139] = -2244715243990610167L;
        fj.hxht[140] = 5049335378981831470L;
        fj.hxht[141] = 8550908425359839306L;
        fj.hxht[142] = -5506214175136372370L;
        fj.hxht[143] = -8666830760584984764L;
        fj.hxht[144] = -7383249114843139932L;
        fj.hxht[145] = -1463162223611183561L;
        fj.hxht[146] = 3662739861484437763L;
        fj.hxht[147] = 6423543028965464259L;
        fj.hxht[148] = -3574830207884488572L;
        fj.hxht[149] = -4771773180935803772L;
        fj.hxht[150] = 6300516561796796930L;
        fj.hxht[151] = -1906324748349149939L;
        fj.hxht[152] = 7335743800723881814L;
        fj.hxht[153] = -7337451900961307916L;
        fj.hxht[154] = -608644679083434207L;
        fj.hxht[155] = -7550034666290191754L;
        fj.hxht[156] = -5485748504256198425L;
        fj.hxht[157] = 2052050496280732363L;
        fj.hxht[158] = 3995182890889916328L;
        fj.hxht[159] = -1904296904083688016L;
        fj.hxht[160] = -9093110156414627932L;
        fj.hxht[161] = -2106190107865577738L;
        fj.hxht[162] = -1560745122358479537L;
        fj.hxht[163] = 5356422849308149690L;
        fj.hxht[164] = 9124658022056777032L;
        fj.hxht[165] = -4086839643620341621L;
        fj.hxht[166] = 6355481458938826991L;
        fj.hxht[167] = -6087262154656919983L;
        fj.hxht[168] = 172848250836961236L;
        fj.hxht[169] = -8977912825994930377L;
        fj.hxht[170] = 3927964702071227003L;
        fj.hxht[171] = -1718102489015416282L;
        fj.hxht[172] = -4169467855985589829L;
        fj.hxht[173] = -7716924118115009509L;
        fj.hxht[174] = -3465257988219508199L;
        fj.hxht[175] = 9195504597153682459L;
        fj.hxht[176] = 5181109453330397074L;
        fj.hxht[177] = 4453990414987947338L;
        fj.hxht[178] = 1494106073489858823L;
        fj.hxht[179] = -70406276722104142L;
        fj.hxht[180] = 8384962414824195366L;
        fj.hxht[181] = -8552903581572749276L;
        fj.hxht[182] = 2393831299089511951L;
        fj.hxht[183] = 2210707699824283036L;
        fj.hxht[184] = -6676471430170270736L;
        fj.hxht[185] = 8197010257411976197L;
        fj.hxht[186] = 1437726796635451940L;
        fj.hxht[187] = 4632402594020067139L;
        fj.hxht[188] = -5165404324519193438L;
        fj.hxht[189] = -2642081562322048916L;
        fj.hxht[190] = -5182639383007383864L;
        fj.hxht[191] = 8984945686533663799L;
        fj.hxht[192] = -4299598381099283838L;
        fj.hxht[193] = 8720186382873551931L;
        fj.hxht[194] = -1864305705778178560L;
        fj.hxht[195] = -5530250536106043964L;
        fj.hxht[196] = -5128909743050337283L;
        fj.hxht[197] = -3785955403873445208L;
        fj.hxht[198] = -9157572153865604074L;
        fj.hxht[199] = -2336481212638794232L;
    }

    private static /* synthetic */ void iagf() {
        fj.hxhm[1000] = 2110620805;
        fj.hxhm[1001] = -838046730;
        fj.hxhm[1002] = -963208379;
        fj.hxhm[1003] = 901223201;
        fj.hxhm[1004] = 1969698568;
        fj.hxhm[1005] = -1642817036;
        fj.hxhm[1006] = -489755575;
        fj.hxhm[1007] = -1161247731;
        fj.hxhm[1008] = 135208123;
        fj.hxhm[1009] = 1828446596;
        fj.hxhm[1010] = -1425926534;
        fj.hxhm[1011] = -1154500231;
        fj.hxhm[1012] = 506107486;
        fj.hxhm[1013] = -1696588605;
        fj.hxhm[1014] = 773044684;
        fj.hxhm[1015] = 2137099125;
        fj.hxhm[1016] = -655804029;
        fj.hxhm[1017] = 1132870682;
        fj.hxhm[1018] = 1826584104;
        fj.hxhm[1019] = -942509612;
        fj.hxhm[1020] = 501891240;
        fj.hxhm[1021] = 15529666;
        fj.hxhm[1022] = 787786660;
        fj.hxhm[1023] = 1468355158;
        fj.hxhm[1024] = -784308089;
        fj.hxhm[1025] = -113541239;
        fj.hxhm[1026] = 72452596;
        fj.hxhm[1027] = -1752986359;
        fj.hxhm[1028] = 893767339;
        fj.hxhm[1029] = -1906294315;
        fj.hxhm[1030] = 1635459871;
        fj.hxhm[1031] = -2082821397;
        fj.hxhm[1032] = -189356730;
        fj.hxhm[1033] = 1215294185;
        fj.hxhm[1034] = 1324840309;
        fj.hxhm[1035] = -864824620;
        fj.hxhm[1036] = 732090433;
        fj.hxhm[1037] = -569031833;
        fj.hxhm[1038] = 2081005759;
        fj.hxhm[1039] = 183707794;
        fj.hxhm[1040] = -197935211;
        fj.hxhm[1041] = 73833749;
        fj.hxhm[1042] = -1512064328;
        fj.hxhm[1043] = 1359706709;
        fj.hxhm[1044] = -1102767399;
        fj.hxhm[1045] = 1769855203;
        fj.hxhm[1046] = -479922500;
        fj.hxhm[1047] = -225124275;
        fj.hxhm[1048] = 295965211;
        fj.hxhm[1049] = -1485027028;
        fj.hxhm[1050] = 702682303;
        fj.hxhm[1051] = 41628305;
        fj.hxhm[1052] = 1672636402;
        fj.hxhm[1053] = 1483994172;
        fj.hxhm[1054] = 583093120;
        fj.hxhm[1055] = 1535342914;
        fj.hxhm[1056] = -815298349;
        fj.hxhm[1057] = -1018954990;
        fj.hxhm[1058] = 2120884733;
        fj.hxhm[1059] = 2083896048;
        fj.hxhm[1060] = -1015331933;
        fj.hxhm[1061] = -435279770;
        fj.hxhm[1062] = 1451027497;
        fj.hxhm[1063] = -634729157;
        fj.hxhm[1064] = -215287922;
        fj.hxhm[1065] = 952626156;
        fj.hxhm[1066] = -503521573;
        fj.hxhm[1067] = 1658063805;
        fj.hxhm[1068] = -339522794;
        fj.hxhm[1069] = 835274202;
        fj.hxhm[1070] = -479006966;
        fj.hxhm[1071] = -1865606873;
        fj.hxhm[1072] = -517619602;
        fj.hxhm[1073] = -211786072;
        fj.hxhm[1074] = 1929572407;
        fj.hxhm[1075] = 455478953;
        fj.hxhm[1076] = 1596111625;
        fj.hxhm[1077] = 748226326;
        fj.hxhm[1078] = 1745856042;
        fj.hxhm[1079] = -1038697065;
        fj.hxhm[1080] = 972409453;
        fj.hxhm[1081] = -53298061;
        fj.hxhm[1082] = -157172256;
        fj.hxhm[1083] = -260970679;
        fj.hxhm[1084] = 247156300;
        fj.hxhm[1085] = -240005861;
        fj.hxhm[1086] = -1886330429;
        fj.hxhm[1087] = -851865790;
        fj.hxhm[1088] = -225196076;
        fj.hxhm[1089] = 631916864;
        fj.hxhm[1090] = -1498587877;
        fj.hxhm[1091] = 1260637075;
        fj.hxhm[1092] = 899312709;
        fj.hxhm[1093] = 1126001645;
        fj.hxhm[1094] = 1394344644;
        fj.hxhm[1095] = -957237375;
        fj.hxhm[1096] = -753283900;
        fj.hxhm[1097] = 687704136;
        fj.hxhm[1098] = 1660767009;
        fj.hxhm[1099] = -1083151259;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fj.pb - fj.hxhn("iacp", hxhs(int ), (int)356)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fj.hxhn("iacq", hxhp(int ), (int)1123)) break;
            v0 /* !! */  = (long)fj.hxhn("iacr", hxhp(int ), (int)1124);
        }
        var3_1 = fj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("iacs", hxhs(int ), (int)357)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fj.hxhn("iact", hxhp(int ), (int)1125)) break;
            v1 /* !! */  = (long)fj.hxhn("iacu", hxhp(int ), (int)1126);
        }
        var2_2 /* !! */  = fj.b;
        v2 /* !! */  = fj.pb;
        if (true) ** GOTO lbl17
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - fj.hxhn("iacw", hxhs(int ), (int)358));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518949128: {
                    break block20;
                }
                case -725309224: {
                    v3 = fj.hxhn("iacy", hxhs(int ), (int)359);
                    continue block20;
                }
                case -410642736: {
                    v3 = fj.hxhn("iacz", hxhs(int ), (int)360);
                    continue block20;
                }
                case 267347656: {
                    v3 = fj.hxhn("iada", hxhs(int ), (int)361);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = fj.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("iadd", hxhs(int ), (int)362)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fj.hxhn("iade", hxhp(int ), (int)1127)) break;
                    v4 /* !! */  = (long)fj.hxhn("iadf", hxhp(int ), (int)1128);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("iadh", hxhs(int ), (int)363)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fj.hxhn("iadj", hxhp(int ), (int)1129)) break;
                    v5 /* !! */  = (long)fj.hxhn("iadk", hxhp(int ), (int)1130);
                }
                v6 = this.mode.isSelected("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c");
                v7 /* !! */  = fj.pb;
                if (true) ** GOTO lbl53
                block24: while (true) {
                    v7 /* !! */  = (long)(v8 - fj.hxhn("iadl", hxhs(int ), (int)364));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1518949128: {
                            break block24;
                        }
                        case -1149104770: {
                            v8 = fj.hxhn("iadm", hxhs(int ), (int)365);
                            continue block24;
                        }
                        case -702130815: {
                            v8 = fj.hxhn("iadn", hxhs(int ), (int)366);
                            continue block24;
                        }
                        case 404513401: {
                            v8 = fj.hxhn("iado", hxhs(int ), (int)367);
                            continue block24;
                        }
                    }
                    break;
                }
                return v6;
            }
lbl66:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fj.hxhn("iadp", hxhp(int ), (int)1131);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fj.hxhn("iadq", hxhp(int ), (int)1132);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)fj.hxhn("iadr", hxhp(int ), (int)1133);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fj.hxhn("iads", hxhp(int ), (int)1134);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        var3_1 = fj.c;
        var2_2 /* !! */  = fj.b;
        var1_3 = fj.a;
        if (var3_1) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        super.activate();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.serverRunning = fj.hxhn("hzgu", hxhp(int ), (int)730);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.clientConnected = fj.hxhn("hzgv", hxhp(int ), (int)731);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.awaitingRegionList = fj.hxhn("hzgw", hxhp(int ), (int)732);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.awaitingClaim = fj.hxhn("hzgx", hxhp(int ), (int)733);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.awaitingLimitMessage = fj.hxhn("hzgy", hxhp(int ), (int)734);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastReceivedMessage = null;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastUsername = null;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastSendTime = (long)fj.hxhn("hzgz", hxhs(int ), (int)296);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.hasLastPos = fj.hxhn("hzha", hxhp(int ), (int)735);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.commandQueue.clear();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.messageQueue.clear();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.connectionMessagePrinted = fj.hxhn("hzhb", hxhp(int ), (int)736);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.serverLimit = (int)fj.hxhn("hzhc", hxhp(int ), (int)737);
        if (var1_3 || var1_3) ** GOTO lbl6
        if (!this.mode.isSelected("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c")) ** GOTO lbl52
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                this.attemptConnectionSender();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.senderThread = new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$activate$7(), ()V)((fj)this));
                if (var1_3 || var1_3) ** GOTO lbl6
                this.senderThread.start();
                if (var1_3) ** GOTO lbl6
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl52:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            if (!this.mode.isSelected("\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c")) ** GOTO lbl57
            if (var1_3 || var1_3) ** GOTO lbl6
            this.startServer();
            if (var1_3) ** GOTO lbl6
lbl57:
            // 3 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl60:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhd", hxhp(int ), (int)738);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl65:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhe", hxhp(int ), (int)739);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 2: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhf", hxhp(int ), (int)740);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 3: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhg", hxhp(int ), (int)741);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl80:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhh", hxhp(int ), (int)742);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl85:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhi", hxhp(int ), (int)743);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 6: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhj", hxhp(int ), (int)744);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl95:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhk", hxhp(int ), (int)745);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)fj.hxhn("hzhl", hxhp(int ), (int)746);
                } while (!var3_1);
                throw null;
            }
lbl105:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhm", hxhp(int ), (int)747);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 10: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhn", hxhp(int ), (int)748);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)fj.hxhn("hzho", hxhp(int ), (int)749);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl119:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhp", hxhp(int ), (int)750);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl123:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhq", hxhp(int ), (int)751);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
lbl127:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhr", hxhp(int ), (int)752);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl132:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhs", hxhp(int ), (int)753);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 16: {
                var2_2 /* !! */  = (int)fj.hxhn("hzht", hxhp(int ), (int)754);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl141:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhu", hxhp(int ), (int)755);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl146:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhv", hxhp(int ), (int)756);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhw", hxhp(int ), (int)757);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl155:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhx", hxhp(int ), (int)758);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 21: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhy", hxhp(int ), (int)759);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)fj.hxhn("hzhz", hxhp(int ), (int)760);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 23: {
                var2_2 /* !! */  = (int)fj.hxhn("hzia", hxhp(int ), (int)761);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl173:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)fj.hxhn("hzib", hxhp(int ), (int)762);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl178:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)fj.hxhn("hzic", hxhp(int ), (int)763);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl183:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)fj.hxhn("hzid", hxhp(int ), (int)764);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 27: {
                var2_2 /* !! */  = (int)fj.hxhn("hzie", hxhp(int ), (int)765);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 28: {
                var2_2 /* !! */  = (int)fj.hxhn("hzif", hxhp(int ), (int)766);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 29: {
                var2_2 /* !! */  = (int)fj.hxhn("hzig", hxhp(int ), (int)767);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl201:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)fj.hxhn("hzih", hxhp(int ), (int)768);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
            case 31: {
                var2_2 /* !! */  = (int)fj.hxhn("hzii", hxhp(int ), (int)769);
                if (!var3_1) ** GOTO lbl201
                throw null;
            }
lbl209:
            // 5 sources

            case 32: {
                var2_2 /* !! */  = (int)fj.hxhn("hzij", hxhp(int ), (int)770);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl213:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)fj.hxhn("hzik", hxhp(int ), (int)771);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl217:
            // 2 sources

            case 34: {
                var2_2 /* !! */  = (int)fj.hxhn("hzil", hxhp(int ), (int)772);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl221:
            // 2 sources

            case 35: {
                var2_2 /* !! */  = (int)fj.hxhn("hzim", hxhp(int ), (int)773);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl226:
            // 2 sources

            case 36: {
                var2_2 /* !! */  = (int)fj.hxhn("hzin", hxhp(int ), (int)774);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl230:
            // 5 sources

            case 37: {
                var2_2 /* !! */  = (int)fj.hxhn("hzio", hxhp(int ), (int)775);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl234:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)fj.hxhn("hzip", hxhp(int ), (int)776);
                if (!var3_1) ** GOTO lbl123
                throw null;
            }
lbl238:
            // 3 sources

            case 39: {
                var2_2 /* !! */  = (int)fj.hxhn("hziq", hxhp(int ), (int)777);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 40: {
                var2_2 /* !! */  = (int)fj.hxhn("hzir", hxhp(int ), (int)778);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
            case 41: {
                do {
                    var2_2 /* !! */  = (int)fj.hxhn("hzis", hxhp(int ), (int)779);
                } while (!var3_1);
                throw null;
            }
lbl251:
            // 3 sources

            case 42: {
                var2_2 /* !! */  = (int)fj.hxhn("hzit", hxhp(int ), (int)780);
                if (!var3_1) ** GOTO lbl226
                throw null;
            }
            case 43: {
                var2_2 /* !! */  = (int)fj.hxhn("hziu", hxhp(int ), (int)781);
                if (!var3_1) ** GOTO lbl230
                throw null;
            }
lbl259:
            // 2 sources

            case 44: {
                var2_2 /* !! */  = (int)fj.hxhn("hziv", hxhp(int ), (int)782);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 45: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fj.hxhn("hziw", hxhp(int ), (int)783);
                    if (!var3_1) ** GOTO lbl230
                    throw null;
                }
            }
            case 46: 
        }
        var2_2 /* !! */  = (int)fj.hxhn("hzix", hxhp(int ), (int)784);
        ** while (!var3_1)
lbl271:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iahk() {
        fj.hxhu[300] = 7758386351976792242L;
        fj.hxhu[301] = 989483745400852761L;
        fj.hxhu[302] = 330178657272424296L;
        fj.hxhu[303] = -4880458807705998542L;
        fj.hxhu[304] = -6342691383143454352L;
        fj.hxhu[305] = 8059333136826970943L;
        fj.hxhu[306] = -3640820604894907037L;
        fj.hxhu[307] = -3483640721893651614L;
        fj.hxhu[308] = 5071552307299454712L;
        fj.hxhu[309] = 3035749160003960161L;
        fj.hxhu[310] = -5849372196626740475L;
        fj.hxhu[311] = 8743290234005495041L;
        fj.hxhu[312] = 2369702259412406430L;
        fj.hxhu[313] = 2393899771301404041L;
        fj.hxhu[314] = 2016726249510428691L;
        fj.hxhu[315] = -5681424432264200812L;
        fj.hxhu[316] = 444846954696997177L;
        fj.hxhu[317] = 1082920134955381608L;
        fj.hxhu[318] = 6182272283158572108L;
        fj.hxhu[319] = -4892967236332933093L;
        fj.hxhu[320] = 3692555910881284088L;
        fj.hxhu[321] = 4233527875447186724L;
        fj.hxhu[322] = -1487202963626881472L;
        fj.hxhu[323] = 136924523577849871L;
        fj.hxhu[324] = -8825974773594284951L;
        fj.hxhu[325] = -6926102891535045370L;
        fj.hxhu[326] = 3491002238168835403L;
        fj.hxhu[327] = 7039282437655482594L;
        fj.hxhu[328] = -4124772858513077833L;
        fj.hxhu[329] = 5772794235200147567L;
        fj.hxhu[330] = -1091065331304707220L;
        fj.hxhu[331] = 1307039951986604351L;
        fj.hxhu[332] = 4033270088484802290L;
        fj.hxhu[333] = -807905573317612639L;
        fj.hxhu[334] = -7691864933089597845L;
        fj.hxhu[335] = 3362543297002956822L;
        fj.hxhu[336] = -4444760315316201503L;
        fj.hxhu[337] = -7318180302205693788L;
        fj.hxhu[338] = -1592301625609645182L;
        fj.hxhu[339] = -8338582132614627458L;
        fj.hxhu[340] = 3821445637482747258L;
        fj.hxhu[341] = -5442321224064354603L;
        fj.hxhu[342] = -2008464771690135502L;
        fj.hxhu[343] = 497642285759895870L;
        fj.hxhu[344] = -2863200901072082827L;
        fj.hxhu[345] = 2843926995503555205L;
        fj.hxhu[346] = 6287289945149494792L;
        fj.hxhu[347] = -713259637363152067L;
        fj.hxhu[348] = -8175281043333898444L;
        fj.hxhu[349] = 3199782414425149078L;
        fj.hxhu[350] = 867212706837997041L;
        fj.hxhu[351] = 1164609713406408182L;
        fj.hxhu[352] = -2150705785894246536L;
        fj.hxhu[353] = 6114099612663686169L;
        fj.hxhu[354] = 371579141853159917L;
        fj.hxhu[355] = 6452375015474832826L;
        fj.hxhu[356] = 1874650648865971486L;
        fj.hxhu[357] = -4472067026013988253L;
        fj.hxhu[358] = 5282498235440539169L;
        fj.hxhu[359] = -1729328808926251118L;
        fj.hxhu[360] = -1375688399847089354L;
        fj.hxhu[361] = 789430861272442916L;
        fj.hxhu[362] = -7389719783527235247L;
        fj.hxhu[363] = -4323653386147086615L;
        fj.hxhu[364] = -4715285254222793104L;
        fj.hxhu[365] = -5214467348390380787L;
        fj.hxhu[366] = -5843506021041323320L;
        fj.hxhu[367] = -2300952614110628120L;
    }

    private static /* synthetic */ void iadz() {
        fj.hxhl[300] = 1759994569;
        fj.hxhl[301] = -1114560935;
        fj.hxhl[302] = -331898820;
        fj.hxhl[303] = -1136747738;
        fj.hxhl[304] = -1469865055;
        fj.hxhl[305] = -2081313806;
        fj.hxhl[306] = -565853217;
        fj.hxhl[307] = -568832954;
        fj.hxhl[308] = 1949346342;
        fj.hxhl[309] = 1985002755;
        fj.hxhl[310] = 30892407;
        fj.hxhl[311] = 1710851406;
        fj.hxhl[312] = 1997835189;
        fj.hxhl[313] = -2095031424;
        fj.hxhl[314] = -1666696602;
        fj.hxhl[315] = -1844724832;
        fj.hxhl[316] = -1252761358;
        fj.hxhl[317] = -580402958;
        fj.hxhl[318] = -1566067041;
        fj.hxhl[319] = -1452513492;
        fj.hxhl[320] = -1835404867;
        fj.hxhl[321] = -441373382;
        fj.hxhl[322] = 1364907729;
        fj.hxhl[323] = 393827560;
        fj.hxhl[324] = -455162058;
        fj.hxhl[325] = -500067282;
        fj.hxhl[326] = -1511932381;
        fj.hxhl[327] = -35459566;
        fj.hxhl[328] = 1634515385;
        fj.hxhl[329] = -487135739;
        fj.hxhl[330] = -1998612288;
        fj.hxhl[331] = -914178250;
        fj.hxhl[332] = -51986876;
        fj.hxhl[333] = -1767270626;
        fj.hxhl[334] = -481972083;
        fj.hxhl[335] = -1956151841;
        fj.hxhl[336] = -943084789;
        fj.hxhl[337] = 1238419875;
        fj.hxhl[338] = 1973939682;
        fj.hxhl[339] = -1235222088;
        fj.hxhl[340] = 88921036;
        fj.hxhl[341] = -1414859551;
        fj.hxhl[342] = -1104223570;
        fj.hxhl[343] = -1547329260;
        fj.hxhl[344] = 1351243978;
        fj.hxhl[345] = 702450162;
        fj.hxhl[346] = -729531497;
        fj.hxhl[347] = 1255788663;
        fj.hxhl[348] = 587720097;
        fj.hxhl[349] = -170795951;
        fj.hxhl[350] = -230133727;
        fj.hxhl[351] = 427862823;
        fj.hxhl[352] = -1219817278;
        fj.hxhl[353] = 2073424035;
        fj.hxhl[354] = 624782361;
        fj.hxhl[355] = 1171563289;
        fj.hxhl[356] = 2095379190;
        fj.hxhl[357] = -1098757196;
        fj.hxhl[358] = 60583743;
        fj.hxhl[359] = 7632520;
        fj.hxhl[360] = 2136712470;
        fj.hxhl[361] = 1351114995;
        fj.hxhl[362] = 1234613245;
        fj.hxhl[363] = 1770826939;
        fj.hxhl[364] = -370379851;
        fj.hxhl[365] = 259056987;
        fj.hxhl[366] = -914504466;
        fj.hxhl[367] = 1840918515;
        fj.hxhl[368] = -1225952362;
        fj.hxhl[369] = -850064839;
        fj.hxhl[370] = -233360064;
        fj.hxhl[371] = -1919833479;
        fj.hxhl[372] = -522499194;
        fj.hxhl[373] = 2118247592;
        fj.hxhl[374] = 916893897;
        fj.hxhl[375] = -2127722217;
        fj.hxhl[376] = -23509134;
        fj.hxhl[377] = 1058309435;
        fj.hxhl[378] = -579561728;
        fj.hxhl[379] = 1121896599;
        fj.hxhl[380] = -29947798;
        fj.hxhl[381] = -578714819;
        fj.hxhl[382] = -2092525972;
        fj.hxhl[383] = 1597698278;
        fj.hxhl[384] = 1123051278;
        fj.hxhl[385] = -819789615;
        fj.hxhl[386] = 262338691;
        fj.hxhl[387] = 662954738;
        fj.hxhl[388] = 693197175;
        fj.hxhl[389] = 1502899201;
        fj.hxhl[390] = -301033384;
        fj.hxhl[391] = 604789871;
        fj.hxhl[392] = 1487991672;
        fj.hxhl[393] = 810778255;
        fj.hxhl[394] = 1593881188;
        fj.hxhl[395] = -1593420300;
        fj.hxhl[396] = 550753403;
        fj.hxhl[397] = -493731327;
        fj.hxhl[398] = 1195836217;
        fj.hxhl[399] = -2024366323;
    }

    private static /* synthetic */ void iaex() {
        fj.hxhl[1000] = 2110620813;
        fj.hxhl[1001] = -838046736;
        fj.hxhl[1002] = -963208380;
        fj.hxhl[1003] = 901223213;
        fj.hxhl[1004] = 1969698574;
        fj.hxhl[1005] = -1642817028;
        fj.hxhl[1006] = -489755575;
        fj.hxhl[1007] = -1161247731;
        fj.hxhl[1008] = 135208123;
        fj.hxhl[1009] = 1828446598;
        fj.hxhl[1010] = -1425926545;
        fj.hxhl[1011] = -1154500225;
        fj.hxhl[1012] = 506107476;
        fj.hxhl[1013] = -1696588552;
        fj.hxhl[1014] = 773044698;
        fj.hxhl[1015] = 2137099135;
        fj.hxhl[1016] = -655804015;
        fj.hxhl[1017] = 1132870661;
        fj.hxhl[1018] = 1826584082;
        fj.hxhl[1019] = -942509604;
        fj.hxhl[1020] = 501891253;
        fj.hxhl[1021] = 15529691;
        fj.hxhl[1022] = 787786634;
        fj.hxhl[1023] = 1468355156;
        fj.hxhl[1024] = -784308092;
        fj.hxhl[1025] = -113541203;
        fj.hxhl[1026] = 72452595;
        fj.hxhl[1027] = -1752986347;
        fj.hxhl[1028] = 893767358;
        fj.hxhl[1029] = -1906294333;
        fj.hxhl[1030] = 1635459859;
        fj.hxhl[1031] = -2082821437;
        fj.hxhl[1032] = -189356704;
        fj.hxhl[1033] = 1215294206;
        fj.hxhl[1034] = 1324840309;
        fj.hxhl[1035] = -864824634;
        fj.hxhl[1036] = 732090491;
        fj.hxhl[1037] = -569031809;
        fj.hxhl[1038] = 2081005711;
        fj.hxhl[1039] = 183707826;
        fj.hxhl[1040] = -197935178;
        fj.hxhl[1041] = 73833747;
        fj.hxhl[1042] = -1512064321;
        fj.hxhl[1043] = 1359706745;
        fj.hxhl[1044] = -1102767391;
        fj.hxhl[1045] = 1769855177;
        fj.hxhl[1046] = -479922499;
        fj.hxhl[1047] = -225124250;
        fj.hxhl[1048] = 295965244;
        fj.hxhl[1049] = -1485027014;
        fj.hxhl[1050] = 702682283;
        fj.hxhl[1051] = 41628323;
        fj.hxhl[1052] = 1672636396;
        fj.hxhl[1053] = 1483994116;
        fj.hxhl[1054] = 583093161;
        fj.hxhl[1055] = 1535342928;
        fj.hxhl[1056] = -815298338;
        fj.hxhl[1057] = -1018955001;
        fj.hxhl[1058] = 2120884701;
        fj.hxhl[1059] = 2083896053;
        fj.hxhl[1060] = -1015331954;
        fj.hxhl[1061] = -435279751;
        fj.hxhl[1062] = 1451027481;
        fj.hxhl[1063] = -634729159;
        fj.hxhl[1064] = -215287930;
        fj.hxhl[1065] = 952626153;
        fj.hxhl[1066] = -503521580;
        fj.hxhl[1067] = 1658063754;
        fj.hxhl[1068] = -339522802;
        fj.hxhl[1069] = 835274187;
        fj.hxhl[1070] = -479010901;
        fj.hxhl[1071] = -1865606874;
        fj.hxhl[1072] = -517619601;
        fj.hxhl[1073] = -211786076;
        fj.hxhl[1074] = 1929572374;
        fj.hxhl[1075] = 455478920;
        fj.hxhl[1076] = 1596111643;
        fj.hxhl[1077] = 748226332;
        fj.hxhl[1078] = 1745856037;
        fj.hxhl[1079] = -1038697068;
        fj.hxhl[1080] = 972409422;
        fj.hxhl[1081] = -53298055;
        fj.hxhl[1082] = -157172225;
        fj.hxhl[1083] = -260970678;
        fj.hxhl[1084] = 247156298;
        fj.hxhl[1085] = -240005866;
        fj.hxhl[1086] = -1886330400;
        fj.hxhl[1087] = -851865765;
        fj.hxhl[1088] = -225196066;
        fj.hxhl[1089] = 631916877;
        fj.hxhl[1090] = -1498587904;
        fj.hxhl[1091] = 1260637069;
        fj.hxhl[1092] = 899312726;
        fj.hxhl[1093] = 1126001640;
        fj.hxhl[1094] = 1394344679;
        fj.hxhl[1095] = -957237358;
        fj.hxhl[1096] = -753283884;
        fj.hxhl[1097] = 687704132;
        fj.hxhl[1098] = 1660766976;
        fj.hxhl[1099] = -1083151234;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fj.pb - fj.hxhn("iabp", hxhs(int ), (int)347)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fj.hxhn("iabq", hxhp(int ), (int)1109)) break;
            v0 /* !! */  = (long)fj.hxhn("iabs", hxhp(int ), (int)1110);
        }
        var3_1 = fj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("iabt", hxhs(int ), (int)348)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fj.hxhn("iabu", hxhp(int ), (int)1111)) break;
            v1 /* !! */  = (long)fj.hxhn("iabw", hxhp(int ), (int)1112);
        }
        var2_2 /* !! */  = fj.b;
        v2 /* !! */  = fj.pb;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - fj.hxhn("iabx", hxhs(int ), (int)349));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518949128: {
                    break block14;
                }
                case 136239352: {
                    v3 = fj.hxhn("iaby", hxhs(int ), (int)350);
                    continue block14;
                }
                case 314214298: {
                    v3 = fj.hxhn("iabz", hxhs(int ), (int)351);
                    continue block14;
                }
                case 1116950340: {
                    v3 = fj.hxhn("iaca", hxhs(int ), (int)352);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = fj.a;
        if (var3_1) {
            throw null;
lbl32:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("iacb", hxhs(int ), (int)353)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fj.hxhn("iacc", hxhp(int ), (int)1113)) break;
                    v4 /* !! */  = (long)fj.hxhn("iacd", hxhp(int ), (int)1114);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("iace", hxhs(int ), (int)354)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fj.hxhn("iacf", hxhp(int ), (int)1115)) break;
                    v5 /* !! */  = (long)fj.hxhn("iacg", hxhp(int ), (int)1116);
                }
                v6 = this.mode.isSelected("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = fj.pb - fj.hxhn("iach", hxhs(int ), (int)355)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fj.hxhn("iaci", hxhp(int ), (int)1117)) break;
                    v7 /* !! */  = (long)fj.hxhn("iacj", hxhp(int ), (int)1118);
                }
                return v6;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)fj.hxhn("iack", hxhp(int ), (int)1119);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fj.hxhn("iacm", hxhp(int ), (int)1120);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)fj.hxhn("iacn", hxhp(int ), (int)1121);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fj.hxhn("iaco", hxhp(int ), (int)1122);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void iahb() {
        fj.hxhu[0] = 2482990938076565890L;
        fj.hxhu[1] = -6023053541265672384L;
        fj.hxhu[2] = 7682277763205575273L;
        fj.hxhu[3] = -4669606824399268283L;
        fj.hxhu[4] = -8515308641710878043L;
        fj.hxhu[5] = 5051630156540023797L;
        fj.hxhu[6] = 3334903269826312435L;
        fj.hxhu[7] = 4465536032643907258L;
        fj.hxhu[8] = 4518267438984895158L;
        fj.hxhu[9] = 4350339922668523303L;
        fj.hxhu[10] = -6826433659079123281L;
        fj.hxhu[11] = -5593620652032276744L;
        fj.hxhu[12] = 863750472535990577L;
        fj.hxhu[13] = 3927623765758431072L;
        fj.hxhu[14] = 3853043402893192949L;
        fj.hxhu[15] = -5922420948767224713L;
        fj.hxhu[16] = -2777221268975646981L;
        fj.hxhu[17] = 7539518628028591207L;
        fj.hxhu[18] = -6576461273190330149L;
        fj.hxhu[19] = -5398533803972216240L;
        fj.hxhu[20] = -2693207508140428489L;
        fj.hxhu[21] = 8740838648985596645L;
        fj.hxhu[22] = -2562916980770180703L;
        fj.hxhu[23] = -148185171713091280L;
        fj.hxhu[24] = 6420633182872599212L;
        fj.hxhu[25] = 6803191045768832081L;
        fj.hxhu[26] = 8434896924953575546L;
        fj.hxhu[27] = 3475256612791669755L;
        fj.hxhu[28] = 3762826270547119610L;
        fj.hxhu[29] = -8496033708351686701L;
        fj.hxhu[30] = 2132135201128425696L;
        fj.hxhu[31] = -4366820287335944489L;
        fj.hxhu[32] = 5282342745607647132L;
        fj.hxhu[33] = 4213534383996649696L;
        fj.hxhu[34] = 2877966590935055898L;
        fj.hxhu[35] = -3458600030465567290L;
        fj.hxhu[36] = 982169367000221768L;
        fj.hxhu[37] = -413284369256643980L;
        fj.hxhu[38] = -963137759624001246L;
        fj.hxhu[39] = -5404432940542882156L;
        fj.hxhu[40] = -5301238535492888354L;
        fj.hxhu[41] = 6475476358259981312L;
        fj.hxhu[42] = 7306079127415243088L;
        fj.hxhu[43] = -1573454558588805277L;
        fj.hxhu[44] = -3443154549794508641L;
        fj.hxhu[45] = 3937262555940860943L;
        fj.hxhu[46] = -4141290423082376389L;
        fj.hxhu[47] = -5434427622007883506L;
        fj.hxhu[48] = 6055139504791120369L;
        fj.hxhu[49] = 7505680444870095361L;
        fj.hxhu[50] = -6647843965468045983L;
        fj.hxhu[51] = 832915633924804060L;
        fj.hxhu[52] = 3382543479069845874L;
        fj.hxhu[53] = 7501250280700126399L;
        fj.hxhu[54] = 1211064690816613635L;
        fj.hxhu[55] = -7532178632775124931L;
        fj.hxhu[56] = 1957112448487881010L;
        fj.hxhu[57] = -7521527365317501347L;
        fj.hxhu[58] = 2130066474121649682L;
        fj.hxhu[59] = -4453232699867033752L;
        fj.hxhu[60] = 758149568097743968L;
        fj.hxhu[61] = 306086315848672593L;
        fj.hxhu[62] = -7539088992881065028L;
        fj.hxhu[63] = -5454670097412888317L;
        fj.hxhu[64] = -2945550453356173414L;
        fj.hxhu[65] = 4220776094539830306L;
        fj.hxhu[66] = 6795856581703775L;
        fj.hxhu[67] = 7549793319468244911L;
        fj.hxhu[68] = 4405254576511136937L;
        fj.hxhu[69] = 7583454012017026431L;
        fj.hxhu[70] = -40907737168805481L;
        fj.hxhu[71] = 286875704496179759L;
        fj.hxhu[72] = -7744105116874740131L;
        fj.hxhu[73] = 5985214998071957589L;
        fj.hxhu[74] = -1110295744936490547L;
        fj.hxhu[75] = -4529866006401186017L;
        fj.hxhu[76] = -1830558207742596382L;
        fj.hxhu[77] = -6296646889808191196L;
        fj.hxhu[78] = 8147124921579669943L;
        fj.hxhu[79] = -5527711965480857957L;
        fj.hxhu[80] = 1187929470631579540L;
        fj.hxhu[81] = 25620390382944062L;
        fj.hxhu[82] = -2908132505411332287L;
        fj.hxhu[83] = 6901528833135720509L;
        fj.hxhu[84] = 8630131904043005823L;
        fj.hxhu[85] = 259406527851500790L;
        fj.hxhu[86] = -5966806549479812235L;
        fj.hxhu[87] = 1563144340768298899L;
        fj.hxhu[88] = -6743126999655070749L;
        fj.hxhu[89] = 3739013427129783653L;
        fj.hxhu[90] = 3747434577360671550L;
        fj.hxhu[91] = -5201526386028852266L;
        fj.hxhu[92] = -7960031572453046869L;
        fj.hxhu[93] = 360454568145446933L;
        fj.hxhu[94] = -5174685687131969485L;
        fj.hxhu[95] = 7699200753601973020L;
        fj.hxhu[96] = -6264709855255182097L;
        fj.hxhu[97] = 2335457912128444447L;
        fj.hxhu[98] = -3828889334841552598L;
        fj.hxhu[99] = -1137368019167252898L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        var4_1 = fj.c;
        var3_2 /* !! */  = fj.b;
        var2_3 = fj.a;
        if (var4_1) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl6
        super.deactivate();
        if (var2_3 || var2_3) ** GOTO lbl6
        this.serverRunning = fj.hxhn("hziy", hxhp(int ), (int)785);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.clientConnected = fj.hxhn("hziz", hxhp(int ), (int)786);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.awaitingRegionList = fj.hxhn("hzja", hxhp(int ), (int)787);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.awaitingClaim = fj.hxhn("hzjb", hxhp(int ), (int)788);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.awaitingLimitMessage = fj.hxhn("hzjc", hxhp(int ), (int)789);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.lastReceivedMessage = null;
        if (var2_3 || var2_3) ** GOTO lbl6
        this.lastUsername = null;
        if (var2_3 || var2_3) ** GOTO lbl6
        this.lastSendTime = (long)fj.hxhn("hzjd", hxhs(int ), (int)297);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.hasLastPos = fj.hxhn("hzje", hxhp(int ), (int)790);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.commandQueue.clear();
        if (var2_3 || var2_3) ** GOTO lbl6
        this.messageQueue.clear();
        if (var2_3 || var2_3) ** GOTO lbl6
        this.connectionMessagePrinted = fj.hxhn("hzjf", hxhp(int ), (int)791);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl6
                this.serverLimit = (int)fj.hxhn("hzjg", hxhp(int ), (int)792);
                if (var2_3 || var2_3) ** GOTO lbl6
                if (this.senderThread == null) ** GOTO lbl44
                if (var2_3 || var2_3) ** GOTO lbl6
                this.senderThread.interrupt();
                if (var2_3) ** GOTO lbl6
lbl44:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                if (this.scheduler == null) ** GOTO lbl65
                if (var2_3 || var2_3) ** GOTO lbl6
                this.scheduler.shutdown();
                if (var2_3) ** GOTO lbl6
                try {
                    if (var2_3) ** GOTO lbl6
                    if (this.scheduler.awaitTermination((long)fj.hxhn("hzjh", hxhs(int ), (int)298), TimeUnit.SECONDS)) ** GOTO lbl56
                    if (var2_3 || var2_3) ** GOTO lbl6
                    this.scheduler.shutdownNow();
                    if (var2_3) ** GOTO lbl6
lbl56:
                    // 2 sources

                    if (var2_3 || var2_3) ** GOTO lbl6
                    ** if (!var4_1) goto lbl-1000
                }
                catch (InterruptedException var1_4) {
                    if (var2_3 || var2_3) ** GOTO lbl6
                    this.scheduler.shutdownNow();
                    if (var2_3) ** GOTO lbl6
                }
lbl-1000:
                // 1 sources

                {
                    throw null;
                }
lbl-1000:
                // 1 sources

                {
                }
lbl65:
                // 3 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                this.closeServerSocket();
                if (var2_3 || var2_3) ** GOTO lbl6
                this.closeSenderSocket();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)fj.hxhn("hzji", hxhp(int ), (int)793);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl77:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjj", hxhp(int ), (int)794);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl82:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjk", hxhp(int ), (int)795);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 3: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjl", hxhp(int ), (int)796);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl92:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjm", hxhp(int ), (int)797);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl97:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjn", hxhp(int ), (int)798);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 6: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjo", hxhp(int ), (int)799);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl107:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjp", hxhp(int ), (int)800);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 8: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjq", hxhp(int ), (int)801);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl117:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjr", hxhp(int ), (int)802);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl122:
            // 3 sources

            case 10: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjs", hxhp(int ), (int)803);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl127:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjt", hxhp(int ), (int)804);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 12: {
                var3_2 /* !! */  = (int)fj.hxhn("hzju", hxhp(int ), (int)805);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl137:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjv", hxhp(int ), (int)806);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl142:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjw", hxhp(int ), (int)807);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl147:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjx", hxhp(int ), (int)808);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 16: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjy", hxhp(int ), (int)809);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl157:
            // 4 sources

            case 17: {
                var3_2 /* !! */  = (int)fj.hxhn("hzjz", hxhp(int ), (int)810);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl162:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)fj.hxhn("hzka", hxhp(int ), (int)811);
                if (!var4_1) ** GOTO lbl107
                throw null;
            }
lbl166:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkb", hxhp(int ), (int)812);
                if (!var4_1) ** GOTO lbl77
                throw null;
            }
lbl170:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkc", hxhp(int ), (int)813);
                if (!var4_1) ** GOTO lbl122
                throw null;
            }
lbl174:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkd", hxhp(int ), (int)814);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 22: {
                do {
                    var3_2 /* !! */  = (int)fj.hxhn("hzke", hxhp(int ), (int)815);
                } while (!var4_1);
                throw null;
            }
            case 23: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkf", hxhp(int ), (int)816);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
            case 24: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkg", hxhp(int ), (int)817);
                if (!var4_1) ** GOTO lbl137
                throw null;
            }
lbl192:
            // 2 sources

            case 25: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkh", hxhp(int ), (int)818);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
lbl196:
            // 2 sources

            case 26: {
                var3_2 /* !! */  = (int)fj.hxhn("hzki", hxhp(int ), (int)819);
                if (!var4_1) ** GOTO lbl127
                throw null;
            }
lbl200:
            // 2 sources

            case 27: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkj", hxhp(int ), (int)820);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 28: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkk", hxhp(int ), (int)821);
                if (!var4_1) ** GOTO lbl92
                throw null;
            }
lbl209:
            // 2 sources

            case 29: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkl", hxhp(int ), (int)822);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl214:
            // 2 sources

            case 30: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkm", hxhp(int ), (int)823);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
lbl218:
            // 4 sources

            case 31: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkn", hxhp(int ), (int)824);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl223:
            // 4 sources

            case 32: {
                var3_2 /* !! */  = (int)fj.hxhn("hzko", hxhp(int ), (int)825);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl228:
            // 3 sources

            case 33: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkp", hxhp(int ), (int)826);
                if (!var4_1) ** GOTO lbl122
                throw null;
            }
lbl232:
            // 2 sources

            case 34: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkq", hxhp(int ), (int)827);
                if (!var4_1) ** GOTO lbl218
                throw null;
            }
            case 35: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkr", hxhp(int ), (int)828);
                if (!var4_1) ** GOTO lbl174
                throw null;
            }
            case 36: {
                var3_2 /* !! */  = (int)fj.hxhn("hzks", hxhp(int ), (int)829);
                if (!var4_1) ** GOTO lbl218
                throw null;
            }
lbl244:
            // 2 sources

            case 37: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkt", hxhp(int ), (int)830);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
lbl248:
            // 3 sources

            case 38: {
                var3_2 /* !! */  = (int)fj.hxhn("hzku", hxhp(int ), (int)831);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 39: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkv", hxhp(int ), (int)832);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl258:
            // 3 sources

            case 40: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkw", hxhp(int ), (int)833);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 41: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkx", hxhp(int ), (int)834);
                if (!var4_1) ** GOTO lbl82
                throw null;
            }
            case 42: {
                var3_2 /* !! */  = (int)fj.hxhn("hzky", hxhp(int ), (int)835);
                if (!var4_1) ** GOTO lbl142
                throw null;
            }
lbl271:
            // 2 sources

            case 43: {
                var3_2 /* !! */  = (int)fj.hxhn("hzkz", hxhp(int ), (int)836);
                if (!var4_1) ** GOTO lbl209
                throw null;
            }
            case 44: {
                var3_2 /* !! */  = (int)fj.hxhn("hzla", hxhp(int ), (int)837);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
lbl279:
            // 2 sources

            case 45: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlb", hxhp(int ), (int)838);
                if (!var4_1) break;
                throw null;
            }
lbl283:
            // 3 sources

            case 46: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlc", hxhp(int ), (int)839);
                if (!var4_1) ** GOTO lbl244
                throw null;
            }
lbl287:
            // 2 sources

            case 47: {
                var3_2 /* !! */  = (int)fj.hxhn("hzld", hxhp(int ), (int)840);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl292:
            // 3 sources

            case 48: {
                var3_2 /* !! */  = (int)fj.hxhn("hzle", hxhp(int ), (int)841);
                if (!var4_1) ** GOTO lbl170
                throw null;
            }
lbl296:
            // 5 sources

            case 49: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlf", hxhp(int ), (int)842);
                if (!var4_1) ** GOTO lbl228
                throw null;
            }
            case 50: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlg", hxhp(int ), (int)843);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
            case 51: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlh", hxhp(int ), (int)844);
                if (!var4_1) ** GOTO lbl292
                throw null;
            }
            case 52: {
                var3_2 /* !! */  = (int)fj.hxhn("hzli", hxhp(int ), (int)845);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
lbl312:
            // 2 sources

            case 53: {
                var3_2 /* !! */  = (int)fj.hxhn("hzlj", hxhp(int ), (int)846);
                if (!var4_1) ** GOTO lbl107
                throw null;
            }
            case 54: 
        }
        do {
            var3_2 /* !! */  = (int)fj.hxhn("hzlk", hxhp(int ), (int)847);
        } while (!var4_1);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private void processSocketMessage(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 49[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$onPacket$6(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iael() {
        fj.hxhl[700] = -490638197;
        fj.hxhl[701] = -1071999117;
        fj.hxhl[702] = 1047501604;
        fj.hxhl[703] = -908740168;
        fj.hxhl[704] = -778554816;
        fj.hxhl[705] = -1816379263;
        fj.hxhl[706] = -635928346;
        fj.hxhl[707] = -1561784320;
        fj.hxhl[708] = 260271445;
        fj.hxhl[709] = -469774573;
        fj.hxhl[710] = -520509966;
        fj.hxhl[711] = 1344620216;
        fj.hxhl[712] = 1281472833;
        fj.hxhl[713] = 1035546768;
        fj.hxhl[714] = 1767701747;
        fj.hxhl[715] = 264207567;
        fj.hxhl[716] = -1448280488;
        fj.hxhl[717] = -1589900051;
        fj.hxhl[718] = 34059898;
        fj.hxhl[719] = -1442661614;
        fj.hxhl[720] = 1187681494;
        fj.hxhl[721] = 1619857404;
        fj.hxhl[722] = 963218379;
        fj.hxhl[723] = 207020698;
        fj.hxhl[724] = -1008740240;
        fj.hxhl[725] = -1676325063;
        fj.hxhl[726] = 1477256905;
        fj.hxhl[727] = -1370976006;
        fj.hxhl[728] = 1300249193;
        fj.hxhl[729] = 994335879;
        fj.hxhl[730] = 1932934140;
        fj.hxhl[731] = 1984232626;
        fj.hxhl[732] = 335906820;
        fj.hxhl[733] = 1706405001;
        fj.hxhl[734] = -2041632436;
        fj.hxhl[735] = 596914669;
        fj.hxhl[736] = -1450103305;
        fj.hxhl[737] = -1846333067;
        fj.hxhl[738] = -318125002;
        fj.hxhl[739] = -1035906057;
        fj.hxhl[740] = 258969600;
        fj.hxhl[741] = -2099527297;
        fj.hxhl[742] = -1922615588;
        fj.hxhl[743] = -2098027957;
        fj.hxhl[744] = 301941434;
        fj.hxhl[745] = -49291778;
        fj.hxhl[746] = -908908508;
        fj.hxhl[747] = 910945456;
        fj.hxhl[748] = -82189641;
        fj.hxhl[749] = 537339187;
        fj.hxhl[750] = -1895103099;
        fj.hxhl[751] = -533619062;
        fj.hxhl[752] = 513022564;
        fj.hxhl[753] = -601050418;
        fj.hxhl[754] = 1187727121;
        fj.hxhl[755] = -1670805641;
        fj.hxhl[756] = 1926022495;
        fj.hxhl[757] = -31967674;
        fj.hxhl[758] = -245640464;
        fj.hxhl[759] = 1834905399;
        fj.hxhl[760] = -1034198340;
        fj.hxhl[761] = -165928751;
        fj.hxhl[762] = -1105121991;
        fj.hxhl[763] = -1262674351;
        fj.hxhl[764] = 1593421533;
        fj.hxhl[765] = -1602605233;
        fj.hxhl[766] = -320573484;
        fj.hxhl[767] = 132627545;
        fj.hxhl[768] = -2094172876;
        fj.hxhl[769] = 1876940032;
        fj.hxhl[770] = 1445935959;
        fj.hxhl[771] = 0x3AA6A666;
        fj.hxhl[772] = 989130645;
        fj.hxhl[773] = 367020844;
        fj.hxhl[774] = 1698175294;
        fj.hxhl[775] = -1756616977;
        fj.hxhl[776] = 1024018029;
        fj.hxhl[777] = -1539684870;
        fj.hxhl[778] = 347013279;
        fj.hxhl[779] = -1359827492;
        fj.hxhl[780] = -344979598;
        fj.hxhl[781] = -233596387;
        fj.hxhl[782] = 411103687;
        fj.hxhl[783] = 1020489705;
        fj.hxhl[784] = 609067979;
        fj.hxhl[785] = 573918934;
        fj.hxhl[786] = 1956961736;
        fj.hxhl[787] = -1355968688;
        fj.hxhl[788] = 1618496752;
        fj.hxhl[789] = -1896421777;
        fj.hxhl[790] = 627819047;
        fj.hxhl[791] = 909106620;
        fj.hxhl[792] = 271415062;
        fj.hxhl[793] = 1601349822;
        fj.hxhl[794] = 1131399056;
        fj.hxhl[795] = -498586555;
        fj.hxhl[796] = 971840691;
        fj.hxhl[797] = -2126205245;
        fj.hxhl[798] = 714536675;
        fj.hxhl[799] = 1385976677;
    }

    private static /* synthetic */ void iafe() {
        fj.hxhm[100] = 2002196750;
        fj.hxhm[101] = 290298983;
        fj.hxhm[102] = 340921206;
        fj.hxhm[103] = -907521651;
        fj.hxhm[104] = -1789235557;
        fj.hxhm[105] = -1376402463;
        fj.hxhm[106] = 178972553;
        fj.hxhm[107] = 22431123;
        fj.hxhm[108] = 1891991161;
        fj.hxhm[109] = -746016745;
        fj.hxhm[110] = -888983537;
        fj.hxhm[111] = -589434202;
        fj.hxhm[112] = -1432703654;
        fj.hxhm[113] = 1986230286;
        fj.hxhm[114] = 1078650621;
        fj.hxhm[115] = 162998569;
        fj.hxhm[116] = 1401175857;
        fj.hxhm[117] = -1882286126;
        fj.hxhm[118] = -193863052;
        fj.hxhm[119] = 1022891254;
        fj.hxhm[120] = 197539721;
        fj.hxhm[121] = -437222387;
        fj.hxhm[122] = -1914392575;
        fj.hxhm[123] = 573954110;
        fj.hxhm[124] = -1223054412;
        fj.hxhm[125] = -566509102;
        fj.hxhm[126] = -348801851;
        fj.hxhm[127] = -1180084510;
        fj.hxhm[128] = -1925388071;
        fj.hxhm[129] = -1200226209;
        fj.hxhm[130] = -553540181;
        fj.hxhm[131] = -2103100176;
        fj.hxhm[132] = -1312894421;
        fj.hxhm[133] = -689836746;
        fj.hxhm[134] = 1200042685;
        fj.hxhm[135] = 1089447564;
        fj.hxhm[136] = 1723700147;
        fj.hxhm[137] = 729478925;
        fj.hxhm[138] = -1488643308;
        fj.hxhm[139] = -248308470;
        fj.hxhm[140] = -247495217;
        fj.hxhm[141] = 1008051750;
        fj.hxhm[142] = 1208228832;
        fj.hxhm[143] = 1777340005;
        fj.hxhm[144] = 550455208;
        fj.hxhm[145] = 457718084;
        fj.hxhm[146] = 1993093273;
        fj.hxhm[147] = -1827853892;
        fj.hxhm[148] = 644037299;
        fj.hxhm[149] = -593864798;
        fj.hxhm[150] = -1953678827;
        fj.hxhm[151] = 1322301833;
        fj.hxhm[152] = -1322450610;
        fj.hxhm[153] = 403184436;
        fj.hxhm[154] = 2116929487;
        fj.hxhm[155] = 799517743;
        fj.hxhm[156] = 566487184;
        fj.hxhm[157] = 1628000206;
        fj.hxhm[158] = 1207681131;
        fj.hxhm[159] = 2035816930;
        fj.hxhm[160] = 1644685020;
        fj.hxhm[161] = 800642726;
        fj.hxhm[162] = 1738145394;
        fj.hxhm[163] = -1489599527;
        fj.hxhm[164] = 914718145;
        fj.hxhm[165] = -2135483460;
        fj.hxhm[166] = 1491696413;
        fj.hxhm[167] = 1005371226;
        fj.hxhm[168] = 1337368687;
        fj.hxhm[169] = -387788868;
        fj.hxhm[170] = -1938660959;
        fj.hxhm[171] = 255160831;
        fj.hxhm[172] = 244623222;
        fj.hxhm[173] = -440704929;
        fj.hxhm[174] = -844420665;
        fj.hxhm[175] = -1804379463;
        fj.hxhm[176] = 1179385723;
        fj.hxhm[177] = -339209455;
        fj.hxhm[178] = 2049443940;
        fj.hxhm[179] = 2061933155;
        fj.hxhm[180] = 233478340;
        fj.hxhm[181] = -223834214;
        fj.hxhm[182] = -1291890598;
        fj.hxhm[183] = -838561622;
        fj.hxhm[184] = -562853832;
        fj.hxhm[185] = -2036937709;
        fj.hxhm[186] = -843650342;
        fj.hxhm[187] = 1595536188;
        fj.hxhm[188] = 530663002;
        fj.hxhm[189] = 1820684969;
        fj.hxhm[190] = -1778813325;
        fj.hxhm[191] = -1377632716;
        fj.hxhm[192] = 859481510;
        fj.hxhm[193] = -1904962721;
        fj.hxhm[194] = 1820014453;
        fj.hxhm[195] = 1114606298;
        fj.hxhm[196] = -963631196;
        fj.hxhm[197] = -422825581;
        fj.hxhm[198] = 1916280334;
        fj.hxhm[199] = -1393409855;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$startServer$2() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [41[CATCHBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iagb() {
        fj.hxhm[900] = -860196118;
        fj.hxhm[901] = -2042799476;
        fj.hxhm[902] = 897456792;
        fj.hxhm[903] = -1547985034;
        fj.hxhm[904] = 1747519133;
        fj.hxhm[905] = 1127812052;
        fj.hxhm[906] = -850421825;
        fj.hxhm[907] = 681620979;
        fj.hxhm[908] = 1962662270;
        fj.hxhm[909] = -15282128;
        fj.hxhm[910] = 2076030789;
        fj.hxhm[911] = 1422265139;
        fj.hxhm[912] = -386879892;
        fj.hxhm[913] = 328157552;
        fj.hxhm[914] = 1269936707;
        fj.hxhm[915] = -652639320;
        fj.hxhm[916] = -68260666;
        fj.hxhm[917] = 2107583028;
        fj.hxhm[918] = -967205455;
        fj.hxhm[919] = -1833683626;
        fj.hxhm[920] = -848764163;
        fj.hxhm[921] = -1572731146;
        fj.hxhm[922] = -1238564581;
        fj.hxhm[923] = -1188803985;
        fj.hxhm[924] = -1566204316;
        fj.hxhm[925] = 2065347406;
        fj.hxhm[926] = 1628939411;
        fj.hxhm[927] = -1935676867;
        fj.hxhm[928] = 970320970;
        fj.hxhm[929] = -1410486416;
        fj.hxhm[930] = 430885353;
        fj.hxhm[931] = -821867452;
        fj.hxhm[932] = 1890015306;
        fj.hxhm[933] = -1927910920;
        fj.hxhm[934] = -1528543975;
        fj.hxhm[935] = 469391783;
        fj.hxhm[936] = -1255326752;
        fj.hxhm[937] = -899130903;
        fj.hxhm[938] = -1863440380;
        fj.hxhm[939] = 181872576;
        fj.hxhm[940] = 714298117;
        fj.hxhm[941] = -272056906;
        fj.hxhm[942] = -659226389;
        fj.hxhm[943] = -1628805790;
        fj.hxhm[944] = 1713445847;
        fj.hxhm[945] = 2012308035;
        fj.hxhm[946] = 161271678;
        fj.hxhm[947] = 1420041770;
        fj.hxhm[948] = 967692615;
        fj.hxhm[949] = -1362434662;
        fj.hxhm[950] = 2141051786;
        fj.hxhm[951] = -1861364574;
        fj.hxhm[952] = 1710917974;
        fj.hxhm[953] = 1256061612;
        fj.hxhm[954] = -696176786;
        fj.hxhm[955] = -302303745;
        fj.hxhm[956] = 793174511;
        fj.hxhm[957] = 1267365331;
        fj.hxhm[958] = -1194903476;
        fj.hxhm[959] = -1362664310;
        fj.hxhm[960] = -1622483360;
        fj.hxhm[961] = -746042555;
        fj.hxhm[962] = 205020438;
        fj.hxhm[963] = -1958445524;
        fj.hxhm[964] = 511289291;
        fj.hxhm[965] = 1530682883;
        fj.hxhm[966] = -1191174998;
        fj.hxhm[967] = -1790115810;
        fj.hxhm[968] = -729565708;
        fj.hxhm[969] = -222698721;
        fj.hxhm[970] = -454804425;
        fj.hxhm[971] = 17110801;
        fj.hxhm[972] = -991020182;
        fj.hxhm[973] = 1409646409;
        fj.hxhm[974] = 1138606881;
        fj.hxhm[975] = -287651829;
        fj.hxhm[976] = 1662873833;
        fj.hxhm[977] = -501828708;
        fj.hxhm[978] = 879398598;
        fj.hxhm[979] = 529272568;
        fj.hxhm[980] = -283943453;
        fj.hxhm[981] = 1483455345;
        fj.hxhm[982] = 1746560508;
        fj.hxhm[983] = -278428963;
        fj.hxhm[984] = -1586179452;
        fj.hxhm[985] = -616144054;
        fj.hxhm[986] = 1341758591;
        fj.hxhm[987] = 1837251705;
        fj.hxhm[988] = 1038682401;
        fj.hxhm[989] = 1507768462;
        fj.hxhm[990] = -465916751;
        fj.hxhm[991] = 2049498486;
        fj.hxhm[992] = -2056177018;
        fj.hxhm[993] = 1041202782;
        fj.hxhm[994] = -1532998057;
        fj.hxhm[995] = 1854749782;
        fj.hxhm[996] = -1340112268;
        fj.hxhm[997] = 1985618804;
        fj.hxhm[998] = -268001665;
        fj.hxhm[999] = 1276553;
    }

    /*
     * Exception decompiling
     */
    private void closeServerSocket() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 47[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iaev() {
        fj.hxhl[900] = -860196178;
        fj.hxhl[901] = -2042799452;
        fj.hxhl[902] = 897456810;
        fj.hxhl[903] = -1547985081;
        fj.hxhl[904] = 1747519189;
        fj.hxhl[905] = 1127812063;
        fj.hxhl[906] = -850421852;
        fj.hxhl[907] = 681620929;
        fj.hxhl[908] = 1962662221;
        fj.hxhl[909] = -15282057;
        fj.hxhl[910] = 2076030816;
        fj.hxhl[911] = 1422265115;
        fj.hxhl[912] = -386879919;
        fj.hxhl[913] = 328157560;
        fj.hxhl[914] = 1269936763;
        fj.hxhl[915] = -652639340;
        fj.hxhl[916] = -68260650;
        fj.hxhl[917] = 2107583088;
        fj.hxhl[918] = -967205496;
        fj.hxhl[919] = -1833683626;
        fj.hxhl[920] = -848764200;
        fj.hxhl[921] = -1572731191;
        fj.hxhl[922] = -1238564585;
        fj.hxhl[923] = -1188804060;
        fj.hxhl[924] = -1566204345;
        fj.hxhl[925] = 2065347424;
        fj.hxhl[926] = 1628939447;
        fj.hxhl[927] = -1935676926;
        fj.hxhl[928] = 970320960;
        fj.hxhl[929] = -1410486418;
        fj.hxhl[930] = 430885375;
        fj.hxhl[931] = -821867397;
        fj.hxhl[932] = 1890015234;
        fj.hxhl[933] = -1927910973;
        fj.hxhl[934] = -1528543954;
        fj.hxhl[935] = 469391781;
        fj.hxhl[936] = -1255326806;
        fj.hxhl[937] = -899130922;
        fj.hxhl[938] = -1863440344;
        fj.hxhl[939] = -181872577;
        fj.hxhl[940] = -1691906690;
        fj.hxhl[941] = -272056905;
        fj.hxhl[942] = -1384120626;
        fj.hxhl[943] = -1628805789;
        fj.hxhl[944] = 746682619;
        fj.hxhl[945] = -2012308036;
        fj.hxhl[946] = -1164328441;
        fj.hxhl[947] = 1420041762;
        fj.hxhl[948] = 967692621;
        fj.hxhl[949] = -1362434660;
        fj.hxhl[950] = 2141051789;
        fj.hxhl[951] = -1861364565;
        fj.hxhl[952] = 1710917975;
        fj.hxhl[953] = 1256061613;
        fj.hxhl[954] = -696176789;
        fj.hxhl[955] = -302303749;
        fj.hxhl[956] = 793174508;
        fj.hxhl[957] = 1267365335;
        fj.hxhl[958] = -1194903475;
        fj.hxhl[959] = -1362664306;
        fj.hxhl[960] = 1622483359;
        fj.hxhl[961] = -2043209939;
        fj.hxhl[962] = 205020439;
        fj.hxhl[963] = -1437139819;
        fj.hxhl[964] = -511289292;
        fj.hxhl[965] = -2142061037;
        fj.hxhl[966] = -1191174997;
        fj.hxhl[967] = -1989375249;
        fj.hxhl[968] = 729565707;
        fj.hxhl[969] = -150443455;
        fj.hxhl[970] = -454804426;
        fj.hxhl[971] = 17110805;
        fj.hxhl[972] = -991020191;
        fj.hxhl[973] = 1409646411;
        fj.hxhl[974] = 1138606890;
        fj.hxhl[975] = -287651832;
        fj.hxhl[976] = 1662873834;
        fj.hxhl[977] = -501828705;
        fj.hxhl[978] = 879398597;
        fj.hxhl[979] = 529272564;
        fj.hxhl[980] = -283943453;
        fj.hxhl[981] = 1483455357;
        fj.hxhl[982] = 1746560501;
        fj.hxhl[983] = 278428962;
        fj.hxhl[984] = 1381595755;
        fj.hxhl[985] = 616144053;
        fj.hxhl[986] = 1129135070;
        fj.hxhl[987] = 1837251704;
        fj.hxhl[988] = 930002198;
        fj.hxhl[989] = -1507768463;
        fj.hxhl[990] = 391782830;
        fj.hxhl[991] = -2049498487;
        fj.hxhl[992] = -936660616;
        fj.hxhl[993] = 1041202783;
        fj.hxhl[994] = -1532998051;
        fj.hxhl[995] = 1854749791;
        fj.hxhl[996] = -1340112269;
        fj.hxhl[997] = 1985618800;
        fj.hxhl[998] = -268001668;
        fj.hxhl[999] = 1276556;
    }

    private static /* synthetic */ void iaej() {
        fj.hxhl[600] = -1064714523;
        fj.hxhl[601] = 1934261488;
        fj.hxhl[602] = -201410922;
        fj.hxhl[603] = -1303790791;
        fj.hxhl[604] = 1078620117;
        fj.hxhl[605] = 468706712;
        fj.hxhl[606] = -1264998856;
        fj.hxhl[607] = 1043361824;
        fj.hxhl[608] = -242467973;
        fj.hxhl[609] = -1179646708;
        fj.hxhl[610] = 840641700;
        fj.hxhl[611] = 2080998071;
        fj.hxhl[612] = 1404220728;
        fj.hxhl[613] = -136035490;
        fj.hxhl[614] = -423768515;
        fj.hxhl[615] = 773695252;
        fj.hxhl[616] = -512484934;
        fj.hxhl[617] = 1355850023;
        fj.hxhl[618] = 417463994;
        fj.hxhl[619] = -302863302;
        fj.hxhl[620] = 162092966;
        fj.hxhl[621] = -895313874;
        fj.hxhl[622] = 1476445892;
        fj.hxhl[623] = 2133992349;
        fj.hxhl[624] = -2067107288;
        fj.hxhl[625] = 808773849;
        fj.hxhl[626] = 807324981;
        fj.hxhl[627] = -1352281825;
        fj.hxhl[628] = 1089739857;
        fj.hxhl[629] = 1058443201;
        fj.hxhl[630] = -275073551;
        fj.hxhl[631] = 100383615;
        fj.hxhl[632] = 516725329;
        fj.hxhl[633] = 1735617986;
        fj.hxhl[634] = 1231883748;
        fj.hxhl[635] = 851315288;
        fj.hxhl[636] = -1066712127;
        fj.hxhl[637] = 123823114;
        fj.hxhl[638] = 1822373248;
        fj.hxhl[639] = -1660349859;
        fj.hxhl[640] = 1237791624;
        fj.hxhl[641] = -637737116;
        fj.hxhl[642] = -333316564;
        fj.hxhl[643] = 1707880646;
        fj.hxhl[644] = -1922629747;
        fj.hxhl[645] = 1072451859;
        fj.hxhl[646] = -1887178971;
        fj.hxhl[647] = 805855644;
        fj.hxhl[648] = 827623607;
        fj.hxhl[649] = 848392053;
        fj.hxhl[650] = 412247454;
        fj.hxhl[651] = -783700904;
        fj.hxhl[652] = -1393215486;
        fj.hxhl[653] = 27597227;
        fj.hxhl[654] = -487586572;
        fj.hxhl[655] = -1010380458;
        fj.hxhl[656] = -107463239;
        fj.hxhl[657] = 1416679062;
        fj.hxhl[658] = 1683892327;
        fj.hxhl[659] = -1734027581;
        fj.hxhl[660] = -1567513615;
        fj.hxhl[661] = 2023136221;
        fj.hxhl[662] = 1444826593;
        fj.hxhl[663] = 1620205556;
        fj.hxhl[664] = -674083524;
        fj.hxhl[665] = -2137532054;
        fj.hxhl[666] = 1017883229;
        fj.hxhl[667] = -708253119;
        fj.hxhl[668] = -598069782;
        fj.hxhl[669] = -2008058398;
        fj.hxhl[670] = 442261247;
        fj.hxhl[671] = 851467223;
        fj.hxhl[672] = -773629971;
        fj.hxhl[673] = 496819350;
        fj.hxhl[674] = 243073129;
        fj.hxhl[675] = -557612347;
        fj.hxhl[676] = -2114344023;
        fj.hxhl[677] = 63486222;
        fj.hxhl[678] = 477128232;
        fj.hxhl[679] = 727345872;
        fj.hxhl[680] = 1939620399;
        fj.hxhl[681] = -1862461277;
        fj.hxhl[682] = 814281762;
        fj.hxhl[683] = 493465212;
        fj.hxhl[684] = -926751632;
        fj.hxhl[685] = -1027690227;
        fj.hxhl[686] = 32494831;
        fj.hxhl[687] = -382458954;
        fj.hxhl[688] = 166929184;
        fj.hxhl[689] = -1130270229;
        fj.hxhl[690] = 2144871183;
        fj.hxhl[691] = -1192544968;
        fj.hxhl[692] = 2048768111;
        fj.hxhl[693] = 820148826;
        fj.hxhl[694] = -2096235943;
        fj.hxhl[695] = 658067724;
        fj.hxhl[696] = 327363489;
        fj.hxhl[697] = 1653350338;
        fj.hxhl[698] = 239987988;
        fj.hxhl[699] = -1852953588;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fj() {
        var2_1 /* !! */  = fj.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("RegionExploit", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u0440\u0435\u0433\u0438\u043e\u043d\u0430 \u043a\u043e\u0433\u0434\u0430 \u0432\u044b \u0432 KT", du.PLAYER);
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "", "\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c", new String[]{"\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c", "\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c"});
                this.regionRadius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441 \u0440\u0435\u0433\u0438\u043e\u043d\u0430", "", (float)fj.hxhn("hxho", hxhk(int ), (int)0)).range((int)fj.hxhn("hxhq", hxhp(int ), (int)1), (int)fj.hxhn("hxhr", hxhp(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fj)this));
                this.sendKey = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0438", "").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((fj)this));
                this.commandQueue = new ArrayDeque<String>();
                this.lastSendTime = (long)fj.hxhn("hxhv", hxhs(int ), (int)0);
                this.messageQueue = new ArrayDeque<String>();
                this.settings(new jx[]{this.mode, this.regionRadius, this.sendKey});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fj.hxhn("hxhw", hxhp(int ), (int)3);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)fj.hxhn("hxhx", hxhp(int ), (int)4);
                ** GOTO lbl35
            }
lbl20:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fj.hxhn("hxhy", hxhp(int ), (int)5);
            }
            case 3: {
                var2_1 /* !! */  = (int)fj.hxhn("hxhz", hxhp(int ), (int)6);
                ** GOTO lbl32
            }
lbl25:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fj.hxhn("hxia", hxhp(int ), (int)7);
                    ** GOTO lbl20
                    break;
                }
            }
lbl29:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)fj.hxhn("hxib", hxhp(int ), (int)8);
                ** GOTO lbl25
            }
lbl32:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)fj.hxhn("hxic", hxhp(int ), (int)9);
                ** GOTO lbl29
            }
lbl35:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)fj.hxhn("hxid", hxhp(int ), (int)10);
            }
            case 8: {
                var2_1 /* !! */  = (int)fj.hxhn("hxie", hxhp(int ), (int)11);
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)fj.hxhn("hxif", hxhp(int ), (int)12);
        ** while (true)
    }

    private static /* synthetic */ void iagt() {
        fj.hxht[200] = 2051900048780432111L;
        fj.hxht[201] = 1621305368999524888L;
        fj.hxht[202] = 6452854940670704106L;
        fj.hxht[203] = 7836839239576515146L;
        fj.hxht[204] = 6211845278385563068L;
        fj.hxht[205] = 1920390505078784300L;
        fj.hxht[206] = -4000252065986185107L;
        fj.hxht[207] = 2173331579987234672L;
        fj.hxht[208] = 7428717772466216750L;
        fj.hxht[209] = -8293306025540304874L;
        fj.hxht[210] = 6906554335947248379L;
        fj.hxht[211] = -670179168573142514L;
        fj.hxht[212] = -5171930697861282606L;
        fj.hxht[213] = -9038863833156659842L;
        fj.hxht[214] = -5451950699513179346L;
        fj.hxht[215] = 9175290825189203603L;
        fj.hxht[216] = 5453740877110987276L;
        fj.hxht[217] = 235390979343338607L;
        fj.hxht[218] = -8449797655820923733L;
        fj.hxht[219] = -5155581213271621817L;
        fj.hxht[220] = 8136864604187231217L;
        fj.hxht[221] = -83535522872070216L;
        fj.hxht[222] = -8485025581532781595L;
        fj.hxht[223] = 7104758118063239326L;
        fj.hxht[224] = 131303011630671615L;
        fj.hxht[225] = 860283322025153529L;
        fj.hxht[226] = -7688660020430183709L;
        fj.hxht[227] = 3520781023158452582L;
        fj.hxht[228] = -9052756059271241179L;
        fj.hxht[229] = -4737340044634974219L;
        fj.hxht[230] = 4540505614476206379L;
        fj.hxht[231] = -2711652300308719067L;
        fj.hxht[232] = -8984559054162888839L;
        fj.hxht[233] = 5426386349554620173L;
        fj.hxht[234] = 5488274571336036595L;
        fj.hxht[235] = -2713855793963804489L;
        fj.hxht[236] = -6626994685974235237L;
        fj.hxht[237] = 3055229409222207346L;
        fj.hxht[238] = -2340009760185548612L;
        fj.hxht[239] = -246226304768504135L;
        fj.hxht[240] = 5591842814000186168L;
        fj.hxht[241] = 2882180371420633045L;
        fj.hxht[242] = -7562844106765340047L;
        fj.hxht[243] = 1295158005668430180L;
        fj.hxht[244] = -8785909537996152807L;
        fj.hxht[245] = 6627583381140059565L;
        fj.hxht[246] = 4058922145942416585L;
        fj.hxht[247] = -3265044536512928720L;
        fj.hxht[248] = 3060815167704234403L;
        fj.hxht[249] = -2119986187962559098L;
        fj.hxht[250] = 1587005069543658063L;
        fj.hxht[251] = -5169178824737279540L;
        fj.hxht[252] = 3926279507574909629L;
        fj.hxht[253] = 1362689720847726185L;
        fj.hxht[254] = 950779901989297520L;
        fj.hxht[255] = -4273698549509555488L;
        fj.hxht[256] = 6063872115021414444L;
        fj.hxht[257] = -7885625601329738010L;
        fj.hxht[258] = 1277988549052226823L;
        fj.hxht[259] = -7406247565670215384L;
        fj.hxht[260] = -4708906665615904581L;
        fj.hxht[261] = -455792629504400418L;
        fj.hxht[262] = -7541718391495241600L;
        fj.hxht[263] = 2949376311414473966L;
        fj.hxht[264] = -3705394940178263012L;
        fj.hxht[265] = -1002823140555573282L;
        fj.hxht[266] = 5021467801880114634L;
        fj.hxht[267] = -1021979071510190570L;
        fj.hxht[268] = 8046873220634084397L;
        fj.hxht[269] = -8299747091026567015L;
        fj.hxht[270] = 6275837922214164523L;
        fj.hxht[271] = -1780501650181273838L;
        fj.hxht[272] = 8620711349154005949L;
        fj.hxht[273] = 7527896256926728798L;
        fj.hxht[274] = 624365715818954282L;
        fj.hxht[275] = 1658061081648646827L;
        fj.hxht[276] = -3752553462445267172L;
        fj.hxht[277] = 1434409556803152607L;
        fj.hxht[278] = -4350422110857170709L;
        fj.hxht[279] = 1587856135263027796L;
        fj.hxht[280] = -635223518237512123L;
        fj.hxht[281] = 7459983023784490755L;
        fj.hxht[282] = 94352162359014821L;
        fj.hxht[283] = 3303896021504665048L;
        fj.hxht[284] = -2161752958354193198L;
        fj.hxht[285] = 9222010026447582595L;
        fj.hxht[286] = 6670612043155298387L;
        fj.hxht[287] = -2680794845527663189L;
        fj.hxht[288] = -3990298250346267362L;
        fj.hxht[289] = 3554033544194439775L;
        fj.hxht[290] = 5208784808516460286L;
        fj.hxht[291] = 794434793581263617L;
        fj.hxht[292] = 7596903437030391532L;
        fj.hxht[293] = -7295279974174832607L;
        fj.hxht[294] = 1807600130712205441L;
        fj.hxht[295] = -4179370232374745124L;
        fj.hxht[296] = 5578003604888508039L;
        fj.hxht[297] = 8319077168861950698L;
        fj.hxht[298] = 7276744450833113915L;
        fj.hxht[299] = 3469430107123977178L;
    }

    private static /* synthetic */ void iagh() {
        fj.hxhm[1100] = -742217873;
        fj.hxhm[1101] = 309135127;
        fj.hxhm[1102] = 1066655056;
        fj.hxhm[1103] = 756425939;
        fj.hxhm[1104] = 1716925872;
        fj.hxhm[1105] = 655440004;
        fj.hxhm[1106] = 565049246;
        fj.hxhm[1107] = 1772875262;
        fj.hxhm[1108] = 947293142;
        fj.hxhm[1109] = -2070508709;
        fj.hxhm[1110] = -379265567;
        fj.hxhm[1111] = 1146581123;
        fj.hxhm[1112] = -1533100644;
        fj.hxhm[1113] = 254337989;
        fj.hxhm[1114] = 96422480;
        fj.hxhm[1115] = 1015220052;
        fj.hxhm[1116] = -2141128398;
        fj.hxhm[1117] = -773194081;
        fj.hxhm[1118] = 2009696707;
        fj.hxhm[1119] = -992751373;
        fj.hxhm[1120] = -86473321;
        fj.hxhm[1121] = 356774876;
        fj.hxhm[1122] = -1008191960;
        fj.hxhm[1123] = 2080396704;
        fj.hxhm[1124] = 1268882399;
        fj.hxhm[1125] = -1062235448;
        fj.hxhm[1126] = 2003407821;
        fj.hxhm[1127] = -1149800435;
        fj.hxhm[1128] = -23172709;
        fj.hxhm[1129] = 1386861329;
        fj.hxhm[1130] = 1841195081;
        fj.hxhm[1131] = 206026226;
        fj.hxhm[1132] = -2034481419;
        fj.hxhm[1133] = -996225938;
        fj.hxhm[1134] = -1107286064;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void handleClient() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("hxvl", hxhs(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fj.hxhn("hxvm", hxhp(int ), (int)216)) break;
            v0 /* !! */  = (long)fj.hxhn("hxvn", hxhp(int ), (int)217);
        }
        var5_1 = fj.c;
        v1 /* !! */  = fj.pb;
        block53: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1518949128: {
                    break block53;
                }
                case -1479742568: {
                    v2 = fj.hxhn("hxvp", hxhs(int ), (int)143);
lbl14:
                    // 3 sources

                    while (true) {
                        v1 /* !! */  = (long)(v2 - fj.hxhn("hxvo", hxhs(int ), (int)142));
                        continue block53;
                        break;
                    }
                }
                case 663506796: {
                    v2 = fj.hxhn("hxvq", hxhs(int ), (int)144);
                    ** GOTO lbl14
                }
                case 1445136020: {
                    v2 = fj.hxhn("hxvr", hxhs(int ), (int)145);
                    ** continue;
                }
            }
            break;
        }
        var4_2 /* !! */  = fj.b;
        v3 /* !! */  = fj.pb;
        block55: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1518949128: {
                    break block55;
                }
                case -231450657: {
                    v4 = fj.hxhn("hxvt", hxhs(int ), (int)147);
lbl31:
                    // 2 sources

                    while (true) {
                        v3 /* !! */  = (long)(v4 - fj.hxhn("hxvs", hxhs(int ), (int)146));
                        continue block55;
                        break;
                    }
                }
                case 1652620226: {
                    v4 = fj.hxhn("hxvu", hxhs(int ), (int)148);
                    ** continue;
                }
            }
            break;
        }
        var3_3 = fj.a;
        if (var5_1) {
            throw null;
        }
        if (var3_3 || var3_3) return;
        v5 /* !! */  = fj.pb;
        block57: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -1805687220: {
                    v6 = fj.hxhn("hxvw", hxhs(int ), (int)150);
lbl46:
                    // 3 sources

                    while (true) {
                        v5 /* !! */  = (long)(v6 - fj.hxhn("hxvv", hxhs(int ), (int)149));
                        continue block57;
                        break;
                    }
                }
                case -1518949128: {
                    break block57;
                }
                case -1350282061: {
                    v6 = fj.hxhn("hxvx", hxhs(int ), (int)151);
                    ** GOTO lbl46
                }
                case 1364801944: {
                    v6 = fj.hxhn("hxvy", hxhs(int ), (int)152);
                    ** continue;
                }
            }
            break;
        }
        v7 /* !! */  = fj.pb;
        block59: while (true) {
            switch ((int)v7 /* !! */ ) {
                case -1518949128: {
                    break block59;
                }
                case 1078558979: {
                    v7 /* !! */  = (long)(fj.hxhn("hxwa", hxhs(int ), (int)154) - fj.hxhn("hxvz", hxhs(int ), (int)153));
                    continue block59;
                }
            }
            break;
        }
        v8 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$handleClient$3(), ()V)((fj)this);
        v9 /* !! */  = fj.pb;
        block60: while (true) {
            switch ((int)v9 /* !! */ ) {
                case -1518949128: {
                    break block60;
                }
                case -927971469: {
                    v10 = fj.hxhn("hxwc", hxhs(int ), (int)156);
lbl73:
                    // 2 sources

                    while (true) {
                        v9 /* !! */  = (long)(v10 - fj.hxhn("hxwb", hxhs(int ), (int)155));
                        continue block60;
                        break;
                    }
                }
                case -269785638: {
                    v10 = fj.hxhn("hxwd", hxhs(int ), (int)157);
                    ** continue;
                }
            }
            break;
        }
        v11 = new Thread(v8);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("hxwe", hxhs(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == fj.hxhn("hxwf", hxhp(int ), (int)218)) {
                v11.start();
                if (var3_3) return;
                break;
            }
            v12 /* !! */  = (long)fj.hxhn("hxwg", hxhp(int ), (int)219);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block63: do {
            switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3) return;
                    var1_4 = this;
                    synchronized (var1_4) {
                        if (var3_3) return;
                        try {
                            if (var3_3) return;
                            while (true) {
                                if ((v13 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("hxwh", hxhs(int ), (int)159)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                if (v13 /* !! */  != fj.hxhn("hxwi", hxhp(int ), (int)220)) ** GOTO lbl105
                                if (!this.clientConnected) {
                                    break;
                                }
                                ** GOTO lbl117
lbl105:
                                // 1 sources

                                v13 /* !! */  = (long)fj.hxhn("hxwj", hxhp(int ), (int)221);
                            }
                            if (var3_3 || var3_3) return;
                            v14 = fj.hxhn("hxwk", hxhp(int ), (int)222);
                            while (true) {
                                if ((v15 /* !! */  = (cfr_temp_4 = fj.pb - fj.hxhn("hxwl", hxhs(int ), (int)160)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                                if (v15 /* !! */  == fj.hxhn("hxwm", hxhp(int ), (int)223)) {
                                    this.clientConnected = v14;
                                    if (var3_3) return;
                                    break;
                                }
                                v15 /* !! */  = (long)fj.hxhn("hxwn", hxhp(int ), (int)224);
                            }
lbl117:
                            // 2 sources

                            if (var3_3 || var3_3) return;
                            // MONITOREXIT @DISABLED, blocks:[0, 1, 28, 29, 63] lbl123 : MonitorExitStatement: MONITOREXIT : var1_4
                            if (var3_3 || var3_3) return;
                            if (var5_1) {
                                throw null;
                            }
                        }
                        catch (Throwable var2_5) {
                            if (var3_3) return;
                            // MONITOREXIT @DISABLED, blocks:[1, 51, 28, 29, 63] lbl129 : MonitorExitStatement: MONITOREXIT : var1_4
                            if (var3_3 || var3_3) return;
                            throw var2_5;
                        }
                    }
                    if (!var3_3 && !var3_3) return;
                    return;
                }
                case 0: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwo", hxhp(int ), (int)225);
                    cfr_temp_0 = 2;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 1: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwp", hxhp(int ), (int)226);
                    cfr_temp_0 = 11;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 2: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwq", hxhp(int ), (int)227);
                    cfr_temp_0 = 0;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 3: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwr", hxhp(int ), (int)228);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 4: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxws", hxhp(int ), (int)229);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 5: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwt", hxhp(int ), (int)230);
                    cfr_temp_0 = 15;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 6: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwu", hxhp(int ), (int)231);
                    cfr_temp_0 = 3;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 7: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwv", hxhp(int ), (int)232);
                    cfr_temp_0 = 0;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 8: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxww", hxhp(int ), (int)233);
                    cfr_temp_0 = 11;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 9: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwx", hxhp(int ), (int)234);
                    cfr_temp_0 = 19;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 10: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwy", hxhp(int ), (int)235);
                    cfr_temp_0 = 3;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 11: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxwz", hxhp(int ), (int)236);
                    cfr_temp_0 = 1;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 12: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxa", hxhp(int ), (int)237);
                    cfr_temp_0 = 17;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 13: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxb", hxhp(int ), (int)238);
                    cfr_temp_0 = 15;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 14: {
                    do {
                        var4_2 /* !! */  = (int)fj.hxhn("hxxc", hxhp(int ), (int)239);
                    } while (!var5_1);
                    throw null;
                }
                case 15: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)fj.hxhn("hxxd", hxhp(int ), (int)240);
                        cfr_temp_0 = 5;
                        if (!var5_1) continue block63;
                        throw null;
                    }
                }
                case 16: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxe", hxhp(int ), (int)241);
                    if (!var5_1) break;
                    throw null;
                }
                case 17: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxf", hxhp(int ), (int)242);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 18: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxg", hxhp(int ), (int)243);
                    cfr_temp_0 = 6;
                    if (!var5_1) continue block63;
                    throw null;
                }
                case 19: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxxh", hxhp(int ), (int)244);
                    if (!var5_1) break;
                    throw null;
                }
                case 20: 
            }
            break;
        } while (true);
        var4_2 /* !! */  = (int)fj.hxhn("hxxi", hxhp(int ), (int)245);
        ** while (!var5_1)
lbl233:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hxhs(int n2) {
        return hxht[n2] ^ hxhu[n2];
    }

    private static /* synthetic */ void iadv() {
        fj.hxhl[100] = 2107895187;
        fj.hxhl[101] = -290298984;
        fj.hxhl[102] = 556096469;
        fj.hxhl[103] = -907521652;
        fj.hxhl[104] = -1986990283;
        fj.hxhl[105] = -1376402464;
        fj.hxhl[106] = -178972554;
        fj.hxhl[107] = 954905067;
        fj.hxhl[108] = -1891991162;
        fj.hxhl[109] = 703732488;
        fj.hxhl[110] = -888983538;
        fj.hxhl[111] = 589434201;
        fj.hxhl[112] = -75864120;
        fj.hxhl[113] = 1986230300;
        fj.hxhl[114] = 1078650600;
        fj.hxhl[115] = 162998587;
        fj.hxhl[116] = 1401175856;
        fj.hxhl[117] = -1882286126;
        fj.hxhl[118] = -193863048;
        fj.hxhl[119] = 1022891259;
        fj.hxhl[120] = 197539723;
        fj.hxhl[121] = -437222397;
        fj.hxhl[122] = -1914392555;
        fj.hxhl[123] = 573954102;
        fj.hxhl[124] = -1223054414;
        fj.hxhl[125] = -566509114;
        fj.hxhl[126] = -348801854;
        fj.hxhl[127] = -1180084505;
        fj.hxhl[128] = -1925388084;
        fj.hxhl[129] = -1200226220;
        fj.hxhl[130] = -553540186;
        fj.hxhl[131] = -2103100192;
        fj.hxhl[132] = -1312894417;
        fj.hxhl[133] = -689836744;
        fj.hxhl[134] = 1200042674;
        fj.hxhl[135] = -1089447565;
        fj.hxhl[136] = -1520796701;
        fj.hxhl[137] = -729478926;
        fj.hxhl[138] = 701370170;
        fj.hxhl[139] = 248308469;
        fj.hxhl[140] = -1913160467;
        fj.hxhl[141] = -1008051751;
        fj.hxhl[142] = 2132778634;
        fj.hxhl[143] = 1777340004;
        fj.hxhl[144] = -401467682;
        fj.hxhl[145] = 457718085;
        fj.hxhl[146] = 919393783;
        fj.hxhl[147] = -1827853891;
        fj.hxhl[148] = 450942636;
        fj.hxhl[149] = -593864797;
        fj.hxhl[150] = 2064113093;
        fj.hxhl[151] = -1322301834;
        fj.hxhl[152] = -324551008;
        fj.hxhl[153] = 403184435;
        fj.hxhl[154] = 2116929497;
        fj.hxhl[155] = 799517752;
        fj.hxhl[156] = 566487188;
        fj.hxhl[157] = 1628000220;
        fj.hxhl[158] = 1207681128;
        fj.hxhl[159] = 2035816929;
        fj.hxhl[160] = 1644685019;
        fj.hxhl[161] = 800642740;
        fj.hxhl[162] = 1738145402;
        fj.hxhl[163] = -1489599540;
        fj.hxhl[164] = 914718146;
        fj.hxhl[165] = -2135483465;
        fj.hxhl[166] = 1491696408;
        fj.hxhl[167] = 1005371212;
        fj.hxhl[168] = 1337368672;
        fj.hxhl[169] = -387788866;
        fj.hxhl[170] = -1938660952;
        fj.hxhl[171] = 255160823;
        fj.hxhl[172] = 244623217;
        fj.hxhl[173] = -440704941;
        fj.hxhl[174] = -844420641;
        fj.hxhl[175] = -1804379478;
        fj.hxhl[176] = 1179385723;
        fj.hxhl[177] = -339209471;
        fj.hxhl[178] = 2049443941;
        fj.hxhl[179] = 1612566902;
        fj.hxhl[180] = -233478341;
        fj.hxhl[181] = -2013679032;
        fj.hxhl[182] = 1291890597;
        fj.hxhl[183] = 1826813963;
        fj.hxhl[184] = 562853831;
        fj.hxhl[185] = 640229207;
        fj.hxhl[186] = 843650341;
        fj.hxhl[187] = -638807551;
        fj.hxhl[188] = 530663003;
        fj.hxhl[189] = 278778848;
        fj.hxhl[190] = -1778813326;
        fj.hxhl[191] = -1377632715;
        fj.hxhl[192] = 254493387;
        fj.hxhl[193] = 1904962720;
        fj.hxhl[194] = 1216636037;
        fj.hxhl[195] = 1114606299;
        fj.hxhl[196] = -1247309631;
        fj.hxhl[197] = -422825570;
        fj.hxhl[198] = 1916280351;
        fj.hxhl[199] = -1393409847;
    }

    /*
     * Exception decompiling
     */
    private void closeSenderSocket() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 19[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iaeq() {
        fj.hxhl[800] = 752287984;
        fj.hxhl[801] = 54201328;
        fj.hxhl[802] = 803092124;
        fj.hxhl[803] = 347149198;
        fj.hxhl[804] = -1410948358;
        fj.hxhl[805] = 186390889;
        fj.hxhl[806] = 1248862361;
        fj.hxhl[807] = -2081524046;
        fj.hxhl[808] = 294356603;
        fj.hxhl[809] = -157154606;
        fj.hxhl[810] = 990600409;
        fj.hxhl[811] = 1284506324;
        fj.hxhl[812] = -1976354827;
        fj.hxhl[813] = -361042921;
        fj.hxhl[814] = -1636355450;
        fj.hxhl[815] = -173324822;
        fj.hxhl[816] = 927261739;
        fj.hxhl[817] = 770141049;
        fj.hxhl[818] = -1978435494;
        fj.hxhl[819] = 527527802;
        fj.hxhl[820] = -1055948978;
        fj.hxhl[821] = 421550647;
        fj.hxhl[822] = -1684891479;
        fj.hxhl[823] = -693724483;
        fj.hxhl[824] = 28987881;
        fj.hxhl[825] = -1481030619;
        fj.hxhl[826] = 1520671692;
        fj.hxhl[827] = -1597001066;
        fj.hxhl[828] = 1676738095;
        fj.hxhl[829] = 1204090459;
        fj.hxhl[830] = 490565481;
        fj.hxhl[831] = 557976648;
        fj.hxhl[832] = 1510036629;
        fj.hxhl[833] = 114684049;
        fj.hxhl[834] = 1553717796;
        fj.hxhl[835] = 1817059908;
        fj.hxhl[836] = -1229813970;
        fj.hxhl[837] = -1890795149;
        fj.hxhl[838] = 1427232177;
        fj.hxhl[839] = -311357180;
        fj.hxhl[840] = 1166185601;
        fj.hxhl[841] = -1895658282;
        fj.hxhl[842] = -1663287671;
        fj.hxhl[843] = -1240549007;
        fj.hxhl[844] = 1836055121;
        fj.hxhl[845] = -1401010975;
        fj.hxhl[846] = 22744964;
        fj.hxhl[847] = -974082459;
        fj.hxhl[848] = 842622231;
        fj.hxhl[849] = -1718551612;
        fj.hxhl[850] = 1244038848;
        fj.hxhl[851] = -1776558221;
        fj.hxhl[852] = -20913724;
        fj.hxhl[853] = 141891413;
        fj.hxhl[854] = -2099398818;
        fj.hxhl[855] = -512144615;
        fj.hxhl[856] = -726151491;
        fj.hxhl[857] = -1498502946;
        fj.hxhl[858] = -684342826;
        fj.hxhl[859] = 924020887;
        fj.hxhl[860] = 1603384827;
        fj.hxhl[861] = -9459123;
        fj.hxhl[862] = -1157463299;
        fj.hxhl[863] = 256039556;
        fj.hxhl[864] = 760685413;
        fj.hxhl[865] = 2093520500;
        fj.hxhl[866] = 228684625;
        fj.hxhl[867] = -1280184487;
        fj.hxhl[868] = 748191417;
        fj.hxhl[869] = 1208021268;
        fj.hxhl[870] = 152988885;
        fj.hxhl[871] = -381721580;
        fj.hxhl[872] = 1262127864;
        fj.hxhl[873] = 389627971;
        fj.hxhl[874] = -1156205577;
        fj.hxhl[875] = 610634595;
        fj.hxhl[876] = 743518166;
        fj.hxhl[877] = 392848015;
        fj.hxhl[878] = -570198957;
        fj.hxhl[879] = -2013972643;
        fj.hxhl[880] = 1267350383;
        fj.hxhl[881] = -749452853;
        fj.hxhl[882] = -1695393059;
        fj.hxhl[883] = 2062031194;
        fj.hxhl[884] = -1554995180;
        fj.hxhl[885] = 1007200538;
        fj.hxhl[886] = -566419250;
        fj.hxhl[887] = -281641085;
        fj.hxhl[888] = 453805693;
        fj.hxhl[889] = -981056256;
        fj.hxhl[890] = 1448785599;
        fj.hxhl[891] = -1663035728;
        fj.hxhl[892] = 1444960599;
        fj.hxhl[893] = -2108289581;
        fj.hxhl[894] = 2129922258;
        fj.hxhl[895] = -2060611357;
        fj.hxhl[896] = 620625542;
        fj.hxhl[897] = 1870504602;
        fj.hxhl[898] = -1963094169;
        fj.hxhl[899] = -1305783217;
    }

    private static /* synthetic */ void iagj() {
        fj.hxht[0] = 2482990938076565890L;
        fj.hxht[1] = 5433414797470555149L;
        fj.hxht[2] = 8930170873050342110L;
        fj.hxht[3] = -4944930517178284677L;
        fj.hxht[4] = 1540460409093536789L;
        fj.hxht[5] = -1310835334009053620L;
        fj.hxht[6] = 2714144380539035493L;
        fj.hxht[7] = 532988746303965738L;
        fj.hxht[8] = 6475835178902516465L;
        fj.hxht[9] = 2626394131912742487L;
        fj.hxht[10] = 6794547847701174108L;
        fj.hxht[11] = 1573718370679994480L;
        fj.hxht[12] = -1435385593790964079L;
        fj.hxht[13] = 1602199348592262624L;
        fj.hxht[14] = 4877427027431554311L;
        fj.hxht[15] = 7740525540755039111L;
        fj.hxht[16] = -3653370792061749530L;
        fj.hxht[17] = 5600969707372616775L;
        fj.hxht[18] = 6174721435097162320L;
        fj.hxht[19] = -5624304070205733419L;
        fj.hxht[20] = -7169390043128482722L;
        fj.hxht[21] = 8740838648985592173L;
        fj.hxht[22] = -2562916980770184663L;
        fj.hxht[23] = -148185171713090856L;
        fj.hxht[24] = -6962135414117512465L;
        fj.hxht[25] = -2069613926276125250L;
        fj.hxht[26] = -3207505758751695790L;
        fj.hxht[27] = -7302347270153747092L;
        fj.hxht[28] = -7218764526343453076L;
        fj.hxht[29] = -1248271499918949005L;
        fj.hxht[30] = -1787572871387949520L;
        fj.hxht[31] = -2595177305606992270L;
        fj.hxht[32] = -4178207681453009899L;
        fj.hxht[33] = 5340307913538727068L;
        fj.hxht[34] = 4844514673206962607L;
        fj.hxht[35] = 4094970574844811136L;
        fj.hxht[36] = 7088195787019069992L;
        fj.hxht[37] = 3301123830835457418L;
        fj.hxht[38] = -363965690519312049L;
        fj.hxht[39] = -6497244935769826897L;
        fj.hxht[40] = -8924743482506095796L;
        fj.hxht[41] = 3116260564564008465L;
        fj.hxht[42] = 6082560751133096297L;
        fj.hxht[43] = 5867862769925141139L;
        fj.hxht[44] = -279767158013919189L;
        fj.hxht[45] = -2550643714070252106L;
        fj.hxht[46] = 4900408581852993592L;
        fj.hxht[47] = 5639995393637365542L;
        fj.hxht[48] = -7375607823712657691L;
        fj.hxht[49] = 7612231113701888753L;
        fj.hxht[50] = -8340600451377512466L;
        fj.hxht[51] = -8880387440852612848L;
        fj.hxht[52] = 1053311902530578111L;
        fj.hxht[53] = -1240064849912323348L;
        fj.hxht[54] = 2529888190843465971L;
        fj.hxht[55] = 7769290573059378753L;
        fj.hxht[56] = 1534681159628670822L;
        fj.hxht[57] = -4651992213772859475L;
        fj.hxht[58] = -6391561484544200412L;
        fj.hxht[59] = 516967888047272679L;
        fj.hxht[60] = 6217109079619314129L;
        fj.hxht[61] = -1432170623995651118L;
        fj.hxht[62] = -665958726207382737L;
        fj.hxht[63] = -768908323021676741L;
        fj.hxht[64] = -3289501702547667062L;
        fj.hxht[65] = -1119042223262393087L;
        fj.hxht[66] = -1766922873789548054L;
        fj.hxht[67] = -8560425147492940132L;
        fj.hxht[68] = -4715319149070500841L;
        fj.hxht[69] = 6787527636307198453L;
        fj.hxht[70] = -8801763490306031498L;
        fj.hxht[71] = -1016326193554526730L;
        fj.hxht[72] = -4940544818318253616L;
        fj.hxht[73] = -2671630337202154027L;
        fj.hxht[74] = 5211254106287171618L;
        fj.hxht[75] = 85311676053823329L;
        fj.hxht[76] = -9087436367995387294L;
        fj.hxht[77] = -1697841970863780763L;
        fj.hxht[78] = -6160387057944876779L;
        fj.hxht[79] = -5689642003209621821L;
        fj.hxht[80] = -7546126173202855001L;
        fj.hxht[81] = 3602855176427024416L;
        fj.hxht[82] = 1058966055031420241L;
        fj.hxht[83] = 5612636105176174212L;
        fj.hxht[84] = 6133538923563934764L;
        fj.hxht[85] = -1081540905437579730L;
        fj.hxht[86] = 3497115207868968438L;
        fj.hxht[87] = -6147329023383571186L;
        fj.hxht[88] = 419252085776683169L;
        fj.hxht[89] = -4618563262569948424L;
        fj.hxht[90] = 7675510537615065014L;
        fj.hxht[91] = 8427814295143731068L;
        fj.hxht[92] = 1062016847238163930L;
        fj.hxht[93] = -8830375083486268368L;
        fj.hxht[94] = 6955535574851540585L;
        fj.hxht[95] = -6904078860925613691L;
        fj.hxht[96] = 6678694895632148399L;
        fj.hxht[97] = 5786950176333714737L;
        fj.hxht[98] = 359300717048525079L;
        fj.hxht[99] = -128318884425172586L;
    }

    private static /* synthetic */ void iafb() {
        fj.hxhl[1100] = -742217866;
        fj.hxhl[1101] = 309135109;
        fj.hxhl[1102] = 1066655040;
        fj.hxhl[1103] = 756425942;
        fj.hxhl[1104] = 1716925882;
        fj.hxhl[1105] = 655440025;
        fj.hxhl[1106] = 565049230;
        fj.hxhl[1107] = 1772875263;
        fj.hxhl[1108] = 947293174;
        fj.hxhl[1109] = -2070508710;
        fj.hxhl[1110] = 404164365;
        fj.hxhl[1111] = -1146581124;
        fj.hxhl[1112] = 1361919926;
        fj.hxhl[1113] = -254337990;
        fj.hxhl[1114] = -1884101960;
        fj.hxhl[1115] = 1015220053;
        fj.hxhl[1116] = -897464743;
        fj.hxhl[1117] = -773194082;
        fj.hxhl[1118] = -360648597;
        fj.hxhl[1119] = -992751373;
        fj.hxhl[1120] = -86473322;
        fj.hxhl[1121] = 356774879;
        fj.hxhl[1122] = -1008191957;
        fj.hxhl[1123] = -2080396705;
        fj.hxhl[1124] = 920547547;
        fj.hxhl[1125] = -1062235447;
        fj.hxhl[1126] = -1437554795;
        fj.hxhl[1127] = 1149800434;
        fj.hxhl[1128] = 1540548508;
        fj.hxhl[1129] = -1386861330;
        fj.hxhl[1130] = 1580227227;
        fj.hxhl[1131] = 206026227;
        fj.hxhl[1132] = -2034481420;
        fj.hxhl[1133] = -996225939;
        fj.hxhl[1134] = -1107286062;
    }

    private static /* synthetic */ float hxhk(int n2) {
        return Float.intBitsToFloat(hxhl[n2] ^ hxhm[n2]);
    }

    private static /* synthetic */ void iafd() {
        fj.hxhm[0] = -1674526460;
        fj.hxhm[1] = 1412403134;
        fj.hxhm[2] = -1906066224;
        fj.hxhm[3] = 1113136794;
        fj.hxhm[4] = -1433555579;
        fj.hxhm[5] = 977457537;
        fj.hxhm[6] = 2091929148;
        fj.hxhm[7] = 1681124493;
        fj.hxhm[8] = 1681201155;
        fj.hxhm[9] = -522168165;
        fj.hxhm[10] = -605319885;
        fj.hxhm[11] = 464955802;
        fj.hxhm[12] = -1845081701;
        fj.hxhm[13] = -1685191944;
        fj.hxhm[14] = -14794587;
        fj.hxhm[15] = 1386822626;
        fj.hxhm[16] = -1540088520;
        fj.hxhm[17] = 613131296;
        fj.hxhm[18] = 2146442642;
        fj.hxhm[19] = 76201375;
        fj.hxhm[20] = -885736026;
        fj.hxhm[21] = 2020344491;
        fj.hxhm[22] = -1260543796;
        fj.hxhm[23] = -2088206886;
        fj.hxhm[24] = 171554362;
        fj.hxhm[25] = -991756264;
        fj.hxhm[26] = -2003901578;
        fj.hxhm[27] = 876251147;
        fj.hxhm[28] = -2014571457;
        fj.hxhm[29] = 755240402;
        fj.hxhm[30] = -875402614;
        fj.hxhm[31] = 1843210521;
        fj.hxhm[32] = -425771710;
        fj.hxhm[33] = -1071135855;
        fj.hxhm[34] = 1191413601;
        fj.hxhm[35] = -609681281;
        fj.hxhm[36] = -2020433016;
        fj.hxhm[37] = -1684145015;
        fj.hxhm[38] = 273501669;
        fj.hxhm[39] = 1626896105;
        fj.hxhm[40] = 289679966;
        fj.hxhm[41] = 1098382685;
        fj.hxhm[42] = -1276473264;
        fj.hxhm[43] = 967874194;
        fj.hxhm[44] = 1900385570;
        fj.hxhm[45] = -91878704;
        fj.hxhm[46] = -73083765;
        fj.hxhm[47] = -2063692084;
        fj.hxhm[48] = -739134267;
        fj.hxhm[49] = 799450191;
        fj.hxhm[50] = -2089159120;
        fj.hxhm[51] = -1642391484;
        fj.hxhm[52] = 1904897515;
        fj.hxhm[53] = -1302161177;
        fj.hxhm[54] = 987390904;
        fj.hxhm[55] = -623650839;
        fj.hxhm[56] = 2003574031;
        fj.hxhm[57] = 1653285729;
        fj.hxhm[58] = 1411407438;
        fj.hxhm[59] = -1514455595;
        fj.hxhm[60] = -215046544;
        fj.hxhm[61] = -826099673;
        fj.hxhm[62] = 2140567217;
        fj.hxhm[63] = -78859220;
        fj.hxhm[64] = -972134652;
        fj.hxhm[65] = -644426452;
        fj.hxhm[66] = -966006453;
        fj.hxhm[67] = 1763822501;
        fj.hxhm[68] = -1774272339;
        fj.hxhm[69] = -74683383;
        fj.hxhm[70] = -494262398;
        fj.hxhm[71] = -1095816120;
        fj.hxhm[72] = -1134774870;
        fj.hxhm[73] = 998656616;
        fj.hxhm[74] = -131521971;
        fj.hxhm[75] = 1691963001;
        fj.hxhm[76] = 866862927;
        fj.hxhm[77] = 461317285;
        fj.hxhm[78] = -1916458487;
        fj.hxhm[79] = 137183284;
        fj.hxhm[80] = -399864840;
        fj.hxhm[81] = 1795630769;
        fj.hxhm[82] = 1173518220;
        fj.hxhm[83] = 2072640153;
        fj.hxhm[84] = -1456099269;
        fj.hxhm[85] = -1114689734;
        fj.hxhm[86] = -1850232198;
        fj.hxhm[87] = -1429533781;
        fj.hxhm[88] = 1231247196;
        fj.hxhm[89] = 378149128;
        fj.hxhm[90] = 1121585367;
        fj.hxhm[91] = 1456314452;
        fj.hxhm[92] = -2144923899;
        fj.hxhm[93] = -888228182;
        fj.hxhm[94] = -123037806;
        fj.hxhm[95] = -1862985797;
        fj.hxhm[96] = -899066738;
        fj.hxhm[97] = 2042670604;
        fj.hxhm[98] = 1963416300;
        fj.hxhm[99] = 849354227;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int calculateNewRadius(int var1_1) {
        block79: {
            block78: {
                var13_2 = fj.c;
                var12_3 /* !! */  = fj.b;
                var11_4 = fj.a;
                if (var13_2) {
                    throw null;
lbl6:
                    // 21 sources

                    return (int)fj.hxhn("hzba", hxhp(int ), (int)599);
                }
                if (var11_4 || var11_4) ** GOTO lbl6
                if (this.lastReceivedMessage == null) break block78;
                if (var11_4) ** GOTO lbl6
                if (this.lastReceivedMessage.has("position")) break block79;
                if (var11_4) ** GOTO lbl6
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            return (int)fj.hxhn("hzbb", hxhp(int ), (int)600);
        }
        if (var11_4 || var11_4) ** GOTO lbl6
        var2_5 = this.lastReceivedMessage.getAsJsonObject("position");
        if (var11_4 || var11_4) ** GOTO lbl6
        var3_6 = var2_5.get("x").getAsInt();
        if (var11_4) ** GOTO lbl6
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_4) ** GOTO lbl6
                var4_7 = var2_5.get("z").getAsInt();
                if (var11_4 || var11_4) ** GOTO lbl6
                var5_8 = this.currentRadius;
                if (var11_4) ** GOTO lbl6
                do {
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var5_8 < fj.hxhn("hzbc", hxhp(int ), (int)601)) ** GOTO lbl52
                    if (var11_4 || var11_4) ** GOTO lbl6
                    --var5_8;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var6_9 = var3_6 - var5_8;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var7_10 = var4_7 - var5_8;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var8_11 = var3_6 + var5_8;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var9_12 = var4_7 + var5_8;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var10_13 = (var8_11 - var6_9 + fj.hxhn("hzbd", hxhp(int ), (int)602)) * (var9_12 - var7_10 + fj.hxhn("hzbe", hxhp(int ), (int)603)) * fj.hxhn("hzbf", hxhp(int ), (int)604);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var10_13 > var1_1) ** GOTO lbl49
                    if (var11_4 || var11_4) ** GOTO lbl6
                    return var5_8;
lbl49:
                    // 1 sources

                    if (var11_4 || var11_4) ** GOTO lbl6
                } while (!var13_2);
                throw null;
lbl52:
                // 1 sources

                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return (int)fj.hxhn("hzbg", hxhp(int ), (int)605);
            }
            case 0: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbh", hxhp(int ), (int)606);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 1: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbi", hxhp(int ), (int)607);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl65:
            // 2 sources

            case 2: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbj", hxhp(int ), (int)608);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl70:
            // 3 sources

            case 3: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbk", hxhp(int ), (int)609);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl75:
            // 5 sources

            case 4: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbl", hxhp(int ), (int)610);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl80:
            // 2 sources

            case 5: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbm", hxhp(int ), (int)611);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 6: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbn", hxhp(int ), (int)612);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl90:
            // 3 sources

            case 7: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbo", hxhp(int ), (int)613);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl95:
            // 2 sources

            case 8: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbp", hxhp(int ), (int)614);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl100:
            // 4 sources

            case 9: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbq", hxhp(int ), (int)615);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 10: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbr", hxhp(int ), (int)616);
                if (!var13_2) ** GOTO lbl80
                throw null;
            }
lbl109:
            // 3 sources

            case 11: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbs", hxhp(int ), (int)617);
                if (!var13_2) ** GOTO lbl70
                throw null;
            }
            case 12: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbt", hxhp(int ), (int)618);
                if (var13_2) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 13: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbu", hxhp(int ), (int)619);
                if (!var13_2) ** GOTO lbl95
                throw null;
            }
lbl121:
            // 2 sources

            case 14: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbv", hxhp(int ), (int)620);
                if (!var13_2) ** GOTO lbl65
                throw null;
            }
            case 15: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbw", hxhp(int ), (int)621);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl130:
            // 2 sources

            case 16: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbx", hxhp(int ), (int)622);
                if (!var13_2) ** GOTO lbl100
                throw null;
            }
lbl134:
            // 2 sources

            case 17: {
                var12_3 /* !! */  = (int)fj.hxhn("hzby", hxhp(int ), (int)623);
                if (!var13_2) ** GOTO lbl109
                throw null;
            }
            case 18: {
                var12_3 /* !! */  = (int)fj.hxhn("hzbz", hxhp(int ), (int)624);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
lbl142:
            // 2 sources

            case 19: {
                var12_3 /* !! */  = (int)fj.hxhn("hzca", hxhp(int ), (int)625);
                if (!var13_2) ** GOTO lbl100
                throw null;
            }
lbl146:
            // 4 sources

            case 20: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcb", hxhp(int ), (int)626);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
lbl150:
            // 3 sources

            case 21: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcc", hxhp(int ), (int)627);
                if (!var13_2) ** GOTO lbl90
                throw null;
            }
lbl154:
            // 2 sources

            case 22: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcd", hxhp(int ), (int)628);
                if (!var13_2) ** GOTO lbl90
                throw null;
            }
lbl158:
            // 2 sources

            case 23: {
                var12_3 /* !! */  = (int)fj.hxhn("hzce", hxhp(int ), (int)629);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 24: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcf", hxhp(int ), (int)630);
                if (!var13_2) ** GOTO lbl117
                throw null;
            }
lbl167:
            // 2 sources

            case 25: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcg", hxhp(int ), (int)631);
                if (!var13_2) ** GOTO lbl100
                throw null;
            }
lbl171:
            // 2 sources

            case 26: {
                var12_3 /* !! */  = (int)fj.hxhn("hzch", hxhp(int ), (int)632);
                if (!var13_2) ** GOTO lbl121
                throw null;
            }
lbl175:
            // 2 sources

            case 27: {
                var12_3 /* !! */  = (int)fj.hxhn("hzci", hxhp(int ), (int)633);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
lbl179:
            // 2 sources

            case 28: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcj", hxhp(int ), (int)634);
                if (!var13_2) break;
                throw null;
            }
lbl183:
            // 2 sources

            case 29: {
                var12_3 /* !! */  = (int)fj.hxhn("hzck", hxhp(int ), (int)635);
                if (!var13_2) ** GOTO lbl70
                throw null;
            }
            case 30: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcl", hxhp(int ), (int)636);
                if (!var13_2) ** GOTO lbl158
                throw null;
            }
lbl191:
            // 2 sources

            case 31: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcm", hxhp(int ), (int)637);
                if (!var13_2) ** GOTO lbl146
                throw null;
            }
            case 32: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcn", hxhp(int ), (int)638);
                if (!var13_2) ** GOTO lbl130
                throw null;
            }
            case 33: {
                var12_3 /* !! */  = (int)fj.hxhn("hzco", hxhp(int ), (int)639);
                if (var13_2) {
                    throw null;
                }
            }
            case 34: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcp", hxhp(int ), (int)640);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
lbl207:
            // 3 sources

            case 35: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_3 /* !! */  = (int)fj.hxhn("hzcq", hxhp(int ), (int)641);
                    if (!var13_2) ** GOTO lbl150
                    throw null;
                }
            }
            case 36: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcr", hxhp(int ), (int)642);
                if (!var13_2) ** GOTO lbl167
                throw null;
            }
lbl216:
            // 2 sources

            case 37: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcs", hxhp(int ), (int)643);
                if (!var13_2) ** GOTO lbl183
                throw null;
            }
            case 38: {
                var12_3 /* !! */  = (int)fj.hxhn("hzct", hxhp(int ), (int)644);
                if (!var13_2) ** GOTO lbl146
                throw null;
            }
            case 39: {
                var12_3 /* !! */  = (int)fj.hxhn("hzcu", hxhp(int ), (int)645);
                if (!var13_2) ** GOTO lbl207
                throw null;
            }
            case 40: 
        }
        var12_3 /* !! */  = (int)fj.hxhn("hzcv", hxhp(int ), (int)646);
        ** while (!var13_2)
lbl231:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iaef() {
        fj.hxhl[500] = -624366595;
        fj.hxhl[501] = -1923139481;
        fj.hxhl[502] = -1346291840;
        fj.hxhl[503] = 381852010;
        fj.hxhl[504] = -213472233;
        fj.hxhl[505] = 656012429;
        fj.hxhl[506] = 1030399612;
        fj.hxhl[507] = -1271751108;
        fj.hxhl[508] = -1013104075;
        fj.hxhl[509] = -437601612;
        fj.hxhl[510] = 1767170569;
        fj.hxhl[511] = -1351086199;
        fj.hxhl[512] = -1628012700;
        fj.hxhl[513] = 1370640062;
        fj.hxhl[514] = 1985974739;
        fj.hxhl[515] = -1239825532;
        fj.hxhl[516] = 1444512390;
        fj.hxhl[517] = 1291226262;
        fj.hxhl[518] = -488505909;
        fj.hxhl[519] = -1613016969;
        fj.hxhl[520] = -268821020;
        fj.hxhl[521] = -874270849;
        fj.hxhl[522] = -854750438;
        fj.hxhl[523] = -1936134843;
        fj.hxhl[524] = 1380854982;
        fj.hxhl[525] = 1207640061;
        fj.hxhl[526] = -50134628;
        fj.hxhl[527] = -998696009;
        fj.hxhl[528] = -1802343288;
        fj.hxhl[529] = -1705260477;
        fj.hxhl[530] = -1448061109;
        fj.hxhl[531] = -999708848;
        fj.hxhl[532] = -59922975;
        fj.hxhl[533] = -892585085;
        fj.hxhl[534] = 1555296561;
        fj.hxhl[535] = -669778793;
        fj.hxhl[536] = -1577434873;
        fj.hxhl[537] = -445704170;
        fj.hxhl[538] = 735941212;
        fj.hxhl[539] = 785307193;
        fj.hxhl[540] = -1838440757;
        fj.hxhl[541] = 9346496;
        fj.hxhl[542] = 1404331897;
        fj.hxhl[543] = 684836984;
        fj.hxhl[544] = -1459244852;
        fj.hxhl[545] = 1064583660;
        fj.hxhl[546] = 1223484303;
        fj.hxhl[547] = -11454790;
        fj.hxhl[548] = -961360781;
        fj.hxhl[549] = 185445894;
        fj.hxhl[550] = -1104122450;
        fj.hxhl[551] = 460300638;
        fj.hxhl[552] = 686598244;
        fj.hxhl[553] = -1385129245;
        fj.hxhl[554] = 994311148;
        fj.hxhl[555] = -950308917;
        fj.hxhl[556] = 1315630293;
        fj.hxhl[557] = 2120436125;
        fj.hxhl[558] = -1984288369;
        fj.hxhl[559] = 549360674;
        fj.hxhl[560] = -1671765287;
        fj.hxhl[561] = 1697100071;
        fj.hxhl[562] = -315593838;
        fj.hxhl[563] = -1239960183;
        fj.hxhl[564] = 654908457;
        fj.hxhl[565] = 1797492421;
        fj.hxhl[566] = 1356749256;
        fj.hxhl[567] = 1206566614;
        fj.hxhl[568] = 102703810;
        fj.hxhl[569] = -1008736008;
        fj.hxhl[570] = -180795682;
        fj.hxhl[571] = 758183263;
        fj.hxhl[572] = 874807472;
        fj.hxhl[573] = 494848005;
        fj.hxhl[574] = -706897721;
        fj.hxhl[575] = -1504770613;
        fj.hxhl[576] = 1947452097;
        fj.hxhl[577] = 1500390966;
        fj.hxhl[578] = -854421260;
        fj.hxhl[579] = 1834588163;
        fj.hxhl[580] = 1003043152;
        fj.hxhl[581] = 1410030773;
        fj.hxhl[582] = 777289384;
        fj.hxhl[583] = 1675060010;
        fj.hxhl[584] = 1746572056;
        fj.hxhl[585] = 56266317;
        fj.hxhl[586] = 664569794;
        fj.hxhl[587] = -675687318;
        fj.hxhl[588] = 348367592;
        fj.hxhl[589] = -1792419718;
        fj.hxhl[590] = 551323676;
        fj.hxhl[591] = 1496561963;
        fj.hxhl[592] = 2017856054;
        fj.hxhl[593] = -63943056;
        fj.hxhl[594] = -1382502769;
        fj.hxhl[595] = 61311490;
        fj.hxhl[596] = 262017735;
        fj.hxhl[597] = 1983183694;
        fj.hxhl[598] = -1930440080;
        fj.hxhl[599] = 86510644;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String generateRegionName() {
        v0 /* !! */  = fj.pb;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(fj.hxhn("hxih", hxhs(int ), (int)2) - fj.hxhn("hxig", hxhs(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1518949128: {
                    break block43;
                }
                case 1351286505: {
                    continue block43;
                }
            }
            break;
        }
        var5_1 = fj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fj.pb - fj.hxhn("hxii", hxhs(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fj.hxhn("hxij", hxhp(int ), (int)13)) break;
            v1 /* !! */  = (long)fj.hxhn("hxik", hxhp(int ), (int)14);
        }
        var4_2 /* !! */  = fj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fj.pb - fj.hxhn("hxil", hxhs(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fj.hxhn("hxim", hxhp(int ), (int)15)) break;
            v2 /* !! */  = (long)fj.hxhn("hxin", hxhp(int ), (int)16);
        }
        var3_3 = fj.a;
        if (var5_1) {
            throw null;
lbl25:
            // 8 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = fj.pb - fj.hxhn("hxio", hxhs(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fj.hxhn("hxip", hxhp(int ), (int)17)) break;
            v3 /* !! */  = (long)fj.hxhn("hxiq", hxhp(int ), (int)18);
        }
        v4 /* !! */  = fj.pb;
        if (true) ** GOTO lbl37
        block48: while (true) {
            v4 /* !! */  = (long)(v5 - fj.hxhn("hxir", hxhs(int ), (int)6));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1518949128: {
                    break block48;
                }
                case -455269697: {
                    v5 = fj.hxhn("hxis", hxhs(int ), (int)7);
                    continue block48;
                }
                case 1430073189: {
                    v5 = fj.hxhn("hxit", hxhs(int ), (int)8);
                    continue block48;
                }
            }
            break;
        }
        var1_4 = new StringBuilder("rgab_");
        if (var3_3 || var3_3) ** GOTO lbl25
        var2_5 = fj.hxhn("hxiu", hxhp(int ), (int)19);
        if (var3_3) ** GOTO lbl25
        block49: while (true) {
            if (var3_3 || var3_3) ** GOTO lbl25
            if (var2_5 >= fj.hxhn("hxiv", hxhp(int ), (int)20)) ** GOTO lbl116
            if (var3_3 || var3_3) ** GOTO lbl25
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_3 = fj.pb - fj.hxhn("hxiw", hxhs(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == fj.hxhn("hxix", hxhp(int ), (int)21)) break;
                v6 /* !! */  = (long)fj.hxhn("hxiy", hxhp(int ), (int)22);
            }
            v7 /* !! */  = fj.pb;
            if (true) ** GOTO lbl63
            block51: while (true) {
                v7 /* !! */  = (long)(v8 - fj.hxhn("hxiz", hxhs(int ), (int)10));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1518949128: {
                        break block51;
                    }
                    case -658327227: {
                        v8 = fj.hxhn("hxja", hxhs(int ), (int)11);
                        continue block51;
                    }
                    case 1767412636: {
                        v8 = fj.hxhn("hxjb", hxhs(int ), (int)12);
                        continue block51;
                    }
                }
                break;
            }
            v9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".length();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = fj.pb - fj.hxhn("hxjc", hxhs(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == fj.hxhn("hxjd", hxhp(int ), (int)23)) break;
                v10 /* !! */  = (long)fj.hxhn("hxje", hxhp(int ), (int)24);
            }
            v11 = fj.RANDOM.nextInt(v9);
            v12 /* !! */  = fj.pb;
            if (true) ** GOTO lbl83
            block53: while (true) {
                v12 /* !! */  = (long)(v13 - fj.hxhn("hxjf", hxhs(int ), (int)14));
lbl83:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1518949128: {
                        break block53;
                    }
                    case 1340736786: {
                        v13 = fj.hxhn("hxjg", hxhs(int ), (int)15);
                        continue block53;
                    }
                    case 2051766544: {
                        v13 = fj.hxhn("hxjh", hxhs(int ), (int)16);
                        continue block53;
                    }
                }
                break;
            }
            v14 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(v11);
            v15 /* !! */  = fj.pb;
            if (true) ** GOTO lbl97
            block54: while (true) {
                v15 /* !! */  = (long)(v16 - fj.hxhn("hxji", hxhs(int ), (int)17));
lbl97:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1867521353: {
                        v16 = fj.hxhn("hxjj", hxhs(int ), (int)18);
                        continue block54;
                    }
                    case -1518949128: {
                        break block54;
                    }
                    case 133276473: {
                        v16 = fj.hxhn("hxjk", hxhs(int ), (int)19);
                        continue block54;
                    }
                }
                break;
            }
            var1_4.append(v14);
            if (var3_3 || var3_3) ** GOTO lbl25
            ++var2_5;
            if (var3_3) ** GOTO lbl25
            if (var4_2 /* !! */  == 0) continue;
            switch (var4_2 /* !! */ ) {
                default: {
                    if (!var5_1) continue block49;
                    throw null;
                }
lbl116:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = fj.pb - fj.hxhn("hxjl", hxhs(int ), (int)20)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fj.hxhn("hxjm", hxhp(int ), (int)25)) break;
                    v17 /* !! */  = (long)fj.hxhn("hxjn", hxhp(int ), (int)26);
                }
                return var1_4.toString();
                case 0: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjo", hxhp(int ), (int)27);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl129:
                // 2 sources

                case 1: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjp", hxhp(int ), (int)28);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl134:
                // 2 sources

                case 2: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjq", hxhp(int ), (int)29);
                    if (!var5_1) ** GOTO lbl129
                    throw null;
                }
lbl138:
                // 2 sources

                case 3: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjr", hxhp(int ), (int)30);
                    if (!var5_1) break block49;
                    throw null;
                }
lbl142:
                // 2 sources

                case 4: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjs", hxhp(int ), (int)31);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
                case 5: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjt", hxhp(int ), (int)32);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl152:
                // 2 sources

                case 6: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxju", hxhp(int ), (int)33);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
                case 7: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjv", hxhp(int ), (int)34);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
                case 8: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjw", hxhp(int ), (int)35);
                    if (!var5_1) ** GOTO lbl138
                    throw null;
                }
lbl166:
                // 3 sources

                case 9: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjx", hxhp(int ), (int)36);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl171:
                // 3 sources

                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)fj.hxhn("hxjy", hxhp(int ), (int)37);
                        if (!var5_1) ** GOTO lbl134
                        throw null;
                    }
                }
lbl176:
                // 2 sources

                case 11: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxjz", hxhp(int ), (int)38);
                    if (!var5_1) ** GOTO lbl166
                    throw null;
                }
lbl180:
                // 3 sources

                case 12: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxka", hxhp(int ), (int)39);
                    if (!var5_1) break block49;
                    throw null;
                }
lbl184:
                // 2 sources

                case 13: {
                    do {
                        var4_2 /* !! */  = (int)fj.hxhn("hxkb", hxhp(int ), (int)40);
                    } while (!var5_1);
                    throw null;
                }
                case 14: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxkc", hxhp(int ), (int)41);
                    if (!var5_1) ** GOTO lbl142
                    throw null;
                }
                case 15: {
                    var4_2 /* !! */  = (int)fj.hxhn("hxkd", hxhp(int ), (int)42);
                    if (!var5_1) ** GOTO lbl171
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var4_2 /* !! */  = (int)fj.hxhn("hxke", hxhp(int ), (int)43);
        ** while (!var5_1)
lbl200:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iahj() {
        fj.hxhu[200] = -6908767362460717718L;
        fj.hxhu[201] = 5284652731306941950L;
        fj.hxhu[202] = 4357161858690422740L;
        fj.hxhu[203] = 2743204737460456106L;
        fj.hxhu[204] = -5189760891910719499L;
        fj.hxhu[205] = -736896046744412336L;
        fj.hxhu[206] = -4157787635132214307L;
        fj.hxhu[207] = -7049943266472399689L;
        fj.hxhu[208] = 4736601596795678166L;
        fj.hxhu[209] = -8975099744694823003L;
        fj.hxhu[210] = 359567091860285650L;
        fj.hxhu[211] = 7245908816127976826L;
        fj.hxhu[212] = 7218127429023696846L;
        fj.hxhu[213] = -6496658447674565498L;
        fj.hxhu[214] = 8937059756479136782L;
        fj.hxhu[215] = -6091554645637462011L;
        fj.hxhu[216] = -4019719101496590431L;
        fj.hxhu[217] = -3977842588948381082L;
        fj.hxhu[218] = -1352731032076057422L;
        fj.hxhu[219] = -5625966547807822682L;
        fj.hxhu[220] = 4364531770034671860L;
        fj.hxhu[221] = -416929877964995633L;
        fj.hxhu[222] = 4008018526958662966L;
        fj.hxhu[223] = 7155829778700287589L;
        fj.hxhu[224] = -2455369479100315361L;
        fj.hxhu[225] = -6740329863974713643L;
        fj.hxhu[226] = -5011796856321681677L;
        fj.hxhu[227] = -6232503919152974508L;
        fj.hxhu[228] = 4329721362755241272L;
        fj.hxhu[229] = -7734310733318448599L;
        fj.hxhu[230] = -6997708155095461971L;
        fj.hxhu[231] = -1382012687381323323L;
        fj.hxhu[232] = 5762463509887867771L;
        fj.hxhu[233] = 8624510059372766742L;
        fj.hxhu[234] = -275262570412156246L;
        fj.hxhu[235] = -2356648022417844566L;
        fj.hxhu[236] = 3425676729381412751L;
        fj.hxhu[237] = -9198896104365816714L;
        fj.hxhu[238] = 6910451610884681115L;
        fj.hxhu[239] = 8883134566455337491L;
        fj.hxhu[240] = -3617193783823248915L;
        fj.hxhu[241] = 8165667445250489366L;
        fj.hxhu[242] = 7448766603601456928L;
        fj.hxhu[243] = -3237864250172708679L;
        fj.hxhu[244] = 6598913662651279624L;
        fj.hxhu[245] = 5050398610076194172L;
        fj.hxhu[246] = 2629789519867285362L;
        fj.hxhu[247] = 8974867745123570880L;
        fj.hxhu[248] = 4472208495661645479L;
        fj.hxhu[249] = 7989094060573262335L;
        fj.hxhu[250] = 1638938980932690741L;
        fj.hxhu[251] = 191755529592080345L;
        fj.hxhu[252] = 2632940859106380695L;
        fj.hxhu[253] = -4712915176251178058L;
        fj.hxhu[254] = 4476084181660315990L;
        fj.hxhu[255] = -1248180615791704748L;
        fj.hxhu[256] = 179894017057511167L;
        fj.hxhu[257] = -4107122956567327274L;
        fj.hxhu[258] = -3375423579260793276L;
        fj.hxhu[259] = -4111987782190423797L;
        fj.hxhu[260] = 6658487065121502069L;
        fj.hxhu[261] = 4068389678910809382L;
        fj.hxhu[262] = -75661917592457043L;
        fj.hxhu[263] = -2743654910072866239L;
        fj.hxhu[264] = 1335472770718442951L;
        fj.hxhu[265] = 3840789255277381175L;
        fj.hxhu[266] = -3574569172020537810L;
        fj.hxhu[267] = -236385020282428767L;
        fj.hxhu[268] = 7111244069732913072L;
        fj.hxhu[269] = -1406451030065333930L;
        fj.hxhu[270] = -985634348189810628L;
        fj.hxhu[271] = -7722107042016447537L;
        fj.hxhu[272] = -6182470531043142884L;
        fj.hxhu[273] = 6959811807415058603L;
        fj.hxhu[274] = 4286027967001775543L;
        fj.hxhu[275] = 1083479130612458286L;
        fj.hxhu[276] = -4151133488001848357L;
        fj.hxhu[277] = -2239045561795619418L;
        fj.hxhu[278] = 7686999961435691681L;
        fj.hxhu[279] = -1873671573849498068L;
        fj.hxhu[280] = -7645686151985975507L;
        fj.hxhu[281] = 618154675453028742L;
        fj.hxhu[282] = -6039618105223224631L;
        fj.hxhu[283] = 642322269268615459L;
        fj.hxhu[284] = 2261355611009101151L;
        fj.hxhu[285] = -4461519393502086048L;
        fj.hxhu[286] = 4838907831638300343L;
        fj.hxhu[287] = -4727523228312126085L;
        fj.hxhu[288] = -6497636788080828955L;
        fj.hxhu[289] = 1789772659015480728L;
        fj.hxhu[290] = -3967470785950806087L;
        fj.hxhu[291] = -6732835574762898439L;
        fj.hxhu[292] = 5893289519941525239L;
        fj.hxhu[293] = -1680423278024907065L;
        fj.hxhu[294] = -7190351676275208590L;
        fj.hxhu[295] = -60508052759722339L;
        fj.hxhu[296] = 5578003604888508039L;
        fj.hxhu[297] = 8319077168861950698L;
        fj.hxhu[298] = 7276744450833113918L;
        fj.hxhu[299] = -1350229706048842871L;
    }

    /*
     * Exception decompiling
     */
    private void closeClientSocket() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iafw() {
        fj.hxhm[700] = -1665388682;
        fj.hxhm[701] = -1071999117;
        fj.hxhm[702] = 1047501618;
        fj.hxhm[703] = -908740172;
        fj.hxhm[704] = -778554810;
        fj.hxhm[705] = -1816379246;
        fj.hxhm[706] = -635928324;
        fj.hxhm[707] = -1561784315;
        fj.hxhm[708] = 260271437;
        fj.hxhm[709] = -469774571;
        fj.hxhm[710] = -520509979;
        fj.hxhm[711] = 1344620200;
        fj.hxhm[712] = 1281472840;
        fj.hxhm[713] = 1035546780;
        fj.hxhm[714] = 1767701734;
        fj.hxhm[715] = 264207577;
        fj.hxhm[716] = -1448280483;
        fj.hxhm[717] = -1589900053;
        fj.hxhm[718] = 34059903;
        fj.hxhm[719] = -1442661614;
        fj.hxhm[720] = 1187681497;
        fj.hxhm[721] = 1619857406;
        fj.hxhm[722] = 963218375;
        fj.hxhm[723] = 207020681;
        fj.hxhm[724] = -1008740253;
        fj.hxhm[725] = -1676325077;
        fj.hxhm[726] = 1477256900;
        fj.hxhm[727] = -1370976003;
        fj.hxhm[728] = 1300249203;
        fj.hxhm[729] = 994335880;
        fj.hxhm[730] = 1932934140;
        fj.hxhm[731] = 1984232626;
        fj.hxhm[732] = 335906820;
        fj.hxhm[733] = 1706405001;
        fj.hxhm[734] = -2041632436;
        fj.hxhm[735] = 596914669;
        fj.hxhm[736] = -1450103305;
        fj.hxhm[737] = -1846333067;
        fj.hxhm[738] = -318125029;
        fj.hxhm[739] = -1035906085;
        fj.hxhm[740] = 258969601;
        fj.hxhm[741] = -2099527334;
        fj.hxhm[742] = -1922615557;
        fj.hxhm[743] = -2098027960;
        fj.hxhm[744] = 301941438;
        fj.hxhm[745] = -49291786;
        fj.hxhm[746] = -908908489;
        fj.hxhm[747] = 910945435;
        fj.hxhm[748] = -82189659;
        fj.hxhm[749] = 537339188;
        fj.hxhm[750] = -1895103065;
        fj.hxhm[751] = -533619054;
        fj.hxhm[752] = 513022569;
        fj.hxhm[753] = -601050401;
        fj.hxhm[754] = 1187727132;
        fj.hxhm[755] = -1670805658;
        fj.hxhm[756] = 1926022474;
        fj.hxhm[757] = -31967643;
        fj.hxhm[758] = -245640489;
        fj.hxhm[759] = 1834905389;
        fj.hxhm[760] = -1034198361;
        fj.hxhm[761] = -165928739;
        fj.hxhm[762] = -1105121986;
        fj.hxhm[763] = -1262674305;
        fj.hxhm[764] = 1593421528;
        fj.hxhm[765] = -1602605237;
        fj.hxhm[766] = -320573492;
        fj.hxhm[767] = 132627548;
        fj.hxhm[768] = -2094172870;
        fj.hxhm[769] = 1876940066;
        fj.hxhm[770] = 1445935945;
        fj.hxhm[771] = 984000076;
        fj.hxhm[772] = 989130634;
        fj.hxhm[773] = 367020809;
        fj.hxhm[774] = 1698175291;
        fj.hxhm[775] = -1756617016;
        fj.hxhm[776] = 1024018038;
        fj.hxhm[777] = -1539684894;
        fj.hxhm[778] = 347013275;
        fj.hxhm[779] = -1359827496;
        fj.hxhm[780] = -344979599;
        fj.hxhm[781] = -233596409;
        fj.hxhm[782] = 411103692;
        fj.hxhm[783] = 1020489725;
        fj.hxhm[784] = 609067974;
        fj.hxhm[785] = 573918934;
        fj.hxhm[786] = 1956961736;
        fj.hxhm[787] = -1355968688;
        fj.hxhm[788] = 1618496752;
        fj.hxhm[789] = -1896421777;
        fj.hxhm[790] = 627819047;
        fj.hxhm[791] = 909106620;
        fj.hxhm[792] = 271415062;
        fj.hxhm[793] = 1601349809;
        fj.hxhm[794] = 1131399099;
        fj.hxhm[795] = -498586523;
        fj.hxhm[796] = 971840684;
        fj.hxhm[797] = -2126205228;
        fj.hxhm[798] = 714536702;
        fj.hxhm[799] = 1385976689;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$onPacket$5() {
        boolean bl2;
        block26: {
            Object object = pb;
            block10: while (true) {
                switch ((int)object) {
                    case -1518949128: {
                        break block10;
                    }
                    case 1973994274: {
                        object = fj.hxhn("hzqs", hxhs(int ), (int)324) - fj.hxhn("hzqr", hxhs(int ), (int)323);
                        continue block10;
                    }
                }
                break;
            }
            boolean bl3 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = pb - fj.hxhn("hzqt", hxhs(int ), (int)325)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == fj.hxhn("hzqu", hxhp(int ), (int)960)) break;
                object2 = fj.hxhn("hzqv", hxhp(int ), (int)961);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = pb - fj.hxhn("hzqw", hxhs(int ), (int)326)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == fj.hxhn("hzqx", hxhp(int ), (int)962)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object3 = fj.hxhn("hzqy", hxhp(int ), (int)963);
            }
            if (bl2) return;
            try {
                if (bl2) return;
                CallSite callSite = fj.hxhn("hzqz", hxhs(int ), (int)327);
                while (true) {
                    long l4;
                    Object object4;
                    if ((object4 = (l4 = pb - fj.hxhn("hzra", hxhs(int ), (int)328)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object4 == fj.hxhn("hzrb", hxhp(int ), (int)964)) {
                        Thread.sleep((long)callSite);
                        if (bl2) return;
                        break;
                    }
                    object4 = fj.hxhn("hzrc", hxhp(int ), (int)965);
                }
                if (bl2) return;
                while (true) {
                    long l5;
                    Object object5;
                    if ((object5 = (l5 = pb - fj.hxhn("hzrd", hxhs(int ), (int)329)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                    if (object5 == fj.hxhn("hzre", hxhp(int ), (int)966)) {
                        this.queueRegionCommands();
                        if (bl2) return;
                        break;
                    }
                    object5 = fj.hxhn("hzrf", hxhp(int ), (int)967);
                }
                if (bl2) return;
                if (!bl3) break block26;
                throw null;
            }
            catch (InterruptedException interruptedException) {
                if (bl2 || bl2) return;
            }
            while (true) {
                long l6;
                Object object6;
                if ((object6 = (l6 = pb - fj.hxhn("hzrg", hxhs(int ), (int)330)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                if (object6 == fj.hxhn("hzrh", hxhp(int ), (int)968)) break;
                object6 = fj.hxhn("hzri", hxhp(int ), (int)969);
            }
            Thread thread = Thread.currentThread();
            Object object7 = pb;
            block16: while (true) {
                switch ((int)object7) {
                    case -1518949128: {
                        break block16;
                    }
                    case -664758887: {
                        object7 = fj.hxhn("hzrk", hxhs(int ), (int)332) - fj.hxhn("hzrj", hxhs(int ), (int)331);
                        continue block16;
                    }
                }
                break;
            }
            thread.interrupt();
            if (bl2) return;
        }
        if (!bl2 && !bl2) return;
    }

    /*
     * Exception decompiling
     */
    private void processCommandQueue() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 31[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isPlayerStable() {
        block78: {
            block77: {
                var9_1 = fj.c;
                var8_2 /* !! */  = fj.b;
                var7_3 = fj.a;
                if (var9_1) {
                    throw null;
lbl6:
                    // 21 sources

                    return (boolean)fj.hxhn("hygl", hxhp(int ), (int)366);
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                if (!this.mode.isSelected("\u041f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u044c")) break block77;
                if (var7_3) ** GOTO lbl6
                if (fj.mc.field_1724 != null) break block78;
                if (var7_3) ** GOTO lbl6
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            return (boolean)fj.hxhn("hygm", hxhp(int ), (int)367);
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var1_4 = fj.mc.field_1724.method_23317();
        if (var7_3 || var7_3) ** GOTO lbl6
        var3_5 = fj.mc.field_1724.method_23318();
        if (var7_3 || var7_3) ** GOTO lbl6
        var5_6 = fj.mc.field_1724.method_23321();
        if (var7_3 || var7_3) ** GOTO lbl6
        if (!this.hasLastPos) ** GOTO lbl43
        if (var7_3) ** GOTO lbl6
        if (var1_4 != this.lastPlayerX) ** GOTO lbl35
        if (var7_3) ** GOTO lbl6
        if (var3_5 != this.lastPlayerY) ** GOTO lbl35
        if (var7_3) ** GOTO lbl6
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_6 == this.lastPlayerZ) ** GOTO lbl43
                if (var7_3) ** GOTO lbl6
lbl35:
                // 3 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerX = var1_4;
                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerY = var3_5;
                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerZ = var5_6;
                if (var7_3 || var7_3) ** GOTO lbl6
                return (boolean)fj.hxhn("hygn", hxhp(int ), (int)368);
lbl43:
                // 2 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerX = var1_4;
                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerY = var3_5;
                if (var7_3 || var7_3) ** GOTO lbl6
                this.lastPlayerZ = var5_6;
                if (var7_3 || var7_3) ** GOTO lbl6
                this.hasLastPos = fj.hxhn("hygo", hxhp(int ), (int)369);
                if (!var7_3 && !var7_3) ** break;
                ** continue;
                return (boolean)fj.hxhn("hygp", hxhp(int ), (int)370);
            }
lbl54:
            // 2 sources

            case 0: {
                var8_2 /* !! */  = (int)fj.hxhn("hygq", hxhp(int ), (int)371);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 1: {
                var8_2 /* !! */  = (int)fj.hxhn("hygr", hxhp(int ), (int)372);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 2: {
                var8_2 /* !! */  = (int)fj.hxhn("hygs", hxhp(int ), (int)373);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl69:
            // 5 sources

            case 3: {
                var8_2 /* !! */  = (int)fj.hxhn("hygt", hxhp(int ), (int)374);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 4: {
                var8_2 /* !! */  = (int)fj.hxhn("hygu", hxhp(int ), (int)375);
                if (!var9_1) ** GOTO lbl69
                throw null;
            }
lbl78:
            // 2 sources

            case 5: {
                var8_2 /* !! */  = (int)fj.hxhn("hygv", hxhp(int ), (int)376);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl83:
            // 2 sources

            case 6: {
                var8_2 /* !! */  = (int)fj.hxhn("hygw", hxhp(int ), (int)377);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl88:
            // 2 sources

            case 7: {
                var8_2 /* !! */  = (int)fj.hxhn("hygx", hxhp(int ), (int)378);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl93:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)fj.hxhn("hygy", hxhp(int ), (int)379);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl131
                    break;
                }
            }
lbl99:
            // 3 sources

            case 9: {
                var8_2 /* !! */  = (int)fj.hxhn("hygz", hxhp(int ), (int)380);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl104:
            // 2 sources

            case 10: {
                var8_2 /* !! */  = (int)fj.hxhn("hyha", hxhp(int ), (int)381);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 11: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhb", hxhp(int ), (int)382);
                if (!var9_1) ** GOTO lbl69
                throw null;
            }
            case 12: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhc", hxhp(int ), (int)383);
                if (!var9_1) ** GOTO lbl99
                throw null;
            }
            case 13: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhd", hxhp(int ), (int)384);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 14: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhe", hxhp(int ), (int)385);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl127:
            // 2 sources

            case 15: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhf", hxhp(int ), (int)386);
                if (!var9_1) ** GOTO lbl69
                throw null;
            }
lbl131:
            // 2 sources

            case 16: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhg", hxhp(int ), (int)387);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 17: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhh", hxhp(int ), (int)388);
                if (var9_1) {
                    throw null;
                }
            }
            case 18: {
                do {
                    var8_2 /* !! */  = (int)fj.hxhn("hyhi", hxhp(int ), (int)389);
                } while (!var9_1);
                throw null;
            }
lbl145:
            // 6 sources

            case 19: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhj", hxhp(int ), (int)390);
                if (!var9_1) ** GOTO lbl78
                throw null;
            }
lbl149:
            // 3 sources

            case 20: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhk", hxhp(int ), (int)391);
                if (!var9_1) ** GOTO lbl69
                throw null;
            }
            case 21: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhl", hxhp(int ), (int)392);
                if (!var9_1) ** GOTO lbl88
                throw null;
            }
lbl157:
            // 2 sources

            case 22: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhm", hxhp(int ), (int)393);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl162:
            // 2 sources

            case 23: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhn", hxhp(int ), (int)394);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 24: {
                var8_2 /* !! */  = (int)fj.hxhn("hyho", hxhp(int ), (int)395);
                if (!var9_1) ** GOTO lbl145
                throw null;
            }
lbl171:
            // 2 sources

            case 25: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhp", hxhp(int ), (int)396);
                if (!var9_1) ** GOTO lbl54
                throw null;
            }
            case 26: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhq", hxhp(int ), (int)397);
                if (!var9_1) ** GOTO lbl83
                throw null;
            }
lbl179:
            // 2 sources

            case 27: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhr", hxhp(int ), (int)398);
                if (var9_1) {
                    throw null;
                }
            }
lbl183:
            // 4 sources

            case 28: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhs", hxhp(int ), (int)399);
                if (!var9_1) ** GOTO lbl93
                throw null;
            }
            case 29: {
                var8_2 /* !! */  = (int)fj.hxhn("hyht", hxhp(int ), (int)400);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 30: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhu", hxhp(int ), (int)401);
                if (var9_1) {
                    throw null;
                }
            }
lbl196:
            // 5 sources

            case 31: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhv", hxhp(int ), (int)402);
                if (!var9_1) ** GOTO lbl99
                throw null;
            }
            case 32: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhw", hxhp(int ), (int)403);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl205:
            // 3 sources

            case 33: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhx", hxhp(int ), (int)404);
                if (!var9_1) ** GOTO lbl127
                throw null;
            }
lbl209:
            // 2 sources

            case 34: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhy", hxhp(int ), (int)405);
                if (!var9_1) ** GOTO lbl157
                throw null;
            }
lbl213:
            // 2 sources

            case 35: {
                var8_2 /* !! */  = (int)fj.hxhn("hyhz", hxhp(int ), (int)406);
                if (!var9_1) ** GOTO lbl179
                throw null;
            }
lbl217:
            // 2 sources

            case 36: {
                var8_2 /* !! */  = (int)fj.hxhn("hyia", hxhp(int ), (int)407);
                if (!var9_1) ** GOTO lbl145
                throw null;
            }
lbl221:
            // 2 sources

            case 37: {
                var8_2 /* !! */  = (int)fj.hxhn("hyib", hxhp(int ), (int)408);
                if (!var9_1) ** GOTO lbl213
                throw null;
            }
            case 38: 
        }
        var8_2 /* !! */  = (int)fj.hxhn("hyic", hxhp(int ), (int)409);
        ** while (!var9_1)
lbl228:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$handleClient$3() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iafx() {
        fj.hxhm[800] = 752287975;
        fj.hxhm[801] = 54201343;
        fj.hxhm[802] = 803092143;
        fj.hxhm[803] = 347149221;
        fj.hxhm[804] = -1410948360;
        fj.hxhm[805] = 186390885;
        fj.hxhm[806] = 1248862385;
        fj.hxhm[807] = -2081524053;
        fj.hxhm[808] = 294356555;
        fj.hxhm[809] = -157154606;
        fj.hxhm[810] = 990600432;
        fj.hxhm[811] = 1284506310;
        fj.hxhm[812] = -1976354873;
        fj.hxhm[813] = -361042890;
        fj.hxhm[814] = -1636355439;
        fj.hxhm[815] = -173324814;
        fj.hxhm[816] = 927261726;
        fj.hxhm[817] = 770141027;
        fj.hxhm[818] = -1978435478;
        fj.hxhm[819] = 527527752;
        fj.hxhm[820] = -1055948955;
        fj.hxhm[821] = 421550613;
        fj.hxhm[822] = -1684891469;
        fj.hxhm[823] = -693724505;
        fj.hxhm[824] = 28987878;
        fj.hxhm[825] = -1481030605;
        fj.hxhm[826] = 1520671742;
        fj.hxhm[827] = -1597001072;
        fj.hxhm[828] = 1676738101;
        fj.hxhm[829] = 1204090452;
        fj.hxhm[830] = 490565476;
        fj.hxhm[831] = 557976658;
        fj.hxhm[832] = 1510036608;
        fj.hxhm[833] = 114684036;
        fj.hxhm[834] = 1553717760;
        fj.hxhm[835] = 1817059942;
        fj.hxhm[836] = -1229813973;
        fj.hxhm[837] = -1890795194;
        fj.hxhm[838] = 1427232161;
        fj.hxhm[839] = -311357156;
        fj.hxhm[840] = 1166185628;
        fj.hxhm[841] = -1895658275;
        fj.hxhm[842] = -1663287622;
        fj.hxhm[843] = -1240549002;
        fj.hxhm[844] = 1836055122;
        fj.hxhm[845] = -1401011001;
        fj.hxhm[846] = 22744989;
        fj.hxhm[847] = -974082477;
        fj.hxhm[848] = -842622232;
        fj.hxhm[849] = 1944342479;
        fj.hxhm[850] = -1244038849;
        fj.hxhm[851] = 1033156841;
        fj.hxhm[852] = 20913723;
        fj.hxhm[853] = -2006752409;
        fj.hxhm[854] = 2099398817;
        fj.hxhm[855] = -70474250;
        fj.hxhm[856] = -726151490;
        fj.hxhm[857] = -1498502946;
        fj.hxhm[858] = -684342826;
        fj.hxhm[859] = 924020884;
        fj.hxhm[860] = 1603384824;
        fj.hxhm[861] = -9459121;
        fj.hxhm[862] = -1157463340;
        fj.hxhm[863] = 256039572;
        fj.hxhm[864] = 760685394;
        fj.hxhm[865] = 2093520465;
        fj.hxhm[866] = 228684565;
        fj.hxhm[867] = -1280184452;
        fj.hxhm[868] = 748191411;
        fj.hxhm[869] = 1208021289;
        fj.hxhm[870] = 152988864;
        fj.hxhm[871] = -381721594;
        fj.hxhm[872] = 1262127800;
        fj.hxhm[873] = 389627993;
        fj.hxhm[874] = -1156205600;
        fj.hxhm[875] = 610634581;
        fj.hxhm[876] = 743518110;
        fj.hxhm[877] = 392848043;
        fj.hxhm[878] = -570199013;
        fj.hxhm[879] = -2013972625;
        fj.hxhm[880] = 1267350317;
        fj.hxhm[881] = -749452838;
        fj.hxhm[882] = -1695393058;
        fj.hxhm[883] = 2062031205;
        fj.hxhm[884] = -1554995192;
        fj.hxhm[885] = 1007200598;
        fj.hxhm[886] = -566419239;
        fj.hxhm[887] = -281641033;
        fj.hxhm[888] = 453805638;
        fj.hxhm[889] = -981056185;
        fj.hxhm[890] = 1448785582;
        fj.hxhm[891] = -1663035659;
        fj.hxhm[892] = 1444960576;
        fj.hxhm[893] = -2108289582;
        fj.hxhm[894] = 2129922276;
        fj.hxhm[895] = -2060611415;
        fj.hxhm[896] = 620625580;
        fj.hxhm[897] = 1870504604;
        fj.hxhm[898] = -1963094239;
        fj.hxhm[899] = -1305783180;
    }
}

