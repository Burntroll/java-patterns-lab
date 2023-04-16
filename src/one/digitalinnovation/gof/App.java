package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.NormalBehavior;
import one.digitalinnovation.gof.strategy.DefensiveBehavior;
import one.digitalinnovation.gof.strategy.AggressiveBehavior;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.Robot;

public class App {
  // Tests related to Design Pattern
  // Singleton
  public static void main(String[] args) {
    SingletonLazy lazy =  SingletonLazy.getInstance();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);
    eager  = SingletonEager.getInstance();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
    System.out.print(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstance();
    System.out.print(lazyHolder);

    // Strategy

    Behavior normal = new NormalBehavior();
    Behavior defensive = new DefensiveBehavior();
    Behavior aggressive = new AggressiveBehavior();

    Robot robot = new Robot();
    robot.setBehavior(normal);
    robot.move();
    robot.setBehavior(defensive);
    robot.move();
    robot.setBehavior(aggressive);
    robot.move();

  // Facade

  Facade facade = new Facade();
  facade.migrateClient("Francisco", "181651");

  }
  
}
