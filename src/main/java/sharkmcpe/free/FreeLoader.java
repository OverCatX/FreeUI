package sharkmcpe.free;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.ConfigSection;
import sharkmcpe.free.Command.*;
import sharkmcpe.free.FormListener.FreeForm;

import java.io.File;

public class FreeLoader extends PluginBase implements Listener {

    private static FreeLoader instance;
    private FreeForm freeForm;
    public static FreeLoader getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        getLogger().info("ทำงานจ้า");
        registerCommands();
        this.freeForm = new FreeForm(this);
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(this.freeForm,this);
        this.saveDefaultConfig();
        Config config = new Config(new File(this.getDataFolder(), "config.yml"), 2, new ConfigSection() {
            private static final long serialVersionUID = 1L;
            {
                this.put("Prefix", "§b[§6Free§b]");
                this.put("idไอเทม1ปุ่ม 1", 1);
                this.put("metaไอเทม1ปุ่ม 1", 1);
                this.put("countไอเทม1ปุ่ม 1", 1);
                this.put("idไอเทม2ปุ่ม 1", 1);
                this.put("metaไอเทม2ปุ่ม 1", 1);
                this.put("countไอเทม2ปุ่ม 1", 1);
                this.put("idไอเทม3ปุ่ม 1", 1);
                this.put("metaไอเทม3ปุ่ม 1", 1);
                this.put("countไอเทม3ปุ่ม 1", 1);
                this.put("idไอเทม4ปุ่ม 1", 1);
                this.put("metaไอเทม4ปุ่ม 1", 1);
                this.put("countไอเทม4ปุ่ม 1", 1);
                this.put("idไอเทม1ปุ่ม 2", 1);
                this.put("metaไอเทม1ปุ่ม 2", 1);
                this.put("countไอเทม1ปุ่ม 2", 1);
                this.put("idไอเทม2ปุ่ม 2", 1);
                this.put("metaไอเทม2ปุ่ม 2", 1);
                this.put("countไอเทม2ปุ่ม 2", 1);
                this.put("idไอเทม3ปุ่ม 2", 1);
                this.put("metaไอเทม3ปุ่ม 2", 1);
                this.put("countไอเทม3ปุ่ม 2", 1);
                this.put("idไอเทม4ปุ่ม 2", 1);
                this.put("metaไอเทม4ปุ่ม 2", 1);
                this.put("countไอเทม4ปุ่ม 2", 1);
                this.put("idไอเทม1ปุ่ม 3", 1);
                this.put("metaไอเทม1ปุ่ม 3", 1);
                this.put("countไอเทม1ปุ่ม 3", 1);
                this.put("idไอเทม2ปุ่ม 3", 1);
                this.put("metaไอเทม2ปุ่ม 3", 1);
                this.put("countไอเทม2ปุ่ม 3", 1);
            }
        });
        config.save();
    }

    private void registerCommands() {
        getServer().getCommandMap().register("free", new FreeCommand("free", this));
    }

    public FreeForm getFreeForm(){
        return this.freeForm;
    }
}