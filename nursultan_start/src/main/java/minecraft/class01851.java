/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00232
 *  minecraft.class00392
 *  minecraft.class04563
 *  minecraft.class04568
 *  minecraft.class04575
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05733
 *  minecraft.class06202
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import minecraft.class00232;
import minecraft.class00392;
import minecraft.class01847;
import minecraft.class01866;
import minecraft.class04563;
import minecraft.class04568;
import minecraft.class04575;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

class class01851
extends class05733 {
    private final List<class01847> y;
    private final @Nullable class05096 L;
    final /* synthetic */ class01866 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01851(class01866 class018662, @Nullable class06202 class062022, class05096 class050962, List list, @Nullable boolean bl, class00392 class003922) {
        this.N = class018662;
        super(bl2 -> {
            class062022.N(class050962);
            class00232 class002322 = class062022.yL();
            if (bl2) {
                if (class018662.i != null) {
                    class018662.i.N(class04575.field_3768);
                }
                class002322.M();
            } else {
                class002322.B();
                if (bl) {
                    class018662.u.method_10747((class00392)class00392.L((String)"multiplayer.requiredTexturePrompt.disconnect"));
                } else if (class018662.i != null) {
                    class018662.i.N(class04575.field_3764);
                }
            }
            for (class01847 class018472 : list) {
                class002322.N(class018472.N(), class018472.y(), class018472.L());
            }
            if (class018662.i != null) {
                class04563.y((class04568)class018662.i);
            }
        }, (class00392)(bl ? class00392.L((String)"multiplayer.requiredTexturePrompt.line1") : class00392.L((String)"multiplayer.texturePrompt.line1")), class01866.N((class00392)(bl ? class00392.L((String)"multiplayer.requiredTexturePrompt.line2").N(new class06541[]{class06541.field_1054, class06541.field_1067}) : class00392.L((String)"multiplayer.texturePrompt.line2")), class003922), bl ? class05220.Z : class05220.R, bl ? class05220.T : class05220.M);
        this.y = list;
        this.L = class050962;
    }

    public class01851 N(class06202 class062022, UUID uUID, URL uRL, String string, boolean bl, @Nullable class00392 class003922) {
        ImmutableList immutableList = ImmutableList.builderWithExpectedSize((int)(this.y.size() + 1)).addAll(this.y).add((Object)new class01847(uUID, uRL, string)).build();
        return new class01851(this.N, class062022, this.L, (List)immutableList, bl, class003922);
    }
}

