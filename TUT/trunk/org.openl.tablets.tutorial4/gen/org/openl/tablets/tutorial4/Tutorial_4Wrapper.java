/*
 * This class has been generated. Do not change it, if you need to modify functionality - subclass it
 */

package org.openl.tablets.tutorial4;

import org.openl.util.Log;
import org.openl.util.RuntimeExceptionWrapper;
import org.openl.types.java.JavaOpenClass;
import org.openl.types.IOpenClass;
import org.openl.conf.IUserContext;
import org.openl.conf.UserContext;
import org.openl.impl.OpenClassJavaWrapper;
public class Tutorial_4Wrapper implements org.openl.main.OpenLWrapper
{
  Object __instance;

  public static org.openl.types.IOpenClass __class;

  public static org.openl.CompiledOpenClass __compiledClass;

  public static String __openlName = "org.openl.xls";

  public static String __src = "rules/main/Tutorial_4.xls";

  public static String __srcModuleClass = null;

  public static String __folder = "rules";

  public static String __project = "org.openl.tablets.tutorial4";

  public static String __userHome = ".";

  private ThreadLocal<org.openl.vm.IRuntimeEnv> __env = new ThreadLocal<org.openl.vm.IRuntimeEnv>(){
    @Override
    protected org.openl.vm.IRuntimeEnv initialValue() {
      return new org.openl.vm.SimpleVM().getRuntimeEnv();
    }
  };

  public org.openl.vm.IRuntimeEnv getRuntimeEnvironment() {
    return __env.get();
  }

  public void setRuntimeEnvironment(org.openl.vm.IRuntimeEnv environment) {
    __env.set(environment);
  }

  public Tutorial_4Wrapper(){
    this(false);
  }

  public Tutorial_4Wrapper(boolean ignoreErrors){
    __init();
    if (!ignoreErrors) __compiledClass.throwErrorExceptionsIfAny();
    __instance = __class.newInstance(__env.get());
  }



  static org.openl.types.IOpenField policyProfile1_Field;

  public org.openl.tablets.tutorial4.Policy[] getPolicyProfile1()
  {
   Object __res = policyProfile1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setPolicyProfile1(org.openl.tablets.tutorial4.Policy[] __var)
  {
   policyProfile1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField clientTierScoreAdjustmentTest_Field;

  public org.openl.types.impl.DynamicObject[] getClientTierScoreAdjustmentTest()
  {
   Object __res = clientTierScoreAdjustmentTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setClientTierScoreAdjustmentTest(org.openl.types.impl.DynamicObject[] __var)
  {
   clientTierScoreAdjustmentTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField maritalStatus_Field;

  public java.lang.String[] getMaritalStatus()
  {
   Object __res = maritalStatus_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setMaritalStatus(java.lang.String[] __var)
  {
   maritalStatus_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverProfiles3_Field;

  public org.openl.tablets.tutorial4.Driver[] getDriverProfiles3()
  {
   Object __res = driverProfiles3_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Driver[])__res;
  }


  public void setDriverProfiles3(org.openl.tablets.tutorial4.Driver[] __var)
  {
   driverProfiles3_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField policyProfile4_Field;

  public org.openl.tablets.tutorial4.Policy[] getPolicyProfile4()
  {
   Object __res = policyProfile4_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setPolicyProfile4(org.openl.tablets.tutorial4.Policy[] __var)
  {
   policyProfile4_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField testPolicy1_Field;

  public org.openl.tablets.tutorial4.Policy[] getTestPolicy1()
  {
   Object __res = testPolicy1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setTestPolicy1(org.openl.tablets.tutorial4.Policy[] __var)
  {
   testPolicy1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverTypeScoreTest_Field;

  public org.openl.types.impl.DynamicObject[] getDriverTypeScoreTest()
  {
   Object __res = driverTypeScoreTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setDriverTypeScoreTest(org.openl.types.impl.DynamicObject[] __var)
  {
   driverTypeScoreTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField eligibility_type_Field;

  public java.lang.String[] getEligibility_type()
  {
   Object __res = eligibility_type_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setEligibility_type(java.lang.String[] __var)
  {
   eligibility_type_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField injury_rating_Field;

  public java.lang.String[] getInjury_rating()
  {
   Object __res = injury_rating_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setInjury_rating(java.lang.String[] __var)
  {
   injury_rating_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField autoProfiles1_Field;

  public org.openl.tablets.tutorial4.Vehicle[] getAutoProfiles1()
  {
   Object __res = autoProfiles1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Vehicle[])__res;
  }


  public void setAutoProfiles1(org.openl.tablets.tutorial4.Vehicle[] __var)
  {
   autoProfiles1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField autoProfiles2_Field;

  public org.openl.tablets.tutorial4.Vehicle[] getAutoProfiles2()
  {
   Object __res = autoProfiles2_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Vehicle[])__res;
  }


  public void setAutoProfiles2(org.openl.tablets.tutorial4.Vehicle[] __var)
  {
   autoProfiles2_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverRisk_Field;

  public java.lang.String[] getDriverRisk()
  {
   Object __res = driverRisk_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setDriverRisk(java.lang.String[] __var)
  {
   driverRisk_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverProfiles1_Field;

  public org.openl.tablets.tutorial4.Driver[] getDriverProfiles1()
  {
   Object __res = driverProfiles1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Driver[])__res;
  }


  public void setDriverProfiles1(org.openl.tablets.tutorial4.Driver[] __var)
  {
   driverProfiles1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField testDrivers1_Field;

  public org.openl.tablets.tutorial4.Driver[] getTestDrivers1()
  {
   Object __res = testDrivers1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Driver[])__res;
  }


  public void setTestDrivers1(org.openl.tablets.tutorial4.Driver[] __var)
  {
   testDrivers1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField gender_Field;

  public java.lang.String[] getGender()
  {
   Object __res = gender_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setGender(java.lang.String[] __var)
  {
   gender_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField injuryRatingTest_Field;

  public org.openl.types.impl.DynamicObject[] getInjuryRatingTest()
  {
   Object __res = injuryRatingTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setInjuryRatingTest(org.openl.types.impl.DynamicObject[] __var)
  {
   injuryRatingTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField testVehicles1_Field;

  public org.openl.tablets.tutorial4.Vehicle[] getTestVehicles1()
  {
   Object __res = testVehicles1_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Vehicle[])__res;
  }


  public void setTestVehicles1(org.openl.tablets.tutorial4.Vehicle[] __var)
  {
   testVehicles1_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField autoProfiles3_Field;

  public org.openl.tablets.tutorial4.Vehicle[] getAutoProfiles3()
  {
   Object __res = autoProfiles3_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Vehicle[])__res;
  }


  public void setAutoProfiles3(org.openl.tablets.tutorial4.Vehicle[] __var)
  {
   autoProfiles3_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverRiskTest_Field;

  public org.openl.types.impl.DynamicObject[] getDriverRiskTest()
  {
   Object __res = driverRiskTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setDriverRiskTest(org.openl.types.impl.DynamicObject[] __var)
  {
   driverRiskTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverEligibilityTest_Field;

  public org.openl.types.impl.DynamicObject[] getDriverEligibilityTest()
  {
   Object __res = driverEligibilityTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setDriverEligibilityTest(org.openl.types.impl.DynamicObject[] __var)
  {
   driverEligibilityTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField testPolicy2_Field;

  public org.openl.tablets.tutorial4.Policy[] getTestPolicy2()
  {
   Object __res = testPolicy2_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setTestPolicy2(org.openl.tablets.tutorial4.Policy[] __var)
  {
   testPolicy2_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField clientTier_Field;

  public java.lang.String[] getClientTier()
  {
   Object __res = clientTier_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setClientTier(java.lang.String[] __var)
  {
   clientTier_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField car_type_Field;

  public java.lang.String[] getCar_type()
  {
   Object __res = car_type_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setCar_type(java.lang.String[] __var)
  {
   car_type_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField policyProfile3_Field;

  public org.openl.tablets.tutorial4.Policy[] getPolicyProfile3()
  {
   Object __res = policyProfile3_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setPolicyProfile3(org.openl.tablets.tutorial4.Policy[] __var)
  {
   policyProfile3_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField coverage_Field;

  public java.lang.String[] getCoverage()
  {
   Object __res = coverage_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setCoverage(java.lang.String[] __var)
  {
   coverage_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverAgeTypeTest_Field;

  public org.openl.types.impl.DynamicObject[] getDriverAgeTypeTest()
  {
   Object __res = driverAgeTypeTest_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject[])__res;
  }


  public void setDriverAgeTypeTest(org.openl.types.impl.DynamicObject[] __var)
  {
   driverAgeTypeTest_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField theft_rating_Field;

  public java.lang.String[] getTheft_rating()
  {
   Object __res = theft_rating_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setTheft_rating(java.lang.String[] __var)
  {
   theft_rating_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driver_type_Field;

  public java.lang.String[] getDriver_type()
  {
   Object __res = driver_type_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setDriver_type(java.lang.String[] __var)
  {
   driver_type_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField policyProfile2_Field;

  public org.openl.tablets.tutorial4.Policy[] getPolicyProfile2()
  {
   Object __res = policyProfile2_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Policy[])__res;
  }


  public void setPolicyProfile2(org.openl.tablets.tutorial4.Policy[] __var)
  {
   policyProfile2_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField driverProfiles2_Field;

  public org.openl.tablets.tutorial4.Driver[] getDriverProfiles2()
  {
   Object __res = driverProfiles2_Field.get(__instance, __env.get());
   return (org.openl.tablets.tutorial4.Driver[])__res;
  }


  public void setDriverProfiles2(org.openl.tablets.tutorial4.Driver[] __var)
  {
   driverProfiles2_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField this_Field;

  public org.openl.types.impl.DynamicObject getThis()
  {
   Object __res = this_Field.get(__instance, __env.get());
   return (org.openl.types.impl.DynamicObject)__res;
  }


  public void setThis(org.openl.types.impl.DynamicObject __var)
  {
   this_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenField airbag_type_Field;

  public java.lang.String[] getAirbag_type()
  {
   Object __res = airbag_type_Field.get(__instance, __env.get());
   return (java.lang.String[])__res;
  }


  public void setAirbag_type(java.lang.String[] __var)
  {
   airbag_type_Field.set(__instance, __var, __env.get());
  }



  static org.openl.types.IOpenMethod driverRiskTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult driverRiskTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = driverRiskTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverRisk_Method;
  public java.lang.String driverRisk(org.openl.tablets.tutorial4.Driver driver)  {
    Object[] __params = new Object[1];
    __params[0] = driver;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverRisk_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod vehicleEligibility_Method;
  public java.lang.String vehicleEligibility(org.openl.tablets.tutorial4.VehicleCalc c)  {
    Object[] __params = new Object[1];
    __params[0] = c;
    try
    {
    Object __myInstance = __instance;
    Object __res = vehicleEligibility_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod coverageSurcharge_Method;
  public org.openl.meta.DoubleValue coverageSurcharge(org.openl.tablets.tutorial4.Vehicle vehicle)  {
    Object[] __params = new Object[1];
    __params[0] = vehicle;
    try
    {
    Object __myInstance = __instance;
    Object __res = coverageSurcharge_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverRiskPremium_Method;
  public org.openl.meta.DoubleValue driverRiskPremium(org.openl.tablets.tutorial4.DriverCalc di)  {
    Object[] __params = new Object[1];
    __params[0] = di;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverRiskPremium_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod setVehicleEligibilityScore_Method;
  public void setVehicleEligibilityScore(org.openl.tablets.tutorial4.VehicleCalc c)  {
    Object[] __params = new Object[1];
    __params[0] = c;
    try
    {
    Object __myInstance = __instance;
    setVehicleEligibilityScore_Method.invoke(__myInstance, __params, __env.get());  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverEligibilityTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult driverEligibilityTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = driverEligibilityTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverTypeScoreTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult driverTypeScoreTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = driverTypeScoreTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod clientDiscount_Method;
  public org.openl.meta.DoubleValue clientDiscount(java.lang.String clientTier)  {
    Object[] __params = new Object[1];
    __params[0] = clientTier;
    try
    {
    Object __myInstance = __instance;
    Object __res = clientDiscount_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod clientTierScoreAdjustmentTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult clientTierScoreAdjustmentTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = clientTierScoreAdjustmentTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod injuryRatingSurcharge_Method;
  public org.openl.meta.DoubleValue injuryRatingSurcharge(java.lang.String injuryRating)  {
    Object[] __params = new Object[1];
    __params[0] = injuryRating;
    try
    {
    Object __myInstance = __instance;
    Object __res = injuryRatingSurcharge_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod theftRatingSurcharge_Method;
  public org.openl.meta.DoubleValue theftRatingSurcharge(java.lang.String theftRating)  {
    Object[] __params = new Object[1];
    __params[0] = theftRating;
    try
    {
    Object __myInstance = __instance;
    Object __res = theftRatingSurcharge_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod injuryRating_Method;
  public java.lang.String injuryRating(org.openl.tablets.tutorial4.Vehicle vehicle)  {
    Object[] __params = new Object[1];
    __params[0] = vehicle;
    try
    {
    Object __myInstance = __instance;
    Object __res = injuryRating_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod basePrice_Method;
  public org.openl.meta.DoubleValue basePrice(org.openl.tablets.tutorial4.Vehicle vehicle)  {
    Object[] __params = new Object[1];
    __params[0] = vehicle;
    try
    {
    Object __myInstance = __instance;
    Object __res = basePrice_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverAccidentPremium_Method;
  public org.openl.meta.DoubleValue driverAccidentPremium(org.openl.tablets.tutorial4.DriverCalc di)  {
    Object[] __params = new Object[1];
    __params[0] = di;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverAccidentPremium_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod clientTierScoreAdjustment_Method;
  public org.openl.meta.DoubleValue clientTierScoreAdjustment(java.lang.String clientTier)  {
    Object[] __params = new Object[1];
    __params[0] = clientTier;
    try
    {
    Object __myInstance = __instance;
    Object __res = clientTierScoreAdjustment_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod policyEligibility_Method;
  public java.lang.String policyEligibility(org.openl.tablets.tutorial4.Policy p)  {
    Object[] __params = new Object[1];
    __params[0] = p;
    try
    {
    Object __myInstance = __instance;
    Object __res = policyEligibility_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverEligibility_Method;
  public java.lang.String driverEligibility(org.openl.tablets.tutorial4.Driver driver, java.lang.String ageType)  {
    Object[] __params = new Object[2];
    __params[0] = driver;
    __params[1] = ageType;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverEligibility_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverTypeScore_Method;
  public org.openl.meta.DoubleValue driverTypeScore(java.lang.String ageType, java.lang.String eligibility)  {
    Object[] __params = new Object[2];
    __params[0] = ageType;
    __params[1] = eligibility;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverTypeScore_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverAgeTypeTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult driverAgeTypeTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = driverAgeTypeTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod injuryRatingTestTestAll_Method;
  public org.openl.rules.testmethod.TestResult injuryRatingTestTestAll()  {
    Object[] __params = new Object[0];
    try
    {
    Object __myInstance = __instance;
    Object __res = injuryRatingTestTestAll_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.rules.testmethod.TestResult)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverAgeType_Method;
  public java.lang.String driverAgeType(org.openl.tablets.tutorial4.Driver driver)  {
    Object[] __params = new Object[1];
    __params[0] = driver;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverAgeType_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod vehicleDiscount_Method;
  public void vehicleDiscount(org.openl.tablets.tutorial4.VehicleCalc c)  {
    Object[] __params = new Object[1];
    __params[0] = c;
    try
    {
    Object __myInstance = __instance;
    vehicleDiscount_Method.invoke(__myInstance, __params, __env.get());  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod ageSurcharge_Method;
  public org.openl.meta.DoubleValue ageSurcharge(org.openl.tablets.tutorial4.Vehicle vehicle)  {
    Object[] __params = new Object[1];
    __params[0] = vehicle;
    try
    {
    Object __myInstance = __instance;
    Object __res = ageSurcharge_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod theftRating_Method;
  public java.lang.String theftRating(org.openl.tablets.tutorial4.Vehicle vehicle)  {
    Object[] __params = new Object[1];
    __params[0] = vehicle;
    try
    {
    Object __myInstance = __instance;
    Object __res = theftRating_Method.invoke(__myInstance, __params, __env.get());
   return (java.lang.String)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverPremium_Method;
  public org.openl.meta.DoubleValue driverPremium(org.openl.tablets.tutorial4.DriverCalc di)  {
    Object[] __params = new Object[1];
    __params[0] = di;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverPremium_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod driverRiskScore_Method;
  public org.openl.meta.DoubleValue driverRiskScore(java.lang.String risk)  {
    Object[] __params = new Object[1];
    __params[0] = risk;
    try
    {
    Object __myInstance = __instance;
    Object __res = driverRiskScore_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }


  static org.openl.types.IOpenMethod calcDriverPremium_Method;
  public org.openl.meta.DoubleValue calcDriverPremium(org.openl.tablets.tutorial4.DriverCalc di)  {
    Object[] __params = new Object[1];
    __params[0] = di;
    try
    {
    Object __myInstance = __instance;
    Object __res = calcDriverPremium_Method.invoke(__myInstance, __params, __env.get());
   return (org.openl.meta.DoubleValue)__res;  }
  catch(Throwable t)
  {
    Log.error("Java Wrapper execution error:", t);
    throw RuntimeExceptionWrapper.wrap(t);
  }

  }
  static boolean __initialized = false;

  static public void reset(){__initialized = false;}

public Object getInstance(){return __instance;}

public IOpenClass getOpenClass(){return __class;}

public org.openl.CompiledOpenClass getCompiledOpenClass(){return __compiledClass;}

public synchronized void  reload(){reset();__init();__instance = __class.newInstance(__env.get());}

  static synchronized protected void __init()
  {
    if (__initialized)
      return;

    IUserContext ucxt = UserContext.makeOrLoadContext(Thread.currentThread().getContextClassLoader(), __userHome);
    OpenClassJavaWrapper wrapper = OpenClassJavaWrapper.createWrapper(__openlName, ucxt , __src, __srcModuleClass);
    __compiledClass = wrapper.getCompiledClass();
    __class = wrapper.getOpenClassWithErrors();
   // __env.set(wrapper.getEnv());

    policyProfile1_Field = __class.getField("policyProfile1");
    clientTierScoreAdjustmentTest_Field = __class.getField("clientTierScoreAdjustmentTest");
    maritalStatus_Field = __class.getField("maritalStatus");
    driverProfiles3_Field = __class.getField("driverProfiles3");
    policyProfile4_Field = __class.getField("policyProfile4");
    testPolicy1_Field = __class.getField("testPolicy1");
    driverTypeScoreTest_Field = __class.getField("driverTypeScoreTest");
    eligibility_type_Field = __class.getField("eligibility_type");
    injury_rating_Field = __class.getField("injury_rating");
    autoProfiles1_Field = __class.getField("autoProfiles1");
    autoProfiles2_Field = __class.getField("autoProfiles2");
    driverRisk_Field = __class.getField("driverRisk");
    driverProfiles1_Field = __class.getField("driverProfiles1");
    testDrivers1_Field = __class.getField("testDrivers1");
    gender_Field = __class.getField("gender");
    injuryRatingTest_Field = __class.getField("injuryRatingTest");
    testVehicles1_Field = __class.getField("testVehicles1");
    autoProfiles3_Field = __class.getField("autoProfiles3");
    driverRiskTest_Field = __class.getField("driverRiskTest");
    driverEligibilityTest_Field = __class.getField("driverEligibilityTest");
    testPolicy2_Field = __class.getField("testPolicy2");
    clientTier_Field = __class.getField("clientTier");
    car_type_Field = __class.getField("car_type");
    policyProfile3_Field = __class.getField("policyProfile3");
    coverage_Field = __class.getField("coverage");
    driverAgeTypeTest_Field = __class.getField("driverAgeTypeTest");
    theft_rating_Field = __class.getField("theft_rating");
    driver_type_Field = __class.getField("driver_type");
    policyProfile2_Field = __class.getField("policyProfile2");
    driverProfiles2_Field = __class.getField("driverProfiles2");
    this_Field = __class.getField("this");
    airbag_type_Field = __class.getField("airbag_type");
    driverRiskTestTestAll_Method = __class.getMatchingMethod("driverRiskTestTestAll", new IOpenClass[] {
});
    driverRisk_Method = __class.getMatchingMethod("driverRisk", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Driver.class)});
    vehicleEligibility_Method = __class.getMatchingMethod("vehicleEligibility", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.VehicleCalc.class)});
    coverageSurcharge_Method = __class.getMatchingMethod("coverageSurcharge", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Vehicle.class)});
    driverRiskPremium_Method = __class.getMatchingMethod("driverRiskPremium", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.DriverCalc.class)});
    setVehicleEligibilityScore_Method = __class.getMatchingMethod("setVehicleEligibilityScore", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.VehicleCalc.class)});
    driverEligibilityTestTestAll_Method = __class.getMatchingMethod("driverEligibilityTestTestAll", new IOpenClass[] {
});
    driverTypeScoreTestTestAll_Method = __class.getMatchingMethod("driverTypeScoreTestTestAll", new IOpenClass[] {
});
    clientDiscount_Method = __class.getMatchingMethod("clientDiscount", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    clientTierScoreAdjustmentTestTestAll_Method = __class.getMatchingMethod("clientTierScoreAdjustmentTestTestAll", new IOpenClass[] {
});
    injuryRatingSurcharge_Method = __class.getMatchingMethod("injuryRatingSurcharge", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    theftRatingSurcharge_Method = __class.getMatchingMethod("theftRatingSurcharge", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    injuryRating_Method = __class.getMatchingMethod("injuryRating", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Vehicle.class)});
    basePrice_Method = __class.getMatchingMethod("basePrice", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Vehicle.class)});
    driverAccidentPremium_Method = __class.getMatchingMethod("driverAccidentPremium", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.DriverCalc.class)});
    clientTierScoreAdjustment_Method = __class.getMatchingMethod("clientTierScoreAdjustment", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    policyEligibility_Method = __class.getMatchingMethod("policyEligibility", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Policy.class)});
    driverEligibility_Method = __class.getMatchingMethod("driverEligibility", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Driver.class),
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    driverTypeScore_Method = __class.getMatchingMethod("driverTypeScore", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class),
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    driverAgeTypeTestTestAll_Method = __class.getMatchingMethod("driverAgeTypeTestTestAll", new IOpenClass[] {
});
    injuryRatingTestTestAll_Method = __class.getMatchingMethod("injuryRatingTestTestAll", new IOpenClass[] {
});
    driverAgeType_Method = __class.getMatchingMethod("driverAgeType", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Driver.class)});
    vehicleDiscount_Method = __class.getMatchingMethod("vehicleDiscount", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.VehicleCalc.class)});
    ageSurcharge_Method = __class.getMatchingMethod("ageSurcharge", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Vehicle.class)});
    theftRating_Method = __class.getMatchingMethod("theftRating", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.Vehicle.class)});
    driverPremium_Method = __class.getMatchingMethod("driverPremium", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.DriverCalc.class)});
    driverRiskScore_Method = __class.getMatchingMethod("driverRiskScore", new IOpenClass[] {
      JavaOpenClass.getOpenClass(java.lang.String.class)});
    calcDriverPremium_Method = __class.getMatchingMethod("calcDriverPremium", new IOpenClass[] {
      JavaOpenClass.getOpenClass(org.openl.tablets.tutorial4.DriverCalc.class)});

    __initialized=true;
  }
}