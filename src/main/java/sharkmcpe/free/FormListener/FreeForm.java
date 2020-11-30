package sharkmcpe.free.FormListener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.item.Item;
import sharkmcpe.free.FreeLoader;

public class FreeForm implements Listener {

    private FreeLoader plugin;

    public FreeForm(FreeLoader plugin){
        this.plugin = plugin;
    }

    public void FreeUI(Player player){
        FormWindowSimple form = new FormWindowSimple("Free","รับของฟรี");
        ElementButton button = new ElementButton("Tools\nอุปกรณ์");
        ElementButton button1 = new ElementButton("Armor\nชุดเกราะ");
        ElementButton button2 = new ElementButton("Foods\nอาหาร");
        form.addButton(button);
        form.addButton(button1);
        form.addButton(button2);
        player.showFormWindow(form);
    }

    @EventHandler
    public void ResponseFree(PlayerFormRespondedEvent event) {
        if (event.wasClosed()) return;
        Player player = event.getPlayer();
        if (event.getWindow() instanceof FormWindowSimple) {
            String title = ((FormWindowSimple) event.getWindow()).getTitle();
            String button = ((FormWindowSimple) event.getWindow()).getResponse().getClickedButton().getText();
            if (title.equals("Free")) {
                if (button.equals("Tools\nอุปกรณ์")) {
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม1ปุ่ม 1"),plugin.getConfig().getInt("metaไอเทม1ปุ่ม 1"),plugin.getConfig().getInt("countไอเทม1ปุ่ม 1")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม2ปุ่ม 1"),plugin.getConfig().getInt("metaไอเทม2ปุ่ม 1"),plugin.getConfig().getInt("countไอเทม2ปุ่ม 1")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม3ปุ่ม 1"),plugin.getConfig().getInt("metaไอเทม3ปุ่ม 1"),plugin.getConfig().getInt("countไอเทม3ปุ่ม 1")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม4ปุ่ม 1"),plugin.getConfig().getInt("metaไอเทม4ปุ่ม 1"),plugin.getConfig().getInt("countไอเทม4ปุ่ม 1")));
                    player.sendMessage(plugin.getConfig().getString("Prefix")+" §aคุณได้รับของฟรีเรียบร้อยแล้ว");
                }
                if (button.equals("Armor\nชุดเกราะ")) {
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม1ปุ่ม 2"),plugin.getConfig().getInt("metaไอเทม1ปุ่ม 2"),plugin.getConfig().getInt("countไอเทม1ปุ่ม 2")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม2ปุ่ม 2"),plugin.getConfig().getInt("metaไอเทม2ปุ่ม 2"),plugin.getConfig().getInt("countไอเทม2ปุ่ม 2")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม3ปุ่ม 2"),plugin.getConfig().getInt("metaไอเทม3ปุ่ม 2"),plugin.getConfig().getInt("countไอเทม3ปุ่ม 2")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม4ปุ่ม 2"),plugin.getConfig().getInt("metaไอเทม4ปุ่ม 2"),plugin.getConfig().getInt("countไอเทม4ปุ่ม 2")));
                    player.sendMessage(plugin.getConfig().getString("Prefix")+" §aคุณได้รับของฟรีเรียบร้อยแล้ว");
                }
                if (button.equals("Foods\nอาหาร")) {
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม1ปุ่ม 3"),plugin.getConfig().getInt("metaไอเทม1ปุ่ม 3"),plugin.getConfig().getInt("countไอเทม1ปุ่ม 3")));
                    player.getInventory().addItem(Item.get(plugin.getConfig().getInt("idไอเทม2ปุ่ม 3"),plugin.getConfig().getInt("metaไอเทม2ปุ่ม 3"),plugin.getConfig().getInt("countไอเทม2ปุ่ม 3")));
                    player.sendMessage(plugin.getConfig().getString("Prefix")+" §aคุณได้รับของฟรีเรียบร้อยแล้ว");
                }
            }
        }
    }
}
