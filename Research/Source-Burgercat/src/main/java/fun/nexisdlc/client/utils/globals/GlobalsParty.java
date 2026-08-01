package fun.nexisdlc.client.utils.globals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GlobalsParty {
    private final String code;
    private final int ownerId;
    private final String ownerUsername;
    private final List<GlobalsMember> members;

    public GlobalsParty(String code, int ownerId, String ownerUsername, List<GlobalsMember> members) {
        this.code = code == null ? "" : code;
        this.ownerId = ownerId;
        this.ownerUsername = ownerUsername == null ? "" : ownerUsername;
        this.members = new ArrayList<>(members == null ? List.of() : members);
    }

    public String code() {
        return code;
    }

    public int ownerId() {
        return ownerId;
    }

    public String ownerUsername() {
        return ownerUsername;
    }

    public List<GlobalsMember> members() {
        return Collections.unmodifiableList(members);
    }
}
