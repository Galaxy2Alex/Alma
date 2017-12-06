package co.uk.odysseius.alma.helpers;


import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

public class BreakHandler {

    @SubscribeEvent
    public void onBreakEvent(BlockEvent.BreakEvent event) {
        Entity player = event.getPlayer();
        Iterable<ItemStack> item = player.getHeldEquipment();
        ArrayList<ItemStack> list = new ArrayList<>();
        for (ItemStack e : item) {
            list.add(e);
        }
        Block block = event.getWorld().getBlockState(event.getPos()).getBlock();
        System.out.println(player);
        System.out.println(item);
        System.out.println(block);

        System.out.println("Player " + event.getPlayer());
        System.out.println("Result " + event.getResult());
        System.out.println("ToString " + event.toString());
        System.out.println("ListenerList " + event.getListenerList());
        System.out.println("State " + event.getState());
        System.out.println("Pos " + event.getPos());
        System.out.println("Phase " + event.getPhase());
        System.out.println("World " + event.getWorld());
        System.out.println("HashCode " + event.hashCode());
        System.out.println("EXP to Drop " + event.getExpToDrop());

        if (list.contains(Item.getByNameOrId("shovel"))) {
            System.out.println("OMG");
        }
    }
}
