/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05403
 *  minecraft.class05418
 */
package minecraft;

import java.util.Optional;
import java.util.stream.IntStream;
import minecraft.class01894;
import minecraft.class05403;
import minecraft.class05418;

public class class05433 {
    public static final class05403 N = class05433.N("cube", class05418.L, class05418.z, class05418.U, class05418.E, class05418.W, class05418.m, class05418.P);
    public static final class05403 y = class05433.N("cube_directional", class05418.L, class05418.z, class05418.U, class05418.E, class05418.W, class05418.m, class05418.P);
    public static final class05403 L = class05433.N("cube_all", class05418.N);
    public static final class05403 u = class05433.N("cube_all_inner_faces", class05418.N);
    public static final class05403 i = class05433.y("cube_mirrored_all", "_mirrored", class05418.N);
    public static final class05403 R = class05433.y("cube_north_west_mirrored_all", "_north_west_mirrored", class05418.N);
    public static final class05403 M = class05433.y("cube_column_uv_locked_x", "_x", class05418.u, class05418.Z);
    public static final class05403 B = class05433.y("cube_column_uv_locked_y", "_y", class05418.u, class05418.Z);
    public static final class05403 Z = class05433.y("cube_column_uv_locked_z", "_z", class05418.u, class05418.Z);
    public static final class05403 z = class05433.N("cube_column", class05418.u, class05418.Z);
    public static final class05403 U = class05433.y("cube_column_horizontal", "_horizontal", class05418.u, class05418.Z);
    public static final class05403 E = class05433.y("cube_column_mirrored", "_mirrored", class05418.u, class05418.Z);
    public static final class05403 W = class05433.N("cube_top", class05418.R, class05418.Z);
    public static final class05403 m = class05433.N("cube_bottom_top", class05418.R, class05418.i, class05418.Z);
    public static final class05403 P = class05433.N("cube_bottom_top_inner_faces", class05418.R, class05418.i, class05418.Z);
    public static final class05403 s = class05433.N("orientable", class05418.R, class05418.M, class05418.Z);
    public static final class05403 T = class05433.N("orientable_with_bottom", class05418.R, class05418.i, class05418.Z, class05418.M);
    public static final class05403 b = class05433.y("orientable_vertical", "_vertical", class05418.M, class05418.Z);
    public static final class05403 j = class05433.N("button", class05418.y);
    public static final class05403 v = class05433.y("button_pressed", "_pressed", class05418.y);
    public static final class05403 n = class05433.y("button_inventory", "_inventory", class05418.y);
    public static final class05403 t = class05433.y("door_bottom_left", "_bottom_left", class05418.R, class05418.i);
    public static final class05403 G = class05433.y("door_bottom_left_open", "_bottom_left_open", class05418.R, class05418.i);
    public static final class05403 l = class05433.y("door_bottom_right", "_bottom_right", class05418.R, class05418.i);
    public static final class05403 d = class05433.y("door_bottom_right_open", "_bottom_right_open", class05418.R, class05418.i);
    public static final class05403 w = class05433.y("door_top_left", "_top_left", class05418.R, class05418.i);
    public static final class05403 k = class05433.y("door_top_left_open", "_top_left_open", class05418.R, class05418.i);
    public static final class05403 Y = class05433.y("door_top_right", "_top_right", class05418.R, class05418.i);
    public static final class05403 Q = class05433.y("door_top_right_open", "_top_right_open", class05418.R, class05418.i);
    public static final class05403 O = class05433.y("custom_fence_post", "_post", class05418.y, class05418.L);
    public static final class05403 g = class05433.y("custom_fence_side_north", "_side_north", class05418.y);
    public static final class05403 I = class05433.y("custom_fence_side_east", "_side_east", class05418.y);
    public static final class05403 J = class05433.y("custom_fence_side_south", "_side_south", class05418.y);
    public static final class05403 o = class05433.y("custom_fence_side_west", "_side_west", class05418.y);
    public static final class05403 q = class05433.y("custom_fence_inventory", "_inventory", class05418.y);
    public static final class05403 K = class05433.y("fence_post", "_post", class05418.y);
    public static final class05403 V = class05433.y("fence_side", "_side", class05418.y);
    public static final class05403 e = class05433.y("fence_inventory", "_inventory", class05418.y);
    public static final class05403 H = class05433.y("template_wall_post", "_post", class05418.j);
    public static final class05403 c = class05433.y("template_wall_side", "_side", class05418.j);
    public static final class05403 X = class05433.y("template_wall_side_tall", "_side_tall", class05418.j);
    public static final class05403 a = class05433.y("wall_inventory", "_inventory", class05418.j);
    public static final class05403 p = class05433.N("template_custom_fence_gate", class05418.y, class05418.L);
    public static final class05403 F = class05433.y("template_custom_fence_gate_open", "_open", class05418.y, class05418.L);
    public static final class05403 A = class05433.y("template_custom_fence_gate_wall", "_wall", class05418.y, class05418.L);
    public static final class05403 f = class05433.y("template_custom_fence_gate_wall_open", "_wall_open", class05418.y, class05418.L);
    public static final class05403 C = class05433.N("template_fence_gate", class05418.y);
    public static final class05403 S = class05433.y("template_fence_gate_open", "_open", class05418.y);
    public static final class05403 x = class05433.y("template_fence_gate_wall", "_wall", class05418.y);
    public static final class05403 D = class05433.y("template_fence_gate_wall_open", "_wall_open", class05418.y);
    public static final class05403 h = class05433.N("pressure_plate_up", class05418.y);
    public static final class05403 r = class05433.y("pressure_plate_down", "_down", class05418.y);
    public static final class05403 NN = class05433.N(class05418.L);
    public static final class05403 Ny = class05433.N("slab", class05418.i, class05418.R, class05418.Z);
    public static final class05403 NL = class05433.y("slab_top", "_top", class05418.i, class05418.R, class05418.Z);
    public static final class05403 Nu = class05433.N("leaves", class05418.N);
    public static final class05403 Ni = class05433.N("stairs", class05418.i, class05418.R, class05418.Z);
    public static final class05403 NR = class05433.y("inner_stairs", "_inner", class05418.i, class05418.R, class05418.Z);
    public static final class05403 NM = class05433.y("outer_stairs", "_outer", class05418.i, class05418.R, class05418.Z);
    public static final class05403 NB = class05433.y("template_trapdoor_top", "_top", class05418.y);
    public static final class05403 NZ = class05433.y("template_trapdoor_bottom", "_bottom", class05418.y);
    public static final class05403 Nz = class05433.y("template_trapdoor_open", "_open", class05418.y);
    public static final class05403 NU = class05433.y("template_orientable_trapdoor_top", "_top", class05418.y);
    public static final class05403 NE = class05433.y("template_orientable_trapdoor_bottom", "_bottom", class05418.y);
    public static final class05403 NW = class05433.y("template_orientable_trapdoor_open", "_open", class05418.y);
    public static final class05403 Nm = class05433.N("pointed_dripstone", class05418.s);
    public static final class05403 NP = class05433.N("cross", class05418.s);
    public static final class05403 Ns = class05433.N("tinted_cross", class05418.s);
    public static final class05403 NT = class05433.N("cross_emissive", class05418.s, class05418.T);
    public static final class05403 Nb = class05433.N("flower_pot_cross", class05418.b);
    public static final class05403 Nj = class05433.N("tinted_flower_pot_cross", class05418.b);
    public static final class05403 Nv = class05433.N("flower_pot_cross_emissive", class05418.b, class05418.T);
    public static final class05403 Nn = class05433.N("rail_flat", class05418.v);
    public static final class05403 Nt = class05433.y("rail_curved", "_corner", class05418.v);
    public static final class05403 NG = class05433.y("template_rail_raised_ne", "_raised_ne", class05418.v);
    public static final class05403 Nl = class05433.y("template_rail_raised_sw", "_raised_sw", class05418.v);
    public static final class05403 Nd = class05433.N("carpet", class05418.n);
    public static final class05403 Nw = class05433.N("mossy_carpet_side", class05418.Z);
    public static final class05403 Nk = class05433.y("flowerbed_1", "_1", class05418.p, class05418.w);
    public static final class05403 NY = class05433.y("flowerbed_2", "_2", class05418.p, class05418.w);
    public static final class05403 NQ = class05433.y("flowerbed_3", "_3", class05418.p, class05418.w);
    public static final class05403 NO = class05433.y("flowerbed_4", "_4", class05418.p, class05418.w);
    public static final class05403 Ng = class05433.y("template_leaf_litter_1", "_1", class05418.y);
    public static final class05403 NI = class05433.y("template_leaf_litter_2", "_2", class05418.y);
    public static final class05403 NJ = class05433.y("template_leaf_litter_3", "_3", class05418.y);
    public static final class05403 No = class05433.y("template_leaf_litter_4", "_4", class05418.y);
    public static final class05403 Nq = class05433.N("coral_fan", class05418.d);
    public static final class05403 NK = class05433.N("coral_wall_fan", class05418.d);
    public static final class05403 NV = class05433.N("template_glazed_terracotta", class05418.t);
    public static final class05403 Ne = class05433.N("template_chorus_flower", class05418.y);
    public static final class05403 NH = class05433.N("template_daylight_detector", class05418.R, class05418.Z);
    public static final class05403 Nc = class05433.y("template_glass_pane_noside", "_noside", class05418.G);
    public static final class05403 NX = class05433.y("template_glass_pane_noside_alt", "_noside_alt", class05418.G);
    public static final class05403 Na = class05433.y("template_glass_pane_post", "_post", class05418.G, class05418.l);
    public static final class05403 Np = class05433.y("template_glass_pane_side", "_side", class05418.G, class05418.l);
    public static final class05403 NF = class05433.y("template_glass_pane_side_alt", "_side_alt", class05418.G, class05418.l);
    public static final class05403 NA = class05433.N("template_command_block", class05418.M, class05418.B, class05418.Z);
    public static final class05403 Nf = class05433.y("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", class05418.y);
    public static final class05403 NC = class05433.y("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", class05418.y);
    public static final class05403 NS = class05433.y("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", class05418.y);
    public static final class05403 Nx = class05433.y("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", class05418.y);
    public static final class05403 ND = class05433.y("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", class05418.y);
    public static final class05403 Nh = class05433.y("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", class05418.y);
    public static final class05403 Nr = class05433.N("template_shelf_body", class05418.N, class05418.L);
    public static final class05403 yN = class05433.y("template_shelf_inventory", "_inventory", class05418.N, class05418.L);
    public static final class05403 yy = class05433.y("template_shelf_unpowered", "_unpowered", class05418.N, class05418.L);
    public static final class05403 yL = class05433.y("template_shelf_unconnected", "_unconnected", class05418.N, class05418.L);
    public static final class05403 yu = class05433.y("template_shelf_left", "_left", class05418.N, class05418.L);
    public static final class05403 yi = class05433.y("template_shelf_center", "_center", class05418.N, class05418.L);
    public static final class05403 yR = class05433.y("template_shelf_right", "_right", class05418.N, class05418.L);
    public static final class05403 yM = class05433.N("template_anvil", class05418.R);
    public static final class05403[] yB = (class05403[])IntStream.range(0, 8).mapToObj(n -> class05433.y("stem_growth" + n, "_stage" + n, class05418.w)).toArray(class05403[]::new);
    public static final class05403 yZ = class05433.N("stem_fruit", class05418.w, class05418.k);
    public static final class05403 yz = class05433.N("crop", class05418.Y);
    public static final class05403 yU = class05433.N("template_farmland", class05418.Q, class05418.R);
    public static final class05403 yE = class05433.N("template_fire_floor", class05418.O);
    public static final class05403 yW = class05433.N("template_fire_side", class05418.O);
    public static final class05403 ym = class05433.N("template_fire_side_alt", class05418.O);
    public static final class05403 yP = class05433.N("template_fire_up", class05418.O);
    public static final class05403 ys = class05433.N("template_fire_up_alt", class05418.O);
    public static final class05403 yT = class05433.N("template_campfire", class05418.O, class05418.e);
    public static final class05403 yb = class05433.N("template_lantern", class05418.g);
    public static final class05403 yj = class05433.y("template_hanging_lantern", "_hanging", class05418.g);
    public static final class05403 yv = class05433.N("template_chain", class05418.y);
    public static final class05403 yn = class05433.y("template_bars_cap", "_cap", class05418.A, class05418.l);
    public static final class05403 yt = class05433.y("template_bars_cap_alt", "_cap_alt", class05418.A, class05418.l);
    public static final class05403 yG = class05433.y("template_bars_post", "_post", class05418.A, class05418.l);
    public static final class05403 yl = class05433.y("template_bars_post_ends", "_post_ends", class05418.A, class05418.l);
    public static final class05403 yd = class05433.y("template_bars_side", "_side", class05418.A, class05418.l);
    public static final class05403 yw = class05433.y("template_bars_side_alt", "_side_alt", class05418.A, class05418.l);
    public static final class05403 yk = class05433.N("template_torch", class05418.o);
    public static final class05403 yY = class05433.N("template_torch_unlit", class05418.o);
    public static final class05403 yQ = class05433.N("template_torch_wall", class05418.o);
    public static final class05403 yO = class05433.N("template_torch_wall_unlit", class05418.o);
    public static final class05403 yg = class05433.N("template_redstone_torch", class05418.o);
    public static final class05403 yI = class05433.N("template_redstone_torch_wall", class05418.o);
    public static final class05403 yJ = class05433.N("template_piston", class05418.I, class05418.i, class05418.Z);
    public static final class05403 yo = class05433.N("template_piston_head", class05418.I, class05418.Z, class05418.J);
    public static final class05403 yq = class05433.N("template_piston_head_short", class05418.I, class05418.Z, class05418.J);
    public static final class05403 yK = class05433.N("template_seagrass", class05418.y);
    public static final class05403 yV = class05433.N("template_turtle_egg", class05418.N);
    public static final class05403 ye = class05433.N("dried_ghast", class05418.L, class05418.R, class05418.i, class05418.z, class05418.U, class05418.E, class05418.W, class05418.F);
    public static final class05403 yH = class05433.N("template_two_turtle_eggs", class05418.N);
    public static final class05403 yc = class05433.N("template_three_turtle_eggs", class05418.N);
    public static final class05403 yX = class05433.N("template_four_turtle_eggs", class05418.N);
    public static final class05403 ya = class05433.N("template_single_face", class05418.y);
    public static final class05403 yp = class05433.N("template_cauldron_level1", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
    public static final class05403 yF = class05433.N("template_cauldron_level2", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
    public static final class05403 yA = class05433.N("template_cauldron_full", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
    public static final class05403 yf = class05433.N("template_azalea", class05418.R, class05418.Z);
    public static final class05403 yC = class05433.N("template_potted_azalea_bush", class05418.b, class05418.R, class05418.Z);
    public static final class05403 yS = class05433.N("template_potted_azalea_bush", class05418.b, class05418.R, class05418.Z);
    public static final class05403 yx = class05433.N("sniffer_egg", class05418.R, class05418.i, class05418.z, class05418.U, class05418.E, class05418.W);
    public static final class05403 yD = class05433.y("generated", class05418.q);
    public static final class05403 yh = class05433.y("template_music_disc", class05418.q);
    public static final class05403 yr = class05433.y("handheld", class05418.q);
    public static final class05403 LN = class05433.y("handheld_rod", class05418.q);
    public static final class05403 Ly = class05433.y("generated", class05418.q, class05418.K);
    public static final class05403 LL = class05433.y("generated", class05418.q, class05418.K, class05418.V);
    public static final class05403 Lu = class05433.y("template_shulker_box", class05418.L);
    public static final class05403 Li = class05433.y("template_bed", class05418.L);
    public static final class05403 LR = class05433.y("template_chest", class05418.L);
    public static final class05403 LM = class05433.N("template_bundle_open_front", "_open_front", class05418.q);
    public static final class05403 LB = class05433.N("template_bundle_open_back", "_open_back", class05418.q);
    public static final class05403 LZ = class05433.y("bow", class05418.q);
    public static final class05403 Lz = class05433.y("crossbow", class05418.q);
    public static final class05403 LU = class05433.N("spear_in_hand", "_in_hand", class05418.q);
    public static final class05403 LE = class05433.N("template_candle", class05418.N, class05418.L);
    public static final class05403 LW = class05433.N("template_two_candles", class05418.N, class05418.L);
    public static final class05403 Lm = class05433.N("template_three_candles", class05418.N, class05418.L);
    public static final class05403 LP = class05433.N("template_four_candles", class05418.N, class05418.L);
    public static final class05403 Ls = class05433.N("template_cake_with_candle", class05418.H, class05418.i, class05418.Z, class05418.R, class05418.L);
    public static final class05403 LT = class05433.N("template_sculk_shrieker", class05418.i, class05418.Z, class05418.R, class05418.L, class05418.a);
    public static final class05403 Lb = class05433.N("template_vault", class05418.R, class05418.i, class05418.Z, class05418.M);
    public static final class05403 Lj = class05433.y("handheld_mace", class05418.q);
    public static final class05403 Lv = class05433.N("template_lightning_rod", class05418.y);

    private static class05403 y(String string, class05418 ... class05418Array) {
        return new class05403(Optional.of(class01894.y((String)("item/" + string))), Optional.empty(), class05418Array);
    }

    private static class05403 y(String string, String string2, class05418 ... class05418Array) {
        return new class05403(Optional.of(class01894.y((String)("block/" + string))), Optional.of(string2), class05418Array);
    }

    private static class05403 N(String string, String string2, class05418 ... class05418Array) {
        return new class05403(Optional.of(class01894.y((String)("item/" + string))), Optional.of(string2), class05418Array);
    }

    private static class05403 N(String string, class05418 ... class05418Array) {
        return new class05403(Optional.of(class01894.y((String)("block/" + string))), Optional.empty(), class05418Array);
    }

    private static class05403 N(class05418 ... class05418Array) {
        return new class05403(Optional.empty(), Optional.empty(), class05418Array);
    }
}

