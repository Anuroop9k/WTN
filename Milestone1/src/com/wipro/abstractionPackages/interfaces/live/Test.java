package com.wipro.abstractionPackages.interfaces.live;

import com.wipro.abstractionPackages.interfaces.music.*;
import com.wipro.abstractionPackages.interfaces.music.string.*;
import com.wipro.abstractionPackages.interfaces.music.wind.*;

public class Test {
	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable p1=new Veena();
		p1.play();
		Playable p2=new Saxophone();
		p2.play();
	}
}