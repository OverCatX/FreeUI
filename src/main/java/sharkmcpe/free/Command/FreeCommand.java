package sharkmcpe.free.Command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import sharkmcpe.free.FreeLoader;

public class FreeCommand extends Command {

    private FreeLoader plugin;

    public FreeCommand(String name, FreeLoader plugin) {
        super("free");
        this.plugin = plugin;
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] strings) {
        if(sender instanceof Player){
            plugin.getFreeForm().FreeUI((Player) sender);
        }
        return false;
    }
}
