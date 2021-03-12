import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RecursieTest {

	@Test(expected = IllegalArgumentException.class)
	public void testOef1_Fibonacci_Met_Negatieve_Parameter_Gooit_exception() {
		Recursie.fibonacci(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOef1_Fibonacci_Met_Nul_Als_Parameter_Gooit_exception() {
		Recursie.fibonacci(0);
	}
	
	@Test
	public void testOef1_Fibonacci_Met_1_Als_Parameter_Geeft_1() {
		assertEquals(1,Recursie.fibonacci(1));
	}
	
	@Test
	public void testOef1_Fibonacci_Met_2_Als_Parameter_Geeft_1() {
		assertEquals(1,Recursie.fibonacci(2));
	}
	
	@Test
	public void testOef1_Fibonacci_Met_parameter_groter_dan_2_Geeft_som_van_2_voorgaande() {
		int n = (int) ((Math.random() * 30) + 3);  
		int f1 = Recursie.fibonacci(n-2);
		int f2 = Recursie.fibonacci(n-1);
		int f = Recursie.fibonacci(n);
		assertEquals(f,f1+f2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef3_KeerOm_Met_Geen_Parameter_Gooit_Exception() {
		Recursie.keerOm(null);
	}
	
	@Test
	public void testOef3_KeerOm_Met_lege_string_geeft_lege_string() {
		assertEquals("", Recursie.keerOm(""));
	}
	
	@Test
	public void testOef3_KeerOm_Met_String_van_lengte_1_geeft_zelfde_string() {
		assertEquals("a", Recursie.keerOm("a"));
	}
	
	@Test
	public void testOef3_KeerOm_Met_String_van_lengte_langer_Dan_1_geeft_omgekeerde_string() {
		assertEquals("abcdef", Recursie.keerOm("fedcba"));
	}
	
	@Test
	public void testOef2_Som_vanCijfers_getal_bestaand_uit_1_cijfer_geeft_de_absolute_waarde_van_getal_() {
		for (int i = -9 ; i <= 9 ; i++){
			assertEquals(Math.abs(i), Recursie.somVanCijfers(i));
		}
	}
	
	@Test
	public void testOef2_Som_vanCijfers_getal_bestaand_uit_meer_cijfers_geeft_de_absolute_waarde_van_de_som_van_zijn_cijfers() {
		assertEquals(12,Recursie.somVanCijfers(435));
		assertEquals(13,Recursie.somVanCijfers(-1435));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef4_CountX_geen_string_gooit_exception() {
		Recursie.countX(null);
	}
	
	@Test
	public void testOef4_CountX_Lege_string_geeft_nul() {
		assertEquals(0,Recursie.countX(""));
	}
	
	@Test
	public void testOef4_CountX_String_Met_x_en_Geeft_aantal_x_en() {
		assertEquals(4,Recursie.countX("xabcxxjkx"));
	}
	
	@Test
	public void testOef4_CountX_String_zonder_x_en_Geeft_nul() {
		assertEquals(0,Recursie.countX("abcjk"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef5_CountHi_geen_string_gooit_exception() {
		Recursie.countHi(null);
	}
	
	@Test
	public void testOef5_CountHi_String_Met_Hi_en_Geeft_aantal_hi_en() {
		assertEquals(3,Recursie.countHi("hiabcxhihihjkx"));
	}
	
	@Test
	public void testOef5_CountHi_String_Met_1_Hi_Geeft_1() {
		assertEquals(1,Recursie.countHi("hiabcx"));
	}
	
	@Test
	public void testOef5_CountHi_String_Zonder_Hi_en_Geeft_nul() {
		assertEquals(0,Recursie.countHi("ihabcxihhjkx"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef6_ChangeXY_geen_string_gooit_exception() {
		Recursie.changeXY(null);
	}
	
	@Test
	public void testOef6_ChangeXY_String_Met_x_en_Vervangt_x_en_door_y() {
		assertEquals("hyyabcyjky",Recursie.changeXY("hxxabcxjkx"));
	}
	
	@Test
	public void testOef6_ChangeXY_String_Zonder_x_en_Geeft_originele_string() {
		assertEquals("habcjkd",Recursie.changeXY("habcjkd"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef7_ChangePi_geen_string_gooit_exception() {
		Recursie.changePi(null);
	}
	
	@Test
	public void testOef7_ChangePi_String_Met_pi_en_Vervangt_pi_en_door_3Punt14() {
		assertEquals("3.143.14xxx3.14abcp",Recursie.changePi("pipixxxpiabcp"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef8_Tweelog_Negatieve_parameter_gooit_exception() {
		Recursie.tweelog(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef8_Tweelog_Nul_gooit_exception() {
		Recursie.tweelog(0);
	}
	
	@Test
	public void testOef8_Tweelog_1_Geeft_0() {
		assertEquals(0,Recursie.tweelog(1));
	}
	
	@Test
	public void testOef8_Tweelog_2demacht_Geeft_Macht_Van_Twee() {
		assertEquals(10,Recursie.tweelog(1024));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef9_FindMaximum_Geen_lijst_gooit_exception() {
		Recursie.findMaximum(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef9_FindMaximum_Lege_lijst_gooit_exception() {
		Recursie.findMaximum(new ArrayList<Double>());
	}
	
	@Test
	public void testOef9_FindMaximum_lijst_Met_1_Element_Geeft_Element() {
		ArrayList<Double> lijst = new ArrayList<Double>();
		lijst.add(-5.5);
		assertEquals(-5.5,Recursie.findMaximum(lijst),0.1);
	}
	
	@Test
	public void testOef9_FindMaximum_lijst_Met_Meer_Elementen_Geeft_Grootste() {
		ArrayList<Double> lijst = new ArrayList<Double>();
		lijst.add(-5.5);
		lijst.add(1.1);
		lijst.add(1.0);
		lijst.add(0.0);
		
		assertEquals(1.1,Recursie.findMaximum(lijst),0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOef10_FindSubstrings_geen_string_gooit_exception() {
		Recursie.findSubstrings(null);
	}
	
	@Test
	public void testOef10_FindSubstrings_lege_string_geeft_arraylist_met_enkel_lege_String() {
		ArrayList<String> res = Recursie.findSubstrings("");
		assertEquals(1,res.size());
		assertEquals("",res.get(0));
	}
	
	@Test
	public void testOef10_FindSubstrings_String_Met_Lengte_1_geeft_arraylist_met_1_String_Namelijk_Gegeven_String() {
		ArrayList<String> res = Recursie.findSubstrings("a");
		assertEquals(1,res.size());
		assertEquals("a",res.get(0));
	}
	
	@Test
	public void testOef10_FindSubstrings_String_Met_Lengte_Meer_Dan_1_geeft_arraylist_Met_Strings() {
		ArrayList<String> res = Recursie.findSubstrings("abc");
		assertEquals(7,res.size());
		assertTrue(res.contains("a"));
		assertTrue(res.contains("b"));
		assertTrue(res.contains("c"));
		assertTrue(res.contains("ab"));
		assertTrue(res.contains("ac"));
		assertTrue(res.contains("bc"));
		assertTrue(res.contains("abc"));
	}
	
	@Test
	public void testOef11_aantalKaarten_1_verdiepingen_Geeft_2() {
		assertEquals(2, Recursie.aantalKaarten(1));
	}

	@Test
	public void testOef11_aantalKaarten_2_verdiepingen_Geeft_7() {
		assertEquals(7, Recursie.aantalKaarten(2));
	}

	@Test
	public void testOef11_aantalKaarten_3_verdiepingen_Geeft_15() {
		assertEquals(15, Recursie.aantalKaarten(3));
	}

	@Test
	public void testOef11_aantalKaarten_12_verdiepingen_Geeft_222() {
		assertEquals(222, Recursie.aantalKaarten(12));
	}

	@Test
	public void testOef11_aantalKaarten_20_verdiepingen_Geeft_610() {
		assertEquals(610, Recursie.aantalKaarten(20));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOef11_aantalKaarten_Null_gooit_exception() {
		Recursie.aantalKaarten(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOef11_aantalKaarten_negatief_gooit_exception() {
		Recursie.aantalKaarten(-10);
	}
	
	
}
