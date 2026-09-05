/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jcraft.jogg.Packet
 *  com.jcraft.jogg.Page
 *  com.jcraft.jogg.StreamState
 *  com.jcraft.jogg.SyncState
 *  com.jcraft.jorbis.Block
 *  com.jcraft.jorbis.Comment
 *  com.jcraft.jorbis.DspState
 *  com.jcraft.jorbis.Info
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  minecraft.class02915
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.jcraft.jogg.Packet;
import com.jcraft.jogg.Page;
import com.jcraft.jogg.StreamState;
import com.jcraft.jogg.SyncState;
import com.jcraft.jorbis.Block;
import com.jcraft.jorbis.Comment;
import com.jcraft.jorbis.DspState;
import com.jcraft.jorbis.Info;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import minecraft.class02915;
import org.jspecify.annotations.Nullable;

public class class06322
implements class02915 {
    private static final int y = 8192;
    private static final int L = -1;
    private static final int u = 0;
    private static final int i = 1;
    private static final int R = -1;
    private static final int M = 0;
    private static final int B = 1;
    private final SyncState Z = new SyncState();
    private final Page z = new Page();
    private final StreamState U = new StreamState();
    private final Packet E = new Packet();
    private final Info W = new Info();
    private final DspState m = new DspState();
    private final Block P = new Block(this.m);
    private final AudioFormat s;
    private final InputStream T;
    private long b;
    private long j = Long.MAX_VALUE;

    private boolean L() throws IOException {
        byte[] byArray = this.Z.data;
        int n = this.Z.buffer(8192);
        int n2 = this.T.read(byArray, n, 8192);
        if (n2 == -1) {
            return false;
        }
        this.Z.wrote(n2);
        return true;
    }

    private long L(int n) {
        long l;
        long l2 = this.b + (long)n;
        if (l2 > this.j) {
            l = this.j - this.b;
            this.b = this.j;
        } else {
            this.b = l2;
            l = n;
        }
        return l;
    }

    public class06322(InputStream inputStream) throws IOException {
        this.T = inputStream;
        Comment comment = new Comment();
        Page page = this.u();
        if (page == null) {
            throw new IOException("Invalid Ogg file - can't find first page");
        }
        Packet packet = this.N(page);
        if (class06322.y(this.W.synthesis_headerin(comment, packet))) {
            throw new IOException("Invalid Ogg identification packet");
        }
        for (int i = 0; i < 2; ++i) {
            packet = this.i();
            if (packet == null) {
                throw new IOException("Unexpected end of Ogg stream");
            }
            if (!class06322.y(this.W.synthesis_headerin(comment, packet))) continue;
            throw new IOException("Invalid Ogg header packet " + i);
        }
        this.m.synthesis_init(this.W);
        this.P.init(this.m);
        this.s = new AudioFormat(this.W.rate, 16, this.W.channels, true, false);
    }

    private @Nullable Packet i() throws IOException {
        block5: while (true) {
            int n = this.U.packetout(this.E);
            switch (n) {
                case 1: {
                    return this.E;
                }
                case 0: {
                    Page page = this.u();
                    if (page != null) continue block5;
                    return null;
                    if (!class06322.y(this.U.pagein(page))) continue block5;
                    throw new IOException("Failed to parse page");
                }
                case -1: {
                    throw new IOException("Failed to parse packet");
                }
                default: {
                    throw new IllegalStateException("Unknown packet decode result: " + n);
                }
            }
            break;
        }
    }

    public void close() throws IOException {
        this.T.close();
    }

    private @Nullable Page u() throws IOException {
        int n;
        block5: while (true) {
            n = this.Z.pageout(this.z);
            switch (n) {
                case 1: {
                    if (this.z.eos() != 0) {
                        this.j = this.z.granulepos();
                    }
                    return this.z;
                }
                case 0: {
                    if (this.L()) continue block5;
                    return null;
                }
                case -1: {
                    throw new IOException("Corrupt or missing data in bitstream");
                }
            }
            break;
        }
        throw new IllegalStateException("Unknown page decode result: " + n);
    }

    private static boolean y(int n) {
        return n < 0;
    }

    private static void N(float[] fArray, int n, long l, FloatConsumer floatConsumer) {
        int n2 = n;
        while ((long)n2 < (long)n + l) {
            floatConsumer.accept(fArray[n2]);
            ++n2;
        }
    }

    private static void N(float[] fArray, int n, float[] fArray2, int n2, long l, FloatConsumer floatConsumer) {
        int n3 = 0;
        while ((long)n3 < l) {
            floatConsumer.accept(fArray[n + n3]);
            floatConsumer.accept(fArray2[n2 + n3]);
            ++n3;
        }
    }

    public boolean N(FloatConsumer floatConsumer) throws IOException {
        int n;
        float[][][] fArrayArray = new float[1][][];
        int[] nArray = new int[this.W.channels];
        Packet packet = this.i();
        if (packet == null) {
            return false;
        }
        if (class06322.y(this.P.synthesis(packet))) {
            throw new IOException("Can't decode audio packet");
        }
        this.m.synthesis_blockin(this.P);
        while ((n = this.m.synthesis_pcmout((float[][][])fArrayArray, nArray)) > 0) {
            float[][] fArray = fArrayArray[0];
            long l = this.L(n);
            switch (this.W.channels) {
                case 1: {
                    class06322.N(fArray[0], nArray[0], l, floatConsumer);
                    break;
                }
                case 2: {
                    class06322.N(fArray[0], nArray[0], fArray[1], nArray[1], l, floatConsumer);
                    break;
                }
                default: {
                    class06322.N(fArray, this.W.channels, nArray, l, floatConsumer);
                }
            }
            this.m.synthesis_read(n);
        }
        return true;
    }

    private static void N(float[][] fArray, int n, int[] nArray, long l, FloatConsumer floatConsumer) {
        int n2 = 0;
        while ((long)n2 < l) {
            for (int i = 0; i < n; ++i) {
                int n3 = nArray[i];
                float f = fArray[i][n3 + n2];
                floatConsumer.accept(f);
            }
            ++n2;
        }
    }

    private Packet N(Page page) throws IOException {
        this.U.init(page.serialno());
        if (class06322.y(this.U.pagein(page))) {
            throw new IOException("Failed to parse page");
        }
        int n = this.U.packetout(this.E);
        if (n != 1) {
            throw new IOException("Failed to read identification packet: " + n);
        }
        return this.E;
    }

    public AudioFormat N() {
        return this.s;
    }
}

