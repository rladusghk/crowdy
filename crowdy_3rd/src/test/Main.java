package test;


public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "�����";
		cat.sound = "�߿�";
		
		Dog dog = new Dog();
		dog.name = "������";
		dog.sound = "�۸�";
		
		Tiger tiger = new Tiger();
		tiger.name = "ȣ����";
		tiger.sound = "����";
		
		Dolphin dolphin =new Dolphin();
		dolphin.name = "����";
		dolphin.sound = "������";
		
		Goldfish goldfish = new Goldfish();
		goldfish.name = "�ݺؾ�";
		goldfish.sound = "";
		
		Parrot parrot = new Parrot();
		parrot.name = "�޹���";
		parrot.sound = "�޹���";
		
		Chicken chicken = new Chicken();
		chicken.name = "��";
		chicken.sound = "������";
		
		Cow cow = new Cow();
		cow.name = "��";
		cow.sound = "����";
		
		Pig pig = new Pig();
		pig.name = "����";
		pig.sound = "�ܲ�";
		
		Wolf wolf = new Wolf();
		wolf.name = "����";
		wolf.sound = "�ƿ�";
		
		Monkey monkey = new Monkey();
		monkey.name = "������";
		monkey.sound = "����";
		
		Frog frog = new Frog();
		frog.name = "������";
		frog.sound = "����";
		
		Cicada cicada = new Cicada();
		cicada.name = "�Ź�";
		cicada.sound = "�ɸ�";
		
		Duck duck = new Duck();
		duck.name = "����";
		duck.sound = "�в�";
		
		Dove dove = new Dove();
		dove.name = "��ѱ�";
	    dove.sound = "����";
	    
	    Mosquito mosquito = new Mosquito();
	    mosquito.name = "���";
	    mosquito.sound = "�޾�";
	    
	    Bat bat = new Bat();
	    bat.name = "����";
	    bat.sound = "������";
		
	    Octopus octopus = new Octopus();
	    octopus.name = "����";
	    octopus.sound = "";
	    
	    Horse horse = new Horse();
	    horse.name = "��";
	    horse.sound = "����";
	    
	    Mouse mouse = new Mouse();
	    mouse.name = "��";
	    mouse.sound = "����";
	    
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
		//test.getRandom(�迭,�������� ���� ����);
		test.getRandom(rooms,3);
		
	}
}
