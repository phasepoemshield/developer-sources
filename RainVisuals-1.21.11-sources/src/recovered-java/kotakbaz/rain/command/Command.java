/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  net.minecraft.client.network.ClientCommandSource
 */
package kotakbaz.rain.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientCommandSource;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u062b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0004X\u0084D\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0019"}, d2={"Loxxxde/\u0627\u0647;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lnet/minecraft/class_637;", "builder", "", "execute", "(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)V", "Lcom/mojang/brigadier/CommandDispatcher;", "dispatcher", "register", "(Lcom/mojang/brigadier/CommandDispatcher;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "singleSuccess", "I", "getSingleSuccess", "()I", "Companion", "rain-visuals"})
public class Command {
    @NotNull
    private final String name;
    private final int singleSuccess;
    @NotNull
    public static final \u0627\u062b Companion = new \u0627\u062b(null);

    public void execute(@NotNull LiteralArgumentBuilder<ClientCommandSource> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    protected final int getSingleSuccess() {
        return this.singleSuccess;
    }

    public final void register(@NotNull CommandDispatcher<ClientCommandSource> dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        LiteralArgumentBuilder builder = LiteralArgumentBuilder.literal((String)this.name);
        Intrinsics.checkNotNull(builder);
        this.execute((LiteralArgumentBuilder<ClientCommandSource>)builder);
        dispatcher.register(builder);
    }

    public Command(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.singleSuccess = 1;
    }
}

