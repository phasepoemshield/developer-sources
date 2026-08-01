package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import fun.nexisdlc.Nexis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public enum ConfigFileDataType implements IDatatypeFor<String> {
    INSTANCE;

    @Override
    public Stream<String> tabComplete(IDatatypeContext ctx) throws CommandException {
        Stream<String> friends = getConfigs()
                .stream()
                .map(String::toString);

        String context = ctx
                .getConsumer()
                .getString();

        return new TabCompleteHelper()
                .append(friends)
                .filterPrefix(context)
                .sortAlphabetically()
                .stream();
    }

    @Override
    public String get(IDatatypeContext datatypeContext) throws CommandException {
        String username = datatypeContext
                .getConsumer()
                .getString();

        return getConfigs().stream()
                .filter(s -> s.equalsIgnoreCase(username))
                .findFirst()
                .orElse(null);
    }

    public List<String> getConfigs() {
        var configStorage = Nexis.getInstance().getConfigStorage();

        List<String> configs = new ArrayList<>();
        File[] configFiles = configStorage.CONFIG_DIR.listFiles();

        if (configFiles != null) {
            for (File configFile : configFiles) {
                if (configFile.isFile() && configFile.getName().endsWith(".json")) {
                    String configName = configFile.getName().replace(".json", "");
                    configs.add(configName);
                }
            }
        }

        return configs;
    }
}
