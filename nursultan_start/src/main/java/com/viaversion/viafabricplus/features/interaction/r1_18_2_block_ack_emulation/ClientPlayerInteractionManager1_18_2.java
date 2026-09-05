/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07356
 *  org.apache.commons.lang3.tuple.Pair
 */
package com.viaversion.viafabricplus.features.interaction.r1_18_2_block_ack_emulation;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07356;
import org.apache.commons.lang3.tuple.Pair;

public final class ClientPlayerInteractionManager1_18_2 {
    private final Object2ObjectLinkedOpenHashMap<Pair<class07209, class07356>, Pair<class06889, class07109>> unAckedActions = new Object2ObjectLinkedOpenHashMap();

    public void trackPlayerAction(class07356 class073562, class07209 class072092) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        class07109 class071092 = ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_1) ? null : new class07109(class044532.method_36454(), class044532.method_36455());
        this.unAckedActions.put((Object)Pair.of((Object)class072092, (Object)class073562), (Object)Pair.of((Object)class044532.method_73189(), (Object)class071092));
    }

    public void handleBlockBreakAck(class07209 class072092, class00500 class005002, class07356 class073562, boolean bl) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 == null) {
            return;
        }
        class03448 class034482 = class06202.Nq().NE().P();
        Pair pair = (Pair)this.unAckedActions.remove((Object)Pair.of((Object)class072092, (Object)class073562));
        class00500 class005003 = class034482.method_8320(class072092);
        if ((pair == null || !bl || class073562 != class07356.field_12968 && class005003 != class005002) && (class005003 != class005002 || ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2))) {
            class034482.method_8652(class072092, class005002, 19);
            if (pair != null && (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_1) || class034482 == class044532.method_73183() && class044532.method_30632(class072092, class005002))) {
                class06889 class068892 = (class06889)pair.getKey();
                if (pair.getValue() != null) {
                    class044532.method_5641(class068892.M, class068892.B, class068892.Z, ((class07109)pair.getValue()).z, ((class07109)pair.getValue()).U);
                } else {
                    class044532.method_30634(class068892.M, class068892.B, class068892.Z);
                }
            }
        }
        while (this.unAckedActions.size() >= 50) {
            ViaFabricPlusImpl.INSTANCE.getLogger().warn("Too many unacked block actions, dropping {}", this.unAckedActions.firstKey());
            this.unAckedActions.removeFirst();
        }
    }
}

