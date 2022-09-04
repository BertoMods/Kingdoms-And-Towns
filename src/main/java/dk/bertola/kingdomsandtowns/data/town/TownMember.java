package dk.bertola.kingdomsandtowns.data.town;

import java.util.UUID;

public class TownMember implements IPlayerMember {

    public UUID player;
    public String permissionString;

    public TownMember() {};
    public TownMember(UUID uuid, String s) {
        this.player = uuid;
        this.permissionString = s;
    }
}
