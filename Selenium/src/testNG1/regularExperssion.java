package testNG1;

import org.testng.annotations.Test;

public class regularExperssion {
  @Test (groups = {"veg.dosa"})
  public void dosa() {
	  System.out.println("dosa");	  
  }
  @Test (groups = {"veg.idly"})
  public void idly() {
	  System.out.println("idly");	  
  }
  @Test (groups = {"veg.pongal"})
  public void pongal() {
	  System.out.println("pongal");	  
  }
  @Test (groups = {"veg.upuma"})
  public void upuma() {
	  System.out.println("upuma");	  
  }
  @Test (groups = {"nonveg.chickenBiriyani"})
  public void chickenBriyani() {
	  System.out.println("chickenBriyani");	  
  }
  @Test (groups = {"nonveg.muttonBiriyani"})
  public void muttonBiriyani() {
	  System.out.println("muttonBiriyani");	  
  }
  @Test (groups = {"nonveg.chickenGravy"})
  public void chickenGravy() {
	  System.out.println("chickenGravy");	  
  }
  @Test (groups = {"nonveg.muttonGravy"})
  public void muttonGravy() {
	  System.out.println("muttonGravy");	  
  }
  @Test (groups = {"eggDosa"})
  public void eggDosa() {
	  System.out.println("eggDosa");	  
  }@Test (groups = {"eggFry"})
  public void eggFry() {
	  System.out.println("eggFry");	  
  }
}
