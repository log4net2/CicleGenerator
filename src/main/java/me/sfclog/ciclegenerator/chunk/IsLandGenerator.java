package me.sfclog.ciclegenerator.chunk;


import org.bukkit.*;
import org.bukkit.generator.ChunkGenerator;
public class IsLandGenerator extends ChunkGenerator {


    public boolean canSpawn(World world, int x, int z) {
        world.setSpawnLocation(0,60,0);
        world.setGameRule(GameRule.KEEP_INVENTORY,true);
        return true;
    }
}

