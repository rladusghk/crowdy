package crowdy_test2;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	//동물 배열
	String[] animals =
		{"고양이","강아지","호랑이","돌고래","금붕어","앵무새","닭","소","돼지","늑대","원숭이","개구리","매미","오리","비둘기","모기","양","박쥐","갈매기","오징어","참새","부엉이","코끼리","말","쥐","나방","문어","병아리","까마귀","물개","소쩍새"};
	//동물 이름과 같은 인덱스로 울음소리 배열
	String[] sounds =
		{"야옹","멍멍","어흥","초음파","","앵무새","꼬끼오","음메","꿀꿀","아오","끼끼","개굴","맴맴","꽥꽥","구구","앵앵","매애","초음파","끼룩","","짹짹","부엉","뿌우","히잉","찍찍","초음파","","삐약","까악","엉엉","소쩍"};
	//n마리 동물과 울음소리 Arraylist
	ArrayList<String> ranAnimals = new ArrayList<String>();
	ArrayList<String> ranSounds = new ArrayList<String>();
	
	public void getRandom(int n){
		Random r = new Random();//Random API
		//n개의 숫자 배열
	    int num[] = new int[n];
	    //n개의 중복제거 랜덤숫자
	    for(int i=0;i<num.length;i++){
	    	//r.nextInt(animals.length)=동물마리수만큼 랜덤숫자
	    	num[i] = r.nextInt(animals.length);
	        for(int j=0;j<i;j++) {
	            if(num[i]==num[j]){
	                i--;
	            }//if()end
	        }//for() end 중복 제거
		}//for() end 랜덤 숫자
	    
	    for(int k=0;k<n;k++){
	    	//num[] 배열에 차례대로 저장된 숫자(중복제거 랜덤 숫자)에따른 동물과 동물소리 값 얻기
	    	String ranAnimal = (animals[num[k]]);
			String ranSound = (sounds[num[k]]);
			//뽑힌 n개의 동물과 동물소리를 ArratList에 입력 - 인덱스에따른 데이터를 얻어오기 위해
			ranAnimals.add(ranAnimal);
			ranSounds.add(ranSound);
			if(ranSound==""){
				System.out.println(ranAnimal+"는은/ 울지 못한다.");
			}else if(ranSound=="초음파"){
				System.out.print(ranAnimal+"는/은 인간이 들을 수 없는 소리로 운다.");
				System.out.println("-"+ranSound);
			}else if(ranSound=="앵무새"){
				System.out.print(ranAnimal+"는/은 인간이 들을 수 있는 소리로 운다.");
				//앵무새가 맨앞에 있거나, 앵무새 앞의 동물소리가 없으면
				if(ranSounds.indexOf(ranSound)-1==-1||ranSounds.get(ranSounds.indexOf(ranSound)-1)==""){
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
	}//getRandom(int n) end
}//Test() end
