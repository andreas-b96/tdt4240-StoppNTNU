package com.zombie.shooter.utils;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by opium on 09.03.18.
 */

public class B2DConstants {

    public static final float DECREASE_WALLHEALTH = 10;

    private B2DConstants() {}

    public static float PPM = 32f;

    public static final Vector2 WORLD_GRAVITY = new Vector2(0, 0);

    public static final Vector2 ENEMY_LINEAR_VELOCITY = new Vector2(-5f, 0);

    public static final float GROUND_X = 0;
    public static final float GROUND_Y = 0;
    public static final float GROUND_WIDTH = 25f;
    public static final float GROUND_HEIGHT = 2f;
    public static final float GROUND_DENSITY = 0f;

    public static final float PLAYER_X = 1.5f;
    public static final float PLAYER_Y = GROUND_Y + GROUND_HEIGHT;
    public static final float PLAYER_WIDTH = 1f;
    public static final float PLAYER_HEIGHT = 2f;
    public static final float PLAYER_GRAVITY_SCALE = 3f;
    public static final float PLAYER_DENSITY = 0.5f;

    public static final float WALL_X = 5f;
    public static final float WALL_Y = 0f;
    public static final float WALL_HEIGHT = 60f;
    public static final float WALL_WIDTH = 2f;
    public static final float WALL_DENSITY = 60f;
    public static final float WALL_HEALTH = 20f;  //Very random number

}
