package com.training.Client;

import java.util.Scanner;
import java.util.logging.Logger;

import com.training.Exceptions.BackwardDisIsLessThanForwardDis;
import com.training.Exceptions.ValueIsZeroOrNegativeException;
import com.training.service.CarUtils;

public class AssisgmentDemo {

	public static void main(String[] args) {
		int F;
		int B;
		int T;
		int D;
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter Forward Distance: ");
		 F = scanner.nextInt();
		System.out.println("Enter Backawrd Distance: ");
		 B = scanner.nextInt();
		System.out.println("Enter Time reuired for 1 meter: ");
		 T = scanner.nextInt();
		System.out.println("Enter Distance btween car and wall: ");
		 D = scanner.nextInt();
		 
		 try{
			CarUtils carUtil =  new CarUtils();
			carUtil.checkIfZeroOrNegative(F);
			carUtil.checkIfZeroOrNegative(B);
			carUtil.checkIfZeroOrNegative(T);
			carUtil.checkIfZeroOrNegative(D);
			System.out.println("F:"+F+" B:"+B+" T:"+T+" D:"+D);
			carUtil.CheckIfBLessThanF(B,F);
			
			System.out.println(""+carUtil.calculateTotalTime(B, F, T, D));
		 }catch(ValueIsZeroOrNegativeException e){
			 System.out.println(e.getMessage());
		 } catch (BackwardDisIsLessThanForwardDis e) {
			System.out.println(e.getMessage());
			
		}
		 
		 
		 
	}
}
