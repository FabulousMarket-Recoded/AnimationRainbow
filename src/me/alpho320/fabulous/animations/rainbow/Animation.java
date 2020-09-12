package me.alpho320.fabulous.animations.rainbow;

import io.github.portlek.smartinventory.Icon;
import io.github.portlek.smartinventory.InventoryContents;
import me.alpho320.fabulous.market.MarketAPI;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Animation extends me.alpho320.fabulous.market.shop.Animation {

    private Random random = new Random();
    private MarketAPI api;

    public Animation(MarketAPI api) {
        super(api);
        this.api = api;
    }

    /**
     * Called when animation created.
     * @param contents contents of inventory
     */
    @Override
    public void createAnimation(InventoryContents contents) {

    }

    /**
     * Called when animation updated (every 10 tick, 20 tick = 1 second).
     * @param contents contents of inventory
     */
    @Override
    public void updateAnimation(InventoryContents contents) {
        int i = random.nextInt(100 - 1) + 1;

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        if(api.isBetween(81, i, 100)) {
            glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        } else if(api.isBetween(61, i, 80)) {
            glass = new ItemStack(Material.BLUE_STAINED_GLASS_PANE, 1);
        } else if(api.isBetween(50, i, 60)) {
            glass = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
        } else if(api.isBetween(40, i, 49)) {
            glass = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);
        } else if(api.isBetween(20, i, 39)) {
            glass = new ItemStack(Material.GREEN_STAINED_GLASS_PANE, 1);
        } else if(api.isBetween(1, i, 19)) {
            glass = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE, 1);
        }
        contents.fillBorders(Icon.cancel(glass));
    }

    @Override
    public String getName() {
        return "RAINBOW";
    }

}
