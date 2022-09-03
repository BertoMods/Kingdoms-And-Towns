package dk.bertola.kingdomsandtowns.events;

import dk.bertola.kingdomsandtowns.KingdomsAndTowns;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = KingdomsAndTowns.MOD_ID)
public class CommandEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event){


        ConfigCommand.register(event.getDispatcher());
    }
}
