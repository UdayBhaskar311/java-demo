package com.PolymorphismClass;

public class PolymorphismClassNamerunner {
	public static void main(String[] args) {
		PolymorphismClassName glamour = new GlamourBike();
		PolymorphismClassName pulsur = new PulsurBike();
		glamour.executeAction();
		pulsur.executeAction();

	}

}
