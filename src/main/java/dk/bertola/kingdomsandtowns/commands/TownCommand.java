package dk.bertola.kingdomsandtowns.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dk.bertola.kingdomsandtowns.data.town.TownData;
import dk.bertola.kingdomsandtowns.data.town.TownMember;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class TownCommand {
    public TownCommand(CommandDispatcher<CommandSourceStack> dispatcher){
        dispatcher.register(Commands.literal("town")
                .then(Commands.literal("establish")
                        .then(Commands.argument("name", StringArgumentType.string())
                            .executes(commandContext -> establishTown(commandContext.getSource(),StringArgumentType.getString(commandContext, "name")))
                        )
                )
                .executes(commandContext -> getSourceTown(commandContext.getSource()))

        );
    }

    private int getSourceTown(CommandSourceStack source) {
       return 0;
    }

    private int establishTown(CommandSourceStack source, String name) throws CommandSyntaxException {
        TownData town = new TownData(name, new TownMember(source.getPlayer().getUUID(), "*"));

        return 0;
    }
}
