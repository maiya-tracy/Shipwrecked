package com.shipwrecked.game.controllers;

public class ThreadController extends Thread{
	public void run(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GameCtrl.test();
	}
}