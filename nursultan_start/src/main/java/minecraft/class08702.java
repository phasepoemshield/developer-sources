/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00064
 *  minecraft.class00072
 *  minecraft.class00246
 *  minecraft.class00276
 *  minecraft.class00392
 *  minecraft.class01042
 *  minecraft.class01304
 *  minecraft.class02003
 *  minecraft.class02969
 *  minecraft.class04702
 *  minecraft.class04734
 *  minecraft.class04980
 *  minecraft.class04981
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05213
 *  minecraft.class05220
 *  minecraft.class05685
 *  minecraft.class06202
 *  minecraft.class06207
 *  minecraft.class07001
 *  minecraft.class07312
 *  minecraft.class07529
 *  minecraft.class07709
 *  minecraft.class07742
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import minecraft.class00064;
import minecraft.class00072;
import minecraft.class00246;
import minecraft.class00276;
import minecraft.class00392;
import minecraft.class01042;
import minecraft.class01304;
import minecraft.class02003;
import minecraft.class02969;
import minecraft.class04702;
import minecraft.class04734;
import minecraft.class04980;
import minecraft.class04981;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05213;
import minecraft.class05220;
import minecraft.class05685;
import minecraft.class06202;
import minecraft.class06207;
import minecraft.class07001;
import minecraft.class07312;
import minecraft.class07529;
import minecraft.class07709;
import minecraft.class07742;
import minecraft.class08715;
import minecraft.class08730;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08702 {
    private static final Logger N = LogUtils.getLogger();

    public static void N(class06202 class062022, class05096 class050962, class05096 class050963, int n, class04981 class049812, @Nullable class04734 class047342) {
        class05213.N((class06202)class062022, () -> class062022.N(class050962), (class052132, class020032, class062072, path) -> {
            Path path2;
            try {
                path2 = class08702.N((class02003<class02969>)class020032, class062072, path);
            }
            catch (IOException iOException) {
                N.warn("Failed to create temporary world folder.");
                class062022.N((class05096)new class04702((class00392)class00392.L((String)"mco.create.world.failed"), class050963));
                return true;
            }
            class04980 class049802 = class04980.N((class07312)class062072.q(), (String)class07529.y().comp_4025());
            class00072 class000722 = new class00072(n, class049802, List.of(class00064.N((boolean)class062072.q().L())));
            class00246 class002462 = new class00246(path2, class000722, class062022.Ny(), class049812.y, class00276.L());
            class062022.y((class05096)new class01304(() -> ((class00246)class002462).y(), (class00392)class00392.L((String)"mco.create.world.reset.title"), (class00392)class00392.i(), class05220.i, false));
            if (class047342 != null) {
                class047342.run();
            }
            class002462.N().handleAsync((object, throwable) -> {
                if (throwable != null) {
                    RuntimeException runtimeException;
                    if (throwable instanceof CompletionException) {
                        runtimeException = (CompletionException)throwable;
                        throwable = runtimeException.getCause();
                    }
                    if (throwable instanceof class08730) {
                        class062022.y(class050963);
                    } else {
                        if (throwable instanceof class08715) {
                            runtimeException = (class08715)throwable;
                            N.warn("Failed to create realms world {}", (Object)((class08715)runtimeException).N());
                        } else {
                            N.warn("Failed to create realms world {}", (Object)throwable.getMessage());
                        }
                        class062022.y((class05096)new class04702((class00392)class00392.L((String)"mco.create.world.failed"), class050963));
                    }
                } else {
                    if (class050962 instanceof class05092) {
                        class05092 class050922 = (class05092)class050962;
                        class050922.N(class049812.y);
                    }
                    if (class047342 != null) {
                        class05685.N((class04981)class049812, (class05096)class050962, (boolean)true);
                    } else {
                        class062022.y(class050962);
                    }
                    class05685.u();
                }
                return null;
            }, (Executor)class062022);
            return true;
        });
    }

    private static Path N(class02003<class02969> class020032, class06207 class062072, @Nullable Path path) throws IOException {
        Path path2 = Files.createTempDirectory("minecraft_realms_world_upload", new FileAttribute[0]);
        if (path != null) {
            Files.move(path, path2.resolve("datapacks"), new CopyOption[0]);
        }
        class07001 class070012 = class062072.N((class01042)class020032.N(), null);
        class07001 class070013 = new class07001();
        class070013.N("Data", (class07709)class070012);
        Path path3 = Files.createFile(path2.resolve("level.dat"), new FileAttribute[0]);
        class07742.N((class07001)class070013, (Path)path3);
        return path2;
    }
}

