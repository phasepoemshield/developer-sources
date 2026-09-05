/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11281
 *  Nursultan.class11284
 *  Nursultan.class11305
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  minecraft.class00277
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01312
 *  minecraft.class01463
 *  minecraft.class01488
 *  minecraft.class01683
 *  minecraft.class02411
 *  minecraft.class02763
 *  minecraft.class03283
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04973
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06613
 *  minecraft.class06923
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07492
 *  minecraft.class08036
 *  minecraft.class08394
 *  minecraft.class08476
 *  minecraft.class08800
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 *  net.raphimc.viabedrock.protocol.ServerboundBedrockPackets
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11281;
import Nursultan.class11284;
import Nursultan.class11305;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import minecraft.class00277;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01312;
import minecraft.class01463;
import minecraft.class01488;
import minecraft.class01683;
import minecraft.class02411;
import minecraft.class02763;
import minecraft.class03283;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04973;
import minecraft.class05096;
import minecraft.class05306;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06613;
import minecraft.class06923;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07492;
import minecraft.class08036;
import minecraft.class08394;
import minecraft.class08476;
import minecraft.class08800;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05410
extends class00277<class07492> {
    private float N;
    private float y;
    private boolean L;
    private final class04973 u;
    private class11284 n;

    protected boolean L() {
        return false;
    }

    public class05410(class08036 class080362) {
        super((class06923)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_2, (class05306)new class02411((class02763)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_2), class080362.method_31548(), (class00392)class00392.L((String)"container.crafting"));
        this.z = 97;
        this.u = new class04973((class01463)this);
        this.y(null);
    }

    protected void u(class01054 class010542, int n, int n2) {
        class010542.N(this.field_22793, this.field_22785, this.z, this.U, -12566464, false);
    }

    public void u() {
        super.u();
        this.R();
    }

    private void y(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            UserConnection userConnection = ProtocolTranslator.getPlayNetworkUserConnection();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundBedrockPackets.INTERACT, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)InteractPacket_Action.OpenInventory.getValue()));
            packetWrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)((EntityTracker)userConnection.get(EntityTracker.class)).getClientPlayer().runtimeId());
            packetWrapper.write(BedrockTypes.OPTIONAL_POSITION_3F, null);
            packetWrapper.sendToServer(BedrockProtocol.class);
        }
    }

    protected void y() {
        this.L = true;
    }

    public static void N(class01054 class010542, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, class07438 class074382) {
        class08476 class084762;
        float f4 = (float)(n + n3) / 2.0f;
        float f5 = (float)(n2 + n4) / 2.0f;
        float f6 = (float)Math.atan((f4 - f2) / 40.0f);
        float f7 = (float)Math.atan((f5 - f3) / 40.0f);
        Quaternionf quaternionf = new Quaternionf().rotateZ((float)Math.PI);
        Quaternionf quaternionf2 = new Quaternionf().rotateX(f7 * 20.0f * ((float)Math.PI / 180));
        quaternionf.mul((Quaternionfc)quaternionf2);
        class08800 class088002 = class05410.N(class074382);
        if (class088002 instanceof class08476) {
            class084762 = (class08476)class088002;
            class084762.x = 180.0f + f6 * 20.0f;
            class084762.D = f6 * 20.0f;
            class084762.h = class084762.Nm != class01312.field_18077 ? -f7 * 20.0f : 0.0f;
            class084762.s /= class084762.NL;
            class084762.T /= class084762.NL;
            class084762.NL = 1.0f;
        }
        class084762 = new Vector3f(0.0f, class088002.T / 2.0f + f, 0.0f);
        class010542.N(class088002, (float)n5, (Vector3f)class084762, quaternionf, quaternionf2, n, n2, n3, n4);
    }

    private void N(CallbackInfo callbackInfo) {
        this.n = class11305.N((class05410)this, (int)this.field_22789, (int)this.field_22790);
        this.method_37063((class04654)this.n);
        this.R();
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = this.T;
        int n4 = this.b;
        class010542.N(class08394.Na, i, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        class05410.N(class010542, n3 + 26, n4 + 8, n3 + 75, n4 + 78, 30, 0.0625f, this.N, this.y, (class07438)((class04453)this.field_22787.T_4));
    }

    private static class08800 N(class07438 class074382) {
        class08800 class088002 = class06202.Nq().Ng().N((class07049)class074382).method_62425((class07049)class074382, 1.0f);
        class088002.G = 0xF000F0;
        class088002.O.clear();
        class088002.l = 0;
        return class088002;
    }

    protected class03283 N() {
        return new class03283(this.T + 104, this.field_22790 / 2 - 22);
    }

    public void method_25426() {
        if (((class04453)this.field_22787.T_4).method_56992()) {
            this.field_22787.N((class05096)new class01488((class04453)this.field_22787.T_4, ((class01683)((class04453)this.field_22787.T_4).y_0).G(), ((Boolean)((class05630)this.field_22787.i_7).S().method_41753()).booleanValue()));
            return;
        }
        super.method_25426();
        this.N(null);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.u.N(class010542, n, n2);
        super.method_25394(class010542, n, n2, f);
        this.N = n;
        this.y = n2;
    }

    public boolean method_64507() {
        return this.u.N();
    }

    public boolean method_25406(class06613 class066132) {
        if (this.L) {
            this.L = false;
            return true;
        }
        return super.method_25406(class066132);
    }

    private void R() {
        this.n.field_22763 = !class11281.y();
        this.n.N();
    }
}

