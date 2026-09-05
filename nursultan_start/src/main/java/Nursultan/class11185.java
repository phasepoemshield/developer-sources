/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  org.apache.logging.log4j.LogManager
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11169;
import Nursultan.class11172;
import Nursultan.class11193;
import org.apache.logging.log4j.LogManager;

public class class11185 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object y_0;
    public static Object y_1;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;
    public static Object u_0;
    public static Object u_1;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;
    public static Object i_5;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object M_0;
    public static Object M_1;
    public static Object B_0;
    public static Object B_1;
    public static Object B_2;
    public static Object B_3;
    public static Object B_4;
    public static Object B_5;
    public static Object Z_0;
    public static Object Z_1;
    public static Object Z_2;
    public static Object Z_3;
    public static Object Z_4;
    public static Object Z_5;
    public static Object z_0;
    public static Object z_1;
    public static Object U_0;
    public static Object U_1;
    public static Object U_2;
    public static Object U_3;
    public static Object U_4;
    public static Object U_5;
    public static Object U_6;
    public static Object E_0;
    public static Object E_1;
    public static Object E_2;
    public static Object E_3;
    public static Object E_4;
    public static Object E_5;
    public static Object E_6;
    public static Object E_7;
    public static Object W_0;

    private static class09322 M() {
        return ((class11193)U_2).N().N("radius", class11169.INT).N("weights", class11169.FLOAT_ARRAY).N("direction", class11169.VEC2).y();
    }

    private static class09322 P(String string) {
        return new class09322((String)R_2, class11185.Q(string));
    }

    private static String Q(String string) {
        return "shaders/" + string;
    }

    private class11185() {
        ((class09322)N_4).N("Scene", 0);
        ((class09322)z_0).N("Scene", 0);
        ((class09322)z_1).N("Scene", 0);
        ((class09322)E_0).N("Scene", 0);
    }

    static {
        class11185.B();
        R_0 = LogManager.getLogger(String.class);
        R_2 = class11185.Q("default.vert");
        R_3 = class11185.N("blurred_round_rect.frag", false);
        Z_0 = class11185.N("blurred_round_rect.frag", true);
        Z_1 = class11185.P("color_multiply.frag");
        Z_2 = class11185.P("layer_composite.frag");
        Z_3 = class11185.P("color_picker_alpha.frag");
        Z_4 = class11185.P("color_picker_gradient.frag");
        Z_5 = class11185.P("color_picker_hue.frag");
        u_0 = class11185.P("color_picker_pipette_preview.frag");
        u_1 = class11185.P("depth_filter.frag");
        L_0 = class11185.P("depth_mask.frag");
        L_1 = class11185.P("flood.frag");
        L_2 = class11185.P("outline_pass.frag");
        L_3 = class11185.P("uv_seed.frag");
        L_4 = class11185.P("jump_flood.frag");
        L_5 = class11185.P("esp_mix.frag");
        L_6 = class11185.P("grayscale_fade.frag");
        U_0 = class11185.P("glows.frag");
        U_1 = class11185.P("glowf.frag");
        U_2 = class11185.N().N("gaussian.frag").N();
        U_3 = class11185.M();
        U_4 = class11185.N(5, 1.0f, 0.0f);
        U_5 = class11185.N(5, 0.0f, 1.0f);
        U_6 = class11185.N(10, 1.0f, 0.0f);
        B_0 = class11185.N(10, 0.0f, 1.0f);
        B_1 = class11185.N(15, 1.0f, 0.0f);
        B_2 = class11185.N(15, 0.0f, 1.0f);
        B_3 = class11185.P("downscale.frag");
        B_4 = class11185.P("downscale_composite.frag");
        B_5 = class11185.P("texture_copy.frag");
        M_0 = class11185.P("sky_aurora.frag");
        M_1 = class11185.P("sky_borealis.frag");
        i_0 = class11185.P("sky_borealis_aurora.frag");
        i_1 = class11185.P("shockwave.frag");
        i_2 = class11185.P("chams.frag");
        String string = class11185.Q("ghost.vert");
        i_3 = new class09322(string, class11185.Q("ghost.frag"));
        String string2 = class11185.Q("hands.vert");
        i_4 = new class09322(string2, class11185.Q("hands.frag"));
        i_5 = class11185.P("sparkle.frag");
        y_0 = class11185.P("target_head.frag");
        y_1 = class11185.P("target_health_ring.frag");
        N_0 = class11185.P("target_scan.frag");
        N_1 = class11185.P("waypoint_scan.frag");
        N_2 = class11185.N("text_alpha_mask.vert", "text_alpha_mask.frag", false);
        N_3 = class11185.N("text_alpha_mask.vert", "text_alpha_mask.frag", true);
        String string3 = class11185.Q("pos_color.vert");
        N_4 = new class09322(string3, class11185.Q("pos_color.frag"));
        String string4 = class11185.Q("line.vert");
        z_0 = new class09322(string4, class11185.Q("line.frag"));
        String string5 = class11185.Q("blockesp_cube.vert");
        z_1 = new class09322(string5, class11185.Q("pos_color.frag"));
        String string6 = class11185.Q("trajectory_grid.vert");
        E_0 = new class09322(string6, class11185.Q("trajectory_grid.frag"));
        E_1 = class11185.N(false, false);
        E_2 = class11185.N(false, true);
        E_3 = class11185.N(true, false);
        E_4 = class11185.N(true, true);
        String string7 = class11185.Q("kill_effect.vert");
        E_5 = new class09322(string7, class11185.Q("kill_effect.frag"));
        String string8 = class11185.Q("particle_instanced.vert");
        E_6 = new class09322(string8, class11185.Q("particle_instanced.frag"));
        String string9 = class11185.Q("arc_instanced.vert");
        E_7 = new class09322(string9, class11185.Q("arc_instanced.frag"));
        String string10 = class11185.Q("font.vert");
        W_0 = new class09322(string10, class11185.Q("font.frag"));
    }

    private static void B() {
        R_0 = null;
        R_1 = "shaders/";
        R_2 = null;
        R_3 = null;
        Z_0 = null;
        Z_1 = null;
        Z_2 = null;
        Z_3 = null;
        Z_4 = null;
        Z_5 = null;
        u_0 = null;
        u_1 = null;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        L_6 = null;
        U_0 = null;
        U_1 = null;
        U_2 = null;
        U_3 = null;
        U_4 = null;
        U_5 = null;
        U_6 = null;
        B_0 = null;
        B_1 = null;
        B_2 = null;
        B_3 = null;
        B_4 = null;
        B_5 = null;
        M_0 = null;
        M_1 = null;
        i_0 = null;
        i_1 = null;
        i_2 = null;
        i_3 = null;
        i_4 = null;
        i_5 = null;
        y_0 = null;
        y_1 = null;
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        z_0 = null;
        z_1 = null;
        E_0 = null;
        E_1 = null;
        E_2 = null;
        E_3 = null;
        E_4 = null;
        E_5 = null;
        E_6 = null;
        E_7 = null;
        W_0 = null;
    }

    private static float[] y(int n) {
        int n2;
        int n3 = n - 1;
        float f = Math.max((float)n3 / 3.0f, 1.0f);
        float[] fArray = new float[30];
        double d = 0.0;
        for (n2 = 0; n2 <= n3; ++n2) {
            double d2 = Math.exp((double)(-(n2 * n2)) / (2.0 * (double)f * (double)f));
            fArray[n2] = (float)d2;
            d += n2 == 0 ? d2 : d2 * 2.0;
        }
        for (n2 = 0; n2 <= n3; ++n2) {
            fArray[n2] = (float)((double)fArray[n2] / d);
        }
        return fArray;
    }

    public static class11172 N() {
        return class11193.N("shaders/");
    }

    private static class09322 N(boolean bl, boolean bl2) {
        return class11185.N().N("ui_uber.vert", "ui_uber.frag").N("CLIP_USE_LOOP", bl2).N("BLUR_ENABLED", bl).y();
    }

    private static class09322 N(String string, boolean bl) {
        return class11185.N().N(string).N("CLIP_USE_LOOP", bl).y();
    }

    private static class09322 N(int n, float f, float f2) {
        return ((class11193)U_2).N().N("radius", n - 1).N("weights", class11185.y(n)).N("direction", new float[]{f, f2}).y();
    }

    private static class09322 N(String string, String string2, boolean bl) {
        return class11185.N().N(string, string2).N("CLIP_USE_LOOP", bl).y();
    }
}

