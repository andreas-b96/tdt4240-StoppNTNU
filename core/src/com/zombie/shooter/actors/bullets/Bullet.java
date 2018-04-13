package com.zombie.shooter.actors.bullets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.zombie.shooter.actors.GameActor;
import com.zombie.shooter.box2d.BulletUserData;
import com.zombie.shooter.box2d.UserData;
import com.zombie.shooter.utils.B2DConstants;

public class Bullet extends GameActor{

    private Sprite bulletSprite;
    private float damage;
    private Vector2 bulletDirection;
    private float stateTime;
    private float posi_y;
    public String id = "bob";

    public Bullet(String filePath, float damage, Body body) {
        super(body);
        this.bulletSprite = new Sprite(new Texture(filePath));
        this.damage = damage;
        this.stateTime = 0f;
        this.posi_y = B2DConstants.PLAYER_Y;

        //The bullets get a speed set when fired from a weapon
        this.bulletDirection = new Vector2(10,0);
    }

    public void setBulletDirection(Vector2 bulletDirection) {
        this.bulletDirection = bulletDirection;
    }

    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        stateTime += Gdx.graphics.getDeltaTime();
        batch.draw(bulletSprite, screenRectangle.x, getPosi_y()* B2DConstants.PPM, 50, 25);
    }

    //Getters and setters
    //All the interesting code is above here
    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    @Override
    public BulletUserData getUserData() {
        return (BulletUserData) userData;
    }

    public void setPosi_y(float posi_y) {
        this.posi_y = posi_y;
    }

    public float getPosi_y() {
        return posi_y;
    }

    public Body getBody() {
        return body;
    }


}
