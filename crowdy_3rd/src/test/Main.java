package test;


public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "°í¾çÀÌ";
		cat.sound = "¾ß¿Ë";
		
		Dog dog = new Dog();
		dog.name = "°­¾ÆÁö";
		dog.sound = "¸Û¸Û";
		
		Tiger tiger = new Tiger();
		tiger.name = "È£¶ûÀÌ";
		tiger.sound = "¾îÈï";
		
		Dolphin dolphin =new Dolphin();
		dolphin.name = "µ¹°í·¡";
		dolphin.sound = "ÃÊÀ½ÆÄ";
		
		Goldfish goldfish = new Goldfish();
		goldfish.name = "±ÝºØ¾î";
		goldfish.sound = "";
		
		Parrot parrot = new Parrot();
		parrot.name = "¾Þ¹«»õ";
		parrot.sound = "¾Þ¹«»õ";
		
		Chicken chicken = new Chicken();
		chicken.name = "´ß";
		chicken.sound = "²¿³¢¿À";
		
		Cow cow = new Cow();
		cow.name = "¼Ò";
		cow.sound = "À½¸Þ";
		
		Pig pig = new Pig();
		pig.name = "µÅÁö";
		pig.sound = "²Ü²Ü";
		
		Wolf wolf = new Wolf();
		wolf.name = "´Á´ë";
		wolf.sound = "¾Æ¿À";
		
		Monkey monkey = new Monkey();
		monkey.name = "¿ø¼þÀÌ";
		monkey.sound = "³¢³¢";
		
		Frog frog = new Frog();
		frog.name = "°³±¸¸®";
		frog.sound = "°³±¼";
		
		Cicada cicada = new Cicada();
		cicada.name = "¸Å¹Ì";
		cicada.sound = "¸É¸É";
		
		Duck duck = new Duck();
		duck.name = "¿À¸®";
		duck.sound = "²Ð²Ð";
		
		Dove dove = new Dove();
		dove.name = "ºñµÑ±â";
	    dove.sound = "±¸±¸";
	    
	    Mosquito mosquito = new Mosquito();
	    mosquito.name = "¸ð±â";
	    mosquito.sound = "¾Þ¾Þ";
	    
	    Bat bat = new Bat();
	    bat.name = "³ª¹æ";
	    bat.sound = "ÃÊÀ½ÆÄ";
		
	    Octopus octopus = new Octopus();
	    octopus.name = "¹®¾î";
	    octopus.sound = "";
	    
	    Horse horse = new Horse();
	    horse.name = "¸»";
	    horse.sound = "È÷À×";
	    
	    Mouse mouse = new Mouse();
	    mouse.name = "Áã";
	    mouse.sound = "ÂïÂï";
	    
		Animal[] rooms = new Animal[20];
		rooms[0]=cat;
		rooms[1]=dog;
		rooms[2]=dolphin;
		rooms[3]=goldfish;
		rooms[4]=parrot;
		rooms[5]=chicken;
		rooms[6]=cow;
		rooms[7]=pig;
		rooms[8]=wolf;
		rooms[9]=monkey;
		rooms[10]=frog;
		rooms[11]=cicada;
		rooms[12]=duck;
		rooms[13]=dove;
		rooms[14]=mosquito;
		rooms[15]=bat;
		rooms[16]=octopus;
		rooms[17]=horse;
		rooms[18]=mouse;
		rooms[19]=tiger;
		
		Test test = new Test();
		//test.getRandom(¹è¿­,·£´ýÀ¸·Î »ÌÀ» ¼ýÀÚ);
		test.getRandom(rooms,3);
		
	}
}
