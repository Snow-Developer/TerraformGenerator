package org.terraform.structure.pyramid;

import org.terraform.structure.room.PathPopulatorAbstract;
import org.terraform.structure.room.PathPopulatorData;

import java.util.Random;

public class PyramidPathPopulator extends PathPopulatorAbstract {
    private final Random rand;
    private final int height;

    public PyramidPathPopulator(Random rand) {
        this.rand = rand;
        this.height = 3;
    }

    public PyramidPathPopulator(Random rand, int height) {
        this.rand = rand;
        this.height = height;
    }

    @Override
    public void populate(PathPopulatorData ppd) {
        //Wall w = new Wall(ppd.base,ppd.dir);

        //Floor is Prismarine >:V
//		for(int i = 0; i <= 1; i++){
//			if(w.getLeft(i).getType() != Material.SEA_LANTERN)
//				w.getLeft(i).setType(Material.PRISMARINE);
//			if(w.getRight(i).getType() != Material.SEA_LANTERN)
//				w.getRight(i).setType(Material.PRISMARINE);
//		}
//		
//		//Lantern corridor lights
//		if(light){
//			w.setType(Material.SEA_LANTERN);
//		}
//		light = !light;
//		
//		//Pillars
//		if(GenUtils.chance(rand,1,20)){
//			w.RPillar(5, rand, GenUtils.mergeArr(design.tileSet,new Material[]{Material.SEA_LANTERN}));
//		}
////		else if(GenUtils.chance(rand, 1, 50)){
////			MonumentRoomPopulator.setThickPillar(rand, design, w.get().getRelative(0,3,0));
////		}
//		
//		//Thick pillars
//		if(GenUtils.chance(rand, 1, 50)){
//			MonumentRoomPopulator.setThickPillar(rand, design, w.get().getRelative(0,-1,0));
//		}
//		
//		//Small spires on the top
//		if(GenUtils.chance(rand, 1, 50)){
//			if(w.getRelative(0,6,0).getType().isSolid() 
//					&& !w.getRelative(0,7,0).getType().isSolid())
//				design.spire(w.getRelative(0,7,0), rand);
//		}
    }

    @Override
    public int getPathWidth() {
        return 1;
    }

    @Override
    public int getPathHeight() {
        return height;
    }

}
