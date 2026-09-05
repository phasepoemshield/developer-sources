/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  minecraft.class01255
 *  minecraft.class02277
 *  minecraft.class02877
 *  minecraft.class04227
 *  minecraft.class05176
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class06265
 *  minecraft.class07001
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07717
 *  minecraft.class07741
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class01255;
import minecraft.class02277;
import minecraft.class02877;
import minecraft.class04227;
import minecraft.class05176;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06265;
import minecraft.class06691;
import minecraft.class06711;
import minecraft.class07001;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07717;
import minecraft.class07741;
import minecraft.class08088;

class class06696
extends class06691 {
    final /* synthetic */ class06711 u;

    class06696(class06711 class067112) {
        this.u = class067112;
        super(class067112, class05715.field_19214, "chunk", "region", class06711.R, class06711.M);
    }

    @Override
    protected boolean N(class06172 class061722, class07321 class073212, class05946<class07299> class059462) {
        class07001 class070012 = ((Optional)class061722.u(class073212).join()).orElse(null);
        if (class070012 != null) {
            boolean bl;
            int n = class07717.R((class07001)class070012);
            class08088 class080882 = ((class01255)this.u.B.B(class04227.y(class059462))).y();
            class07001 class070013 = class061722.N(class070012, -1, class06265.N(class059462, (Optional)class080882.L()));
            class07321 class073213 = new class07321(class070013.y("xPos", 0), class070013.y("zPos", 0));
            if (!class073213.equals((Object)class073212)) {
                class06711.N.warn("Chunk {} has invalid position {}", (Object)class073212, (Object)class073213);
            }
            boolean bl2 = bl = n < class07529.y().comp_4026().y();
            if (this.u.z) {
                bl = bl || class070013.y("Heightmaps");
                class070013.b("Heightmaps");
                bl = bl || class070013.y("isLightOn");
                class070013.b("isLightOn");
                class07741 class077412 = class070013.s("sections");
                for (int i = 0; i < class077412.size(); ++i) {
                    Optional var12 = class077412.N(i);
                    if (var12.isEmpty()) continue;
                    class07001 class070014 = (class07001)var12.get();
                    bl = bl || class070014.y("BlockLight");
                    class070014.b("BlockLight");
                    bl = bl || class070014.y("SkyLight");
                    class070014.b("SkyLight");
                }
            }
            if (bl || this.u.U) {
                if (this.N != null) {
                    this.N.join();
                }
                this.N = class061722.N(class073212, class070013);
                return true;
            }
        }
        return false;
    }

    @Override
    protected class06172 N(class02277 class022772, Path path) {
        Supplier var3 = class05176.N((class05946)class022772.y(), () -> this.u.G, (DataFixer)this.u.W);
        return this.u.U ? new class02877(class022772.N("source"), path, class022772.N("target"), class06711.N(path), this.u.W, true, class05715.field_19214, var3) : new class06172(class022772, path, this.u.W, true, class05715.field_19214, var3);
    }
}

