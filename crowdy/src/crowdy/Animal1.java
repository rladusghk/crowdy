package crowdy;

import java.util.Random;

public class Animal1 {
public static void main(String[] args) {
	//20���� �����̸� �迭
	String[] animals =
		{"�����","������","ȣ����","����","�ݺؾ�","�޹���","��","��","����","����","������","������","�Ź�","����","��ѱ�","���","��","����","���ű�","��¡��"};
	//���� �̸��� ���� �ε����� �����Ҹ� �迭
	String[] animalSound =
		{"�߿�","�۸�","����","","","","������","����","�ܲ�","�ƿ�","����","����","�ɸ�","�в�","����","�޾�","�ž�","","����",""};
	//Random API
	Random r = new Random();
	//�ε����� �������� ����
	int idx = r.nextInt(animals.length);
	//�ε����� ���� ������ �����Ҹ� 
	//�������� 1���� ���
	String ranAnimal = (animals[idx]);
	String ranSound = (animalSound[idx]);
	if(ranAnimal=="�ݺؾ�" || ranAnimal=="��¡��"){
		//�ݺؾ ������� ���� ���Ѵ�.
		System.out.println(ranAnimal+"����/ ���� ���Ѵ�.");
	}else if(ranAnimal=="����" || ranAnimal=="����"){
		//������ ����� �����ĸ� ����.
		System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� ���� �Ҹ��� ���.");
		System.out.println("-������");
	}else if(ranAnimal=="�޹���"){
		//�޹����� �Ҹ��� �����Ѵ�.
		System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
		// �����ϴ� ���� random���� ���
		int reIdx = r.nextInt(animals.length);
		String reAnimal = (animals[reIdx]);
		String reSound = (animalSound[reIdx]);
		if(reSound==""){
			//�����Ҹ��� ���ų� �������� ������ �������� ���Ѵ�.
			System.out.println("-"+reAnimal+"�� �����Ҹ��� �������� ���Ѵ�.");
		}else{
			//�����Ҹ��� ������ �����Ѵ�.
			System.out.print("-"+reAnimal+"�� �����Ҹ��� �����Ѵ�.");
			System.out.println("-"+reSound);
		}//if~else end
	}else{
		System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
		System.out.println("-"+ranSound);
	}//if~end end
	}//main() end
}//class Animal1 end
