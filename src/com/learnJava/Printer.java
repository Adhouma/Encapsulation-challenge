package com.learnJava;

public class Printer {
	// Fields
	private int tonerLevel = 100;
	private int pageNumbers;
	private boolean duplexPrinter;
	
	// Constructor
	public Printer(int tonerLevel, int pageNumbers, boolean duplexPrinter) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}
		this.pageNumbers = pageNumbers;
		this.duplexPrinter = duplexPrinter;
	}

	// Methods
	public void filupToner(int size) {
		System.out.println("Filling toner ...");
		this.tonerLevel = this.tonerLevel + size;
		if (this.tonerLevel > 100) {
			System.out.println("Can't fill more than 100%");
			this.tonerLevel = 100;
		}
		System.out.println("Toner successflly filled up to " + this.getTonerLevel() + "%");
	}
	
	public void printPages(int pageNumbers, boolean duplex) {
		if (duplex) {
			System.out.println("Printing " + pageNumbers + ", duplex option is ON ...");
		} else {
			System.out.println("Printing " + pageNumbers + ", duplex option is OFF ...");
		}
	}
	
	// Getters and setters
	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}

	public void setDuplexPrinter(boolean duplexPrinter) {
		this.duplexPrinter = duplexPrinter;
	}
}
