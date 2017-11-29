import com.mojang.ld22.entity.*;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.item.ResourceItem;
import com.mojang.ld22.item.resource.Resource;

public class Dwarf extends Mob {
    float xa;
    float ya;
    int health = 8;
        
    public Dwarf(float a, float b){
            xa = a;
            ya = b;
    }
    public tick (){
            super.tick();
            
            
    }
}
