package A;

public class PatternRobots {
	
	public static void fight(Robot robot1, Robot robot2) {
		int tick1=robot1.getFreq();
		int tick2=robot2.getFreq();
		while(robot2.diffLife(0)>0 && robot1.diffLife(0)>0) {
			int tick=Math.min(tick1, tick2);
			tick1-=tick;
			tick2-=tick;
			if (tick1==0) {// robot 1 feu
				tick1=shoot(robot1,robot2);
			}
			if (tick2==0) {// robot 2 feu
				tick2=shoot(robot2,robot1);
			}
		}
	}
	
	private static int shoot(Robot robot1, Robot robot2) {
		int dmg=Math.max(0,robot1.getCanon()-robot2.getShield());
		int lost=robot2.diffLife(0)-robot2.diffLife(-dmg);
		System.out.println(robot1.getName()+" shoots for "+lost);
		if (robot2.diffLife(0)<=0) {
			System.out.println("Kabooom "+robot2.getName());
		}
		return robot1.getFreq();
	}
	
	public static void main(String[] args) {
		Robot robot1 = new Stats_Builder.Builder("Robocop").getCanon(2).getVie(50).getBouclier(2).getFreq(200).build();
				// un robot avec un canon de 10, un bouclier de 2, une fréquence de tir de 100 et qui a reçu une amélioration de canon multipliant la puissance de ce dernier par 2.
		Robot robot2 = new Stats_Builder.Builder("Terminator").build();
				// un robot avec un canon de 9, un bouclier de 3, une fréquence de tir de 90
					// et qui a reçu une amélioration de bouclier multipliant ce dernier par 2 et une amélioration de mitigation des dégats qui réduit les points de vue perdus par 2.

		Robot robot1_temp = robot1;

//		Question 1
//    fight(robot1, robot2);
//		System.out.println(robot1.getName());
//		System.out.println(robot1.getCanon());

		// Question 2
//		System.out.println("Améliorations");
//
////		System.out.println("Robot 1 : ");
////		System.out.println(robot1.getName());
////		System.out.println("Canon avant amélioration " + robot1.getCanon());
////		System.out.println("Canon après amélioration par 2 " + new CanonUpgrade(robot1).getCanon());
////		System.out.println("Canon après amélioration coefficient différent = 3 " + new CanonUpgrade(robot1, 3).getCanon());
////
////		System.out.println("Robot 1 : canon ");
////		System.out.println(robot1.getCanon());
//
//
//		System.out.println("Robot 1 : ");
//		System.out.println(robot1.getName());
//		System.out.println("Canon avant amélioration " + robot1.getCanon());
//
//		robot1 = new CanonUpgrade(robot1);
//
//		System.out.println("Canon après amélioration par 2 "  + robot1.getCanon());
////		System.out.println("Canon après amélioration coefficient différent = 3 " + new CanonUpgrade(robot1, 3).getCanon());
//
//		System.out.println("Robot 1 : canon ");
//		System.out.println(robot1.getCanon());
//
//		System.out.println("Robot 1 : Valeur canon à la création ( censé renvoyer 2 ) ");
//		System.out.println(robot1_temp.getCanon());

		// Question 3
		FactoryFlyweight factory = new FactoryFlyweight();

		factory.putFactory("Pic Vert", new PicVert());
		factory.putFactory("Tank", new Tank());

		Robot robot3 = factory.create("Pic Vert");
		Robot robot4 = factory.create("Tank");

		fight(robot3, robot4);


	}
}
