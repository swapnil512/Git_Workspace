package com.training.service;

import com.training.Exceptions.BackwardDisIsLessThanForwardDis;
import com.training.Exceptions.ValueIsZeroOrNegativeException;

public class CarUtils {

	private int distance;

	public int calculateTotalTime(int B, int F, int T, int D) {
		int temp = 0;
		int distanceTravelled = 0;
		while (D != 0 && D > 0) {

			temp = D - B;

			if (temp != 0 && temp > 0) {
				temp = temp + F;
			} else if (temp == 0) {
				distanceTravelled = distanceTravelled + B;
				break;
			} else {
				distanceTravelled = distanceTravelled + D;
				break;
			}

			distanceTravelled = distanceTravelled + B + F;
			D = temp;
		}

		return calculateTime(distanceTravelled, T);

	}

	private int calculateTime(int distanceTravelled, int T) {
		return distanceTravelled * T;
	}

	public boolean checkIfZeroOrNegative(int Value)
			throws ValueIsZeroOrNegativeException {
		if (Value < 0 || Value == 0) {
			throw new ValueIsZeroOrNegativeException("Value " + Value
					+ " is incorrent");
		} else {
			return true;
		}
	}

	public Boolean CheckIfBLessThanF(int b, int f)
			throws BackwardDisIsLessThanForwardDis {
		if (b < f) {
			throw new BackwardDisIsLessThanForwardDis("B  is greater than F");
		} else {
			return true;
		}

	}
}
