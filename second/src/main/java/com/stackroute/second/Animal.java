package com.stackroute.second;

public class Animal {
double weight;float height;Point p;Point name;
public Point getName() {
	return name;
}
public void setName(Point name) {
	this.name = name;
}
public Animal(double weight, float height, Point p) {
	super();
	this.weight = weight;
	this.height = height;
	this.p = p;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public Point getP() {
	System.out.println("reference chaka");
	return p;
}
public void setP(Point p) {
	this.p = p;
}

}
