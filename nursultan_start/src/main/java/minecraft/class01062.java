/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09436
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  de.maxhenkel.voicechat.events.PlayerEvents
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00482
 *  minecraft.class00502
 *  minecraft.class00503
 *  minecraft.class00509
 *  minecraft.class00518
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class00649
 *  minecraft.class00869
 *  minecraft.class01235
 *  minecraft.class01615
 *  minecraft.class01890
 *  minecraft.class02003
 *  minecraft.class02079
 *  minecraft.class02565
 *  minecraft.class02796
 *  minecraft.class02860
 *  minecraft.class02969
 *  minecraft.class03059
 *  minecraft.class03525
 *  minecraft.class03556
 *  minecraft.class03704
 *  minecraft.class03713
 *  minecraft.class03926
 *  minecraft.class04022
 *  minecraft.class04247
 *  minecraft.class04266
 *  minecraft.class04744
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04895
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05042
 *  minecraft.class05071
 *  minecraft.class05087
 *  minecraft.class05152
 *  minecraft.class05157
 *  minecraft.class05170
 *  minecraft.class05216
 *  minecraft.class05705
 *  minecraft.class05946
 *  minecraft.class06290
 *  minecraft.class06394
 *  minecraft.class06482
 *  minecraft.class06541
 *  minecraft.class06633
 *  minecraft.class06643
 *  minecraft.class06659
 *  minecraft.class06661
 *  minecraft.class06664
 *  minecraft.class06680
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07062
 *  minecraft.class07209
 *  minecraft.class07258
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class07488
 *  minecraft.class07701
 *  minecraft.class07806
 *  minecraft.class07842
 *  minecraft.class08033
 *  minecraft.class08036
 *  minecraft.class08055
 *  minecraft.class08057
 *  minecraft.class08060
 *  minecraft.class08068
 *  minecraft.class08069
 *  minecraft.class08073
 *  minecraft.class08076
 *  minecraft.class08087
 *  minecraft.class08096
 *  minecraft.class08195
 *  minecraft.class08774
 *  minecraft.class08957
 *  net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents$AfterPlayerChange
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$AfterRespawn
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$Join
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$Leave
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents$SyncDataPackContents
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowChatMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowCommandMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowGameMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$ChatMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$CommandMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$GameMessage
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  squeek.appleskin.network.SyncHandler
 */
package minecraft;

import Nursultan.class09436;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import de.maxhenkel.voicechat.events.PlayerEvents;
import java.io.File;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00482;
import minecraft.class00502;
import minecraft.class00503;
import minecraft.class00509;
import minecraft.class00518;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class00649;
import minecraft.class00869;
import minecraft.class01032;
import minecraft.class01042;
import minecraft.class01072;
import minecraft.class01077;
import minecraft.class01086;
import minecraft.class01087;
import minecraft.class01235;
import minecraft.class01615;
import minecraft.class01890;
import minecraft.class02003;
import minecraft.class02079;
import minecraft.class02565;
import minecraft.class02796;
import minecraft.class02860;
import minecraft.class02969;
import minecraft.class03059;
import minecraft.class03525;
import minecraft.class03556;
import minecraft.class03704;
import minecraft.class03713;
import minecraft.class03926;
import minecraft.class04022;
import minecraft.class04247;
import minecraft.class04266;
import minecraft.class04744;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04895;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05042;
import minecraft.class05071;
import minecraft.class05087;
import minecraft.class05152;
import minecraft.class05157;
import minecraft.class05170;
import minecraft.class05216;
import minecraft.class05705;
import minecraft.class05946;
import minecraft.class06290;
import minecraft.class06394;
import minecraft.class06482;
import minecraft.class06541;
import minecraft.class06633;
import minecraft.class06643;
import minecraft.class06659;
import minecraft.class06661;
import minecraft.class06664;
import minecraft.class06680;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07062;
import minecraft.class07209;
import minecraft.class07258;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07488;
import minecraft.class07701;
import minecraft.class07806;
import minecraft.class07842;
import minecraft.class08033;
import minecraft.class08036;
import minecraft.class08055;
import minecraft.class08057;
import minecraft.class08060;
import minecraft.class08068;
import minecraft.class08069;
import minecraft.class08073;
import minecraft.class08076;
import minecraft.class08087;
import minecraft.class08096;
import minecraft.class08195;
import minecraft.class08774;
import minecraft.class08957;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.network.SyncHandler;

public abstract class class01062 {
    public static final File N = new File("banned-players.json");
    public static final File y = new File("banned-ips.json");
    public static final File L = new File("ops.json");
    public static final File u = new File("whitelist.json");
    public static final class00392 i = class00392.L((String)"chat.filtered_full");
    public static final class00392 R = class00392.L((String)"multiplayer.disconnect.duplicate_login");
    private static final Logger M = LogUtils.getLogger();
    private static final int B = 600;
    private static final SimpleDateFormat Z = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z", Locale.ROOT);
    private final class02796 z;
    private final List<class04770> U = Lists.newArrayList();
    private final Map<UUID, class04770> E = Maps.newHashMap();
    private final class05170 W;
    private final class01086 m;
    private final class01077 P;
    private final class05152 s;
    private final Map<UUID, class04895> T = Maps.newHashMap();
    private final Map<UUID, class03704> b = Maps.newHashMap();
    private final class07842 j;
    private final class02003<class02969> v;
    private int n;
    private int t;
    private boolean G;
    private int l;

    public Optional<class07001> L(class08774 class087742) {
        class07001 class070012 = this.z.yn().t();
        if (this.z.N(class087742) && class070012 != null) {
            M.debug("loading single player");
            return Optional.of(class070012);
        }
        return this.j.N(class087742);
    }

    private void L(class00642 class006422, class04770 class047702, class03713 class037132, CallbackInfo callbackInfo) {
        ((ServerLifecycleEvents.SyncDataPackContents)ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.invoker()).onSyncDataPackContents(class047702, true);
    }

    public class02796 N() {
        return this.z;
    }

    public void L(class04770 class047702) {
        this.N((class07438)class047702, class047702.field_13987);
    }

    public @Nullable class04770 L(String string) {
        for (class04770 class047702 : this.U) {
            if (!class047702.method_7334().name().equalsIgnoreCase(string)) continue;
            return class047702;
        }
        return null;
    }

    public class05170 M() {
        return this.W;
    }

    public int P() {
        return this.z.t();
    }

    public int T() {
        return this.n;
    }

    public class01062(class02796 class027962, class02003<class02969> class020032, class07842 class078422, class06633 class066332) {
        this.z = class027962;
        this.v = class020032;
        this.j = class078422;
        this.s = new class05152(u, class066332);
        this.P = new class01077(L, class066332);
        this.W = new class05170(N, class066332);
        this.m = new class01086(y, class066332);
    }

    public class01086 B() {
        return this.m;
    }

    public void Z() {
        for (int i = 0; i < this.U.size(); ++i) {
            this.N(this.U.get(i));
        }
    }

    public void i(class04770 class047702) {
        class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y();
        class047702.method_14217();
        class047702.field_13987.method_14364((class00381)new class06664(class047702.method_31548().N()));
    }

    public void i(class08774 class087742) {
        class04770 class047702;
        if (this.P.N(class087742) && (class047702 = this.y(class087742.N())) != null) {
            this.u(class047702);
        }
    }

    private void i(class00642 class006422, class04770 class047702, class03713 class037132, CallbackInfo callbackInfo) {
        ((Consumer)PlayerEvents.PLAYER_LOGGED_IN.invoker()).accept(class047702);
    }

    public void i() {
        if (++this.l > 600) {
            this.N((class00381<?>)new class06661(EnumSet.of(class06680.field_29138), this.U));
            this.l = 0;
        }
    }

    public int b() {
        return this.t;
    }

    public boolean s() {
        return this.z.D_();
    }

    public void n() {
        class03704 class0370422;
        for (class03704 class0370422 : this.b.values()) {
            class0370422.N(this.z.Nh());
        }
        Map map = class03525.N(this.v);
        this.N((CallbackInfo)null);
        this.N((class00381<?>)new class08076(map));
        class06482 class064822 = this.z.yM();
        class0370422 = new class08069(class064822.y(), class064822.L());
        for (class04770 class047702 : this.U) {
            class047702.field_13987.method_14364((class00381)class0370422);
            class047702.method_14253().N(class047702);
        }
    }

    public int m() {
        return this.U.size();
    }

    public boolean t() {
        return this.G;
    }

    public List<class04770> v() {
        return this.U;
    }

    public void j() {
        for (int i = 0; i < this.U.size(); ++i) {
            this.U.get((int)i).field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.server_shutdown"));
        }
    }

    public String[] U() {
        return this.s.y();
    }

    public class05152 z() {
        return this.s;
    }

    private void u(class00642 class006422, class04770 class047702, class03713 class037132, CallbackInfo callbackInfo) {
        ServerNetworkingImpl.getAddon((class01615)class047702.field_13987).onClientReady();
    }

    public void u(class08774 class087742) {
        this.N(class087742, Optional.empty(), Optional.empty());
    }

    public void u(class04770 class047702) {
        class06984 class069842 = this.z.y(class047702.method_72498());
        this.N(class047702, class069842);
    }

    private void y_3(class04770 class047702, CallbackInfo callbackInfo) {
        ((Consumer)PlayerEvents.PLAYER_LOGGED_OUT.invoker()).accept(class047702);
    }

    public void y(int n) {
        this.t = n;
        this.N((class00381<?>)new class04022(n));
        Iterator var2 = this.z.NO().iterator();
        while (var2.hasNext()) {
            ((class04782)var2.next()).method_14178().y(n);
        }
    }

    public @Nullable class04770 y(UUID uUID) {
        return this.E.get(uUID);
    }

    public boolean y(class08774 class087742) {
        return false;
    }

    public @Nullable class07001 y() {
        return null;
    }

    private void y(class00642 class006422, class04770 class047702, class03713 class037132, CallbackInfo callbackInfo) {
        ((ServerPlayerEvents.Join)ServerPlayerEvents.JOIN.invoker()).onJoin(class047702);
    }

    public List<class04770> y(String string) {
        ArrayList arrayList = Lists.newArrayList();
        for (class04770 class047702 : this.U) {
            if (!class047702.method_14209().equals(string)) continue;
            arrayList.add(class047702);
        }
        return arrayList;
    }

    public void y(class04770 class047702) {
        class07488 class0748822;
        Object object;
        this.N(class047702, (CallbackInfo)null);
        this.y_3(class047702, null);
        class04782 class047822 = class047702.method_51469();
        class047702.method_7281(class01235.z);
        this.N(class047702);
        if (class047702.method_5765() && (object = class047702.method_5668()).method_5817()) {
            M.debug("Removing player mount");
            class047702.method_5848();
            object.method_31748().forEach(class070492 -> class070492.method_31745(class07062.field_27001));
        }
        class047702.method_18375();
        for (class07488 class0748822 : class047702.method_64128()) {
            class0748822.method_31745(class07062.field_27001);
        }
        class047822.method_18770(class047702, class07062.field_27001);
        class047702.method_14236().N();
        this.U.remove(class047702);
        this.z.yU().y(class047702);
        object = class047702.method_5667();
        class0748822 = this.E.get(object);
        if (class0748822 == class047702) {
            this.E.remove(object);
            this.T.remove(object);
            this.b.remove(object);
            this.z.Nt().y(class047702);
        }
        this.N((class00381<?>)new class02079(List.of(class047702.method_5667())));
    }

    public void y(class08036 class080362, class00392 class003922) {
        class00502 class005022 = class080362.method_5781();
        if (class005022 == null) {
            this.N(class003922, false);
            return;
        }
        for (int i = 0; i < this.U.size(); ++i) {
            class04770 class047702 = this.U.get(i);
            if (class047702.method_5781() == class005022) continue;
            class047702.method_64398(class003922);
        }
    }

    public class01077 E() {
        return this.P;
    }

    private void N(class00642 class006422, class04770 class047702, class03713 class037132, CallbackInfo callbackInfo) {
        SyncHandler.onPlayerLoggedIn((class04770)class047702);
    }

    public @Nullable class00392 N(SocketAddress socketAddress, class08774 class087742) {
        if (this.W.N(class087742)) {
            class05157 class051572 = (class05157)this.W.L((Object)class087742);
            class05216 class052162 = class00392.N((String)"multiplayer.disconnect.banned.reason", (Object[])new Object[]{class051572.i()});
            if (class051572.L() != null) {
                class052162.y((class00392)class00392.N((String)"multiplayer.disconnect.banned.expiration", (Object[])new Object[]{Z.format(class051572.L())}));
            }
            return class052162;
        }
        if (!this.N(class087742)) {
            return class00392.L((String)"multiplayer.disconnect.not_whitelisted");
        }
        if (this.m.N(socketAddress)) {
            class01072 class010722 = this.m.y(socketAddress);
            class05216 class052163 = class00392.N((String)"multiplayer.disconnect.banned_ip.reason", (Object[])new Object[]{class010722.i()});
            if (class010722.L() != null) {
                class052163.y((class00392)class00392.N((String)"multiplayer.disconnect.banned_ip.expiration", (Object[])new Object[]{Z.format(class010722.L())}));
            }
            return class052163;
        }
        if (this.U.size() >= this.P() && !this.y(class087742)) {
            return class00392.L((String)"multiplayer.disconnect.server_full");
        }
        return null;
    }

    public void N(class08036 class080362, class00392 class003922) {
        class00502 class005022 = class080362.method_5781();
        if (class005022 == null) {
            return;
        }
        for (String string : class005022.B()) {
            class04770 class047702 = this.N(string);
            if (class047702 == null || class047702 == class080362) continue;
            class047702.method_64398(class003922);
        }
    }

    public void N(class00381<?> class003812, class05946<class07299> class059462) {
        for (class04770 class047702 : this.U) {
            if (class047702.method_51469().method_27983() != class059462) continue;
            class047702.field_13987.method_14364(class003812);
        }
    }

    public void N(class00381<?> class003812) {
        Iterator<class04770> var2 = this.U.iterator();
        while (var2.hasNext()) {
            var2.next().field_13987.method_14364(class003812);
        }
    }

    public void N(class07438 class074382, class01615 class016152) {
        for (class07055 class070552 : class074382.method_6026()) {
            class016152.method_14364((class00381)new class08087(class074382.method_5628(), class070552, false));
        }
    }

    public class04770 N(class04770 class047702, boolean bl, class07062 class070622) {
        class07209 class072092;
        class05042 class050422;
        class04782 class047822;
        class01032 class010322 = class047702.method_60590(!bl, class01032.N);
        this.U.remove(class047702);
        class047702.method_51469().method_18770(class047702, class070622);
        class04782 class047823 = class010322.y();
        class04770 class047703 = new class04770(this.z, class047823, class047702.method_7334(), class047702.method_53823());
        class047703.field_13987 = class047702.field_13987;
        class047703.method_14203(class047702, bl);
        class047703.method_5838(class047702.method_5628());
        class047703.method_74090(class047702.method_6068());
        if (!class010322.M()) {
            class047703.method_60592(class047702);
        }
        for (String string : class047702.method_5752()) {
            class047703.method_5780(string);
        }
        class06889 class068892 = class010322.L();
        class047703.method_5808(class068892.M, class068892.B, class068892.Z, class010322.i(), class010322.R());
        if (class010322.M()) {
            class047703.field_13987.method_14364((class00381)new class00503(class00503.y, 0.0f));
        }
        byte by = bl ? (byte)1 : 0;
        class04782 class047824 = class047703.method_51469();
        class05087 class050872 = class047824.method_8401();
        class047703.field_13987.method_14364((class00381)new class06643(class047703.method_52374(class047824), by));
        class047703.field_13987.method_14363(class047703.method_23317(), class047703.method_23318(), class047703.method_23321(), class047703.method_36454(), class047703.method_36455());
        class047703.field_13987.method_14364((class00381)new class08096(class047823.method_74854()));
        class047703.field_13987.method_14364((class00381)new class07258(class050872.s(), class050872.T()));
        class047703.field_13987.method_14364((class00381)new class08060(class047703.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue(), class047703.fields_37fa3311b0e9d3e9b883d09222919bf5a_1.intValue(), class047703.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue()));
        this.L(class047703);
        this.N(class047703, class047823);
        this.u(class047703);
        class047823.method_18215(class047703);
        this.U.add(class047703);
        this.E.put(class047703.method_5667(), class047703);
        class047703.method_34225();
        class047703.method_6033(class047703.method_6032());
        class04744 class047442 = class047703.method_67564();
        if (!bl && class047442 != null && (class047822 = this.z.N((class050422 = class047442.N()).N())) != null && class047822.method_8320(class072092 = class050422.y()).N(class00869.TE)) {
            class047703.field_13987.method_14364((class00381)new class08073((class03556)class04909.dj, class04911.field_15245, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 1.0f, 1.0f, class047823.method_8409().B()));
        }
        class04770 class047704 = class047703;
        this.N(class047702, bl, class070622, new CallbackInfoReturnable("", false, (Object)class047704));
        return class047704;
    }

    public boolean N(UUID uUID) {
        Set set = Sets.newIdentityHashSet();
        for (class04770 object2 : this.U) {
            if (!object2.method_5667().equals(uUID)) continue;
            set.add(object2);
        }
        class04770 class047702 = this.E.get(uUID);
        if (class047702 != null) {
            set.add(class047702);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((class04770)iterator.next()).field_13987.method_52396(R);
        }
        return !set.isEmpty();
    }

    private void N(class00392 class003922, Function function, boolean bl, CallbackInfo callbackInfo) {
        if (!((ServerMessageEvents.AllowGameMessage)ServerMessageEvents.ALLOW_GAME_MESSAGE.invoker()).allowGameMessage(this.z, class003922, bl)) {
            callbackInfo.cancel();
            return;
        }
        ((ServerMessageEvents.GameMessage)ServerMessageEvents.GAME_MESSAGE.invoker()).onGameMessage(this.z, class003922, bl);
    }

    private void N(class03926 class039262, class07701 class077012, class00649 class006492, CallbackInfo callbackInfo) {
        if (!((ServerMessageEvents.AllowCommandMessage)ServerMessageEvents.ALLOW_COMMAND_MESSAGE.invoker()).allowCommandMessage(class039262, class077012, class006492)) {
            callbackInfo.cancel();
            return;
        }
        ((ServerMessageEvents.CommandMessage)ServerMessageEvents.COMMAND_MESSAGE.invoker()).onCommandMessage(class039262, class077012, class006492);
    }

    public void N(class04782 class047822) {
        class047822.method_8621().N((class08055)new class09436(this, class047822));
    }

    protected void N(class06394 class063942, class04770 class047702) {
        HashSet hashSet = Sets.newHashSet();
        for (class00502 class005022 : class063942.i()) {
            class047702.field_13987.method_14364((class00381)class02565.N((class00502)class005022, (boolean)true));
        }
        for (class01890 class018902 : class01890.values()) {
            class00518 class005182 = class063942.N(class018902);
            if (class005182 == null || hashSet.contains(class005182)) continue;
            for (class00381 var11 : class063942.R(class005182)) {
                class047702.field_13987.method_14364(var11);
            }
            hashSet.add(class005182);
        }
    }

    public void N(class00642 class006422, class04770 class047702, class03713 class037132) {
        class08774 class087742 = class047702.method_72498();
        class08957 class089572 = this.z.Nf().R();
        String string = class089572.N(class087742.N()).map(class08774::y).orElse(class087742.y());
        class089572.N(class087742);
        class04782 class047822 = class047702.method_51469();
        String string2 = class006422.method_52909(this.z.NN());
        M.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{class047702.method_74861(), string2, class047702.method_5628(), class047702.method_23317(), class047702.method_23318(), class047702.method_23321()});
        class05087 class050872 = class047822.method_8401();
        class01615 class016152 = new class01615(this.z, class006422, class047702, class037132);
        class006422.method_56330(class04266.y.N(class04247.N((class01042)this.z.yt()), (Object)class016152), (class00638)class016152);
        class016152.method_53046();
        class07305 class073052 = class047822.method_64395();
        boolean bl = (Boolean)class073052.N(class07305.b);
        boolean bl2 = (Boolean)class073052.N(class07305.a);
        boolean bl3 = (Boolean)class073052.N(class07305.n);
        class016152.method_14364((class00381)new class00482(class047702.method_5628(), class050872.U(), this.z.NQ(), this.P(), this.T(), this.b(), bl2, !bl, bl3, class047702.method_52374(class047822), this.z.r()));
        class016152.method_14364((class00381)new class07258(class050872.s(), class050872.T()));
        class08033 class080332 = class047702.method_31549();
        this.u(class006422, class047702, class037132, null);
        class016152.method_14364((class00381)new class06659(class080332));
        class016152.method_14364((class00381)new class06664(class047702.method_31548().N()));
        class06482 class064822 = this.z.yM();
        this.L(class006422, class047702, class037132, null);
        class016152.method_14364((class00381)new class08069(class064822.y(), class064822.L()));
        this.u(class047702);
        class047702.method_14248().L();
        class047702.method_14253().N(class047702);
        this.N(class047822.method_14170(), class047702);
        this.z.NS();
        class05216 class052162 = class047702.method_7334().name().equalsIgnoreCase(string) ? class00392.N((String)"multiplayer.player.joined", (Object[])new Object[]{class047702.method_5476()}) : class00392.N((String)"multiplayer.player.joined.renamed", (Object[])new Object[]{class047702.method_5476(), string});
        this.N((class00392)class052162.N(class06541.field_1054), false);
        class016152.method_14363(class047702.method_23317(), class047702.method_23318(), class047702.method_23321(), class047702.method_36454(), class047702.method_36455());
        class07806 class078062 = this.z.NC();
        if (class078062 != null && !class037132.u()) {
            class047702.method_43930(class078062);
        }
        class047702.field_13987.method_14364((class00381)class06661.N(this.U));
        this.U.add(class047702);
        this.E.put(class047702.method_5667(), class047702);
        this.N((class00381<?>)class06661.N(List.of(class047702)));
        this.N(class047702, class047822);
        class047822.method_18213(class047702);
        this.z.yU().N(class047702);
        this.L(class047702);
        class047702.method_34225();
        this.z.Nt().N(class047702);
        class016152.method_53047();
        this.N(class006422, class047702, class037132, null);
        this.y(class006422, class047702, class037132, null);
        this.i(class006422, class047702, class037132, null);
    }

    private void N(class04770 class047702, boolean bl, class07062 class070622, CallbackInfoReturnable callbackInfoReturnable) {
        class04770 class047703 = (class04770)callbackInfoReturnable.getReturnValue();
        ((ServerPlayerEvents.AfterRespawn)ServerPlayerEvents.AFTER_RESPAWN.invoker()).afterRespawn(class047702, class047703, bl);
        if (class047702.method_51469() != class047703.method_51469()) {
            ((ServerEntityWorldChangeEvents.AfterPlayerChange)ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.invoker()).afterChangeWorld(class047703, class047702.method_51469(), class047703.method_51469());
        }
    }

    private void N(class04770 class047702, CallbackInfo callbackInfo) {
        ((ServerPlayerEvents.Leave)ServerPlayerEvents.LEAVE.invoker()).onLeave(class047702);
    }

    protected void N(class04770 class047702) {
        class03704 class037042;
        this.j.N((class08036)class047702);
        class04895 class048952 = this.T.get(class047702.method_5667());
        if (class048952 != null) {
            class048952.N();
        }
        if ((class037042 = this.b.get(class047702.method_5667())) != null) {
            class037042.y();
        }
    }

    private void N(CallbackInfo callbackInfo) {
        for (class04770 class047702 : this.v()) {
            ((ServerLifecycleEvents.SyncDataPackContents)ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.invoker()).onSyncDataPackContents(class047702, false);
        }
    }

    private void N(class03926 class039262, class04770 class047702, class00649 class006492, CallbackInfo callbackInfo) {
        if (!((ServerMessageEvents.AllowChatMessage)ServerMessageEvents.ALLOW_CHAT_MESSAGE.invoker()).allowChatMessage(class039262, class047702, class006492)) {
            callbackInfo.cancel();
            return;
        }
        ((ServerMessageEvents.ChatMessage)ServerMessageEvents.CHAT_MESSAGE.invoker()).onChatMessage(class039262, class047702, class006492);
    }

    public void N(class08774 class087742, Optional<class06984> optional, Optional<Boolean> optional2) {
        this.P.N(new class01087(class087742, optional.orElse(this.z.T()), optional2.orElse(this.P.y(class087742))));
        class04770 class047702 = this.y(class087742.N());
        if (class047702 != null) {
            this.u(class047702);
        }
    }

    public void N(boolean bl) {
        this.G = bl;
    }

    public void N(class00392 class003922, boolean bl) {
        this.N(class003922, (class04770 class047702) -> class003922, bl);
    }

    public void N(class00392 class003922, Function<class04770, class00392> function, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class003922, function, bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.z.N(class003922);
        for (class04770 class047702 : this.U) {
            class00392 class003923 = function.apply(class047702);
            if (class003923 == null) continue;
            class047702.method_43502(class003923, bl);
        }
    }

    public void N(class03926 class039262, class07701 class077012, class00649 class006492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class039262, class077012, class006492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class039262, arg_0 -> ((class07701)class077012).N(arg_0), class077012.z(), class006492);
    }

    public void N(@Nullable class08036 class080362, double d, double d2, double d3, double d4, class05946<class07299> class059462, class00381<?> class003812) {
        for (int i = 0; i < this.U.size(); ++i) {
            double d5;
            double d6;
            double d7;
            class04770 class047702 = this.U.get(i);
            if (class047702 == class080362 || class047702.method_51469().method_27983() != class059462 || !((d7 = d - class047702.method_23317()) * d7 + (d6 = d2 - class047702.method_23318()) * d6 + (d5 = d3 - class047702.method_23321()) * d5 < d4 * d4)) continue;
            class047702.field_13987.method_14364(class003812);
        }
    }

    public @Nullable class04770 N(String string) {
        int n = this.U.size();
        for (int i = 0; i < n; ++i) {
            class04770 class047702 = this.U.get(i);
            if (!class047702.method_7334().name().equalsIgnoreCase(string)) continue;
            return class047702;
        }
        return null;
    }

    public boolean N(class08774 class087742) {
        return !this.s() || this.P.u(class087742) || this.s.u((Object)class087742);
    }

    private void N(class04770 class047702, class06984 class069842) {
        if (class047702.field_13987 != null) {
            byte by = switch (class069842.N()) {
                default -> throw new MatchException(null, null);
                case class08195.field_63196 -> 24;
                case class08195.field_63197 -> 25;
                case class08195.field_63198 -> 26;
                case class08195.field_63199 -> 27;
                case class08195.field_63200 -> 28;
            };
            class047702.field_13987.method_14364((class00381)new class00509((class07049)class047702, by));
        }
        this.z.yL().N(class047702);
    }

    public class04895 N(class08036 class080362) {
        GameProfile gameProfile = class080362.method_7334();
        return this.T.computeIfAbsent(gameProfile.id(), uUID -> {
            Path path = this.N(gameProfile);
            return new class04895(this.z, path);
        });
    }

    private Path N(GameProfile gameProfile) {
        Path path;
        Path path2 = this.z.N(class05071.y);
        Path path3 = path2.resolve(String.valueOf(gameProfile.id()) + ".json");
        if (Files.exists(path3, new LinkOption[0])) {
            return path3;
        }
        String string = gameProfile.name() + ".json";
        if (class06290.R((String)string) && Files.isRegularFile(path = path2.resolve(string), new LinkOption[0])) {
            try {
                return Files.move(path, path3, new CopyOption[0]);
            }
            catch (IOException iOException) {
                M.warn("Failed to copy file {} to {}", (Object)string, (Object)path3);
                return path;
            }
        }
        return path3;
    }

    public void N(class04770 class047702, class04782 class047822) {
        class08057 class080572 = class047822.method_8621();
        class047702.field_13987.method_14364((class00381)new class02860(class080572));
        class047702.field_13987.method_14364((class00381)new class08068(class047822.N(), class047822.method_8532(), ((Boolean)class047822.method_64395().N(class07305.N)).booleanValue()));
        class047702.field_13987.method_14364((class00381)new class08096(class047822.method_74854()));
        if (class047822.method_8419()) {
            class047702.field_13987.method_14364((class00381)new class00503(class00503.L, 0.0f));
            class047702.field_13987.method_14364((class00381)new class00503(class00503.Z, class047822.method_8430(1.0f)));
            class047702.field_13987.method_14364((class00381)new class00503(class00503.z, class047822.method_8478(1.0f)));
        }
        class047702.field_13987.method_14364((class00381)new class00503(class00503.P, 0.0f));
        this.z.yW().N(class047702);
    }

    public void N(int n) {
        this.n = n;
        this.N((class00381<?>)new class05705(n));
        Iterator var2 = this.z.NO().iterator();
        while (var2.hasNext()) {
            ((class04782)var2.next()).method_14178().N(n);
        }
    }

    public void N(class03926 class039262, class04770 class047702, class00649 class006492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class039262, class047702, class006492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class039262, arg_0 -> ((class04770)class047702).method_33795(arg_0), class047702, class006492);
    }

    private void N(class03926 class039262, Predicate<class04770> predicate, @Nullable class04770 class047702, class00649 class006492) {
        boolean bl = this.N(class039262);
        this.z.N(class039262.u(), class006492, bl ? null : "Not Secure");
        class03059 class030592 = class03059.N((class03926)class039262);
        boolean bl2 = false;
        for (class04770 class047703 : this.U) {
            boolean bl3 = predicate.test(class047703);
            class047703.method_43505(class030592, bl3, class006492);
            bl2 |= bl3 && class039262.z();
        }
        if (bl2 && class047702 != null) {
            class047702.method_64398(i);
        }
    }

    private boolean N(class03926 class039262) {
        return class039262.Z() && !class039262.N(Instant.now());
    }

    public String[] W() {
        return this.P.y();
    }

    public String[] R() {
        String[] stringArray = new String[this.U.size()];
        for (int i = 0; i < this.U.size(); ++i) {
            stringArray[i] = this.U.get(i).method_7334().name();
        }
        return stringArray;
    }

    public class03704 R(class04770 class047702) {
        UUID uUID = class047702.method_5667();
        class03704 class037042 = this.b.get(uUID);
        if (class037042 == null) {
            Path path = this.z.N(class05071.N).resolve(String.valueOf(uUID) + ".json");
            class037042 = new class03704(this.z.ND(), this, this.z.Nh(), path, class047702);
            this.b.put(uUID, class037042);
        }
        class037042.N(class047702);
        return class037042;
    }

    public boolean R(class08774 class087742) {
        return this.P.u(class087742) || this.z.N(class087742) && this.z.yn().E() || this.G;
    }

    public void x_() {
    }
}

