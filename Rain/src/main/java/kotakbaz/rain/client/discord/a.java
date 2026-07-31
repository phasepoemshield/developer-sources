/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.discord;

import eu.donyka.discord.RPCHandler;
import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.discord.RichPresenceBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.guard.a_0;

public final class a {
    private static final String a = "1438151584725991547";
    private static final String A = "https://r2.e-z.host/7d033548-c904-4c5c-b3b6-413d65aadf76/bw9sqryge6baxsz9uq.gif";
    private static final String b = "Rain Visuals";
    private static final String B = "";
    private static final String c = "";
    private static final Object C;
    private static volatile boolean d;
    private static volatile boolean D;
    private static volatile boolean e;
    private static volatile RichPresence E;
    private static ScheduledExecutorService f;
    private static Object[] F;
    private static Object G;
    private static Object[] h;
    private static Object[] g;
    private static Object[] H;
    public static int[] i;

    private a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void startup() {
        Object object = C;
        synchronized (object) {
            if (d) {
                return;
            }
            int n2 = i[0];
            n2 ^= i[1];
            d = n2 ^= i[2];
            E = kotakbaz.rain.client.discord.a.buildPresence();
            kotakbaz.rain.client.discord.a.configureCallbacks();
        }
        try {
            kotakbaz.rain.client.discord.a.warnIfDiscordPipeAccessDenied();
            int n3 = i[3];
            n3 += i[4];
            int n4 = i[6];
            n4 ^= i[7];
            boolean bl = i[9];
            bl ^= i[10];
            RPCHandler.startup((String)F[n3 ^= i[5]] + (String)F[n4 += i[8]], bl += i[11]);
        }
        catch (Throwable throwable) {
            String string = String.valueOf(throwable);
            int n5 = i[12];
            n5 += i[13];
            int n6 = i[15];
            n6 ^= i[16];
            System.err.println((String)F[n5 += i[14]] + (String)F[n6 += i[17]] + string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void shutdown() {
        Object object = C;
        synchronized (object) {
            if (!d) {
                return;
            }
            int n2 = i[18];
            n2 -= i[19];
            d = n2 ^= i[20];
            kotakbaz.rain.client.discord.a.stopPeriodicUpdate();
        }
        try {
            RPCHandler.shutdown();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void configureCallbacks() {
        if (D) {
            return;
        }
        RPCHandler.setOnReady(user -> {
            kotakbaz.rain.client.discord.a.updatePresence();
            Object object = C;
            synchronized (object) {
                if (f == null || f.isShutdown()) {
                    int n2 = i[114];
                    n2 += i[115];
                    int n3 = i[117];
                    n3 ^= i[118];
                    f = Executors.newSingleThreadScheduledExecutor(kotakbaz.rain.client.discord.a.daemonFactory((String)F[n2 -= i[116]] + (String)F[n3 -= i[119]]));
                    f.scheduleAtFixedRate(a::updatePresence, 5L, 5L, TimeUnit.SECONDS);
                }
            }
        });
        RPCHandler.setOnDisconnected(error -> {
            kotakbaz.rain.client.discord.a.stopPeriodicUpdate();
            kotakbaz.rain.client.discord.a.attemptRestart();
        });
        RPCHandler.setOnErrored(error -> {
            kotakbaz.rain.client.discord.a.stopPeriodicUpdate();
            kotakbaz.rain.client.discord.a.attemptRestart();
        });
        int n2 = i[21];
        n2 += i[22];
        D = n2 ^= i[23];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void attemptRestart() {
        Object object = C;
        synchronized (object) {
            if (!d) {
                return;
            }
        }
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
        object = C;
        synchronized (object) {
            if (!d) {
                return;
            }
        }
        try {
            RPCHandler.shutdown();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            kotakbaz.rain.client.discord.a.warnIfDiscordPipeAccessDenied();
            int n2 = i[24];
            n2 += i[25];
            int n3 = i[27];
            n3 ^= i[28];
            boolean bl = i[30];
            bl -= i[31];
            RPCHandler.startup((String)F[n2 += i[26]] + (String)F[n3 ^= i[29]], bl += i[32]);
        }
        catch (Throwable throwable) {
            String string = String.valueOf(throwable);
            int n4 = i[33];
            n4 -= i[34];
            int n5 = i[36];
            n5 += i[37];
            System.err.println((String)F[n4 -= i[35]] + (String)F[n5 += i[38]] + string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void updatePresence() {
        Object object = C;
        synchronized (object) {
            if (!d) {
                return;
            }
            E = kotakbaz.rain.client.discord.a.buildPresence();
        }
        try {
            RPCHandler.updatePresence(E);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static RichPresence buildPresence() {
        int n2 = i[39];
        n2 += i[40];
        String string = kotakbaz.rain.client.discord.a.firstNonBlank(a_0.uid(), (String)F[n2 ^= i[41]]);
        int n3 = i[42];
        n3 += i[43];
        String string2 = string.replaceFirst((String)F[n3 += i[44]], "");
        int n4 = i[45];
        n4 ^= i[46];
        n4 ^= i[47];
        int n5 = i[48];
        n5 ^= i[49];
        String string3 = string2;
        int n6 = i[51];
        n6 -= i[52];
        RichPresenceBuilder richPresenceBuilder = RichPresence.builder().details((String)F[n4] + (String)F[n5 ^= i[50]]).state((String)F[n6 -= i[53]] + string3);
        int n7 = i[54];
        n7 -= i[55];
        int n8 = i[57];
        n8 += i[58];
        if (!((String)F[n7 -= i[56]] + (String)F[n8 += i[59]]).isBlank()) {
            int n9 = i[60];
            n9 -= i[61];
            int n10 = i[63];
            n10 -= i[64];
            richPresenceBuilder.largeImageKey((String)F[n9 -= i[62]] + (String)F[n10 -= i[65]]);
            int n11 = i[66];
            n11 += i[67];
            if (!((String)F[n11 -= i[68]]).isBlank()) {
                int n12 = i[69];
                n12 ^= i[70];
                richPresenceBuilder.largeImageText((String)F[n12 += i[71]]);
            }
        }
        if (!"".isBlank()) {
            richPresenceBuilder.smallImageKey("");
            if (!"".isBlank()) {
                richPresenceBuilder.smallImageText("");
            }
        }
        return richPresenceBuilder.build();
    }

    private static String firstNonBlank(String value2, String fallback) {
        return value2 == null || value2.isBlank() ? fallback : value2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void stopPeriodicUpdate() {
        Object object = C;
        synchronized (object) {
            if (f == null) {
                return;
            }
            f.shutdownNow();
            f = null;
        }
    }

    private static void warnIfDiscordPipeAccessDenied() {
        long l2 = -1002993949117420026L;
        long l3 = 6374088607390622240L;
        if (e) {
            return;
        }
        long l4 = l3;
        int n2 = i[72];
        n2 += i[73];
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 ^= i[74]);
        while (true) {
            int n3 = i[75];
            n3 ^= i[76];
            int n4 = i[78];
            n4 ^= i[79];
            if ((int)(l3 >>> (n3 += i[77])) >= (n4 ^= i[80])) break;
            int n5 = i[81];
            n5 -= i[82];
            n5 ^= i[83];
            int n6 = i[84];
            n6 -= i[85];
            n6 += i[86];
            int n7 = i[87];
            n7 -= i[88];
            Object[] objectArray = new Object[n7 += i[89]];
            int n8 = i[90];
            n8 += i[91];
            int n9 = i[93];
            n9 += i[94];
            objectArray[n8 ^= kotakbaz.rain.client.discord.a.i[92]] = (int)(l3 >>> (n9 -= i[95]));
            File file = new File(String.format((String)F[n5] + (String)F[n6], objectArray));
            if (file.exists()) {
                try {
                    int n10 = i[96];
                    n10 ^= i[97];
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, (String)F[n10 += i[98]]);
                    randomAccessFile.close();
                    return;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    String string = fileNotFoundException.getMessage();
                    if (string != null) {
                        int n11 = i[99];
                        n11 -= i[100];
                        if (string.toLowerCase().contains((String)F[n11 -= i[101]])) {
                            int n12 = i[102];
                            n12 -= i[103];
                            e = n12 += i[104];
                            int n13 = i[105];
                            n13 -= i[106];
                            int n14 = i[108];
                            n14 += i[109];
                            System.err.println((String)F[n13 -= i[107]] + (String)F[n14 ^= i[110]]);
                            return;
                        }
                    }
                }
                catch (Exception exception) {
                    return;
                }
            }
            l3 += 0x100000000L;
        }
    }

    private static ThreadFactory daemonFactory(String name) {
        return runnable -> {
            Thread thread = new Thread(runnable, name);
            boolean bl = i[111];
            bl += i[112];
            thread.setDaemon(bl ^= i[113]);
            return thread;
        };
    }

    static {
        kotakbaz.rain.client.discord.a.b();
        long l2 = -6942389820422550661L;
        long l3 = -1090880933945560371L;
        long l4 = 4608976761243793590L;
        long l5 = 7548414856787731276L;
        long l6 = -3531103609589720598L;
        long l7 = -7976438266602723668L;
        long l8 = 7558039757621523575L;
        long l9 = -8981424094764609133L;
        long l10 = 277258239268475411L;
        long l11 = -2553851477562109287L;
        long l12 = -2860746326376684730L;
        long l13 = 2603156756869782483L;
        long l14 = 1964077544050758939L;
        long l15 = 4229914294643446188L;
        int n2 = i[120];
        n2 += i[121];
        F = new Object[n2 -= i[122]];
        long l16 = l15;
        int n3 = i[123];
        n3 -= i[124];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += i[125]);
        Object[] objectArray = new Object[i[126]];
        objectArray[kotakbaz.rain.client.discord.a.i[127]] = g;
        objectArray[kotakbaz.rain.client.discord.a.i[128]] = i[129];
        int n4 = i[130];
        Object object = kotakbaz.rain.client.discord.a.A()[i[131]];
        if (object == null) {
            char[] cArray = "\u29ca\u29b5\u291c\u29b7\ucf23\u29c3\u29c8\u2a54\ucf8f\u29b3\u2931\u2931\u29b7\u29b8\u2a66\u2a63\ucf23\u29c9\u29b9\u29b7\u29cf\u2a65\ucf12\u29c9\u298b\u2a54\u29b8\u2a68\u2931\u29c3\ucf70\ucf28\u2931\u2a67\u29b3\u29ba\u2a52\u29b3\u2919\u29c3\u2918\ucf27\u2a5d\u29c9\u2a52\u2a65\u2a62\u2a5d\ucf29\ucf12\ucf70\u2916\ucf23\ucf2c\ucf2c\u2a6a\u2a63\u291a\ucf12\u2919\u29c3\u2916\u29bd\ucf23\u2a5d\u2a6a\ucf27\u29c9\u292e\u29ce\u2942\u29b3\u2931\u2916\u2a6c\u2a52\u298d\u29c5\u29b2\u29c9\u2915\u2a54\u29ca\ucf23\u29b9\u298b\u292e\ucf23\u298d\u2915\ucf25\u29b6\u2a6a\u29c5\u2919\u291c\u2a62\u29b2\u29b5\ucf29\ucf14\u29b7\ucf26\u2913\ucf14\u29cc\ucf2a\u2913\u2917\ucf2c\ucf23\u29b8\u29ad\u29b5\u298d\u2a6a\u2931\ucf27\u2942\ucf2a\u29b5\u2a67\u2931\ucf25\ucf28\ucf14\u29c5\u29b7\u29ab\u2913\u2942\ucf14\u2a62\u29c5\u29ba\u2a5d\u29ab\u29cf\u29ce\u29ab\u2919\ucf27\u2a52\u29b3\ucf23\u29b5\u2942\u29b5\u2a63\u2919\u2a69\u29cf\u29ab\ucf27\u2919\u2931\u2a63\u29b0\ucf26\u2a51\u29b3\u29b9\u2a52\u29b3\u29b7\u29c3\u298b\u2916\u2915\u29ce\u2a6c\u2990\u29b0\u298d\u2a68\u29b9\u2915\u29b9\u2931\ucf26\u29b7\u2a69\u2a52\u29ab\u2a6c\u29b7\u29ba\u29c8\u29c3\u2913\ucf70\u291c\u29b6\u2a51\ucf29\u29ad\u2a68\u298b\u29b2\ucf8f\u29cc\u29ca\u2a62\u2913\u29b7\ucf27\u2931\u2a65\ucf2a\u29b7\u2a65\ucf28\u2916\u2934\u2a51\u2990\ucf2c\u29bc\u298b\ucf12\u2a6c\u29ba\u2931\u29c5\ucf12\u2a51\u29ad\u2a67\u29ba\u29ca\ucf2a\u29b8\u2a6a\u2919\u2a54\u29c7\u291a\u29bd\u298d\u2934\u29b2\ucf25\u29ce\u29c5\u2916\u29c3\u29bd\u2917\u2934\u2917\u2a6c\u29b9\u2942\u2a65\u29cc\u2931\ucf26\u2a67\ucf26\u29b0\u2934\u29ce\u29b3\u2942\u29b8\ucf27\u2915\u2a63\u29b6\u29b5\u29ab\u2a68\u29b3\u29b3\u2990\ucf2a\u2a54\u2a51\ucf2c\u298d\u2a52\u29b9\u29cf\u29b7\ucf2c\u2a54\u29c3\u298d\u29c8\u2919\ucf14\u2934\u29ca\u2934\u2a52\u2915\u29bc\u29ad\ucf28\u298b\ucf8f\u29ce\u29b2\u29b2\u29b5\ucf23\ucf14\u291a\u29c7\ucf25\u29b9\u29ce\u2918\ucf26\u2a63\u2915\ucf8f\u29b9\ucf8f\u29bc\ucf23\u29cf\u29cf\u29bc\ucf23\ucf70\u298b\ucf12\u291c\u2916\ucf25\u2a5d\u29c6\u29b0\u2a51\u29b7\u292e\u29b8\u29cf\ucf14\u29c8\u29ab\u2a65\u2942\u2934\u29b9\ucf12\ucf14\u29b2\u29c8\u298b\u2a5d\ucf2c\u29ad\u2a6a\u2a54\ucf8f\ucf2a\u2918\u2915\u2a6c\u2934\u29bc\u29ce\u29b5\u29b5\u2a69\ucf8f\u29b8\u2a5d\u29c7\u298d\ucf70\u2a6c\u29b5\u29c6\u2918\u29ad\u2a63\u2a52\u29cc\ucf23\u2a68\ucf12\u29cc\ucf26\u29b7\u292e\u29b9\u292f\ucf14\ucf27\u2a52\u29c8\u29c9\u29b3\ucf70\u2a69\u2918\ucf25\ucf12\u291a\u2a62\u2a68\u2a52\u29ad\u292e\u2916\u29ca\u2916\ucf70\ucf70\u29c3\u29c6\u29ab\u2a66\ucf25\ucf12\u29ce\u29b8\u29b2\ucf14\u2918\u29cf\u2a65\u2a54\u29ce\u298d\u2a69\u29ce\u29c6\u29b2\u29ad\u2a62\u29ce\u29cf\u2a52\u2a51\u2a65\u2a6a\u29b8\u29c6\u29bd\u2931\u2a6c\u29c3\u29ce\u2a66\u29c8\u2915\u2a68\u2942\u29b9\ucf2a\u2916\u29b2\u29bd\u29b7\ucf25\u29b0\ucf28\u2918\u29c7\u2a5d\u2a62\u29bd\u29c6\u291c\u2a63\u2a6c\u29c8\u29c8\ucf27\u2a63\u29b2\ucf27\u29ab\u29bc\ucf28\u2934\u2a66\u29ba\u29b6\ucf23\ucf12\u2919\ucf12\u29ba\ucf8f\u29bd\u2a54\ucf8f\u29bd\u29ad\u2913\u29bd\u29c7\u29ab\u29cf\u2931\u29b9\u29c5\u29b8\u2918\u2a66\u29b7\u29ab\ucf23\u2915\u29ba\u2a6a\u2a54\ucf2c\u29b0\u2913\u2917\u2a51\u2934\u29bc\u2a69\u292e\u2a6c\u2942\u29b5\ucf26\u2a69\u29cf\ucf26\u29b0\u2a52\u29bc\u29bc\ucf27\ucf23\u29b9\u29ca\u2a66\u29b2\u291c\ucf2c\ucf8f\u29c8\u2917\u298d\u29b7\u2a63\u292f\ucf8f\ucf23\u29c8\u29bc\ucf2c\u2a63\u29c5\u298d\u2919\u2a6c\ucf28\u29ce\ucf28\u29cc\u29b3\ucf28\u29b2\u2919\u2913\u2917\u29ab\u2918\u2a69\u29c3\u2a63\u29ca\u29bd\u2918\u291c\ucf29\ucf2c\u29ce\ucf27\u29bc\u2931\u2a5d\u29c5\u2934\u298b\u29c6\u2a68\ucf23\u29b2\u2a65\u29ca\u2a6c\ucf25\u29c3\u29b8\ucf12\u29c7\u29b2\u29c5\u2a5d\ucf26\ucf2a\u2a67\u2916\u2a6c\u29c5\u2a67\u2a6c\u2a69\ucf23\u29c5\u2916\u2a67\u2a54\u2a6c\u2918\u2a52\u29c7\ucf8f\u291c\u29ca\u2917\u29b3\u2a6a\u2a67\u29c8\u2918\u2a66\u2a62\u292e\ucf29\u2a65\u29ce\ucf25\u29b0\u2916\u29b9\u29b7\u2931\u29c7\u29ab\u29ca\u292f\ucf70\u2a5d\u292f\u29b7\u29c7\u292e\u2a63\ucf27\u2a6a\u2a67\u2a5d\u29bd\u29ab\u29ab\u29b7\ucf12\u2913\u2a62\u292e\u29b2\u291a\u29cf\u2916\u29ca\u29b7\u2919\u2990\u29b9\u2990\ucf14\ucf2c\u2919\u29b7\ucf2a\u29b6\ucf12\u29c3\u2915\ucf25\u2a69\u29b2\u29b6\ucf26\u2a54\ucf23\ucf29\u29ce\u2917\ucf26\ucf14\ucf28\u29b9\ucf2a\u29b2\u2934\u29c8\u29cc\u29ad\ucf12\u29c9".toCharArray();
            for (int i2 = i[132]; i2 < i[133]; ++i2) {
                int n5 = cArray[i2];
                n5 -= i[134];
                n5 ^= i[135];
                n5 ^= i[136];
                n5 += i[137];
                n5 ^= i[138];
                n5 -= i[139];
                n5 ^= i[140];
                n5 -= i[141];
                n5 ^= i[142];
                n5 ^= i[143];
                n5 ^= i[144];
                cArray[i2] = (char)(n5 -= i[145]);
            }
            object = kotakbaz.rain.client.discord.a.A()[kotakbaz.rain.client.discord.a.i[146]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.discord.a.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = i[147];
        n6 ^= i[148];
        l6 = l17 ^ (0x1EC00000000L ^ l17) & -1L << (n6 ^= i[149]);
        long l18 = l13;
        int n7 = i[150];
        n7 ^= i[151];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= i[152]);
        while (true) {
            int n8 = i[153];
            n8 += i[154];
            if ((int)l13 >= (int)(l6 >>> (n8 -= i[155]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = i[156];
            n10 ^= i[157];
            int n11 = i[159];
            n11 -= i[160];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= i[158])) & -1L >>> (n11 += i[161]);
            long l20 = l9;
            int n12 = i[162];
            n12 += i[163];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += i[164]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = i[165];
            n14 += i[166];
            int n15 = i[168];
            n15 -= i[169];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= i[167])) & -1L >>> (n15 += i[170]);
            int n16 = i[171];
            n16 ^= i[172];
            long l22 = l10;
            int n17 = i[174];
            n17 -= i[175];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += i[173]) ^ l22) & -1L << (n17 -= i[176]);
            int n18 = i[177];
            n18 ^= i[178];
            n18 += i[179];
            int n19 = i[180];
            n19 -= i[181];
            long l23 = l12;
            int n20 = i[183];
            n20 ^= i[184];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += i[182]))) ^ l23) & -1L >>> (n20 += i[185]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = i[186];
            n21 -= i[187];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= i[188]);
            while (true) {
                int n22 = i[189];
                n22 -= i[190];
                if ((int)(l14 >>> (n22 -= i[191])) >= (int)l12) break;
                int n23 = i[192];
                n23 -= i[193];
                int n24 = i[195];
                n24 -= i[196];
                cArray2[(int)(l14 >>> (n23 -= kotakbaz.rain.client.discord.a.i[194]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= i[197]))];
                l14 += 0x100000000L;
            }
            int n25 = i[198];
            n25 -= i[199];
            int n26 = (int)(l15 >>> (n25 += i[200]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.discord.a.F[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = i[201];
            n27 -= i[202];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= i[203]);
        }
        C = new Object();
        int n28 = i[204];
        n28 ^= i[205];
        d = n28 -= i[206];
        int n29 = i[207];
        n29 += i[208];
        D = n29 ^= i[209];
        int n30 = i[210];
        n30 += i[211];
        e = n30 -= i[212];
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[i[213]];
        String string = (String)object[i[214]];
        object = object[i[215]];
        Object[] objectArray = h;
        if (h == null) {
            objectArray = h = new Object[i[216]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[i[217]];
                g = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[i[219] ^ i[220]];
                byArray[kotakbaz.rain.client.discord.a.i[221] ^ kotakbaz.rain.client.discord.a.i[222]] = i[223] ^ i[224];
                byArray[kotakbaz.rain.client.discord.a.i[225] ^ kotakbaz.rain.client.discord.a.i[226]] = i[227] ^ i[228];
                byArray[kotakbaz.rain.client.discord.a.i[229] ^ kotakbaz.rain.client.discord.a.i[230]] = i[231] ^ i[232];
                byArray[kotakbaz.rain.client.discord.a.i[233] ^ kotakbaz.rain.client.discord.a.i[234]] = i[235] ^ i[236];
                byArray[kotakbaz.rain.client.discord.a.i[237] ^ kotakbaz.rain.client.discord.a.i[238]] = i[239] ^ i[240];
                byArray[kotakbaz.rain.client.discord.a.i[241] ^ kotakbaz.rain.client.discord.a.i[242]] = i[243] ^ i[244];
                byArray[kotakbaz.rain.client.discord.a.i[245] ^ kotakbaz.rain.client.discord.a.i[246]] = i[247] ^ i[248];
                byArray[kotakbaz.rain.client.discord.a.i[249] ^ kotakbaz.rain.client.discord.a.i[250]] = i[251] ^ i[252];
                byArray[kotakbaz.rain.client.discord.a.i[253] ^ kotakbaz.rain.client.discord.a.i[254]] = i[255] ^ i[256];
                byArray[kotakbaz.rain.client.discord.a.i[257] ^ kotakbaz.rain.client.discord.a.i[258]] = i[259] ^ i[260];
                byArray[kotakbaz.rain.client.discord.a.i[261] ^ kotakbaz.rain.client.discord.a.i[262]] = i[263] ^ i[264];
                byArray[kotakbaz.rain.client.discord.a.i[265] ^ kotakbaz.rain.client.discord.a.i[266]] = i[267] ^ i[268];
                byArray[kotakbaz.rain.client.discord.a.i[269] ^ kotakbaz.rain.client.discord.a.i[270]] = i[271] ^ i[272];
                byArray[kotakbaz.rain.client.discord.a.i[273] ^ kotakbaz.rain.client.discord.a.i[274]] = i[275] ^ i[276];
                byArray[kotakbaz.rain.client.discord.a.i[277] ^ kotakbaz.rain.client.discord.a.i[278]] = i[279] ^ i[280];
                byArray[kotakbaz.rain.client.discord.a.i[281] ^ kotakbaz.rain.client.discord.a.i[282]] = i[283] ^ i[284];
                objectArray2[kotakbaz.rain.client.discord.a.i[218]] = byArray;
            }
            byte[] byArray = (byte[])object3[i[285]];
            if (G == null) {
                byte[] byArray2 = new byte[i[286] ^ i[287]];
                byArray2[kotakbaz.rain.client.discord.a.i[288] ^ kotakbaz.rain.client.discord.a.i[289]] = i[290] ^ i[291];
                byArray2[kotakbaz.rain.client.discord.a.i[292] ^ kotakbaz.rain.client.discord.a.i[293]] = i[294] ^ i[295];
                byArray2[kotakbaz.rain.client.discord.a.i[296] ^ kotakbaz.rain.client.discord.a.i[297]] = i[298] ^ i[299];
                byArray2[kotakbaz.rain.client.discord.a.i[300] ^ kotakbaz.rain.client.discord.a.i[301]] = i[302] ^ i[303];
                byArray2[kotakbaz.rain.client.discord.a.i[304] ^ kotakbaz.rain.client.discord.a.i[305]] = i[306] ^ i[307];
                byArray2[kotakbaz.rain.client.discord.a.i[308] ^ kotakbaz.rain.client.discord.a.i[309]] = i[310] ^ i[311];
                byArray2[kotakbaz.rain.client.discord.a.i[312] ^ kotakbaz.rain.client.discord.a.i[313]] = i[314] ^ i[315];
                byArray2[kotakbaz.rain.client.discord.a.i[316] ^ kotakbaz.rain.client.discord.a.i[317]] = i[318] ^ i[319];
                byArray2[kotakbaz.rain.client.discord.a.i[320] ^ kotakbaz.rain.client.discord.a.i[321]] = i[322] ^ i[323];
                byArray2[kotakbaz.rain.client.discord.a.i[324] ^ kotakbaz.rain.client.discord.a.i[325]] = i[326] ^ i[327];
                byArray2[kotakbaz.rain.client.discord.a.i[328] ^ kotakbaz.rain.client.discord.a.i[329]] = i[330] ^ i[331];
                byArray2[kotakbaz.rain.client.discord.a.i[332] ^ kotakbaz.rain.client.discord.a.i[333]] = i[334] ^ i[335];
                byArray2[kotakbaz.rain.client.discord.a.i[336] ^ kotakbaz.rain.client.discord.a.i[337]] = i[338] ^ i[339];
                byArray2[kotakbaz.rain.client.discord.a.i[340] ^ kotakbaz.rain.client.discord.a.i[341]] = i[342] ^ i[343];
                byArray2[kotakbaz.rain.client.discord.a.i[344] ^ kotakbaz.rain.client.discord.a.i[345]] = i[346] ^ i[347];
                byArray2[kotakbaz.rain.client.discord.a.i[348] ^ kotakbaz.rain.client.discord.a.i[349]] = i[350] ^ i[351];
                byArray2[kotakbaz.rain.client.discord.a.i[352] ^ kotakbaz.rain.client.discord.a.i[353]] = i[354] ^ i[355];
                byArray2[kotakbaz.rain.client.discord.a.i[356] ^ kotakbaz.rain.client.discord.a.i[357]] = i[358] ^ i[359];
                byArray2[kotakbaz.rain.client.discord.a.i[360] ^ kotakbaz.rain.client.discord.a.i[361]] = i[362] ^ i[363];
                byArray2[kotakbaz.rain.client.discord.a.i[364] ^ kotakbaz.rain.client.discord.a.i[365]] = i[366] ^ i[367];
                byArray2[kotakbaz.rain.client.discord.a.i[368] ^ kotakbaz.rain.client.discord.a.i[369]] = i[370] ^ i[371];
                byArray2[kotakbaz.rain.client.discord.a.i[372] ^ kotakbaz.rain.client.discord.a.i[373]] = i[374] ^ i[375];
                byArray2[kotakbaz.rain.client.discord.a.i[376] ^ kotakbaz.rain.client.discord.a.i[377]] = i[378] ^ i[379];
                byArray2[kotakbaz.rain.client.discord.a.i[380] ^ kotakbaz.rain.client.discord.a.i[381]] = i[382] ^ i[383];
                byArray2[kotakbaz.rain.client.discord.a.i[384] ^ kotakbaz.rain.client.discord.a.i[385]] = i[386] ^ i[387];
                byArray2[kotakbaz.rain.client.discord.a.i[388] ^ kotakbaz.rain.client.discord.a.i[389]] = i[390] ^ i[391];
                byArray2[kotakbaz.rain.client.discord.a.i[392] ^ kotakbaz.rain.client.discord.a.i[393]] = i[394] ^ i[395];
                byArray2[kotakbaz.rain.client.discord.a.i[396] ^ kotakbaz.rain.client.discord.a.i[397]] = i[398] ^ i[399];
                byArray2[0xD0FA ^ 0xD0FB] = 0xFFFF2F2E ^ 0xD0FB;
                byArray2[0x2DED ^ 0x2DFC] = 0xFFFFD21E ^ 0x2DFC;
                byArray2[0x10939 ^ 0x10920] = 0x1094E ^ 0x10920;
                byArray2[0x6D47 ^ 0x6D42] = 0xFFFF92C3 ^ 0x6D42;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.discord.a.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uccd4\ucd02\uccdd\uc920\uc93e\uccb2\ucc71\ucc77\ucc90\ucc7c\uccdc\ucc73\uccdf\ucca5\uccd5\uccdc\uc93f\uccaf".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 3808;
                        n3 ^= 0xCA10;
                        n3 -= 20786;
                        n3 ^= 0x3FB2;
                        n3 += 37586;
                        n3 += 15570;
                        n3 ^= 0xCB57;
                        n3 ^= 0x8F78;
                        n3 -= 5177;
                        n3 ^= 0x444D;
                        cArray[i2] = (char)(n3 ^= 0x330F);
                    }
                    object4 = kotakbaz.rain.client.discord.a.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[8] = 87;
                byArray4[3] = 104;
                byArray4[14] = -44;
                byArray4[6] = 37;
                byArray4[11] = 110;
                byArray4[4] = -86;
                byArray4[9] = 34;
                byArray4[15] = -84;
                byArray4[0] = 81;
                byArray4[5] = -85;
                byArray4[1] = 120;
                byArray4[13] = 107;
                byArray4[10] = 23;
                byArray4[2] = -73;
                byArray4[12] = 9;
                byArray4[7] = 43;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 13, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.discord.a.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ub96c\ub968\ub976".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 62480;
                        n4 -= 34832;
                        n4 ^= 0x6850;
                        n4 -= 17729;
                        n4 -= 45796;
                        n4 ^= 0xEA54;
                        n4 += 18152;
                        n4 += 54314;
                        n4 += 43674;
                        n4 += 35739;
                        n4 += 17707;
                        cArray[i3] = (char)(n4 += 45868);
                    }
                    object5 = kotakbaz.rain.client.discord.a.A()[2] = new String(cArray);
                }
                G = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.discord.a.A()[3];
            if (object6 == null) {
                char[] cArray = "\u2e90\u2e9c\u2eae\u2e82\u2e9e\u2e91\u2e9e\u2e82\u2ea3\u2ea6\u2e9e\u2eae\u2e8c\u2ea3\u2f30\u2f3f\u2f3f\u2f38\u2f45\u2f3a".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 46672;
                    n5 ^= 0xD72;
                    n5 -= 58740;
                    n5 += 40788;
                    n5 ^= 0x9834;
                    n5 -= 54406;
                    n5 += 55657;
                    n5 -= 60618;
                    n5 += 9131;
                    n5 -= 60653;
                    n5 -= 27086;
                    cArray[i4] = (char)(n5 -= 39918);
                }
                object6 = kotakbaz.rain.client.discord.a.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)G), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = H;
        if (H == null) {
            H = new Object[4];
            objectArray = H;
        }
        return objectArray;
    }

    public static void b() {
        i = new int[0x2281 ^ 0x2311];
        kotakbaz.rain.client.discord.a.i[0xE9C8 ^ 0xE910] = 0xE911 ^ 0xE910;
        kotakbaz.rain.client.discord.a.i[0x2CB3 ^ 0x2C31] = 0x2C33 ^ 0x2C31;
        kotakbaz.rain.client.discord.a.i[0xD06A ^ 0xD01F] = 0xD05F ^ 0xD01F;
        kotakbaz.rain.client.discord.a.i[0x3B68 ^ 0x3BDB] = 0xFFFFC433 ^ 0x3BDB;
        kotakbaz.rain.client.discord.a.i[0x66CA ^ 0x674E] = 0xDB45 ^ 0x674E;
        kotakbaz.rain.client.discord.a.i[0x6D17 ^ 0x6D60] = 0x6D48 ^ 0x6D60;
        kotakbaz.rain.client.discord.a.i[0xFACC ^ 0xFACB] = 0xFAFE ^ 0xFACB;
        kotakbaz.rain.client.discord.a.i[0x181A ^ 0x18CF] = 0x18CE ^ 0x18CF;
        kotakbaz.rain.client.discord.a.i[0x9DCB ^ 0x9D59] = 0x9D59 ^ 0x9D59;
        kotakbaz.rain.client.discord.a.i[0xAAB5 ^ 0xAA16] = 0xAA30 ^ 0xAA16;
        kotakbaz.rain.client.discord.a.i[0x108FD ^ 0x10972] = 0x18480 ^ 0x10972;
        kotakbaz.rain.client.discord.a.i[0x4B8D ^ 0x4B3D] = 0x4B56 ^ 0x4B3D;
        kotakbaz.rain.client.discord.a.i[0x4708 ^ 0x4667] = 0xF07E ^ 0x4667;
        kotakbaz.rain.client.discord.a.i[0xA3E ^ 0xA6C] = 0xFFFFF5B1 ^ 0xA6C;
        kotakbaz.rain.client.discord.a.i[0xC368 ^ 0xC3FF] = 0xC3DE ^ 0xC3FF;
        kotakbaz.rain.client.discord.a.i[0x32E4 ^ 0x32C4] = 0x32B8 ^ 0x32C4;
        kotakbaz.rain.client.discord.a.i[0x524A ^ 0x52E0] = 0xFFFFAD06 ^ 0x52E0;
        kotakbaz.rain.client.discord.a.i[0x10701 ^ 0x10765] = 0x10735 ^ 0x10765;
        kotakbaz.rain.client.discord.a.i[0x971F ^ 0x970A] = 0x974D ^ 0x970A;
        kotakbaz.rain.client.discord.a.i[0xA36A ^ 0xA268] = 0x20FD ^ 0xA268;
        kotakbaz.rain.client.discord.a.i[0x2361 ^ 0x236C] = 0xFFFFDCC9 ^ 0x236C;
        kotakbaz.rain.client.discord.a.i[0x7ADE ^ 0x7BF3] = 0xA625 ^ 0x7BF3;
        kotakbaz.rain.client.discord.a.i[0x2AAE ^ 0x2BBA] = 0x1274 ^ 0x2BBA;
        kotakbaz.rain.client.discord.a.i[0xB9E8 ^ 0xB88D] = 0x4406 ^ 0xB88D;
        kotakbaz.rain.client.discord.a.i[0x21A8 ^ 0x20FB] = 0x9360 ^ 0x20FB;
        kotakbaz.rain.client.discord.a.i[0xBDE0 ^ 0xBCB8] = 0xA34C ^ 0xBCB8;
        kotakbaz.rain.client.discord.a.i[0xE3DE ^ 0xE355] = 0xE9DE ^ 0xE355;
        kotakbaz.rain.client.discord.a.i[0xD56 ^ 0xC4F] = 0xC1D7 ^ 0xC4F;
        kotakbaz.rain.client.discord.a.i[0x154A ^ 0x152F] = 0x1573 ^ 0x152F;
        kotakbaz.rain.client.discord.a.i[0xC17A ^ 0xC0FA] = 0x8EB3 ^ 0xC0FA;
        kotakbaz.rain.client.discord.a.i[0xA75A ^ 0xA773] = 0xA73D ^ 0xA773;
        kotakbaz.rain.client.discord.a.i[0x8A5B ^ 0x8B6C] = 0x1877B ^ 0x8B6C;
        kotakbaz.rain.client.discord.a.i[0xCE7A ^ 0xCEEC] = 0xFFFF3106 ^ 0xCEEC;
        kotakbaz.rain.client.discord.a.i[0xCABE ^ 0xCBDE] = 0xDBCF ^ 0xCBDE;
        kotakbaz.rain.client.discord.a.i[0xD169 ^ 0xD01F] = 0x3CF0 ^ 0xD01F;
        kotakbaz.rain.client.discord.a.i[0x9184 ^ 0x91D4] = 0xFFFF6E35 ^ 0x91D4;
        kotakbaz.rain.client.discord.a.i[0xFE25 ^ 0xFF36] = 0xFFFF3941 ^ 0xFF36;
        kotakbaz.rain.client.discord.a.i[0x1CBF ^ 0x1D95] = 0x3E8A ^ 0x1D95;
        kotakbaz.rain.client.discord.a.i[0x10E83 ^ 0x10E09] = 0x15FE3 ^ 0x10E09;
        kotakbaz.rain.client.discord.a.i[0x105F7 ^ 0x104C7] = 0x1B47D ^ 0x104C7;
        kotakbaz.rain.client.discord.a.i[0x1F40 ^ 0x1FFA] = 0xFFFFE007 ^ 0x1FFA;
        kotakbaz.rain.client.discord.a.i[0x643F ^ 0x6425] = 0x6470 ^ 0x6425;
        kotakbaz.rain.client.discord.a.i[0xED9 ^ 0xE9D] = 0xFFFFF17D ^ 0xE9D;
        kotakbaz.rain.client.discord.a.i[0x2D0D ^ 0x2DDD] = 0x2DA4 ^ 0x2DDD;
        kotakbaz.rain.client.discord.a.i[0xD20A ^ 0xD35F] = 0xC09F ^ 0xD35F;
        kotakbaz.rain.client.discord.a.i[0x101BF ^ 0x10179] = 0x10151 ^ 0x10179;
        kotakbaz.rain.client.discord.a.i[0xB67 ^ 0xB97] = 0x533E ^ 0xB97;
        kotakbaz.rain.client.discord.a.i[0xCBE3 ^ 0xCB5E] = 0xFFFF3419 ^ 0xCB5E;
        kotakbaz.rain.client.discord.a.i[0xAA ^ 0x96] = 0xC3 ^ 0x96;
        kotakbaz.rain.client.discord.a.i[0xC14E ^ 0xC1B0] = 0x300D ^ 0xC1B0;
        kotakbaz.rain.client.discord.a.i[0x105BF ^ 0x10506] = 0x1055A ^ 0x10506;
        kotakbaz.rain.client.discord.a.i[0xAB24 ^ 0xAB2A] = 0xFFFF54E9 ^ 0xAB2A;
        kotakbaz.rain.client.discord.a.i[0xC532 ^ 0xC46B] = 0xDB96 ^ 0xC46B;
        kotakbaz.rain.client.discord.a.i[0xE149 ^ 0xE032] = 0x4C1B ^ 0xE032;
        kotakbaz.rain.client.discord.a.i[0x134C ^ 0x13B1] = 0xE203 ^ 0x13B1;
        kotakbaz.rain.client.discord.a.i[0xAFF7 ^ 0xAFBC] = 0xFFFF50F8 ^ 0xAFBC;
        kotakbaz.rain.client.discord.a.i[0x416B ^ 0x41AA] = 0xFFFFBE20 ^ 0x41AA;
        kotakbaz.rain.client.discord.a.i[0xEDF2 ^ 0xECD4] = 0xFFFF1CDC ^ 0xECD4;
        kotakbaz.rain.client.discord.a.i[0xBD75 ^ 0xBC00] = 0x50F6 ^ 0xBC00;
        kotakbaz.rain.client.discord.a.i[0xD55E ^ 0xD531] = 0xD504 ^ 0xD531;
        kotakbaz.rain.client.discord.a.i[0x85CC ^ 0x84C2] = 0xF2B8 ^ 0x84C2;
        kotakbaz.rain.client.discord.a.i[0x9A3 ^ 0x9DD] = 0x9DE ^ 0x9DD;
        kotakbaz.rain.client.discord.a.i[0x634F ^ 0x63B7] = 0xE7FD ^ 0x63B7;
        kotakbaz.rain.client.discord.a.i[0xB285 ^ 0xB383] = 0xD028 ^ 0xB383;
        kotakbaz.rain.client.discord.a.i[0x64AF ^ 0x6476] = 0x6477 ^ 0x6476;
        kotakbaz.rain.client.discord.a.i[0xF85B ^ 0xF828] = 0xF862 ^ 0xF828;
        kotakbaz.rain.client.discord.a.i[0xF10D ^ 0xF18D] = 0xF18C ^ 0xF18D;
        kotakbaz.rain.client.discord.a.i[0x97AC ^ 0x9685] = 0xB5A4 ^ 0x9685;
        kotakbaz.rain.client.discord.a.i[0xDA26 ^ 0xDAB6] = 0xF4F9 ^ 0xDAB6;
        kotakbaz.rain.client.discord.a.i[0x6B4C ^ 0x6B5E] = 0x6BF3 ^ 0x6B5E;
        kotakbaz.rain.client.discord.a.i[0x103B ^ 0x1018] = 0x1017 ^ 0x1018;
        kotakbaz.rain.client.discord.a.i[0xD78E ^ 0xD6B1] = 0xF697 ^ 0xD6B1;
        kotakbaz.rain.client.discord.a.i[0x8BA8 ^ 0x8B68] = 0x8B6F ^ 0x8B68;
        kotakbaz.rain.client.discord.a.i[0xA934 ^ 0xA9C0] = 0xCAAC ^ 0xA9C0;
        kotakbaz.rain.client.discord.a.i[0x8F90 ^ 0x8FF0] = 0x8FC9 ^ 0x8FF0;
        kotakbaz.rain.client.discord.a.i[0x594D ^ 0x59D3] = 0xFFFFA642 ^ 0x59D3;
        kotakbaz.rain.client.discord.a.i[0x383C ^ 0x3890] = 0xFFFFC71B ^ 0x3890;
        kotakbaz.rain.client.discord.a.i[0x543A ^ 0x54C5] = 0xA575 ^ 0x54C5;
        kotakbaz.rain.client.discord.a.i[0x85E2 ^ 0x84FC] = 0x88BE ^ 0x84FC;
        kotakbaz.rain.client.discord.a.i[0xCA1 ^ 0xDCD] = 0xBBCC ^ 0xDCD;
        kotakbaz.rain.client.discord.a.i[0x10743 ^ 0x1064F] = 0x1592C ^ 0x1064F;
        kotakbaz.rain.client.discord.a.i[0x1C59 ^ 0x1D7D] = 0x12C7 ^ 0x1D7D;
        kotakbaz.rain.client.discord.a.i[0x41A ^ 0x40E] = 0x447 ^ 0x40E;
        kotakbaz.rain.client.discord.a.i[0xBBEB ^ 0xBB88] = 0xBB3D ^ 0xBB88;
        kotakbaz.rain.client.discord.a.i[0xF5CA ^ 0xF483] = 0x703F ^ 0xF483;
        kotakbaz.rain.client.discord.a.i[0xF143 ^ 0xF1CD] = 0xEEC0 ^ 0xF1CD;
        kotakbaz.rain.client.discord.a.i[0xA9AD ^ 0xA8BA] = 0xFFFF55BE ^ 0xA8BA;
        kotakbaz.rain.client.discord.a.i[0xE3F ^ 0xF1C] = 0x2338 ^ 0xF1C;
        kotakbaz.rain.client.discord.a.i[0xC21D ^ 0xC24E] = 0xC23A ^ 0xC24E;
        kotakbaz.rain.client.discord.a.i[0x5B41 ^ 0x5AC4] = 0xE6DC ^ 0x5AC4;
        kotakbaz.rain.client.discord.a.i[0x1080C ^ 0x10866] = 0x10851 ^ 0x10866;
        kotakbaz.rain.client.discord.a.i[0xAC74 ^ 0xAC90] = 0x2AE4 ^ 0xAC90;
        kotakbaz.rain.client.discord.a.i[0xCAE6 ^ 0xCBED] = 0xFFFF6B3E ^ 0xCBED;
        kotakbaz.rain.client.discord.a.i[0xA099 ^ 0xA1A3] = 0xFFFF9B02 ^ 0xA1A3;
        kotakbaz.rain.client.discord.a.i[0x5CD7 ^ 0x5C78] = 0x5C68 ^ 0x5C78;
        kotakbaz.rain.client.discord.a.i[0x5B15 ^ 0x5B8E] = 0xFFFFA47E ^ 0x5B8E;
        kotakbaz.rain.client.discord.a.i[0xC92 ^ 0xDE3] = 0x69B4 ^ 0xDE3;
        kotakbaz.rain.client.discord.a.i[0x404E ^ 0x417F] = 0xF1C6 ^ 0x417F;
        kotakbaz.rain.client.discord.a.i[0x107DB ^ 0x106E9] = 0x1B609 ^ 0x106E9;
        kotakbaz.rain.client.discord.a.i[0xD55B ^ 0xD44B] = 0xA231 ^ 0xD44B;
        kotakbaz.rain.client.discord.a.i[0x6949 ^ 0x6823] = 0xFFFF33E0 ^ 0x6823;
        kotakbaz.rain.client.discord.a.i[0xEBA2 ^ 0xEB1C] = 0xFFFF1498 ^ 0xEB1C;
        kotakbaz.rain.client.discord.a.i[0x6010 ^ 0x60D2] = 0x608F ^ 0x60D2;
        kotakbaz.rain.client.discord.a.i[0xFC27 ^ 0xFCD4] = 0xFFFF605C ^ 0xFCD4;
        kotakbaz.rain.client.discord.a.i[0xD844 ^ 0xD8A5] = 0x5ED7 ^ 0xD8A5;
        kotakbaz.rain.client.discord.a.i[0x71CE ^ 0x71B3] = 0x7189 ^ 0x71B3;
        kotakbaz.rain.client.discord.a.i[0x1E4B ^ 0x1F72] = 0xDA45 ^ 0x1F72;
        kotakbaz.rain.client.discord.a.i[0xFD1A ^ 0xFC71] = 0x5856 ^ 0xFC71;
        kotakbaz.rain.client.discord.a.i[0x2850 ^ 0x2959] = 0x7636 ^ 0x2959;
        kotakbaz.rain.client.discord.a.i[0x437A ^ 0x43B1] = 0xFFFFBC77 ^ 0x43B1;
        kotakbaz.rain.client.discord.a.i[0x10CBD ^ 0x10C18] = 0xFFFEF3B0 ^ 0x10C18;
        kotakbaz.rain.client.discord.a.i[0xCF26 ^ 0xCE4F] = 0x6A68 ^ 0xCE4F;
        kotakbaz.rain.client.discord.a.i[0xE530 ^ 0xE5D0] = 0xE0A ^ 0xE5D0;
        kotakbaz.rain.client.discord.a.i[0x10524 ^ 0x105B7] = 0x105D9 ^ 0x105B7;
        kotakbaz.rain.client.discord.a.i[0x1D1D ^ 0x1D37] = 0xFFFFE2F9 ^ 0x1D37;
        kotakbaz.rain.client.discord.a.i[0xC9CB ^ 0xC8F7] = 0xE8C5 ^ 0xC8F7;
        kotakbaz.rain.client.discord.a.i[0xFB84 ^ 0xFB92] = 0xFFFF046F ^ 0xFB92;
        kotakbaz.rain.client.discord.a.i[0x100B6 ^ 0x101ED] = 0x11E10 ^ 0x101ED;
        kotakbaz.rain.client.discord.a.i[0x3EF3 ^ 0x3F8E] = 0xA7B ^ 0x3F8E;
        kotakbaz.rain.client.discord.a.i[0x1BAB ^ 0x1AAE] = 0x790B ^ 0x1AAE;
        kotakbaz.rain.client.discord.a.i[0x5500 ^ 0x55F6] = 0xD1BC ^ 0x55F6;
        kotakbaz.rain.client.discord.a.i[0x39A9 ^ 0x3901] = 0x39AB ^ 0x3901;
        kotakbaz.rain.client.discord.a.i[0x10C0A ^ 0x10C9E] = 0xFFFEF343 ^ 0x10C9E;
        kotakbaz.rain.client.discord.a.i[0x8063 ^ 0x808B] = 0xD954 ^ 0x808B;
        kotakbaz.rain.client.discord.a.i[0x9986 ^ 0x991F] = 0x9996 ^ 0x991F;
        kotakbaz.rain.client.discord.a.i[0x8CD2 ^ 0x8CB4] = 0xFFFF731F ^ 0x8CB4;
        kotakbaz.rain.client.discord.a.i[0x4199 ^ 0x41AA] = 0x41E9 ^ 0x41AA;
        kotakbaz.rain.client.discord.a.i[0xA668 ^ 0xA669] = 0xFFFF59AC ^ 0xA669;
        kotakbaz.rain.client.discord.a.i[0x613D ^ 0x61EF] = 0x6183 ^ 0x61EF;
        kotakbaz.rain.client.discord.a.i[0x21B5 ^ 0x20A0] = 0x2201 ^ 0x20A0;
        kotakbaz.rain.client.discord.a.i[0xB5C ^ 0xB24] = 0xB03 ^ 0xB24;
        kotakbaz.rain.client.discord.a.i[0xC278 ^ 0xC20A] = 0xFFFF3D42 ^ 0xC20A;
        kotakbaz.rain.client.discord.a.i[0x7A6B ^ 0x7B6B] = 0x8AD6 ^ 0x7B6B;
        kotakbaz.rain.client.discord.a.i[0xC6E0 ^ 0xC689] = 0xFFFF3956 ^ 0xC689;
        kotakbaz.rain.client.discord.a.i[0xD5F3 ^ 0xD524] = 0xD524 ^ 0xD524;
        kotakbaz.rain.client.discord.a.i[0x188D ^ 0x18B8] = 0xFFFFE742 ^ 0x18B8;
        kotakbaz.rain.client.discord.a.i[0x1B4 ^ 0xE3] = 0x1323 ^ 0xE3;
        kotakbaz.rain.client.discord.a.i[0x270C ^ 0x2755] = 0x270C ^ 0x2755;
        kotakbaz.rain.client.discord.a.i[0x461A ^ 0x477B] = 0x5761 ^ 0x477B;
        kotakbaz.rain.client.discord.a.i[0x5A49 ^ 0x5A25] = 0x5A44 ^ 0x5A25;
        kotakbaz.rain.client.discord.a.i[0x3576 ^ 0x3475] = 0xB6FA ^ 0x3475;
        kotakbaz.rain.client.discord.a.i[0x9DE1 ^ 0x9DFA] = 0xFFFF6278 ^ 0x9DFA;
        kotakbaz.rain.client.discord.a.i[0xF75F ^ 0xF77E] = 0xFFFF08AF ^ 0xF77E;
        kotakbaz.rain.client.discord.a.i[0x9C77 ^ 0x9C7B] = 0x9CE6 ^ 0x9C7B;
        kotakbaz.rain.client.discord.a.i[0x5A01 ^ 0x5AE6] = 0xFFFFFC9A ^ 0x5AE6;
        kotakbaz.rain.client.discord.a.i[0x3B4B ^ 0x3B52] = 0xFFFFC4ED ^ 0x3B52;
        kotakbaz.rain.client.discord.a.i[0x5FC ^ 0x492] = 0xFFFF4D6E ^ 0x492;
        kotakbaz.rain.client.discord.a.i[0x106BF ^ 0x1060E] = 0x10664 ^ 0x1060E;
        kotakbaz.rain.client.discord.a.i[0xA8B ^ 0xAA6] = 0xAB8 ^ 0xAA6;
        kotakbaz.rain.client.discord.a.i[0x7D4D ^ 0x7CC5] = 0xDED9 ^ 0x7CC5;
        kotakbaz.rain.client.discord.a.i[0x3372 ^ 0x336C] = 0xFFFFCC55 ^ 0x336C;
        kotakbaz.rain.client.discord.a.i[0x71B3 ^ 0x71FC] = 0x71DE ^ 0x71FC;
        kotakbaz.rain.client.discord.a.i[0x1AA0 ^ 0x1BD2] = 0x7FF1 ^ 0x1BD2;
        kotakbaz.rain.client.discord.a.i[0x4A3F ^ 0x4B47] = 0xE76A ^ 0x4B47;
        kotakbaz.rain.client.discord.a.i[0xF2AB ^ 0xF213] = 0xFFFF0DDB ^ 0xF213;
        kotakbaz.rain.client.discord.a.i[0xA07A ^ 0xA165] = 0xAD07 ^ 0xA165;
        kotakbaz.rain.client.discord.a.i[0x5252 ^ 0x531E] = 0x56C4 ^ 0x531E;
        kotakbaz.rain.client.discord.a.i[0xAD1C ^ 0xAD1C] = 0xAD2D ^ 0xAD1C;
        kotakbaz.rain.client.discord.a.i[0xDD87 ^ 0xDC0D] = 0xFFFF81E4 ^ 0xDC0D;
        kotakbaz.rain.client.discord.a.i[0xDA14 ^ 0xDA7C] = 0xDA40 ^ 0xDA7C;
        kotakbaz.rain.client.discord.a.i[0xCE59 ^ 0xCF6A] = 0x7FD3 ^ 0xCF6A;
        kotakbaz.rain.client.discord.a.i[0x8D1D ^ 0x8DB0] = 0x8DDD ^ 0x8DB0;
        kotakbaz.rain.client.discord.a.i[0xB946 ^ 0xB97D] = 0xB944 ^ 0xB97D;
        kotakbaz.rain.client.discord.a.i[0x1B10 ^ 0x1A5F] = 0x1F8A ^ 0x1A5F;
        kotakbaz.rain.client.discord.a.i[0x80EF ^ 0x80FC] = 0x8098 ^ 0x80FC;
        kotakbaz.rain.client.discord.a.i[0xCDBE ^ 0xCDF2] = 0xFFFF323B ^ 0xCDF2;
        kotakbaz.rain.client.discord.a.i[0x51E6 ^ 0x5082] = 0xAC1E ^ 0x5082;
        kotakbaz.rain.client.discord.a.i[0xEB39 ^ 0xEA46] = 0xDFB3 ^ 0xEA46;
        kotakbaz.rain.client.discord.a.i[0xB346 ^ 0xB327] = 0xB345 ^ 0xB327;
        kotakbaz.rain.client.discord.a.i[0x102FD ^ 0x1024A] = 0x10246 ^ 0x1024A;
        kotakbaz.rain.client.discord.a.i[0x14F5 ^ 0x1419] = 0x3087 ^ 0x1419;
        kotakbaz.rain.client.discord.a.i[0x521E ^ 0x5369] = 0xBF9F ^ 0x5369;
        kotakbaz.rain.client.discord.a.i[0x8E17 ^ 0x8EFE] = 0xAA6D ^ 0x8EFE;
        kotakbaz.rain.client.discord.a.i[0x8CC3 ^ 0x8D88] = 0x934 ^ 0x8D88;
        kotakbaz.rain.client.discord.a.i[0x6E2D ^ 0x6F77] = 0xFFFF8F4D ^ 0x6F77;
        kotakbaz.rain.client.discord.a.i[0x53CB ^ 0x53B1] = 0xFFFFAC15 ^ 0x53B1;
        kotakbaz.rain.client.discord.a.i[0xA8FF ^ 0xA8A8] = 0xFFFF5744 ^ 0xA8A8;
        kotakbaz.rain.client.discord.a.i[0x3E75 ^ 0x3E4D] = 0xFFFFC184 ^ 0x3E4D;
        kotakbaz.rain.client.discord.a.i[0x1459 ^ 0x1414] = 0xFFFFEB87 ^ 0x1414;
        kotakbaz.rain.client.discord.a.i[0x518E ^ 0x51E5] = 0xFFFFAE47 ^ 0x51E5;
        kotakbaz.rain.client.discord.a.i[0xFCDF ^ 0xFD5D] = 0xB36B ^ 0xFD5D;
        kotakbaz.rain.client.discord.a.i[0x103A7 ^ 0x103BB] = 0xFFFEFC14 ^ 0x103BB;
        kotakbaz.rain.client.discord.a.i[0x94D1 ^ 0x94BC] = 0x94AD ^ 0x94BC;
        kotakbaz.rain.client.discord.a.i[0x4F9D ^ 0x4F39] = 0x4F13 ^ 0x4F39;
        kotakbaz.rain.client.discord.a.i[0xB4EB ^ 0xB4E8] = 0xFFFF4B36 ^ 0xB4E8;
        kotakbaz.rain.client.discord.a.i[0xFC11 ^ 0xFCD6] = 0xFC94 ^ 0xFCD6;
        kotakbaz.rain.client.discord.a.i[0x1D70 ^ 0x1DF4] = 0x1DF4 ^ 0x1DF4;
        kotakbaz.rain.client.discord.a.i[0x346C ^ 0x352F] = 0x71F9 ^ 0x352F;
        kotakbaz.rain.client.discord.a.i[0x2C61 ^ 0x2C17] = 0x2C63 ^ 0x2C17;
        kotakbaz.rain.client.discord.a.i[0xE522 ^ 0xE5EB] = 0xE5ED ^ 0xE5EB;
        kotakbaz.rain.client.discord.a.i[0x199A ^ 0x1975] = 0x41F0 ^ 0x1975;
        kotakbaz.rain.client.discord.a.i[0xE198 ^ 0xE102] = 0xFFFF1E85 ^ 0xE102;
        kotakbaz.rain.client.discord.a.i[0x8C0E ^ 0x8CB5] = 0x8CF9 ^ 0x8CB5;
        kotakbaz.rain.client.discord.a.i[0x6F88 ^ 0x6EF6] = 0x5B03 ^ 0x6EF6;
        kotakbaz.rain.client.discord.a.i[0x82FD ^ 0x839A] = 0x7F11 ^ 0x839A;
        kotakbaz.rain.client.discord.a.i[0x4E38 ^ 0x4F48] = 0x2B03 ^ 0x4F48;
        kotakbaz.rain.client.discord.a.i[0xB3CF ^ 0xB35A] = 0xFFFF4CC9 ^ 0xB35A;
        kotakbaz.rain.client.discord.a.i[0x5E79 ^ 0x5E94] = 0x639 ^ 0x5E94;
        kotakbaz.rain.client.discord.a.i[0xA29D ^ 0xA3C3] = 0xFFFFEE21 ^ 0xA3C3;
        kotakbaz.rain.client.discord.a.i[0xBF22 ^ 0xBFE1] = 0xBF85 ^ 0xBFE1;
        kotakbaz.rain.client.discord.a.i[0x10828 ^ 0x108B7] = 0xFFFEF70F ^ 0x108B7;
        kotakbaz.rain.client.discord.a.i[0x8E72 ^ 0x8E7D] = 0x8E21 ^ 0x8E7D;
        kotakbaz.rain.client.discord.a.i[0xF9AA ^ 0xF96F] = 0xF937 ^ 0xF96F;
        kotakbaz.rain.client.discord.a.i[0xC6CE ^ 0xC6FE] = 0xC687 ^ 0xC6FE;
        kotakbaz.rain.client.discord.a.i[0xF9E1 ^ 0xF962] = 0xF962 ^ 0xF962;
        kotakbaz.rain.client.discord.a.i[0x8986 ^ 0x89D7] = 0x89EA ^ 0x89D7;
        kotakbaz.rain.client.discord.a.i[0x4A1B ^ 0x4B4D] = 0xFFFFA711 ^ 0x4B4D;
        kotakbaz.rain.client.discord.a.i[0xDEA6 ^ 0xDFE2] = 0x3EE ^ 0xDFE2;
        kotakbaz.rain.client.discord.a.i[0xC712 ^ 0xC702] = 0xC777 ^ 0xC702;
        kotakbaz.rain.client.discord.a.i[0x4F19 ^ 0x4FA6] = 0xFFFFB005 ^ 0x4FA6;
        kotakbaz.rain.client.discord.a.i[0x27C8 ^ 0x278A] = 0x27CB ^ 0x278A;
        kotakbaz.rain.client.discord.a.i[0x6A54 ^ 0x6B71] = 0x64C7 ^ 0x6B71;
        kotakbaz.rain.client.discord.a.i[0x1CBD ^ 0x1DAF] = 0x2461 ^ 0x1DAF;
        kotakbaz.rain.client.discord.a.i[0xD5C4 ^ 0xD44D] = 0x7643 ^ 0xD44D;
        kotakbaz.rain.client.discord.a.i[0xB23E ^ 0xB30A] = 0x1BF1B ^ 0xB30A;
        kotakbaz.rain.client.discord.a.i[0x3946 ^ 0x398A] = 0x39A3 ^ 0x398A;
        kotakbaz.rain.client.discord.a.i[0x398A ^ 0x39D6] = 0xFFFFC662 ^ 0x39D6;
        kotakbaz.rain.client.discord.a.i[0x22B9 ^ 0x23FB] = 0x6716 ^ 0x23FB;
        kotakbaz.rain.client.discord.a.i[0x8424 ^ 0x8525] = 0x7B2 ^ 0x8525;
        kotakbaz.rain.client.discord.a.i[0x5B0C ^ 0x5A14] = 0x58B6 ^ 0x5A14;
        kotakbaz.rain.client.discord.a.i[0x8BD9 ^ 0x8B5E] = 0xB6AC ^ 0x8B5E;
        kotakbaz.rain.client.discord.a.i[0xDC74 ^ 0xDD70] = 0x5FE5 ^ 0xDD70;
        kotakbaz.rain.client.discord.a.i[0x10246 ^ 0x10289] = 0xFFFEFD1F ^ 0x10289;
        kotakbaz.rain.client.discord.a.i[0x7B92 ^ 0x7A89] = 0xFFFF4882 ^ 0x7A89;
        kotakbaz.rain.client.discord.a.i[0x1E29 ^ 0x1FAA] = 0x51FC ^ 0x1FAA;
        kotakbaz.rain.client.discord.a.i[0x9F6 ^ 0x9B5] = 0xFFFFF61B ^ 0x9B5;
        kotakbaz.rain.client.discord.a.i[0x10B8C ^ 0x10AB4] = 0x1CF83 ^ 0x10AB4;
        kotakbaz.rain.client.discord.a.i[0x711C ^ 0x7016] = 0x2F75 ^ 0x7016;
        kotakbaz.rain.client.discord.a.i[0x71B8 ^ 0x718F] = 0x71EA ^ 0x718F;
        kotakbaz.rain.client.discord.a.i[0x7060 ^ 0x70B6] = 0x70B4 ^ 0x70B6;
        kotakbaz.rain.client.discord.a.i[0x7C1D ^ 0x7D26] = 0xB811 ^ 0x7D26;
        kotakbaz.rain.client.discord.a.i[0x936E ^ 0x938D] = 0x15DA ^ 0x938D;
        kotakbaz.rain.client.discord.a.i[0x2FA0 ^ 0x2ED9] = 0x82F0 ^ 0x2ED9;
        kotakbaz.rain.client.discord.a.i[0x90DF ^ 0x9180] = 0x23ED ^ 0x9180;
        kotakbaz.rain.client.discord.a.i[0xB6BF ^ 0xB685] = 0xFFFF4928 ^ 0xB685;
        kotakbaz.rain.client.discord.a.i[0xF618 ^ 0xF73A] = 0xDB74 ^ 0xF73A;
        kotakbaz.rain.client.discord.a.i[0xC3CE ^ 0xC3F7] = 0xC3C7 ^ 0xC3F7;
        kotakbaz.rain.client.discord.a.i[0x2677 ^ 0x2726] = 0x94BD ^ 0x2726;
        kotakbaz.rain.client.discord.a.i[0x72FE ^ 0x7272] = 0x77E ^ 0x7272;
        kotakbaz.rain.client.discord.a.i[0x3262 ^ 0x333F] = 0x8152 ^ 0x333F;
        kotakbaz.rain.client.discord.a.i[0x8935 ^ 0x89FF] = 0x89DF ^ 0x89FF;
        kotakbaz.rain.client.discord.a.i[0xD2CA ^ 0xD2DD] = 0xD298 ^ 0xD2DD;
        kotakbaz.rain.client.discord.a.i[0x1C55 ^ 0x1D7D] = 0x3E4C ^ 0x1D7D;
        kotakbaz.rain.client.discord.a.i[0xA635 ^ 0xA758] = 0x1141 ^ 0xA758;
        kotakbaz.rain.client.discord.a.i[0x4E70 ^ 0x4F57] = 0x40E1 ^ 0x4F57;
        kotakbaz.rain.client.discord.a.i[0x4A99 ^ 0x4A93] = 0x4A94 ^ 0x4A93;
        kotakbaz.rain.client.discord.a.i[0x70CA ^ 0x706A] = 0xFFFF8F9F ^ 0x706A;
        kotakbaz.rain.client.discord.a.i[0x64BE ^ 0x64EA] = 0x640E ^ 0x64EA;
        kotakbaz.rain.client.discord.a.i[0x2D99 ^ 0x2C83] = 0xE11C ^ 0x2C83;
        kotakbaz.rain.client.discord.a.i[0x4070 ^ 0x40AE] = 0xAB74 ^ 0x40AE;
        kotakbaz.rain.client.discord.a.i[0x7AFD ^ 0x7BF5] = 0x185E ^ 0x7BF5;
        kotakbaz.rain.client.discord.a.i[0xC95B ^ 0xC91A] = 0xC963 ^ 0xC91A;
        kotakbaz.rain.client.discord.a.i[0x41F4 ^ 0x40D4] = 0x6CF7 ^ 0x40D4;
        kotakbaz.rain.client.discord.a.i[0xBDBD ^ 0xBD57] = 0x99C9 ^ 0xBD57;
        kotakbaz.rain.client.discord.a.i[0xBD98 ^ 0xBCB3] = 0x9F92 ^ 0xBCB3;
        kotakbaz.rain.client.discord.a.i[0x8CDC ^ 0x8D80] = 0x3FE7 ^ 0x8D80;
        kotakbaz.rain.client.discord.a.i[0x7B7F ^ 0x7BE2] = 0x7BCB ^ 0x7BE2;
        kotakbaz.rain.client.discord.a.i[0x5FC7 ^ 0x5E97] = 0xED1A ^ 0x5E97;
        kotakbaz.rain.client.discord.a.i[0x48B1 ^ 0x4879] = 0x4843 ^ 0x4879;
        kotakbaz.rain.client.discord.a.i[0x45C5 ^ 0x45CC] = 0x45D5 ^ 0x45CC;
        kotakbaz.rain.client.discord.a.i[0xAD70 ^ 0xAD9B] = 0xFFFF76F8 ^ 0xAD9B;
        kotakbaz.rain.client.discord.a.i[0x3969 ^ 0x3942] = 0xFFFFC6FA ^ 0x3942;
        kotakbaz.rain.client.discord.a.i[0x9314 ^ 0x93DA] = 0x93C5 ^ 0x93DA;
        kotakbaz.rain.client.discord.a.i[0xCF9D ^ 0xCFAB] = 0xCF84 ^ 0xCFAB;
        kotakbaz.rain.client.discord.a.i[0x3A11 ^ 0x3AA5] = 0x3ABE ^ 0x3AA5;
        kotakbaz.rain.client.discord.a.i[0x4500 ^ 0x458F] = 0x1671 ^ 0x458F;
        kotakbaz.rain.client.discord.a.i[0xE32C ^ 0xE3A4] = 0xF117 ^ 0xE3A4;
        kotakbaz.rain.client.discord.a.i[0x61A0 ^ 0x618F] = 0x61F1 ^ 0x618F;
        kotakbaz.rain.client.discord.a.i[0x40D0 ^ 0x419D] = 0x4448 ^ 0x419D;
        kotakbaz.rain.client.discord.a.i[0xD0A8 ^ 0xD1AF] = 0xFFFF4D8B ^ 0xD1AF;
        kotakbaz.rain.client.discord.a.i[0x308 ^ 0x3EA] = 0x859E ^ 0x3EA;
        kotakbaz.rain.client.discord.a.i[0x9893 ^ 0x98D4] = 0xFFFF671F ^ 0x98D4;
        kotakbaz.rain.client.discord.a.i[0x710A ^ 0x712D] = 0x7108 ^ 0x712D;
        kotakbaz.rain.client.discord.a.i[0xCA0F ^ 0xCB81] = 0x460C ^ 0xCB81;
        kotakbaz.rain.client.discord.a.i[0x7111 ^ 0x7077] = 0x8CEA ^ 0x7077;
        kotakbaz.rain.client.discord.a.i[0xC5FC ^ 0xC55D] = 0xC500 ^ 0xC55D;
        kotakbaz.rain.client.discord.a.i[0x101C7 ^ 0x101E5] = 0xFFFEFE4D ^ 0x101E5;
        kotakbaz.rain.client.discord.a.i[0x36CE ^ 0x3780] = 0xFFFFCD82 ^ 0x3780;
        kotakbaz.rain.client.discord.a.i[0x4B50 ^ 0x4B8C] = 0xD02A ^ 0x4B8C;
        kotakbaz.rain.client.discord.a.i[0x386D ^ 0x385F] = 0x3843 ^ 0x385F;
        kotakbaz.rain.client.discord.a.i[0x4902 ^ 0x49AB] = 0x49DB ^ 0x49AB;
        kotakbaz.rain.client.discord.a.i[0x2AA3 ^ 0x2A1F] = 0xFFFFD58E ^ 0x2A1F;
        kotakbaz.rain.client.discord.a.i[0xD51 ^ 0xDA0] = 0x6ECC ^ 0xDA0;
        kotakbaz.rain.client.discord.a.i[0x14F0 ^ 0x1402] = 0x776E ^ 0x1402;
        kotakbaz.rain.client.discord.a.i[0xAA3E ^ 0xAA12] = 0xAA6F ^ 0xAA12;
        kotakbaz.rain.client.discord.a.i[0x8B8C ^ 0x8B91] = 0x8BAD ^ 0x8B91;
        kotakbaz.rain.client.discord.a.i[0x2DB9 ^ 0x2D21] = 0xFFFFD2CA ^ 0x2D21;
        kotakbaz.rain.client.discord.a.i[0xD4C3 ^ 0xD4B7] = 0xFFFF2B33 ^ 0xD4B7;
        kotakbaz.rain.client.discord.a.i[0x2501 ^ 0x256F] = 0x2517 ^ 0x256F;
        kotakbaz.rain.client.discord.a.i[0x52C3 ^ 0x5299] = 0x529F ^ 0x5299;
        kotakbaz.rain.client.discord.a.i[0xE67C ^ 0xE677] = 0xFFFF1995 ^ 0xE677;
        kotakbaz.rain.client.discord.a.i[0xCBAE ^ 0xCAD2] = 0xFF2A ^ 0xCAD2;
        kotakbaz.rain.client.discord.a.i[0xAA12 ^ 0xAAA4] = 0xAAC9 ^ 0xAAA4;
        kotakbaz.rain.client.discord.a.i[0x6FBC ^ 0x6FCC] = 0x6FEC ^ 0x6FCC;
        kotakbaz.rain.client.discord.a.i[0x7D05 ^ 0x7D4C] = 0x7D6F ^ 0x7D4C;
        kotakbaz.rain.client.discord.a.i[0x4BAB ^ 0x4B8F] = 0xFFFFB44E ^ 0x4B8F;
        kotakbaz.rain.client.discord.a.i[0x2FAE ^ 0x2F6A] = 0xFFFFD086 ^ 0x2F6A;
        kotakbaz.rain.client.discord.a.i[0xF91E ^ 0xF9AB] = 0xF9C3 ^ 0xF9AB;
        kotakbaz.rain.client.discord.a.i[0x2711 ^ 0x27CB] = 0x27CB ^ 0x27CB;
        kotakbaz.rain.client.discord.a.i[0x104E6 ^ 0x10411] = 0x1802E ^ 0x10411;
        kotakbaz.rain.client.discord.a.i[0x363C ^ 0x3608] = 0x3649 ^ 0x3608;
        kotakbaz.rain.client.discord.a.i[0x9860 ^ 0x9871] = 0xFFFF67A6 ^ 0x9871;
        kotakbaz.rain.client.discord.a.i[0xDCE7 ^ 0xDD93] = 0x317E ^ 0xDD93;
        kotakbaz.rain.client.discord.a.i[0x2944 ^ 0x2802] = 0xFFFF0B97 ^ 0x2802;
        kotakbaz.rain.client.discord.a.i[0x624C ^ 0x6206] = 0xFFFF9DEC ^ 0x6206;
        kotakbaz.rain.client.discord.a.i[0xA6FC ^ 0xA683] = 0xA683 ^ 0xA683;
        kotakbaz.rain.client.discord.a.i[0xF123 ^ 0xF17C] = 0xF107 ^ 0xF17C;
        kotakbaz.rain.client.discord.a.i[0x9E14 ^ 0x9F35] = 0xB311 ^ 0x9F35;
        kotakbaz.rain.client.discord.a.i[0xA23D ^ 0xA2C4] = 0xDB95 ^ 0xA2C4;
        kotakbaz.rain.client.discord.a.i[0x18F1 ^ 0x19B9] = 0x9D1F ^ 0x19B9;
        kotakbaz.rain.client.discord.a.i[0x1005B ^ 0x10075] = 0x1001E ^ 0x10075;
        kotakbaz.rain.client.discord.a.i[0x46B ^ 0x473] = 0x477 ^ 0x473;
        kotakbaz.rain.client.discord.a.i[0xACC9 ^ 0xACF6] = 0xAC3F ^ 0xACF6;
        kotakbaz.rain.client.discord.a.i[0x1034 ^ 0x109A] = 0x1001 ^ 0x109A;
        kotakbaz.rain.client.discord.a.i[0x5B50 ^ 0x5B37] = 0xFFFFA4D1 ^ 0x5B37;
        kotakbaz.rain.client.discord.a.i[0xC3B2 ^ 0xC23E] = 0x4FD9 ^ 0xC23E;
        kotakbaz.rain.client.discord.a.i[0x3E10 ^ 0x3E8C] = 0xFFFFC137 ^ 0x3E8C;
        kotakbaz.rain.client.discord.a.i[0xD3EF ^ 0xD314] = 0xAA0F ^ 0xD314;
        kotakbaz.rain.client.discord.a.i[0x60B2 ^ 0x6187] = 0x16D90 ^ 0x6187;
        kotakbaz.rain.client.discord.a.i[0x3370 ^ 0x327D] = 0x440C ^ 0x327D;
        kotakbaz.rain.client.discord.a.i[0x6C69 ^ 0x6D78] = 0x54BC ^ 0x6D78;
        kotakbaz.rain.client.discord.a.i[0x5CF0 ^ 0x5C0C] = 0x255C ^ 0x5C0C;
        kotakbaz.rain.client.discord.a.i[0x523E ^ 0x5295] = 0x52AD ^ 0x5295;
        kotakbaz.rain.client.discord.a.i[0xCE16 ^ 0xCF74] = 0xFFFF20B8 ^ 0xCF74;
        kotakbaz.rain.client.discord.a.i[0x8211 ^ 0x8239] = 0x820F ^ 0x8239;
        kotakbaz.rain.client.discord.a.i[0x2E4 ^ 0x298] = 0x2FA ^ 0x298;
        kotakbaz.rain.client.discord.a.i[0x8522 ^ 0x85EF] = 0x85D9 ^ 0x85EF;
        kotakbaz.rain.client.discord.a.i[0xF9F3 ^ 0xF9D6] = 0xF983 ^ 0xF9D6;
        kotakbaz.rain.client.discord.a.i[0x1FF2 ^ 0x1FF7] = 0x1FFF ^ 0x1FF7;
        kotakbaz.rain.client.discord.a.i[0x10E9 ^ 0x10CF] = 0xFFFFEF38 ^ 0x10CF;
        kotakbaz.rain.client.discord.a.i[0xC853 ^ 0xC86D] = 0xC81B ^ 0xC86D;
        kotakbaz.rain.client.discord.a.i[0x7FB8 ^ 0x7FFE] = 0x7FFC ^ 0x7FFE;
        kotakbaz.rain.client.discord.a.i[0xC695 ^ 0xC697] = 0xFFFF3962 ^ 0xC697;
        kotakbaz.rain.client.discord.a.i[0xA070 ^ 0xA0D7] = 0xFFFF5F6F ^ 0xA0D7;
        kotakbaz.rain.client.discord.a.i[0x3596 ^ 0x3517] = 0x3517 ^ 0x3517;
        kotakbaz.rain.client.discord.a.i[0xC300 ^ 0xC20F] = 0xFFFF4B98 ^ 0xC20F;
        kotakbaz.rain.client.discord.a.i[0xE190 ^ 0xE16A] = 0x983A ^ 0xE16A;
        kotakbaz.rain.client.discord.a.i[0x17F6 ^ 0x172B] = 0xFCF9 ^ 0x172B;
        kotakbaz.rain.client.discord.a.i[0xCCBE ^ 0xCD92] = 0x1046 ^ 0xCD92;
        kotakbaz.rain.client.discord.a.i[0xF692 ^ 0xF646] = 0xF638 ^ 0xF646;
        kotakbaz.rain.client.discord.a.i[0x168C ^ 0x1605] = 0x53A0 ^ 0x1605;
        kotakbaz.rain.client.discord.a.i[0x7D5A ^ 0x7C74] = 0xFFFF5E77 ^ 0x7C74;
        kotakbaz.rain.client.discord.a.i[0x1BC6 ^ 0x1A92] = 0x95A ^ 0x1A92;
        kotakbaz.rain.client.discord.a.i[0x31E3 ^ 0x316E] = 0xA9C2 ^ 0x316E;
        kotakbaz.rain.client.discord.a.i[0x64A3 ^ 0x64F6] = 0x6495 ^ 0x64F6;
        kotakbaz.rain.client.discord.a.i[0x5FC5 ^ 0x5F1E] = 0xC4A8 ^ 0x5F1E;
        kotakbaz.rain.client.discord.a.i[0x9850 ^ 0x986D] = 0xFFFF67B0 ^ 0x986D;
        kotakbaz.rain.client.discord.a.i[0xBF ^ 0x59] = 0x5986 ^ 0x59;
        kotakbaz.rain.client.discord.a.i[0x9A82 ^ 0x9BEA] = 0x3FC3 ^ 0x9BEA;
        kotakbaz.rain.client.discord.a.i[0xD954 ^ 0xD91C] = 0xFFFF26BB ^ 0xD91C;
        kotakbaz.rain.client.discord.a.i[0xDF86 ^ 0xDFDE] = 0xDF9A ^ 0xDFDE;
        kotakbaz.rain.client.discord.a.i[0x8512 ^ 0x856B] = 0xFFFF7AF3 ^ 0x856B;
        kotakbaz.rain.client.discord.a.i[0x3843 ^ 0x3906] = 0xE514 ^ 0x3906;
        kotakbaz.rain.client.discord.a.i[0x6F2F ^ 0x6E39] = 0x6C9B ^ 0x6E39;
        kotakbaz.rain.client.discord.a.i[0x5EC6 ^ 0x5E33] = 0xDA7C ^ 0x5E33;
        kotakbaz.rain.client.discord.a.i[0x7BF2 ^ 0x7A74] = 0xC65D ^ 0x7A74;
        kotakbaz.rain.client.discord.a.i[0x10E95 ^ 0x10E13] = 0x1B582 ^ 0x10E13;
        kotakbaz.rain.client.discord.a.i[0x363 ^ 0x224] = 0xDE36 ^ 0x224;
        kotakbaz.rain.client.discord.a.i[0x7680 ^ 0x76DD] = 0x7668 ^ 0x76DD;
        kotakbaz.rain.client.discord.a.i[0x72C5 ^ 0x72A7] = 0xFFFF8D10 ^ 0x72A7;
        kotakbaz.rain.client.discord.a.i[0x229A ^ 0x22E1] = 0x22A9 ^ 0x22E1;
        kotakbaz.rain.client.discord.a.i[0x82DB ^ 0x82D3] = 0x82AE ^ 0x82D3;
        kotakbaz.rain.client.discord.a.i[0xAE40 ^ 0xAFC7] = 0x13DF ^ 0xAFC7;
        kotakbaz.rain.client.discord.a.i[0xEFF2 ^ 0xEFA9] = 0xFFFF1007 ^ 0xEFA9;
        kotakbaz.rain.client.discord.a.i[0x37E7 ^ 0x3755] = 0x3717 ^ 0x3755;
        kotakbaz.rain.client.discord.a.i[0xCB9F ^ 0xCADE] = 0x8E08 ^ 0xCADE;
        kotakbaz.rain.client.discord.a.i[0x8634 ^ 0x8696] = 0xFFFF7946 ^ 0x8696;
        kotakbaz.rain.client.discord.a.i[0x8719 ^ 0x8692] = 0x249C ^ 0x8692;
        kotakbaz.rain.client.discord.a.i[0xD944 ^ 0xD935] = 0xD961 ^ 0xD935;
        kotakbaz.rain.client.discord.a.i[0x42A7 ^ 0x43BB] = 0x8E24 ^ 0x43BB;
        kotakbaz.rain.client.discord.a.i[0x7F43 ^ 0x7F9C] = 0xFFFF6B86 ^ 0x7F9C;
        kotakbaz.rain.client.discord.a.i[0xCA90 ^ 0xCA8F] = 0xFFFF353A ^ 0xCA8F;
        kotakbaz.rain.client.discord.a.i[0x8548 ^ 0x8476] = 0xA448 ^ 0x8476;
        kotakbaz.rain.client.discord.a.i[0x10BE6 ^ 0x10BB0] = 0xFFFEF422 ^ 0x10BB0;
        kotakbaz.rain.client.discord.a.i[0x3F41 ^ 0x3F47] = 0xFFFFC0F5 ^ 0x3F47;
        kotakbaz.rain.client.discord.a.i[0x8A1 ^ 0x872] = 0x860 ^ 0x872;
        kotakbaz.rain.client.discord.a.i[0x1DF4 ^ 0x1D1A] = 0x45B3 ^ 0x1D1A;
        kotakbaz.rain.client.discord.a.i[0xB558 ^ 0xB43B] = 0xA421 ^ 0xB43B;
        kotakbaz.rain.client.discord.a.i[0xB92E ^ 0xB864] = 0xFFFFC360 ^ 0xB864;
        kotakbaz.rain.client.discord.a.i[0xC23F ^ 0xC2BA] = 0xC07A ^ 0xC2BA;
        kotakbaz.rain.client.discord.a.i[0xA837 ^ 0xA879] = 0xFFFF57B0 ^ 0xA879;
        kotakbaz.rain.client.discord.a.i[0x73D ^ 0x6BC] = 0x48EA ^ 0x6BC;
        kotakbaz.rain.client.discord.a.i[0x8482 ^ 0x85BF] = 0xA599 ^ 0x85BF;
        kotakbaz.rain.client.discord.a.i[0xE7F3 ^ 0xE680] = 0x82D7 ^ 0xE680;
        kotakbaz.rain.client.discord.a.i[0x2A30 ^ 0x2A70] = 0x2A47 ^ 0x2A70;
        kotakbaz.rain.client.discord.a.i[0xD1D7 ^ 0xD0F8] = 0xD2E ^ 0xD0F8;
        kotakbaz.rain.client.discord.a.i[0xDBB5 ^ 0xDBF0] = 0xDBB7 ^ 0xDBF0;
        kotakbaz.rain.client.discord.a.i[0xA47E ^ 0xA4D8] = 0xA4C9 ^ 0xA4D8;
        kotakbaz.rain.client.discord.a.i[0xF2D ^ 0xFC8] = 0x561E ^ 0xFC8;
        kotakbaz.rain.client.discord.a.i[0x7EAB ^ 0x7E7A] = 0x7E75 ^ 0x7E7A;
        kotakbaz.rain.client.discord.a.i[0x10F5B ^ 0x10E21] = 0x1A252 ^ 0x10E21;
        kotakbaz.rain.client.discord.a.i[0x1D1E ^ 0x1D2F] = 0x1D4D ^ 0x1D2F;
        kotakbaz.rain.client.discord.a.i[0x9E3F ^ 0x9F09] = 0x1933B ^ 0x9F09;
        kotakbaz.rain.client.discord.a.i[0x4314 ^ 0x4209] = 0x4209 ^ 0x4209;
        kotakbaz.rain.client.discord.a.i[0xFD65 ^ 0xFDF4] = 0xBC5B ^ 0xFDF4;
        kotakbaz.rain.client.discord.a.i[0x24AA ^ 0x24AE] = 0x24EF ^ 0x24AE;
        kotakbaz.rain.client.discord.a.i[0x3185 ^ 0x31DB] = 0xFFFFCE3D ^ 0x31DB;
        kotakbaz.rain.client.discord.a.i[0xCA69 ^ 0xCB29] = 0x8FE2 ^ 0xCB29;
        kotakbaz.rain.client.discord.a.i[0xB7B5 ^ 0xB6E7] = 0x540 ^ 0xB6E7;
        kotakbaz.rain.client.discord.a.i[0xC514 ^ 0xC499] = 0x496B ^ 0xC499;
    }
}

