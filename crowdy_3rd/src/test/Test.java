package test;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	public void getRandom(Animal[] rooms,int n) {
		Random r = new Random();//Random API
		//n���� ���� �迭
	    int num[] = new int[n];
	    //n���� �ߺ����� ��������
	    for(int i=0;i<num.length;i++){
	    	//r.nextInt(animals.length)=������������ŭ ��������
	    	num[i] = r.nextInt(rooms.length);
	        for(int j=0;j<i;j++) {
	            if(num[i]==num[j]){
	                i--;
	            }//if()end
	        }//for() end �ߺ� ����
		}
	    
	    for(int k=0;k<n;k++){
	    	//n���� ������ �����Ҹ� Arraylist
	    	ArrayList<String> ranAnimals = new ArrayList<String>();
			ArrayList<String> ranSounds = new ArrayList<String>();
	    	//num[] �迭�� ���ʴ�� ����� ����(�ߺ����� ���� ����)������ ������ �����Ҹ� �� ���
	    	String ranAnimal = (rooms[num[k]].name);
			String ranSound = (rooms[num[k]].sound);
			//���� n���� ������ �����Ҹ��� ArratList�� �Է� - �ε��������� �����͸� ������ ����
			ranAnimals.add(ranAnimal);
			ranSounds.add(ranSound);
			if(ranSound.equals("")){
				System.out.println(ranAnimal+"����/ ���� ���Ѵ�.");
			}else if(ranSound.equals("������")){
				System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� ���� �Ҹ��� ���.");
				System.out.println("-"+ranSound);
			}else if(ranSound.equals("�޹���")){
				System.out.print(ranAnimal+"��/�� �ΰ��� ���� �� �ִ� �Ҹ��� ���.");
				//�޹����� �Ǿտ� �ְų�, �޹��� ���� �����Ҹ��� ������
				if(ranSounds.indexOf(ranSound)-1==-1||ranSounds.get(ranSounds.indexOf(ranSound)-1).equals("")){
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
		
	}
	
}//Test() end
