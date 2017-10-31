package test;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	public void getRandom(Animal[] rooms,int n) {
		Random r = new Random();//Random API
		//n개의 숫자 배열
	    int num[] = new int[n];
	    //n개의 중복제거 랜덤숫자
	    for(int i=0;i<num.length;i++){
	    	//r.nextInt(animals.length)=동물마리수만큼 랜덤숫자
	    	num[i] = r.nextInt(rooms.length);
	        for(int j=0;j<i;j++) {
	            if(num[i]==num[j]){
	                i--;
	            }//if()end
	        }//for() end 중복 제거
		}
	    
	    for(int k=0;k<n;k++){
	    	//n마리 동물과 울음소리 Arraylist
	    	ArrayList<String> ranAnimals = new ArrayList<String>();
			ArrayList<String> ranSounds = new ArrayList<String>();
	    	//num[] 배열에 차례대로 저장된 숫자(중복제거 랜덤 숫자)에따른 동물과 동물소리 값 얻기
	    	String ranAnimal = (rooms[num[k]].name);
			String ranSound = (rooms[num[k]].sound);
			//뽑힌 n개의 동물과 동물소리를 ArratList에 입력 - 인덱스에따른 데이터를 얻어오기 위해
			ranAnimals.add(ranAnimal);
			ranSounds.add(ranSound);
			if(ranSound.equals("")){
				System.out.println(ranAnimal+"는은/ 울지 못한다.");
			}else if(ranSound.equals("초음파")){
				System.out.print(ranAnimal+"는/은 인간이 들을 수 없는 소리로 운다.");
				System.out.println("-"+ranSound);
			}else if(ranSound.equals("앵무새")){
				System.out.print(ranAnimal+"는/은 인간이 들을 수 있는 소리로 운다.");
				//앵무새가 맨앞에 있거나, 앵무새 앞의 동물소리가 없으면
				if(ranSounds.indexOf(ranSound)-1==-1||ranSounds.get(ranSounds.indexOf(ranSound)-1).equals("")){
					System.out.println("-앵무새 고유의 소리를 낸다.");
				}else{
					//앵무새 앞의 동물, 앵무새 앞의 동물소리
					System.out.print("-"+ranAnimals.get(ranSounds.indexOf(ranAnimal)-1)+"의 울음소리를 따라한다.");
					System.out.println("-"+ranSounds.get(ranSounds.indexOf(ranSound)-1));
				}//if~else end
			}else{
				System.out.print(ranAnimal+"는/은 인간이 들을 수 있는 소리로 운다.");
				System.out.println("-"+ranSound);
			}//if~end end
        }//for()end
		
	}
	
}//Test() end
