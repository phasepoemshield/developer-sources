/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5250
 *  net.minecraft.class_5251
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.command.A;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.player.e_0;
import kotakbaz.rain.module.modules.render.target.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_5251;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b\"\u0010!J)\u0010'\u001a\u00020\u001f2\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0$0#H\u0002\u00a2\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0012H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b/\u0010\u0003R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u00104R&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R&\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00106\u00a8\u00068"}, d2={"Lkotakbaz/rain/module/modules/player/TotemTrackerModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/AttackEvent;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/TotemPopEvent;", "onTotemPop", "(Lkotakbaz/rain/event/events/TotemPopEvent;)V", "onEnable", "onDisable", "syncCachedTargetState", "Lnet/minecraft/class_1657;", "target", "cacheTarget", "(Lnet/minecraft/class_1657;)V", "activeTarget", "()Lnet/minecraft/class_1657;", "", "playerName", "", "enchanted", "Lnet/minecraft/class_2561;", "totemPopMessage", "(Ljava/lang/String;Z)Lnet/minecraft/class_2561;", "Lnet/minecraft/class_5250;", "enchantedLabel", "()Lnet/minecraft/class_5250;", "unenchantedLabel", "", "Lkotlin/Pair;", "", "segments", "buildStyledLabel", "(Ljava/util/List;)Lnet/minecraft/class_5250;", "Lnet/minecraft/class_1799;", "heldTotem", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_1799;", "player", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "resetCache", "Ljava/util/UUID;", "cachedTargetId", "Ljava/util/UUID;", "cachedTotemEnchanted", "Ljava/lang/Boolean;", "enchantedSegments", "Ljava/util/List;", "unenchantedSegments", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTotemTrackerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotemTrackerModule.kt\nkotakbaz/rain/module/modules/player/TotemTrackerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1915#3,2:178\n*S KotlinDebug\n*F\n+ 1 TotemTrackerModule.kt\nkotakbaz/rain/module/modules/player/TotemTrackerModule\n*L\n145#1:178,2\n*E\n"})
public final class H
extends a_0 {
    @NotNull
    public static final H INSTANCE;
    @Nullable
    private static UUID a;
    @Nullable
    private static Boolean A;
    @NotNull
    private static final List<Pair<String, Integer>> b;
    @NotNull
    private static final List<Pair<String, Integer>> B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private H() {
        int n = E[0];
        n += E[1];
        int n2 = E[3];
        n2 += E[4];
        int n3 = E[6];
        n3 -= E[7];
        super((String)c[n += E[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)c[n2 ^= E[5]] + (String)c[n3 ^= E[8]]);
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        int n = E[9];
        n ^= E[10];
        Intrinsics.checkNotNullParameter(d2, (String)c[n += E[11]]);
        kotakbaz.rain.module.modules.render.target.a.INSTANCE.update();
        this.syncCachedTargetState();
    }

    @Commando
    public final void onAttack(@NotNull d_0 d_02) {
        int n = E[12];
        n += E[13];
        Intrinsics.checkNotNullParameter(d_02, (String)c[n ^= E[14]]);
        class_1297 class_12972 = d_02.getEntity();
        class_1657 class_16572 = class_12972 instanceof class_1657 ? (class_1657)class_12972 : null;
        if (class_16572 == null) {
            return;
        }
        class_1657 class_16573 = class_16572;
        if (!this.isUsableTarget(class_16573)) {
            return;
        }
        kotakbaz.rain.module.modules.render.target.a.INSTANCE.track(class_16573);
        this.cacheTarget(class_16573);
    }

    @Commando
    public final void onTotemPop(@NotNull kotakbaz.rain.event.events.b_0 b_02) {
        int n;
        long l = 2767407390142255168L;
        int n2 = E[15];
        n2 += E[16];
        Intrinsics.checkNotNullParameter(b_02, (String)c[n2 -= E[17]]);
        kotakbaz.rain.module.modules.render.target.a.INSTANCE.update();
        this.syncCachedTargetState();
        class_1657 class_16572 = this.activeTarget();
        if (class_16572 == null) {
            return;
        }
        class_1657 class_16573 = class_16572;
        class_1657 class_16574 = b_02.getPlayer();
        if (!Intrinsics.areEqual(class_16574.method_5667(), class_16573.method_5667())) {
            return;
        }
        Boolean bl = A;
        if (bl != null) {
            n = bl.booleanValue();
        } else {
            class_1799 class_17992 = this.heldTotem(class_16574);
            Boolean bl2 = class_17992 != null ? Boolean.valueOf(class_17992.method_7958()) : null;
            if (bl2 != null) {
                n = bl2.booleanValue() ? 1 : 0;
            } else {
                int n3 = E[18];
                n3 += E[19];
                n = n3 += E[20];
            }
        }
        int n4 = E[21];
        n4 ^= E[22];
        long l2 = l;
        int n5 = E[24];
        n5 -= E[25];
        l = l2 ^ ((long)n << (n4 ^= E[23]) ^ l2) & -1L << (n5 -= E[26]);
        String string = class_16574.method_7334().getName();
        int n6 = E[27];
        n6 ^= E[28];
        Intrinsics.checkNotNullExpressionValue(string, (String)c[n6 += E[29]]);
        int n7 = E[30];
        n7 -= E[31];
        kotakbaz.rain.command.A.INSTANCE.sendClientMessage(this.totemPopMessage(string, (boolean)(l >>> (n7 ^= E[32]))));
    }

    @Override
    public void onEnable() {
        this.resetCache();
    }

    @Override
    public void onDisable() {
        this.resetCache();
    }

    private final void syncCachedTargetState() {
        class_1657 class_16572 = this.activeTarget();
        if (class_16572 == null) {
            this.resetCache();
            return;
        }
        this.cacheTarget(class_16572);
    }

    private final void cacheTarget(class_1657 class_16572) {
        block1: {
            long l = 5883390784367728521L;
            if (!Intrinsics.areEqual(a, class_16572.method_5667())) {
                a = class_16572.method_5667();
                A = null;
            }
            class_1799 class_17992 = this.heldTotem(class_16572);
            if (class_17992 == null) break block1;
            class_1799 class_17993 = class_17992;
            long l2 = l;
            int n = E[33];
            n -= E[34];
            l = l2 ^ (0L ^ l2) & -1L << (n ^= E[35]);
            A = class_17993.method_7958();
        }
    }

    private final class_1657 activeTarget() {
        class_1657 class_16572;
        class_1657 class_16573;
        long l = -8269485702804051982L;
        class_1657 class_16574 = kotakbaz.rain.module.modules.render.target.a.INSTANCE.currentTarget();
        if (class_16574 == null) {
            return null;
        }
        class_1657 class_16575 = class_16573 = (class_16572 = class_16574);
        long l2 = l;
        int n = E[36];
        n += E[37];
        l = l2 ^ (0L ^ l2) & -1L << (n -= E[38]);
        return this.isUsableTarget(class_16575) ? class_16573 : null;
    }

    private final class_2561 totemPopMessage(String string, boolean bl) {
        String string2 = string;
        int n = E[39];
        n -= E[40];
        int n2 = E[42];
        n2 += E[43];
        int n3 = E[45];
        n3 += E[46];
        class_5250 class_52502 = class_2561.method_43473().method_10852((class_2561)class_2561.method_43470((String)((String)c[n += E[41]] + (String)c[n2 += E[44]] + string2 + (String)c[n3 += E[47]]))).method_10852((class_2561)(bl ? this.enchantedLabel() : this.unenchantedLabel()));
        int n4 = E[48];
        n4 += E[49];
        Intrinsics.checkNotNullExpressionValue(class_52502, (String)c[n4 += E[50]]);
        return (class_2561)class_52502;
    }

    private final class_5250 enchantedLabel() {
        return this.buildStyledLabel(b);
    }

    private final class_5250 unenchantedLabel() {
        return this.buildStyledLabel(B);
    }

    private final class_5250 buildStyledLabel(List<Pair<String, Integer>> list) {
        long l = -6119258597049602637L;
        long l2 = -6562963403194189202L;
        class_5250 class_52502 = class_2561.method_43473();
        Iterable iterable = list;
        long l3 = l;
        int n = E[51];
        n -= E[52];
        l = l3 ^ (0L ^ l3) & -1L << (n ^= E[53]);
        for (Object t2 : iterable) {
            Pair pair = (Pair)t2;
            long l4 = l;
            int n2 = E[54];
            n2 -= E[55];
            l = l4 ^ (0L ^ l4) & -1L >>> (n2 += E[56]);
            String string = (String)pair.component1();
            int n3 = E[57];
            n3 -= E[58];
            long l5 = l2;
            int n4 = E[60];
            n4 ^= E[61];
            l2 = l5 ^ ((long)((Number)pair.component2()).intValue() << (n3 ^= E[59]) ^ l5) & -1L << (n4 -= E[62]);
            int n5 = E[63];
            n5 += E[64];
            boolean bl = E[66];
            bl -= E[67];
            class_52502.method_10852((class_2561)class_2561.method_43470((String)string).method_10862(class_2583.field_24360.method_27703(class_5251.method_27717((int)((int)(l2 >>> (n5 -= E[65]))))).method_10982(Boolean.valueOf(bl ^= E[68]))));
        }
        Intrinsics.checkNotNull(class_52502);
        return class_52502;
    }

    private final class_1799 heldTotem(class_1657 class_16572) {
        if (class_16572.method_6047().method_31574(class_1802.field_8288)) {
            return class_16572.method_6047();
        }
        if (class_16572.method_6079().method_31574(class_1802.field_8288)) {
            return class_16572.method_6079();
        }
        return null;
    }

    private final boolean isUsableTarget(class_1657 class_16572) {
        int n;
        if (!(Intrinsics.areEqual(class_16572, b_0.getMc().field_1724) || class_16572.method_31481() || !class_16572.method_5805() || class_16572.method_5767() || e_0.INSTANCE.isFakePlayer((class_1297)class_16572))) {
            int n2 = E[69];
            n2 -= E[70];
            n = n2 += E[71];
        } else {
            int n3 = E[72];
            n3 ^= E[73];
            n = n3 += E[74];
        }
        return n != 0;
    }

    private final void resetCache() {
        a = null;
        A = null;
    }

    static {
        H.b();
        long l = -8814073713807687238L;
        long l2 = 6274671598475347738L;
        long l3 = 1767933899772772442L;
        long l4 = -913394603969267028L;
        long l5 = 3863618163853749747L;
        long l6 = -7781293406722840285L;
        long l7 = 8459020828101931936L;
        long l8 = 1065015481360413434L;
        long l9 = -7098666537074988665L;
        long l10 = -2404856408934250085L;
        long l11 = 8634462262975230578L;
        long l12 = 457639777243629330L;
        long l13 = 2195456004625480863L;
        long l14 = -7246078413220295422L;
        int n = E[75];
        n ^= E[76];
        c = new Object[n ^= E[77]];
        long l15 = l14;
        int n2 = E[78];
        n2 += E[79];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= E[80]);
        Object[] objectArray = new Object[E[81]];
        objectArray[H.E[82]] = C;
        objectArray[H.E[83]] = E[84];
        int n3 = E[85];
        Object object = H.A()[E[86]];
        if (object == null) {
            char[] cArray = "\ufd0e\ufd0e\ufd4a\ufd70\ufd6c\ufd67\ufd75\ufd72\uf28f\ufd26\ufd1c\uf210\uf2b6\ufd4d\uf2b1\ufd72\uf210\ufd24\ufd4f\ufd02\ufd71\ufd6f\ufd70\ufd18\ufd76\ufd2e\ufd16\ufd22\ufd78\ufd4e\uf2b2\ufd2a\uf28c\ufd1c\ufd76\ufd6c\uf2b6\ufd02\ufd1d\ufd03\ufd18\ufd05\ufd0e\ufd6f\uf2b8\ufd08\uf210\ufd2e\ufd0a\uf2b8\ufd4e\uf2b2\ufd09\ufd70\ufd13\ufd11\ufd11\uf28f\ufd11\uf2b3\ufd13\ufd23\uf2a5\ufd12\uf210\ufd15\ufd21\uf2a7\ufd72\ufd22\ufd09\ufd0e\ufd72\ufd24\ufd65\ufd78\ufd4d\ufd0a\ufd78\ufd78\ufd24\uf28f\ufd70\uf2b6\ufd0b\uf2b3\ufd75\ufd02\ufd04\ufd73\ufd70\ufd76\ufd26\ufd70\uf210\uf210\ufd21\ufd00\ufd72\ufd3c\ufdd0\ufd70\ufd06\ufd0a\ufd78\ufd6d\ufd18\ufd73\ufd71\ufd02\ufd2b\uf210\uf210\ufd4f\ufd08\ufd3d\ufd02\uf2b2\ufd1c\ufd4e\ufd4d\ufd11\ufd1d\ufd1d\ufd04\ufd1f\ufd6c\ufd13\ufd09\ufd6d\ufd06\ufd6c\ufd00\uf28f\ufd29\ufd13\ufd2a\ufd09\uf210\ufd0b\ufd6f\ufd02\uf210\ufd2e\ufd4a\ufd4d\ufd3c\ufd16\ufd75\ufd72\ufd4c\ufd70\ufd71\ufd08\ufd05\uf2a5\ufd0b\ufd26\uf2a5\ufd71\ufd00\ufd0a\ufd03\ufd3d\ufd18\ufd03\ufd02\ufd1d\ufd4a\ufd12\ufd72\ufd3c\ufd1d\ufd24\ufd13\ufd2a\ufd76\ufd13\uf2b3\ufd78\ufd21\ufd70\ufd13\uf2b1\uf2b6\ufd04\ufd73\ufd09\ufd76\uf2b6\uf2b2\ufd70\uf2b2\uf2b2\ufd08\ufd03\ufd1c\ufd18\uf2a7\ufd28\ufdd0\ufd18\ufd21\ufd67\uf2a5\ufd78\ufd12\ufd05\ufd3f\ufd1c\ufd0b\ufd78\ufd65\ufd23\ufd78\uf28f\ufdd0\uf2b6\ufd65\ufdd0\ufd28\ufd67\ufd73\ufd6c\uf2a5\ufd15\ufd4a\ufd0a\ufd09\uf2a7\ufd6c\uf2b8\ufd67\ufd67\ufd78\ufd72\uf210\ufd65\ufd09\ufd08\ufd1f\ufd08\ufd4a\ufd72\ufd4c\ufd01\uf2b2\uf2a7\uf210\ufd2a\ufd03\uf28c\ufd22\uf2a7\uf2b2\ufd18\ufd28\ufd3c\ufd16\uf2b1\ufd4f\uf2b6\ufd29\ufd2e\ufd12\ufd2b\ufd24\ufd07\ufd03\ufd02\ufd4a\ufd12\ufd4c\uf2b6\uf28c\ufd04\ufd3d\ufd08\ufd21\ufd18\ufd4e\ufd16\ufd6c\ufd26\ufd75\ufd4d\uf2a5\ufd76\ufd2b\ufd60\ufd60\ufd26\uf2b8\ufd06\ufd70\ufd6c\ufd2b\ufd75\ufd00\ufd02\ufd01\uf2b6\ufd71\ufd76\ufd12\ufd6c\ufd23\ufd3f\ufd4c\ufd24\ufd02\ufd08\uf2a7\ufd78\ufd67\ufd22\ufd28\ufd05\ufd75\ufd08\ufd02\ufd67\ufd08\ufd1d\ufd4d\ufd70\ufd3f\ufd4c\ufd6d\ufd09\ufd4e\ufd1d\uf28c\uf2a5\ufd22\ufd75\ufd71\ufd1f\ufd3f\ufd28\ufd72\ufd22\uf28c\uf2b3\ufd06\ufd4c\ufd03\ufd00\ufd1c\ufd2e\ufd4d\ufd16\ufd4a\ufd24\uf2a7\ufd60\ufd1d\uf28c\ufd0e\ufd02\ufd21\ufd4a\ufd15\ufd4c\ufd13\ufd2e\ufd1f\ufd6f\ufd0e\ufd28\ufd16\ufd4d\ufd15\ufd05\ufd6c\ufd3f\uf2b6\ufd4d\uf210\ufd05\ufd6f\ufd15\ufd11\ufd78\ufd60\ufd03\ufd16\ufd22\ufd67\uf2b2\uf2a7\ufd1d\ufd1c\ufd02\ufd75\uf2a5\ufd09\ufd16\ufd73\ufd26\ufd70\ufdd0\ufd6c\ufd04\uf2b8\uf2b8\ufdd0\ufd2a\ufd3c\ufd78\ufd12\ufd18\ufd0e\ufd28\ufd16\ufd11\ufd3d\ufd3f\ufd6d\ufd21\uf2b8\ufd65\ufd1f\ufd28\ufd0a\ufd2e\ufd28\uf2b4".toCharArray();
            for (int i2 = E[87]; i2 < E[88]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= E[89];
                n4 += E[90];
                n4 ^= E[91];
                n4 += E[92];
                n4 -= E[93];
                n4 ^= E[94];
                n4 ^= E[95];
                n4 -= E[96];
                n4 ^= E[97];
                cArray[i2] = (char)(n4 ^= E[98]);
            }
            object = H.A()[H.E[99]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)H.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = E[100];
        n5 -= E[101];
        l5 = l16 ^ (0xDF00000000L ^ l16) & -1L << (n5 += E[102]);
        long l17 = l12;
        int n6 = E[103];
        n6 -= E[104];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += E[105]);
        while (true) {
            int n7 = E[106];
            n7 += E[107];
            if ((int)l12 >= (int)(l5 >>> (n7 -= E[108]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = E[109];
            n9 += E[110];
            int n10 = E[112];
            n10 ^= E[113];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += E[111])) & -1L >>> (n10 ^= E[114]);
            long l19 = l8;
            int n11 = E[115];
            n11 ^= E[116];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= E[117]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = E[118];
            n13 -= E[119];
            int n14 = E[121];
            n14 -= E[122];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= E[120])) & -1L >>> (n14 ^= E[123]);
            int n15 = E[124];
            n15 -= E[125];
            long l21 = l9;
            int n16 = E[127];
            n16 += E[128];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= E[126]) ^ l21) & -1L << (n16 ^= E[129]);
            int n17 = E[130];
            n17 -= E[131];
            n17 ^= E[132];
            int n18 = E[133];
            n18 -= E[134];
            long l22 = l11;
            int n19 = E[136];
            n19 -= E[137];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= E[135]))) ^ l22) & -1L >>> (n19 -= E[138]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = E[139];
            n20 ^= E[140];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= E[141]);
            while (true) {
                int n21 = E[142];
                n21 -= E[143];
                if ((int)(l13 >>> (n21 ^= E[144])) >= (int)l11) break;
                int n22 = E[145];
                n22 -= E[146];
                int n23 = E[148];
                n23 += E[149];
                cArray2[(int)(l13 >>> (n22 -= H.E[147]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += E[150]))];
                l13 += 0x100000000L;
            }
            int n24 = E[151];
            n24 ^= E[152];
            int n25 = (int)(l14 >>> (n24 ^= E[153]));
            l14 += 0x100000000L;
            H.c[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = E[154];
            n26 += E[155];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= E[156]);
        }
        INSTANCE = new H();
        int n27 = E[157];
        n27 ^= E[158];
        Pair[] pairArray = new Pair[n27 ^= E[159]];
        int n28 = E[160];
        n28 -= E[161];
        int n29 = E[163];
        n29 -= E[164];
        int n30 = E[166];
        n30 ^= E[167];
        pairArray[n28 += H.E[162]] = TuplesKt.to((String)c[n29 += E[165]], n30 -= E[168]);
        int n31 = E[169];
        n31 -= E[170];
        int n32 = E[172];
        n32 += E[173];
        int n33 = E[175];
        n33 += E[176];
        pairArray[n31 += H.E[171]] = TuplesKt.to((String)c[n32 += E[174]], n33 ^= E[177]);
        int n34 = E[178];
        n34 += E[179];
        int n35 = E[181];
        n35 ^= E[182];
        int n36 = E[184];
        n36 -= E[185];
        pairArray[n34 ^= H.E[180]] = TuplesKt.to((String)c[n35 += E[183]], n36 -= E[186]);
        int n37 = E[187];
        n37 -= E[188];
        int n38 = E[190];
        n38 += E[191];
        int n39 = E[193];
        n39 += E[194];
        pairArray[n37 += H.E[189]] = TuplesKt.to((String)c[n38 -= E[192]], n39 ^= E[195]);
        int n40 = E[196];
        n40 += E[197];
        int n41 = E[199];
        n41 -= E[200];
        int n42 = E[202];
        n42 ^= E[203];
        pairArray[n40 ^= H.E[198]] = TuplesKt.to((String)c[n41 += E[201]], n42 += E[204]);
        int n43 = E[205];
        n43 ^= E[206];
        int n44 = E[208];
        n44 ^= E[209];
        int n45 = E[211];
        n45 -= E[212];
        pairArray[n43 ^= H.E[207]] = TuplesKt.to((String)c[n44 -= E[210]], n45 ^= E[213]);
        int n46 = E[214];
        n46 -= E[215];
        int n47 = E[217];
        n47 ^= E[218];
        int n48 = E[220];
        n48 ^= E[221];
        pairArray[n46 += H.E[216]] = TuplesKt.to((String)c[n47 += E[219]], n48 -= E[222]);
        int n49 = E[223];
        n49 += E[224];
        int n50 = E[226];
        n50 += E[227];
        int n51 = E[229];
        n51 ^= E[230];
        pairArray[n49 += H.E[225]] = TuplesKt.to((String)c[n50 -= E[228]], n51 += E[231]);
        int n52 = E[232];
        n52 ^= E[233];
        int n53 = E[235];
        n53 -= E[236];
        int n54 = E[238];
        n54 -= E[239];
        pairArray[n52 += H.E[234]] = TuplesKt.to((String)c[n53 -= E[237]], n54 -= E[240]);
        int n55 = E[241];
        n55 ^= E[242];
        int n56 = E[244];
        n56 += E[245];
        int n57 = E[247];
        n57 += E[248];
        pairArray[n55 -= H.E[243]] = TuplesKt.to((String)c[n56 += E[246]], n57 += E[249]);
        int n58 = E[250];
        n58 ^= E[251];
        int n59 = E[253];
        n59 ^= E[254];
        int n60 = E[256];
        n60 -= E[257];
        pairArray[n58 += H.E[252]] = TuplesKt.to((String)c[n59 -= E[255]], n60 ^= E[258]);
        int n61 = E[259];
        n61 += E[260];
        int n62 = E[262];
        n62 ^= E[263];
        int n63 = E[265];
        n63 ^= E[266];
        pairArray[n61 += H.E[261]] = TuplesKt.to((String)c[n62 ^= E[264]], n63 += E[267]);
        int n64 = E[268];
        n64 += E[269];
        int n65 = E[271];
        n65 -= E[272];
        int n66 = E[274];
        n66 ^= E[275];
        pairArray[n64 += H.E[270]] = TuplesKt.to((String)c[n65 += E[273]], n66 += E[276]);
        b = CollectionsKt.listOf(pairArray);
        int n67 = E[277];
        n67 ^= E[278];
        pairArray = new Pair[n67 += E[279]];
        int n68 = E[280];
        n68 ^= E[281];
        int n69 = E[283];
        n69 -= E[284];
        int n70 = E[286];
        n70 += E[287];
        pairArray[n68 -= H.E[282]] = TuplesKt.to((String)c[n69 ^= E[285]], n70 ^= E[288]);
        int n71 = E[289];
        n71 ^= E[290];
        int n72 = E[292];
        n72 += E[293];
        int n73 = E[295];
        n73 -= E[296];
        pairArray[n71 ^= H.E[291]] = TuplesKt.to((String)c[n72 -= E[294]], n73 ^= E[297]);
        int n74 = E[298];
        n74 += E[299];
        int n75 = E[301];
        n75 ^= E[302];
        int n76 = E[304];
        n76 += E[305];
        pairArray[n74 ^= H.E[300]] = TuplesKt.to((String)c[n75 += E[303]], n76 += E[306]);
        int n77 = E[307];
        n77 += E[308];
        int n78 = E[310];
        n78 ^= E[311];
        int n79 = E[313];
        n79 += E[314];
        pairArray[n77 -= H.E[309]] = TuplesKt.to((String)c[n78 -= E[312]], n79 += E[315]);
        int n80 = E[316];
        n80 += E[317];
        int n81 = E[319];
        n81 -= E[320];
        int n82 = E[322];
        n82 -= E[323];
        pairArray[n80 ^= H.E[318]] = TuplesKt.to((String)c[n81 -= E[321]], n82 ^= E[324]);
        int n83 = E[325];
        n83 ^= E[326];
        int n84 = E[328];
        n84 -= E[329];
        int n85 = E[331];
        n85 ^= E[332];
        pairArray[n83 += H.E[327]] = TuplesKt.to((String)c[n84 += E[330]], n85 ^= E[333]);
        int n86 = E[334];
        n86 ^= E[335];
        int n87 = E[337];
        n87 -= E[338];
        int n88 = E[340];
        n88 += E[341];
        pairArray[n86 ^= H.E[336]] = TuplesKt.to((String)c[n87 += E[339]], n88 += E[342]);
        int n89 = E[343];
        n89 -= E[344];
        int n90 = E[346];
        n90 -= E[347];
        int n91 = E[349];
        n91 += E[350];
        pairArray[n89 += H.E[345]] = TuplesKt.to((String)c[n90 ^= E[348]], n91 += E[351]);
        int n92 = E[352];
        n92 ^= E[353];
        int n93 = E[355];
        n93 -= E[356];
        int n94 = E[358];
        n94 ^= E[359];
        pairArray[n92 -= H.E[354]] = TuplesKt.to((String)c[n93 += E[357]], n94 -= E[360]);
        int n95 = E[361];
        n95 += E[362];
        int n96 = E[364];
        n96 += E[365];
        int n97 = E[367];
        n97 ^= E[368];
        pairArray[n95 += H.E[363]] = TuplesKt.to((String)c[n96 ^= E[366]], n97 += E[369]);
        int n98 = E[370];
        n98 += E[371];
        int n99 = E[373];
        n99 += E[374];
        int n100 = E[376];
        n100 += E[377];
        pairArray[n98 ^= H.E[372]] = TuplesKt.to((String)c[n99 -= E[375]], n100 -= E[378]);
        int n101 = E[379];
        n101 -= E[380];
        int n102 = E[382];
        n102 -= E[383];
        int n103 = E[385];
        n103 += E[386];
        pairArray[n101 += H.E[381]] = TuplesKt.to((String)c[n102 ^= E[384]], n103 += E[387]);
        int n104 = E[388];
        n104 -= E[389];
        int n105 = E[391];
        n105 ^= E[392];
        int n106 = E[394];
        n106 += E[395];
        pairArray[n104 ^= H.E[390]] = TuplesKt.to((String)c[n105 -= E[393]], n106 -= E[396]);
        int n107 = E[397];
        n107 += E[398];
        int n108 = 28;
        int n109 = 16711738;
        n109 ^= 0x54;
        pairArray[n107 -= H.E[399]] = TuplesKt.to((String)c[n108 -= 0], n109 += -110);
        int n110 = 25;
        n110 ^= 0xFFFFFF89;
        int n111 = 34;
        n111 += -34;
        int n112 = 16711781;
        n112 ^= 0x20;
        pairArray[n110 += 126] = TuplesKt.to((String)c[n111 ^= 0xB], n112 ^= 0x45);
        int n113 = 13;
        n113 ^= 0xFFFFFFBA;
        int n114 = 23;
        n114 += -37;
        int n115 = -16711783;
        n115 ^= 0xFFFFFFDD;
        pairArray[n113 += 88] = TuplesKt.to((String)c[n114 += 28], n115 ^= 0x44);
        B = CollectionsKt.listOf(pairArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x9501 ^ 0x9511];
                byArray[0x1FE5 ^ 0x1FE3] = 0xFFFFE006 ^ 0x1FE3;
                byArray[0x9027 ^ 0x9024] = 0xFFFF6FA8 ^ 0x9024;
                byArray[0x6668 ^ 0x6661] = 0xFFFF99C1 ^ 0x6661;
                byArray[0xDE63 ^ 0xDE64] = 0xDE3C ^ 0xDE64;
                byArray[0x6AE9 ^ 0x6AE8] = 0x6AC8 ^ 0x6AE8;
                byArray[0x4836 ^ 0x483E] = 0x4865 ^ 0x483E;
                byArray[0x52B0 ^ 0x52B0] = 0x5286 ^ 0x52B0;
                byArray[0x2B15 ^ 0x2B10] = 0x2B42 ^ 0x2B10;
                byArray[0x241C ^ 0x2417] = 0x243A ^ 0x2417;
                byArray[0x10024 ^ 0x1002E] = 0x10050 ^ 0x1002E;
                byArray[0x9067 ^ 0x906A] = 0xFFFF6FDA ^ 0x906A;
                byArray[0xE15D ^ 0xE151] = 0xFFFF1ED2 ^ 0xE151;
                byArray[0x9BA7 ^ 0x9BA5] = 0xFFFF643B ^ 0x9BA5;
                byArray[0x707D ^ 0x7079] = 0x7022 ^ 0x7079;
                byArray[0x95F9 ^ 0x95F6] = 0x9582 ^ 0x95F6;
                byArray[0x5863 ^ 0x586D] = 0xFFFFA7E0 ^ 0x586D;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (d == null) {
                byte[] byArray2 = new byte[0x4886 ^ 0x48A6];
                byArray2[0xB603 ^ 0xB600] = 0xFFFF4993 ^ 0xB600;
                byArray2[0xBE1E ^ 0xBE02] = 0xFFFF418B ^ 0xBE02;
                byArray2[0x9355 ^ 0x935E] = 0x930A ^ 0x935E;
                byArray2[0x1EFF ^ 0x1EFD] = 0xFFFFE104 ^ 0x1EFD;
                byArray2[0x6478 ^ 0x6467] = 0xFFFF9BC8 ^ 0x6467;
                byArray2[0xBCCC ^ 0xBCCB] = 0xFFFF4365 ^ 0xBCCB;
                byArray2[0xEF8F ^ 0xEF82] = 0xFFFF1042 ^ 0xEF82;
                byArray2[0x107F0 ^ 0x107E4] = 0x107B6 ^ 0x107E4;
                byArray2[0x8D5B ^ 0x8D4B] = 0x8D5B ^ 0x8D4B;
                byArray2[0x5ABE ^ 0x5AA8] = 0x5AA6 ^ 0x5AA8;
                byArray2[0x8F7F ^ 0x8F64] = 0x8F00 ^ 0x8F64;
                byArray2[0xD4B5 ^ 0xD4A4] = 0xFFFF2B49 ^ 0xD4A4;
                byArray2[0x7622 ^ 0x7630] = 0xFFFF89B4 ^ 0x7630;
                byArray2[0x5AAB ^ 0x5AB8] = 0xFFFFA522 ^ 0x5AB8;
                byArray2[0x8B5E ^ 0x8B5A] = 0xFFFF74CF ^ 0x8B5A;
                byArray2[0xAE8D ^ 0xAE88] = 0xFFFF5119 ^ 0xAE88;
                byArray2[0x39C1 ^ 0x39CF] = 0x39CD ^ 0x39CF;
                byArray2[0x95C8 ^ 0x95CE] = 0xFFFF6A4E ^ 0x95CE;
                byArray2[0xB5EB ^ 0xB5F6] = 0xFFFF4A5A ^ 0xB5F6;
                byArray2[0x49E6 ^ 0x49E9] = 0xFFFFB662 ^ 0x49E9;
                byArray2[0x82F4 ^ 0x82E1] = 0x82F8 ^ 0x82E1;
                byArray2[0x3AF ^ 0x3A3] = 0xFFFFFC45 ^ 0x3A3;
                byArray2[0x940 ^ 0x949] = 0xFFFFF6F0 ^ 0x949;
                byArray2[0x9ADB ^ 0x9ADB] = 0xFFFF6558 ^ 0x9ADB;
                byArray2[0x8C7 ^ 0x8CF] = 0x8AA ^ 0x8CF;
                byArray2[0x6427 ^ 0x643F] = 0xFFFF9BA5 ^ 0x643F;
                byArray2[0x5681 ^ 0x5680] = 0x568B ^ 0x5680;
                byArray2[0xA4F2 ^ 0xA4E5] = 0xFFFF5B7A ^ 0xA4E5;
                byArray2[0xC0A ^ 0xC00] = 0xFFFFF3A9 ^ 0xC00;
                byArray2[0xA918 ^ 0xA902] = 0xA906 ^ 0xA902;
                byArray2[0xF42A ^ 0xF433] = 0xF416 ^ 0xF433;
                byArray2[0x5495 ^ 0x548B] = 0xFFFFAB10 ^ 0x548B;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = H.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u80c0\u80d2\u80a9\u80ac\u80ce\u8122\u80dd\u80c7\u80fc\u80c8\u80a8\u80c3\u80ef\u80f1\u80c1\u80a8\u80cf\u811f".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= 36865;
                        n2 -= 45492;
                        n2 -= 53366;
                        n2 += 14599;
                        n2 -= 48250;
                        n2 ^= 0x9E8B;
                        n2 ^= 0x979B;
                        n2 += 57323;
                        n2 ^= 0xA1CD;
                        n2 ^= 0x3FF;
                        cArray[i2] = (char)(n2 ^= 0x607F);
                    }
                    object4 = H.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = 106;
                byArray4[5] = 81;
                byArray4[12] = -35;
                byArray4[15] = 58;
                byArray4[13] = -11;
                byArray4[0] = -69;
                byArray4[4] = 8;
                byArray4[7] = 41;
                byArray4[1] = 81;
                byArray4[9] = 99;
                byArray4[2] = -120;
                byArray4[3] = 9;
                byArray4[6] = 46;
                byArray4[14] = 26;
                byArray4[8] = -95;
                byArray4[11] = -86;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 22, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = H.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uca18\uca1c\uca0a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 ^= 0x2C41;
                        n3 -= 20581;
                        n3 -= 42438;
                        n3 ^= 0x3268;
                        n3 ^= 0x28A9;
                        n3 -= 44331;
                        n3 -= 62731;
                        n3 ^= 0xD2CC;
                        n3 ^= 0xE6AC;
                        n3 ^= 0xDD0;
                        n3 += 64629;
                        n3 -= 7895;
                        n3 += 58234;
                        n3 ^= 0x4CFF;
                        cArray[i3] = (char)(n3 ^= 0x7E9F);
                    }
                    object5 = H.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = H.A()[3];
            if (object6 == null) {
                char[] cArray = "\u35bb\u3587\u35a9\u358d\u35b9\u35b4\u35b9\u358d\u35ae\u3581\u35b9\u35a9\u35d7\u35ae\u35db\u35da\u35da\u35a3\u35c8\u35a5".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0xDF63;
                    n4 ^= 0xEF7;
                    n4 -= 12872;
                    n4 += 62904;
                    n4 ^= 0xDCA8;
                    n4 -= 61881;
                    n4 ^= 0xD22A;
                    n4 -= 63612;
                    n4 -= 37340;
                    n4 -= 18316;
                    cArray[i4] = (char)(n4 -= 35119);
                }
                object6 = H.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x59E3 ^ 0x5873];
        H.E[0xDF20 ^ 0xDE25] = 0xDE4A ^ 0xDE25;
        H.E[0x6B38 ^ 0x6A3F] = 0x6A59 ^ 0x6A3F;
        H.E[0x109A ^ 0x1097] = 0xFFFFEF78 ^ 0x1097;
        H.E[0xC9DC ^ 0xC8C2] = 0xFFC8E4 ^ 0xC8C2;
        H.E[0xADEA ^ 0xAD7D] = 0xAD4E ^ 0xAD7D;
        H.E[0xC64F ^ 0xC769] = 0xC74A ^ 0xC769;
        H.E[0x7F34 ^ 0x7E64] = 0xFFFF81E6 ^ 0x7E64;
        H.E[0xED9 ^ 0xFA9] = 0xFEB ^ 0xFA9;
        H.E[0x9C69 ^ 0x9C82] = 0xFFFF637E ^ 0x9C82;
        H.E[0x8A8F ^ 0x8BCF] = 0x8BDB ^ 0x8BCF;
        H.E[0x669D ^ 0x67CE] = 0xFFFF9869 ^ 0x67CE;
        H.E[0x10E0B ^ 0x10E46] = 0xFFFEF1F2 ^ 0x10E46;
        H.E[0x2894 ^ 0x286D] = 0xFFFFD7AF ^ 0x286D;
        H.E[0xB1CF ^ 0xB0A0] = 0xFFB0CB ^ 0xB0A0;
        H.E[0xCE2E ^ 0xCE18] = 0xFFFF31CC ^ 0xCE18;
        H.E[0x1EF9 ^ 0x1E62] = 0x1E55 ^ 0x1E62;
        H.E[0x40A8 ^ 0x41D3] = 0x4114 ^ 0x41D3;
        H.E[0x2981 ^ 0x28B7] = 0x28C5 ^ 0x28B7;
        H.E[0x9AC5 ^ 0x9AE0] = 0x9A82 ^ 0x9AE0;
        H.E[0xAA86 ^ 0xABC3] = 0xABEE ^ 0xABC3;
        H.E[0xD319 ^ 0xD307] = 0xD311 ^ 0xD307;
        H.E[0x5054 ^ 0x5017] = 0xFFFFAFD3 ^ 0x5017;
        H.E[0x6AB3 ^ 0x6A74] = 0xFFFF95B4 ^ 0x6A74;
        H.E[0x69E9 ^ 0x692A] = 0x6914 ^ 0x692A;
        H.E[0x86DC ^ 0x8795] = 0xFFFF7809 ^ 0x8795;
        H.E[0x4627 ^ 0x470D] = 0xFFFFB8BC ^ 0x470D;
        H.E[0xDC42 ^ 0xDCC8] = 0xFFFF2318 ^ 0xDCC8;
        H.E[0x6753 ^ 0x6642] = 0x661E ^ 0x6642;
        H.E[0xF3C0 ^ 0xF301] = 0xCA7 ^ 0xF301;
        H.E[0xA777 ^ 0xA775] = 0xFFFF58AD ^ 0xA775;
        H.E[0x962F ^ 0x96A3] = 0xFFFF6915 ^ 0x96A3;
        H.E[0x17F3 ^ 0x17A0] = 0x17A1 ^ 0x17A0;
        H.E[0xE7D3 ^ 0xE77D] = 0xE72C ^ 0xE77D;
        H.E[0xE1E1 ^ 0xE085] = 0xE0F2 ^ 0xE085;
        H.E[0x993C ^ 0x99DA] = 0xFFFF665E ^ 0x99DA;
        H.E[0x6DA4 ^ 0x6D38] = 0x6D21 ^ 0x6D38;
        H.E[0x3E7E ^ 0x3E67] = 0x3E5E ^ 0x3E67;
        H.E[0x7444 ^ 0x757D] = 0xFF750E ^ 0x757D;
        H.E[0x624E ^ 0x6358] = 0x630B ^ 0x6358;
        H.E[0x819C ^ 0x81B5] = 0x819D ^ 0x81B5;
        H.E[0x2371 ^ 0x233E] = 0xFFFFDCC8 ^ 0x233E;
        H.E[0x5728 ^ 0x57DE] = 0x57E7 ^ 0x57DE;
        H.E[0xBF78 ^ 0xBE11] = 0xFFFF41F6 ^ 0xBE11;
        H.E[0x6415 ^ 0x6487] = 0x64D3 ^ 0x6487;
        H.E[0x101D2 ^ 0x101A1] = 0x10196 ^ 0x101A1;
        H.E[0x2FFD ^ 0x2F32] = 0x2F34 ^ 0x2F32;
        H.E[0xFDAC ^ 0xFCE0] = 0xFFFF0371 ^ 0xFCE0;
        H.E[0x4EE ^ 0x4DB] = 0xFFFFFB59 ^ 0x4DB;
        H.E[0x3879 ^ 0x397A] = 0xFFFFC62C ^ 0x397A;
        H.E[0x4A86 ^ 0x4B07] = 0xFF4B5E ^ 0x4B07;
        H.E[0x3B21 ^ 0x3B69] = 0x3B7F ^ 0x3B69;
        H.E[0xAF18 ^ 0xAF11] = 0xFFFF50D3 ^ 0xAF11;
        H.E[0x7D95 ^ 0x7D5D] = 0x7D7B ^ 0x7D5D;
        H.E[0xF9E3 ^ 0xF9C5] = 0xF9DE ^ 0xF9C5;
        H.E[0x449F ^ 0x44FF] = 0x7B32 ^ 0x44FF;
        H.E[0x823B ^ 0x8238] = 0x824A ^ 0x8238;
        H.E[0xC702 ^ 0xC757] = 0xC755 ^ 0xC757;
        H.E[0x109A7 ^ 0x109A7] = 0x109B8 ^ 0x109A7;
        H.E[0x1584 ^ 0x14B8] = 0x14C3 ^ 0x14B8;
        H.E[0xE28A ^ 0xE264] = 0x3B1DCB ^ 0xE264;
        H.E[0x28B4 ^ 0x280A] = 0xFFFFD799 ^ 0x280A;
        H.E[0xFDA ^ 0xF62] = 0xF191 ^ 0xF62;
        H.E[0x82CF ^ 0x82A5] = 0x82AA ^ 0x82A5;
        H.E[0x7B8C ^ 0x7AB3] = 0xFFFF8506 ^ 0x7AB3;
        H.E[0xA186 ^ 0xA15C] = 0xFFFF5EE9 ^ 0xA15C;
        H.E[0xF688 ^ 0xF6CD] = 0xF6C1 ^ 0xF6CD;
        H.E[0x2E26 ^ 0x2F4E] = 0xFFFFD0AE ^ 0x2F4E;
        H.E[0x2831 ^ 0x295D] = 0xFFFFD6DD ^ 0x295D;
        H.E[0x34CF ^ 0x3457] = 0xFFFFCBE8 ^ 0x3457;
        H.E[0x87D3 ^ 0x87C1] = 0x8782 ^ 0x87C1;
        H.E[0xBF3A ^ 0xBE37] = 0xFFFF418C ^ 0xBE37;
        H.E[0x647C ^ 0x6493] = 0xFFFF9B60 ^ 0x6493;
        H.E[0xB0E2 ^ 0xB1AF] = 0xFFFF4E3F ^ 0xB1AF;
        H.E[0xD72E ^ 0xD7B0] = 0xFFFF284D ^ 0xD7B0;
        H.E[0xB840 ^ 0xB962] = 0xFFFF46D1 ^ 0xB962;
        H.E[0x831F ^ 0x838E] = 0x83C7 ^ 0x838E;
        H.E[0xA722 ^ 0xA76B] = 0xA719 ^ 0xA76B;
        H.E[0x31E2 ^ 0x3062] = 0xFFFFCFA7 ^ 0x3062;
        H.E[0xB466 ^ 0xB4CE] = 0xFFFF4B56 ^ 0xB4CE;
        H.E[0xD469 ^ 0xD4CC] = 0xFFFF2B29 ^ 0xD4CC;
        H.E[0x14DF ^ 0x15C3] = 0xFFFFEA0D ^ 0x15C3;
        H.E[0xF272 ^ 0xF333] = 0xFFFF0CAA ^ 0xF333;
        H.E[0x10F5F ^ 0x10E55] = 0xFFFEF1D8 ^ 0x10E55;
        H.E[0x104B2 ^ 0x10586] = 0x105A3 ^ 0x10586;
        H.E[0xFAB7 ^ 0xFA79] = 0xFA3A ^ 0xFA79;
        H.E[0xCD25 ^ 0xCC5A] = 0xCC43 ^ 0xCC5A;
        H.E[0x4813 ^ 0x4855] = 0x4865 ^ 0x4855;
        H.E[0x3C11 ^ 0x3CC6] = 0x3C97 ^ 0x3CC6;
        H.E[0x8001 ^ 0x811E] = 0x8149 ^ 0x811E;
        H.E[0xEA1 ^ 0xEFE] = 0x7DD5 ^ 0xEFE;
        H.E[0x6FFB ^ 0x6F73] = 0xFFFF90F4 ^ 0x6F73;
        H.E[0x1076B ^ 0x1062D] = 0xFFFEF9F3 ^ 0x1062D;
        H.E[0xFABD ^ 0xFAD8] = 0xFAE1 ^ 0xFAD8;
        H.E[0x102F2 ^ 0x1029C] = 0xFFFEFD37 ^ 0x1029C;
        H.E[0xE81B ^ 0xE8D1] = 0xFFF3E823 ^ 0xE8D1;
        H.E[0x3FE9 ^ 0x3FB0] = 0x5AE2 ^ 0x3FB0;
        H.E[0x99FA ^ 0x98AB] = 0x984B ^ 0x98AB;
        H.E[0xBCEA ^ 0xBD88] = 0xFFFF426C ^ 0xBD88;
        H.E[0x4AE3 ^ 0x4AF5] = 0x4AE5 ^ 0x4AF5;
        H.E[0x95A8 ^ 0x94FA] = 0x9489 ^ 0x94FA;
        H.E[0x5E11 ^ 0x5E6D] = 0xFFFFA1E2 ^ 0x5E6D;
        H.E[0x9392 ^ 0x9388] = 0xFFFF6C1B ^ 0x9388;
        H.E[0xCCBB ^ 0xCDB0] = 0xCDEE ^ 0xCDB0;
        H.E[0x100ED ^ 0x10010] = 0x10068 ^ 0x10010;
        H.E[0xC059 ^ 0xC0DE] = 0xFFFF3F7F ^ 0xC0DE;
        H.E[0x49A0 ^ 0x48B7] = 0x48CB ^ 0x48B7;
        H.E[0xD93B ^ 0xD99F] = 0xFFFF2643 ^ 0xD99F;
        H.E[0x8AC2 ^ 0x8BCD] = 0xFFFF7463 ^ 0x8BCD;
        H.E[0xC32E ^ 0xC310] = 0xFFFF3C80 ^ 0xC310;
        H.E[0x36AE ^ 0x36EE] = 0xFFFFC90B ^ 0x36EE;
        H.E[0xB330 ^ 0xB357] = 0xB3EE ^ 0xB357;
        H.E[0xB716 ^ 0xB725] = 0xFFFF48A9 ^ 0xB725;
        H.E[0x9895 ^ 0x9851] = 0xFFFF6728 ^ 0x9851;
        H.E[0x4C1F ^ 0x4C3C] = 0x4C13 ^ 0x4C3C;
        H.E[0x436A ^ 0x4328] = 0x4329 ^ 0x4328;
        H.E[0x10DA0 ^ 0x10D01] = 0xFFFEF29B ^ 0x10D01;
        H.E[0x5903 ^ 0x5866] = 0xFFFFA793 ^ 0x5866;
        H.E[0x7837 ^ 0x797C] = 0xFF797D ^ 0x797C;
        H.E[0x85BD ^ 0x84F9] = 0xFFFF7B2B ^ 0x84F9;
        H.E[0xAD1D ^ 0xAD82] = 0xFFFF527A ^ 0xAD82;
        H.E[0x8A56 ^ 0x8B4E] = 0x8B44 ^ 0x8B4E;
        H.E[0xDFA4 ^ 0xDFEA] = 0xDFBC ^ 0xDFEA;
        H.E[0xD1BB ^ 0xD128] = 0xFFFF2EFD ^ 0xD128;
        H.E[0x1846 ^ 0x1930] = 0xFFFFE69B ^ 0x1930;
        H.E[0xBE57 ^ 0xBFD8] = 0xFFFF406F ^ 0xBFD8;
        H.E[0x457C ^ 0x45B7] = 0xFFFFBA7A ^ 0x45B7;
        H.E[0x9789 ^ 0x96A9] = 0x96D4 ^ 0x96A9;
        H.E[0x15B9 ^ 0x14E0] = 0xFFFFEB20 ^ 0x14E0;
        H.E[0x4A5 ^ 0x498] = 0xFFFFFB16 ^ 0x498;
        H.E[0xC3CE ^ 0xC24A] = 0xC24A ^ 0xC24A;
        H.E[0x6081 ^ 0x6076] = 0x479FFB ^ 0x6076;
        H.E[0x106BE ^ 0x1062E] = 0xFFFEF989 ^ 0x1062E;
        H.E[0x100D7 ^ 0x10194] = 0x101F1 ^ 0x10194;
        H.E[0xBE89 ^ 0xBEF4] = 0xFFFF413D ^ 0xBEF4;
        H.E[0x9E65 ^ 0x9E2F] = 0xFFFF61B3 ^ 0x9E2F;
        H.E[0x8D35 ^ 0x8DA1] = 0x8D82 ^ 0x8DA1;
        H.E[0x55DC ^ 0x555E] = 0x5558 ^ 0x555E;
        H.E[0x9A54 ^ 0x9A37] = 0x9A37 ^ 0x9A37;
        H.E[0x5B58 ^ 0x5A03] = 0xFFFFA5CE ^ 0x5A03;
        H.E[0x6D02 ^ 0x6C7A] = 0xFE931F ^ 0x6C7A;
        H.E[0xAA43 ^ 0xAB4F] = 0xAB22 ^ 0xAB4F;
        H.E[0x8201 ^ 0x8320] = 0xFFFF7CAF ^ 0x8320;
        H.E[0xAA4A ^ 0xAB79] = 0xFFFF541D ^ 0xAB79;
        H.E[0x54B3 ^ 0x55D0] = 0x555F ^ 0x55D0;
        H.E[0xD369 ^ 0xD254] = 0xFFFF2DF8 ^ 0xD254;
        H.E[0xF099 ^ 0xF0AD] = 0xFFFF0F47 ^ 0xF0AD;
        H.E[0x19E8 ^ 0x192D] = 0x1958 ^ 0x192D;
        H.E[0x448D ^ 0x444B] = 0xFFFFBBA1 ^ 0x444B;
        H.E[0xE49C ^ 0xE44D] = 0xE41C ^ 0xE44D;
        H.E[0xF9E9 ^ 0xF924] = 0xF964 ^ 0xF924;
        H.E[0x615A ^ 0x613B] = 0xD174 ^ 0x613B;
        H.E[0xE128 ^ 0xE076] = 0xFFFF1F9C ^ 0xE076;
        H.E[0x5828 ^ 0x593C] = 0xFFFFA6FD ^ 0x593C;
        H.E[0x4DF7 ^ 0x4D4C] = 0xFFFFB2DE ^ 0x4D4C;
        H.E[0x605B ^ 0x60D2] = 0xFFFF9F45 ^ 0x60D2;
        H.E[0xB1D2 ^ 0xB1BB] = 0xFFFF4E1B ^ 0xB1BB;
        H.E[0x45B8 ^ 0x4501] = 0x4517 ^ 0x4501;
        H.E[0x3CAC ^ 0x3C95] = 0xFFFFC3F7 ^ 0x3C95;
        H.E[0x5B0C ^ 0x5BA6] = 0xFFFFA47B ^ 0x5BA6;
        H.E[0x7078 ^ 0x704F] = 0xFFFF8FD4 ^ 0x704F;
        H.E[0x6112 ^ 0x609E] = 0xFFFF9F49 ^ 0x609E;
        H.E[0xB6B0 ^ 0xB68A] = 0xFFFF4938 ^ 0xB68A;
        H.E[0xBA2E ^ 0xBA1F] = 0xFFFF45B2 ^ 0xBA1F;
        H.E[0x6104 ^ 0x61B4] = 0x61E1 ^ 0x61B4;
        H.E[0xF9A6 ^ 0xF891] = 0xFFFF073F ^ 0xF891;
        H.E[0x711D ^ 0x710E] = 0x711A ^ 0x710E;
        H.E[0x837D ^ 0x8237] = 0xFFFF7DC1 ^ 0x8237;
        H.E[0x38A1 ^ 0x38A5] = 0x38AE ^ 0x38A5;
        H.E[0x9199 ^ 0x91EB] = 0xFFFF6E73 ^ 0x91EB;
        H.E[0x635D ^ 0x63D6] = 0x63C5 ^ 0x63D6;
        H.E[0x1F46 ^ 0x1E4E] = 0x1E12 ^ 0x1E4E;
        H.E[0x36B0 ^ 0x36BC] = 0xFFFFC970 ^ 0x36BC;
        H.E[0xDA53 ^ 0xDA8B] = 0xFFFF252A ^ 0xDA8B;
        H.E[0xF61A ^ 0xF660] = 0xF615 ^ 0xF660;
        H.E[0xA3B1 ^ 0xA393] = 0xA3E8 ^ 0xA393;
        H.E[0xC24D ^ 0xC2C9] = 0xC291 ^ 0xC2C9;
        H.E[0x79B2 ^ 0x79B7] = 0x79E8 ^ 0x79B7;
        H.E[0x5450 ^ 0x5445] = 0x541D ^ 0x5445;
        H.E[0xA93 ^ 0xA8B] = 0xFFFFF567 ^ 0xA8B;
        H.E[0xA3DB ^ 0xA3F5] = 0xA3CC ^ 0xA3F5;
        H.E[0x19F0 ^ 0x1969] = 0xFFFFE6C5 ^ 0x1969;
        H.E[0x59E4 ^ 0x5947] = 0xFFFFA6BC ^ 0x5947;
        H.E[0x44CA ^ 0x4434] = 0xFFFFBBB2 ^ 0x4434;
        H.E[0xBFB0 ^ 0xBEFE] = 0xBEBE ^ 0xBEFE;
        H.E[0x19F3 ^ 0x1941] = 0xFFFFE6C3 ^ 0x1941;
        H.E[0xAC61 ^ 0xAC3F] = 0xE4A5 ^ 0xAC3F;
        H.E[0x2321 ^ 0x238A] = 0x2386 ^ 0x238A;
        H.E[0x10FB7 ^ 0x10ECA] = 0xFFFEF16A ^ 0x10ECA;
        H.E[0x8FC3 ^ 0x8E4B] = 0xFFFF7190 ^ 0x8E4B;
        H.E[0x616E ^ 0x61C2] = 0xFFFF9E73 ^ 0x61C2;
        H.E[0x9AF ^ 0x8AE] = 0xFFFFF727 ^ 0x8AE;
        H.E[0x2D36 ^ 0x2DA0] = 0xFFFFD20B ^ 0x2DA0;
        H.E[0x99AE ^ 0x9983] = 0xFFFF66E1 ^ 0x9983;
        H.E[0x9EE3 ^ 0x9E93] = 0x9EA6 ^ 0x9E93;
        H.E[0x927F ^ 0x9292] = 0xFFFF6D44 ^ 0x9292;
        H.E[0x96A ^ 0x989] = 0xFFFFF611 ^ 0x989;
        H.E[0x88A0 ^ 0x89F4] = 0xFF89EA ^ 0x89F4;
        H.E[0xCA82 ^ 0xCB9F] = 0xCB80 ^ 0xCB9F;
        H.E[0x10A3F ^ 0x10B16] = 0xFFFEF4DC ^ 0x10B16;
        H.E[0x6AD8 ^ 0x6BA4] = 0x6BF8 ^ 0x6BA4;
        H.E[0xFE22 ^ 0xFEFB] = 0xFE8A ^ 0xFEFB;
        H.E[0x7304 ^ 0x730A] = 0xFFFF8C96 ^ 0x730A;
        H.E[0xC07E ^ 0xC0BC] = 0xFFFF3F69 ^ 0xC0BC;
        H.E[0xC004 ^ 0xC13C] = 0xFFFF3EF6 ^ 0xC13C;
        H.E[0x1042D ^ 0x1045A] = 0x1043F ^ 0x1045A;
        H.E[0xCD0C ^ 0xCD20] = 0xFFFF32D0 ^ 0xCD20;
        H.E[0xD37D ^ 0xD3A9] = 0xD39C ^ 0xD3A9;
        H.E[0x6594 ^ 0x6580] = 0xFFFF9A29 ^ 0x6580;
        H.E[0x3748 ^ 0x3762] = 0xFFFFC8D0 ^ 0x3762;
        H.E[0x851A ^ 0x85FB] = 0xFFFF7A11 ^ 0x85FB;
        H.E[0x81BD ^ 0x8110] = 0x8110 ^ 0x8110;
        H.E[0x74B3 ^ 0x759E] = 0xFFFF8AB2 ^ 0x759E;
        H.E[0xD12A ^ 0xD1C6] = 0xD1CF ^ 0xD1C6;
        H.E[0x9FCB ^ 0x9F6B] = 0xFFFF6088 ^ 0x9F6B;
        H.E[0x68F9 ^ 0x69E2] = 0x69EF ^ 0x69E2;
        H.E[0x86B5 ^ 0x861C] = 0xFFFF79CE ^ 0x861C;
        H.E[0x2378 ^ 0x232A] = 0x232A ^ 0x232A;
        H.E[0x1E9D ^ 0x1E1B] = 0x1E4C ^ 0x1E1B;
        H.E[0x6E48 ^ 0x6F3F] = 0xFFFF90AE ^ 0x6F3F;
        H.E[0xB21F ^ 0xB316] = 0xFFA1B38A ^ 0xB316;
        H.E[0xF375 ^ 0xF317] = 0x3668 ^ 0xF317;
        H.E[0xE527 ^ 0xE507] = 0xE51B ^ 0xE507;
        H.E[0xED1C ^ 0xEDD0] = 0xEDDB ^ 0xEDD0;
        H.E[0xDE6C ^ 0xDFEB] = 0xDFD1 ^ 0xDFEB;
        H.E[0x6692 ^ 0x664D] = 0xFFFF99E4 ^ 0x664D;
        H.E[0x8EC6 ^ 0x8F45] = 0xFFFF70EE ^ 0x8F45;
        H.E[0x304 ^ 0x359] = 0x9D90 ^ 0x359;
        H.E[0x2F73 ^ 0x2E2E] = 0xFF2E0A ^ 0x2E2E;
        H.E[0x7EDE ^ 0x7EB3] = 0x7E7C ^ 0x7EB3;
        H.E[0x72A0 ^ 0x722D] = 0xFFFF8DA8 ^ 0x722D;
        H.E[0x4372 ^ 0x424C] = 0x426F ^ 0x424C;
        H.E[0xFE22 ^ 0xFF18] = 0xFFFF00F0 ^ 0xFF18;
        H.E[0x10763 ^ 0x10764] = 0x10775 ^ 0x10764;
        H.E[0x972F ^ 0x9636] = 0x9641 ^ 0x9636;
        H.E[0x8C2B ^ 0x8D5A] = 0xFFFF728D ^ 0x8D5A;
        H.E[0x6AC4 ^ 0x6B91] = 0xFFFF943F ^ 0x6B91;
        H.E[0xC0CF ^ 0xC041] = 0xFFFF3F8D ^ 0xC041;
        H.E[0x2F45 ^ 0x2E02] = 0x2E10 ^ 0x2E02;
        H.E[0xC7D0 ^ 0xC7F1] = 0xC77B ^ 0xC7F1;
        H.E[0x10779 ^ 0x10642] = 0xFFFEF9E7 ^ 0x10642;
        H.E[0xAA84 ^ 0xAA37] = 0xAA22 ^ 0xAA37;
        H.E[0x23AA ^ 0x23F6] = 0x8C3E ^ 0x23F6;
        H.E[0xC140 ^ 0xC02A] = 0xFFFF3FF6 ^ 0xC02A;
        H.E[0x22E3 ^ 0x229C] = 0x22B3 ^ 0x229C;
        H.E[0xD42A ^ 0xD47C] = 0xD47C ^ 0xD47C;
        H.E[0x2CCF ^ 0x2DC9] = 0x2DE6 ^ 0x2DC9;
        H.E[0x267F ^ 0x2663] = 0x2648 ^ 0x2663;
        H.E[0x61C0 ^ 0x61BE] = 0xFFFF9E18 ^ 0x61BE;
        H.E[0xCA12 ^ 0xCB1C] = 0xFFFF34F8 ^ 0xCB1C;
        H.E[0x6BAC ^ 0x6A29] = 0xFFFF9586 ^ 0x6A29;
        H.E[0xC5A2 ^ 0xC579] = 0xC524 ^ 0xC579;
        H.E[0xF865 ^ 0xF835] = 0xF819 ^ 0xF835;
        H.E[0x729B ^ 0x7214] = 0x7251 ^ 0x7214;
        H.E[0x7838 ^ 0x7941] = 0x793D ^ 0x7941;
        H.E[0x67D ^ 0x642] = 0xFFFFF99C ^ 0x642;
        H.E[0xBBCD ^ 0xBAD8] = 0xFFFF451F ^ 0xBAD8;
        H.E[0x5E53 ^ 0x5EA2] = 0xFFFFA1FA ^ 0x5EA2;
        H.E[0xB19A ^ 0xB018] = 0xFFFF4FE4 ^ 0xB018;
        H.E[0xFED7 ^ 0xFE6D] = 0xFFFF01F5 ^ 0xFE6D;
        H.E[0xC094 ^ 0xC1E0] = 0xFFFF3E57 ^ 0xC1E0;
        H.E[0x690A ^ 0x69F9] = 0x6983 ^ 0x69F9;
        H.E[0x7C51 ^ 0x7C46] = 0x7C2E ^ 0x7C46;
        H.E[0x19E ^ 0x18] = 0x45 ^ 0x18;
        H.E[0x109D6 ^ 0x10967] = 0x1094B ^ 0x10967;
        H.E[0xD568 ^ 0xD5DC] = 0xFFFF2A49 ^ 0xD5DC;
        H.E[0xFB51 ^ 0xFBCB] = 0xFBC9 ^ 0xFBCB;
        H.E[0x5A3E ^ 0x5B71] = 0xFFFFA4B5 ^ 0x5B71;
        H.E[0xC905 ^ 0xC9E0] = 0xFFD0C889 ^ 0xC9E0;
        H.E[0x134C ^ 0x1344] = 0x135D ^ 0x1344;
        H.E[0x10162 ^ 0x10018] = 0xFFFEFFF9 ^ 0x10018;
        H.E[0xB74D ^ 0xB66A] = 0xFF0049B7 ^ 0xB66A;
        H.E[0xDB74 ^ 0xDA5F] = 0xFFFF25B5 ^ 0xDA5F;
        H.E[0xDC71 ^ 0xDCC4] = 0xDCC5 ^ 0xDCC4;
        H.E[0x235 ^ 0x211] = 0xFFFFFDC8 ^ 0x211;
        H.E[0xBCBB ^ 0xBCEF] = 0xBCEF ^ 0xBCEF;
        H.E[0xE13B ^ 0xE134] = 0xE1F1 ^ 0xE134;
        H.E[0x213 ^ 0x2FA] = 0xFFFFFD60 ^ 0x2FA;
        H.E[0x4545 ^ 0x453D] = 0xFFFFBAC5 ^ 0x453D;
        H.E[0x7A68 ^ 0x7A63] = 0x7A3E ^ 0x7A63;
        H.E[0x8DE1 ^ 0x8DF1] = 0xFFFF7248 ^ 0x8DF1;
        H.E[0x6BB7 ^ 0x6B43] = 0x6B51 ^ 0x6B43;
        H.E[0xB326 ^ 0xB226] = 0xFFADB275 ^ 0xB226;
        H.E[0xA5B2 ^ 0xA4CC] = 0xFFFF5B2F ^ 0xA4CC;
        H.E[0x2CCA ^ 0x2DAC] = 0xFED27C ^ 0x2DAC;
        H.E[0x2687 ^ 0x26E3] = 0xFFFFD90C ^ 0x26E3;
        H.E[0xD1D5 ^ 0xD0C7] = 0xFF95D0A8 ^ 0xD0C7;
        H.E[0x44DA ^ 0x45DE] = 0x4598 ^ 0x45DE;
        H.E[0xB4D4 ^ 0xB4A1] = 0xB4AE ^ 0xB4A1;
        H.E[0x44D3 ^ 0x440D] = 0x4410 ^ 0x440D;
        H.E[0xF417 ^ 0xF406] = 0xF46E ^ 0xF406;
        H.E[0x4FA7 ^ 0x4EC9] = 0xFFFFB10B ^ 0x4EC9;
        H.E[0xAD78 ^ 0xADAD] = 0xFFFF5254 ^ 0xADAD;
        H.E[0x109C7 ^ 0x108A7] = 0xFFFEF75F ^ 0x108A7;
        H.E[0x10C7D ^ 0x10C9D] = 0x10CE9 ^ 0x10C9D;
        H.E[0xB143 ^ 0xB178] = 0xFFFF4EE8 ^ 0xB178;
        H.E[0x9221 ^ 0x9279] = 0x93D5 ^ 0x9279;
        H.E[0x295 ^ 0x2A5] = 0x26E ^ 0x2A5;
        H.E[0x18B6 ^ 0x1983] = 0xFFFFE605 ^ 0x1983;
        H.E[0xEEFE ^ 0xEFA1] = 0xFFFF1053 ^ 0xEFA1;
        H.E[0x1ADD ^ 0x1A21] = 0x1A2E ^ 0x1A21;
        H.E[0x7E87 ^ 0x7E55] = 0xFFFF81E3 ^ 0x7E55;
        H.E[0xF510 ^ 0xF547] = 0xF547 ^ 0xF547;
        H.E[0x155D ^ 0x15DC] = 0x15E1 ^ 0x15DC;
        H.E[0x69D8 ^ 0x68F0] = 0x68E3 ^ 0x68F0;
        H.E[0x3421 ^ 0x3447] = 0x342D ^ 0x3447;
        H.E[0xA349 ^ 0xA2C0] = 0xFFFF5D09 ^ 0xA2C0;
        H.E[0xB6DC ^ 0xB624] = 0xB631 ^ 0xB624;
        H.E[0x1CB3 ^ 0x1C8F] = 0x1CB1 ^ 0x1C8F;
        H.E[0xE805 ^ 0xE85F] = 0x1BC ^ 0xE85F;
        H.E[0xAC7 ^ 0xA38] = 0xFFFFF5CA ^ 0xA38;
        H.E[0x772C ^ 0x7791] = 0x77AB ^ 0x7791;
        H.E[0x6727 ^ 0x671F] = 0xFFFF98F8 ^ 0x671F;
        H.E[0xE183 ^ 0xE008] = 0xE06F ^ 0xE008;
        H.E[0xEDC6 ^ 0xEC8E] = 0xFFFF134A ^ 0xEC8E;
        H.E[0x3074 ^ 0x305B] = 0x3035 ^ 0x305B;
        H.E[0xF1AE ^ 0xF154] = 0xF15D ^ 0xF154;
        H.E[0x3721 ^ 0x3640] = 0x3654 ^ 0x3640;
        H.E[0xD1A ^ 0xDC7] = 0xFFFFF211 ^ 0xDC7;
        H.E[0x353F ^ 0x340F] = 0xFF34CE ^ 0x340F;
        H.E[0x3E3D ^ 0x3EED] = 0xFFFFC101 ^ 0x3EED;
        H.E[0x4749 ^ 0x470E] = 0x472B ^ 0x470E;
        H.E[0x2C88 ^ 0x2C97] = 0xFFFFD34D ^ 0x2C97;
        H.E[0x419 ^ 0x4A5] = 0xFFFFFB6C ^ 0x4A5;
        H.E[0x10DF1 ^ 0x10DF0] = 0x10DD3 ^ 0x10DF0;
        H.E[0x9AC0 ^ 0x9A55] = 0x9A07 ^ 0x9A55;
        H.E[0x96AF ^ 0x9654] = 0xFFFF69A6 ^ 0x9654;
        H.E[0xCA04 ^ 0xCA4F] = 0xCA2F ^ 0xCA4F;
        H.E[0x84CB ^ 0x8593] = 0xFFFF7A55 ^ 0x8593;
        H.E[0x967F ^ 0x960B] = 0x9613 ^ 0x960B;
        H.E[0xAB0C ^ 0xAA22] = 0xFFFF559E ^ 0xAA22;
        H.E[0xE358 ^ 0xE27C] = 0xE257 ^ 0xE27C;
        H.E[0x9247 ^ 0x92AD] = 0xFFFF6D4E ^ 0x92AD;
        H.E[0x1FE2 ^ 0x1FC5] = 0x1FD7 ^ 0x1FC5;
        H.E[0xABD1 ^ 0xAB36] = 0xAB5B ^ 0xAB36;
        H.E[0xF867 ^ 0xF883] = 0xF8EC ^ 0xF883;
        H.E[0xA7FC ^ 0xA78D] = 0xFFFF5800 ^ 0xA78D;
        H.E[0x10CF1 ^ 0x10CAA] = 0x1F30F ^ 0x10CAA;
        H.E[0x8B70 ^ 0x8B1B] = 0xFFFF74BE ^ 0x8B1B;
        H.E[0xB1C3 ^ 0xB11F] = 0xFFDCB1BB ^ 0xB11F;
        H.E[0xB25 ^ 0xA67] = 0xFF010A50 ^ 0xA67;
        H.E[0x3CA4 ^ 0x3DF3] = 0x3DFE ^ 0x3DF3;
        H.E[0x6ABA ^ 0x6B9F] = 0xFFFF9462 ^ 0x6B9F;
        H.E[0x6C02 ^ 0x6CB4] = 0xFFFF9318 ^ 0x6CB4;
        H.E[0x2E5A ^ 0x2EA8] = 0xFFFFD173 ^ 0x2EA8;
        H.E[0xB1E5 ^ 0xB15A] = 0xB154 ^ 0xB15A;
        H.E[0x3CD0 ^ 0x3C20] = 0x3C7D ^ 0x3C20;
        H.E[0x440F ^ 0x4582] = 0xFFFFBA68 ^ 0x4582;
        H.E[0x81FD ^ 0x81B9] = 0x8185 ^ 0x81B9;
        H.E[0xBC47 ^ 0xBC28] = 0xFFFF43AF ^ 0xBC28;
        H.E[0x7F45 ^ 0x7FA7] = 0x7F5B ^ 0x7FA7;
        H.E[0xE07B ^ 0xE0A8] = 0xFFE7E043 ^ 0xE0A8;
        H.E[0xF54C ^ 0xF564] = 0xF554 ^ 0xF564;
        H.E[0x10947 ^ 0x10987] = 0xFFFEF616 ^ 0x10987;
        H.E[0x9059 ^ 0x9090] = 0x90FC ^ 0x9090;
        H.E[0x39D9 ^ 0x3883] = 0xFFFFC71D ^ 0x3883;
        H.E[0x1618 ^ 0x1734] = 0xFFFFE8AD ^ 0x1734;
        H.E[0xAA56 ^ 0xAB3B] = 0xAB79 ^ 0xAB3B;
        H.E[0xEC90 ^ 0xEC96] = 0xEC81 ^ 0xEC96;
        H.E[0x37E2 ^ 0x37E8] = 0x3794 ^ 0x37E8;
        H.E[0xC927 ^ 0xC804] = 0xC839 ^ 0xC804;
        H.E[0xA1A ^ 0xB09] = 0xFFFFF4D5 ^ 0xB09;
        H.E[0x32B0 ^ 0x329B] = 0x32EA ^ 0x329B;
        H.E[0x55A9 ^ 0x5541] = 0xFFFFAAFE ^ 0x5541;
        H.E[0xA97E ^ 0xA98B] = 0xFFFF5647 ^ 0xA98B;
        H.E[0xA969 ^ 0xA8E7] = 0xFFFF573D ^ 0xA8E7;
        H.E[0x4DE5 ^ 0x4C6F] = 0xFEB31F ^ 0x4C6F;
        H.E[0x9D20 ^ 0x9C47] = 0x9C77 ^ 0x9C47;
        H.E[0xDF5B ^ 0xDE4B] = 0xDE42 ^ 0xDE4B;
        H.E[0x5B3F ^ 0x5A0E] = 0xFFFFA5B6 ^ 0x5A0E;
        H.E[0x85F9 ^ 0x852F] = 0x8599 ^ 0x852F;
        H.E[0x6D18 ^ 0x6D74] = 0xFFFF92E0 ^ 0x6D74;
        H.E[0x7250 ^ 0x733B] = 0x737D ^ 0x733B;
        H.E[0xC33F ^ 0xC210] = 0xFFFF3D91 ^ 0xC210;
        H.E[0xC6A8 ^ 0xC69A] = 0xFFFF3936 ^ 0xC69A;
        H.E[0x6CF4 ^ 0x6DC6] = 0xFFFF9241 ^ 0x6DC6;
        H.E[0xB029 ^ 0xB041] = 0xB078 ^ 0xB041;
        H.E[0x90C4 ^ 0x9095] = 0x9096 ^ 0x9095;
        H.E[0x9979 ^ 0x987B] = 0xFFFF67DB ^ 0x987B;
        H.E[0xA2D4 ^ 0xA254] = 0xFFFF5DBA ^ 0xA254;
        H.E[0x4A69 ^ 0x4B1B] = 0xFFFFB4B1 ^ 0x4B1B;
        H.E[0x4809 ^ 0x4848] = 0xFFFFB7EB ^ 0x4848;
        H.E[0xEA87 ^ 0xEA9C] = 0xEAAE ^ 0xEA9C;
        H.E[0xDB14 ^ 0xDA0E] = 0xDA73 ^ 0xDA0E;
        H.E[0x522E ^ 0x5372] = 0xFFFFACA0 ^ 0x5372;
        H.E[0x5843 ^ 0x583A] = 0x583C ^ 0x583A;
        H.E[0x1876 ^ 0x18D9] = 0xE7CD ^ 0x18D9;
        H.E[0xB25F ^ 0xB229] = 0xB277 ^ 0xB229;
        H.E[0x22A5 ^ 0x2202] = 0x2254 ^ 0x2202;
        H.E[0x107A8 ^ 0x106FE] = 0x106CA ^ 0x106FE;
        H.E[0x10386 ^ 0x102F5] = 0x102E6 ^ 0x102F5;
        H.E[0x1AD0 ^ 0x1A4D] = 0x1A45 ^ 0x1A4D;
        H.E[0x2573 ^ 0x25D1] = 0xFFFFDA66 ^ 0x25D1;
        H.E[0xC8 ^ 0xD5] = 0xD8 ^ 0xD5;
        H.E[0x486C ^ 0x4919] = 0x4910 ^ 0x4919;
        H.E[0xAC72 ^ 0xAC3E] = 0xFFFF53C2 ^ 0xAC3E;
        H.E[0x522C ^ 0x529B] = 0x52F7 ^ 0x529B;
        H.E[0xD6E6 ^ 0xD640] = 0x28CB ^ 0xD640;
        H.E[0xCF8B ^ 0xCF08] = 0xFFFF30B6 ^ 0xCF08;
        H.E[0x10A74 ^ 0x10A0F] = 0xFFFEF5BE ^ 0x10A0F;
        H.E[0x29A6 ^ 0x2923] = 0xFFFFD6FB ^ 0x2923;
    }
}

