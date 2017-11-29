package com.mojang.ld22.entity;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.item.ResourceItem;
import com.mojang.ld22.item.resource.Resource;
import com.mojang.ld22.sound.Sound;

public class DonFuego extends Mob {
    float xa;
    float ya; 
    boolean enraged = false;
    public DonFuego (float a, float b){
      xa = a;
      ya = a;
      health = maxhealth = 1100;
    }
    public tick (){
      super.tick();
    }
}
