/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 *  minecraft.class04551
 *  minecraft.class05257
 *  minecraft.class07321
 *  minecraft.class07676
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import java.time.Duration;
import minecraft.class04551;
import minecraft.class05257;
import minecraft.class07321;
import minecraft.class07676;
import org.jspecify.annotations.Nullable;

public class class07529 {
    @Deprecated
    public static final boolean N = false;
    @Deprecated
    public static final int y = 4671;
    @Deprecated
    public static final String L = "main";
    @Deprecated
    public static final int u = 774;
    @Deprecated
    public static final int i = 286;
    public static final int R = 4650;
    private static final int yT = 30;
    public static final boolean M = false;
    @Deprecated
    public static final int B = 75;
    @Deprecated
    public static final int Z = 0;
    @Deprecated
    public static final int z = 94;
    @Deprecated
    public static final int U = 1;
    public static final String E = "2.0.0";
    @Deprecated
    public static final int W = 1;
    public static final int m = 1;
    public static final String P = "DataVersion";
    public static final String s = "MC_DEBUG_";
    public static final boolean T = class07529.y(class07529.N("ENABLED"));
    private static final boolean yb = class07529.y(class07529.N("PRINT_PROPERTIES"));
    public static final boolean b = false;
    public static final boolean j = false;
    public static final boolean v = class07529.L("OPEN_INCOMPATIBLE_WORLDS");
    public static final boolean n = class07529.L("ALLOW_LOW_SIM_DISTANCE");
    public static final boolean t = class07529.L("HOTKEYS");
    public static final boolean G = class07529.L("UI_NARRATION");
    public static final boolean l = class07529.L("SHUFFLE_UI_RENDERING_ORDER");
    public static final boolean d = class07529.L("SHUFFLE_MODELS");
    public static final boolean w = class07529.L("RENDER_UI_LAYERING_RECTANGLES");
    public static final boolean k = class07529.L("PATHFINDING");
    public static final boolean Y = class07529.L("SHOW_LOCAL_SERVER_ENTITY_HIT_BOXES");
    public static final boolean Q = class07529.L("SHAPES");
    public static final boolean O = class07529.L("NEIGHBORSUPDATE");
    public static final boolean g = class07529.L("EXPERIMENTAL_REDSTONEWIRE_UPDATE_ORDER");
    public static final boolean I = class07529.L("STRUCTURES");
    public static final boolean J = class07529.L("GAME_EVENT_LISTENERS");
    public static final boolean o = class07529.L("DUMP_TEXTURE_ATLAS");
    public static final boolean q = class07529.L("DUMP_INTERPOLATED_TEXTURE_FRAMES");
    public static final boolean K = class07529.L("STRUCTURE_EDIT_MODE");
    public static final boolean V = class07529.L("SAVE_STRUCTURES_AS_SNBT");
    public static final boolean e = class07529.L("SYNCHRONOUS_GL_LOGS");
    public static final boolean H = class07529.L("VERBOSE_SERVER_EVENTS");
    public static final boolean c = class07529.L("NAMED_RUNNABLES");
    public static final boolean X = class07529.L("GOAL_SELECTOR");
    public static final boolean a = class07529.L("VILLAGE_SECTIONS");
    public static final boolean p = class07529.L("BRAIN");
    public static final boolean F = class07529.L("POI");
    public static final boolean A = class07529.L("BEES");
    public static final boolean f = class07529.L("RAIDS");
    public static final boolean C = class07529.L("BLOCK_BREAK");
    public static final boolean S = class07529.L("MONITOR_TICK_TIMES");
    public static final boolean x = class07529.L("KEEP_JIGSAW_BLOCKS_DURING_STRUCTURE_GEN");
    public static final boolean D = class07529.L("DONT_SAVE_WORLD");
    public static final boolean h = class07529.L("LARGE_DRIPSTONE");
    public static final boolean r = class07529.L("CARVERS");
    public static final boolean NN = class07529.L("ORE_VEINS");
    public static final boolean Ny = class07529.L("SCULK_CATALYST");
    public static final boolean NL = class07529.L("BYPASS_REALMS_VERSION_CHECK");
    public static final boolean Nu = class07529.L("SOCIAL_INTERACTIONS");
    public static final boolean Ni = class07529.L("VALIDATE_RESOURCE_PATH_CASE");
    public static final boolean NR = class07529.L("UNLOCK_ALL_TRADES");
    public static final boolean NM = class07529.L("BREEZE_MOB");
    public static final boolean NB = class07529.L("TRIAL_SPAWNER_DETECTS_SHEEP_AS_PLAYERS");
    public static final boolean NZ = class07529.L("VAULT_DETECTS_SHEEP_AS_PLAYERS");
    public static final boolean Nz = class07529.L("FORCE_ONBOARDING_SCREEN");
    public static final boolean NU = class07529.L("CURSOR_POS");
    public static final boolean NE = class07529.L("DEFAULT_SKIN_OVERRIDE");
    public static final boolean NW = class07529.L("PANORAMA_SCREENSHOT");
    public static final boolean Nm = class07529.L("CHASE_COMMAND");
    public static final boolean NP = class07529.L("VERBOSE_COMMAND_ERRORS");
    public static final boolean Ns = class07529.L("DEV_COMMANDS");
    public static final boolean NT = class07529.L("ACTIVE_TEXT_AREAS");
    public static final boolean Nb = class07529.L("IGNORE_LOCAL_MOB_CAP");
    public static final boolean Nj = class07529.L("DISABLE_LIQUID_SPREADING");
    public static final boolean Nv = class07529.L("AQUIFERS");
    public static final boolean Nn = class07529.L("JFR_PROFILING_ENABLE_LEVEL_LOADING");
    public static final boolean Nt = class07529.L("ENTITY_BLOCK_INTERSECTION");
    public static boolean NG = class07529.L("GENERATE_SQUARE_TERRAIN_WITHOUT_NOISE");
    public static final boolean Nl = class07529.L("ONLY_GENERATE_HALF_THE_WORLD");
    public static final boolean Nd = class07529.L("DISABLE_FLUID_GENERATION");
    public static final boolean Nw = class07529.L("DISABLE_AQUIFERS");
    public static final boolean Nk = class07529.L("DISABLE_SURFACE");
    public static final boolean NY = class07529.L("DISABLE_CARVERS");
    public static final boolean NQ = class07529.L("DISABLE_STRUCTURES");
    public static final boolean NO = class07529.L("DISABLE_FEATURES");
    public static final boolean Ng = class07529.L("DISABLE_ORE_VEINS");
    public static final boolean NI = class07529.L("DISABLE_BLENDING");
    public static final boolean NJ = class07529.L("DISABLE_BELOW_ZERO_RETROGENERATION");
    public static final int No = 25565;
    public static final boolean Nq = class07529.L("SUBTITLES");
    public static final int NK = class07529.u("FAKE_LATENCY_MS");
    public static final int NV = class07529.u("FAKE_JITTER_MS");
    public static final ResourceLeakDetector.Level Ne = ResourceLeakDetector.Level.DISABLED;
    public static final boolean NH = class07529.L("COMMAND_STACK_TRACES");
    public static final boolean Nc = class07529.L("WORLD_RECREATE");
    public static final boolean NX = class07529.L("SHOW_SERVER_DEBUG_VALUES");
    public static final boolean Na = class07529.L("FEATURE_COUNT");
    public static final boolean Np = class07529.L("FORCE_TELEMETRY");
    public static final boolean NF = class07529.L("DONT_SEND_TELEMETRY_TO_BACKEND");
    public static final long NA = Duration.ofMillis(300L).toNanos();
    public static final float Nf = 3600000.0f;
    public static final boolean NC = false;
    public static final boolean NS = false;
    public static boolean Nx = true;
    public static boolean ND;
    public static final int Nh = 16;
    public static final int Nr = 256;
    public static final int yN = 32500;
    public static final int yy = 2000000;
    public static final int yL = 16;
    public static final int yu = 1000000;
    public static final int yi = 32;
    public static final int yR = 128;
    public static final char[] yM;
    public static final int yB = 20;
    public static final int yZ = 50;
    public static final int yz = 1200;
    public static final int yU = 24000;
    public static final int yE = 3;
    public static final float yW = 1365.3334f;
    public static final float ym = 0.87890625f;
    public static final float yP = 17.578125f;
    public static final int ys = 64;
    private static @Nullable class04551 yj;

    private static boolean L(String string) {
        if (!T) {
            return false;
        }
        String string2 = class07529.N(string);
        if (yb) {
            System.out.println("Debug property available: " + string2 + ": bool");
        }
        return class07529.y(string2);
    }

    public static int L() {
        return 774;
    }

    private static int u(String string) {
        if (!T) {
            return 0;
        }
        String string2 = class07529.N(string);
        if (yb) {
            System.out.println("Debug property available: " + string2 + ": int");
        }
        return Integer.parseInt(System.getProperty(string2, "0"));
    }

    public static class04551 y() {
        if (yj == null) {
            throw new IllegalStateException("Game version not set");
        }
        return yj;
    }

    private static boolean y(String string) {
        String string2 = System.getProperty(string);
        return string2 != null && (string2.isEmpty() || Boolean.parseBoolean(string2));
    }

    public static void N(class04551 class045512) {
        if (yj == null) {
            yj = class045512;
        } else if (class045512 != yj) {
            throw new IllegalStateException("Cannot override the current game version!");
        }
    }

    public static boolean N(class07321 class073212) {
        int n = class073212.i();
        int n2 = class073212.R();
        if (Nl) {
            return n2 < 0;
        }
        if (NG) {
            return n > 8192 || n < 0 || n2 > 1024 || n2 < 0;
        }
        return false;
    }

    private static String N(String string) {
        return s + string;
    }

    public static void N() {
        if (yj == null) {
            yj = class05257.N();
        }
    }

    static {
        yM = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
        ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)Ne);
        CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = NH;
        CommandSyntaxException.BUILT_IN_EXCEPTIONS = new class07676();
    }
}

