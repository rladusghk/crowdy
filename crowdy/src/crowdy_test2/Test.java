package crowdy_test2;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	//���� �迭
	String[] animals =
		{"�����","������","ȣ����","����","�ݺؾ�","�޹���","��","��","����","����","������","������","�Ź�","����","��ѱ�","���","��","����","���ű�","��¡��","����","�ξ���","�ڳ���","��","��","����","����","���Ƹ�","���","����","��½��"};
	//���� �̸��� ���� �ε����� �����Ҹ� �迭
	String[] sounds =
		{"�߿�","�۸�","����","������","","�޹���","������","����","�ܲ�","�ƿ�","����","����","�ɸ�","�в�","����","�޾�","�ž�","������","����","","±±","�ξ�","�ѿ�","����","����","������","","�߾�","���","����","��½"};
	//n���� ������ �����Ҹ� Arraylist
	ArrayList<String> ranAnimals = new ArrayList<String>();
	ArrayList<String> ranSounds = new ArrayList<String>();
	
	public void getRandom(int n){
		Random r = new Random();//Random API
		//n���� ���� �迭
	    int num[] = new int[n];
	    //n���� �ߺ����� ��������
	    for(int i=0;i<num.length;i++){
	    	//r.nextInt(animals.length)=������������ŭ ��������
	    	num[i] = r.nextInt(animals.length);
	        for(int j=0;j<i;j++) {
	            if(num[i]==num[j]){
	                i--;
	            }//if()end
	        }//for() end �ߺ� ����
		}//for() end ���� ����
	    
	    for(int k=0;k<n;k++){
	    	//num[] �迭�� ���ʴ�� ����� ����(�ߺ����� ���� ����)������ ������ �����Ҹ� �� ���
	    	String ranAnimal = (animals[num[k]]);
			String ranSound = (sounds[num[k]]);
			//���� n���� ������ �����Ҹ��� ArratList�� �Է� - �ε��������� �����͸� ������ ����
			ranAnimals.add(ranAnimal);
			ranSounds.add(ranSound);
			if(ranSound==""){
				System.out.println(ranAnimal+"����/ ���� ���Ѵ�.");
			}else if(ranSound=="������"){
				System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� ���� �Ҹ��� ���.");
				System.out.println("-"+ranSound);
			}else if(ranSound=="�޹���"){
				System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
				//�޹����� �Ǿտ� �ְų�, �޹��� ���� �����Ҹ��� ������
				if(ranSounds.indexOf(ranSound)-1==-1||ranSounds.get(ranSounds.indexOf(ranSound)-1)==""){
					System.out.println("-�޹��� ������ �Ҹ��� ����.");
				}else{
					//�޹��� ���� ����, �޹��� ���� �����Ҹ�
					System.out.print("-"+ranAnimals.get(ranSounds.indexOf(ranAnimal)-1)+"�� �����Ҹ��� �����Ѵ�.");
					System.out.println("-"+ranSounds.get(ranSounds.indexOf(ranSound)-1));
				}//if~else end
			}else{
				System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
				System.out.println("-"+ranSound);
			}//if~end end
        }//for()end
	}//getRandom(int n) end
}//Test() end
