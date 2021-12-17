package com.accenture.lkm.TestValidationProject;

import com.accenture.lkm.validationProject.Validation;

public class TestValidationProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Validation val=new Validation();
		System.out.println(val.checkDataType(123));
		System.out.println(val.checkLength("tfahsvgqewiuidhnhbcgvjhwydg"));
	}

}
