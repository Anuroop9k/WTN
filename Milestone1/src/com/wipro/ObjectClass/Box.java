package com.wipro.ObjectClass;

public class Box {
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volume() {
		return width*height*depth;
	}
	int area() {
		return width*height;
	}
}

