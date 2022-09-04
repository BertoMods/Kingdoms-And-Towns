package dk.bertola.kingdomsandtowns.data;

import dk.bertola.kingdomsandtowns.KingdomsAndTowns;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.storage.LevelResource;
import net.minecraftforge.server.ServerLifecycleHooks;

import java.io.File;
import java.nio.file.Path;

public class DataHandler {

    private static final Path root = ServerLifecycleHooks.getCurrentServer().getWorldPath(LevelResource.ROOT).normalize().toAbsolutePath().resolve(KingdomsAndTowns.MOD_ID);


}
