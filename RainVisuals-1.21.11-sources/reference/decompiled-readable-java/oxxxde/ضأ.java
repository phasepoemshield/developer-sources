/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.network.ServerInfo$ServerType
 *  net.minecraft.client.option.ServerList
 */
package oxxxde;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.util.other.DefaultServerBootstrap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.option.ServerList;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2={"Loxxxde/\u0636\u0623;", "", "<init>", "()V", "", "initialize", "", "MARKER_FILE_NAME", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "", "Loxxxde/\u0633\u0635;", "defaults", "Ljava/util/List;", "DefaultServer", "rain-visuals"})
public final class \u0636\u0623 {
    @NotNull
    private static final List<DefaultServerBootstrap.DefaultServer> defaults;
    @NotNull
    private static final String MARKER_FILE_NAME = ".default-servers-v2";
    private static final Logger logger;
    @NotNull
    public static final \u0636\u0623 INSTANCE;

    public final void initialize() {
        block11: {
            Object object;
            Path rainDirectory = \u0636\u0643.getMc().runDirectory.toPath().resolve("Rain");
            Path marker = rainDirectory.resolve(MARKER_FILE_NAME);
            if (Files.exists(marker, new LinkOption[0])) {
                return;
            }
            Object object2 = this;
            try {
                \u0636\u0623 $this$initialize_u24lambda_u240 = object2;
                boolean bl = false;
                ServerList servers = new ServerList(\u0636\u0643.getMc());
                servers.loadFile();
                boolean changed = false;
                Iterable $this$forEach$iv = defaults;
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    boolean alreadyVisible;
                    boolean bl2;
                    DefaultServerBootstrap.DefaultServer defaultServer;
                    block10: {
                        defaultServer = (DefaultServerBootstrap.DefaultServer)element$iv;
                        boolean bl3 = false;
                        Iterable $this$any$iv = RangesKt.until(0, servers.size());
                        boolean $i$f$any = false;
                        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                            bl2 = false;
                        } else {
                            Iterator iterator2 = $this$any$iv.iterator();
                            while (iterator2.hasNext()) {
                                int element$iv2;
                                int index = element$iv2 = ((IntIterator)iterator2).nextInt();
                                boolean bl4 = false;
                                if (!StringsKt.equals(servers.get((int)index).address, defaultServer.getAddress(), true)) continue;
                                bl2 = true;
                                break block10;
                            }
                            bl2 = false;
                        }
                    }
                    if (alreadyVisible = bl2) continue;
                    ServerInfo hidden = servers.tryUnhide(defaultServer.getAddress());
                    if (hidden != null) {
                        hidden.name = defaultServer.getName();
                    } else {
                        servers.add(new ServerInfo(defaultServer.getName(), defaultServer.getAddress(), ServerInfo.ServerType.OTHER), false);
                    }
                    changed = true;
                }
                if (changed) {
                    servers.saveFile();
                }
                Files.createDirectories(rainDirectory, new FileAttribute[0]);
                OpenOption[] openOptionArray = new OpenOption[3];
                openOptionArray[0] = StandardOpenOption.CREATE;
                openOptionArray[1] = StandardOpenOption.TRUNCATE_EXISTING;
                openOptionArray[2] = StandardOpenOption.WRITE;
                Files.writeString(marker, (CharSequence)"1", openOptionArray);
                logger.info("Default multiplayer servers initialized");
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block11;
            Object object3 = object = throwable;
            boolean bl = false;
            logger.warn("Failed to initialize default multiplayer servers", (Throwable)object3);
        }
    }

    static {
        INSTANCE = new \u0636\u0623();
        logger = LoggerFactory.getLogger("Rain Default Servers");
        DefaultServerBootstrap.DefaultServer[] defaultServerArray = new DefaultServerBootstrap.DefaultServer[3];
        defaultServerArray[0] = new DefaultServerBootstrap.DefaultServer("\u0424\u0430\u043d\u0422\u0430\u0439\u043c", "funtime.su");
        defaultServerArray[1] = new DefaultServerBootstrap.DefaultServer("\u0425\u043e\u043b\u0438\u0412\u043e\u0440\u043b\u0434", "hub.holyworld.me");
        defaultServerArray[2] = new DefaultServerBootstrap.DefaultServer("\u0412\u0435\u043b\u043b\u041c\u0430\u0439\u043d", "rain.wellmine.fun");
        defaults = CollectionsKt.listOf(defaultServerArray);
    }

    private \u0636\u0623() {
    }
}

