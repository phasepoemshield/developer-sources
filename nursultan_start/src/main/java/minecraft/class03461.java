/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00526
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01056
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03043
 *  minecraft.class03767
 *  minecraft.class04453
 *  minecraft.class05946
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06889
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07665
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class08152
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00526;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01056;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03043;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class03767;
import minecraft.class04453;
import minecraft.class05946;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07665;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class08152;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class03461
implements class07689,
FabricClientCommandSource {
    private final class01683 N;
    private final class06202 y;
    private int u = -1;
    private @Nullable CompletableFuture<Suggestions> i;
    private final Set<String> R = new HashSet<String>();
    private final class08152 M;

    public Collection<class07665> Q() {
        class07089 class070892 = (class07089)this.y.M_3;
        if (class070892 == null || class070892.N() != class07113.field_1332) {
            return super.Q();
        }
        class06889 class068892 = class070892.y();
        return Collections.singleton(new class07665(class03461.N(class068892.M), class03461.N(class068892.B), class03461.N(class068892.Z)));
    }

    public class03461(class01683 class016832, class06202 class062022, class08152 class081522) {
        this.N = class016832;
        this.y = class062022;
        this.M = class081522;
    }

    public Collection<String> b() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Collection)callbackInfoReturnable.getReturnValue();
        }
        ArrayList arrayList = Lists.newArrayList();
        for (class03458 class034582 : this.N.Z()) {
            arrayList.add(class034582.N().name());
        }
        return arrayList;
    }

    public Set<class05946<class07299>> n() {
        return this.N.b();
    }

    public class01042 t() {
        return this.N.j();
    }

    public Stream<class01894> v() {
        return this.y.Nr().L().stream();
    }

    public Collection<String> j() {
        return this.N.l().u();
    }

    public void N(class03043 class030432, List<String> list) {
        switch (class030432) {
            case field_39801: {
                this.R.addAll(list);
                break;
            }
            case field_39802: {
                list.forEach(this.R::remove);
                break;
            }
            case field_39803: {
                this.R.clear();
                this.R.addAll(list);
            }
        }
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue(this.R);
        }
    }

    public void N(int n, Suggestions suggestions) {
        if (n == this.u) {
            this.i.complete(suggestions);
            this.i = null;
            this.u = -1;
        }
    }

    public CompletableFuture<Suggestions> N(CommandContext<?> commandContext) {
        if (this.i != null) {
            this.i.cancel(false);
        }
        this.i = new CompletableFuture();
        int n = ++this.u;
        this.N.N((class00381)new class00526(n, commandContext.getInput()));
        return this.i;
    }

    private static String N(double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }

    private static String N(int n) {
        return Integer.toString(n);
    }

    public CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> class059462, class07666 class076662, SuggestionsBuilder suggestionsBuilder, CommandContext<?> commandContext) {
        return this.t().method_46759(class059462).map(class007512 -> {
            this.N((class01905)class007512, class076662, suggestionsBuilder);
            return suggestionsBuilder.buildFuture();
        }).orElseGet(() -> this.N(commandContext));
    }

    public class08152 N() {
        return this.M;
    }

    public class03767 G() {
        return this.N.G();
    }

    public Collection<class07665> Y() {
        class07089 class070892 = (class07089)this.y.M_3;
        if (class070892 == null || class070892.N() != class07113.field_1332) {
            return super.Y();
        }
        class07209 class072092 = ((class06183)class070892).u();
        return Collections.singleton(new class07665(class03461.N(class072092.method_10263()), class03461.N(class072092.method_10264()), class03461.N(class072092.method_10260())));
    }

    public Collection<String> ag_() {
        if ((class07089)this.y.M_3 != null && ((class07089)this.y.M_3).N() == class07113.field_1331) {
            return Collections.singleton(((class06145)((class07089)this.y.M_3)).L().method_5845());
        }
        return Collections.emptyList();
    }

    public Collection<String> af_() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Collection)callbackInfoReturnable.getReturnValue();
        }
        if (this.R.isEmpty()) {
            return this.b();
        }
        HashSet<String> hashSet = new HashSet<String>(this.b());
        hashSet.addAll(this.R);
        return hashSet;
    }

    public void sendError(class00392 class003922) {
        this.sendFeedback((class00392)class00392.i().y(class003922).N(class06541.field_1061));
    }

    public class03448 getWorld() {
        return (class03448)((Object)this.y.T_3);
    }

    public void sendFeedback(class00392 class003922) {
        ((class01056)this.y.i_6).i().N(class003922);
        this.y.NT().y(class003922);
    }

    public class06202 getClient() {
        return this.y;
    }

    public class04453 getPlayer() {
        return (class04453)this.y.T_4;
    }
}

