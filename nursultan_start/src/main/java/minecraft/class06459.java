/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04243
 *  minecraft.class05149
 *  minecraft.class05183
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import minecraft.class04243;
import minecraft.class05149;
import minecraft.class05183;
import org.slf4j.Logger;

public class class06459
extends class05149 {
    private static final Logger u = LogUtils.getLogger();
    private static final int i = 3;
    private static final int R = 2;
    private static final int M = 0;
    private static final int B = 2;
    private static final int Z = -1;
    private boolean z;
    private final Socket U;
    private final byte[] E = new byte[1460];
    private final String W;
    private final class04243 m;

    class06459(class04243 class042432, String string, Socket socket) {
        super("RCON Client " + String.valueOf(socket.getInetAddress()));
        this.m = class042432;
        this.U = socket;
        try {
            this.U.setSoTimeout(0);
        }
        catch (Exception exception) {
            this.N = false;
        }
        this.W = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        try {
            while (this.N) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.U.getInputStream());
                int n = bufferedInputStream.read(this.E, 0, 1460);
                if (10 > n) {
                    return;
                }
                int n2 = 0;
                if (class05183.y((byte[])this.E, (int)0, (int)n) != n - 4) {
                    return;
                }
                int n3 = class05183.y((byte[])this.E, (int)(n2 += 4), (int)n);
                int n4 = class05183.N((byte[])this.E, (int)(n2 += 4));
                n2 += 4;
                switch (n4) {
                    case 3: {
                        String string = class05183.N((byte[])this.E, (int)n2, (int)n);
                        n2 += string.length();
                        if (!string.isEmpty() && string.equals(this.W)) {
                            this.z = true;
                            this.N(n3, 2, "");
                            break;
                        }
                        this.z = false;
                        this.u();
                        break;
                    }
                    case 2: {
                        if (this.z) {
                            String string = class05183.N((byte[])this.E, (int)n2, (int)n);
                            try {
                                this.N(n3, this.m.N(string));
                            }
                            catch (Exception exception) {
                                this.N(n3, "Error executing: " + string + " (" + exception.getMessage() + ")");
                            }
                            break;
                        }
                        this.u();
                        break;
                    }
                    default: {
                        this.N(n3, String.format(Locale.ROOT, "Unknown request %s", Integer.toHexString(n4)));
                    }
                }
            }
        }
        catch (IOException iOException) {
        }
        catch (Exception exception) {
            u.error("Exception whilst parsing RCON input", (Throwable)exception);
        }
        finally {
            this.i();
            u.info("Thread {} shutting down", (Object)this.y);
            this.N = false;
        }
    }

    private void i() {
        try {
            this.U.close();
        }
        catch (IOException iOException) {
            u.warn("Failed to close socket", (Throwable)iOException);
        }
    }

    private void u() throws IOException {
        this.N(-1, 2, "");
    }

    public void y() {
        this.N = false;
        this.i();
        super.y();
    }

    private void N(int n, String string) throws IOException {
        int n2;
        int n3 = string.length();
        do {
            n2 = 4096 <= n3 ? 4096 : n3;
            this.N(n, 0, string.substring(0, n2));
        } while (0 != (n3 = (string = string.substring(n2)).length()));
    }

    private void N(int n, int n2, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(Integer.reverseBytes(byArray.length + 10));
        dataOutputStream.writeInt(Integer.reverseBytes(n));
        dataOutputStream.writeInt(Integer.reverseBytes(n2));
        dataOutputStream.write(byArray);
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        this.U.getOutputStream().write(byteArrayOutputStream.toByteArray());
    }
}

