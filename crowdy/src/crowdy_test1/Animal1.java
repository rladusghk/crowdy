package crowdy_test1;

import java.util.ArrayList;
import java.util.Random;

public class Animal1 {
public static void main(String[] args) {
		//31���� �����̸� �迭
		String[] animals =
			{"0�����","1������","2ȣ����","3����","4�ݺؾ�","5�޹���","6��","7��","8����","9����","10������","11������","12�Ź�","13����","14��ѱ�","15���","16��","17����","18���ű�","19��¡��","20����","21�ξ���","22�ڳ���","23��","24��","25����","26����","27���Ƹ�","28���","29����","30��½��"};
		//���� �̸��� ���� �ε����� �����Ҹ� �迭
		String[] animalSound =
			{"0�߿�","1�۸�","2����","","","5�޹���","6������","7����","8�ܲ�","9�ƿ�","10����","11����","12�ɸ�","13�в�","14����","15�޾�","16�ž�","","18����","","20±±","21�ξ�","22�ѿ�","23����","24����","","","27�߾�","28���","29����","30��½"};
		ArrayList<String> ranAnimalSound = new ArrayList<String>();
		ArrayList<String> ranAnimals = new ArrayList<String>();
		//Random API
		Random r = new Random();
		//�ε����� �������� ����
		for(int i = 0; i < 20; i++){
		int idx = r.nextInt(animals.length);
		//�ε����� ���� ������ �����Ҹ� 
		//�������� 1���� ���
		String ranAnimal = (animals[idx]);
		String ranSound = (animalSound[idx]);
		ranAnimals.add(ranAnimal);
		ranAnimalSound.add(ranSound);
		if(ranAnimal=="4�ݺؾ�" || ranAnimal=="19��¡��"|| ranAnimal=="26����"){
			//�ݺؾ ������� ���� ���Ѵ�.
			System.out.println(ranAnimal+"����/ ���� ���Ѵ�.");
		}else if(ranAnimal=="3����"||ranAnimal=="17����"||ranAnimal=="25����"){
			//������ ����� �����ĸ� ����.
			System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� ���� �Ҹ��� ���.");
			System.out.println("-������");
		}else if(ranAnimal=="5�޹���"){
			//�޹����� �Ҹ��� �����Ѵ�.
			System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
			// �����ϴ� ���� random���� ���
			if(ranAnimalSound.indexOf(ranSound)-1==-1||ranAnimalSound.get(ranAnimalSound.indexOf(ranSound)-1)==""){
				//�����Ҹ��� ���ų� �������� ������ �������� ���Ѵ�.
				System.out.println("-�޹��� ������ �Ҹ��� ����.");
			}else{
				//�����Ҹ��� ������ �����Ѵ�.
				System.out.print("-"+ranAnimals.get(ranAnimalSound.indexOf(ranAnimal)-1)+"�� �����Ҹ��� �����Ѵ�.");
				System.out.println("-"+ranAnimalSound.get(ranAnimalSound.indexOf(ranSound)-1));
			}//if~else end
		}else{
			System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
			System.out.println("-"+ranSound);
		}//if~end end
		}//for()end
	}//main() end
}//class Animal1 end
