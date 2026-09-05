/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import ruhack.phobia.az;

public class bx
implements az {
    private static final long ju = 1301810896185445425L;
    private static int[] dzpi;
    public static final int b;
    public class_4597 buffer;
    public class_4587 stack;
    private static int[] dzph;

    static {
        dzph = new int[5];
        dzpi = new int[5];
        bx.dzpp();
        bx.dzpr();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public bx(class_4587 class_45872, class_4597 class_45972) {
        block9: {
            int n2 = b;
            this.stack = class_45872;
            this.buffer = class_45972;
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    while (true) {
                        CallSite callSite = bx.dzpj("dzpk", dzpg(int ), (int)0);
                    }
                }
                case 1: {
                    CallSite callSite = bx.dzpj("dzpl", dzpg(int ), (int)1);
                    break;
                }
                case 2: {
                    CallSite callSite = bx.dzpj("dzpm", dzpg(int ), (int)2);
                    break;
                }
                case 3: {
                    break block9;
                }
                case 4: 
            }
            CallSite callSite = bx.dzpj("dzpo", dzpg(int ), (int)4);
        }
        while (true) {
            CallSite callSite = bx.dzpj("dzpn", dzpg(int ), (int)3);
        }
    }

    private static /* synthetic */ void dzpp() {
        bx.dzph[0] = -1716848835;
        bx.dzph[1] = -333312392;
        bx.dzph[2] = 885162548;
        bx.dzph[3] = 1095247368;
        bx.dzph[4] = 136617525;
    }

    private static /* synthetic */ void dzpr() {
        bx.dzpi[0] = -1716848839;
        bx.dzpi[1] = -333312391;
        bx.dzpi[2] = 885162544;
        bx.dzpi[3] = 1095247369;
        bx.dzpi[4] = 136617521;
    }

    public static /* synthetic */ CallSite dzpj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dzpg(int n2) {
        return dzph[n2] ^ dzpi[n2];
    }
}

