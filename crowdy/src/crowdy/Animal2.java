package crowdy;

import java.util.Random;

public class Animal2 {
	public static void main(String[] args) {
		//20���� �����̸� �迭
		String[] animals =
			{"�����","������","ȣ����","����","�ݺؾ�","�޹���","��","��","����","����","������","������","�Ź�","����","��ѱ�","���","��","����","���ű�","��¡��"};
		//���� �̸��� ���� �ε����� �����Ҹ� �迭
		String[] animalsSound =
			{"�߿�","�۸�","����","","","","������","����","�ܲ�","�ƿ�","����","����","�ɸ�","�в�","����","�޾�","�ž�","","����",""};
		//�ݺ������� 20���� ��� ���
		for(int i = 0; i < animals.length; i++){
			if(animals[i]=="�ݺؾ�"||animals[i]=="��¡��"){
				//�ݺؾ ������� ���� ���Ѵ�.
				System.out.println(animals[i]+"��/�� ���� ���Ѵ�.");
			}else if(animals[i]=="����"||animals[i]=="����"){
				//������ ����� �����ĸ� ����.
				System.out.print(animals[i]+"��/�� �ΰ��� ���� �� ���� �Ҹ��� ���.");
				System.out.println("-������");
			}else if(animals[i]=="�޹���"){
				//�޹����� �Ҹ��� �����Ѵ�.
				System.out.print(animals[i]+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
				// �����ϴ� ���� random���� ���
				Random r = new Random();
				int reIdx = r.nextInt(animals.length);
				String reAnimal = (animals[reIdx]);
				String reSound = (animalsSound[reIdx]);
				if(reSound==""){
					//�����Ҹ��� ���ų� �������� ������ �������� ���Ѵ�.
					System.out.println("-"+reAnimal+"�� �����Ҹ��� �������� ���Ѵ�.");
				}else{
					//�����Ҹ��� ������ �����Ѵ�.
					System.out.print("-"+reAnimal+"�� �����Ҹ��� �����Ѵ�.");
					System.out.println("-"+reSound);
				}//if~else end
			}else{
				System.out.print(animals[i]+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
				System.out.println("-"+animalsSound[i]);
			}//if~else end
		}//for() end
		
	}//main() end
}//class Animal2 end
