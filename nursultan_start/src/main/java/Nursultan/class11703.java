/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoSwap
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class10967
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11303
 *  Nursultan.class11307
 *  Nursultan.class11328
 *  Nursultan.class11368
 *  Nursultan.class11388
 *  Nursultan.class11400
 *  Nursultan.class11527
 *  Nursultan.class11807
 *  Nursultan.class11894
 *  Nursultan.class11908
 *  Nursultan.class11921
 *  Nursultan.class11923
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class11998
 *  Nursultan.class12002
 *  Nursultan.class12031
 *  com.mojang.blaze3d.systems.RenderSystem
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05410
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07742
 *  minecraft.class08036
 *  minecraft.class08066
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.joml.Matrix3x2fStack
 *  org.joml.Vector2i
 */
package Nursultan;

import Nursultan.AutoSwap;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class10967;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11303;
import Nursultan.class11307;
import Nursultan.class11328;
import Nursultan.class11368;
import Nursultan.class11388;
import Nursultan.class11400;
import Nursultan.class11527;
import Nursultan.class11685;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11894;
import Nursultan.class11908;
import Nursultan.class11921;
import Nursultan.class11923;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class11998;
import Nursultan.class12002;
import Nursultan.class12031;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07742;
import minecraft.class08036;
import minecraft.class08066;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;

public class class11703
extends class11807<AutoSwap> {
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object L_0;
    public static Object L_1;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public boolean u_init;

    private void L(int n) {
        this.i();
        if (n == -1) {
            return;
        }
        ((class11685[])this.u_0)[n] = null;
        Path path = ((File)((class06202)((class11798)((Object)this)).N_0).l_1).toPath().resolve("swap-item").resolve(n + ".nbt");
        try {
            Files.deleteIfExists(path);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static void L() {
    }

    private static void P() {
        y_0 = null;
        y_1 = Float.valueOf(140.0f);
        y_2 = Float.valueOf(84.0f);
        y_3 = Float.valueOf(6.0f);
        y_4 = Float.valueOf(8.0f);
        y_5 = Float.valueOf(1.0f);
        y_6 = Float.valueOf(20.0f);
        L_0 = Float.valueOf(50.0f);
        L_1 = null;
    }

    private void T() {
        this.i();
        for (class11685 class116852 : (class11685[])this.u_0) {
            if (class116852 == null) continue;
            class116852.N(!class11281.y((int)class11281.R((class11328)class116852.L())));
        }
    }

    public class11703(AutoSwap autoSwap, String string, boolean bl) {
        super((Object)autoSwap, string, bl);
        this.i();
        this.u_0 = new class11685[3];
    }

    static {
        class11703.L();
        class11703.P();
        y_0 = LogManager.getLogger(String.class);
        L_1 = class09211.N((int)-29813);
    }

    private void i() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_1 = false;
        }
    }

    private static boolean y(class11685 class116852) {
        return class116852 != null && !class116852.N();
    }

    public void y(Object object) {
        this.i();
        Object object2 = object;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11400.class, class11388.class, class10967.class, class11368.class}, (Object)object2, (int)n)) {
            case 0: {
                class11400 class114002 = (class11400)object2;
                class12002 class120022 = (class12002)((class11527)((AutoSwap)((class11798)((Object)this)).N_1).u_0).i();
                if (class114002.y(class120022, ((class11527)((AutoSwap)((class11798)((Object)this)).N_1).u_0).L())) {
                    class11923.N(() -> {
                        this.i();
                        this.u_1 = true;
                        ((class06220)((class06202)((class11798)((Object)((Object)((Object)this)))).N_0).L_2).z();
                        this.T();
                    });
                    class114002.N();
                    break;
                }
                if (class114002.N(class120022)) {
                    class11923.N(() -> {
                        this.i();
                        if ((class05096)((class06202)((class11798)((Object)((Object)((Object)this)))).N_0).v_3 == null) {
                            ((class06202)((class11798)((Object)((Object)((Object)this)))).N_0).N(null);
                            this.u_1 = false;
                        }
                    });
                    class114002.N();
                    break;
                }
                if (!class114002.y(class12002.MOUSE_2) || !((Boolean)this.u_1).booleanValue()) break;
                class114002.N();
                this.N(this::L);
                break;
            }
            case 1: {
                class11388 class113882 = (class11388)object2;
                this.u_2 = null;
                if (((Boolean)this.u_1).booleanValue()) {
                    this.N(this::N);
                }
                this.u_1 = false;
                break;
            }
            case 2: {
                float f;
                class10967 class109672 = (class10967)object2;
                if (!((Boolean)this.u_1).booleanValue()) {
                    return;
                }
                class11925.N((class08066)((class06202)((class11798)((Object)this)).N_0).e(), (boolean)true);
                float f2 = class11938.i().u();
                float f3 = (float)((class06202)((class11798)((Object)this)).N_0).e().N / 2.0f;
                float f4 = (float)((class06202)((class11798)((Object)this)).N_0).e().y / 2.0f;
                Vector2i vector2i = class11307.N((double)((class06220)((class06202)((class11798)((Object)this)).N_0).L_2).i(), (double)((class06220)((class06202)((class11798)((Object)this)).N_0).L_2).R());
                float f5 = (float)vector2i.x - f3;
                float f6 = (float)vector2i.y - f4;
                float f7 = (float)Math.hypot(f5, f6);
                int n2 = ((class11685[])this.u_0).length;
                int n3 = -1;
                if (f7 > 50.0f * f2) {
                    n3 = class11703.N(f5, f6, n2);
                }
                if (n3 != -1 && class11703.y(((class11685[])this.u_0)[n3])) {
                    n3 = -1;
                }
                float f8 = f3;
                float f9 = f4;
                if (f7 > 0.0f) {
                    f = Math.min(f7 / (182.0f * f2), 1.0f);
                    float f10 = 20.0f * f2 * f * f;
                    f8 = Math.round(f3 - f5 / f7 * f10);
                    f9 = Math.round(f4 - f6 / f7 * f10);
                }
                f = (float)Math.PI * 2 / (float)n2;
                for (int i = 0; i < n2; ++i) {
                    class11685 class116852 = ((class11685[])this.u_0)[i];
                    int n4 = (int)(Math.sin((float)i * f + f / 2.0f) * 140.0 * (double)f2 + (double)f8);
                    int n5 = (int)(-Math.cos((float)i * f + f / 2.0f) * 140.0 * (double)f2 + (double)f9);
                    this.N(f8, f9, (float)i * f, (float)(i + 1) * f, f2, n3 == i, class11703.y(class116852));
                    if (class116852 != null) {
                        Matrix3x2fStack matrix3x2fStack = class109672.N().i();
                        matrix3x2fStack.pushMatrix();
                        matrix3x2fStack.translate((float)n4, (float)n5);
                        matrix3x2fStack.scale(3.0f * f2);
                        matrix3x2fStack.translate((float)(-n4), (float)(-n5));
                        class109672.N().N(class116852.y(), n4 - 8, n5 - 8);
                        matrix3x2fStack.popMatrix();
                        continue;
                    }
                    class11176.N((class11213)((class11174)class11190.y_0).u(), (float)((float)n4 - 16.0f * f2), (float)((float)n5 - 16.0f * f2), (float)(32.0f * f2), (float)(32.0f * f2), (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)(n3 == i ? (Integer)class09181.N_0 : -7171438));
                }
                ((class11174)class11190.y_2).y((T class093222) -> {
                    class093222.z("u_projection").N(class11925.L());
                    class093222.z("u_view").N(RenderSystem.getModelViewMatrix());
                });
                ((class11174)class11190.y_0).N((T class093222) -> {
                    class093222.z("u_projection").N(class11925.L());
                    class093222.z("u_view").N(RenderSystem.getModelViewMatrix());
                    class093222.M("texture_in").N(((class12031)class11998.N_3).N());
                });
                break;
            }
            case 3: {
                class11368 class113682 = (class11368)object2;
                if ((CompletableFuture)this.u_2 == null) break;
                if (class113682.L() == null) {
                    return;
                }
                class06584 class065842 = class113682.L().i();
                if (class065842.R()) {
                    return;
                }
                ((CompletableFuture)this.u_2).complete(class065842);
                class113682.N();
                ((class06202)((class11798)((Object)this)).N_0).N(null);
                break;
            }
        }
    }

    private void N(Consumer<Integer> consumer) {
        this.i();
        float f = (float)((class06202)((class11798)((Object)this)).N_0).e().N / 2.0f;
        float f2 = (float)((class06202)((class11798)((Object)this)).N_0).e().y / 2.0f;
        Vector2i vector2i = class11307.N((double)((class06220)((class06202)((class11798)((Object)this)).N_0).L_2).i(), (double)((class06220)((class06202)((class11798)((Object)this)).N_0).L_2).R());
        float f3 = (float)vector2i.x - f;
        float f4 = (float)vector2i.y - f2;
        int n = ((class11685[])this.u_0).length;
        int n2 = -1;
        if (Math.hypot(f3, f4) > (double)(50.0f * class11938.i().u())) {
            n2 = class11703.N(f3, f4, n);
        }
        consumer.accept(n2);
    }

    private void N(float f, float f2, float f3, float f4, float f5, boolean bl, boolean bl2) {
        int n;
        int n2;
        if (bl2) {
            n2 = ((class09211)L_1).L();
            n = ((class09211)L_1).R();
        } else if (bl) {
            class09211 class092112 = class09211.N((int)class09181.N());
            n2 = class092112.L();
            n = class092112.R();
        } else {
            n2 = (Integer)class09181.L_1;
            n = (Integer)class09181.L_2;
        }
        class11176.N((class11213)((class11174)class11190.y_2).u(), (float)f, (float)f2, (float)(140.0f * f5), (float)(84.0f * f5), (float)f3, (float)f4, (float)(6.0f * f5 / 2.0f), (float)(8.0f * f5), (float)1.0f, (int)n2, (int)n);
    }

    private void N(Integer n) {
        this.i();
        if (n == -1 || class11703.y(((class11685[])this.u_0)[n])) {
            return;
        }
        class11685 class116852 = ((class11685[])this.u_0)[n];
        if (class116852 != null) {
            class11938.Z().N(() -> ((AutoSwap)((class11798)((Object)((Object)((Object)this)))).N_1).N((T stream) -> stream.filter(class112972 -> class116852.L().test((Object)class112972.N())).mapToInt(class11297::y).findFirst().orElse(-1)));
            return;
        }
        this.u_2 = new CompletableFuture();
        ((CompletableFuture)this.u_2).thenAccept(class065842 -> {
            this.i();
            ((class11685[])this.u_0)[n.intValue()] = class11685.N(class065842);
            this.N((class06584)class065842, n);
        });
        class11923.N(() -> ((class06202)((class11798)((Object)((Object)((Object)this)))).N_0).N((class05096)new class05410((class08036)((class04453)((class06202)((class11798)((Object)((Object)((Object)this)))).N_0).T_4))));
    }

    public void N() {
        this.i();
        Path path = ((File)((class06202)((class11798)((Object)this)).N_0).l_1).toPath().resolve("swap-item");
        for (int i = 0; i < ((class11685[])this.u_0).length; ++i) {
            Path path2 = path.resolve(i + ".nbt");
            if (!Files.exists(path2, new LinkOption[0])) continue;
            try {
                ((class11685[])this.u_0)[i] = class11685.N(class11894.y((Path)path2));
                continue;
            }
            catch (Exception exception) {
                class11303.y((Object)class11921.N((String)"error-please-report").N(class06541.field_1061));
                ((Logger)y_0).error((Object)exception, (Throwable)exception);
            }
        }
    }

    private void N(class06584 class065842, int n) {
        try {
            File file = ((File)((class06202)((class11798)((Object)this)).N_0).l_1).toPath().resolve("swap-item").toFile();
            if (!file.exists()) {
                Files.createDirectories(file.toPath(), new FileAttribute[0]);
            }
            File file2 = new File(file, n + ".nbt");
            class07742.y((class07001)class11894.N((class06584)class065842), (Path)file2.toPath());
        }
        catch (IOException iOException) {
            class11303.y((Object)class11921.N((String)"error-please-report").N(class06541.field_1061));
            ((Logger)y_0).error((Object)iOException, (Throwable)iOException);
        }
    }

    private static int N(float f, float f2, int n) {
        return (int)Math.floor((class11908.y((double)Math.atan2(-f, f2)) + 180.0f) % 360.0f / (360.0f / (float)n));
    }
}

