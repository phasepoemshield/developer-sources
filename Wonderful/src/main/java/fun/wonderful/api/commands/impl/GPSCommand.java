package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import fun.wonderful.Wonderful;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.api.utils.cmd.waypoint.Waypoint;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.command.CommandSource;

public class GPSCommand
extends Command {
    public GPSCommand() {
        super("gps");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> var1) {
    }


    private com.mojang.brigadier.Command<CommandSource> setWaypointCommand() {
        return context -> {
            int x2 = (Integer)context.getArgument("X", Integer.class);
            int z2 = (Integer)context.getArgument("Z", Integer.class);
            Waypoint waypoint = new Waypoint(x2, z2);
            Wonderful.INSTANCE.waypointStorage.set(waypoint);
            ChatUtils.sendMessage(I18n.translate((String)"Метка поставлена: ", (Object[])new Object[]{x2, z2}));
            return 1;
        };
    }

    private com.mojang.brigadier.Command<CommandSource> clearWaypointCommand() {
        return context -> {
            if (!Wonderful.INSTANCE.waypointStorage.isEmpty()) {
                Wonderful.INSTANCE.waypointStorage.clear();
                ChatUtils.sendMessage(I18n.translate((String)"Метка удалена!", (Object[])new Object[0]));
            } else {
                ChatUtils.sendMessage(I18n.translate((String)"Метки не было", (Object[])new Object[0]));
            }
            return 1;
        };
    }
}