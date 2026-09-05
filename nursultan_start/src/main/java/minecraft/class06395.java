/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10577
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonWriter
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01612
 *  minecraft.class01623
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04348
 *  minecraft.class05001
 *  minecraft.class05071
 *  minecraft.class06200
 *  minecraft.class06290
 *  minecraft.class07529
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class08164
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10577;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01612;
import minecraft.class01623;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04348;
import minecraft.class05001;
import minecraft.class05071;
import minecraft.class06200;
import minecraft.class06290;
import minecraft.class07529;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class08164;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06395 {
    private static final Logger N = LogUtils.getLogger();
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.unknown", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.enable.failed", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.disable.failed", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.disable.failed.feature", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.datapack.enable.failed.no_flags", (Object[])new Object[]{object, object2}));
    private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.create.invalid_name", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.create.invalid_full_name", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.create.already_exists", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType z = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.datapack.create.metadata_encode_failure", (Object[])new Object[]{object, object2}));
    private static final DynamicCommandExceptionType U = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.create.io_failure", (Object[])new Object[]{object}));
    private static final SuggestionProvider<class07701> E = (commandContext, suggestionsBuilder) -> class07689.y(class06395.N(((class07701)commandContext.getSource()).W().yy()).stream().map(StringArgumentType::escapeIfRequired), (SuggestionsBuilder)suggestionsBuilder);
    private static final SuggestionProvider<class07701> W = (commandContext, suggestionsBuilder) -> {
        class01623 class016232 = ((class07701)commandContext.getSource()).W().yy();
        Collection var3 = class016232.i();
        class03767 class037672 = ((class07701)commandContext.getSource()).G();
        return class07689.y(class06395.N(class016232.u().stream(), (T class010552) -> class010552.i().N(class037672), objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.stream.Stream, java.util.function.Predicate]");
            return ((Stream)objectArray[0]).filter((Predicate)objectArray[1]);
        }).map(class01055::M).filter(string -> !var3.contains(string)).map(StringArgumentType::escapeIfRequired), (SuggestionsBuilder)suggestionsBuilder);
    };
    private static final DynamicCommandExceptionType m = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.datapack.fabric.internal", (Object[])new Object[]{object}));

    private static int L(class07701 class077012) {
        class01623 class016232 = class077012.W().yy();
        class016232.N();
        Collection var2 = class016232.M();
        if (var2.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.datapack.list.enabled.none"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.datapack.list.enabled.success", (Object[])new Object[]{var2.size(), class00390.y((Collection)var2, (T class010552) -> class010552.N(true))}), false);
        }
        return var2.size();
    }

    private static int y(class07701 class077012) {
        class01623 class016232 = class077012.W().yy();
        class016232.N();
        Collection var2 = class016232.M();
        Collection var3 = class016232.u();
        class03767 class037672 = class077012.G();
        List var5 = var3.stream().filter(class010552 -> !var2.contains(class010552) && class010552.i().N(class037672)).toList();
        if (var5.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.datapack.list.available.none"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.datapack.list.available.success", (Object[])new Object[]{var5.size(), class00390.y((Collection)var5, (T class010552) -> class010552.N(false))}), false);
        }
        return var5.size();
    }

    private static int N(class07701 class077012, class01055 class010552) {
        ArrayList arrayList = Lists.newArrayList((Iterable)class077012.W().yy().M());
        arrayList.remove(class010552);
        class077012.N(() -> class00392.N((String)"commands.datapack.modify.disable", (Object[])new Object[]{class010552.N(true)}), true);
        class06200.N((Collection)arrayList.stream().map(class01055::M).collect(Collectors.toList()), (class07701)class077012);
        return arrayList.size();
    }

    private static Collection N(class01623 class016232) {
        return class016232.M().stream().filter(class010552 -> !((FabricPack)class010552).fabric$isHidden()).map(class01055::M).toList();
    }

    private static Stream N(Stream stream, Predicate predicate, Operation operation) {
        return ((Stream)operation.call(new Object[]{stream, predicate})).filter(class010552 -> !((FabricPack)class010552).fabric$isHidden());
    }

    private static void N(CommandContext commandContext, String string, boolean bl, CallbackInfoReturnable callbackInfoReturnable, class01055 class010552) throws CommandSyntaxException {
        if (((FabricPack)class010552).fabric$isHidden()) {
            throw m.create((Object)class010552.M());
        }
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"datapack").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"enable").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"name", (ArgumentType)StringArgumentType.string()).suggests(W).executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", true), (list, class010552) -> class010552.U().N(list, (Object)class010552, class01055::B, false)))).then(class07686.y((String)"after").then(class07686.N((String)"existing", (ArgumentType)StringArgumentType.string()).suggests(E).executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", true), (list, class010552) -> list.add(list.indexOf(class06395.N((CommandContext<class07701>)commandContext, "existing", false)) + 1, class010552)))))).then(class07686.y((String)"before").then(class07686.N((String)"existing", (ArgumentType)StringArgumentType.string()).suggests(E).executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", true), (list, class010552) -> list.add(list.indexOf(class06395.N((CommandContext<class07701>)commandContext, "existing", false)), class010552)))))).then(class07686.y((String)"last").executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", true), List::add)))).then(class07686.y((String)"first").executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", true), (list, class010552) -> list.add(0, class010552))))))).then(class07686.y((String)"disable").then(class07686.N((String)"name", (ArgumentType)StringArgumentType.string()).suggests(E).executes(commandContext -> class06395.N((class07701)commandContext.getSource(), class06395.N((CommandContext<class07701>)commandContext, "name", false)))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"list").executes(commandContext -> class06395.N((class07701)commandContext.getSource()))).then(class07686.y((String)"available").executes(commandContext -> class06395.y((class07701)commandContext.getSource())))).then(class07686.y((String)"enabled").executes(commandContext -> class06395.L((class07701)commandContext.getSource()))))).then(((LiteralArgumentBuilder)class07686.y((String)"create").requires((Predicate)class07686.N((class08164)class07686.R))).then(class07686.N((String)"id", (ArgumentType)StringArgumentType.string()).then(class07686.N((String)"description", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06395.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"id"), class07698.y((CommandContext)commandContext, (String)"description")))))));
    }

    private static int N(class07701 class077012, String string, class00392 class003922) throws CommandSyntaxException {
        Path path = class077012.W().N(class05071.z);
        if (!class06290.R((String)string)) {
            throw M.create((Object)string);
        }
        if (!class06290.y((String)string)) {
            throw B.create((Object)string);
        }
        Path path2 = path.resolve(string);
        if (Files.exists(path2, new LinkOption[0])) {
            throw Z.create((Object)string);
        }
        class01612 class016122 = new class01612(class003922, class07529.y().method_70592(class01603.field_14190).N());
        DataResult dataResult = class01612.y.y().encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class016122);
        Optional optional = dataResult.error();
        if (optional.isPresent()) {
            throw z.create((Object)string, (Object)((DataResult.Error)optional.get()).message());
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(class01612.y.N(), (JsonElement)dataResult.getOrThrow());
        try {
            Files.createDirectory(path2, new FileAttribute[0]);
            Files.createDirectory(path2.resolve(class01603.field_14190.N()), new FileAttribute[0]);
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path2.resolve("pack.mcmeta"), StandardCharsets.UTF_8, new OpenOption[0]);
                 JsonWriter jsonWriter = new JsonWriter((Writer)bufferedWriter);){
                jsonWriter.setSerializeNulls(false);
                jsonWriter.setIndent("  ");
                class05001.N((JsonWriter)jsonWriter, (JsonElement)jsonObject, null);
            }
        }
        catch (IOException iOException) {
            N.warn("Failed to create pack at {}", (Object)path.toAbsolutePath(), (Object)iOException);
            throw U.create((Object)string);
        }
        class077012.N(() -> class00392.N((String)"commands.datapack.create.success", (Object[])new Object[]{string}), true);
        return 1;
    }

    private static int N(class07701 class077012, class01055 class010552, class10577 class105772) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayList((Iterable)class077012.W().yy().M());
        class105772.apply((List)arrayList, class010552);
        class077012.N(() -> class00392.N((String)"commands.datapack.modify.enable", (Object[])new Object[]{class010552.N(true)}), true);
        class06200.N((Collection)arrayList.stream().map(class01055::M).collect(Collectors.toList()), (class07701)class077012);
        return arrayList.size();
    }

    private static class01055 N(CommandContext<class07701> commandContext, String string, boolean bl) throws CommandSyntaxException {
        String string2 = StringArgumentType.getString(commandContext, (String)string);
        class01623 class016232 = ((class07701)commandContext.getSource()).W().yy();
        class01055 class010552 = class016232.L(string2);
        if (class010552 == null) {
            throw y.create((Object)string2);
        }
        Collection collection = class016232.M();
        class06395.N(commandContext, string, bl, null, class010552);
        boolean bl2 = collection.contains(class010552);
        if (bl && bl2) {
            throw L.create((Object)string2);
        }
        if (!bl && !bl2) {
            throw u.create((Object)string2);
        }
        class03767 class037672 = ((class07701)commandContext.getSource()).G();
        class03767 class037673 = class010552.i();
        if (!bl && !class037673.y() && class010552.E() == class01283.u) {
            throw i.create((Object)string2);
        }
        if (!class037673.N(class037672)) {
            throw R.create((Object)string2, (Object)class03794.N((class03767)class037672, (class03767)class037673));
        }
        return class010552;
    }

    private static int N(class07701 class077012) {
        return class06395.L(class077012) + class06395.y(class077012);
    }
}

