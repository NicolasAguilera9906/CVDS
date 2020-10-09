package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

   @Test
    public void validateInvalidAge(){
       Person person = new Person();
       person.setAge(-1);
       person.setAlive(true);
       RegisterResult result = registry.registerVoter(person);
       Assert.assertEquals(RegisterResult.INVALID_AGE, result);
   }

   @Test
    public void validateDead(){
       Person person = new Person();
       person.setAlive(false);
       RegisterResult result = registry.registerVoter(person);
       Assert.assertEquals(RegisterResult.DEAD, result);
   }

   @Test
    public void validateDuplicateId(){
       Person personOne = new Person();
       personOne.setId(1014597690);
       personOne.setAlive(true);
       personOne.setAge(24);
       registry.registerVoter(personOne);
       Person personTwo = new Person();
       personTwo.setId(1014597690);
       personTwo.setAlive(true);
       personTwo.setAge(44);
       RegisterResult result = registry.registerVoter(personTwo);
       Assert.assertEquals(RegisterResult.DUPLICATED, result);
   }

   @Test
    public void validateValidRegister(){
       Person person = new Person();
       person.setAge(20);
       person.setAlive(true);
       person.setId(10304021);
       RegisterResult result = registry.registerVoter(person);
       Assert.assertEquals(RegisterResult.VALID, result);
   }

   @Test
    public void validateUnderage(){
       Person person = new Person();
       person.setAge(15);
       person.setAlive(true);
       person.setId(10304021);
       RegisterResult result = registry.registerVoter(person);
       Assert.assertEquals(RegisterResult.UNDERAGE, result);
   }
}