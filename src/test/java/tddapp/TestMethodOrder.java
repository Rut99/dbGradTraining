package tddapp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMethodOrder {
@Test
public void teztZ() {
	System.out.println("Z");
}
@Test
public void teztM() {
	System.out.println("M");
}
@Test
public void teztD() {
	System.out.println("D");
}
@Test
public void teztY() {
	System.out.println("Y");
}
@Test
public void teztA() {
	System.out.println("A");
}
}
