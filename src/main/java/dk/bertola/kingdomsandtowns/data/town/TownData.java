package dk.bertola.kingdomsandtowns.data.town;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TownData {

    public String name;
    public UUID townUUID;
    private List<TownMember> members;
    //private List<TownChunk> landarea;
    public TownMember founder;

    public TownData(String name, TownMember founder){
        this.name = name;
        this.founder = founder;
        this.townUUID = UUID.randomUUID();
        this.members = new ArrayList<>();
    }

    public TownData(String name, UUID townUUID, List<TownMember> members, TownMember founder){
        this.name = name;
        this.townUUID = townUUID;
        this.members = members;
        this.founder = founder;
    }

    public List<TownMember> getMembers() {
        return members;
    }

}
