/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  minecraft.class00408
 *  minecraft.class04917
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06820
 *  minecraft.class07001
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07741
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00408;
import minecraft.class04917;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06820;
import minecraft.class07001;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07741;
import org.jspecify.annotations.Nullable;

public class class05176
implements class06820 {
    public static final int y = 1493;
    private static final Map<String, String> L = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put("Village", "Village");
        hashMap.put("Mineshaft", "Mineshaft");
        hashMap.put("Mansion", "Mansion");
        hashMap.put("Igloo", "Temple");
        hashMap.put("Desert_Pyramid", "Temple");
        hashMap.put("Jungle_Pyramid", "Temple");
        hashMap.put("Swamp_Hut", "Temple");
        hashMap.put("Stronghold", "Stronghold");
        hashMap.put("Monument", "Monument");
        hashMap.put("Fortress", "Fortress");
        hashMap.put("EndCity", "EndCity");
    });
    private static final Map<String, String> u = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put("Iglu", "Igloo");
        hashMap.put("TeDP", "Desert_Pyramid");
        hashMap.put("TeJP", "Jungle_Pyramid");
        hashMap.put("TeSH", "Swamp_Hut");
    });
    private static final Set<String> i = Set.of("pillager_outpost", "mineshaft", "mansion", "jungle_pyramid", "desert_pyramid", "igloo", "ruined_portal", "shipwreck", "swamp_hut", "stronghold", "monument", "ocean_ruin", "fortress", "endcity", "buried_treasure", "village", "nether_fossil", "bastion_remnant");
    private final boolean R;
    private final Map<String, Long2ObjectMap<class07001>> M = Maps.newHashMap();
    private final Map<String, class04917> B = Maps.newHashMap();
    private final @Nullable class00408 Z;
    private final List<String> z;
    private final List<String> U;
    private final DataFixer E;
    private boolean W;

    public class05176(@Nullable class00408 class004082, List<String> list, List<String> list2, DataFixer dataFixer) {
        this.Z = class004082;
        this.z = list;
        this.U = list2;
        this.E = dataFixer;
        boolean bl = false;
        for (String string : this.U) {
            bl |= this.M.get(string) != null;
        }
        this.R = bl;
    }

    private static /* synthetic */ class06820 y(Supplier supplier, List list, DataFixer dataFixer) {
        return new class05176((class00408)supplier.get(), list, list, dataFixer);
    }

    public void N(class07321 class073212) {
        long l = class073212.y();
        for (String string : this.z) {
            class04917 class049172 = this.B.get(string);
            if (class049172 == null || !class049172.L(l)) continue;
            class049172.u(l);
        }
    }

    private synchronized void N(class00408 class004082) {
        if (this.W) {
            return;
        }
        for (String string2 : this.z) {
            class07001 class070012 = new class07001();
            try {
                class070012 = class004082.N(string2, class05715.field_45084, 1493).m("data").m("Features");
                if (class070012.z()) {
                    continue;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            class070012.N((T string3, U class077092) -> {
                if (!(class077092 instanceof class07001)) {
                    return;
                }
                class07001 class070013 = (class07001)class077092;
                long l = class07321.u((int)class070013.y("ChunkX", 0), (int)class070013.y("ChunkZ", 0));
                class07741 class077412 = class070013.s("Children");
                if (!class077412.isEmpty()) {
                    class077412.N(0).flatMap(class070012 -> class070012.Z("id")).map(u::get).ifPresent(string -> class070013.N_67("id", string));
                }
                class070013.Z("id").ifPresent(string2 -> this.M.computeIfAbsent((String)string2, string -> new Long2ObjectOpenHashMap()).put(l, (Object)class070013));
            });
            String string4 = string2 + "_index";
            class04917 class049172 = (class04917)class004082.N(class04917.N((String)string4));
            if (class049172.N().isEmpty()) {
                class04917 class049173 = new class04917();
                this.B.put(string2, class049173);
                class070012.N((T string, U class077092) -> {
                    if (class077092 instanceof class07001) {
                        class07001 class070012 = (class07001)class077092;
                        class049173.N(class07321.u((int)class070012.y("ChunkX", 0), (int)class070012.y("ChunkZ", 0)));
                    }
                });
                continue;
            }
            this.B.put(string2, class049172);
        }
        this.W = true;
    }

    private class07001 N(class07001 class070012, class07321 class073212) {
        class07001 class070013 = class070012.m("Level");
        class07001 class070014 = class070013.m("Structures");
        class07001 class070015 = class070014.m("Starts");
        for (String string : this.U) {
            class07001 class070016;
            Long2ObjectMap<class07001> var8 = this.M.get(string);
            if (var8 == null) continue;
            long l = class073212.y();
            if (!this.B.get(L.get(string)).L(l) || (class070016 = (class07001)var8.get(l)) == null) continue;
            class070015.N(string, (class07709)class070016);
        }
        class070014.N("Starts", (class07709)class070015);
        class070013.N("Structures", (class07709)class070014);
        class070012.N("Level", (class07709)class070013);
        return class070012;
    }

    private boolean N(int n, int n2) {
        if (!this.R) {
            return false;
        }
        for (String string : this.U) {
            if (this.M.get(string) == null || !this.B.get(L.get(string)).L(class07321.u((int)n, (int)n2))) continue;
            return true;
        }
        return false;
    }

    private boolean N(int n, int n2, String string) {
        if (!this.R) {
            return false;
        }
        return this.M.get(string) != null && this.B.get(L.get(string)).y(class07321.u((int)n, (int)n2));
    }

    private class07001 N(class07001 class070012) {
        class07001 class070013 = class070012.m("Level");
        class07321 class073212 = new class07321(class070013.y("xPos", 0), class070013.y("zPos", 0));
        if (this.N(class073212.B, class073212.Z)) {
            class070012 = this.N(class070012, class073212);
        }
        class07001 class070014 = class070013.m("Structures");
        class07001 class070015 = class070014.m("References");
        for (String string : this.U) {
            boolean bl = i.contains(string.toLowerCase(Locale.ROOT));
            if (class070015.E(string).isPresent() || !bl) continue;
            int n = 8;
            LongArrayList longArrayList = new LongArrayList();
            for (int i = class073212.B - 8; i <= class073212.B + 8; ++i) {
                for (int j = class073212.Z - 8; j <= class073212.Z + 8; ++j) {
                    if (!this.N(i, j, string)) continue;
                    longArrayList.add(class07321.u((int)i, (int)j));
                }
            }
            class070015.N(string, longArrayList.toLongArray());
        }
        class070014.N("References", (class07709)class070015);
        class070013.N("Structures", (class07709)class070014);
        class070012.N("Level", (class07709)class070013);
        return class070012;
    }

    public int N() {
        return 1493;
    }

    private static /* synthetic */ class06820 N(Supplier supplier, List list, DataFixer dataFixer) {
        return new class05176((class00408)supplier.get(), list, list, dataFixer);
    }

    public static Supplier<class06820> N(class05946<class07299> class059462, Supplier<@Nullable class00408> supplier, DataFixer dataFixer) {
        if (class059462 == class07299.field_25179) {
            return () -> new class05176((class00408)supplier.get(), (List<String>)ImmutableList.of((Object)"Monument", (Object)"Stronghold", (Object)"Village", (Object)"Mineshaft", (Object)"Temple", (Object)"Mansion"), (List<String>)ImmutableList.of((Object)"Village", (Object)"Mineshaft", (Object)"Mansion", (Object)"Igloo", (Object)"Desert_Pyramid", (Object)"Jungle_Pyramid", (Object)"Swamp_Hut", (Object)"Stronghold", (Object)"Monument"), dataFixer);
        }
        if (class059462 == class07299.field_25180) {
            ImmutableList immutableList = ImmutableList.of((Object)"Fortress");
            return () -> class05176.y(supplier, (List)immutableList, dataFixer);
        }
        if (class059462 == class07299.field_25181) {
            ImmutableList immutableList = ImmutableList.of((Object)"EndCity");
            return () -> class05176.N(supplier, (List)immutableList, dataFixer);
        }
        return class06820.N;
    }

    public class07001 applyFix(class07001 class070013) {
        int n;
        if (!this.W && this.Z != null) {
            this.N(this.Z);
        }
        if ((n = class07717.R((class07001)class070013)) < 1493 && (class070013 = class05715.field_19214.N(this.E, class070013, n, 1493)).W("Level").flatMap(class070012 -> class070012.T("hasLegacyStructureData")).orElse(false).booleanValue()) {
            class070013 = this.N(class070013);
        }
        return class070013;
    }
}

