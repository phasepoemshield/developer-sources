/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.base.VFPDebugHudEntry
 *  minecraft.class01045
 *  minecraft.class01195
 *  minecraft.class01285
 *  minecraft.class01535
 *  minecraft.class01629
 *  minecraft.class01894
 *  minecraft.class04639
 *  minecraft.class04743
 *  minecraft.class04840
 *  minecraft.class04990
 *  minecraft.class05140
 *  minecraft.class05234
 *  minecraft.class05586
 *  minecraft.class05631
 *  minecraft.class05679
 *  minecraft.class05783
 *  minecraft.class06185
 *  minecraft.class06276
 *  minecraft.class06380
 *  minecraft.class06431
 *  minecraft.class08946
 *  minecraft.class08947
 *  minecraft.class08949
 *  minecraft.class08962
 *  minecraft.class08975
 *  minecraft.class08977
 *  minecraft.class08987
 *  minecraft.class08991
 *  net.caffeinemc.mods.sodium.mixin.features.gui.hooks.debug.DebugScreenEntriesAccessor
 *  net.irisshaders.iris.gui.debug.IrisDebugEntry
 *  net.irisshaders.iris.gui.debug.IrisTrueDebugEntry
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.base.VFPDebugHudEntry;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01045;
import minecraft.class01195;
import minecraft.class01285;
import minecraft.class01535;
import minecraft.class01629;
import minecraft.class01894;
import minecraft.class04639;
import minecraft.class04743;
import minecraft.class04840;
import minecraft.class04990;
import minecraft.class05140;
import minecraft.class05234;
import minecraft.class05586;
import minecraft.class05631;
import minecraft.class05679;
import minecraft.class05783;
import minecraft.class06083;
import minecraft.class06185;
import minecraft.class06276;
import minecraft.class06380;
import minecraft.class06431;
import minecraft.class08946;
import minecraft.class08947;
import minecraft.class08949;
import minecraft.class08962;
import minecraft.class08975;
import minecraft.class08977;
import minecraft.class08987;
import minecraft.class08991;
import net.caffeinemc.mods.sodium.mixin.features.gui.hooks.debug.DebugScreenEntriesAccessor;
import net.irisshaders.iris.gui.debug.IrisDebugEntry;
import net.irisshaders.iris.gui.debug.IrisTrueDebugEntry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06134
implements DebugScreenEntriesAccessor {
    private static final Map<class01894, class01285> X = new HashMap<class01894, class01285>();
    public static final class01894 N = class06134.N("game_version", (class01285)new class05631());
    public static final class01894 y = class06134.N("fps", (class01285)new class08947());
    public static final class01894 L = class06134.N("tps", (class01285)new class05234());
    public static final class01894 u = class06134.N("memory", (class01285)new class04743());
    public static final class01894 i = class06134.N("system_specs", (class01285)new class04840());
    public static final class01894 R = class06134.N("looking_at_block", (class01285)new class01535());
    public static final class01894 M = class06134.N("looking_at_fluid", (class01285)new class05586());
    public static final class01894 B = class06134.N("looking_at_entity", (class01285)new class06185());
    public static final class01894 Z = class06134.N("chunk_render_stats", (class01285)new class08946());
    public static final class01894 z = class06134.N("chunk_generation_stats", (class01285)new class08975());
    public static final class01894 U = class06134.N("entity_render_stats", (class01285)new class08991());
    public static final class01894 E = class06134.N("particle_render_stats", (class01285)new class05140());
    public static final class01894 W = class06134.N("chunk_source_stats", (class01285)new class08962());
    public static final class01894 m = class06134.N("player_position", (class01285)new class06431());
    public static final class01894 P = class06134.N("player_section_position", (class01285)new class04990());
    public static final class01894 s = class06134.N("light_levels", (class01285)new class01629());
    public static final class01894 T = class06134.N("heightmap", (class01285)new class08987());
    public static final class01894 b = class06134.N("biome", (class01285)new class08949());
    public static final class01894 j = class06134.N("local_difficulty", (class01285)new class06380());
    public static final class01894 v = class06134.N("entity_spawn_counts", (class01285)new class06083());
    public static final class01894 n = class06134.N("sound_mood", (class01285)new class04639());
    public static final class01894 t = class06134.N("post_effect", (class01285)new class01195());
    public static final class01894 G = class06134.N("entity_hitboxes", (class01285)new class01045());
    public static final class01894 l = class06134.N("chunk_borders", (class01285)new class01045());
    public static final class01894 d = class06134.N("3d_crosshair", (class01285)new class01045());
    public static final class01894 w = class06134.N("chunk_section_paths", (class01285)new class01045());
    public static final class01894 k = class06134.N("gpu_utilization", (class01285)new class08977());
    public static final class01894 Y = class06134.N("simple_performance_impactors", (class01285)new class05783());
    public static final class01894 Q = class06134.N("chunk_section_octree", (class01285)new class01045());
    public static final class01894 O = class06134.N("visualize_water_levels", (class01285)new class01045());
    public static final class01894 g = class06134.N("visualize_heightmap", (class01285)new class01045());
    public static final class01894 I = class06134.N("visualize_collision_boxes", (class01285)new class01045());
    public static final class01894 J = class06134.N("visualize_entity_supporting_blocks", (class01285)new class01045());
    public static final class01894 o = class06134.N("visualize_block_light_levels", (class01285)new class01045());
    public static final class01894 q = class06134.N("visualize_sky_light_levels", (class01285)new class01045());
    public static final class01894 K = class06134.N("visualize_solid_faces", (class01285)new class01045());
    public static final class01894 V = class06134.N("visualize_chunks_on_server", (class01285)new class01045());
    public static final class01894 e = class06134.N("visualize_sky_light_sections", (class01285)new class01045());
    public static final class01894 H = class06134.N("chunk_section_visibility", (class01285)new class01045());
    public static Map<class05679, Map<class01894, class06276>> c;

    static {
        Map<class01894, class06276> $$0 = Map.of(d, class06276.field_61594, N, class06276.field_61594, L, class06276.field_61594, y, class06276.field_61594, u, class06276.field_61594, i, class06276.field_61594, m, class06276.field_61594, P, class06276.field_61594, Y, class06276.field_61594);
        Map<class01894, class06276> $$1 = Map.of(L, class06276.field_61594, y, class06276.field_61593, k, class06276.field_61594, u, class06276.field_61594, Y, class06276.field_61594);
        c = Map.of(class05679.field_61599, $$0, class05679.field_61600, $$1);
    }

    private static void y(CallbackInfo callbackInfo) {
        class01894 class018942 = class06134.N(VFPDebugHudEntry.ID, (class01285)new VFPDebugHudEntry());
        HashMap<class05679, Map<class01894, class06276>> hashMap = new HashMap<class05679, Map<class01894, class06276>>();
        for (Map.Entry<class05679, Map<class01894, class06276>> entry : c.entrySet()) {
            HashMap<class01894, class06276> hashMap2 = new HashMap<class01894, class06276>(entry.getValue());
            if (entry.getKey() == class05679.field_61599) {
                hashMap2.put(class018942, class06276.field_61594);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        c = hashMap;
    }

    public static /* synthetic */ Map y() {
        return X;
    }

    public static @Nullable class01285 N(class01894 class018942) {
        return X.get(class018942);
    }

    private static class01894 N(String string, class01285 class012852) {
        return class06134.N(class01894.y((String)string), class012852);
    }

    private static void N(CallbackInfo callbackInfo) {
        class06134.N(class01894.N((String)"iris", (String)"iris"), (class01285)new IrisDebugEntry());
        class06134.N(class01894.N((String)"iris", (String)"debug"), (class01285)new IrisTrueDebugEntry());
    }

    public static class01894 N(class01894 class018942, class01285 class012852) {
        X.put(class018942, class012852);
        return class018942;
    }

    public static Map<class01894, class01285> N() {
        return Map.copyOf(X);
    }
}

