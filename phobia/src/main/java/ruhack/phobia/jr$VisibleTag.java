/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import ruhack.phobia.jr;
import ruhack.phobia.jr$LivingTagLayout;
import ruhack.phobia.jr$ScreenBounds;

final class jr$VisibleTag {
    private static int[] ikw;
    private class_1297 entity;
    private String itemText;
    private float tagY;
    private float tagHeight;
    private int effectsAge;
    private float tagWidth;
    private final jr$ScreenBounds bounds;
    private int entityId;
    private static final long ai = -5124078296716904605L;
    private final List<String> effectTexts;
    private float tagX;
    private static int[] ikv;
    private final jr$LivingTagLayout layout;
    private float scale;
    private double distanceSq;
    private final class_1799[] equipment;
    private float itemTextWidth;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jr$VisibleTag() {
        var2_1 /* !! */  = jr$VisibleTag.b;
        super();
        this.entityId = (int)jr$VisibleTag.ikx("iky", iku(int ), (int)0);
        this.effectsAge = (int)jr$VisibleTag.ikx("ikz", iku(int ), (int)1);
        this.scale = 1.0f;
        this.itemText = "";
        this.bounds = new jr$ScreenBounds();
        this.layout = new jr$LivingTagLayout();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.equipment = new class_1799[jr.EQUIPMENT.length];
                this.effectTexts = new ArrayList<String>();
                return;
            }
lbl15:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ila", iku(int ), (int)2);
                ** GOTO lbl32
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilb", iku(int ), (int)3);
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilc", iku(int ), (int)4);
                    ** GOTO lbl32
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ild", iku(int ), (int)5);
                ** GOTO lbl41
            }
            case 4: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ile", iku(int ), (int)6);
                ** GOTO lbl41
            }
lbl32:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilf", iku(int ), (int)7);
                break;
            }
lbl35:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilg", iku(int ), (int)8);
                ** GOTO lbl15
            }
            case 7: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilh", iku(int ), (int)9);
                break;
            }
lbl41:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ili", iku(int ), (int)10);
                ** GOTO lbl35
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)jr$VisibleTag.ikx("ilj", iku(int ), (int)11);
        ** while (true)
    }

    private static /* synthetic */ void ill() {
        jr$VisibleTag.ikw[0] = -1261788185;
        jr$VisibleTag.ikw[1] = -1291786724;
        jr$VisibleTag.ikw[2] = 1572790913;
        jr$VisibleTag.ikw[3] = 672749531;
        jr$VisibleTag.ikw[4] = -2027901587;
        jr$VisibleTag.ikw[5] = 1608043182;
        jr$VisibleTag.ikw[6] = -1600904903;
        jr$VisibleTag.ikw[7] = 1651953129;
        jr$VisibleTag.ikw[8] = -385141120;
        jr$VisibleTag.ikw[9] = 401956658;
        jr$VisibleTag.ikw[10] = -1916328754;
        jr$VisibleTag.ikw[11] = 1486781029;
    }

    public static /* synthetic */ CallSite ikx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ilk() {
        jr$VisibleTag.ikv[0] = 885695463;
        jr$VisibleTag.ikv[1] = 855696924;
        jr$VisibleTag.ikv[2] = 1572790917;
        jr$VisibleTag.ikv[3] = 672749531;
        jr$VisibleTag.ikv[4] = -2027901589;
        jr$VisibleTag.ikv[5] = 1608043178;
        jr$VisibleTag.ikv[6] = -1600904902;
        jr$VisibleTag.ikv[7] = 1651953130;
        jr$VisibleTag.ikv[8] = -385141116;
        jr$VisibleTag.ikv[9] = 401956660;
        jr$VisibleTag.ikv[10] = -1916328760;
        jr$VisibleTag.ikv[11] = 1486781024;
    }

    static {
        ikv = new int[12];
        ikw = new int[12];
        jr$VisibleTag.ilk();
        jr$VisibleTag.ill();
    }

    private static /* synthetic */ int iku(int n2) {
        return ikv[n2] ^ ikw[n2];
    }
}

