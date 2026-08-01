package zenith.zov.base.comand;

import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommandSource;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.BindsCommand;
import zenith.zov.base.comand.impl.CalcCommand;
import zenith.zov.base.comand.impl.ClipCommand;
import zenith.zov.base.comand.impl.ConfigCommand;
import zenith.zov.base.comand.impl.FriendCommand;
import zenith.zov.base.comand.impl.GpsCommand;
import zenith.zov.base.comand.impl.MacroCommand;
import zenith.zov.base.comand.impl.NameProtectCommand;
import zenith.zov.base.comand.impl.NeuroCommand;
import zenith.zov.base.comand.impl.RCTCommand;
import zenith.zov.base.comand.impl.RegionCommand;
import zenith.zov.base.comand.impl.StaffCommand;
import zenith.zov.base.comand.impl.WayCommand;

public class CommandManager {
   private String prefix = ".";
   private final CommandDispatcher<CommandSource> dispatcher = new CommandDispatcher();
   private final CommandSource source = new ClientCommandSource(null, MinecraftClient.getInstance());
   private final List<CommandAbstract> commands = new ArrayList<>();

   public CommandManager() {
      this.init();
   }

   private void init() {
      this.registerCommand(new FriendCommand());
      this.registerCommand(new MacroCommand());
      this.registerCommand(new ClipCommand());
      this.registerCommand(new ConfigCommand());
      this.registerCommand(new NeuroCommand());
      this.registerCommand(new RCTCommand());
      this.registerCommand(new WayCommand());
      this.registerCommand(new GpsCommand());
      this.registerCommand(new BindsCommand());
      this.registerCommand(new NameProtectCommand());
      this.registerCommand(new RegionCommand());
      this.registerCommand(new StaffCommand());
      this.registerCommand(new CalcCommand());
   }

   public void registerCommand(CommandAbstract commandabstract) {
      if (commandabstract != null) {
         commandabstract.register(this.dispatcher);
         this.commands.add(commandabstract);
      }
   }

   public String getPrefix() {
      return this.prefix;
   }

   public CommandDispatcher<CommandSource> getDispatcher() {
      return this.dispatcher;
   }

   public CommandSource getSource() {
      return this.source;
   }

   public List<CommandAbstract> getCommands() {
      return this.commands;
   }
}
