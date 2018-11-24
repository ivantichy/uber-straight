package model;

public class Test {

	public static void main(String[] args) {

		System.out.println(
				Parent.allParents().get(0).getStructure().getCdSmiles());
	}
}
