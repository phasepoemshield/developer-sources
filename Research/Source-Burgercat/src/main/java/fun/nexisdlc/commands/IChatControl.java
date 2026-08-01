package fun.nexisdlc.commands;

import java.util.UUID;

public interface IChatControl {
    String FORCE_COMMAND_PREFIX = String.format("<<%s>>", UUID.randomUUID());
}
