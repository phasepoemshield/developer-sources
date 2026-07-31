/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.media;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

public final class a {
    private static final String a = "rain.media.enabled";
    private static final boolean A;
    private static final Identifier b;
    private static volatile NativeImageBackedTexture B;
    private static volatile Identifier c;
    private static volatile int C;
    private static volatile int d;
    private static volatile String D;
    private static volatile String e;
    private static volatile String E;
    private static volatile String f;
    private static volatile String F;
    private static volatile long g;
    private static volatile long G;
    private static volatile boolean h;
    private static volatile boolean H;
    private static Object[] i;
    private static Object j;
    private static Object[] J;
    private static Object[] I;
    private static Object[] k;
    public static int[] K;

    private a() {
    }

    public static NativeImageBackedTexture getTexture() {
        return B;
    }

    public static Identifier getTextureId() {
        return c;
    }

    public static int getTextureWidth() {
        return C;
    }

    public static int getTextureHeight() {
        return d;
    }

    public static String getTrackTitle() {
        return D;
    }

    public static String getLastTrackTitle() {
        return e;
    }

    public static String getArtist() {
        return E;
    }

    public static String getTrackTime() {
        return f;
    }

    public static String getDurationTime() {
        return F;
    }

    public static long getPosition() {
        return g;
    }

    public static long getDuration() {
        return G;
    }

    public static boolean isActive() {
        return h;
    }

    public static boolean getPlaing() {
        return H;
    }

    public static void updateTrackInfo() {
        if (!A) {
            kotakbaz.rain.client.util.media.a.resetMediaState();
            return;
        }
        int n2 = K[0];
        n2 += K[1];
        Thread thread = new Thread(() -> {
            long l2 = 5084013083123923662L;
            long l3 = -5797454170289527037L;
            long l4 = -2783012688655432623L;
            try {
                List<IMediaSession> list = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession iMediaSession = kotakbaz.rain.client.util.media.a.selectSession(list);
                if (iMediaSession != null) {
                    int n2 = K[213];
                    n2 += K[214];
                    v0 = n2 ^= K[215];
                } else {
                    int n3 = K[216];
                    n3 -= K[217];
                    h = n3 ^= K[218];
                    v0 = h ? 1 : 0;
                }
                if (iMediaSession != null) {
                    String string;
                    String string2;
                    int n4;
                    MediaInfo mediaInfo = iMediaSession.getMedia();
                    String string3 = kotakbaz.rain.client.util.media.a.normalizeMetadata(mediaInfo.getTitle());
                    int n5 = K[219];
                    n5 -= K[220];
                    long l5 = l2;
                    int n6 = K[222];
                    n6 -= K[223];
                    l2 = l5 ^ ((long)mediaInfo.getPlaying() << (n5 += K[221]) ^ l5) & -1L << (n6 += K[224]);
                    String string4 = kotakbaz.rain.client.util.media.a.normalizeMetadata(mediaInfo.getArtist());
                    BufferedImage bufferedImage = mediaInfo.getArtwork();
                    g = Math.max(0L, mediaInfo.getPosition());
                    G = Math.max(0L, mediaInfo.getDuration());
                    int n7 = K[225];
                    n7 -= K[226];
                    H = (int)(l2 >>> (n7 -= K[227]));
                    if (string3 != null) {
                        v2 = string3;
                    } else {
                        int n8 = K[228];
                        n8 ^= K[229];
                        v2 = D = (String)i[n8 += K[230]];
                    }
                    if (string4 != null) {
                        v3 = string4;
                    } else {
                        int n9 = K[231];
                        n9 -= K[232];
                        v3 = E = (String)i[n9 += K[233]];
                    }
                    if (!Objects.equals(string3, e)) {
                        int n10 = K[234];
                        n10 ^= K[235];
                        n4 = n10 += K[236];
                    } else {
                        int n11 = K[237];
                        n11 += K[238];
                        n4 = n11 += K[239];
                    }
                    int n12 = K[240];
                    n12 ^= K[241];
                    long l6 = l4;
                    int n13 = K[243];
                    n13 += K[244];
                    l4 = l6 ^ ((long)n4 << (n12 ^= K[242]) ^ l6) & -1L << (n13 += K[245]);
                    e = string3;
                    if (bufferedImage != null) {
                        int n14 = K[246];
                        n14 += K[247];
                        if ((int)(l4 >>> (n14 -= K[248])) != 0 || B == null) {
                            kotakbaz.rain.client.util.media.a.uploadArtwork(bufferedImage);
                        }
                    } else {
                        int n15 = K[249];
                        n15 ^= K[250];
                        if ((int)(l4 >>> (n15 += K[251])) != 0) {
                            kotakbaz.rain.client.util.media.a.clearTexture();
                        }
                    }
                    long l7 = g / 60L;
                    long l8 = g % 60L;
                    long l9 = G / 60L;
                    long l10 = G % 60L;
                    if (l8 < 10L) {
                        int n16 = K[252];
                        n16 ^= K[253];
                        string2 = (String)i[n16 ^= K[254]];
                    } else {
                        string2 = "";
                    }
                    long l11 = l8;
                    String string5 = string2;
                    long l12 = l7;
                    int n17 = K[255];
                    n17 += K[256];
                    f = l12 + (String)i[n17 ^= K[257]] + string5 + l11;
                    if (l10 < 10L) {
                        int n18 = K[258];
                        n18 += K[259];
                        string = (String)i[n18 += K[260]];
                    } else {
                        string = "";
                    }
                    long l13 = l10;
                    String string6 = string;
                    long l14 = l9;
                    int n19 = K[261];
                    n19 -= K[262];
                    F = l14 + (String)i[n19 ^= K[263]] + string6 + l13;
                } else {
                    kotakbaz.rain.client.util.media.a.resetMediaState();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }, (String)i[n2 -= K[2]]);
        boolean bl = K[3];
        bl ^= K[4];
        thread.setDaemon(bl ^= K[5]);
        thread.start();
    }

    private static boolean resolveMediaInfoEnabled() {
        int n2 = K[6];
        n2 -= K[7];
        int n3 = K[9];
        n3 ^= K[10];
        String string = System.getProperty((String)i[n2 += K[8]] + (String)i[n3 -= K[11]]);
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        int n4 = K[12];
        n4 ^= K[13];
        String string2 = System.getProperty((String)i[n4 ^= K[14]], "").toLowerCase(Locale.ROOT);
        int n5 = K[15];
        n5 ^= K[16];
        return string2.contains((String)i[n5 ^= K[17]]);
    }

    private static IMediaSession selectSession(List<IMediaSession> sessions) {
        long l2 = 7505231973014223123L;
        long l3 = 2316213229329005740L;
        long l4 = 5865294269836386135L;
        long l5 = -978588367398832613L;
        long l6 = 3940692651963174586L;
        IMediaSession iMediaSession = null;
        long l7 = l6;
        int n2 = K[18];
        n2 ^= K[19];
        l6 = l7 ^ (Long.MIN_VALUE ^ l7) & -1L << (n2 += K[20]);
        for (IMediaSession iMediaSession2 : sessions) {
            if (iMediaSession2 == null) continue;
            try {
                MediaInfo mediaInfo = iMediaSession2.getMedia();
                if (mediaInfo == null) continue;
                long l8 = l5;
                int n3 = K[21];
                n3 += K[22];
                l5 = l8 ^ (0L ^ l8) & -1L >>> (n3 -= K[23]);
                if (mediaInfo.getPlaying()) {
                    long l9 = l5;
                    int n4 = K[24];
                    n4 += K[25];
                    int n5 = K[27];
                    n5 -= K[28];
                    l5 = l9 ^ (l9 ^ l9 + (long)(n4 ^= K[26])) & -1L >>> (n5 -= K[29]);
                }
                if (kotakbaz.rain.client.util.media.a.normalizeMetadata(mediaInfo.getTitle()) != null) {
                    long l10 = l5;
                    int n6 = K[30];
                    n6 += K[31];
                    int n7 = K[33];
                    n7 -= K[34];
                    l5 = l10 ^ (l10 ^ l10 + (long)(n6 ^= K[32])) & -1L >>> (n7 += K[35]);
                }
                if (kotakbaz.rain.client.util.media.a.normalizeMetadata(mediaInfo.getArtist()) != null) {
                    long l11 = l5;
                    int n8 = K[36];
                    n8 += K[37];
                    int n9 = K[39];
                    n9 -= K[40];
                    l5 = l11 ^ (l11 ^ l11 + (long)(n8 -= K[38])) & -1L >>> (n9 ^= K[41]);
                }
                int n10 = K[42];
                n10 ^= K[43];
                if ((int)l5 <= (int)(l6 >>> (n10 += K[44]))) continue;
                int n11 = K[45];
                n11 -= K[46];
                long l12 = l6;
                int n12 = K[48];
                n12 += K[49];
                l6 = l12 ^ ((long)((int)l5) << (n11 ^= K[47]) ^ l12) & -1L << (n12 ^= K[50]);
                iMediaSession = iMediaSession2;
            }
            catch (Exception exception) {}
        }
        return iMediaSession;
    }

    private static String normalizeMetadata(String value2) {
        if (value2 == null) {
            return null;
        }
        String string = value2.trim();
        if (string.isEmpty()) {
            return null;
        }
        int n2 = K[51];
        n2 -= K[52];
        if (((String)i[n2 -= K[53]]).equalsIgnoreCase(string)) {
            return null;
        }
        return string;
    }

    private static void uploadArtwork(BufferedImage image) {
        long l2 = 6395445482957542293L;
        long l3 = -1958548514511052012L;
        if (kotakbaz.rain.client.extensions.b.getMc() == null || kotakbaz.rain.client.extensions.b.getMc().getTextureManager() == null) {
            return;
        }
        try {
            NativeImage nativeImage = kotakbaz.rain.client.util.media.a.toNativeImage(image);
            int n2 = K[54];
            n2 += K[55];
            long l4 = l3;
            int n3 = K[57];
            n3 ^= K[58];
            long l5 = l3 = l4 ^ ((long)image.getWidth() << (n2 += K[56]) ^ l4) & -1L << (n3 ^= K[59]);
            int n4 = K[60];
            n4 -= K[61];
            l3 = l5 ^ ((long)image.getHeight() ^ l5) & -1L >>> (n4 += K[62]);
            int n5 = K[63];
            n5 -= K[64];
            kotakbaz.rain.client.extensions.b.getMc().execute(() -> a.lambda$uploadArtwork$2(nativeImage, (int)(l3 >>> (n5 -= K[65])), (int)l3));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static NativeImage toNativeImage(BufferedImage image) {
        long l2 = 9178631144421816988L;
        long l3 = -8050439964554319783L;
        long l4 = 7569036508608781411L;
        long l5 = -5002200036464330483L;
        long l6 = 1965744918927162204L;
        long l7 = 2594588450623131639L;
        long l8 = -2537043161577015793L;
        long l9 = -265091759543664364L;
        long l10 = -2865378722957153491L;
        long l11 = -213614296093995570L;
        long l12 = 710186380541594341L;
        long l13 = 3924833291584276590L;
        long l14 = 52933020791859573L;
        boolean bl = K[66];
        bl ^= K[67];
        NativeImage nativeImage = new NativeImage(image.getWidth(), image.getHeight(), bl += K[68]);
        long l15 = l14;
        int n2 = K[69];
        n2 -= K[70];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= K[71]);
        while (true) {
            int n3 = K[72];
            n3 ^= K[73];
            if ((int)(l14 >>> (n3 ^= K[74])) >= image.getWidth()) break;
            long l16 = l14;
            int n4 = K[75];
            n4 += K[76];
            l14 = l16 ^ (0L ^ l16) & -1L >>> (n4 ^= K[77]);
            while ((int)l14 < image.getHeight()) {
                int n5 = K[78];
                n5 -= K[79];
                long l17 = l10;
                int n6 = K[81];
                n6 -= K[82];
                l10 = l17 ^ ((long)image.getRGB((int)(l14 >>> (n5 -= K[80])), (int)l14) ^ l17) & -1L >>> (n6 -= K[83]);
                int n7 = K[84];
                n7 -= K[85];
                n7 ^= K[86];
                int n8 = K[87];
                n8 -= K[88];
                long l18 = l11;
                int n9 = K[90];
                n9 += K[91];
                l11 = l18 ^ ((long)((int)l10 >>> n7 & (n8 -= K[89])) ^ l18) & -1L >>> (n9 += K[92]);
                int n10 = K[93];
                n10 -= K[94];
                n10 ^= K[95];
                int n11 = K[96];
                n11 -= K[97];
                n11 -= K[98];
                int n12 = K[99];
                n12 ^= K[100];
                long l19 = l13;
                int n13 = K[102];
                n13 -= K[103];
                l13 = l19 ^ ((long)((int)l10 >>> n10 & n11) << (n12 += K[101]) ^ l19) & -1L << (n13 ^= K[104]);
                int n14 = K[105];
                n14 += K[106];
                n14 ^= K[107];
                int n15 = K[108];
                n15 ^= K[109];
                long l20 = l12;
                int n16 = K[111];
                n16 ^= K[112];
                l12 = l20 ^ ((long)((int)l10 >>> n14 & (n15 += K[110])) ^ l20) & -1L >>> (n16 ^= K[113]);
                int n17 = K[114];
                n17 -= K[115];
                n17 ^= K[116];
                int n18 = K[117];
                n18 -= K[118];
                long l21 = l12;
                int n19 = K[120];
                n19 -= K[121];
                l12 = l21 ^ ((long)((int)l10 & n17) << (n18 ^= K[119]) ^ l21) & -1L << (n19 ^= K[122]);
                int n20 = K[123];
                n20 += K[124];
                n20 -= K[125];
                int n21 = K[126];
                n21 ^= K[127];
                n21 ^= K[128];
                int n22 = K[129];
                n22 += K[130];
                n22 ^= K[131];
                int n23 = K[132];
                n23 += K[133];
                n23 ^= K[134];
                int n24 = K[135];
                n24 -= K[136];
                long l22 = l13;
                int n25 = K[138];
                n25 += K[139];
                l13 = l22 ^ ((long)((int)l11 << n20 | (int)(l12 >>> n21) << n22 | (int)l12 << n23 | (int)(l13 >>> (n24 ^= K[137]))) ^ l22) & -1L >>> (n25 -= K[140]);
                int n26 = K[141];
                n26 -= K[142];
                nativeImage.setColor((int)(l14 >>> (n26 ^= K[143])), (int)l14, (int)l13);
                long l23 = l14;
                int n27 = K[144];
                n27 ^= K[145];
                int n28 = K[147];
                n28 -= K[148];
                l14 = l23 ^ (l23 ^ l23 + (long)(n27 -= K[146])) & -1L >>> (n28 += K[149]);
            }
            l14 += 0x100000000L;
        }
        return nativeImage;
    }

    private static void clearTexture() {
        if (kotakbaz.rain.client.extensions.b.getMc() == null || kotakbaz.rain.client.extensions.b.getMc().getTextureManager() == null) {
            B = null;
            c = null;
            int n2 = K[150];
            n2 -= K[151];
            C = n2 -= K[152];
            int n3 = K[153];
            n3 += K[154];
            d = n3 -= K[155];
            return;
        }
        kotakbaz.rain.client.extensions.b.getMc().execute(() -> {
            kotakbaz.rain.client.extensions.b.getMc().getTextureManager().destroyTexture(b);
            B = null;
            c = null;
            int n2 = K[204];
            n2 ^= K[205];
            C = n2 -= K[206];
            int n3 = K[207];
            n3 += K[208];
            d = n3 ^= K[209];
        });
    }

    public static float getProgress() {
        return h && G != 0L ? (float)g / (float)G : 0.0f;
    }

    public static void playpauseTrack() {
        if (!A) {
            return;
        }
        int n2 = K[156];
        n2 ^= K[157];
        int n3 = K[159];
        n3 += K[160];
        Thread thread = new Thread(() -> {
            try {
                List<IMediaSession> list = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession iMediaSession = kotakbaz.rain.client.util.media.a.selectSession(list);
                if (iMediaSession != null) {
                    iMediaSession.playPause();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }, (String)i[n2 -= K[158]] + (String)i[n3 -= K[161]]);
        boolean bl = K[162];
        bl -= K[163];
        thread.setDaemon(bl += K[164]);
        thread.start();
    }

    public static void nextTrack() {
        if (!A) {
            return;
        }
        int n2 = K[165];
        n2 ^= K[166];
        Thread thread = new Thread(() -> {
            try {
                List<IMediaSession> list = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession iMediaSession = kotakbaz.rain.client.util.media.a.selectSession(list);
                if (iMediaSession != null) {
                    iMediaSession.next();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }, (String)i[n2 ^= K[167]]);
        boolean bl = K[168];
        bl -= K[169];
        thread.setDaemon(bl -= K[170]);
        thread.start();
    }

    public static void previousTrack() {
        if (!A) {
            return;
        }
        int n2 = K[171];
        n2 ^= K[172];
        int n3 = K[174];
        n3 += K[175];
        Thread thread = new Thread(() -> {
            try {
                List<IMediaSession> list = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession iMediaSession = kotakbaz.rain.client.util.media.a.selectSession(list);
                if (iMediaSession != null) {
                    iMediaSession.previous();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }, (String)i[n2 ^= K[173]] + (String)i[n3 ^= K[176]]);
        boolean bl = K[177];
        bl -= K[178];
        thread.setDaemon(bl += K[179]);
        thread.start();
    }

    private static void resetMediaState() {
        int n2 = K[180];
        n2 += K[181];
        D = (String)i[n2 -= K[182]];
        e = null;
        int n3 = K[183];
        n3 -= K[184];
        E = (String)i[n3 ^= K[185]];
        int n4 = K[186];
        n4 -= K[187];
        f = (String)i[n4 += K[188]];
        int n5 = K[189];
        n5 -= K[190];
        F = (String)i[n5 -= K[191]];
        int n6 = K[192];
        n6 += K[193];
        H = n6 -= K[194];
        int n7 = K[195];
        n7 += K[196];
        h = n7 += K[197];
        g = 0L;
        G = 0L;
        if (B == null && c == null && C == 0 && d == 0) {
            return;
        }
        c = null;
        int n8 = K[198];
        n8 += K[199];
        C = n8 += K[200];
        int n9 = K[201];
        n9 ^= K[202];
        d = n9 ^= K[203];
        kotakbaz.rain.client.util.media.a.clearTexture();
    }

    private static /* synthetic */ void lambda$uploadArtwork$2(NativeImage nativeImage, int width2, int height) {
        try {
            NativeImageBackedTexture nativeImageBackedTexture = new NativeImageBackedTexture(() -> {
                int n2 = K[210];
                n2 -= K[211];
                return (String)i[n2 -= K[212]];
            }, nativeImage);
            kotakbaz.rain.client.extensions.b.getMc().getTextureManager().registerTexture(b, (AbstractTexture)nativeImageBackedTexture);
            B = nativeImageBackedTexture;
            c = b;
            C = width2;
            d = height;
        }
        catch (Exception exception) {
            nativeImage.close();
        }
    }

    static {
        kotakbaz.rain.client.util.media.a.b();
        long l2 = 3650390308350738605L;
        long l3 = -6351152901196078313L;
        long l4 = 2058225699908919005L;
        long l5 = 6726583746471844973L;
        long l6 = -865233720462904094L;
        long l7 = -7414559029062829949L;
        long l8 = 3126294783096784316L;
        long l9 = -6830978713838353056L;
        long l10 = -1351187577137536458L;
        long l11 = -3347286878028671719L;
        long l12 = -4671057499256622022L;
        long l13 = -6964496817093514432L;
        long l14 = -5485602266465277088L;
        long l15 = 8676167729334701467L;
        int n2 = K[264];
        n2 ^= K[265];
        i = new Object[n2 ^= K[266]];
        long l16 = l15;
        int n3 = K[267];
        n3 -= K[268];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= K[269]);
        Object[] objectArray = new Object[K[270]];
        objectArray[kotakbaz.rain.client.util.media.a.K[271]] = I;
        objectArray[kotakbaz.rain.client.util.media.a.K[272]] = K[273];
        int n4 = K[274];
        Object object = kotakbaz.rain.client.util.media.a.A()[K[275]];
        if (object == null) {
            char[] cArray = "\u47a6\u47ae\u4648\u4615\u4655\u47b1\u4654\u45e0\u47aa\u464b\u4635\u4649\u4640\u45f4\u45e8\u47aa\u464f\u45f7\u47b3\u47a8\u4635\u45f7\u464f\u4654\u47ab\u47a3\u47aa\u47ae\u47aa\u4652\u463e\u461a\u4646\u45de\u47a7\u4619\u4645\u464e\u47b1\u47aa\u47a6\u464e\u464a\u479d\u463f\u47b3\u47b2\u45f2\u4652\u464a\u45dd\u4648\u464f\u47a9\u45de\u4645\u464b\u4650\u47b0\u4617\u461a\u47a5\u47a3\u47af\u47a3\u4654\u4604\u463f\u4635\u4650\u4624\u4635\u4655\u45e0\u4635\u463c\u4617\u4646\u461a\u4646\u45f9\u463c\u4654\u47af\u47a0\u47b2\u4653\u4619\u45e0\u4622\u4643\u45fc\u47b1\u4650\u464a\u4622\u45f7\u4649\u47b4\u47a3\u4654\u4646\u47a7\u47b4\u463f\u4653\u4649\u45f4\u464e\u4622\u479e\u47a5\u45e0\u4619\u4635\u4648\u47b4\u45e0\u464e\u461c\u45fa\u45f7\u4653\u45f4\u45dd\u479f\u4655\u45ea\u463c\u45fa\u47ae\u47b1\u45f7\u47b1\u45e7\u45e0\u47a0\u4643\u4635\u47a5\u4602\u4647\u47a9\u45f9\u479f\u4650\u4622\u4654\u4652\u47a3\u45f4\u47b2\u4619\u4647\u47b1\u4654\u47a7\u479d\u4649\u463c\u4619\u4602\u4645\u4649\u4624\u45f4\u47b1\u4617\u4647\u4650\u47a6\u4647\u47a0\u4624\u4643\u45e9\u47a3\u4602\u47a7\u45f7\u4624\u47b2\u45e8\u4655\u4640\u47a3\u4651\u4635\u4615\u45f9\u47aa\u4602\u47ab\u47a8\u45ea\u45dd\u464b\u463c\u47b4\u479e\u479f\u479d\u45f4\u464a\u45e8\u4648\u463e\u463c\u47ae\u45e3\u461a\u47af\u47b2\u47b3\u4651\u464a\u45dd\u47a0\u47a3\u4622\u47a7\u47ab\u45ea\u4647\u4635\u45e8\u4652\u4654\u47aa\u47b3\u4619\u479d\u47a5\u461a\u4651\u463c\u47ae\u4654\u45e3\u479d\u4622\u4646\u47a3\u47b2\u4652\u461c\u463d\u45e0\u463f\u45e3\u4649\u45fa\u45f9\u47a8\u479e\u4655\u4645\u45e0\u4640\u45e8\u47ae\u4640\u45e3\u4635\u45e0\u47b4\u4624\u4643\u4650\u4648\u4615\u4617\u47a5\u47b3\u47b2\u4619\u45e8\u47a8\u47aa\u4650\u4602\u463d\u47b4\u464e\u464b\u4635\u47a9\u45f7\u4617\u47b3\u4615\u45f7\u4645\u4615\u47ae\u4615\u4647\u4653\u4651\u461a\u45dd\u463c\u4604\u47a8\u461a\u47b1\u47af\u45e0\u464a\u479d\u463d\u45de\u4643\u4653\u47ae\u463f\u45f7\u4649\u47a3\u4643\u4647\u45de\u47b3\u45e7\u4648\u4652\u45f4\u479f\u463d\u47b2\u464e\u4604\u464e\u4645\u47af\u47b4\u4635\u45dd\u4624\u45dd\u45e7\u4622\u47a3\u47a8\u45e9\u47b4\u479d\u47a0\u47a0\u47b3\u479f\u4615\u461a\u4635\u4622\u45f7\u4654\u45f7\u4604\u4604\u45fc\u47b2\u4622\u4656".toCharArray();
            for (int i2 = K[276]; i2 < K[277]; ++i2) {
                int n5 = cArray[i2];
                n5 += K[278];
                n5 += K[279];
                n5 += K[280];
                n5 ^= K[281];
                n5 += K[282];
                n5 ^= K[283];
                n5 -= K[284];
                n5 += K[285];
                n5 += K[286];
                n5 += K[287];
                n5 -= K[288];
                n5 ^= K[289];
                n5 -= K[290];
                n5 -= K[291];
                n5 -= K[292];
                n5 ^= K[293];
                cArray[i2] = (char)(n5 ^= K[294]);
            }
            object = kotakbaz.rain.client.util.media.a.A()[kotakbaz.rain.client.util.media.a.K[295]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.media.a.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = K[296];
        n6 ^= K[297];
        l6 = l17 ^ (0xF900000000L ^ l17) & -1L << (n6 -= K[298]);
        long l18 = l13;
        int n7 = K[299];
        n7 ^= K[300];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= K[301]);
        while (true) {
            int n8 = K[302];
            n8 ^= K[303];
            if ((int)l13 >= (int)(l6 >>> (n8 -= K[304]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = K[305];
            n10 += K[306];
            int n11 = K[308];
            n11 ^= K[309];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += K[307])) & -1L >>> (n11 ^= K[310]);
            long l20 = l9;
            int n12 = K[311];
            n12 -= K[312];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += K[313]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = K[314];
            n14 ^= K[315];
            int n15 = K[317];
            n15 ^= K[318];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= K[316])) & -1L >>> (n15 += K[319]);
            int n16 = K[320];
            n16 ^= K[321];
            long l22 = l10;
            int n17 = K[323];
            n17 ^= K[324];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= K[322]) ^ l22) & -1L << (n17 ^= K[325]);
            int n18 = K[326];
            n18 += K[327];
            n18 ^= K[328];
            int n19 = K[329];
            n19 -= K[330];
            long l23 = l12;
            int n20 = K[332];
            n20 ^= K[333];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= K[331]))) ^ l23) & -1L >>> (n20 ^= K[334]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = K[335];
            n21 ^= K[336];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= K[337]);
            while (true) {
                int n22 = K[338];
                n22 -= K[339];
                if ((int)(l14 >>> (n22 -= K[340])) >= (int)l12) break;
                int n23 = K[341];
                n23 += K[342];
                int n24 = K[344];
                n24 += K[345];
                cArray2[(int)(l14 >>> (n23 += kotakbaz.rain.client.util.media.a.K[343]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += K[346]))];
                l14 += 0x100000000L;
            }
            int n25 = K[347];
            n25 += K[348];
            int n26 = (int)(l15 >>> (n25 ^= K[349]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.util.media.a.i[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = K[350];
            n27 -= K[351];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += K[352]);
        }
        A = kotakbaz.rain.client.util.media.a.resolveMediaInfoEnabled();
        int n28 = K[353];
        n28 -= K[354];
        int n29 = K[356];
        n29 += K[357];
        int n30 = K[359];
        n30 -= K[360];
        b = Identifier.of((String)((String)i[n28 ^= K[355]]), (String)((String)i[n29 += K[358]] + (String)i[n30 -= K[361]]));
        B = null;
        c = null;
        int n31 = K[362];
        n31 -= K[363];
        C = n31 ^= K[364];
        int n32 = K[365];
        n32 += K[366];
        d = n32 -= K[367];
        int n33 = K[368];
        n33 += K[369];
        D = (String)i[n33 -= K[370]];
        int n34 = K[371];
        n34 -= K[372];
        e = (String)i[n34 -= K[373]];
        int n35 = K[374];
        n35 ^= K[375];
        E = (String)i[n35 ^= K[376]];
        int n36 = K[377];
        n36 ^= K[378];
        f = (String)i[n36 += K[379]];
        int n37 = K[380];
        n37 -= K[381];
        F = (String)i[n37 -= K[382]];
        g = 0L;
        G = 0L;
        int n38 = K[383];
        n38 -= K[384];
        h = n38 += K[385];
        int n39 = K[386];
        n39 += K[387];
        H = n39 += K[388];
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[K[389]];
        String string = (String)object[K[390]];
        object = object[K[391]];
        Object[] objectArray = J;
        if (J == null) {
            objectArray = J = new Object[K[392]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[K[393]];
                I = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[K[395] ^ K[396]];
                byArray[kotakbaz.rain.client.util.media.a.K[397] ^ kotakbaz.rain.client.util.media.a.K[398]] = K[399] ^ 0x3CCD;
                byArray[0xCBCC ^ 0xCBCF] = 0xFFFF3410 ^ 0xCBCF;
                byArray[0xF865 ^ 0xF863] = 0xF82D ^ 0xF863;
                byArray[0xBE10 ^ 0xBE1A] = 0xFFFF41ED ^ 0xBE1A;
                byArray[0xFFD7 ^ 0xFFDA] = 0xFF84 ^ 0xFFDA;
                byArray[0xFB8F ^ 0xFB84] = 0xFFFF0434 ^ 0xFB84;
                byArray[0x106E1 ^ 0x106E8] = 0x106DA ^ 0x106E8;
                byArray[0x7803 ^ 0x7801] = 0xFFFF8799 ^ 0x7801;
                byArray[0x101E3 ^ 0x101E4] = 0xFFFEFE21 ^ 0x101E4;
                byArray[0x10BED ^ 0x10BE3] = 0x10BE7 ^ 0x10BE3;
                byArray[0xAD35 ^ 0xAD30] = 0xAD78 ^ 0xAD30;
                byArray[0x103FB ^ 0x103FA] = 0xFFFEFC15 ^ 0x103FA;
                byArray[0x5270 ^ 0x527F] = 0xFFFFADBF ^ 0x527F;
                byArray[0x3D11 ^ 0x3D19] = 0xFFFFC2BD ^ 0x3D19;
                byArray[0x436C ^ 0x4360] = 0xFFFFBCC9 ^ 0x4360;
                byArray[0xB291 ^ 0xB295] = 0xB2A9 ^ 0xB295;
                objectArray2[kotakbaz.rain.client.util.media.a.K[394]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (j == null) {
                byte[] byArray2 = new byte[0xE3A0 ^ 0xE380];
                byArray2[0x19E3 ^ 0x19FD] = 0x19DE ^ 0x19FD;
                byArray2[0xACBA ^ 0xACB4] = 0xFFFF532B ^ 0xACB4;
                byArray2[0x2173 ^ 0x2179] = 0xFFFFDEB1 ^ 0x2179;
                byArray2[0x336 ^ 0x325] = 0x357 ^ 0x325;
                byArray2[0x6122 ^ 0x6139] = 0xFFFF9E9D ^ 0x6139;
                byArray2[0x15F5 ^ 0x15FA] = 0x15E2 ^ 0x15FA;
                byArray2[0x3803 ^ 0x3816] = 0xFFFFC7CA ^ 0x3816;
                byArray2[0x5640 ^ 0x565D] = 0xFFFFA99D ^ 0x565D;
                byArray2[0x67DC ^ 0x67C0] = 0x67BB ^ 0x67C0;
                byArray2[0x10395 ^ 0x10398] = 0xFFFEFC47 ^ 0x10398;
                byArray2[0xB84D ^ 0xB85A] = 0xFFFF47C4 ^ 0xB85A;
                byArray2[0xEAE1 ^ 0xEAE7] = 0xFFFF1536 ^ 0xEAE7;
                byArray2[0x1BAB ^ 0x1BA7] = 0x1BD0 ^ 0x1BA7;
                byArray2[0x75CA ^ 0x75C9] = 0x75EE ^ 0x75C9;
                byArray2[0x27EC ^ 0x27FA] = 0xFFFFD84C ^ 0x27FA;
                byArray2[0xFBDA ^ 0xFBCE] = 0xFFFF042F ^ 0xFBCE;
                byArray2[0x66C5 ^ 0x66D5] = 0xFFFF992F ^ 0x66D5;
                byArray2[0xDEAF ^ 0xDEA8] = 0xFFFF210A ^ 0xDEA8;
                byArray2[0x22B5 ^ 0x22A7] = 0x22A5 ^ 0x22A7;
                byArray2[0x9D04 ^ 0x9D01] = 0x9D07 ^ 0x9D01;
                byArray2[0xC138 ^ 0xC13A] = 0xC120 ^ 0xC13A;
                byArray2[0xAFEA ^ 0xAFEA] = 0xFFFF5049 ^ 0xAFEA;
                byArray2[0x9663 ^ 0x9667] = 0x9645 ^ 0x9667;
                byArray2[0x4B24 ^ 0x4B3C] = 0xFFFFB4FC ^ 0x4B3C;
                byArray2[0x55ED ^ 0x55E6] = 0xFFFFAA24 ^ 0x55E6;
                byArray2[0x9383 ^ 0x938A] = 0xFFFF6C6A ^ 0x938A;
                byArray2[0xBA71 ^ 0xBA6B] = 0xFFFF45F7 ^ 0xBA6B;
                byArray2[0x7236 ^ 0x722F] = 0x7267 ^ 0x722F;
                byArray2[0xA183 ^ 0xA18B] = 0xA19C ^ 0xA18B;
                byArray2[0xB570 ^ 0xB571] = 0xFFFF4AD5 ^ 0xB571;
                byArray2[0xBE65 ^ 0xBE7A] = 0xBE3A ^ 0xBE7A;
                byArray2[0x3383 ^ 0x3392] = 0x33CC ^ 0x3392;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.media.a.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u5308\u531a\u530f\u52e4\u52e6\u52ea\u5313\u52bd\u52b4\u52b0\u5310\u52b9\u5305\u52b7\u5307\u5310\u52e5\u52f5".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 33505;
                        n3 ^= 0x45A6;
                        n3 -= 40935;
                        n3 -= 26344;
                        n3 -= 45834;
                        n3 -= 973;
                        n3 -= 33134;
                        n3 += 62836;
                        n3 += 46869;
                        n3 += 21687;
                        n3 -= 10680;
                        n3 -= 50329;
                        n3 ^= 0xF8FA;
                        n3 -= 30142;
                        cArray[i2] = (char)(n3 += 55614);
                    }
                    object4 = kotakbaz.rain.client.util.media.a.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -56;
                byArray4[3] = 44;
                byArray4[11] = 75;
                byArray4[9] = 113;
                byArray4[5] = -14;
                byArray4[6] = 76;
                byArray4[1] = -126;
                byArray4[13] = 108;
                byArray4[10] = 108;
                byArray4[15] = 82;
                byArray4[14] = -41;
                byArray4[4] = 73;
                byArray4[7] = -64;
                byArray4[0] = -67;
                byArray4[8] = 23;
                byArray4[2] = -38;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.media.a.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf1b2\uf18e\uf184".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 16512;
                        n4 += 3682;
                        n4 += 2057;
                        n4 -= 49355;
                        n4 += 30001;
                        n4 -= 38418;
                        n4 ^= 0x7192;
                        n4 -= 31154;
                        n4 += 11698;
                        n4 ^= 0x51B6;
                        n4 ^= 0x48F7;
                        n4 += 37274;
                        n4 -= 2110;
                        n4 ^= 0xFCBE;
                        cArray[i3] = (char)(n4 -= 42879);
                    }
                    object5 = kotakbaz.rain.client.util.media.a.A()[2] = new String(cArray);
                }
                j = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.media.a.A()[3];
            if (object6 == null) {
                char[] cArray = "\u7c06\u7c22\u7c30\u7c34\u7c20\u7c03\u7c20\u7c34\u7c21\u7c18\u7c20\u7c30\u7c52\u7c21\u7c66\u7c7d\u7c7d\u7c7e\u7c77\u7c7c".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 24352;
                    n5 -= 5538;
                    n5 -= 30180;
                    n5 += 24811;
                    n5 -= 35147;
                    n5 -= 23371;
                    n5 -= 25709;
                    n5 += 2577;
                    n5 -= 5846;
                    n5 ^= 0x8876;
                    n5 -= 35065;
                    n5 ^= 0xBFBA;
                    n5 += 34651;
                    n5 ^= 0x5D9C;
                    cArray[i4] = (char)(n5 ^= 0xE67C);
                }
                object6 = kotakbaz.rain.client.util.media.a.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)j), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = k;
        if (k == null) {
            k = new Object[4];
            objectArray = k;
        }
        return objectArray;
    }

    public static void b() {
        K = new int[0xB53A ^ 0xB4AA];
        kotakbaz.rain.client.util.media.a.K[0xEDFB ^ 0xED41] = 0xFFFF12D1 ^ 0xED41;
        kotakbaz.rain.client.util.media.a.K[0xEDE8 ^ 0xEC6C] = 0xEC78 ^ 0xEC6C;
        kotakbaz.rain.client.util.media.a.K[0xBDC9 ^ 0xBD50] = 0xFFFF42C4 ^ 0xBD50;
        kotakbaz.rain.client.util.media.a.K[0x62AB ^ 0x63F7] = 0x63F6 ^ 0x63F7;
        kotakbaz.rain.client.util.media.a.K[0xDEA3 ^ 0xDE80] = 0xDE8F ^ 0xDE80;
        kotakbaz.rain.client.util.media.a.K[0x3DE ^ 0x2AF] = 0x2BC ^ 0x2AF;
        kotakbaz.rain.client.util.media.a.K[0x4CE1 ^ 0x4C45] = 0x4C0B ^ 0x4C45;
        kotakbaz.rain.client.util.media.a.K[0x3256 ^ 0x329F] = 0x32B0 ^ 0x329F;
        kotakbaz.rain.client.util.media.a.K[0x86B3 ^ 0x86C4] = 0xFFFF7976 ^ 0x86C4;
        kotakbaz.rain.client.util.media.a.K[0x6A47 ^ 0x6A49] = 0xFFFF95BB ^ 0x6A49;
        kotakbaz.rain.client.util.media.a.K[0x7D0F ^ 0x7D51] = 0xFFFF82AC ^ 0x7D51;
        kotakbaz.rain.client.util.media.a.K[0x885 ^ 0x9BC] = 0xFFFFF679 ^ 0x9BC;
        kotakbaz.rain.client.util.media.a.K[0x25DD ^ 0x249A] = 0x2493 ^ 0x249A;
        kotakbaz.rain.client.util.media.a.K[0xDB16 ^ 0xDA49] = 0xDA53 ^ 0xDA49;
        kotakbaz.rain.client.util.media.a.K[0xBAFB ^ 0xBB74] = 0xFFFF7850 ^ 0xBB74;
        kotakbaz.rain.client.util.media.a.K[0xC374 ^ 0xC35E] = 0xFFFF3CCE ^ 0xC35E;
        kotakbaz.rain.client.util.media.a.K[0xD73D ^ 0xD728] = 0xD7E0 ^ 0xD728;
        kotakbaz.rain.client.util.media.a.K[0x36EC ^ 0x36D8] = 0x3698 ^ 0x36D8;
        kotakbaz.rain.client.util.media.a.K[0xC0A8 ^ 0xC091] = 0xC09D ^ 0xC091;
        kotakbaz.rain.client.util.media.a.K[0x10355 ^ 0x10335] = 0x103C1 ^ 0x10335;
        kotakbaz.rain.client.util.media.a.K[0xCBA ^ 0xD9A] = 0x1CA9 ^ 0xD9A;
        kotakbaz.rain.client.util.media.a.K[0x85F3 ^ 0x85DA] = 0x85EB ^ 0x85DA;
        kotakbaz.rain.client.util.media.a.K[0xCC91 ^ 0xCD86] = 0xE645 ^ 0xCD86;
        kotakbaz.rain.client.util.media.a.K[0x10D68 ^ 0x10D3E] = 0x10D35 ^ 0x10D3E;
        kotakbaz.rain.client.util.media.a.K[0xD4C4 ^ 0xD587] = 0xFFFF2A55 ^ 0xD587;
        kotakbaz.rain.client.util.media.a.K[0xFF5E ^ 0xFE63] = 0xFFFF0187 ^ 0xFE63;
        kotakbaz.rain.client.util.media.a.K[0x674D ^ 0x67A5] = 0x6788 ^ 0x67A5;
        kotakbaz.rain.client.util.media.a.K[0x22F5 ^ 0x2242] = 0xFFFFDD76 ^ 0x2242;
        kotakbaz.rain.client.util.media.a.K[0x5F6A ^ 0x5E04] = 0xFFFFA1ED ^ 0x5E04;
        kotakbaz.rain.client.util.media.a.K[0xB630 ^ 0xB77A] = 0xFFFF48D5 ^ 0xB77A;
        kotakbaz.rain.client.util.media.a.K[0x6CAF ^ 0x6DA8] = 0xFFFF925F ^ 0x6DA8;
        kotakbaz.rain.client.util.media.a.K[0x7D6 ^ 0x73C] = 0xFFFFF8FA ^ 0x73C;
        kotakbaz.rain.client.util.media.a.K[0xA04A ^ 0xA125] = 0xFFFF5EBD ^ 0xA125;
        kotakbaz.rain.client.util.media.a.K[0xB4CE ^ 0xB470] = 0xFFFF4B84 ^ 0xB470;
        kotakbaz.rain.client.util.media.a.K[0x4CAF ^ 0x4C42] = 0xFFFFB366 ^ 0x4C42;
        kotakbaz.rain.client.util.media.a.K[0xE63F ^ 0xE77B] = 0xE769 ^ 0xE77B;
        kotakbaz.rain.client.util.media.a.K[0xDA12 ^ 0xDB12] = 0xFFFF24FC ^ 0xDB12;
        kotakbaz.rain.client.util.media.a.K[0x826F ^ 0x8262] = 0x8267 ^ 0x8262;
        kotakbaz.rain.client.util.media.a.K[0x3F7C ^ 0x3FF3] = 0xFFFFC060 ^ 0x3FF3;
        kotakbaz.rain.client.util.media.a.K[0x8D27 ^ 0x8C10] = 0x8C4F ^ 0x8C10;
        kotakbaz.rain.client.util.media.a.K[0xCBE0 ^ 0xCA8B] = 0xCAE9 ^ 0xCA8B;
        kotakbaz.rain.client.util.media.a.K[0x8AA9 ^ 0x8AF3] = 0x8A0D ^ 0x8AF3;
        kotakbaz.rain.client.util.media.a.K[0x965E ^ 0x9717] = 0x9729 ^ 0x9717;
        kotakbaz.rain.client.util.media.a.K[0xB3BE ^ 0xB3BE] = 0xB3AC ^ 0xB3BE;
        kotakbaz.rain.client.util.media.a.K[0x617F ^ 0x619C] = 0xFFFF9E7D ^ 0x619C;
        kotakbaz.rain.client.util.media.a.K[0xE943 ^ 0xE9E6] = 0xE9E8 ^ 0xE9E6;
        kotakbaz.rain.client.util.media.a.K[0x288E ^ 0x2876] = 0xFFFFD7BF ^ 0x2876;
        kotakbaz.rain.client.util.media.a.K[0x3A23 ^ 0x3BA6] = 0x3BA7 ^ 0x3BA6;
        kotakbaz.rain.client.util.media.a.K[0x8949 ^ 0x8807] = 0x8862 ^ 0x8807;
        kotakbaz.rain.client.util.media.a.K[0xEE07 ^ 0xEEDA] = 0xEEE7 ^ 0xEEDA;
        kotakbaz.rain.client.util.media.a.K[0x7FB5 ^ 0x7EE0] = 0xFFFF817C ^ 0x7EE0;
        kotakbaz.rain.client.util.media.a.K[0xD3C5 ^ 0xD333] = 0xD37F ^ 0xD333;
        kotakbaz.rain.client.util.media.a.K[0xF551 ^ 0xF52C] = 0xF51B ^ 0xF52C;
        kotakbaz.rain.client.util.media.a.K[0x13A3 ^ 0x1324] = 0x131C ^ 0x1324;
        kotakbaz.rain.client.util.media.a.K[0x176B ^ 0x1651] = 0xFFFFE9C8 ^ 0x1651;
        kotakbaz.rain.client.util.media.a.K[0xE90C ^ 0xE881] = 0xD44C ^ 0xE881;
        kotakbaz.rain.client.util.media.a.K[0x89B4 ^ 0x897B] = 0xFFFF7625 ^ 0x897B;
        kotakbaz.rain.client.util.media.a.K[0x10D32 ^ 0x10DE8] = 0x10DA2 ^ 0x10DE8;
        kotakbaz.rain.client.util.media.a.K[0x7D69 ^ 0x7D32] = 0xFFFF82BE ^ 0x7D32;
        kotakbaz.rain.client.util.media.a.K[0x5D69 ^ 0x5D0F] = 0x5D2A ^ 0x5D0F;
        kotakbaz.rain.client.util.media.a.K[0x2C70 ^ 0x2C6B] = 0x2C79 ^ 0x2C6B;
        kotakbaz.rain.client.util.media.a.K[0x975C ^ 0x97C3] = 0xFFFF6875 ^ 0x97C3;
        kotakbaz.rain.client.util.media.a.K[0x1E17 ^ 0x1E55] = 0x1E62 ^ 0x1E55;
        kotakbaz.rain.client.util.media.a.K[0x7A64 ^ 0x7B30] = 0xFFFF84B1 ^ 0x7B30;
        kotakbaz.rain.client.util.media.a.K[0x4927 ^ 0x4958] = 0x4979 ^ 0x4958;
        kotakbaz.rain.client.util.media.a.K[0x9D92 ^ 0x9D3B] = 0xFFFF6294 ^ 0x9D3B;
        kotakbaz.rain.client.util.media.a.K[0xBD72 ^ 0xBC68] = 0xE08D ^ 0xBC68;
        kotakbaz.rain.client.util.media.a.K[0x50E0 ^ 0x5026] = 0xFFFFAFE5 ^ 0x5026;
        kotakbaz.rain.client.util.media.a.K[0x5436 ^ 0x54BA] = 0xFFFFAB59 ^ 0x54BA;
        kotakbaz.rain.client.util.media.a.K[0xA070 ^ 0xA0E0] = 0xA0C7 ^ 0xA0E0;
        kotakbaz.rain.client.util.media.a.K[0x754C ^ 0x74C5] = 0x74C4 ^ 0x74C5;
        kotakbaz.rain.client.util.media.a.K[0x54A0 ^ 0x55D3] = 0x55D2 ^ 0x55D3;
        kotakbaz.rain.client.util.media.a.K[0x5C2E ^ 0x5D02] = 0xFFFFA2DB ^ 0x5D02;
        kotakbaz.rain.client.util.media.a.K[0xBD6 ^ 0xB91] = 0xBFC ^ 0xB91;
        kotakbaz.rain.client.util.media.a.K[0x9A9C ^ 0x9B82] = 0xB632 ^ 0x9B82;
        kotakbaz.rain.client.util.media.a.K[0x2133 ^ 0x21FD] = 0x21D6 ^ 0x21FD;
        kotakbaz.rain.client.util.media.a.K[0xA867 ^ 0xA8AA] = 0xA8B9 ^ 0xA8AA;
        kotakbaz.rain.client.util.media.a.K[0x10E92 ^ 0x10E01] = 0xFFFEF1DC ^ 0x10E01;
        kotakbaz.rain.client.util.media.a.K[0xB41D ^ 0xB4F2] = 0xB49E ^ 0xB4F2;
        kotakbaz.rain.client.util.media.a.K[0x5D44 ^ 0x5D4B] = 0xFFFFA2FD ^ 0x5D4B;
        kotakbaz.rain.client.util.media.a.K[0xC823 ^ 0xC912] = 0xFFFF36EB ^ 0xC912;
        kotakbaz.rain.client.util.media.a.K[0xCC43 ^ 0xCC79] = 0xCC58 ^ 0xCC79;
        kotakbaz.rain.client.util.media.a.K[0x9EA6 ^ 0x9E5A] = 0x9E0A ^ 0x9E5A;
        kotakbaz.rain.client.util.media.a.K[0xB769 ^ 0xB60B] = 0xFFFF49A1 ^ 0xB60B;
        kotakbaz.rain.client.util.media.a.K[0x3E4B ^ 0x3F41] = 0xFFFFC0C9 ^ 0x3F41;
        kotakbaz.rain.client.util.media.a.K[0xC401 ^ 0xC464] = 0xC40F ^ 0xC464;
        kotakbaz.rain.client.util.media.a.K[0x1000E ^ 0x100CF] = 0x100B9 ^ 0x100CF;
        kotakbaz.rain.client.util.media.a.K[0xDCC7 ^ 0xDDC4] = 0xFFFF227A ^ 0xDDC4;
        kotakbaz.rain.client.util.media.a.K[0x10713 ^ 0x10726] = 0x1070B ^ 0x10726;
        kotakbaz.rain.client.util.media.a.K[0xFE05 ^ 0xFE1A] = 0xFFFF0185 ^ 0xFE1A;
        kotakbaz.rain.client.util.media.a.K[0xF346 ^ 0xF3ED] = 0xF3CC ^ 0xF3ED;
        kotakbaz.rain.client.util.media.a.K[0x6D34 ^ 0x6D3E] = 0xFFFF92A4 ^ 0x6D3E;
        kotakbaz.rain.client.util.media.a.K[0xFC24 ^ 0xFC00] = 0xFFFF035F ^ 0xFC00;
        kotakbaz.rain.client.util.media.a.K[0xB278 ^ 0xB2AA] = 0xFFFF4D69 ^ 0xB2AA;
        kotakbaz.rain.client.util.media.a.K[0x8269 ^ 0x8206] = 0x822D ^ 0x8206;
        kotakbaz.rain.client.util.media.a.K[0xE098 ^ 0xE1A0] = 0xE1A4 ^ 0xE1A0;
        kotakbaz.rain.client.util.media.a.K[0x8620 ^ 0x8759] = 0xFFFF78F1 ^ 0x8759;
        kotakbaz.rain.client.util.media.a.K[0x1020D ^ 0x1022A] = 0xFFFEFD8A ^ 0x1022A;
        kotakbaz.rain.client.util.media.a.K[0xE451 ^ 0xE4BD] = 0xFFFF1B1A ^ 0xE4BD;
        kotakbaz.rain.client.util.media.a.K[0x695F ^ 0x68D7] = 0x68D6 ^ 0x68D7;
        kotakbaz.rain.client.util.media.a.K[0x2117 ^ 0x2065] = 0x2018 ^ 0x2065;
        kotakbaz.rain.client.util.media.a.K[0x665A ^ 0x6709] = 0xFFFF98A0 ^ 0x6709;
        kotakbaz.rain.client.util.media.a.K[0x3839 ^ 0x3899] = 0x38EF ^ 0x3899;
        kotakbaz.rain.client.util.media.a.K[0xD467 ^ 0xD56A] = 0xD53C ^ 0xD56A;
        kotakbaz.rain.client.util.media.a.K[0xCE1A ^ 0xCE8E] = 0xFFFF3113 ^ 0xCE8E;
        kotakbaz.rain.client.util.media.a.K[0x4564 ^ 0x444F] = 0xFFFFBBA0 ^ 0x444F;
        kotakbaz.rain.client.util.media.a.K[0x3784 ^ 0x3773] = 0xFFFFC8EE ^ 0x3773;
        kotakbaz.rain.client.util.media.a.K[0x68C0 ^ 0x6829] = 0x6806 ^ 0x6829;
        kotakbaz.rain.client.util.media.a.K[0x52F2 ^ 0x52C1] = 0x52B0 ^ 0x52C1;
        kotakbaz.rain.client.util.media.a.K[0xE164 ^ 0xE1E7] = 0xE1B9 ^ 0xE1E7;
        kotakbaz.rain.client.util.media.a.K[0x6856 ^ 0x68D0] = 0x688B ^ 0x68D0;
        kotakbaz.rain.client.util.media.a.K[0xE6F ^ 0xF13] = 0xFF4 ^ 0xF13;
        kotakbaz.rain.client.util.media.a.K[0xAAC0 ^ 0xAA10] = 0xAA72 ^ 0xAA10;
        kotakbaz.rain.client.util.media.a.K[0x6C86 ^ 0x6C37] = 0xFFFF9344 ^ 0x6C37;
        kotakbaz.rain.client.util.media.a.K[0x46C6 ^ 0x46B4] = 0xFFFFB996 ^ 0x46B4;
        kotakbaz.rain.client.util.media.a.K[0xFBAF ^ 0xFBDF] = 0xFFFF0455 ^ 0xFBDF;
        kotakbaz.rain.client.util.media.a.K[0x1051B ^ 0x1054C] = 0x105B8 ^ 0x1054C;
        kotakbaz.rain.client.util.media.a.K[0xA9F5 ^ 0xA9D9] = 0xFFFF5678 ^ 0xA9D9;
        kotakbaz.rain.client.util.media.a.K[0xEC75 ^ 0xEC63] = 0xFFFF13EF ^ 0xEC63;
        kotakbaz.rain.client.util.media.a.K[0xDE92 ^ 0xDF8A] = 0x28CF ^ 0xDF8A;
        kotakbaz.rain.client.util.media.a.K[0x4B74 ^ 0x4B0A] = 0x4B20 ^ 0x4B0A;
        kotakbaz.rain.client.util.media.a.K[0x84B3 ^ 0x8405] = 0x8408 ^ 0x8405;
        kotakbaz.rain.client.util.media.a.K[0x2B80 ^ 0x2AE9] = 0xFFFFD53A ^ 0x2AE9;
        kotakbaz.rain.client.util.media.a.K[0x1171 ^ 0x118A] = 0x1198 ^ 0x118A;
        kotakbaz.rain.client.util.media.a.K[0x7645 ^ 0x765B] = 0x76E6 ^ 0x765B;
        kotakbaz.rain.client.util.media.a.K[0x10ADC ^ 0x10AA9] = 0xFFFEF512 ^ 0x10AA9;
        kotakbaz.rain.client.util.media.a.K[0x3840 ^ 0x3918] = 0x390F ^ 0x3918;
        kotakbaz.rain.client.util.media.a.K[0xECB3 ^ 0xED94] = 0xED94 ^ 0xED94;
        kotakbaz.rain.client.util.media.a.K[0x5652 ^ 0x56AB] = 0xFFFFA97A ^ 0x56AB;
        kotakbaz.rain.client.util.media.a.K[0xD963 ^ 0xD8E1] = 0xD8AE ^ 0xD8E1;
        kotakbaz.rain.client.util.media.a.K[0xCCAD ^ 0xCD89] = 0xE29E ^ 0xCD89;
        kotakbaz.rain.client.util.media.a.K[0x9D2A ^ 0x9DA2] = 0xFFFF621C ^ 0x9DA2;
        kotakbaz.rain.client.util.media.a.K[0xAF62 ^ 0xAF54] = 0xAFE2 ^ 0xAF54;
        kotakbaz.rain.client.util.media.a.K[0x6312 ^ 0x6249] = 0x621B ^ 0x6249;
        kotakbaz.rain.client.util.media.a.K[0x45B5 ^ 0x44B7] = 0x4427 ^ 0x44B7;
        kotakbaz.rain.client.util.media.a.K[0xF136 ^ 0xF10B] = 0xF156 ^ 0xF10B;
        kotakbaz.rain.client.util.media.a.K[0xC8E8 ^ 0xC886] = 0xC8ED ^ 0xC886;
        kotakbaz.rain.client.util.media.a.K[0x1DBC ^ 0x1CF1] = 0x1CF2 ^ 0x1CF1;
        kotakbaz.rain.client.util.media.a.K[0xFD53 ^ 0xFC41] = 0xFC43 ^ 0xFC41;
        kotakbaz.rain.client.util.media.a.K[0xFCB6 ^ 0xFDFD] = 0xFD92 ^ 0xFDFD;
        kotakbaz.rain.client.util.media.a.K[0x3F6D ^ 0x3FCF] = 0x3FD2 ^ 0x3FCF;
        kotakbaz.rain.client.util.media.a.K[0xEC0 ^ 0xECB] = 0xFFFFF108 ^ 0xECB;
        kotakbaz.rain.client.util.media.a.K[0xDF13 ^ 0xDE9D] = 0xE250 ^ 0xDE9D;
        kotakbaz.rain.client.util.media.a.K[0x5111 ^ 0x51C6] = 0xFFFFAE7A ^ 0x51C6;
        kotakbaz.rain.client.util.media.a.K[0x7C53 ^ 0x7D6F] = 0xFFFF8285 ^ 0x7D6F;
        kotakbaz.rain.client.util.media.a.K[0x39CC ^ 0x39EC] = 0x39B2 ^ 0x39EC;
        kotakbaz.rain.client.util.media.a.K[0xD394 ^ 0xD320] = 0xD332 ^ 0xD320;
        kotakbaz.rain.client.util.media.a.K[0xDD37 ^ 0xDDBC] = 0xDDD7 ^ 0xDDBC;
        kotakbaz.rain.client.util.media.a.K[0xD095 ^ 0xD1CC] = 0xD1BE ^ 0xD1CC;
        kotakbaz.rain.client.util.media.a.K[0x495D ^ 0x4972] = 0xFFFFB691 ^ 0x4972;
        kotakbaz.rain.client.util.media.a.K[0xFC41 ^ 0xFD6F] = 0xFDAC ^ 0xFD6F;
        kotakbaz.rain.client.util.media.a.K[0x7DC8 ^ 0x7C43] = 0xD3BC ^ 0x7C43;
        kotakbaz.rain.client.util.media.a.K[0x10ED4 ^ 0x10E25] = 0x10E10 ^ 0x10E25;
        kotakbaz.rain.client.util.media.a.K[0xB98 ^ 0xBBD] = 0xBD9 ^ 0xBBD;
        kotakbaz.rain.client.util.media.a.K[0x786B ^ 0x788D] = 0x78D3 ^ 0x788D;
        kotakbaz.rain.client.util.media.a.K[0xB51A ^ 0xB546] = 0xFFFF4AD0 ^ 0xB546;
        kotakbaz.rain.client.util.media.a.K[0xB461 ^ 0xB4A9] = 0xFFFF4B5E ^ 0xB4A9;
        kotakbaz.rain.client.util.media.a.K[0x1454 ^ 0x141B] = 0x142E ^ 0x141B;
        kotakbaz.rain.client.util.media.a.K[0x3164 ^ 0x31E4] = 0x31CF ^ 0x31E4;
        kotakbaz.rain.client.util.media.a.K[0x2FE4 ^ 0x2FC2] = 0xFFFFD000 ^ 0x2FC2;
        kotakbaz.rain.client.util.media.a.K[0x10C12 ^ 0x10D0D] = 0x1CCDF ^ 0x10D0D;
        kotakbaz.rain.client.util.media.a.K[0x2738 ^ 0x2724] = 0xFFFFD8CC ^ 0x2724;
        kotakbaz.rain.client.util.media.a.K[0x1AC9 ^ 0x1BD2] = 0xEBDD ^ 0x1BD2;
        kotakbaz.rain.client.util.media.a.K[0x4088 ^ 0x4068] = 0xFFFFBFD1 ^ 0x4068;
        kotakbaz.rain.client.util.media.a.K[0x8924 ^ 0x89C5] = 0xFFFF7621 ^ 0x89C5;
        kotakbaz.rain.client.util.media.a.K[0xD97 ^ 0xD72] = 0xD39 ^ 0xD72;
        kotakbaz.rain.client.util.media.a.K[0x100AF ^ 0x101C3] = 0xFFFEFE5F ^ 0x101C3;
        kotakbaz.rain.client.util.media.a.K[0x3649 ^ 0x3768] = 0xEC5D ^ 0x3768;
        kotakbaz.rain.client.util.media.a.K[0xE863 ^ 0xE870] = 0xE847 ^ 0xE870;
        kotakbaz.rain.client.util.media.a.K[0xE893 ^ 0xE99A] = 0xFFFF1630 ^ 0xE99A;
        kotakbaz.rain.client.util.media.a.K[0x6765 ^ 0x6707] = 0xFFFF98FF ^ 0x6707;
        kotakbaz.rain.client.util.media.a.K[0x3D38 ^ 0x3D8B] = 0x3DB6 ^ 0x3D8B;
        kotakbaz.rain.client.util.media.a.K[0x9909 ^ 0x982B] = 0x681C ^ 0x982B;
        kotakbaz.rain.client.util.media.a.K[0xA590 ^ 0xA49C] = 0xFFFF5B21 ^ 0xA49C;
        kotakbaz.rain.client.util.media.a.K[0x1050A ^ 0x1045D] = 0x10470 ^ 0x1045D;
        kotakbaz.rain.client.util.media.a.K[0x78B9 ^ 0x79CC] = 0xFFFF861D ^ 0x79CC;
        kotakbaz.rain.client.util.media.a.K[0x4BE8 ^ 0x4BC0] = 0xFFFFB44F ^ 0x4BC0;
        kotakbaz.rain.client.util.media.a.K[0x9F25 ^ 0x9EA4] = 0x9EAC ^ 0x9EA4;
        kotakbaz.rain.client.util.media.a.K[0xECC6 ^ 0xEDF2] = 0xEDAF ^ 0xEDF2;
        kotakbaz.rain.client.util.media.a.K[0x9054 ^ 0x903E] = 0xFFFF6FDD ^ 0x903E;
        kotakbaz.rain.client.util.media.a.K[0x31CF ^ 0x30A8] = 0xFFFFCF0C ^ 0x30A8;
        kotakbaz.rain.client.util.media.a.K[0xA44F ^ 0xA4FD] = 0xFFFF5B52 ^ 0xA4FD;
        kotakbaz.rain.client.util.media.a.K[0x144E ^ 0x1518] = 0x154F ^ 0x1518;
        kotakbaz.rain.client.util.media.a.K[0xAF61 ^ 0xAF6D] = 0xFFFF5081 ^ 0xAF6D;
        kotakbaz.rain.client.util.media.a.K[0xA9FE ^ 0xA96F] = 0xA91C ^ 0xA96F;
        kotakbaz.rain.client.util.media.a.K[0xD918 ^ 0xD9F6] = 0xD986 ^ 0xD9F6;
        kotakbaz.rain.client.util.media.a.K[0xD36E ^ 0xD27D] = 0xD27D ^ 0xD27D;
        kotakbaz.rain.client.util.media.a.K[0x4F43 ^ 0x4F9A] = 0x4FBE ^ 0x4F9A;
        kotakbaz.rain.client.util.media.a.K[0x318E ^ 0x30A3] = 0x30B5 ^ 0x30A3;
        kotakbaz.rain.client.util.media.a.K[0xB69D ^ 0xB622] = 0xFFFF49E0 ^ 0xB622;
        kotakbaz.rain.client.util.media.a.K[0xCCBD ^ 0xCD98] = 0x4C21 ^ 0xCD98;
        kotakbaz.rain.client.util.media.a.K[0xD1A6 ^ 0xD1A5] = 0xD1EA ^ 0xD1A5;
        kotakbaz.rain.client.util.media.a.K[0x8E83 ^ 0x8F8D] = 0x8F8E ^ 0x8F8D;
        kotakbaz.rain.client.util.media.a.K[0xF8BC ^ 0xF98C] = 0xF9EB ^ 0xF98C;
        kotakbaz.rain.client.util.media.a.K[0xE87B ^ 0xE945] = 0xE914 ^ 0xE945;
        kotakbaz.rain.client.util.media.a.K[0x94B5 ^ 0x94BC] = 0x94E9 ^ 0x94BC;
        kotakbaz.rain.client.util.media.a.K[0x4CB4 ^ 0x4CCD] = 0xFFFFB328 ^ 0x4CCD;
        kotakbaz.rain.client.util.media.a.K[0x2B1E ^ 0x2A98] = 0x2A9A ^ 0x2A98;
        kotakbaz.rain.client.util.media.a.K[0x2A6A ^ 0x2AB6] = 0xFFFFD51B ^ 0x2AB6;
        kotakbaz.rain.client.util.media.a.K[0xF8FA ^ 0xF8FC] = 0xF8AC ^ 0xF8FC;
        kotakbaz.rain.client.util.media.a.K[0xDA14 ^ 0xDA70] = 0xDA76 ^ 0xDA70;
        kotakbaz.rain.client.util.media.a.K[0x2922 ^ 0x2817] = 0xFFFFD7B9 ^ 0x2817;
        kotakbaz.rain.client.util.media.a.K[0x9AF1 ^ 0x9A6C] = 0x9A3E ^ 0x9A6C;
        kotakbaz.rain.client.util.media.a.K[0xAB8 ^ 0xBB7] = 0xBB7 ^ 0xBB7;
        kotakbaz.rain.client.util.media.a.K[0x10ACD ^ 0x10BDD] = 0x10BDC ^ 0x10BDD;
        kotakbaz.rain.client.util.media.a.K[0x87B9 ^ 0x8717] = 0x8768 ^ 0x8717;
        kotakbaz.rain.client.util.media.a.K[0x5DA9 ^ 0x5D71] = 0x5D1F ^ 0x5D71;
        kotakbaz.rain.client.util.media.a.K[0x1D5F ^ 0x1C2F] = 0x1C58 ^ 0x1C2F;
        kotakbaz.rain.client.util.media.a.K[0x2E52 ^ 0x2E07] = 0x2E23 ^ 0x2E07;
        kotakbaz.rain.client.util.media.a.K[0x3002 ^ 0x30BA] = 0xFFFFCF16 ^ 0x30BA;
        kotakbaz.rain.client.util.media.a.K[0x596F ^ 0x580A] = 0x582F ^ 0x580A;
        kotakbaz.rain.client.util.media.a.K[0x304D ^ 0x30EA] = 0xFFFFCF7E ^ 0x30EA;
        kotakbaz.rain.client.util.media.a.K[0xED18 ^ 0xED0F] = 0xED3B ^ 0xED0F;
        kotakbaz.rain.client.util.media.a.K[0xA194 ^ 0xA0AB] = 0xA0C0 ^ 0xA0AB;
        kotakbaz.rain.client.util.media.a.K[0x6CEC ^ 0x6CCE] = 0x6CBE ^ 0x6CCE;
        kotakbaz.rain.client.util.media.a.K[0x9E78 ^ 0x9EBF] = 0x9EF9 ^ 0x9EBF;
        kotakbaz.rain.client.util.media.a.K[0x5C98 ^ 0x5C88] = 0xFFFFA315 ^ 0x5C88;
        kotakbaz.rain.client.util.media.a.K[0x1096F ^ 0x109A5] = 0x109A4 ^ 0x109A5;
        kotakbaz.rain.client.util.media.a.K[0x4957 ^ 0x49FA] = 0xFFFFB63D ^ 0x49FA;
        kotakbaz.rain.client.util.media.a.K[0x2BC6 ^ 0x2B87] = 0xFFFFD41A ^ 0x2B87;
        kotakbaz.rain.client.util.media.a.K[0x234A ^ 0x233C] = 0x2315 ^ 0x233C;
        kotakbaz.rain.client.util.media.a.K[0x4D86 ^ 0x4CFD] = 0x4CE6 ^ 0x4CFD;
        kotakbaz.rain.client.util.media.a.K[0x2DB5 ^ 0x2CA4] = 0x2CA4 ^ 0x2CA4;
        kotakbaz.rain.client.util.media.a.K[0x36C3 ^ 0x37F0] = 0xFFFFC840 ^ 0x37F0;
        kotakbaz.rain.client.util.media.a.K[0xF410 ^ 0xF4D3] = 0xF4CB ^ 0xF4D3;
        kotakbaz.rain.client.util.media.a.K[0x102A8 ^ 0x102BC] = 0xFFFEFD2A ^ 0x102BC;
        kotakbaz.rain.client.util.media.a.K[0x27C2 ^ 0x27F2] = 0x2733 ^ 0x27F2;
        kotakbaz.rain.client.util.media.a.K[0x730E ^ 0x737A] = 0xFFFF8CE0 ^ 0x737A;
        kotakbaz.rain.client.util.media.a.K[0x8104 ^ 0x8163] = 0xFFFF7ED4 ^ 0x8163;
        kotakbaz.rain.client.util.media.a.K[0x1FFC ^ 0x1F78] = 0x1FDF ^ 0x1F78;
        kotakbaz.rain.client.util.media.a.K[0x1398 ^ 0x1306] = 0xFFFFECB7 ^ 0x1306;
        kotakbaz.rain.client.util.media.a.K[0xDF7A ^ 0xDFA5] = 0xDFB6 ^ 0xDFA5;
        kotakbaz.rain.client.util.media.a.K[0xDBE1 ^ 0xDB9A] = 0xFFFF2441 ^ 0xDB9A;
        kotakbaz.rain.client.util.media.a.K[0x1C6E ^ 0x1D03] = 0xFFFFE2AC ^ 0x1D03;
        kotakbaz.rain.client.util.media.a.K[0x7E6E ^ 0x7ED3] = 0xFFFF8165 ^ 0x7ED3;
        kotakbaz.rain.client.util.media.a.K[0xB15A ^ 0xB17B] = 0xB1FA ^ 0xB17B;
        kotakbaz.rain.client.util.media.a.K[0xB532 ^ 0xB57E] = 0xFFFF4AD2 ^ 0xB57E;
        kotakbaz.rain.client.util.media.a.K[0x2A30 ^ 0x2A1E] = 0x2A55 ^ 0x2A1E;
        kotakbaz.rain.client.util.media.a.K[0x10E42 ^ 0x10F0E] = 0x10F48 ^ 0x10F0E;
        kotakbaz.rain.client.util.media.a.K[0xCEF0 ^ 0xCE6A] = 0xCE4B ^ 0xCE6A;
        kotakbaz.rain.client.util.media.a.K[0xFD26 ^ 0xFC40] = 0xFC7F ^ 0xFC40;
        kotakbaz.rain.client.util.media.a.K[0xC1FA ^ 0xC121] = 0xFFFF3EB1 ^ 0xC121;
        kotakbaz.rain.client.util.media.a.K[0xD28 ^ 0xDB4] = 0xFFFFF228 ^ 0xDB4;
        kotakbaz.rain.client.util.media.a.K[0x6BCD ^ 0x6B40] = 0xFFFF94F5 ^ 0x6B40;
        kotakbaz.rain.client.util.media.a.K[0x9616 ^ 0x974C] = 0xFFFF68DB ^ 0x974C;
        kotakbaz.rain.client.util.media.a.K[0x38F7 ^ 0x3977] = 0xFFFFC6AF ^ 0x3977;
        kotakbaz.rain.client.util.media.a.K[0x7311 ^ 0x7240] = 0xFFFF8DD0 ^ 0x7240;
        kotakbaz.rain.client.util.media.a.K[0x92F9 ^ 0x93E4] = 0x5B4 ^ 0x93E4;
        kotakbaz.rain.client.util.media.a.K[0x2F94 ^ 0x2F64] = 0x2F2A ^ 0x2F64;
        kotakbaz.rain.client.util.media.a.K[0x28E4 ^ 0x2858] = 0x282B ^ 0x2858;
        kotakbaz.rain.client.util.media.a.K[0xB0AA ^ 0xB013] = 0xFFFF4F99 ^ 0xB013;
        kotakbaz.rain.client.util.media.a.K[0xAC91 ^ 0xAC04] = 0xFFFF53E4 ^ 0xAC04;
        kotakbaz.rain.client.util.media.a.K[0x9293 ^ 0x9239] = 0x9244 ^ 0x9239;
        kotakbaz.rain.client.util.media.a.K[0xAD1 ^ 0xAC3] = 0xA7E ^ 0xAC3;
        kotakbaz.rain.client.util.media.a.K[0x24CF ^ 0x2469] = 0xFFFFDBE4 ^ 0x2469;
        kotakbaz.rain.client.util.media.a.K[0xC0E4 ^ 0xC1EC] = 0xC1D0 ^ 0xC1EC;
        kotakbaz.rain.client.util.media.a.K[0x444 ^ 0x4B6] = 0x4ED ^ 0x4B6;
        kotakbaz.rain.client.util.media.a.K[0xED46 ^ 0xED17] = 0xED69 ^ 0xED17;
        kotakbaz.rain.client.util.media.a.K[0xD5D0 ^ 0xD5EF] = 0xFFFF2A11 ^ 0xD5EF;
        kotakbaz.rain.client.util.media.a.K[0x1303 ^ 0x1343] = 0x1302 ^ 0x1343;
        kotakbaz.rain.client.util.media.a.K[0xEE56 ^ 0xEF4A] = 0x9565 ^ 0xEF4A;
        kotakbaz.rain.client.util.media.a.K[0xE220 ^ 0xE222] = 0xE241 ^ 0xE222;
        kotakbaz.rain.client.util.media.a.K[0xF41D ^ 0xF50B] = 0xC528 ^ 0xF50B;
        kotakbaz.rain.client.util.media.a.K[0x554 ^ 0x441] = 0x52D ^ 0x441;
        kotakbaz.rain.client.util.media.a.K[0x29E4 ^ 0x29AA] = 0x299C ^ 0x29AA;
        kotakbaz.rain.client.util.media.a.K[0xE572 ^ 0xE5A1] = 0xFFFF1A69 ^ 0xE5A1;
        kotakbaz.rain.client.util.media.a.K[0xB669 ^ 0xB6AB] = 0xB6C3 ^ 0xB6AB;
        kotakbaz.rain.client.util.media.a.K[0x5EE1 ^ 0x5EB3] = 0x5EA7 ^ 0x5EB3;
        kotakbaz.rain.client.util.media.a.K[0x10439 ^ 0x10464] = 0x10410 ^ 0x10464;
        kotakbaz.rain.client.util.media.a.K[0x67F3 ^ 0x678F] = 0x67FB ^ 0x678F;
        kotakbaz.rain.client.util.media.a.K[0x6308 ^ 0x627E] = 0x6200 ^ 0x627E;
        kotakbaz.rain.client.util.media.a.K[0xB321 ^ 0xB256] = 0xB257 ^ 0xB256;
        kotakbaz.rain.client.util.media.a.K[0x51AF ^ 0x51E9] = 0xFFFFAE56 ^ 0x51E9;
        kotakbaz.rain.client.util.media.a.K[0x632F ^ 0x6342] = 0xFFFF9C9D ^ 0x6342;
        kotakbaz.rain.client.util.media.a.K[0x327B ^ 0x324C] = 0xFFFFCDEA ^ 0x324C;
        kotakbaz.rain.client.util.media.a.K[0xC3AC ^ 0xC30F] = 0xC365 ^ 0xC30F;
        kotakbaz.rain.client.util.media.a.K[0xDD37 ^ 0xDC23] = 0xDC23 ^ 0xDC23;
        kotakbaz.rain.client.util.media.a.K[0x3852 ^ 0x384A] = 0x3816 ^ 0x384A;
        kotakbaz.rain.client.util.media.a.K[0x4A08 ^ 0x4B03] = 0x4B30 ^ 0x4B03;
        kotakbaz.rain.client.util.media.a.K[0xEA90 ^ 0xEAE1] = 0xFFFF1560 ^ 0xEAE1;
        kotakbaz.rain.client.util.media.a.K[0xC08F ^ 0xC0E6] = 0xC0C5 ^ 0xC0E6;
        kotakbaz.rain.client.util.media.a.K[0xB51B ^ 0xB59A] = 0xB55C ^ 0xB59A;
        kotakbaz.rain.client.util.media.a.K[0xCF02 ^ 0xCFF7] = 0xCFC9 ^ 0xCFF7;
        kotakbaz.rain.client.util.media.a.K[0x9862 ^ 0x9954] = 0xFFFF6687 ^ 0x9954;
        kotakbaz.rain.client.util.media.a.K[0x5B51 ^ 0x5ADD] = 0xF532 ^ 0x5ADD;
        kotakbaz.rain.client.util.media.a.K[0xFD3F ^ 0xFDEE] = 0xFFFF022E ^ 0xFDEE;
        kotakbaz.rain.client.util.media.a.K[0xB293 ^ 0xB23F] = 0xFFFF4DD1 ^ 0xB23F;
        kotakbaz.rain.client.util.media.a.K[0xF8AE ^ 0xF835] = 0xFFFF0780 ^ 0xF835;
        kotakbaz.rain.client.util.media.a.K[0x13E4 ^ 0x1284] = 0xFFFFED20 ^ 0x1284;
        kotakbaz.rain.client.util.media.a.K[0x8A00 ^ 0x8A89] = 0x8AD3 ^ 0x8A89;
        kotakbaz.rain.client.util.media.a.K[0x3FFA ^ 0x3E7D] = 0x3E7D ^ 0x3E7D;
        kotakbaz.rain.client.util.media.a.K[0x8511 ^ 0x8423] = 0x847B ^ 0x8423;
        kotakbaz.rain.client.util.media.a.K[0x5139 ^ 0x51B7] = 0x51B5 ^ 0x51B7;
        kotakbaz.rain.client.util.media.a.K[0xB312 ^ 0xB216] = 0xFFFF4DA3 ^ 0xB216;
        kotakbaz.rain.client.util.media.a.K[0x2C3B ^ 0x2D11] = 0xFFFFD2B6 ^ 0x2D11;
        kotakbaz.rain.client.util.media.a.K[0xDDCC ^ 0xDD31] = 0xDD43 ^ 0xDD31;
        kotakbaz.rain.client.util.media.a.K[0x3056 ^ 0x3150] = 0x3132 ^ 0x3150;
        kotakbaz.rain.client.util.media.a.K[0x46CC ^ 0x4789] = 0xFFFFB869 ^ 0x4789;
        kotakbaz.rain.client.util.media.a.K[0x2E23 ^ 0x2EE8] = 0x2EC6 ^ 0x2EE8;
        kotakbaz.rain.client.util.media.a.K[0x1136 ^ 0x11C9] = 0xFFFFEE2C ^ 0x11C9;
        kotakbaz.rain.client.util.media.a.K[0x3AC8 ^ 0x3BF3] = 0x3B81 ^ 0x3BF3;
        kotakbaz.rain.client.util.media.a.K[0xF38F ^ 0xF2DF] = 0xF2FB ^ 0xF2DF;
        kotakbaz.rain.client.util.media.a.K[0x7060 ^ 0x7118] = 0x7177 ^ 0x7118;
        kotakbaz.rain.client.util.media.a.K[0x9C33 ^ 0x9C49] = 0xFFFF639D ^ 0x9C49;
        kotakbaz.rain.client.util.media.a.K[0x3CB2 ^ 0x3CA8] = 0x3CCD ^ 0x3CA8;
        kotakbaz.rain.client.util.media.a.K[0xE37D ^ 0xE338] = 0xE334 ^ 0xE338;
        kotakbaz.rain.client.util.media.a.K[0x600D ^ 0x60F7] = 0xFFFF9F28 ^ 0x60F7;
        kotakbaz.rain.client.util.media.a.K[0x715A ^ 0x7007] = 0x7074 ^ 0x7007;
        kotakbaz.rain.client.util.media.a.K[0x5335 ^ 0x5275] = 0x5258 ^ 0x5275;
        kotakbaz.rain.client.util.media.a.K[0x10562 ^ 0x105B4] = 0xFFFEFA3A ^ 0x105B4;
        kotakbaz.rain.client.util.media.a.K[0x96F4 ^ 0x9671] = 0xFFFF69DD ^ 0x9671;
        kotakbaz.rain.client.util.media.a.K[0x7E7B ^ 0x7F7A] = 0xFFFF80A6 ^ 0x7F7A;
        kotakbaz.rain.client.util.media.a.K[0x1A8D ^ 0x1A48] = 0xFFFFE5FE ^ 0x1A48;
        kotakbaz.rain.client.util.media.a.K[0xDDA7 ^ 0xDDE3] = 0xDD8E ^ 0xDDE3;
        kotakbaz.rain.client.util.media.a.K[0xBEC1 ^ 0xBE56] = 0xFFFF4185 ^ 0xBE56;
        kotakbaz.rain.client.util.media.a.K[0x72DD ^ 0x726D] = 0x721B ^ 0x726D;
        kotakbaz.rain.client.util.media.a.K[0xE15D ^ 0xE015] = 0xE039 ^ 0xE015;
        kotakbaz.rain.client.util.media.a.K[0xFA1D ^ 0xFAD9] = 0xFAEB ^ 0xFAD9;
        kotakbaz.rain.client.util.media.a.K[0x5BCB ^ 0x5B41] = 0xFFFFA4D9 ^ 0x5B41;
        kotakbaz.rain.client.util.media.a.K[0xBC76 ^ 0xBD30] = 0xBD03 ^ 0xBD30;
        kotakbaz.rain.client.util.media.a.K[0x4545 ^ 0x4579] = 0x45B5 ^ 0x4579;
        kotakbaz.rain.client.util.media.a.K[0xFBEA ^ 0xFB14] = 0xFB2F ^ 0xFB14;
        kotakbaz.rain.client.util.media.a.K[0x7417 ^ 0x7447] = 0xFFFF8BA6 ^ 0x7447;
        kotakbaz.rain.client.util.media.a.K[0x2D48 ^ 0x2D02] = 0x2D39 ^ 0x2D02;
        kotakbaz.rain.client.util.media.a.K[0x6CC7 ^ 0x6DE4] = 0x17F3 ^ 0x6DE4;
        kotakbaz.rain.client.util.media.a.K[0x1E50 ^ 0x1EEB] = 0x1EE9 ^ 0x1EEB;
        kotakbaz.rain.client.util.media.a.K[0x107B5 ^ 0x107D4] = 0xFFFEF829 ^ 0x107D4;
        kotakbaz.rain.client.util.media.a.K[0x548F ^ 0x54B7] = 0xFFFFAB73 ^ 0x54B7;
        kotakbaz.rain.client.util.media.a.K[0xD43F ^ 0xD57D] = 0xFFFF2A90 ^ 0xD57D;
        kotakbaz.rain.client.util.media.a.K[0x392B ^ 0x3848] = 0x3870 ^ 0x3848;
        kotakbaz.rain.client.util.media.a.K[0xBD0C ^ 0xBD45] = 0xBD17 ^ 0xBD45;
        kotakbaz.rain.client.util.media.a.K[0x59EF ^ 0x59EB] = 0xFFFFA663 ^ 0x59EB;
        kotakbaz.rain.client.util.media.a.K[0x8F9 ^ 0x858] = 0x846 ^ 0x858;
        kotakbaz.rain.client.util.media.a.K[0x1DFB ^ 0x1D88] = 0xFFFFE235 ^ 0x1D88;
        kotakbaz.rain.client.util.media.a.K[0x863E ^ 0x8696] = 0x86BB ^ 0x8696;
        kotakbaz.rain.client.util.media.a.K[0x5E96 ^ 0x5FC4] = 0xFFFFA08E ^ 0x5FC4;
        kotakbaz.rain.client.util.media.a.K[0xBDDE ^ 0xBDB5] = 0xBDBB ^ 0xBDB5;
        kotakbaz.rain.client.util.media.a.K[0x10D3A ^ 0x10C7B] = 0x10C5B ^ 0x10C7B;
        kotakbaz.rain.client.util.media.a.K[0x6402 ^ 0x6524] = 0x29FE ^ 0x6524;
        kotakbaz.rain.client.util.media.a.K[0xB08D ^ 0xB1F9] = 0xB1E3 ^ 0xB1F9;
        kotakbaz.rain.client.util.media.a.K[0x5FE6 ^ 0x5E65] = 0xFFFFA1F8 ^ 0x5E65;
        kotakbaz.rain.client.util.media.a.K[0x10C83 ^ 0x10C56] = 0x10C79 ^ 0x10C56;
        kotakbaz.rain.client.util.media.a.K[0x1B65 ^ 0x1BE7] = 0xFFFFE46F ^ 0x1BE7;
        kotakbaz.rain.client.util.media.a.K[0x164F ^ 0x1647] = 0xFFFFE9BF ^ 0x1647;
        kotakbaz.rain.client.util.media.a.K[0x42F1 ^ 0x4225] = 0xFFFFBDD0 ^ 0x4225;
        kotakbaz.rain.client.util.media.a.K[0x96D3 ^ 0x9627] = 0xFFFF69DF ^ 0x9627;
        kotakbaz.rain.client.util.media.a.K[0xAF3B ^ 0xAF2A] = 0xAF14 ^ 0xAF2A;
        kotakbaz.rain.client.util.media.a.K[0x6763 ^ 0x6748] = 0xFFFF98A7 ^ 0x6748;
        kotakbaz.rain.client.util.media.a.K[0xCB13 ^ 0xCA0A] = 0x852F ^ 0xCA0A;
        kotakbaz.rain.client.util.media.a.K[0xFC29 ^ 0xFC9C] = 0xFC9C ^ 0xFC9C;
        kotakbaz.rain.client.util.media.a.K[0xCB02 ^ 0xCB5A] = 0xFFFF34A1 ^ 0xCB5A;
        kotakbaz.rain.client.util.media.a.K[0x57D1 ^ 0x571D] = 0x5725 ^ 0x571D;
        kotakbaz.rain.client.util.media.a.K[0x10118 ^ 0x10065] = 0x10032 ^ 0x10065;
        kotakbaz.rain.client.util.media.a.K[0x96C4 ^ 0x96AC] = 0x96E2 ^ 0x96AC;
        kotakbaz.rain.client.util.media.a.K[0xB422 ^ 0xB50D] = 0xB549 ^ 0xB50D;
        kotakbaz.rain.client.util.media.a.K[0x97A7 ^ 0x96C3] = 0xFFFF6964 ^ 0x96C3;
        kotakbaz.rain.client.util.media.a.K[0x7C56 ^ 0x7C05] = 0x7C4F ^ 0x7C05;
        kotakbaz.rain.client.util.media.a.K[0x91E4 ^ 0x9106] = 0xFFFF6EE5 ^ 0x9106;
        kotakbaz.rain.client.util.media.a.K[0x95F2 ^ 0x95CC] = 0xFFFF6A7D ^ 0x95CC;
        kotakbaz.rain.client.util.media.a.K[0xB4D2 ^ 0xB4E3] = 0xFFFF4B69 ^ 0xB4E3;
        kotakbaz.rain.client.util.media.a.K[0x75E1 ^ 0x75B5] = 0x7582 ^ 0x75B5;
        kotakbaz.rain.client.util.media.a.K[0xDCB3 ^ 0xDDED] = 0xDD7B ^ 0xDDED;
        kotakbaz.rain.client.util.media.a.K[0xF48F ^ 0xF496] = 0xF493 ^ 0xF496;
        kotakbaz.rain.client.util.media.a.K[0xD786 ^ 0xD6F9] = 0xFFFF2929 ^ 0xD6F9;
        kotakbaz.rain.client.util.media.a.K[0x8344 ^ 0x833C] = 0xFFFF7CE5 ^ 0x833C;
        kotakbaz.rain.client.util.media.a.K[0xD3A6 ^ 0xD2D8] = 0xD2A5 ^ 0xD2D8;
        kotakbaz.rain.client.util.media.a.K[0x29AA ^ 0x294E] = 0xFFFFD6AE ^ 0x294E;
        kotakbaz.rain.client.util.media.a.K[0x9DEC ^ 0x9DA1] = 0x9DB7 ^ 0x9DA1;
        kotakbaz.rain.client.util.media.a.K[0x787A ^ 0x7823] = 0xFFFF87D9 ^ 0x7823;
        kotakbaz.rain.client.util.media.a.K[0xFF15 ^ 0xFE10] = 0xFE5D ^ 0xFE10;
        kotakbaz.rain.client.util.media.a.K[0x1172 ^ 0x115F] = 0x1151 ^ 0x115F;
        kotakbaz.rain.client.util.media.a.K[0x543D ^ 0x5438] = 0xFFFFABFE ^ 0x5438;
        kotakbaz.rain.client.util.media.a.K[0xE03F ^ 0xE022] = 0xE028 ^ 0xE022;
        kotakbaz.rain.client.util.media.a.K[0xF3B4 ^ 0xF2D5] = 0xFFFF0D01 ^ 0xF2D5;
        kotakbaz.rain.client.util.media.a.K[0xA8A ^ 0xAE6] = 0xFFFFF5AD ^ 0xAE6;
        kotakbaz.rain.client.util.media.a.K[0x3C15 ^ 0x3CCB] = 0x3CB1 ^ 0x3CCB;
        kotakbaz.rain.client.util.media.a.K[0xA49F ^ 0xA474] = 0xFFFF5BE8 ^ 0xA474;
        kotakbaz.rain.client.util.media.a.K[0x5F71 ^ 0x5E0B] = 0x5E4C ^ 0x5E0B;
        kotakbaz.rain.client.util.media.a.K[0x4227 ^ 0x4288] = 0xFFFFBD67 ^ 0x4288;
        kotakbaz.rain.client.util.media.a.K[0xCCCB ^ 0xCDA1] = 0xFFFF325F ^ 0xCDA1;
        kotakbaz.rain.client.util.media.a.K[0x743E ^ 0x745D] = 0xFFFF8BEE ^ 0x745D;
        kotakbaz.rain.client.util.media.a.K[0x821C ^ 0x821D] = 0x827F ^ 0x821D;
        kotakbaz.rain.client.util.media.a.K[0xA455 ^ 0xA57C] = 0xFFFF5AF1 ^ 0xA57C;
        kotakbaz.rain.client.util.media.a.K[0xD819 ^ 0xD846] = 0xD821 ^ 0xD846;
        kotakbaz.rain.client.util.media.a.K[0x10817 ^ 0x10810] = 0x10824 ^ 0x10810;
        kotakbaz.rain.client.util.media.a.K[0xFD08 ^ 0xFC60] = 0xFFFF03AA ^ 0xFC60;
        kotakbaz.rain.client.util.media.a.K[0x99BA ^ 0x9928] = 0x997B ^ 0x9928;
        kotakbaz.rain.client.util.media.a.K[0xDF4D ^ 0xDFD5] = 0xDFEB ^ 0xDFD5;
        kotakbaz.rain.client.util.media.a.K[0xCBF6 ^ 0xCBBD] = 0xCB37 ^ 0xCBBD;
        kotakbaz.rain.client.util.media.a.K[0x21D ^ 0x335] = 0x37F ^ 0x335;
        kotakbaz.rain.client.util.media.a.K[0x20A2 ^ 0x2051] = 0xFFFFDFBB ^ 0x2051;
        kotakbaz.rain.client.util.media.a.K[0xCE65 ^ 0xCEA5] = 0xFFFF3157 ^ 0xCEA5;
        kotakbaz.rain.client.util.media.a.K[0x1016C ^ 0x1018B] = 0x10193 ^ 0x1018B;
        kotakbaz.rain.client.util.media.a.K[0x72D8 ^ 0x72E3] = 0x72EE ^ 0x72E3;
        kotakbaz.rain.client.util.media.a.K[0xB782 ^ 0xB6CD] = 0xFFFF4959 ^ 0xB6CD;
        kotakbaz.rain.client.util.media.a.K[0xF96B ^ 0xF928] = 0xFFFF068C ^ 0xF928;
        kotakbaz.rain.client.util.media.a.K[0xEE71 ^ 0xEE43] = 0xEE28 ^ 0xEE43;
        kotakbaz.rain.client.util.media.a.K[0x10B48 ^ 0x10BDE] = 0x10BCF ^ 0x10BDE;
        kotakbaz.rain.client.util.media.a.K[0x99E0 ^ 0x99A8] = 0x99E1 ^ 0x99A8;
        kotakbaz.rain.client.util.media.a.K[0x9836 ^ 0x99BC] = 0x99BC ^ 0x99BC;
    }
}

