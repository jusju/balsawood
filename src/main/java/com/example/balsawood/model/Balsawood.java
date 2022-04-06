package com.example.balsawood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Balsawood {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double weight;
	private double length;
	private double width;
	private double thickness;
	private double density;
	private String grain;
	
	public Balsawood() {
		super();
	}
	public Balsawood(double weight, double length,
			double width, double thickness, 
			double density, String grain) {
		super();
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.density = density;
		this.grain = grain;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	public String getGrain() {
		return grain;
	}
	public void setGrain(String grain) {
		this.grain = grain;
	}
	@Override
	public String toString() {
		return "Balsawood [id=" + id + ", weight=" + weight + ", length=" + length + ", width=" + width + ", thickness="
				+ thickness + ", density=" + density + ", grain=" + grain + "]";
	}
	
	
	
	
}
