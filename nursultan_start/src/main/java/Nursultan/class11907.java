/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.BypassHealth
 *  Nursultan.class10401
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11781
 *  Nursultan.class11783
 *  Nursultan.class11796
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00381
 *  minecraft.class00518
 *  minecraft.class00556
 *  minecraft.class01683
 *  minecraft.class01766
 *  minecraft.class01890
 *  minecraft.class02484
 *  minecraft.class02834
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class05298
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06683
 *  minecraft.class06889
 *  minecraft.class07041
 *  minecraft.class07043
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07064
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08609
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import Nursultan.BypassHealth;
import Nursultan.class10401;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11781;
import Nursultan.class11783;
import Nursultan.class11796;
import Nursultan.class11815;
import Nursultan.class11821;
import Nursultan.class11822;
import Nursultan.class11824;
import Nursultan.class11910;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class00518;
import minecraft.class00556;
import minecraft.class01683;
import minecraft.class01766;
import minecraft.class01890;
import minecraft.class02484;
import minecraft.class02834;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05298;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06683;
import minecraft.class06889;
import minecraft.class07041;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08609;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class class11907 {
    private static String[] z;
    private static double[] d;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    public static List<class06584> L(class07438 class074382) {
        ArrayList<class06584> arrayList = new ArrayList<class06584>();
        for (class07085 class070852 : class02834.field_49224) {
            class06584 class065842;
            if (class070852.N() != class07043.field_6178 || (class065842 = class074382.method_6118(class070852)).R()) continue;
            arrayList.add(class065842);
        }
        return arrayList;
    }

    public static void L() {
        IBaritone iBaritone = class11907.N();
        if (iBaritone == null) {
            return;
        }
        iBaritone.getPathingBehavior().cancelEverything();
    }

    private static void M() {
        z = new String[2];
        class11907.z[0] = "This is a utility class and cannot be instantiated";
        class11907.z[1] = "^[\u0430-\u044f\u0410-\u042fa-zA-Z0-9_\u0401\u0451]+$";
    }

    private class11907() {
        throw new UnsupportedOperationException(z[0]);
    }

    static {
        class11907.E();
        class11907.M();
        class11907.z();
        N_0 = class06202.Nq();
        N_1 = Pattern.compile(z[1]);
        N_2 = new Vector3d();
    }

    public static boolean i() {
        IBaritone iBaritone = class11907.N();
        if (iBaritone == null) {
            return false;
        }
        return iBaritone.getPathingBehavior().hasPath();
    }

    private static void z() {
    }

    private static class06584 u(class07438 class074382) {
        class06584 class065842 = class074382.method_62821();
        if (class065842 != null) {
            return class065842;
        }
        if (class074382 instanceof class11781 || !class074382.method_6115() || !class074382.method_6030().R()) {
            return null;
        }
        class06584 class065843 = class074382.method_5998(class074382.method_6058());
        return class065843.method_58694(class02484.H) != null ? class065843 : null;
    }

    public static boolean u() {
        if ((class04453)((class06202)class11907.N_0).T_4 == null) {
            return false;
        }
        return ((class11815)((class11796)((class11822)((class04453)((class06202)class11907.N_0).T_4)).dataManager()).y().N()).N();
    }

    public static void y(class10401 class104012) {
        class11821<Vector3d> var2 = ((class11824)((class11783)class104012).dataManager()).L();
        if (var2.N().y != d[0]) {
            class104012.method_5814(var2.N().x, var2.N().y, var2.N().z);
            var2.N().y = d[1];
        }
    }

    public static void y(class07438 class074382) {
        int n = class11281.y(class065842 -> Optional.ofNullable((class08609)class065842.y().method_58694(class02484.g)).map(class08609::y).orElse(Float.valueOf(0.0f)).floatValue() > 0.0f);
        if (class11281.y((int)n)) {
            return;
        }
        class11322.N((int)n);
        ((class01683)((class04453)((class06202)class11907.N_0).T_4).y_0).N((class00381)class00556.N((class07049)class074382, (boolean)((class04453)((class06202)class11907.N_0).T_4).method_5715()));
        ((class04453)((class06202)class11907.N_0).T_4).method_6104(class07050.field_5808);
        class11322.i();
    }

    public static class06889 y() {
        return new class06889(((class04453)((class06202)class11907.N_0).T_4).method_23317() - (Double)((class04453)((class06202)class11907.N_0).T_4).M_1, ((class04453)((class06202)class11907.N_0).T_4).method_23318() - (Double)((class04453)((class06202)class11907.N_0).T_4).M_2, ((class04453)((class06202)class11907.N_0).T_4).method_23321() - (Double)((class04453)((class06202)class11907.N_0).T_4).R_0);
    }

    public static boolean y(GameProfile gameProfile) {
        if (!class11910.i()) {
            return false;
        }
        class01683 class016832 = ((class06202)N_0).NE();
        if (class016832 == null) {
            return false;
        }
        return class016832.N(gameProfile.id()) == null;
    }

    private static void E() {
        d = new double[3];
        class11907.d[0] = Double.longBitsToDouble(-4571373524106608640L);
        class11907.d[1] = Double.longBitsToDouble(-4571373524106608640L);
        class11907.d[2] = Double.longBitsToDouble(0L);
    }

    public static boolean N(class07050 class070502, class06183 class061832) {
        class07082 class070822 = ((class03443)((class06202)class11907.N_0).T_2).N((class04453)((class06202)class11907.N_0).T_4, class070502, class061832);
        if (class070822 instanceof class07041 && ((class07041)class070822).i() == class07064.field_52427) {
            ((class04453)((class06202)class11907.N_0).T_4).method_6104(class070502);
            return true;
        }
        return false;
    }

    public static boolean N(class04477 class044772) {
        if ((class04453)((class06202)class11907.N_0).T_4 == null || class044772 == (class04453)((class06202)class11907.N_0).T_4) {
            return false;
        }
        if (class11910.i()) {
            return false;
        }
        if (class044772.method_5740()) {
            return true;
        }
        GameProfile gameProfile = class044772.method_7334();
        if (class11907.y(gameProfile)) {
            return true;
        }
        return class11907.N(class044772, gameProfile) || class11907.N(gameProfile);
    }

    public static boolean N(class04477 class044772, GameProfile gameProfile) {
        boolean bl = class02834.field_49224.N().stream().map(arg_0 -> ((class04477)class044772).method_6118(arg_0)).anyMatch(class065842 -> class065842.L(class02484.o)) && class044772.method_45325(class05298.y) == d[2];
        int n = gameProfile.id().version();
        if (n == 3 && bl) {
            return true;
        }
        return bl && n == 4 && gameProfile.properties().isEmpty();
    }

    public static boolean N(class07438 class074382, class07049 class070492) {
        class06584 class065842 = class11907.u(class074382);
        return class065842 != null && !class065842.R();
    }

    public static boolean N(class07438 class074382) {
        return class11907.L(class074382).isEmpty();
    }

    public static IBaritone N() {
        return BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)((class06202)class11907.N_0).T_4);
    }

    public static void N(class10401 class104012) {
        class11907.N(class104012, false);
    }

    public static void N(class10401 class104012, boolean bl) {
        class11824 class118242 = (class11824)((class11783)class104012).dataManager();
        class118242.L().N().set(class104012.method_23317(), class104012.method_23318(), class104012.method_23321());
        if (class104012.method_5765() || class104012.field_6012 < 2 || class104012.field_6038 == class104012.method_23317() && class104012.field_5971 == class104012.method_23318() && class104012.field_5989 == class104012.method_23321()) {
            return;
        }
        if (bl || class104012.method_6128()) {
            Vector3d vector3d = class118242.N().N();
            class104012.method_5814(vector3d.x, vector3d.y, vector3d.z);
            return;
        }
        ((Vector3d)N_2).set(((class04453)((class06202)class11907.N_0).T_4).method_23317(), ((class04453)((class06202)class11907.N_0).T_4).method_23320(), ((class04453)((class06202)class11907.N_0).T_4).method_23321());
        Vector3d vector3d = class118242.u().N();
        Vector3d vector3d2 = class118242.N().N();
        Vector3d vector3d3 = ((Vector3d)N_2).distance((Vector3dc)vector3d) > ((Vector3d)N_2).distance((Vector3dc)vector3d2) ? vector3d2 : vector3d;
        class104012.method_5814(vector3d3.x, vector3d3.y, vector3d3.z);
    }

    public static boolean N(GameProfile gameProfile) {
        return !((Pattern)N_1).matcher(gameProfile.name()).find();
    }

    public static void N(class07050 class070502) {
        class07082 class070822 = ((class03443)((class06202)class11907.N_0).T_2).N((class08036)((class04453)((class06202)class11907.N_0).T_4), class070502);
        if (class070822 instanceof class07041 && ((class07041)class070822).i() == class07064.field_52427) {
            ((class04453)((class06202)class11907.N_0).T_4).method_6104(class070502);
        }
    }

    public static float N(class07438 class074382, float f) {
        if ((class03448)((class06202)class11907.N_0).T_3 == null || !BypassHealth.m() || ((class06202)N_0).q() || class074382 instanceof class11781) {
            return f;
        }
        class06683 class066832 = ((class03448)((class06202)class11907.N_0).T_3).method_8428();
        if (class066832 == null) {
            return f;
        }
        class00518 class005182 = class066832.N(class01890.field_45158);
        if (class005182 == null) {
            return f;
        }
        int n = class066832.N(class01766.N((String)class074382.method_5820()), class005182).N();
        return n > 0 ? (float)n : f;
    }
}

