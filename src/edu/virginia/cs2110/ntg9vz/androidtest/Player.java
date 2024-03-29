/**
 * Team: T103-12
 * Group members:
 * Nathan George - ntg9vz
 * Chowkas Ghosh - cg4bd
 * Melissa Murphy - mjm2xm
 * Aditya Chaudhry - ac3xf
 * Xhama Vyas - xdv4zc
 */
package edu.virginia.cs2110.ntg9vz.androidtest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Player extends Character 
{
	public Player(int health, int startX, int startY, int startVelocity, Context context )
	{
		super(context);
		maxHealth = health;
		remainingHealth = maxHealth;
		xCoordinate = startX;
		yCoordinate = startY;
		velocity = startVelocity;
		
		isEnemy = false;
//		
		imageResource = R.drawable.moveforward;
		
		currentWeapon = new AK47(50);
//		Bitmap bMap = BitmapFactory.decodeFile(R.drawable.googlelogo320x480);
//        setImageBitmap(bMap);
	}
	
	public void changeDirection(int newDirection)
	{
		currentDirection = newDirection;
		
		if (currentDirection == 0)
			imageResource = R.drawable.moveforward;
		
		else if (currentDirection == 1)
			imageResource = R.drawable.moveleft;
		
		else if (currentDirection == 2)
			imageResource = R.drawable.movedown;
		
		else
			imageResource = R.drawable.moveright;
		
	}

	public void setKills(int kills) {
		// TODO Auto-generated method stub
		this.kills = kills;
	}

	public void setRemainingHealth(int int1) {
		// TODO Auto-generated method stub
		this.remainingHealth = int1;
		
	}
	
}
